package thread;

class first extends Thread{
    public void run(){
        System.out.println("Hi i am first" + ": " + Thread.currentThread().getName());
    }
}
class second extends Thread{
    public void run(){
        System.out.println("Hi i am second"  + ": " + Thread.currentThread().getName());
    }
}
public class imp3 {
    public static void main(String[] args) {
        first f = new first();
        second s = new second();
        f.setName("aryan");
        s.setName("aryan dogra");
        f.start();
        s.start();

    }
}
