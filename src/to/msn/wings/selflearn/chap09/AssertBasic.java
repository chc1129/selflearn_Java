package to.msn.wings.selflearn.chap09;

public class AssertBasic {
    private static double getTrapezoidArea(double upper, double lower, double height) {
        // 引数がゼロ以下の場合に例外を発生
        assert upper > 0 && lower > 0 && height > 0;
        return (upper + lower) * height / 2;
    }
    public static void main(String[] args) {
        System.out.println(AssertBasic.getTrapezoidArea(-2, 4, 0));
    }
}
