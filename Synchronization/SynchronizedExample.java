 class Counter {
    private int count;

    public synchronized void increment()
    {
        count++;
    }

    public synchronized int getCount()
    {
        return count;
    }
}

public class SynchronizedExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++)
            {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++)
            {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount()); // Expected output: 2000
    }
}
