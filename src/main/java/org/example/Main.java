package org.example;

public class Main {
    public static void main(String[] args) {

        boolean doQuiz = true;

        Quiz quiz = new Quiz();
        Result result = new Result();

        quiz.titleQuiz();

        for (int i = 0; i < quiz.getNumberOfQuastions(); i++) {
            Menu menu = new Menu(quiz.getNumberOfOptions(), quiz.askNextQuastion(i));
            menu.showMenu(i + 1, quiz.arrayOfQuestions[i]);

            int returnChoice = menu.returnChoice();
            if (returnChoice == 0) {
                result.printResult();
                break;
            }
            if (returnChoice == -1) {
                i--;
                continue;
            }

            result.sumOfAsckedQuaschions++;
            if (quiz.checkAnwer(i, returnChoice)) {
                result.sumOfCorrectAnswers++;
            }
        }
        result.printResult();
    }
}