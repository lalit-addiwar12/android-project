package com.example.lalit.buttonclickdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Integer num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view){

        textView = (TextView) findViewById(R.id.textViewHello);

        if (num==0){

            textView.setTextColor(Color.parseColor("#ff0000"));
            textView.setText("This is RED");
            num=1;

        }else{

            textView.setTextColor(Color.parseColor("#0000ff"));
            textView.setText("This is BLUE");
            num=0;

        }
    }
}
