package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length for your rectangle:");
        Double length = input.nextDouble();
        System.out.println("Please enter the width for your rectangle:");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println("Your rectangle has an area of " + area + " units squared");
    }
}
