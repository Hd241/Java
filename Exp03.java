package Prac;
import java.util.*;
public class Exp03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int c = sc.nextInt();
		
		if(a>b && b>c)
		{
			System.out.println(a + " is greater than " + b + " and " + c);
		}
		else if(b>c && b>a)
		{
			System.out.println(b + " is greater than " + a + " and " + c);
		}
		else
		{
			System.out.println(c + " is greater than " + a + " and " + b);
		}
        sc.close();
	}

}
