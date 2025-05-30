import java.lang.*;
import java.util.*;

public class Distinct_Numbers {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            Set<Integer> set = new HashSet<>();
            int[] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = s.nextInt();
                set.add(arr[i]);
            }

            System.out.println(set.size());
    }
}