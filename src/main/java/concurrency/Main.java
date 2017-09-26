package concurrency;

import java.util.concurrent.*;

/**
 * Created by o.lugacheva on 03.07.2017.
 */
public class Main {


    public static void main(String[] args) {
//executor
        ExecutorService ex = Executors.newCachedThreadPool();

        ex.execute(new MyThread());

        ex.execute(new MyThread());


/*
Очень часто нам необходимо, чтобы поток после выполнения своей работы возвращал нам некоторое значение,
в таких ситуациях нам необходимо использовать интерфейс Callable при создании класса. Он очень похож на Runnable,
 но имеет несколько отличий. В первую очередь после объявления данного интерфейса необходимо указать тип параметра,
 который должен вернуть поток. Вместо метода run() необходимо использовать метод call(). Давайте,
 реализуем данный интерфейс в нашей задаче.

 В данном примере метод call() вернет нам число после завершения операции. Теперь рассмотрим способ получения полученного значения,
  используя исполнители. Для передачи объекта, созданного нами класса исполнителя, используется метод «submit».
  При вызове данного метода создается объект типа «Future» параметризованный по типу результата возвращаемого Callable.
   В нашем случае «Future<Integer>». В свою очередь из этого объекта мы уже можем получить нужный нам результат, используя метод get().
   Данный метод всегда необходимо оборачивать в блок  try-catch , так как поток еще может не закончить свою работу,
 а метод get() уже будет вызван. Для проверки завершенности потока используется метод isDone(), он возвращает логическое значение.
 */
        ExecutorService ex1 = Executors.newCachedThreadPool();

        Future<Integer> s = ex1.submit(new MyThreadCall());

        Future<Integer> s1 = ex1.submit(new MyThreadCall());


        try {

            System.out.println(s.get());

            System.out.println(s1.get());

        } catch (InterruptedException e) {

            e.printStackTrace();

        } catch (ExecutionException e) {

            e.printStackTrace();

        }


        ex.execute(new ThreadWithPriority(Thread.MAX_PRIORITY));
//передаем параметр отвечающий за приоритет
        ex.execute(new ThreadWithPriority(Thread.MIN_PRIORITY));
//передаем параметр отвечающий за приоритет



        //потоки - демоны
        Thread th=new Thread(new MyThread());

        th.setDaemon(true);
//данную операцию необходимо делать до запуска потока
        th.start();

    }




}


