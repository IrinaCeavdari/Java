import java.util.Scanner;
public class Task5_16
{
    public static void main(String args[])

    {
        int i, j, number;
        Scanner input = new Scanner(System.in);


        System.out.printf("Enter a number from 1 to 30: ");

        for (i = 0; i < 10; i++)
        {
            number = input.nextInt();
            if(number > 30 || number < 1)
            {
                System.out.print("Error");
                number = input.nextInt();
            }


            for (j = 0; j < number; j++)
            {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}

