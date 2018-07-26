import java.util.Scanner;

public class jashdgfjhagd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = sum(a, b, true);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static double sum(double a, double b) {
        double result = a + b;
        return result;
    }

    public static int sum(int a, int b, boolean c) {
        int result = a + b;
        return result;
    }
}
