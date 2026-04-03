package questions_first.Medium;
import java.util.Scanner;
public class que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        if(n%2==0) System.out.println("Even");
        else if(n%2!=0) System.out.println("Odd");
    }
}
