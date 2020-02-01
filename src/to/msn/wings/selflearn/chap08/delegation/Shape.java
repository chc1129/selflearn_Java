package to.msn.wings.selflearn.chap08.delegation;

//public class Shape {
public abstract class Shape {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 図形の面積を取得（派生クラスでオーバーライドするので、中身はダミー）
//    public double getArea() {
//        return 0d;
//    }
    public abstract double getArea();
}
