package salarioprofessor;

public class Teacher {
    protected static final double INSS_DISCOUNT = 0.15;

    private double classHourPrice;
    private int classesTaughtInMonth;

    public Teacher(double classHourPrice, int classesTaughtInMonth) {
        this.classHourPrice = classHourPrice;
        this.classesTaughtInMonth = classesTaughtInMonth;
    }

    public double getClassHourPrice() {
        return classHourPrice;
    }

    public int getClassesTaughtInMonth() {
        return classesTaughtInMonth;
    }
}
