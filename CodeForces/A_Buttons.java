import java.util.*;

public class A_Buttons {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt(),b=s.nextInt(),c=s.nextInt();
            if (c%2==0){
                if (a<=b){
                    System.out.println("Second");
                }
                else System.out.println("First");
            }
            else{
                if (a>=b) System.out.println("First");
                else System.out.println("Second");
            }
        }
    }
}