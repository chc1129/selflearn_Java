package to.msn.wings.selflearn.chap05;

import java.io.OutputStream;

public class StrSplit {

    public static void main(String[] args) {
        var str1 = "うめ,もも,さくら";
        var result1 = str1.split(",");
        System.out.println(String.join("&", result1)); // 結果:うめ&もも&さくら

        var str2 = "うめ,もも,さくらとあんず";
        var result2 = str2.split("[,と]");
        System.out.println(String.join("&", result2)); // 結果:うめ&もも&さくら&あんず

        var str3 = "うめ,もも,さくら";
        var result3 = str3.split("");
        System.out.println(String.join("&", result3)); // 結果:う&め&,&も&も&,&さ&く&ら

        var str4 = "うめ,もも,さくら,あんず";
        var result4 = str4.split(",", 3);
        System.out.println(String.join("&", result4)); // 結果:うめ&もも&さくら,あんず

        System.out.println(String.join(",", "うめ", "もも", "さくら"));
        // 結果:うめ,もも,さくら
    }
}
