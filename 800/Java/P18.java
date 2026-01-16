import java.util.*;

public class P18 {
    static void solve(Scanner scanner) {
        int x = scanner.nextInt();
        int k = scanner.nextInt();

        // if we can directly go to the destination
        if(x % k != 0) {
            System.out.println(1);
            System.out.println(x);
        } else {
            // we can reach destination in 2 steps
            System.out.println(2);
            System.out.print(x-1 + " ");
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
