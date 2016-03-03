package cn.yangtaocun.androidsyntaxhighlighter;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dell on 2016/3/2.
 */
public abstract class SyntaxHighlighter {
    private List<SyntaxElement> mSyntaxElements;

    public SyntaxHighlighter() {
        mSyntaxElements = new ArrayList<SyntaxElement>();
        initSyntaxElements();
    }

    public void addSyntaxElement(SyntaxElement element) {
        mSyntaxElements.add(element);
    }

    public void highlight(TextView textview){
        SpannableString sp = new SpannableString(textview.getText());
        Iterator<SyntaxElement> it = mSyntaxElements.iterator();
        while(it.hasNext()){
            SyntaxElement element = it.next();
            //System.out.println(element.getRegex()+element.getColor());
            Pattern p = Pattern.compile(element.getRegex());
            Matcher m = p.matcher(sp);
            while(m.find()) {
                sp.setSpan(new ForegroundColorSpan(element.getColor()), m.start(), m.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        textview.setText(sp);
//        String regex = "(";
//        int counter = 0;
//        String[] reservedWords = new String[]{"super","int", "bool", "float", "string", "function", "class", "new", "this", "private", "public", "protected"};
//        for(String word : reservedWords) {
//            counter += 1;
//            regex += "\\b" + word;
//            if(counter < reservedWords.length) {
//                regex += "|";
//            }
//        }
//        regex += "\\s)";
//
//        //Log.d("reg",regex);
//

    }

    protected abstract void initSyntaxElements();
}
