package to.msn.wings.selflearn.chap11;

public class MyRunner implements Runnable {
    // スレッドの実処理
    @Override
    public void run() {
        for (var i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
