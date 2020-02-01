package to.msn.wings.selflearn.chap08.hiding;

public class HideBasic {

    public static void main(String[] args) {
        var bp = new BusinessPerson();
        // BusinessPerson.birthフィールドを表示
        System.out.println(bp.birth);
        // Person.birthフィールドを表示
        bp.show();

        Person p = new BusinessPerson();
        System.out.println(p.birth);
    }
}
