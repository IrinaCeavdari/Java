import java.util.Arrays;
import java.util.Scanner;
public class Task2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;
        int mul;

        System.out.print("Enter first integer: "); // prompt
        a = input.nextInt();

        System.out.print("Enter second integer: "); // prompt
        b = input.nextInt();

        System.out.print("Enter second integer: "); // prompt
        c = input.nextInt();


        sum = a + b + c;
        System.out.printf("Sum is %d%n", sum);  //display Addition

        System.out.println((a + b + c) / 3);  //display average

        mul = a * b;
        System.out.printf("Multiplication is %d%n", mul); // display Multiplication
    }
}
class maxmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Enter a: ");
        arr[0] = in.nextInt();
        System.out.print("Enter b: ");
        arr[1] = in.nextInt();
        System.out.print("Enter c: ");
        arr[2] = in.nextInt();
        in.close();
        System.out.println("Min value = " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Max value = " + Arrays.stream(arr).max().getAsInt());

    }
}

