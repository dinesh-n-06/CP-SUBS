import java.util.Scanner;

public class Add_1_or_2_Game {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            System.out.println((n==1)?"ALICE":"BOB");

        }
    }
}