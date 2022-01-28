package org.launchcode.java.studios.Ch7Quiz;

public class QuizRunner {
    public static void main(String[] args) {
        TrueFalse question1 = new TrueFalse("Launch code is the very best ever?", "True");
        MultipleChoice question2 = new MultipleChoice("What is the best city in Kansas? \nA: Salina\nB: Kansas City\nC: Lawrence", "C");
        question1.runQuestion();
        System.out.println(question1.getUserAnswer()); // shows that the object stored the answer
        question2.runQuestion();
        System.out.println(question2.getUserAnswer());
    }
}
