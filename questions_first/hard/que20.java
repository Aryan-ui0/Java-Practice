package questions_first.hard;
import java.util.Scanner;

public class que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();

         double bonus;

        if (salary > 50000)
            bonus = salary * 0.20;
        else
            bonus = salary * 0.10;

        double totalSalary = salary + bonus;

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}
