В данном примере я использовал паттер Factory Method для создания новых потокв, что позволяет более гибко и изолированно управлять созданием объектов потоков.
Паттер Factory Method подходит для случаев, когда создание объекта требует абстракции от конректного класса и логики. В моем случае создание потоков можно вынести в отдельны метод, что улучишт читаемость и расширяемость кода.
