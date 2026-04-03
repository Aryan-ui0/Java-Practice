package String.practiceQuestions.Easy;

public class forth {
    public static void main(String[] args) {
        String s = "Aryan";
        String a = "Aryan";
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=a.charAt(i)){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Strings are same");
        else System.out.println("different");
    }
}
