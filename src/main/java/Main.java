public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();
        ThreadImpl threadImpl = new ThreadImpl(counter);
        RunnableImpl runnableImpl = new RunnableImpl(counter);
        threadImpl.start();
        runnableImpl.run();
    }
}
