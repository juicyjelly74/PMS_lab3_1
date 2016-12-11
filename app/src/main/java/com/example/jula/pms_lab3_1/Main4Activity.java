package com.example.jula.pms_lab3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void changeBackground(View v) {
        Button btnTab1 = (Button) findViewById(R.id.button18);
        btnTab1.setBackgroundResource(R.drawable.backround);
    }
}
