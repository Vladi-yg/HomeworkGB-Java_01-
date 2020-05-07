import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(number4(a, b));
    }

    public static boolean number4(int a, int b) {
        if (a + b >= 10 & a + b <= 20) {
            return true;
        } else {
            return false;
        }
    } 
}

