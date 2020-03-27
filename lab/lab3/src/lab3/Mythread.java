package lab3;

public class Mythread extends Thread {

    Mythread() {
        start();
    }

    @Override
    public void run() {
        for (int x = 65; x <= 81; x++) {
            System.out.printf("child %c\n", x);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
