package cn.yangtaocun.androidsyntaxhighlighter;

import android.graphics.Color;

/**
 * Created by dell on 2016/3/2.
 */
public class JavaSyntaxGroup extends SyntaxHighlighter {
    @Override
    protected void initSyntaxElements() {
        addSyntaxElement(new SyntaxElement("\\b([A-Z]\\w*)",Color.GREEN));
        addSyntaxElement(new SyntaxElement("\\b([a-z]\\w*)",Color.YELLOW));
        addSyntaxElement(new SyntaxElement("\\b(public|super)", Color.RED));
    }
}
