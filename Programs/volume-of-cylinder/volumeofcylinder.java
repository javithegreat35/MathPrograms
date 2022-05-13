import java.util.InputMismatchException;
import java.util.Scanner;

public class volumeofcylinder {
    public static double cylinderVolume(double height, double radius){
        double volume;
        volume = height * Math.pow(radius, 2) * Math.PI;
        return volume;
    }
    public static double getUsersDouble(String message){
        Scanner getInput = new Scanner(System.in);
        System.out.println(message);
        double variable = 0;
        while(variable == 0){
            try{
                variable = getInput.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("That's not double or int. Try again");
                variable = 0;
                getInput.nextLine();
            }
        }
        return variable;
    }
    public static void main(String[] args) throws Exception {
        double volume, height, radius;

        height = getUsersDouble("Please input height");
        radius = getUsersDouble("Please input radius");

        volume = cylinderVolume(height, radius);
        System.out.println("The volume of the cylinder is: "+volume);

    }
}
