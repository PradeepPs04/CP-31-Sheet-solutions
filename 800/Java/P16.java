import java.util.*;

public class P16 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        long []arr = new long[n];
        for(int i = 0; i < n; i++)  arr[i] = scanner.nextLong();

        long mini = Long.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            // if already desorted
            if(arr[i] < arr[i-1]) {
                System.out.println(0);
                return;
            }

            long diff = arr[i] - arr[i-1];
            long step = diff / 2 + 1;
            mini = Math.min(mini, step);
        }

        System.out.println(mini);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
