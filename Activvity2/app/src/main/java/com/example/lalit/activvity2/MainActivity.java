package com.example.lalit.activvity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button1);
    }

    /**
    @Override
    protected void onStart() {
        super.onStart();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    */

    @Override
    protected void onPostResume() {
        super.onPostResume();
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,SecondActivity.class);
              startActivity(intent);
             }
        });
    }
}
