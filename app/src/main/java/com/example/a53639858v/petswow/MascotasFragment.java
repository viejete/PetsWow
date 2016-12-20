package com.example.a53639858v.petswow;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MascotasFragment extends Fragment {

    private ArrayList<String> nombreMascotas;
    private ArrayAdapter<String> adapter;
    View view;

    public MascotasFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mascotas, container, false);

        ListView lvMascotas = (ListView) view.findViewById(R.id.lvMascotas);

        nombreMascotas = new ArrayList<>();
        nombreMascotas.add("Prueba1");
        nombreMascotas.add("Prueba2");
        nombreMascotas.add("     Content largooooo      eqf                    wee");

        adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.lv_mascotas_row,
                R.id.txtViewMascota,
                nombreMascotas
        );

        lvMascotas.setAdapter(adapter);





        return view;
    }
}
