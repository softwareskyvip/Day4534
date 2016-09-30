package com.sk.sunkun.day453;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        int a = 9;
        int b= 6;

    }

    private void initData() {
    }

    private void initView() {
    }

    public void second(View view) {
        Intent it = new Intent(this,SecondActivity.class);
        startActivity(it);
    }
}
