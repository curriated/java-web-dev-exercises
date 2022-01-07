package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some text:");
        String paragraph = input.nextLine();
        if(paragraph.isEmpty()) {
            System.out.println("Please actually enter something you heathen.");
        } else {
            char[] charactersInString = paragraph.toLowerCase().toCharArray();

            HashMap<Character, Integer> alphabet = new HashMap<>();

            for (char c : charactersInString) {
                if (Character.isLetter(c)) {
                    if (!alphabet.containsKey(c)) {
                        alphabet.put(c, 1);
                    } else {
                        int count = alphabet.get(c) + 1;
                        alphabet.replace(c, count);
                    }
                }
            }
            System.out.println(alphabet);
        }
    }
}
