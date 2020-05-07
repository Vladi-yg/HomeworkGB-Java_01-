import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(number6(a));
    }
    public static boolean number6(int a) {
        if (a<0) { return true;}
        return false;
    }
}

