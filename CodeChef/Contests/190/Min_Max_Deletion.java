import java.util.Scanner;

public class Min_Max_Deletion {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(),q = s.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            long score = 0;
            for (int i=1;i<n;i++){
                score+=Math.min(arr[i],arr[i-1]);
            }
            while (q--!=0){
                int idx = s.nextInt()-1,x=s.nextInt();
                if (idx<n-1) score-=Math.min(arr[idx],arr[idx+1]);
                if (idx>0) score-=Math.min(arr[idx],arr[idx-1]);
                arr[idx] = x;
                if (idx<n-1) score+=Math.min(arr[idx],arr[idx+1]);
                if (idx>0) score+=Math.min(arr[idx],arr[idx-1]);
                System.out.println(score);
            }
            
        }
    }
}