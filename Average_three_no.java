package Day08;

import java.util.Scanner;

public class Average_three_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        System.out.print("Enter c : ");
        int c=sc.nextInt();

        int Average_three_no=(a+b+c)/3;
        System.out.print("Average of three no : "+Average_three_no);
    }
}
