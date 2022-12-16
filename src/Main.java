import transport.Car;
import transport.Car.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Accord", 2.4, "Белый",
                2014,"Россия", "Седан", 4, "х5x5хx555", 4, "Передняя");
        car.info();
        Insurance Insurance = new Insurance(2021, 10, 11, 5000, 12);
        Insurance.info();
    }
}

