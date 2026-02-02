import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Оценка за предмет " + i + ": ");
            totalScore += scanner.nextInt();
        }

        double averageScore = totalScore / 5.0;
        String status;
        boolean hasScholarship;

        if (averageScore >= 90) {
            status = "Відмінник";
            hasScholarship = true;
        } else if (averageScore >= 75) {
            status = "Хорошист";
            hasScholarship = true;
        } else {
            status = "Двієчник";
            hasScholarship = false;
        }

        System.out.println("\n--- Звіт ---");
        System.out.println("Середній бал: " + averageScore);
        System.out.println("Статус: " + status);
        System.out.println("Стипендія: " + (hasScholarship ? "Так" : "Ні"));
    }
}