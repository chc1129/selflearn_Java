package to.msn.wings.selflearn.chap08;

public class TypeGetBasic {

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getClass());
        // 結果:class to.msn.wings.selflearn.chap08.Person
        Person p2 = new BusinessPerson();
        System.out.println(p2.getClass());
        // 結果:class to.msn.wings.selflearn.chap08.BusinessPerson
    }
}
