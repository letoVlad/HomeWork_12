public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != "") {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != "") {
            this.model = model;
        } else {
            this.brand = "default";
        }

        if (country != "") {
            this.country = country;
        } else {
            this.country = "default";
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color != "") {
            this.color = color;
        } else {
            this.color = "белый";
        }

        if (engineVolume <= 0) {
            this.engineVolume = 2000;
        } else {
            this.year = year;;
        }


    }

    void info() {
        System.out.println(brand + " " + model + " сборвка в " + country + ", цвет кузова - " + color + ", объем двигателя " + engineVolume + ", год выпуска " + year + " год.");
    }
}
