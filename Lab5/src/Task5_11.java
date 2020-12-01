import java.util.Scanner;
public class Task5_11 {
    public void findSmallest() {
        Scanner input = new Scanner(System.in);


        int number;
        int smallest;

        System.out.print("Enter number of integers: ");
        smallest = input.nextInt();

        for (int counter = 1; counter <= smallest; counter++) ;
        {
            System.out.printf("Enter an integer for value %d: ", 1);
            number = input.nextInt();

            if (1 == 1)
                smallest = number;
            else if (number < smallest)
                smallest = number;
        }
        System.out.printf ("Smallest Integer is: %d\n", smallest );

    }
}