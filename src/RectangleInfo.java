import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double perimeter = 0;
        double area = 0;
        double diagonal = 0;
        String trash = "";
        boolean done1 = false;
        boolean done2 = false;

        do{
            System.out.print("Input the height: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done1 = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered:" + trash + ", please put in a valid input");
            }
        } while(!done1);

        do{
            System.out.print("Input the width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done2 = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered:" + trash + ", please put in a valid input");
            }
        } while(!done2);
        area = width * height;
        perimeter = width + width + height + height;
        double widthSqr = Math.pow(width,2);
        double heightSqr = Math.pow(height, 2);
        double diagonalSqrt = widthSqr + heightSqr;
        diagonal = Math.sqrt(diagonalSqrt);

        System.out.println("The area is: " + area + ", the perimeter is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);
    }
}
