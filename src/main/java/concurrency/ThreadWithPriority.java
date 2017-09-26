package concurrency;

/**
 * Created by o.lugacheva on 03.07.2017.
 */
public class ThreadWithPriority implements Runnable {
/*
*
* */

    public int count = 0;

    private int prioriti;

    public ThreadWithPriority(int prioriti) {

        this.prioriti = prioriti;

    }

    public void run() {

        for (int i = 0; i < 1000000; i++) {

            count++;

        }

        Thread.currentThread().setPriority(prioriti);
//передаем полученное значение потоку
        System.out.print("thread with priority" + count);

    }


}
