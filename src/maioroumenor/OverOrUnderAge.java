package maioroumenor;

public class OverOrUnderAge {

    public static void IsOverOrUnderAge(String name, int age) {
        if (age < 0) return;
        if (age < 17) {
            System.out.println(name + " is " + age + " years old. (UNDER AGE)");
        } else {
            System.out.println(name + " is " + age + " years old. (OVER AGE)");
        }
    }

}
