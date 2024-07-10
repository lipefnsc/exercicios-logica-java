package crescimento;

public class Test {
    public static void main(String[] args) {

        Person francisco = new Person("Francisco", 1.50, 2);
        Person sara = new Person("Sara", 1.10, 3);

        CalcYearsToBeHigher.yearsToBeHigher(sara, francisco);

    }
}
