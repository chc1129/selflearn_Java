package to.msn.wings.selflearn.chap05;

import java.io.Serializable;

public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    public String title;
    public String url;
    public transient boolean expired;

    public Article(String title, String url, Boolean expired) {
        this.title = title;
        this.url = url;
        this.expired = expired;
    }

    public Article(String s, String s1) {
    }

    @Override
    public String toString() {
        return String.format("%s（%s）", this.title, this.url);
    }
}
