package generic;
class sumy{
    <G> void sum(G a,G b){
        G sum = a + b;w
        System.out.println(sum);
    }
}
public class g3 {
    public static void main(String[] args) {
        sumy obj = new sumy();
        obj.sum(2,2);
        obj.sum(6, 4);
    }
}
