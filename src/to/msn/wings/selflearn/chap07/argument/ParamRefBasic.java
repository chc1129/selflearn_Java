package to.msn.wings.selflearn.chap07.argument;

import java.awt.*;

public class ParamRefBasic {

    public static void main(String[] args) {
        var data = new int[] { 2, 4, 6 };
        var p = new ParamRef();
        System.out.println(p.update(data)[0]);  // 結果:5
        System.out.println(data[0]);            // 結果:5
    }
}