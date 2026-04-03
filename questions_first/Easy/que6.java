package questions_first.Easy;
import java.util.Scanner;
public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int si = (principal*rate*time)/100;
        System.out.println(si);
    }
}
