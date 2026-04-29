class NumberThread extends Thread {

    int start;
    int end;

    NumberThread(int start, int end) {

        this.start = start;
        this.end = end;
    }

    public void run() {

        for (int i = start; i <= end; i++) {

            System.out.println(i);
        }
    }
}

public class practical24 {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread(1, 100);

        NumberThread t2 = new NumberThread(101, 200);

        NumberThread t3 = new NumberThread(201, 300);

        try {

            t1.start();

            t1.join();

            t2.start();

            t2.join();

            t3.start();

            t3.join();

        } catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}
