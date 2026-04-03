package questions_first.Easy;
import java.util.Scanner;
public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 && a%5==0) System.out.println("Div by both");
        else if(a%3==0) System.out.println("Div by 3");
        else if(a%5==0) System.out.println("Div by 5");
        
        else if(a%3!=0 && a%5!=0) System.out.println("not div by both");
    }
}
