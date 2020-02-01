package to.msn.wings.selflearn.chap08.delegation;

public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    // 四角形の面積を取得
    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
