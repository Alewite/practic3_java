
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            a[i] = scanner.nextInt();
        }

        int count = 0;
        boolean growing = false;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                if (growing == false) {
                    count++;
                    growing = true;
                }
            } else {
                growing = false;
            }
        }

        System.out.println("Количество возрастающих участков: " + count);
    }
}
