package org.example;

import java.util.Scanner;

public class Menu {

    private int numberOfOptions;
    private String[] listOfOptions;

    public Menu(int numberOfOptions, String[] listOfOptions) {
        this.numberOfOptions = numberOfOptions;
        this.listOfOptions = listOfOptions;
    }

    public void showMenu(int currentNumberOfQuestion, String currentQuestions) {
        System.out.println("\nВопрос № " + currentNumberOfQuestion + " " + currentQuestions);
        for (int i = 0; i < numberOfOptions; i++) {
            System.out.printf("%d %s %s\n", i + 1, ". ", listOfOptions[i]);
        }
        System.out.println("0 .(Закончить викторину)");
    }

    public int returnChoice() {
        Scanner sc = new Scanner(System.in);
        int scInt = sc.nextInt();

        if (scInt < 0 || scInt > numberOfOptions) {
            System.out.println("Повторите ввод номера ответа ( 0..4 )");
            return -1;
        } else {
            return scInt;
        }
    }
}
