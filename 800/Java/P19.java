import java.util.*;

public class P19 {
    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int negCnt = 0;
        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if(num == -1)   negCnt++;
        } 

        int posCnt = n - negCnt;

        // if +ve's are more or equal to -ve's 
        if(posCnt >= negCnt) {
            // if number of -ve's are even => we do not need to do anything
            if(negCnt % 2 == 0) System.out.println(0);
            // convert 1 -ve to +ve to make -ve count even
            else System.out.println(1);
        } else {
            // make +ve's and -ve's equal
            int diff = negCnt - posCnt;
            int moves = (diff + 1) / 2;
            // if remaining -ve's are odd => convert 1 -ve to +ve
            if((negCnt-moves) % 2 != 0) moves++;

            System.out.println(moves);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)  solve(scanner);
        scanner.close();
    }
}
