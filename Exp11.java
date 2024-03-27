package Prac;
import java.util.*;
public class Exp11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the year to check: ");
		int a = sc.nextInt();
		if(a % 100 == 0)
		{
			if(a % 400 == 0)
			{
				System.out.println("It's leap year");
			}
			else
			{
				System.out.println("It's not leap year");
			}
		}
		else if(a  % 4 ==0)
		{
			System.out.println("It's leap year");
		}
		else
		{
		     System.out.println("It's not leap year");
		}
		sc.close();
	}

}
