package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamCast {

    public static void main(String[] args) {
        IntStream.range(1, 5)
                .asDoubleStream()
                .forEach(System.out::println); // 結果:1.0, 2.0, 3.0, 4.0 (double型)
    }
}
