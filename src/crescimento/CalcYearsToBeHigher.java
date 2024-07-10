package crescimento;

public class CalcYearsToBeHigher {

    public static void yearsToBeHigher(Person person1, Person person2) {
        if (person1.getHeight() > person2.getHeight()) {
            System.out.println(person1.getName() + " is already higher than " + person2.getName() + ".");
        } else {
            int years = 0;
            while (person1.getHeight() <= person2.getHeight()) {
                person1.height += person1.getCentimetersPerYear() / 100;
                person2.height += person2.getCentimetersPerYear() / 100;
                years++;
            }
            System.out.println("It will take " + years + " years for " + person1.getName() + " be higher than " + person2.getName() + ".");
        }
    }

}
