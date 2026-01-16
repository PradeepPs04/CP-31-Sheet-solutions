import java.util.*;

public class P17 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int x = scanner.nextInt();

        // we can use all 1's to create 'n'
        if(x != 1) {
            System.out.println("YES");
            System.out.println(n);
            for(int i = 0; i < n; i++)  System.out.print(1 + " ");  
            System.out.println();
        } else {
            // if only 1 option was to use 1 and that was not allowed because of x
            // or we can only use 2 but n is odd
            if(k == 1 || (k == 2 && n % 2 == 1))    System.out.println("NO");
            else {
                // if n is even we can use n/2 number of 2's
                if(n % 2 == 0) {
                    System.out.println("YES");
                    System.out.println(n/2);
                    for(int i = 0; i < n/2; i++)    System.out.print(2 + " ");
                    System.out.println();
                } else {
                    // if n is odd use one 3 and rest 2's
                    System.out.println("YES");
                    System.out.println((n-3)/2 + 1);
                    for(int i = 0; i < (n-3)/2; i++)   System.out.print(2 + " ");
                    System.out.println(3);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0)
            solve(scanner);
        scanner.close();
    }
}