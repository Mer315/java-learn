package sumedha_practice;

import java.util.Scanner;

//Class representing a Student
class Student {
 int rollNumber;
 String name;
 int[] marks = new int[3]; // Assuming marks for 3 subjects
 int totalMarks;
 double averageMarks;

 // Method to calculate total and average marks
 public void calculateTotalAndAverage() {
     totalMarks = 0;
     for (int mark : marks) {
         totalMarks += mark;
     }
     averageMarks = totalMarks / (double) marks.length;
 }
}

//Main class to handle the program logic
public class StudentArray {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Array to store 5 students
     Student[] students = new Student[5];

     // Input data for each student
     for (int i = 0; i < students.length; i++) {
         students[i] = new Student();
         
         System.out.println("Enter details for Student " + (i + 1));

         System.out.print("Enter roll number: ");
         students[i].rollNumber = scanner.nextInt();
         
         System.out.print("Enter name: ");
         scanner.nextLine(); // Consume the newline
         students[i].name = scanner.nextLine();

         System.out.println("Enter marks for 3 subjects:");
         for (int j = 0; j < students[i].marks.length; j++) {
             System.out.print("Mark for subject " + (j + 1) + ": ");
             students[i].marks[j] = scanner.nextInt();
         }

         // Calculate total and average marks for the student
         students[i].calculateTotalAndAverage();
     }

     // Displaying total and average marks for each student
     System.out.println("\nStudent Details:");
     for (Student student : students) {
         System.out.println("Roll Number: " + student.rollNumber);
         System.out.println("Name: " + student.name);
         System.out.println("Total Marks: " + student.totalMarks);
         System.out.println("Average Marks: " + student.averageMarks);
         System.out.println();
     }

     scanner.close();
 }
}
