import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Card_Removal {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		    }
		    HashMap<Integer,Integer> hm = new HashMap<>();
		    for(int i:arr){
		        if(!hm.containsKey(i)){
                    hm.putIfAbsent(i, 1);
                }
                else hm.put(i,hm.get(i)+1);
		    }
            int ans = Collections.max(hm.values());
            System.out.println(n-ans);
        }
    }
}