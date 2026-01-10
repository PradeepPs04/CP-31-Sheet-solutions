import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            mini = Math.min(mini, Math.abs(Math.abs(num) - 0));
        }

        System.out.println(mini);
        scanner.close();
    }
}
