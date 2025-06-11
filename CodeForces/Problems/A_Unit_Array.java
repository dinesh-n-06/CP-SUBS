import java.util.Scanner;

public class A_Unit_Array {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            int pos=0,neg=0;
            for (int i=0;i<n;i++){
                arr[i] = s.nextInt();
                if (arr[i]==-1) neg++;
                else pos++;
            }
            int count=0;
            while (pos<neg || neg%2!=0){
                pos++;
                neg--;
                count++;
            }
            System.out.println(count);
        }
    }
}