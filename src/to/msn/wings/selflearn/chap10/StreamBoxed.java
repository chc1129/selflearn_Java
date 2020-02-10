package to.msn.wings.selflearn.chap10;

import java.util.stream.IntStream;

public class StreamBoxed {

    public static void main(String[] args) {
        IntStream.range(1, 5)
                .boxed()
                .forEach(System.out::println); // 結果:1, 2, 3, 4

        IntStream.range(1, 5)
                .mapToObj(Integer::valueOf)
                .forEach(System.out::println); // 結果:1, 2, 3, 4
    }
}
