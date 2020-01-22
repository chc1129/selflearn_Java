package to.msn.wings.selflearn.chap05;

public class StrCompare {

    public static void main(String[] args) {
        var str = "def";
        System.out.println(str.compareTo("abc")); // 結果:3
        System.out.println(str.compareTo("def")); // 結果:0
        System.out.println(str.compareTo("xyz")); // 結果:-20
        System.out.println(str.compareToIgnoreCase("DEF")); // 結果:0
    }
}
