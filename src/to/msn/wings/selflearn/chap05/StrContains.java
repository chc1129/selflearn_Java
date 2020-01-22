package to.msn.wings.selflearn.chap05;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class StrContains {

    public static void main(String[] args) {
        var str = "WINGSプロジェクト";

        System.out.println(str.contains("プロ")); // 結果:true
        System.out.println(str.startsWith("WINGS")); // 結果:true
        System.out.println(str.startsWith("WINGS", 3)); // 結果:false
        System.out.println(str.endsWith("WINGS")); // 結果:false


    }
}
