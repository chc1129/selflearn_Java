package to.msn.wings.selflearn.chap10;

public class MethodRefUseBasic {

    public static void main(String[] args) {
        var data = new String[] {"春はあけぼの", "夏はよる", "秋は夕暮れ"};
        var u = new MethodRefUse();
        u.walkArray(data, MethodRefUse::addQuote);
    }
}
