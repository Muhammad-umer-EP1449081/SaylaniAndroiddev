package com.example.mt_2015.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout li = new LinearLayout(this);
        TextView tv = new TextView(this);
        li.setOrientation(LinearLayout.VERTICAL);
        tv.setText(" world");
        tv.setPadding(20,10,30,30);
        li.addView(tv);

        setContentView(li);

    }
}
