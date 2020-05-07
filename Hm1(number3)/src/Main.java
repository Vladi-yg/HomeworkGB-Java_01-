import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(expession(a, b, c, d));
    }
    public static int expession(int a,int b,int c,int d) {
        return (a * (b + (c / d)));
    }
}

