package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Objects;

public class HospitalTerminal extends AppCompatActivity {
    TabLayout  tabLayout;
    ViewPager2 viewpager2;
    private String[] titles= new String[]{"CAMPS","SCHEMES","ABOUT_US","REQUESTS"};

    ViewPagerMessengerAdapter viewPagerMessengerAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital_terminal);
        Objects.requireNonNull(getSupportActionBar()).hide();
        tabLayout = findViewById(R.id.tabLayout);
        viewpager2 = findViewById(R.id.viewpager);
        viewPagerMessengerAdapter = new ViewPagerMessengerAdapter(this);

        viewpager2.setAdapter(viewPagerMessengerAdapter);

        new TabLayoutMediator(tabLayout, viewpager2 , ((tab, position) -> tab.setText(titles[position]))).attach();

    }
}