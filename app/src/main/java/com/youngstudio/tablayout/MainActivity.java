package com.youngstudio.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

     Context mContext;

     TabLayout mTabLayout;
     ViewPager mViewPager;

    ContentsPagerAdapter mContentPagerAdapter;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        mTabLayout = (TabLayout) findViewById(R.id.layout_tab);

        mTabLayout.addTab(mTabLayout.newTab().setText("홈"));
        //mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.add));
        mTabLayout.addTab(mTabLayout.newTab().setText("게임"));
        mTabLayout.addTab(mTabLayout.newTab().setText("영화"));
        mTabLayout.addTab(mTabLayout.newTab().setText("도서"));
        mTabLayout.addTab(mTabLayout.newTab().setText("뉴스스탠드"));


        mViewPager = (ViewPager) findViewById(R.id.pager);

        ContentsPagerAdapter pagerAdapter = new ContentsPagerAdapter(
                getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(pagerAdapter);

        //액션바에 제목이 자동표시 되지 않도록
        //getSupportActionBar().setDisplayShowTitleEnabled(false);



        mViewPager.addOnPageChangeListener(
                new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }
            @Override

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

        });


    }//oncreate


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    private View createTabView(String tabName) {
//        View tabView = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, null);
//        TextView txt_name = (TextView) tabView.findViewById(R.id.txt_name);
//        txt_name.setText(tabName);
//        return tabView;
//    }

}