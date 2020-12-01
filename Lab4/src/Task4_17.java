import java.util.Scanner;
public class Task4_17 {
    {
        public static void main (String[]args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Miles:  ");
            int Miles = input.nextInt();
            System.out.println("Enter Gallons:  ");
            int Gallons = input.nextInt();
            int totalTrips = 0;
            double result = 0;
            int totalMilesPerGallon = 0;
            int MilesPerGallon = 0;

            while (Miles != 0 || Gallons != 0) {
                MilesPerGallon = Miles / Gallons;
                System.out.println("Miles Per Gallon for this trip:  " + MilesPerGallon);

                totalMilesPerGallon = MilesPerGallon + totalMilesPerGallon;

                totalTrips = totalTrips + 1;

                System.out.println("Enter Miles:  ");
                Miles = input.nextInt();

                System.out.println("Enter Gallons:  ");
                Gallons = input.nextInt();
            }
            if (totalTrips != 0) {
                System.out.println("Number of trips taken:  " + totalTrips);

                result = (float) totalMilesPerGallon / totalTrips;

                System.out.println("Total Miles Per Gallon for all trips is :" + totalMilesPerGallon);
                System.out.println("Average Miles Per Gallon Per Trip is :" + result);

            } else
                System.out.println("No data entered");


        }
    }
}
