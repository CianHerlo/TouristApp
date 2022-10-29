package com.example.tourist_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Initialise Main Activity Layout

        TabLayout tabs = findViewById(R.id.tabLayout); // Initialise Tab Layout

        // Fragment Manager handles which fragment to start in Main and inflate correct fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, new Fragment1());
        fragmentTransaction.commit();

        // Switching Tabs is handled using switch case statement to inflate correct Tab
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0: // Home
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new Fragment1())
                                .commit();
                        break;
                    case 1: // Activities
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new Fragment2())
                                .commit();
                        break;
                    case 2: // Refreshments
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, new Fragment3())
                                .commit();
                        break;


                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }}