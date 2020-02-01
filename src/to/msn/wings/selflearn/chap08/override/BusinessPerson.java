package to.msn.wings.selflearn.chap08.override;

public class BusinessPerson extends Person {
    public BusinessPerson() {}

    // 基底クラスの同名のメソッドをオーバーライド（上書き）
    @Override
    public String show() {
        return String.format("会社員の%s　(%d歳) です。", this.name, this.age);
    }

    public String work() {
        return String.format("%d歳の%sは、働きます。", this.age, this.name);
    }

}
