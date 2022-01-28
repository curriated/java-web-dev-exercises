package org.launchcode.java.studios.Ch7Quiz;

import java.util.Scanner;

public class TrueFalse extends Question{
    public TrueFalse(String question, String answer){
        super(question,answer);
    }

    public void trueFalseAsker(){
        Scanner input = new Scanner(System.in);
        System.out.println("True or False: " + this.getQuestion());
        this.setUserAnswer(input.nextLine());
    }

    @Override
    public void runQuestion() {
        trueFalseAsker();
        answerChecker();
    }
}
