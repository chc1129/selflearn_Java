package to.msn.wings.selflearn.chap07.staticinit;

public class Order {
    // フィールド初期化
    String value = "First!";

    // コンストラクター
    public Order() {
        System.out.println(value);
    }

    // 初期化ブロック
    {
        value = "Second!!";
    }
}
