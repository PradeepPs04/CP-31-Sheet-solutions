import java.util.*;

public class P9 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int ans = 0;
        for(int i = 0; i < n-1; i++)    {
            int num = scanner.nextInt();
            ans -= num;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
