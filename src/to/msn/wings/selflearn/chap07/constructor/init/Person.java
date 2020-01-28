package to.msn.wings.selflearn.chap07.constructor.init;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Person {
    public String name;
    public int age;
    public LocalDateTime updated;

    // 初期化ブロック
    {
        this.updated = LocalDateTime.now();
    }

    // 姓／名, 誕生日から初期化
    public Person(String firstName, String lastName, LocalDate birth) {
        this.name = lastName + " " + firstName;
        this.age = Period.between(birth, LocalDate.now()).getYears();
    }

    // 名前, 年齢から初期化
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
