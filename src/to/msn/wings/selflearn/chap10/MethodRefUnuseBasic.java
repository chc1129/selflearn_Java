package to.msn.wings.selflearn.chap10;

public class MethodRefUnuseBasic {

    public static void main(String[] args) {
        // 文字列配列dataの内容を順に出力
        var data = new String[] { "春はあけぼの", "夏は夜", "秋は夕暮れ" };
        var un = new MethodRefUnuse();
        un.walkArray(data);
    }
}
