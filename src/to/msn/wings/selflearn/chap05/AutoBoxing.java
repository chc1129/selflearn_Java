package to.msn.wings.selflearn.chap05;

public class AutoBoxing {

    public static void main(String[] args) {
        Long result = 0L;
        // 1～10000の総和を求める
        for (var i = 0; i < 10000; i++) {
            // アンボクシング(加算) + ボクシング(代入)の発生
            result += i;
        }
        System.out.println(result);
    }
}
