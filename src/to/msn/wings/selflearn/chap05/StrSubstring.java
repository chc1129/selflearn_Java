package to.msn.wings.selflearn.chap05;

public class StrSubstring {

    public static void main(String[] args) {
        var str = "WINGSプロジェクト";
        System.out.println(str.substring(5, 7)); // 結果:プロ
        //System.out.println(str.substring(5, 2)); // 結果:エラー
        //System.out.println(str.substring(-5));  // 結果:エラー
        //System.out.println(str.substring(15)); // 結果:エラー
    }
}
