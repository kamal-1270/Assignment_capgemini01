// Write a program that takes the distance in kilometers as input from the user
// and converts it into miles using the formula:

package Day08;

import java.util.Scanner;

public class Kilometer_miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a km : ");
        double km=sc.nextDouble();

        double miles=km*0.621371;
        System.out.print("Kilometer to miles : "+miles);
    }
}
