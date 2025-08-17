import java.util.Scanner;

public class Odd_Pairs {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong();
            long ans = 2*((n+1)/2)*(n/2);
            System.out.println(ans);
        }
    }
}