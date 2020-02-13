package com.example.yhquzb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        button.setOnClickListener(v -> onclick(1));
        button1.setOnClickListener(v -> onclick(2));
        button2.setOnClickListener(v -> onclick(3));
        button3.setOnClickListener(v -> onclick(4));
        button4.setOnClickListener(v -> onclick(5));
        button5.setOnClickListener(v -> onclick(6));
        button6.setOnClickListener(v -> onclick(7));
        button7.setOnClickListener(v -> onclick(8));
    }

    private void initViews() {
        button = findViewById(R.id.jarima);
        button1 = findViewById(R.id.yhq);
        button2 = findViewById(R.id.yolbel);
        button3 = findViewById(R.id.yolchiziq);
        button4 = findViewById(R.id.nomer);
        button5 = findViewById(R.id.birinchi);
        button6 = findViewById(R.id.transfoyda);
        button7 = findViewById(R.id.danhodim);
    }

    private void onclick(int value) {
        Intent intent = new Intent(this, BoshActivitiy.class);
        intent.putExtra("Id", value);
        startActivity(intent);
    }
}
