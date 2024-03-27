package Prac;

import java.util.Scanner;

public class Exp08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,c;
		int a=0;
		int b=1;
        System.out.println("Enter terms for fibonacci series:");
        n=sc.nextInt();
        System.out.print(a + "," + b +",");
        for(int i=0;i<n-2;i++)
        {
        	c=a+b;
        	System.out.print(c+",");
        	a=b;
        	b=c;
        }
        sc.close();

	}

}
