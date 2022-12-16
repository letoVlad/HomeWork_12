package transport;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private final String transmission;
    private final String body;
    private String registrationNumber;
    private final int numberOfSeats;
    private int summerTires;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String body, int numberOfSeats, String registrationNumber, int summerTires, String transmission) {
        this.body = body;
        this.numberOfSeats = numberOfSeats;
        this.year = year;

        if (registrationNumberCheck(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Номер не правильный";
        }

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }

        if (engineVolume <= 0) {
            this.engineVolume = 2000;
        } else {
            this.engineVolume = year;
        }

        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = " Некорректное значение";
        }
    }


    //Проверка регистрационного номера
    boolean registrationNumberCheck(String registrationNumber) {
        char[] number = registrationNumber.toCharArray();
        if (Character.isDigit(number[1]) && Character.isDigit(number[2]) && Character.isDigit(number[3])
                && Character.isDigit(number[6]) && Character.isDigit(number[7]) && Character.isDigit(number[8])) {
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Марка " + brand + "" +
                ", модель " + model +
                ", сборвка в " + country +
                ", цвет кузова - " + color +
                ", объем двигателя " + engineVolume +
                ", год выпуска " + year + " год" +
                ", Регистрационный номер " + registrationNumber +
                ", Тип кузова " + body +
                ", Колличество мест " + numberOfSeats +
                ", Трансмиссия " + transmission);
    }

    public static class KeyCar {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public KeyCar(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public static class Insurance {
        final private LocalDate validity;
        final private int price;
        final private int number;

        public Insurance(int year, int mouth, int dayOfMouth, int price, int number) {
            if (!LocalDate.of(year, mouth, dayOfMouth).isAfter(LocalDate.now())) {
                System.out.println("Страховку надо продлить!");
            }
            if (String.valueOf(number).length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
            this.validity = LocalDate.of(year, mouth, dayOfMouth);
            this.price = price;
            this.number = number;
        }

        public void info() {
            System.out.println("Срок действия страховки - " + validity +
                    ", Стоимость страховки- " + price +
                    ", Номер страховки- " + number);
        }
    }
}