package com.example.uts_d1041161017_steven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komponen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);
        Button button=(Button)findViewById(R.id.broadcast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://imamfarisi.com/membuat-broadcastreceiver-android/"));
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Komponen5.this, MainActivity.class));
        finish();
    }
}
