package Prac;
import java.util.*;
public class Exp06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the conversion type:-");
		System.out.println("1.Km to Mile \n2. Mile to km");
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter distance in km: ");
			double km=sc.nextDouble();
			double miles=km*0.621371;
			System.out.println(String.format("Distance in miles: %.2f",miles));
			
		}
		else
		{
			System.out.println("Enter distance in miles: ");
			double miles = sc.nextDouble();
			double km = miles/0.621371;
			System.out.println(String.format("Distance in miles: %.2f", km));
		}
		sc.close();

	}

}
