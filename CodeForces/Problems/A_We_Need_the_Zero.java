import java.util.Scanner;

public class A_We_Need_the_Zero {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            // Set<Integer> set = new HashSet<>();
            for (int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            if (n%2==0){
                int ans=0;
                for (int i:arr){
                    ans^=i;
                }
                System.out.println(ans==0?"0":"-1");
            }
            else{
                int ans=0;
                for (int i:arr){
                    ans^=i;
                }
                System.out.println(ans);
            }

        }
    }
}