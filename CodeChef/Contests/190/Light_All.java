import java.util.Arrays;
import java.util.Scanner;

public class Light_All {
    public static boolean check(boolean[] state){
        int n = state.length;
        for (int i=0;i<n;i++){
            if (state[i] == false) return false;
        }
        return true;
    }
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            s.nextLine();
            char[] arr =s.next().toCharArray();
            boolean[] state = new boolean[n];
            Arrays.fill(state,false);
            for (int i=0;i<n;i++){
                if (arr[i] == '1'){
                    state[i] = true;
                    if (i>0 && arr[i-1]=='0' && state[i-1]==false){
                        state[i-1] = true;
                        continue;
                    }
                    if (i<n-1 && arr[i+1]=='0' && state[i+1]==false){
                        state[i+1] = true;
                    }
                }
            }
            System.out.println((check(state))?"Yes":"No");
        }
    }
}