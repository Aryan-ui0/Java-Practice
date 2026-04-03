package thread;
class th extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

public class imp1 {
    public static void main(String[] args) {

        th t1 = new th();
        th t2 = new th();

        t1.start();
        t2.start();
    }
}
