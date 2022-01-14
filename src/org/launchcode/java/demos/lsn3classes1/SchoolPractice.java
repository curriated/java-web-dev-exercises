package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student maddi = new Student("Maddi",9,1,4.0);

        System.out.println("Name: " + maddi.getName());
        System.out.println("GPA: " + maddi.getGpa());
        System.out.println("Credits: " + maddi.getNumberOfCredits());
    }
}
