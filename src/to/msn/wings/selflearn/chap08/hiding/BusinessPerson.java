package to.msn.wings.selflearn.chap08.hiding;

import java.time.LocalDateTime;

public class BusinessPerson extends Person {
    // 基底クラスのフィールドを隠蔽
    public LocalDateTime birth = LocalDateTime.now();

    public void show() {
        System.out.println(super.birth);
    }
}
