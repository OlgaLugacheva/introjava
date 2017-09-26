package concurrency.useVolatile;

/**
 * Created by o.lugacheva on 05.07.2017.
 */
    public class MyThread implements Runnable {

        public static volatile int count;

        public void run() {

            for (int i = 0; i < 10000000; i++) {

                count++;

            }

            System.out.println(count);

        }

    }

