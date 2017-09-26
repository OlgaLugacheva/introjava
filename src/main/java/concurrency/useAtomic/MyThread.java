package concurrency.useAtomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by o.lugacheva on 05.07.2017.
 */
public class MyThread implements Runnable {


	public static AtomicInteger count = new AtomicInteger(0);

	public void run() {

		for (int i = 0; i < 10000000; i++) {

//count.incrementAndGet();

// count.addAndGet(1);

			count.getAndAdd(1);

		}

		System.out.println(count);

	}

}
