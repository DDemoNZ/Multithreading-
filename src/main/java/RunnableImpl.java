public class RunnableImpl implements Runnable {

    private static final int END_LOOP = 100;
    private Counter counter;

    RunnableImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() <= END_LOOP) {
            System.out.println("Runnable :" + counter.getCounter());
            counter.setCounter(counter.getCounter() + 1);
        }
    }
}
