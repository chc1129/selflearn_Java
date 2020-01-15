package to.msn.wings.selflearn.chap03;

import java.time.LocalDateTime;

public class NoNumber {

    public static void main(String[] args) {
        System.out.println(1 + 2);      // 3
        System.out.println("a" + 5);    // a5
        System.out.println(5 + "b");    // 5b
        System.out.println("1" + "2");  // 12
        System.out.println("a" + LocalDateTime.now());
            // a2020-01-15T00:08:35.921952200
        //System.out.println(1 + LocalDateTime.now()); // エラー
    }
}