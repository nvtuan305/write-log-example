package com.blueeagle.logexample.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blueeagle.logexample.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogback, btnHugo, btnTimber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogback = (Button) findViewById(R.id.btnLogBack);
        btnHugo = (Button) findViewById(R.id.btnHugo);
        btnTimber = (Button) findViewById(R.id.btnTimber);

        btnLogback.setOnClickListener(this);
        btnHugo.setOnClickListener(this);
        btnTimber.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = null;

        switch (id) {
            case R.id.btnLogBack:
                intent = new Intent(MainActivity.this, LogBackActivity.class);
                break;

            case R.id.btnHugo:
                intent = new Intent(MainActivity.this, HugoActivity.class);
                break;

            case R.id.btnTimber:
                intent = new Intent(MainActivity.this, TimberActivity.class);
                break;

            default:
                intent = null;
        }

        if (intent != null) startActivity(intent);
    }
}
