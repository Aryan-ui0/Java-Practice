package thread;

class first extends Thread{
    public void run(){
        for(int i= 6;i<11;i++){
            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
}
public class imp4 {
    public static void main(String[] args) {
        first f = new first();

        f.start();
        for(int i= 1;i<6;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        


    }
}
