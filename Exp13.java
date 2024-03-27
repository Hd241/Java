package Prac;
import java.util.*;
public class Exp13 {

	public static void main(String[] args) {
		int i,num;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table");
        num=sc.nextInt();
        sc.close();
        for(i=1;i<=10;i++)
        {
        	System.out.println(num + " X " + i + " = " + num*i);
        	
        }
        
	}
}