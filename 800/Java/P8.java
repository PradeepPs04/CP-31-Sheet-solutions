import java.util.*;

public class P8 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        HashMap<Integer, Integer>mpp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        if(mpp.containsKey(k))  System.out.println("YES");
        else    System.out.println("NO");
    }   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
