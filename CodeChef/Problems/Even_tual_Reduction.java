import java.util.HashMap;
import java.util.Scanner;

public class Even_tual_Reduction {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
                    @SuppressWarnings("unused")
		    int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		    HashMap<Character, Integer> map = new HashMap<>();
		    // char[] arr = s.toCharArray();
		    for(char i: s.toCharArray()){
		        if(!map.containsKey(i))
		            map.put(i,1);
		        else
		            map.put(i,map.get(i)+1);
		    }
		    boolean yes = true;
		    for(int i: map.values()){
		        if(i%2!=0)
		            yes = false;
		    }
		    System.out.println((yes)?"YES":"NO");
		    
		}
    }
}