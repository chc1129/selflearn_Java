package to.msn.wings.selflearn.chap09;

public class NestBasic {
    public static void main(String[] args) {
        var c = new MyClass();
        c.run(); // 結果:Nested class is running!
        // var h = new MyClass.MyHelper(); // 結果:エラー
    }
}
