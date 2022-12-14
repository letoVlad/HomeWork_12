public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    public Human(String name, String town, String jobTitle, int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else if(yearOfBirth < 0 ){
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null ) {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
            this.town = town;
            this.jobTitle = jobTitle;
        }

    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth +
                " году. Я работаю на должности  " + jobTitle + " Будем знакомы!");
    }
}
