package Prac;
import java.util.*;
public class Exp05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check even or odd number: ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a + " is even number.");
		}
		else
		{
			System.out.println(a + " is odd number.");
		}
		sc.close();

	}

}
