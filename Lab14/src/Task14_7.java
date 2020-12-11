import java.util.Scanner;
import java.util.StringTokenizer;
public class Task14_7 {

    public static void main( String[] args )
    {

        System.out.print(" Enter text: ");
        Scanner input = new Scanner( System.in );
        String sentence = input.nextLine();
        int sentArray[];

        StringTokenizer st = new StringTokenizer( sentence );

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            String firstLetter = word.substring(0);

            System.out.println(st.nextToken() + "ay");

        }



    }

}