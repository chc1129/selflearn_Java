package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamUnboxed {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4)
                .mapToInt(i -> i) // アンボクシング(Integer → int)
                .forEach(System.out::println); // 結果:1, 2, 3, 4
    }
}
