import java.util.Scanner;

public class End_Sorted {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            //  int n = s.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		    }
		    if(arr[0]==1 && arr[n-1]==n){
		        System.out.println("0");
		        continue;
		    }
		    int one=0,last=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==1){
		            one=i;
		        }
		        if(arr[i]==n) last=i;
		    }
		    int ans = 0;
		    if(one<last){
		        ans = (one)+(n-1-last);
		        System.out.println(ans);
		    }
            else{
                ans = one+n-1-last-1;
                System.out.println(ans);
            }
        }
    }
}