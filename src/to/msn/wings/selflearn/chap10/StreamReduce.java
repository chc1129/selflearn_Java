package to.msn.wings.selflearn.chap10;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamReduce {

    public static void main(String[] args) {
        System.out.println(
                Stream.of("バラ", "あさがお", "チューリップ", "さくら")
                .sorted()
                .reduce((result, str) -> {
                    return result + "," + str;
                })
                .orElse("")
        );  // 結果:あさがお,さくら,チューリップ,バラ

//        var list = new String[] { "バラ", "あさがお", "チューリップ", "さくら" };
//        Arrays.sort(list);
//        var result = "";
//        for (var str: list) {
//            result += str + ",";
//        }
//        System.out.println(result);
    }
}
