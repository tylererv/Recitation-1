import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;

        // TODO Define char and string variables similarly

        String userString = "";
        char userChar = ' ';

        // scnr.charAt(0);
        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);

        System.out.println("Enter string:");
        userString = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

        // TODO (2): Output the four values in reverse

        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        // TODO (3): Cast the double to an integer, and output that integer

        System.out.print(userDouble + " cast to an integer is ");

        userDouble = (int) userDouble;

        System.out.println(userDouble);

    }
}