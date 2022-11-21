import java.util.Scanner;
public class Main {
    static void add()
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x + y;
    }

    public static void main(String[] args) {

        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int z = sc.nextInt();

    }
}