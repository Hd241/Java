package Prac;
import java.util.Scanner;
public class Exp10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an aplhabet: ");
        String c = sc.nextLine();
        if (c.length() != 1){
            System.err.println("Error: Wrong Input");
        }
        else{
            if (Character.isDigit(c.charAt(0))) {
                System.err.println("Error: Wrong Input");                
            } 
            else if(c.charAt(0) == 'a'||c.charAt(0) == 'e'|| c.charAt(0)== 'i'||c.charAt(0) == 'o'||c.charAt(0) == 'u'||c.charAt(0) == 'A'||c.charAt(0) == 'E'|| c.charAt(0)== 'I'||c.charAt(0) == 'O'||c.charAt(0) == 'U') {
                System.out.println("Character Entered is an Vowel");
            }
            else {
                System.out.println("Entered Character is Consonant");
                
            }

        }
        sc.close();
    }
}
