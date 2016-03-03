package cn.yangtaocun.androidsyntaxhighlighter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        tv.setText("public LightTextView(Context context, AttributeSet attrs) { //new func \n" +
                "        super(context, attrs);\n" +
                "        String s = \"yes\"; //yes\n" +
                "        int i = 1;\n" +
                "float f = -2.33;" +
                "        TypedArray mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.LightTextView);\n" +
                "        init(mTypedArray);\n" +
                "    }");
        JavaSyntaxGroup jsg = new JavaSyntaxGroup();
        jsg.highlight(tv);
    }
    
}
