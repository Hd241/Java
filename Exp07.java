package Prac;
import java.util.*;
public class Exp07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to enter temp in? \n1.Celsius\n2.Fahrenheit: ");
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter Degree in Celsius: ");
			double a = sc.nextDouble();
			double b = (1.8 * a) + 32;
			System.out.println(String.format("Temperature in celsius: %.2f",b));
			
		}
		else
		{
			System.out.println("Enter Degree in Fahrenheit: ");
			double a = sc.nextDouble();
			double b = (a-32) / 1.8;
			System.out.println(String.format("Temperature in Fahrenheit: %.2f",b));
			
		}
		sc.close();

	}

}
