package com.blueeagle.logexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blueeagle.logexample.R;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_back);

        Button btnShowLog = (Button) findViewById(R.id.btnShowLog);
        final Logger log = LoggerFactory.getLogger(LogBackActivity.class);

        btnShowLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.trace("LogBack - This is trace log");
                log.debug("LogBack - This is debug log");
                log.info("LogBack - This is info log");
                log.warn("LogBack - This is warn log");
                log.error("LogBack - This is error log");
            }
        });
    }
}
