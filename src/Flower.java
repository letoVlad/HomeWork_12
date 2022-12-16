public class Flower {
    private String nameColor;
    private String country;
    private double cost;
    private int lifeSpan = 3;


    public String getFlowerName() {
        return nameColor;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName != null && !flowerName.isBlank() && !flowerName.isEmpty()) {
            this.nameColor = flowerName;
        } else {
            this.nameColor = "Тип цветка не указан";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        }
    }

    void info() {
        System.out.println("Название цветка - " + nameColor +
                ", страна происхождения - " + country +
                ", стоимость- " + cost +
                ", срок стояния цветка - " + lifeSpan);
    }
}
