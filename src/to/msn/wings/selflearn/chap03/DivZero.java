package to.msn.wings.selflearn.chap03;

public class DivZero {

    public static void main(String[] args) {
        //System.out.println(5 / 0); // エラー
        //System.out.println(5 %  0); // エラー
        System.out.println(5d / 0); // Infinity(無限大)
        System.out.println(5d % 0); // NaN (Not a Number: 非数)
    }
}
