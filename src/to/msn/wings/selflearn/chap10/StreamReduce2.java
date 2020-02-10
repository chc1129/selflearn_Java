package to.msn.wings.selflearn.chap10;

import java.util.stream.Stream;

public class StreamReduce2 {

    public static void main(String[] args) {
        System.out.println(
                Stream.of("バラ", "あさがお", "チューリップ", "さくら")
                .sorted()
                //.parallel()
                .reduce("ひまわり", (result, str) -> {
                    return result + "," + str;
                })
        ); // 結果:ひまわり,あさがお,さくら,チューリップ,バラ
    }
}
