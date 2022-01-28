package org.launchcode.java.studios.Ch7Quiz;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Quiz {
    private ArrayList quiz = new ArrayList<>();
    private String userName;
    private Date date;

    public void addQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of question would you like to add?");
        String questionType = input.nextLine();
        if(questionType == "True False"){
            System.out.println("Please type your question:");
            String question = input.nextLine();
            System.out.println("Please enter the answer");
            String answer = input.nextLine();
            TrueFalse q = new TrueFalse(question,answer);
        } else if (questionType == "Multiple Choice"){
            System.out.println("Please type your question:");
            String question = input.nextLine();
            System.out.println("Please enter the answer");
            String answer = input.nextLine();
            MultipleChoice q = new MultipleChoice(question,answer);
        }
    }

}
