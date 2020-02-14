package to.msn.wings.selflearn.chap05;

import java.time.LocalDateTime;
import java.util.Locale;

public class StrFormat {

    public static void main(String[] args) {
        System.out.println(String.format(
                "%sは%s、 %d歳です。", "サクラ", "女の子", 1));
        // 結果:サクラは女の子、 1歳です。

        System.out.println(String.format(
                "名前は%1$s、 %3$d歳です。 %1$sは、元気です。", "サクラ", "女の子", 1));
        // 結果：名前はサクラ、 1歳です。 サクラは、元気です。

        System.out.println(String.format("%.2sです。", "サクラ"));
        // 結果：サクです。

        System.out.println(String.format("%5sです。", "サクラ"));
        // 結果：  サクラです。

        System.out.println(String.format("%-5sです。", "サクラ"));
        // 結果：サクラ  です。

        System.out.println(String.format("10進数 %08d", 12345));
        // 結果：10進数 00012345

        System.out.println(String.format("16進数 %#x", 10));
        // 結果：16進数 0xa

        System.out.println(String.format("小数点数 %.2f", 123.456));
        // 結果：小数点数 123.46

        System.out.println(String.format("指数／小文字 %.2e", 123.456));
        // 結果：指数／小文字 1.23e+02

        System.out.println(String.format("指数／大文字 %.2E", 123.456));
        // 結果：指数／大文字 1.23E+02

        var d = LocalDateTime.now();
        System.out.println(String.format("%tF", d));
        // 結果：2020-01-22

        System.out.println(String.format("%tr", d));
        // 結果：11:59:13 午後

        System.out.println(String.format("%1$tY年　%1$tm月 %1$td日", d));
        // 結果：2020年　01月 22日

        System.out.println(String.format(Locale.GERMAN, "%f", 1234.567));
        // 結果：1234,567000

        System.out.println(String.format(Locale.GERMAN, "%tr", d));
        // 結果：11:59:13 PM

        System.out.printf("%.2sです。\n", "サクラ");
        // 結果：サクです。
    }
}
