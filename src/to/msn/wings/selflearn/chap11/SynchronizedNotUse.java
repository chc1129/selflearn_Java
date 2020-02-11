package to.msn.wings.selflearn.chap11;

public class SynchronizedNotUse {
    // 複数スレッドで共有するデータ
    private int value = 0;

    // 10万個のスレッドを実行
    public static void main(String[] args) {
        // スレッドの個数
        final int TASK_NUM = 100000;
        var th = new Thread[TASK_NUM];
        var tb = new SynchronizedNotUse();
        // スレッドを生成&実行
        for (var i = 0; i < TASK_NUM; i++) {
            th[i] = new Thread(() -> {
                tb.increment();
            });
            th[i].start();
        }

        // スレッドの終了まで待機
        for (var i = 0; i < TASK_NUM; i++) {
            try {
                th[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(tb.value);
    }

    // valueフィールドをインクリメント
    void increment() {
        this.value++;
    }
}
