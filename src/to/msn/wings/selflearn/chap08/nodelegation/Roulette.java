package to.msn.wings.selflearn.chap08.nodelegation;

import java.util.Random;

public class Roulette extends Random {
    // ルーレットの上限値
    private int bound;

    public Roulette(int bound) {
        this.bound = bound;
    }

    // boundフィールドを上限とする値を取得
    @Override
    public int nextInt() {
        return nextInt(this.bound);
    }

    // 他の不要メソッドは無効化
    @Override
    public boolean nextBoolean() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long nextLong() {
        throw new UnsupportedOperationException();
    }
}
