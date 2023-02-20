package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
//import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int i=0;
    int m=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        RelativeLayout layout = findViewById(R.id.ll_example);

        btn.setOnClickListener(view -> {
            TextView textView1 = new TextView(getApplicationContext());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
            layoutParams.topMargin = m + 50;
            m+=50;
            String str = "Hello world";
            textView1.setText(str);
            btn.setText(String.valueOf(i++));
            layout.addView(textView1,layoutParams);
        });

    }

}