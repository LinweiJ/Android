package com.wega.android.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wega.android.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {


    private String TAG;
    private String LOG_TAG="Frag+Frame";
    private String mTag1;

    public OneFragment() {
        TAG =this.getClass().getSimpleName();
        Bundle arguments = getArguments();
        if(arguments!=null)
        {
            mTag1 = arguments.getString("tag");
        }
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"OneFragment");
    }

    public static OneFragment newInstance(String tag) {

        Bundle args = new Bundle();
        args.putString("tag",tag);
        OneFragment fragment = new OneFragment();
        fragment.setArguments(args);
        return fragment;
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if(arguments!=null)
        {
            mTag1 = arguments.getString("tag");
        }
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null)
        {
            Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onCreate"+"=="+savedInstanceState.getString("name"));
        }
        Bundle arguments = getArguments();
        if(arguments!=null)
        {
            mTag1 = arguments.getString("tag");
        }
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TAG =this.getClass().getSimpleName();
        Bundle arguments = getArguments();
        if(arguments!=null)
        {
            mTag1 = arguments.getString("tag");
        }
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onCreateView");
        View inflate = inflater.inflate(R.layout.fragment_one, container, false);
        TextView viewById = (TextView) inflate.findViewById(R.id.tv_hashcode);
        viewById.setText(this.toString()+"tag=="+mTag1);
        return inflate;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onResume");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onStop");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onDestroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onDetach");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("name", "save");
        super.onSaveInstanceState(outState);

        Log.e(LOG_TAG, TAG +"=="+mTag1+"=="+"onSaveInstanceState"+"=="+outState.getString("name"));
    }



}
