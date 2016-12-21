package com.blueeagle.logexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blueeagle.logexample.R;

import timber.log.Timber;

public class TimberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timber);

        final Button btnShowLog = (Button) findViewById(R.id.btnShowLog);

        // Set tag
        Timber.tag("TimberActivity");
        Timber.d("Timber Activity is created");

        btnShowLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Log
                Timber.d("Timber - This is debug log");
                Timber.i("Timber - A button with ID %s was clicked to say '%s'.", btnShowLog.getId(), btnShowLog.getText());
                Timber.w("Timber - This is warming log");
                Timber.e("Timber - This is error log");
                Timber.v("Timber - This is verbose log");
            }
        });
    }
}
