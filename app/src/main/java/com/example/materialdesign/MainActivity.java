package com.example.materialdesign;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    ViewPagerAdapter Adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setActionBar(toolbar);
        viewPager=findViewById(R.id.pager);
        Adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(Adapter);
        tabLayout=findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }
}
