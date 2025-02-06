// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or
// conditionals).

package Day08;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        double sqrt=Math.pow(a, b);
        System.out.print("Square : "+sqrt);
    }
}
