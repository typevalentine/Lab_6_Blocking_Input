import java.util.Scanner;

class FuelCosts {
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);

         double gallonsInTank = 0;
         double mpg = 0;
         double pricePerGallon = 0;
         String trash = "";
         boolean gallonsDone = false;
         boolean efficiencyDone = false;
         boolean priceDone = false;
         double driveCost = 0;
         double fullTank = 0;

         do {
             System.out.print("Enter in the number of gallons of gas in the tank: ");
             if (in.hasNextDouble()) {
                 gallonsInTank = in.nextDouble();
                 in.nextLine();
                 gallonsDone = true;

                 System.out.println("You entered: " + gallonsInTank + " gallons");
             }
             else
             {
                 trash = in.nextLine();
                 System.out.println("You entered: " + trash + ", please enter a valid input");
             }
         } while (!gallonsDone);
         do {
             System.out.print("Enter in the fuel efficiency: ");
             if (in.hasNextDouble()) {
                 mpg = in.nextDouble();
                 in.nextLine();
                 efficiencyDone = true;

                 System.out.println("You entered: " + mpg);
             } else {
                 trash = in.nextLine();
                 System.out.println("You entered: " + trash + ", please enter a valid input");
             }
         } while (!efficiencyDone) ;
             do {
                 System.out.print("Enter in the price of gas per gallon: ");
                 if (in.hasNextDouble()) {
                     pricePerGallon = in.nextDouble();
                     in.nextLine();
                     priceDone = true;

                     System.out.println("You entered: " + pricePerGallon);
                 }
                 else
                 {
                     trash = in.nextLine();
                     System.out.println("You entered: " + trash + ", please enter a valid input");
                 }
             } while (!priceDone);

             driveCost = (100/mpg) * pricePerGallon;
             fullTank = gallonsInTank * mpg;
         System.out.println("The cost to drive 100 miles is: " + driveCost);
         System.out.println("How far the car can go with a full tank of gas is: " + fullTank);
     }
 }