import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов: ");

        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Ошибка: число должно быть от 0 до 100");
            } else if (score >= 90) {
                System.out.println("Відмінно");
            } else if (score >= 75) {
                System.out.println("Добре");
            } else if (score >= 60) {
                System.out.println("Задовільно");
            } else {
                System.out.println("Незадовільно");
            }
        } else {
            System.out.println("Ошибка: введите целое число");
        }
    }
}