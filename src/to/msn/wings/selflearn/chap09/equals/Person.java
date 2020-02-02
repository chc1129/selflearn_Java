package to.msn.wings.selflearn.chap09.equals;

public class Person {
    // 名前
    private String firstName;
    // 名字
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 名前/名字ともに等しければ同値とする
    @Override
    public boolean equals (Object obj) {
        // 同一性の判定
        if (this == obj) {
            return true;
        }
        // 同一値の判定
        if (obj instanceof Person) {
            var p = (Person)obj;
            return this.firstName.equals(p.firstName) &&
                    this.lastName.equals(p.lastName);
        }
        return false;
    }
}
