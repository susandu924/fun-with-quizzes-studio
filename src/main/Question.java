package main;

public abstract class Question {
    private final String theQuestion;
    private final String theAnswer;
//    final the question and answer can never change

//constructor
    public Question(String question, String answer){
        this.theQuestion= question;
        this.theAnswer=answer;
    }
//    getters DOES have a return type
    public String getTheQuestion(){return this.theQuestion;}

    public String getTheAnswer(){return this.theAnswer;}

    public boolean checkAnswer(String answer){
        return false;
    }


}
