package main;

//Add questions
//Run or carry out the quiz
//Grade the quiz

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
//class variables
    private ArrayList<Question>questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

public Quiz(){

}

public void addQuestion(Question question){
    this.questions.add(question);
}

public void runQuiz(){
//    loop through each question
    for(Question question: questions){
//        Ask the user the question
        System.out.println(question.getTheQuestion());
//      Get the users answer
        String usersAnswer = this.getUsersAnswers();
//Check the answer
        boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);

//        increment numberOfQuestionsCorrect if answered correctly
        if(userGotQuestionCorrect){
            this.numberOfQuestionsCorrect++;
        }
    }
//    get the users answer, check the answer, run the quiz

//    Grade the quiz cast everything within grading method to a double cause doubles can deal with decimals and integers cannot
    double percentageCorrect = ((double) this.numberOfQuestionsCorrect/ (double) this.questions.size()) * 100;
    System.out.println("Users grade: " + percentageCorrect + "%");
}

private  String getUsersAnswers(){
    String usersAnswer = scanner.nextLine();
    return usersAnswer;
}
}
