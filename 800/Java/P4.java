import java.util.*;

// // change this public class name to "GameWithIntegers" before submitting code on CF
public class P4 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        if((n-1) % 3 == 0 || (n+1)%3 == 0)  System.out.println("First");
        else System.out.println("Second");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
