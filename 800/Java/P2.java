import java.util.*;

// change this public class name to "LineTrip" before submitting code on CF
public class P2 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = scanner.nextInt();

        int mini_required = arr[0];

        for(int i = 0; i < n-1; i++) {
            int next_distance = arr[i+1] - arr[i];
            mini_required = Math.max(mini_required, next_distance);
        }

        // distance between last gas station and destination
        int last_distance = x - arr[n-1];
        int last_required_fuel = 2 * last_distance;
        

        mini_required = Math.max(mini_required, last_required_fuel);

        System.out.println(mini_required);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);

        scanner.close();
    }
}