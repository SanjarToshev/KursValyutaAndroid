package com.example.curss.fragment;


import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.curss.R;
import com.example.curss.R;


public class GlavniyFragment extends Fragment {

    private View mView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(com.example.curss.R.layout.fragment_glavniy, container, false);

        return mView;
    }
}