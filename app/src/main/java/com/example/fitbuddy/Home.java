package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Home extends MainActivity {
    public CardView chest , bicep , abs , leg , back , shoulder;

RecyclerView recyclerview;
Adapter adapter;
ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       chest = (CardView) findViewById(R.id.chest);
       bicep = (CardView) findViewById(R.id.BICEP);
       abs = (CardView) findViewById(R.id.abs);
       leg = (CardView) findViewById(R.id.leg);
       back = (CardView) findViewById(R.id.back);
       shoulder = (CardView) findViewById(R.id.shoulder);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Home.this , chest.class);
                startActivity(intent);
            }
        });

        bicep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Home.this , bicep.class);
                startActivity(intent);
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Home.this , abs.class);
                startActivity(intent);
            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Home.this , leg.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Home.this , back.class);
                startActivity(intent);
            }
        });
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Home.this , shoulder.class);
                startActivity(intent);
            }
        });

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_open, R.string.Menu_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){






































                    case  R.id.nav_FAQ:
                        Log.i("my_Drawer_Layout","Faq item is clicked");
                }
                return true;

            }
        });



    }
}