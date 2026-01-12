import java.util.*;

public class P14 {
    static void solve(Scanner scanner) {
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        if(a > b)   System.out.println("First");
        else if(b > a)   System.out.println("Second");
        else {
            if(c % 2 == 1)   System.out.println("First");
            else    System.out.println("Second");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
