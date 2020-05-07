import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String str = " ";
        System.out.println(number8(year, str));
    }
    public static String number8(int year, String str) {
        if (year % 4 != 0 | year % 8 != 0) {
            System.out.println("Этот год не високосный");
        } else if (year % 4 == 0) {
            System.out.println("Этот год високосный");
        }
        return str;
    }
}

