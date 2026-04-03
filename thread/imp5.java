package thread;
class odd extends Thread{
    public void run(){
        for(int i = 1;i<11;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("This is thread 1");
    }
}
class even extends Thread{
    public void run(){
        for(int i = 1;i<11;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("This is thread 2");
    }
}
class all extends Thread{
    public void run(){
        for(int i = 10;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("This is thread 3");
    }
}
public class imp5 {
    public static void main(String[] args) {
        odd o = new odd();
        even e = new even();
        all a = new all();
        o.start();
        e.start();
        a.start();


    }
}
