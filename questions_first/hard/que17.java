package questions_first.hard;
import java.util.Scanner;
public class que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int total =mark1+mark2+mark3;
        double avg = total/3.0;
        System.out.println("Total : " + total );
        System.out.println("Average : " + avg);
       if(avg>=75) System.out.println("Grade : A");
       else if(avg>=60) System.out.println("Grade : B");
       else if(avg>=50) System.out.println("Grade : C");
       else System.out.println("Grade : F");
        
    }
}
