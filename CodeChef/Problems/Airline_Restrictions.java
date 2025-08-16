import java.util.Scanner;

public class Airline_Restrictions {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt(), e = s.nextInt();
            if((a+b<=d && c<=e) || (a+c<=d && b<=e) || (b+c<=d && a<=e)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}