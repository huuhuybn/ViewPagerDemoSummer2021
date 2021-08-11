package com.poly.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {
    private TabLayout tabs;
    private ViewPager pAGES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tabs = findViewById(R.id.tabs);
        pAGES = findViewById(R.id.pAGES);
        DemoPagerAdapter demoPagerAdapter = new DemoPagerAdapter(getSupportFragmentManager());
        pAGES.setAdapter(demoPagerAdapter);

        tabs.setupWithViewPager(pAGES);

    }
}