import java.util.Scanner;
public class Main {
    static void add(int x, int y)
    {
        int a = x + y;
    }

    static void sub(int x, int y)
    {
        int b = x - y;
    }
    static void mult()
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = x * y;
        System.out.println(c);
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