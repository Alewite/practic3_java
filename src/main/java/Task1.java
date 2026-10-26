
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        while (n <= 0 || n % 2 == 0) {
            System.out.println("N должно быть положительным нечётным числом");
            System.out.print("Введите N заново: ");
            n = scanner.nextInt();
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            a[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i -= 2) {
            System.out.print(a[i] + " ");
        }
    }
}
