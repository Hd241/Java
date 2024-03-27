package Prac;
import java.util.*;
public class Exp14 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number for rows: ");
		int a = sc.nextInt();
		for(int i=0;i<=a;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
        sc.close();

	}

}
