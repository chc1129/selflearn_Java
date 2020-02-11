package to.msn.wings.selflearn.chap11;

import java.util.concurrent.Executors;

public class ThreadPoolBasic {

    public static void main(String[] args) {
        var ex = Executors.newFixedThreadPool(10);
        ex.execute(new ThreadPool());
        ex.execute(new ThreadPool());
        ex.execute(new ThreadPool());
        ex.shutdown();
    }
}
