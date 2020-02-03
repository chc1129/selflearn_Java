package to.msn.wings.selflearn.chap09.member;

public enum  Season {
    //  SPRING(0, "春"),
    //  SUMMER(1, "夏"),
    //  AUTUMN(2, "秋"),
    //  WINTER(4, "冬");

    // 列挙定数
    SPRING(0, "春") {
        @Override
        public void show() {
            System.out.println("春はあけぼの");
        }
    },
    SUMMER(1, "夏") {
        @Override
        public void show() {
            System.out.println("夏は夜");
        }
    },
    AUTUMN(2, "秋") {
        @Override
        public void show() {
            System.out.println("秋は夕暮れ");
        }
    },
    WINTER(4, "冬") {
        @Override
        public void show() {
            System.out.println("冬はつとめて");
        }
    };

    // フィールド宣言
    private int code;       // 季節コード
    private String jpName;  // 表示名

    // コンストラクター
    private Season(int code, String jpName) {
        this.code = code;
        this.jpName = jpName;
    }

    // メソッド
    public int toSeasonValue() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.jpName;
    }

    // 列挙定数が実装するべき機能（抽象メソッド）
    public abstract void show();
}
