package com.example.andreslauga.andreslaugaentregablematerialdesign;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreslauga on 6/15/17.
 */

public class AdapterViewPager extends FragmentStatePagerAdapter {

    private List<Fragment> listaDeFragments = new ArrayList<>();

    public AdapterViewPager(FragmentManager fm, List<Restaurant> listaDeRestaurants) {
        super(fm);
        for (Restaurant restaurant : listaDeRestaurants) {
            listaDeFragments.add(FragmentFotos.fabricaDeFragmentsDeFotos(restaurant.getImagen()));
        }
    }

    @Override
    public Fragment getItem(int position) {
        return this.listaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return this.listaDeFragments.size();
    }
}
