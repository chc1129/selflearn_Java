package to.msn.wings.selflearn.chap05;

public class StrStrip {

    public static void main(String[] args) {
        var str = "  Wings Project  ";
        System.out.println(str.strip());         // 結果:Wings Project
        System.out.println(str.stripLeading());  // 結果:Wings Project__
        System.out.println(str.stripTrailing()); // 結果:__Wings Project
    }
}
