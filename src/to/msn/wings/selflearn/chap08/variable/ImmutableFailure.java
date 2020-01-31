package to.msn.wings.selflearn.chap08.variable;

import java.util.Date;

public class ImmutableFailure {

    public static void main(String[] args) {
        var birth = new Date();
        var p = new Person("山田太郎", 30, birth);
        System.out.println(p.getBirth()); // 結果:Fri Jan 31 05:35:57 JST 2020
        // インスタンス化に際して渡したオブジェクトを更新(日付を変更)
        birth.setDate(15);
        System.out.println(p.getBirth()); // 結果:Wed Jan 15 05:35:57 JST 2020

//        var p = new Person("山田太郎", 30, new Date());
//        System.out.println(p.getBirth()); // 結果:Fri Jan 31 05:42:19 JST 2020
//        var birth = p.getBirth();
//        // ゲッター経由で取得したオブジェクトを更新（日付を変更）
//        birth.setDate(15);
//        System.out.println(p.getBirth()); // 結果:Wed Jan 15 05:42:19 JST 2020
    }
}
