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
        JavaSyntaxGroup jsg = new JavaSyntaxGroup();
        jsg.highlight(tv);
    }
    
}
