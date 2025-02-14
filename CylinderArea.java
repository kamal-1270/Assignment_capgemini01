package Day08.Assignment_capgemini01;

import java.util.Scanner;

public class CylinderArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Radius of Cylinder : ");
        double redius=sc.nextDouble();
        System.out.print("Enter a height of Cylinder : ");
        double height=sc.nextDouble();

        double Area_of_cylinder=3.14*(redius*redius)*height;
        System.out.print("Area of Cylinder : "+Area_of_cylinder);
    }
}
