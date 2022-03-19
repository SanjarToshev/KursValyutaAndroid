package com.example.curss.fragment;




import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.curss.MyAdapter;
import com.example.curss.R;
import com.example.curss.R;


public class GlavniyFragment extends Fragment {

    private View mView;

    int images[] = {R.drawable.usa, R.drawable.rus, R.drawable.eur, R.drawable.tryk, R.drawable.kzt, R.drawable.cny, R.drawable.zar};

    private RecyclerView recyclerView;

    String s1[], s2[];





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(com.example.curss.R.layout.fragment_glavniy, container, false);
        recyclerView = mView.findViewById(R.id.recyclerView);


        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        s1 = getResources().getStringArray(R.array.currencies);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(requireContext(), s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

    }
}