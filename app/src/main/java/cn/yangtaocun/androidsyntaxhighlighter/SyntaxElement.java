package cn.yangtaocun.androidsyntaxhighlighter;

/**
 * Created by dell on 2016/3/2.
 */
public class SyntaxElement {
    private String regex;
    private int color;

    public SyntaxElement(String regex, int color) {
        this.regex = regex;
        this.color = color;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
