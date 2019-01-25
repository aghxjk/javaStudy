package chapter09;

/**
 * Created by zhaoyimeng on 15/11/30.
 */

public class Runable_test implements Runnable{

    public boolean run = true;
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            if (run == false)return;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
