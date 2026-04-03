package thread;
class th extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
            System.out.println("Aditya");
            System.out.println("Kashyap");
            Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("asthma");
        }
        
    }
}

public class sleepy {
    public static void main(String[] args) {
        th t1 = new th();
        try {
            t1.join();
            for(int i = 0;i<5;i++){
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        

        t1.start();
    }
}
