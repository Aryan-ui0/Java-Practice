package thread;
class th implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class imp2 {
    public static void main(String[] args) {

        th obj = new th();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("th1");
        t2.setName("th2");

        t1.start();
        t2.start();
    }
}