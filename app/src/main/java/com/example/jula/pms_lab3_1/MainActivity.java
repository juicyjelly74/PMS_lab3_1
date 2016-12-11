package com.example.jula.pms_lab3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startActivity1(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void startActivity2(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
    public void startActivity3(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }
    public void closeApplication(View view)
    {
        finish();
        System.exit(0);
    }
}
