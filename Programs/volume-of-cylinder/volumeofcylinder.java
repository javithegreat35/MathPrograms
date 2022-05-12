import java.util.InputMismatchException;
import java.util.Scanner;

public class volumeofcylinder {
    public static double cylinderVolume(double height, double radius){
        double volume;
        volume = height * Math.pow(radius, 2) * Math.PI;
        return volume;
    }
    public static void main(String[] args) throws Exception {
        double volume, height = 0, radius = 0;
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please input height of the cylinder");
        while(height == 0){
            try{
                height = getInput.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Something went wrong, try again");
                height = 0;
                getInput.nextLine();
            }
        }
        
        System.out.println("Please input radius of the cylinder");
        while(radius == 0){
            try{
                radius = getInput.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Something went wrong, try again");
                radius = 0;
                getInput.nextLine();
            }
        }
        volume = cylinderVolume(height, radius);
        System.out.println("The volume of the cylinder is: "+volume);
        
    }
}