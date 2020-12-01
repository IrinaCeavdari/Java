import java.util.Scanner;
public class Task2_16 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Enter first integer: "); //
        a = input.nextInt();

        System.out.print("Enter second integer: "); // prompt
        b = input.nextInt();

        if (a > b)
            System.out.printf("%d > %d%n a is larger", a, b);
        if (a < b)
            System.out.printf(" %d < %d%n b is larger", a, b);
        if (a == b)
            System.out.printf("%d == %d%n These numbers are equal", a, b);
    }
}

