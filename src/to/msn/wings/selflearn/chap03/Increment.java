package to.msn.wings.selflearn.chap03;

public class Increment {

    public static void main(String[] args) {
        var i = 3;
        var j = ++i;
        System.out.println(i);
        System.out.println(j);
        var m = 3;
        var n = m++;
        System.out.println(m); // 結果:4
        System.out.println(n); // 結果:3
    }
}
