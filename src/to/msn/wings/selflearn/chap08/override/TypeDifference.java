package to.msn.wings.selflearn.chap08.override;

public class TypeDifference {

    public static void main(String[] args) {
        Person p = new BusinessPerson();
        p.name = "山田太郎";
        p.age = 30;
//        System.out.println(p.work()); // 結果:エラー
        System.out.println(p.show()); // 結果:会社員の山田太郎 (30歳) です。
    }
}
