package com.wega.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.wega.android.R;

public class AActivity extends AppCompatActivity {

    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        TAG = this.getClass().getSimpleName();
        setTitle(TAG);
        Log.e("Activity",TAG+"=="+"onCreate");
    }

    public void toBActivity(View v){


        startActivity(new Intent(this,BActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity",TAG+"=="+"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activity",TAG+"=="+"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity",TAG+"=="+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity",TAG+"=="+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity",TAG+"=="+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity",TAG+"=="+"onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e("Activity",TAG+"=="+"onBackPressed");
    }


}
