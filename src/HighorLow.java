import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numGuess = 0;
        String trash = "";
        boolean valid = false;
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;


        do {
            System.out.print("Guess a number between 1-10!: ");
            if (in.hasNextInt())
            {
                numGuess = in.nextInt();
                if (numGuess >=1 && numGuess <=10)
                {
                    if (numGuess > val)
                    {
                        System.out.println("Your number is too high!");
                        System.out.print("The number is: " + val);
                    } else if (numGuess < val)
                    {
                        System.out.println("Your number is too low!");
                        System.out.print("The number is: " + val);
                    }
                    else
                    {
                        System.out.print("Your number is on the money!");
                    }
                    valid = true;
                }
                else
                {
                    System.out.println("Please provide a number between 1-10");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + ", please enter a valid input");
            }
        } while(!valid);

    }
}

