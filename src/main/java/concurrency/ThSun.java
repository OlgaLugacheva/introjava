package concurrency;

/**
 * Created by o.lugacheva on 03.07.2017.
 */
public class ThSun implements Runnable{



        public static int count;

        public void run() {

            for(int i=0;i<10000000;i++){

                inccount();

            }

            System.out.println(count);

        }

        public synchronized static void inccount(){

            ThSun.count++;

        }


}
