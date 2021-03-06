package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        int box1 = Integer.parseInt(intent.getStringExtra("box1"));
        int box2 = Integer.parseInt(intent.getStringExtra("box2"));
        String operation = intent.getStringExtra("operation");

        if(operation.equals("add")){
            String newText = Integer.toString(box1+box2);
            textView2.setText(newText);
        }else if(operation.equals("sub")){
            String newText = Integer.toString(box1-box2);
            textView2.setText(newText);
        }else if(operation.equals("mult")) {
            String newText = Integer.toString(box1*box2);
            textView2.setText(newText);
        }else if(operation.equals("div")) {
            String newText = Integer.toString(box1/box2);
            textView2.setText(newText);
        }


    }
}