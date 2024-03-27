package Prac;
import java.util.*;
class Add1
{
	int add(int num1, int num2)
	{
		return num1 + num2;
	}
}
public class Exp16 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Add1 adder = new Add1();
		
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		int sum = adder.add(num1, num2);
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
		
		sc.close();
		

	}

}
