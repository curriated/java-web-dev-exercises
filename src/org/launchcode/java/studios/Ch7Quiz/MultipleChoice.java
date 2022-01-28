package org.launchcode.java.studios.Ch7Quiz;

import java.util.Scanner;

public class MultipleChoice extends Question{
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    public void multipleChoiceAsker(){
        Scanner input = new Scanner(System.in);
        System.out.println("" + this.getQuestion());
    }

    public void runQuestion() {
        multipleChoiceAsker();
        answerChecker();
    }
}
