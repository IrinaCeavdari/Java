import java.util.Scanner;
public class Task7_14 {
    public static void main(String[] args)
    {
        Scanner array = new Scanner(System.in);
        int numbers =array.nextInt();
        System.out.println("The sum of 5 and 10 is " + sum(5, 10));
        System.out.println("The sum of 23, 78, and 56 is " + sum(23, 78, 56));
        System.out.println("The sum when no parameter is passed is " + sum());


        System.out.println("The sum of array is " + sum(numbers));
    }

    public static int sum(int list)
    {
        int total = 1;

        for (int i = 0; i < list.length; i++)
        {
            total += list[i];
        }
        return total;
    }
}
