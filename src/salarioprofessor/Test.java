package salarioprofessor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(60, 80);

        CalcNetSalary.calcNetSalary(teacher);
    }
}
