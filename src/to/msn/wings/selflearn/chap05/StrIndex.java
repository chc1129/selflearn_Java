package to.msn.wings.selflearn.chap05;

public class StrIndex {

    public static void main(String[] args) {
        var str = "にわにはにわにわとりがいる";
        System.out.println(str.indexOf("にわ")); // 結果:0
        System.out.println(str.indexOf("にも")); // 結果:-1
        System.out.println(str.lastIndexOf("にわ")); // 結果:6
        System.out.println(str.indexOf("にわ", 3)); // 結果:4
        System.out.println(str.lastIndexOf("にわ", 3)); // 結果:0
    }
}
