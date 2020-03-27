package lab2;


class NewThread extends Thread {

    NewThread() { 
 
        start();

    }
 

    @Override
    public void run() {
        try {
            for (int i = 65; i <=90 ; i++) {
                System.out.printf("Child Thread: %c\n",i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");

    }
}

class ExtendThread {

    public static void main(String args[]) {
        new NewThread(); // create a new thread
        try {
            for (int i = 1; i <=100 ; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
