import java.util.*;

public class P7 {
    static int helper(String a, String b, int idx) {
        int op = 0;
        int j = 0;
        while(j < b.length()) {
            if(idx == a.length()) {
                a += a;
                op++;
            }

            if(a.charAt(idx) != b.charAt(j))    return Integer.MAX_VALUE;
            
            idx++;
            j++;
        }

        return op;
    }

    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String a = scanner.next();
        String b = scanner.next();

        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b.charAt(0)) mini = Math.min(mini, helper(a, b, i)); 
        }

        if(mini == Integer.MAX_VALUE)   System.out.println(-1);
        else    System.out.println(mini);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}