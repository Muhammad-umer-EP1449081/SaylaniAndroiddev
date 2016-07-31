package com.example.mt_2015.app231_7_2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showtoast(View v)
    {

        TextView tv = (TextView) findViewById(R.id.editText_name);
         String name1=tv.getText().toString() ;

        TextView Dftext = (TextView) findViewById(R.id.defaulttext);
        Dftext.setText(name1);



        Toast toast =Toast.makeText(this,tv.getText(), Toast.LENGTH_LONG);
        toast.show();



    }

}
