package to.msn.wings.selflearn.chap07.constructor.factory;

public class FactoryClass {
    // privateなコンストラクター
    private FactoryClass() {
        System.out.println("ファクトリー");
    }

    // ファクトリーメソッド
    public static FactoryClass getInstance() {
        return new FactoryClass();
    }
}
