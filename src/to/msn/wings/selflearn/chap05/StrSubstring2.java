package to.msn.wings.selflearn.chap05;

public class StrSubstring2 {

    public static void main(String[] args) {
        var mail = "yamada@example.com";
        System.out.println(mail.substring(mail.lastIndexOf("@") + 1)); // 結果:example
        System.out.println(mail.charAt(0)); // 結果:y

        for (var i = 0; i < mail.length(); i++) {
            System.out.println(mail.charAt(i));
            // 結果:y, a, m, a, d, a, @, e, x, a, m, p, l, e, ., c, o, m
        }
    }
}
