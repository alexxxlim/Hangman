import java.util.Scanner;

//Hangman - Main
//точка исполнения
//Aleksei Limin

public class Main {
    public static void main(String[] args) {

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
                    //TODO убрать 2x '\n', поменять на очистку консоли
                    System.out.println("Вы ввели неверное число для выбора опции. Попробуйте еще раз...\n\n");
                    break;
            }
        } while (selection != 0);
    }
}
