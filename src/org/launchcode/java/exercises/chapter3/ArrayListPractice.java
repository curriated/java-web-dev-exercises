package org.launchcode.java.exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Even Numbers exercise
        ArrayList<Integer> someIntegers = new ArrayList<Integer>(Arrays.asList(1,2,3,33,96,39,22,25,58));
        System.out.println(sumEvenNumbers(someIntegers));

        //String exercise
        String phrase = "";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println("Enter a word length to search for:");
        int numChars = input.nextInt();

        printFiveLetterWords(wordList,numChars);
    }

    public static int sumEvenNumbers(ArrayList<Integer> arr){
        int total = 0;
        for (int integer: arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> array, int length) {
        for(String word: array){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }
}
