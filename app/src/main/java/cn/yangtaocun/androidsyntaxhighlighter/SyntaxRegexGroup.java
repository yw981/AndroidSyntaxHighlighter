package cn.yangtaocun.androidsyntaxhighlighter;

/**
 * Created by dell on 2016/1/2.
 */
public abstract class SyntaxRegexGroup {
    protected String mRegexComment = null;
    protected String mRegexKeyword = null;

    public SyntaxRegexGroup(){
        initRegex();
    }

    protected abstract void initRegex();


}
