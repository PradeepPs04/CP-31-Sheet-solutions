import java.util.*;

public class P10 {  
    private static final int [][]score = {
        {1,1,1,1,1,1,1,1,1,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,1,1,1,1,1,1,1,1,1},
    };

    static void solve(Scanner scanner) {
        int totalScore = 0;

        for(int i = 0; i < 10; i++) {
            String row = scanner.next();
            for(int j = 0; j < 10; j++) {
                if(row.charAt(j) == 'X')    totalScore += score[i][j];
            }
        }   

        System.out.println(totalScore);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) solve(scanner);
        scanner.close();
    }
}
