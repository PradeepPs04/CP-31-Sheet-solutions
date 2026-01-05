import java.util.*;

public class P6 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int num = 0;
        HashMap<Integer, Integer>mpp = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++) {
            num = scanner.nextInt();
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        if(mpp.size() > 2)  System.out.println("NO");
        else if(mpp.size() <= 1)    System.out.println("YES");
        else {
            int freq1 = mpp.get(num);
            int freq2 = n - freq1;
            if(Math.abs(freq1 - freq2) <= 1)    System.out.println("YES");
            else    System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
