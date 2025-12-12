import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

import java.io.File;
import java.io.FileNotFoundException;

//Hangman - Main
//точка исполнения
//Aleksei Limin

public class Main {
    public static void main(String[] args) {
        File wordsFile = new File("resources/words.txt");
        loadWords(wordsFile);
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int selection = -1;

        do {
            System.out.println("===Консольная игра \"Виселица\"/\"Hangman\"===");
            System.out.println("-==Главное меню==-");
            System.out.println("[1] - Начать новую игру");
            System.out.println("[0] - Выйти из игры");
            System.out.println("\nВведите номер: ");
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    //TODO заглушка начала игры
                    System.out.println("--=Начало игры=--\n\n\n");
                    break;
                case 0:
                    System.out.println("Выход из игры...");
                    break;
                default:
                    System.out.println("Вы ввели неверное число для выбора опции. Попробуйте еще раз...\n\n\n");
                    break;
            }
        } while (selection != 0);
    }

    public static ArrayList<String> loadWords(File wordsFile) {
        ArrayList<String> wordList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(wordsFile.getAbsolutePath()))) {
            //TODO поменять на баффер ридер
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                wordList.add(line);
            }
            System.out.println("Слова успешно загружены. Можно играть!\n");
        } catch (FileNotFoundException e) {
            System.out.println("...Error. Файл со словами не найден...");
        }

        return wordList;
    }

    public static String guessWord(ArrayList<String> wordsList) {
        Random rnd = new Random();
        int guessedWordIdx = rnd.nextInt(wordsList.size());
        String guessedWord = wordsList.get(guessedWordIdx);

        return guessedWord;
    }

    public static void cleanConsole(){
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}
