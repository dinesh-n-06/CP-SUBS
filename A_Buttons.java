import java.util.*;

public class A_Buttons {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt(),b=s.nextInt(),c=s.nextInt();
            int sum = a+b+c;
            System.out.println((sum%2==0)?"Second":"First");
            
        }
    }
}