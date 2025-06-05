import java.util.Scanner;

public class A_Array_Coloring {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            int oc = 0;
            for (int i=0;i<n;i++){
                if (arr[i]%2!=0) oc++;
            }
            System.out.println((oc%2==0)?"YES":"NO");
            
        }
    }
}