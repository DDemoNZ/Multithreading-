public class ThreadImpl extends Thread {

    private static final int END_LOOP = 100;
    private Counter counter;

    ThreadImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() <= END_LOOP) {
            System.out.println("Tread: " + counter.getCounter() + 1);
            counter.setCounter(counter.getCounter() + 1);
        }
    }
}
