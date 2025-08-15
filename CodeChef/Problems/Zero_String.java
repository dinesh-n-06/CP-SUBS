import java.util.Scanner;

public class Zero_String {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    s.nextLine();
		    String str = s.nextLine();
		    int zero=0,one=0;
		    for(char i:str.toCharArray()){
		        if(i=='1') one++;
		        else zero++;
		    }
		    System.out.println(Math.min(one,1+zero));
    }
}
}