package Prac;
import java.util.*;
public class Exp15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number for rows: ");
		int a = sc.nextInt();
		int b = 1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(b+ " ");
				b++;
			}
			System.out.println("");
		}
        sc.close();

	}

}
