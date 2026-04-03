package questions_first.hard;
import java.util.Scanner;
public class que16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acc = sc.nextInt();
        double balance = sc.nextDouble();
        double deposit = sc.nextDouble();
        double withdraw = sc.nextDouble();
        System.out.println(balance+ deposit - withdraw);
    }
}
