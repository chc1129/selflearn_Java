package to.msn.wings.selflearn.chap05;

import java.util.regex.Pattern;

public class RegReplace {

    public static void main(String[] args) {
        var str = "サポートサイトはhttps://www.wings.msn.to/です。";
        System.out.println(str.replaceAll(
                "(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\\\w ./?%&=-]*)?",
                "<a href=\"$0\">$0</a>"));
    }
}
