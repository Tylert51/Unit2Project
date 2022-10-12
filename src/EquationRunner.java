import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        //user input; will store users coordinate points and store their values in variables

        Scanner s = new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        String name = s.nextLine();
        System.out.print("Hey " + name + "!\nEnter your first Coordinate Point: ");
        String coord1 = s.nextLine();
        System.out.print("Enter your second Coordinate Point: ");
        String coord2 = s.nextLine();

        //instantiating the object
        LinearEquation equation1 = new LinearEquation(coord1, coord2);

        //output
        System.out.println(equation1.toString());

        //calculation and question of x3
        System.out.print("Enter a third x-value: ");
        double x3 = s.nextDouble();
        System.out.println("Solved coordinate point is: " + equation1.calcThirdPoint(x3));
    }
}
