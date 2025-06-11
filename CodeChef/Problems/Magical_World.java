import java.util.Scanner;

public class Magical_World {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt(),b=s.nextInt(),x = s.nextInt();
            if (a*b<=x*x) System.out.println(0);
            else if ((1*a<=x*x)||(1*b<=x*x)) System.out.println(1);
            else System.out.println(2);
        }
    }
}