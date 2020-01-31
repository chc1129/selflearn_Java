package to.msn.wings.selflearn.chap08;

public class InheritBasic {

    public static void main(String[] args) {
        var bp = new BusinessPerson();
        bp.name = "山田太郎";
        bp.age = 30;
        System.out.println(bp.show()); // 結果:山田太郎 (30歳) です。
        System.out.println(bp.work()); // 結果:30歳の山田太郎は、働きます。
    }
}
