package com.example.andreslauga.andreslaugaentregablematerialdesign;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ActivitySecundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        List<Restaurant> listaDeRestaurants = new ArrayList<>();
        listaDeRestaurants.add(new Restaurant(R.drawable.astridygaston));
        listaDeRestaurants.add(new Restaurant(R.drawable.borago));
        listaDeRestaurants.add(new Restaurant(R.drawable.central));
        listaDeRestaurants.add(new Restaurant(R.drawable.dom));
        listaDeRestaurants.add(new Restaurant(R.drawable.maido));
        listaDeRestaurants.add(new Restaurant(R.drawable.mani));
        listaDeRestaurants.add(new Restaurant(R.drawable.quintonil));
        listaDeRestaurants.add(new Restaurant(R.drawable.tegui));

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        AdapterViewPager adapterViewPager = new AdapterViewPager(getSupportFragmentManager(), listaDeRestaurants);
        viewPager.setAdapter(adapterViewPager);
    }
}
