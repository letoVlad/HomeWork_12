import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ScalableThreadPool implements ThreadPool {

    private final int minAmountOfThreads;
    private final int maxAmountOfThreads;
    private MyThread[] threads;
    private BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();

    public ScalableThreadPool(int minAmountOfThreads, int maxAmountOfThreads) {
        this.minAmountOfThreads = minAmountOfThreads;
        this.maxAmountOfThreads = maxAmountOfThreads;
        this.threads = new MyThread[minAmountOfThreads];
        this.blockingQueue = new LinkedBlockingQueue<>();
    }

    @Override
    public void start() {
        for (int i = 0; i < minAmountOfThreads; i++) {
            threads[i] = createThread();
            threads[i].start();
        }
    }

    @Override
    public void execute(Runnable runnable) throws InterruptedException {
        blockingQueue.put(runnable);

        if (Arrays.stream(threads).allMatch(MyThread::isFlag)) {
            if (getActiveThreadCount() < maxAmountOfThreads) {
                MyThread[] newThreads = Arrays.copyOf(threads, threads.length + 1);
                newThreads[threads.length] = createThread();
                threads = newThreads;
                newThreads[threads.length].start();
            }
        }
    }

    public long getActiveThreadCount() {
        return Arrays.stream(threads).filter(Thread::isAlive).count();
    }

    private MyThread createThread() {
        return new MyThread(() -> {
            while (true) {
                try {
                    Runnable task = blockingQueue.take();
                    task.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
    }
}
