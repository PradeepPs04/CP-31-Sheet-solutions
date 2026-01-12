import java.util.*;

public class P13 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        long []arr = new long[n];
        for(int i = 0; i < n; i++)  arr[i] = scanner.nextLong();

        long maxi = Arrays.stream(arr).max().getAsLong();

        ArrayList<Long>first = new ArrayList<>();
        ArrayList<Long>second = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(arr[i] == maxi)  second.add(arr[i]);
            else    first.add(arr[i]);
        }

        if(first.size() == 0)   System.out.println(-1);
        else {
            System.out.print(first.size() + " " + second.size() + "\n");
            for(int i = 0; i < first.size(); i++)   System.out.print(first.get(i) + " ");
            System.out.println();
            for(int i = 0; i < second.size(); i++)  System.out.print(second.get(i) + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}