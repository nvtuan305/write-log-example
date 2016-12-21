package com.blueeagle.logexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blueeagle.logexample.R;

import hugo.weaving.DebugLog;

public class HugoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hugo);

        Button btnShowLog = (Button) findViewById(R.id.btnShowLog);

        btnShowLog.setOnClickListener(new View.OnClickListener() {
            @DebugLog
            @Override
            public void onClick(View view) {
                // TO-DO.....
            }
        });
    }
}
