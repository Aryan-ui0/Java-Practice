package String.practiceQuestions.Easy;
import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String upper = "";
        String lower = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                upper += (char)(ch - 32);
            } else {
                upper += ch;
            }


            if (ch >= 'A' && ch <= 'Z') {
                lower += (char)(ch + 32);
            } else {
                lower += ch;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}