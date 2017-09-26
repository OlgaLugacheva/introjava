package concurrency.useLocks;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by o.lugacheva on 05.07.2017.
 */
public class
MainLock {
    public static void main(String[] args) {
//        ExecutorService ex = Executors.newCachedThreadPool();
//
//        ex.execute(new MyThread());
//
//        ex.execute(new concurrency.useAtomic.MyThread());

        Thread thread1=new Thread(new MyThread() );

        Thread thread2=new Thread(new MyThread() );


        thread1.start();
        thread2.start();

    }
}
