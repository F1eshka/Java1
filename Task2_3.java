public class Task2_3 {
    public static void main(String[] args) {
        System.out.println("Досконалі числа до 1000:");

        for (int number = 1; number <= 1000; number++) {
            int sum = 0;
            for (int divisor = 1; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}