import java.util.Scanner;

public class A_Legs {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int ans = n/4;
            ans+=(n%4)/2;
            System.out.println(ans);
        }
    }
}