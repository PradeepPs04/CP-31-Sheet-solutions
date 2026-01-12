import java.util.*;

public class P12 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = scanner.nextInt();

        ArrayList<Integer>ans = new ArrayList<Integer>();
        ans.add(arr[0]);

        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]) {
                ans.add(arr[i]);
                ans.add(arr[i]);
            } else  ans.add(arr[i]);
        }

        System.out.println(ans.size());
        for(int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);

        scanner.close();
    } 
}