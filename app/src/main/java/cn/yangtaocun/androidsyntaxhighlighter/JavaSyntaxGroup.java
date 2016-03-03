package cn.yangtaocun.androidsyntaxhighlighter;

import android.graphics.Color;

/**
 * Default Java Syntax Highlighter
 * Created by Tony Yang on 2016/3/2.
 */
public class JavaSyntaxGroup extends SyntaxHighlighter {
    @Override
    protected void initSyntaxElements() {
        // Classes
        addSyntaxElement(new SyntaxElement("\\b([A-Z]\\w*)",Color.rgb(118,0,0)));
        // Functions
        addSyntaxElement(new SyntaxElement("\\b([a-z]\\w*)",Color.rgb(158,72,0)));
        // Keywords
        addSyntaxElement(new SyntaxElement("\\b(public|super|int|float)", Color.rgb(46,0,118)));
        // Values
        addSyntaxElement(new SyntaxElement("\\b\".*\"\\s", Color.rgb(0,118,0)));
        addSyntaxElement(new SyntaxElement("\\b(-?\\\\d+)(\\\\.\\\\d+)?\\s", Color.rgb(0,118,0)));
        // Comments
        addSyntaxElement(new SyntaxElement("\\b\\\\.*", Color.rgb(118,118,118)));
        addSyntaxElement(new SyntaxElement("\\b/\\*.*\\*/\\s", Color.rgb(118,118,118)));
    }
}
