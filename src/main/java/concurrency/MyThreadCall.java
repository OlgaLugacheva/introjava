package concurrency;

import java.util.concurrent.Callable;

public class MyThreadCall implements Callable<Integer> {

    public int count=0;

    public Integer call() {

        for(int i=0;i<1000000;i++){

            count++;
        }

        return count;

    }

}
