package questions_first.Easy;
import java.util.Scanner;
public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 40;
        int b = 70;
        int temp = a;
        
        a=b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
 