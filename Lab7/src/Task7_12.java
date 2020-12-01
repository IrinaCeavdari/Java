import java.util.Scanner;
import java.util.Arrays;

public class Task7_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        int count = 0;
        int k = 0;
        int num = 0;

        Arrays.sort(arr);

        while (k < arr.length) {
            System.out.println("Enter number: ");
            num = in.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean number = false;
                k++;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == num)
                        number = true;
                }
                if (!number) {

                    arr[count] = num;

                    count++;

                } else

                    System.out.printf("number must be between 10 and 100 \n");


                for (int i = 0; i < k; i++) {
                    System.out.print(arr[i] + " ");

                }

                System.out.println();
            }
        }
    }
}
