package to.msn.wings.selflearn.chap10;

public class MethodRefUse {
    // 配列要素の処理方法をメソッド参照で受け取れるように
    public void walkArray(String[] data, Output output) {
        for (var value : data) {
            output.print(value);
        }
    }

    // Output型に対応したメソッド(渡された文字列をブラケットでくくる)
    static void addQuote(String value) {
        System.out.printf("[%s]\n", value);
    }
}
