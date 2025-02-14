package Day08.Assignment_capgemini01;

import java.util.Scanner;

public class Rectangle_Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a length of Rectangle : ");
        int length=sc.nextInt();
        System.out.print("Enter a width of Rectangle : ");
        int width=sc.nextInt();

        int perimeter_of_rectangle=2*(length+width);
        System.out.print("Perimeter of rectangle : "+perimeter_of_rectangle);
    }
}
