
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            a[i] = scanner.nextInt();
        }

        int[] b = createB(a);

        System.out.println("Массив B:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static int[] createB(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                b[i] = a[i] % 10;
            } else {
                b[i] = a[i] + 9;
            }
        }

        return b;
    }
}
