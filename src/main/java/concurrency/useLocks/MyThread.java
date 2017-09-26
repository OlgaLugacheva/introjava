package concurrency.useLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by o.lugacheva on 05.07.2017.
 */
public class MyThread implements Runnable {

    public static int count;

    public void run() {

        for (int i = 0; i < 10000000; i++) {

            lock.lock();

            count++;



        }

        System.out.println(count);

    }

    Lock lock = new ReentrantLock();

}

//синхронизация по объекту

//public class MyThread implements Runnable {
//
//    public static  int count;
//
//    public void run() {
//
//        for (int i = 0; i < 10000000; i++) {
//
//            synchronized (this){
//
//                count++;
//
//            }
//
//        }
//
//        System.out.println(count);
//
//    }
//
//}