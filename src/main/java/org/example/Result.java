package org.example;

public class Result {

    public int sumOfCorrectAnswers = 0;
    public int sumOfAsckedQuaschions = 0;

    public void printResult() {
        if (sumOfAsckedQuaschions != 0) {
            System.out.println("\n----------------");
            System.out.println("Ваш результат: " + sumOfCorrectAnswers + " ответов из " + sumOfAsckedQuaschions);
        }
    }
}
