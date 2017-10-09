package com.wega.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wega.android.activity.AActivity;

public class MainActivity extends AppCompatActivity {
    private String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG = this.getClass().getSimpleName();
        setTitle(TAG);
        findViewById(R.id.btn_aactivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AActivity.class));
            }
        });
    }
}
