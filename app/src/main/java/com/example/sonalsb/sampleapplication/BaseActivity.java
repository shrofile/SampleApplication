package com.example.sonalsb.sampleapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BaseActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void setContentView(int layoutResID) {
        View chiledLayout = View.inflate(this, layoutResID, null);
        RelativeLayout baseActivityLayout = (RelativeLayout) View.inflate(this, R.layout.base_activity_layout, null);
        FrameLayout frameLayout = (FrameLayout) baseActivityLayout.findViewById(R.id.container);
        frameLayout.addView(chiledLayout);
        super.setContentView(baseActivityLayout);

        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

    }
}
