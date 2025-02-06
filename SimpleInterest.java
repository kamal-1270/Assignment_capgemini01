// Write a program to calculate simple interest using the formula Take Principal, Rate, and Time as inputs from the user.
package Day08;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a principle : ");
        int Principal=sc.nextInt();
        System.out.print("Enter a Rate : ");
        double rate=sc.nextDouble();
        System.out.print("Enter a time : ");
        int time=sc.nextInt();

        double si=(Principal*rate*time)/100;

        System.out.print("Simple Interest : "+si);
    }
}
