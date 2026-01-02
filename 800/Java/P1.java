import java.util.*;

// change this public class name to "HalloumiBoxes" before submitting code on CF
public class P1 {

    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        if (k == 1) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0)
            solve(scanner);

        scanner.close();
    }
}
