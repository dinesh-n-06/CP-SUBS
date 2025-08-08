import java.util.Scanner;

public class Bear_and_Candies_123 {
    public static void main(String[] args) throws java.lang.Exception {
        	Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int a = s.nextInt(),b= s.nextInt();
		    int max = (a<b)?b:a;
		    int l=0, bob =0;
		    boolean ans = false;
		    for (int i=1;i<=max+1;i++){
		        if(i%2!=0){
		            if(l+i<=a) l+=i;
		            else{
		                ans=!ans;
		                break;
		            }
		        }
		        else{
		            if(bob+i<=b) bob+=i;
		            else{
		                break;
		       }
		    } 
		    }
		     System.out.println((ans)?"Bob":"Limak");
		
            
        }
    }
}