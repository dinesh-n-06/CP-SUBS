import java.lang.*;
import java.util.*;

public class C_Target_Practice {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        char[][] arr = new char[10][10];
        final int[][] score = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
            
        };
        while (t-- > 0) {
            for (int i = 0; i < 10; i++) {
                String line = s.nextLine();
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = line.charAt(j);
                }
                
            }
            int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == 'X') {
                    ans+=score[i][j];
                }
            }
        }
          System.out.println(ans);;  
        
    }
}
}