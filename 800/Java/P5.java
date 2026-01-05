import java.util.*;

public class P5 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = scanner.nextInt();

        if(arr[0] == 1) System.out.println("YES");
        else    System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}