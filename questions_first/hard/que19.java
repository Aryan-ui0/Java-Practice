package questions_first.hard;
import java.util.Scanner;
public class que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean prime = true;
        if(a<=1) prime = false;
        else{
            for(int i = 2;i<a;i++){
                if(a%i==0){
                    prime = false;
                    break;
                }  
                
            }

        }
        if(prime) System.out.println("prime");
        else System.out.println(" not prime");
    }
}
