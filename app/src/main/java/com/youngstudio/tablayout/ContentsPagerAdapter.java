package com.youngstudio.tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class ContentsPagerAdapter  extends FragmentStatePagerAdapter {

    Fragment[] fragments= new Fragment[5];


    int count;

    public ContentsPagerAdapter(@NonNull FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Page1Fragment1 Fragment1 = new Page1Fragment1();
                return Fragment1;
            case 1:
                Page1Fragment2 Fragment2 = new Page1Fragment2();
                return Fragment2;
            case 2:
                Page1Fragment3 Fragment3 = new Page1Fragment3();
                return Fragment3;
            case 3:
                Page1Fragment4 Fragment4 = new Page1Fragment4();
                return Fragment4;
            case 4:
                Page1Fragment5 Fragment5 = new Page1Fragment5();
                return Fragment5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }




}
