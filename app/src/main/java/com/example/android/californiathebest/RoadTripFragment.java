package com.example.android.californiathebest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RoadTripFragment extends Fragment {
    public RoadTripFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<InfoOfPOI> roadTrip = new ArrayList<>();
/*      roadTrip.add(new InfoOfPOI("Golden Gate Bridge",R.drawable.golden_gate_bridge));
        roadTrip.add(new InfoOfPOI("Hollywood Sign",R.drawable.hollywood_sign));
        roadTrip.add(new InfoOfPOI("California State Capitol",R.drawable.california_state_capitol));
        roadTrip.add(new InfoOfPOI("Mission San Diego de Alcalá",R.drawable.mission_san_diego));
        roadTrip.add(new InfoOfPOI("Walt Disney Concert Hall",R.drawable.walt_disney_concert_hall));
        roadTrip.add(new InfoOfPOI("HP Garage",R.drawable.hp_garage));
        roadTrip.add(new InfoOfPOI("Santa Monica Pier",R.drawable.santa_monica_pier));
        roadTrip.add(new InfoOfPOI("Hollywood Walk of Fame",R.drawable.walk_of_fame));
        roadTrip.add(new InfoOfPOI("Griffith Observatory",R.drawable.griffith_observatory));*/
        roadTrip.add(new InfoOfPOI("San Francisco City Hall",R.drawable.san_francisco_city_hall));

        InfoOfPOIAdapter itemsAdapter = new InfoOfPOIAdapter(getActivity(),roadTrip);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}