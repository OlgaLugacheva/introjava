package concurrency;

import java.util.concurrent.Callable;

/**
 * Created by o.lugacheva on 03.07.2017.
 */
public class MyThread implements Runnable {


    public int count = 0;

    public void run() {

        for (int i = 0; i < 1000000; i++) {

            count++;

        }

        System.out.println("thread runnable" + count);

    }

}


