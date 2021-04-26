package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int number = 0;
    Button button;
    Button resetBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.incrementbtn);
        resetBtn = findViewById(R.id.resetbtn);
        textView = findViewById(R.id.number);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;
                textView.setText(Integer.toString(number));
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = 0;
                textView.setText("0");
            }
        });
    }
}