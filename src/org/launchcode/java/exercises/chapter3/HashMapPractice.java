package org.launchcode.java.exercises.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
    HashMap<Integer, String> classRoster = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String newStudent;

      System.out.println("Enter your students (or ENTER to finish):");

    // Get student names and grades
      do

    {

        System.out.print("Student name: ");
        newStudent = input.nextLine();

        if (!newStudent.equals("")) {
            // if the newStudent is not empty...
            System.out.print("ID: ");
            Integer newId = input.nextInt();
            // sets the input as newId
            classRoster.put(newId, newStudent);
            // puts the (key/value) pair of (newId/newStudent) in the classRoster HashMap

            // Read in the newline before looping back
            input.nextLine();
        }

    } while(!newStudent.equals(""));
      // while to newStudent entry is not empty... do the stuff above

      input.close();
      // closes the Scanner that we named input (declared it up top)

    // Print class roster
      System.out.println("\nClass roster:");
    double sum = 0.0;

      for(
    Map.Entry<Integer, String> student :classRoster.entrySet())

    {
        System.out.println(student.getKey() + " (" + student.getValue() + ")");
    }

        System.out.println("Stuff here");
}
}
