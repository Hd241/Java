package Prac;
import java.util.Scanner;

class Student 
{
    int studentID;
    String studentName;
    double marksMaths, marksScience, marksEnglish;

    void setData() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = sc.nextInt();

        System.out.print("Enter Student Name: ");
        studentName = sc.next();

        System.out.print("Enter Marks for Maths : ");
        marksMaths = sc.nextDouble();

        System.out.print("Enter Marks for Science: ");
        marksScience = sc.nextDouble();

        System.out.print("Enter Marks for English: ");
        marksEnglish = sc.nextDouble();
        sc.close();
    }

    void displayData() 
    {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for Maths: " + marksMaths);
        System.out.println("Marks for Science: " + marksScience);
        System.out.println("Marks for English: " + marksEnglish);
    }

    double calculateAverageMarks()
    {
        return (marksMaths + marksScience + marksEnglish) / 3;
    }
}

     public class Exp17
     {
              public static void main(String[] args)
              {
                    Student student = new Student();
                    student.setData();
                    System.out.println("\nStudent Details:");
                    student.displayData();
                    System.out.print("Average Marks: " +student.calculateAverageMarks());
    
              }
     }