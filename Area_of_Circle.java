// Write a program to calculate the area of a circle. Take the radius as input and use the formula:

package Day08.Assignment_capgemini01;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Radius : ");
        double redius=sc.nextDouble();

        double Area=3.14*(redius*redius);
        System.out.print("Area of Circle : "+Area);
    }
}
