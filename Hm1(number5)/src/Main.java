import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(number5(a));
    }
    public static String number5(int a) {
        if (a < 0) {
            return "Число отрицательное";
        } else if (a >= 0) {
            return "Число положительное";
        }
        return null;
    }
}

