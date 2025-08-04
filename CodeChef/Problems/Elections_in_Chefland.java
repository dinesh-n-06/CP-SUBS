import java.util.Scanner;

public class Elections_in_Chefland {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int a = s.nextInt(),b = s.nextInt(),c = s.nextInt();
		    if (a>b && a>c){
		        System.out.println((a>50)?"A":"NOTA");
		    }
		    else if(b>c && b>a){
		        System.out.println((b>50)?"B":"NOTA");
		    }
		    else{
		        System.out.println((c>50)?"C":"NOTA");
		    }
    }
}
}