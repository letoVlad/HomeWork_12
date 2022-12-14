public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Mаксим", "Минск", "it", 1988);
        Human any = new Human("Аня", "Москва", "it", 1993);
        Human katy = new Human("Катя", "Калининград", "it", 1992);
        Human artem = new Human("Артем", "Москва", "it", 1995);
        Auto lada = new Auto("", "Granta", -0.7, "", -2015, "Россия");
        Auto audi = new Auto("Audi", "A8 ", 3, "Черный", 2020, "Германия");
        Auto bmw = new Auto("BMW", "Z8", 3, "Черный", 2021, "Германия");
        Auto kia = new Auto("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея");
        Auto hyundai = new Auto("Hyundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        maksim.hello();
        lada.info();
    }
}

