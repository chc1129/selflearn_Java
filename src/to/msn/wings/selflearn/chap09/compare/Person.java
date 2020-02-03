package to.msn.wings.selflearn.chap09.compare;

public class Person implements Comparable<Person> {
    private String firstNameKana;   // 名前
    private String lastNameKana;    // 名字

    public Person(String firstNameKana, String lastNameKana) {
        this.firstNameKana = firstNameKana;
        this.lastNameKana = lastNameKana;
    }

    // 名字、名前カナで大小を判定
    @Override
    public int compareTo(Person o) {
        if (this.lastNameKana.equals(o.lastNameKana)) {
            return this.firstNameKana.compareTo(o.firstNameKana);
        } else {
            return this.lastNameKana.compareTo(o.lastNameKana);
        }
    }

    @Override
    public String toString() {
        return this.lastNameKana + " " + this.firstNameKana;
    }
}
