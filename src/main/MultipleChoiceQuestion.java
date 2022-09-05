package main;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
//        Answer compared to user answer A or B
//        what if lowerCase a or b?
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;

        } else {
            return false;
        }
    }
}