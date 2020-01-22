package to.msn.wings.selflearn.chap05;

public class StrBlank {

    public static void main(String[] args) {
        var str1 = "";
        var str2 = " 　  ";
        System.out.println(str1.isEmpty()); // 結果:true
        System.out.println(str1.isBlank()); // 結果:true
        System.out.println(str2.isEmpty()); // 結果false
        System.out.println(str2.isBlank()); // 結果:true
    }
}
