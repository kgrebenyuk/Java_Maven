package org.example;

public class Quiz {
    private final int numberOfQuastions = 10;
    private final int numberOfOptions = 4;
    private String[] options = new String[numberOfOptions];

    private final String[][] arrayOfOptions =
            {
                    {"дрон", "фаэтон", "махаон", "десептикон"},
                    {"волейбол", "бейсбол", "теннис", "керлинг"},
                    {"ковер", "одежда", "сапоги", "мотоцикл"},
                    {"лесник", "лесовик", "леший", "лесопатолог"},
                    {"кино", "сплин", "аквариум", "зоопарк"},
                    {"Ян Непомнящий", "Магнус Карлсен", "Сергей Карякин", "Уле-Эйнар Бьорндален"},
                    {"родий", "индий", "церий", "нептуний"},
                    {"«Битлз»", "«Квин»", "«Роллинг стоунз»", "Пинк флойд"},
                    {"«12 стульев»", "«Дом, который построил Свифт»", "Обыкновенное чудо", "«Убить дракона»"},
                    {"рисунки на асфальте", "вуаль", "период в искусстве", "сорт яблок"}
            };
    private final int[] arrayOfAnswers = {1, 4, 1, 4, 2, 4, 2, 1, 1, 1};

    private int numberOfCorrectAnswers = 0;

    public final String[] arrayOfQuestions = {
            "Как называют беспилотный летательный аппарат?",
            "В какой игре не используют мяч?",
            "Что в сказках было семимильным?",
            "Как называют специалиста, избавляющего лес от болезней и вредителей?",
            "Какое слово трижды встречается в романе «Евгений Онегин»?",
            "Кто не шахматист?",
            "Какой элемент получил свое название из-за синей линии в его спектре?",
            "Участники какой группы записали песню, которую случайно нашли на чердаке дома в Великобритании в ноябре 2021 года?",
            "В каком из этих фильмов Марка Захарова снимался Александр Абдулов, но не снимался Олег Янковский?",
            "Что итальянцы называют «мадоннари»?"
    };

    public void titleQuiz() {
        System.out.println("\nВикторина: Кто хочет стать миллионером :) (10 вопросов)");
    }

    public String[] askNextQuastion(int numberOfQuastion) {
        for (int i = 0; i < numberOfOptions; i++) {
            options[i] = arrayOfOptions[numberOfQuastion][i];
        }
        return options;
    }

    public boolean checkAnwer(int numberOfQuastion, int numberOfAnswer) {
        if (numberOfAnswer == arrayOfAnswers[numberOfQuastion]) {
            System.out.println("Верно, правильный ответ: " + arrayOfAnswers[numberOfQuastion]);
            return true;
        } else {
            System.out.println("Не верно, правильный ответ: " + arrayOfAnswers[numberOfQuastion]);
        }
        return false;
    }

    public int getNumberOfQuastions() {
        return numberOfQuastions;
    }

    public int getNumberOfOptions() {
        return numberOfOptions;
    }
}
