package com.wega.android.fragment;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wega.android.R;

import java.util.List;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener {

    private String LOG_TAG="Frag+Frame";

    private FragmentManager mManager;
    private OneFragment mOneFragment;
    private String TAG;
    private int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        mManager = getSupportFragmentManager();
        TAG = this.getClass().getSimpleName();
        if (savedInstanceState == null) {
            Log.e(LOG_TAG, TAG + "==onCreate");
        } else {

            String name = savedInstanceState.getString("name");
            Log.e(LOG_TAG, TAG + "==onCreate==name==" + name);
        }
        findViewById(R.id.add).setOnClickListener(this);
        findViewById(R.id.remove).setOnClickListener(this);
        findViewById(R.id.replace).setOnClickListener(this);
        findViewById(R.id.log).setOnClickListener(this);
        findViewById(R.id.show).setOnClickListener(this);
        findViewById(R.id.hide).setOnClickListener(this);
        findViewById(R.id.attach).setOnClickListener(this);
        findViewById(R.id.detach).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add:
                add();
                break;
            case R.id.remove:
                remove();
                break;
            case R.id.replace:
                replace();
                break;
            case R.id.show:
                show();
                break;
            case R.id.hide:
                hide();
                break;
            case R.id.log:
                getFragmentList();
                break;
            case R.id.attach:
                attach();
                break;
            case R.id.detach:
                detach();
                break;
        }
    }



    private void add() {

        OneFragment oneFragment = OneFragment.newInstance("" + num++);
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.fl_container, oneFragment, "one");
        transaction.commit();
    }


    private void remove(){
        Fragment fragmentById = mManager.findFragmentById(R.id.fl_container);
        FragmentTransaction transaction = mManager.beginTransaction();
        if(fragmentById!=null)
        {
            transaction.remove(fragmentById);
        }
        transaction.commit();
    }


    private void replace() {

        if (mOneFragment == null) {
            mOneFragment = new OneFragment();
        }
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.replace(R.id.fl_container, mOneFragment);
        transaction.commit();

    }


    private void show() {
        Fragment fragmentById = mManager.findFragmentById(R.id.fl_container);
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.show(fragmentById);
        transaction.commit();
    }


    private void hide() {
        Fragment fragmentById = mManager.findFragmentById(R.id.fl_container);
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.hide(fragmentById);
        transaction.commit();
    }

    private void attach() {
        Fragment fragmentById = mManager.findFragmentById(R.id.fl_container);
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.attach(fragmentById);
        transaction.commit();
    }

    private void detach() {
        Fragment fragmentById = mManager.findFragmentById(R.id.fl_container);
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.detach(fragmentById);
        transaction.commit();
    }

    private void getFragmentList() {
        Fragment fragment = mManager.findFragmentById(R.id.fl_container);
        Fragment fragment1 = mManager.findFragmentByTag("one");
        if (fragment != null) {
            Log.e("fragment", "findFragmentById=" + fragment.toString());
        }

        if (fragment1 != null) {
            Log.e("fragments1", "findFragmentByTag=" + fragment1.toString());
        }

        List<Fragment> fragments = mManager.getFragments();
        if (fragments == null) {
            return;
        }

        for (int i = 0; i < fragments.size(); i++) {

            if (fragments.get(i) == null) {
                Log.e("fragments", "null");
            } else {
                Log.e("fragments", fragments.get(i).toString());
            }

        }
        Log.e("fragments", "==========");

    }

}
