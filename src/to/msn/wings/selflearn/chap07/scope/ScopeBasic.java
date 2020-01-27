package to.msn.wings.selflearn.chap07.scope;

public class ScopeBasic {

    public static void main(String[] args) {
        var s = new Scope();
        System.out.println(s.show()); // 結果:ローカル
        System.out.println(s.data);   // 結果:フィールド
    }
}
