package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.calculator.MainActivity2;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view){

        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);

        String box1 = firstNumberText.getText().toString();
        String box2 = secondNumberText.getText().toString();

        gotToActivity("add", box1, box2);
    }

    public void subFunction(View view){

        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);

        String box1 = firstNumberText.getText().toString();
        String box2 = secondNumberText.getText().toString();

        gotToActivity("sub", box1, box2);
    }

    public void multFunction(View view){

        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);

        String box1 = firstNumberText.getText().toString();
        String box2 = secondNumberText.getText().toString();

        gotToActivity("mult", box1, box2);
    }

    public void divFunction(View view){

        EditText firstNumberText = (EditText) findViewById(R.id.firstNumberText);
        EditText secondNumberText = (EditText) findViewById(R.id.secondNumberText);

        String box1 = firstNumberText.getText().toString();
        String box2 = secondNumberText.getText().toString();

        gotToActivity("div", box1, box2);
    }

    public void gotToActivity(String operation, String box1, String box2){

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("operation", operation);
        intent.putExtra("box1", box1);
        intent.putExtra("box2", box2);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}