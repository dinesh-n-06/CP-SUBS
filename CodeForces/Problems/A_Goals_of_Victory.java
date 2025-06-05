import java.util.*;

public class A_Goals_of_Victory {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int ans= 0;
            for (int i = 0; i < n-1; i++) {
                ans+= s.nextInt();
            }
            System.out.println(-ans);
            
        }
    }
}