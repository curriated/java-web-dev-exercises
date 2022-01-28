package org.launchcode.java.studios.Ch7Quiz;

import java.util.Objects;

public abstract class Question {
    private String question;
    private String answer;
    private String userAnswer;
    private int uniqueId;
    private static int nextId = 1;
    private Boolean isCorrect;

    public Question() {
        uniqueId = nextId;
        nextId++;
    }

    public Question(String question, String answer) {
        this();
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Question.nextId = nextId;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public void answerChecker() {
        if(Objects.equals(getUserAnswer(), getAnswer())){
            this.isCorrect = true;
        } else {
            this.isCorrect = false;
        }
    }

    public abstract void runQuestion();

}
