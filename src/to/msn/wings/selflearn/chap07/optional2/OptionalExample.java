package to.msn.wings.selflearn.chap07.optional2;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        // Optionalオブジェクトを生成
        var opt1 = Optional.of("サンプル1");
        var opt2 = Optional.ofNullable(null);
        var opt3 = Optional.empty();

        // 値が存在するか
        System.out.println(opt1.isPresent()); // 結果:true

        // 値が存在する場合はらラムダ式を実行
        opt1.ifPresent(value -> {
            System.out.println(value); // 結果:サンプル1
        });

        // opt2の値が存在する場合はそれを,nullの場合は引数値を表示
        System.out.println(opt2.orElse("null値です")); // 結果:null値です

        // opt3がnull値の場合はラムダ式を実行
        System.out.println(opt3.orElseGet(() -> {
            return "null値です";   // 結果:null値です
        }));
    }
}
