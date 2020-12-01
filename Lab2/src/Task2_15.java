import java.util.Scanner;
public class Task2_15 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int Sum;
        int Div;
        int Mul;
        int Sub;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        input.close();

        Sum = a + b;
        Div = a / b;
        Mul = a * b;
        Sub = a - b;


        System.out.printf("Sum is %d%n", Sum); // display Addition
        System.out.printf("Div is %d%n", Div); // display Division
        System.out.printf("mul is %d%n", Mul); // display Multiplication
        System.out.printf("Sub is %d%n", Sub); // display Subtraction
    }
}
