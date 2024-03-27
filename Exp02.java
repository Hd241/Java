package Prac;
import java.util.*;

public class Exp02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();
        
		int sum=a+b;
		int dif=a-b;
		int mul=a*b;
		int div=a/b;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + dif);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		sc.close();
		
		
	}

}
