package to.msn.wings.selflearn.chap09.member;

public class EnumBasic {

    public static void main(String[] args) {
        System.out.println(Season.SPRING);                  // 結果:春
        System.out.println(Season.SPRING.toString());       // 結果:春
        System.out.println(Season.SPRING.toSeasonValue());  // 結果:0
    }
}
