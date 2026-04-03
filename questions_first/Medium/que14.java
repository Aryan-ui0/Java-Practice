package questions_first.Medium;
import java.util.Scanner;
public class que14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a-b;
        int prod = a*b;
        int div = a/b;
        System.out.println("sum : " + a+b);
        System.out.println("diff : "+ diff);
        System.out.println("product : " + prod);
        System.out.println("division : "+ div);
    }
}
