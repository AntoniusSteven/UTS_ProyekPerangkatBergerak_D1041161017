package com.example.uts_d1041161017_steven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void komponen1(View view) {
        startActivity(new Intent(MainActivity.this, Komponen1.class));
        finish();
    }

    public void komponen2(View view) {
        startActivity(new Intent(MainActivity.this, komponen2.class));
        finish();
    }

    public void komponen3(View view) {
        startActivity(new Intent(MainActivity.this, komponen3.class));
        finish();
    }

    public void komponen4(View view) {
        startActivity(new Intent(MainActivity.this, Komponen4.class));
        finish();
    }

    public void komponen5(View view) {
        startActivity(new Intent(MainActivity.this, Komponen5.class));
        finish();
    }
}
