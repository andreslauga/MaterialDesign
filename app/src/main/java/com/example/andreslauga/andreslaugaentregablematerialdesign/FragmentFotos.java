package com.example.andreslauga.andreslaugaentregablematerialdesign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentFotos extends Fragment {

    private Integer imagen;
    public static final String CLAVE_IMAGEN = "claveImagen";

    public static FragmentFotos fabricaDeFragmentsDeFotos(Integer imagen) {
        Bundle bundle = new Bundle();
        bundle.putInt(CLAVE_IMAGEN, imagen);
        FragmentFotos fragmentFotos = new FragmentFotos();
        fragmentFotos.setArguments(bundle);
        return fragmentFotos;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        imagen = bundle.getInt(CLAVE_IMAGEN);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fotos, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(imagen);
        return view;
    }


}
