import java.util.Scanner;
public class Main {
    static void add()
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x + y;
        System.out.println(a);

    }

    static void sub()
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int b = x - y;
        System.out.println(b);
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
    static void div()
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try
        {
            float d = x / y;
            System.out.println(d);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }


    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        int z = sc.nextInt();

        switch(z)
        {
            case 1:add();
                break;
            case 2:sub();
                break;
            case 3:mult();
                break;
            case 4:div();
                break;
            case 5:System.exit(0);
                break;
        }

    }
}