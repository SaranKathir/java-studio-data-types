package studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a radius :");
        double radiusValue=input.nextDouble();
       // Circle circle = new Circle();
        System.out.println("The area of a circle of radius 2.5 is:" + Circle.getArea(radiusValue));
    }
}
