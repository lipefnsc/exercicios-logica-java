package triangulo;

public class TriangleType {

    public static void findTriangleType(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Type valid values.");
            return;
        }
        if(a == b && a == c) {
            System.out.println("EQUILATERAL TRIANGLE.");
        } else if(a != b && a != c) {
            System.out.println("SCALENE TRIANGLE.");
        } else {
            System.out.println("ISOSCELES TRIANGLE.");
        }
    }

}
