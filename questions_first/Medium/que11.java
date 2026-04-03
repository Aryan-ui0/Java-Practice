package questions_first.Medium;
import java.util.Scanner;
public class que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area  = 3.14 * r*r;
        double cir = 2* 3.14 * r;
        System.out.println("AREA : " + area);
        System.out.println("Circumference : " + cir);

    }
}
