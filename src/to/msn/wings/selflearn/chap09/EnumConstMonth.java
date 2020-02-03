package to.msn.wings.selflearn.chap09;

public class EnumConstMonth {
    // 月を表すための定数群
    public final static int JANURAY = 0;
    public final static int FEBRUARY = 1;
    public final static int MARCH = 2;
    public final static int APRIL = 3;
    public final static int MAY = 4;
    public final static int JUNE = 5;
    public final static int JULY = 6;
    public final static int AUGUST = 7;
    public final static int SEPTEMBER = 8;
    public final static int OCTOBER = 9;
    public final static int NOVENBER = 10;
    public final static int DECEMBER = 11;

    public static void main(String[] args) {
        var ecs = new EnumConstSeason();
        ecs.processSeason(EnumConstMonth.JANURAY);
    }
}
