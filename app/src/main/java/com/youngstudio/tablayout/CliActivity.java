package com.youngstudio.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class CliActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cli);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //액션바에 제목이 자동표시 되지 않도록
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Intent intent= getIntent();
        String msg1= intent.getStringExtra("msg1");
        String msg2= intent.getStringExtra("msg2");
        String msg3= intent.getStringExtra("msg3");

        int imgId= intent.getIntExtra("Img", R.drawable.bg_one01);

        //name을 액션바에 title로 설정
        //getSupportActionBar().setTitle(name);

        //imgId를 이미지뷰에 보여주기
        iv= findViewById(R.id.iv);
        Glide.with(this).load(imgId).into(iv);

        //iv에게 Transition(전환)의 Pair를 위한 이름 부여
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            iv.setTransitionName("IMG");
        }




    }//onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionclick, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
