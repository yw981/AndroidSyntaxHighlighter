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
        addSyntaxElement(new SyntaxElement("\\b([a-z]\\w*)",Color.parseColor("#795DA3")));
        // Keywords
        addSyntaxElement(new SyntaxElement("\\b(abstract|assert|boolean|break|byte|case|catch" +
                "char|class|const|continue|default|do|double|else|" +
                "enum|extends|final|finally|float|" +
                "for|goto|if|implements|import|" +
                "instanceof|int|interface|long|native|" +
                "new|package|private|protected|public|" +
                "return|strictfp|short|static|super|" +
                "switch|synchronized|this|throw|throws|" +
                "transient|try|void|volatile|while)", Color.parseColor("#A71D5D")));
        // Values
        addSyntaxElement(new SyntaxElement("\".*\"", Color.parseColor("#0086B3")));
        addSyntaxElement(new SyntaxElement("(-?\\d+)(\\.\\d+)?", Color.parseColor("#0086B3")));
        // Comments
        addSyntaxElement(new SyntaxElement("//.*\\s", Color.parseColor("#969896")));
        addSyntaxElement(new SyntaxElement("/\\*.*\\*/", Color.parseColor("#969896")));
    }
}
