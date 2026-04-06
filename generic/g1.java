package generic;
class sumy{
    <G,E> void pr(G a,E b){
        System.out.println(a + " " + b);
    }
}
public class g1 {
    public static void main(String[] args) {
        sumy obj = new sumy();
        obj.pr(2,2);
        obj.pr('c', 4);
    }
}
