package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by o.lugacheva on 03.07.2017.
 */
public class MainwithSynchro {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();

        ex.execute(new ThSun());

        ex.execute(new ThSun());

    }
}
