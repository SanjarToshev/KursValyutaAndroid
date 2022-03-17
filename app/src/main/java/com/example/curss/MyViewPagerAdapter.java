package com.example.curss;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.curss.fragment.DrugoeFragment;
import com.example.curss.fragment.GlavniyFragment;
import com.example.curss.fragment.KonverterFragment;
import com.example.curss.fragment.ObmennikiFragment;
import com.example.curss.fragment.ResursFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new GlavniyFragment();
            case 1:
                return new ObmennikiFragment();
            case 2:
                return new KonverterFragment();
            case 3:
                return new ResursFragment();
            case 4:
                return new DrugoeFragment();

        }


        return null;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
