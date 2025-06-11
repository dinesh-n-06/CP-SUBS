import java.util.Scanner;

public class A_Conflict {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        String b = s.nextLine();
        boolean f = true;
        for (int i=0;i<n;i++){
            if (a.charAt(i) == 'o' && 'o' == b.charAt(i)) {
                f = !f;
                break;
        }
        }
        System.out.println((f)?"No":"Yes");
    }
}