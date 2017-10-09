package com.wega.android.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.wega.android.R;

public class BActivity extends AppCompatActivity {

    private String TAG;

    /**
     * 创建
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        TAG = this.getClass().getSimpleName();
        setTitle(TAG);
        if(savedInstanceState==null)
        {
            Log.e("Activity",TAG+"==onCreate");
        }else
        {
            String name = savedInstanceState.getString("name");
            Log.e("Activity",TAG+"==onCreate==name=="+name);
        }

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

    /**
     * 显示在最前端时
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity",TAG+"=="+"onResume");
    }

    /**
     * 暂停 不在最前端
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity",TAG+"=="+"onPause");
    }

    /**
     * 不可见
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity",TAG+"=="+"onStop");
    }

    /**
     * 销毁
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity",TAG+"=="+"onDestroy");
    }

    /**
     * 返回(系统返回键或者Toolbar的返回键)
     */
    @Override
    public void onBackPressed() {
        Log.e("Activity",TAG+"=="+"onBackPressed");
        super.onBackPressed();
    }

    /**
     * 手动结束Activity
     */
    @Override
    public void finish() {
        Log.e("Activity",TAG+"=="+"finish");
        super.finish();
    }

    /**
     * 结束Activity点击事件
     */
    public void finishB(View v){
        finish();
    }

    /**
     * 当应用遇到意外情况（如：内存不足）由系统销毁一个Activity时
     * 屏幕的方向发生了改变时
     * 保存Activity参数
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString("name", "save");//被摧毁前缓存一些数据
        super.onSaveInstanceState(outState);
        Log.e("Activity",TAG+"=="+"onSaveInstanceState");

    }

    /**
     * 重新打开时调用 获取onSaveInstanceState(Bundle outState)的outState
     * 进行重新赋值
     * @param savedInstanceState
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String name = savedInstanceState.getString("name");
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("Activity",TAG+"=="+"onRestoreInstanceState"+"==name=="+name);
    }

}
