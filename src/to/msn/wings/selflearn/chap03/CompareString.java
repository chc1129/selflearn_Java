package to.msn.wings.selflearn.chap03;

public class CompareString {

    public static void main(String[] args) {
        var str1 = "あいう";
        var str2 = "あいう";

        System.out.println(str1 == str2); // 結果:true
        System.out.println(str1 == "あ" + "いう"); // 結果:true
    }
}
