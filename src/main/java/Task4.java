
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        while (n <= 0 || n % 2 == 0) {
            System.out.print("Введите положительное нечетное N: ");
            n = scanner.nextInt();
        }

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите элемент: ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Элементы по спирали:");

        for (int k = 0; k < n / 2; k++) {

            for (int i = k; i < n - k; i++) {
                System.out.print(a[i][k] + " ");
            }

            for (int j = k + 1; j < n - k; j++) {
                System.out.print(a[n - k - 1][j] + " ");
            }

            for (int i = n - k - 2; i >= k; i--) {
                System.out.print(a[i][n - k - 1] + " ");
            }

            for (int j = n - k - 2; j > k; j--) {
                System.out.print(a[k][j] + " ");
            }
        }

        System.out.print(a[n / 2][n / 2]);
    }
}
