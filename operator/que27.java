package operator;
import java.util.Scanner;

public class que27 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            int digit = a%10;
            if(digit%2==0) even++;
            else odd++;
            a = a/10;

        }
        if(odd==even) System.out.println("Balanced");
        else if(odd>even) System.out.println("Weak");
        else System.out.println("Strong");
    }

}
