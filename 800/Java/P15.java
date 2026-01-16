import java.util.*;

public class P15 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int oddCnt = 0;
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num % 2 == 1)    oddCnt++;
        }

        if(oddCnt % 2 == 0) System.out.println("Yes");
        else    System.out.println("No");
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}