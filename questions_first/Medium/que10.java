package questions_first.Medium;
import java.util.Scanner;
public class que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double width = sc.nextDouble();
        double area = len*width;
        double per = 2*(len + width);
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " +per);
    }
}
