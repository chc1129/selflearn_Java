package to.msn.wings.selflearn.chap10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGrouping2 {

    public static void main(String[] args) {
        System.out.println(
                Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
                .sorted()
                .collect(
                        Collectors.groupingBy(
                                str -> str.length(),
                                Collectors.joining("/")
                ))
        ); // 結果:{2=うめ/バラ, 3=さくら, 4=あさがお/さざんか}
    }
}
