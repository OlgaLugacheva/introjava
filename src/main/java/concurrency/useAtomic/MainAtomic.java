package concurrency.useAtomic;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by o.lugacheva on 05.07.2017.
 */
public class MainAtomic {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();

        ex.execute(new MyThread());

        ex.execute(new MyThread());

    }
}
