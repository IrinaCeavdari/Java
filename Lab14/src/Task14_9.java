import java.util.Scanner;
public class Task14_9 {
    public static void main(String[] args) {

        System.out.print("Enter a text: ");
        Scanner scanner = new Scanner(System.in);

        String[] inputWords = scanner.nextLine().split(" ");

        for (int i = inputWords.length - 1; i >= 0; i--) {
            System.out.print(inputWords[i] + " ");
        }
    }
}