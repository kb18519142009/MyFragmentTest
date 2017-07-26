package com.example.kangbai.myfragmenttest01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }
    protected void actionMainActivity(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
