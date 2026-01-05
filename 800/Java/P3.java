import java.util.*;

public class P3 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        String s = scanner.next();

        int count = 0;
        int i = 0;
        while(i < n) {
            if(s.charAt(i) == '.') {
                int j = i + 1;
                while(j < n && s.charAt(j) == '.')  j++;

                // if there are a least 3 consecutive empty cells
                // we can create unlimited water source using 2 cells
                // after that we can perform 2nd action to fill all the remaining cells
                if(j - i >= 3) {
                    count = 2;
                    break;
                } else {
                    // not possible to create unimited water source
                    count += (j-i);
                    i = j+1;
                }
            } else {
                // blocked cell
                i++;
            }
        }

        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}