package crescimento;

public class Person {
    private String name;
    double height;
    private double centimetersPerYear;

    public Person(String name, double height, double centimetersPerYear) {
        this.name = name;
        this.height = height;
        this.centimetersPerYear = centimetersPerYear;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getCentimetersPerYear() {
        return centimetersPerYear;
    }
}
