package com.example.android.californiathebest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<InfoOfPOI> museums = new ArrayList<>();
/*      museums.add(new InfoOfPOI("Golden Gate Bridge",R.drawable.golden_gate_bridge));
        museums.add(new InfoOfPOI("Hollywood Sign",R.drawable.hollywood_sign));
        museums.add(new InfoOfPOI("California State Capitol",R.drawable.california_state_capitol));
        museums.add(new InfoOfPOI("Walt Disney Concert Hall",R.drawable.walt_disney_concert_hall));
        museums.add(new InfoOfPOI("HP Garage",R.drawable.hp_garage));
        museums.add(new InfoOfPOI("Santa Monica Pier",R.drawable.santa_monica_pier));
        museums.add(new InfoOfPOI("Hollywood Walk of Fame",R.drawable.walk_of_fame));
        museums.add(new InfoOfPOI("Griffith Observatory",R.drawable.griffith_observatory));*/
        museums.add(new InfoOfPOI("San Francisco City Hall",R.drawable.san_francisco_city_hall));

        InfoOfPOIAdapter itemsAdapter = new InfoOfPOIAdapter(getActivity(),museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}