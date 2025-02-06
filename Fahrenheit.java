// Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula:

package Day08;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Celsius : ");
        double Celsius=sc.nextDouble();

        double Fahrenheit=(Celsius * 9/5) + 32;
        System.out.println("Celsius to fahrenheit : "+Fahrenheit);
    }
}
