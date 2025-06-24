import java.util.Scanner;

public class Sub_or_Swp {
    public static int gcd(int a,int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt(),b = s.nextInt();
		    System.out.println(gcd(a,b));
        }
    }
}