package com.example.workwithactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.NoText);
        textView.setText(MainActivity.text2remember);
        Button button = findViewById(R.id.ButtonBack);

        button.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {

            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);}
        });
    }
}