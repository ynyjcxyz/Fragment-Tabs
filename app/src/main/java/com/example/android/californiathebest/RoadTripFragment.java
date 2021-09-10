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
        roadTrip.add(new InfoOfPOI("Pacific Coast Highway",
                "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2014/12/4/pacific-coast-highway-bixby-bridge.jpg.rend.hgtvcom.616.462.suffix/1491584559734.jpeg"));
        roadTrip.add(new InfoOfPOI("Eastern Sierra Scenic Byway",
                "https://images.squarespace-cdn.com/content/v1/5ca3e1daca525b6d60ba7012/1556851700460-VV4LEDMLNF2M2UNZRIFP/image-asset.jpeg?format=2500w"));
        roadTrip.add(new InfoOfPOI("Route 66",
                "https://roadtrippingcalifornia.com/wp-content/uploads/2020/09/Historic-Route-66-Mojave-Desert.jpg"));
        roadTrip.add(new InfoOfPOI("Gold Country and California Highway 49",
                "https://drupal8-prod.visitcalifornia.com/sites/drupal8-prod.visitcalifornia.com/files/styles/fluid_1200/public/VCW_SI_T1_JohnMenard_1280x642.jpg?itok=cxO-hIPh"));
        roadTrip.add(new InfoOfPOI("Avenue of the Giants",
                "https://i0.wp.com/activenorcal.com/wp-content/uploads/2019/05/Screen-Shot-2019-05-21-at-5.31.38-AM.png?fit=1072%2C594&ssl=1"));
        roadTrip.add(new InfoOfPOI("Trinity Scenic Byways",
                "https://i1.wp.com/visittrinity.com/wp-content/uploads/2013/06/roadbiking.jpg?resize=550%2C200&ssl=1"));
        roadTrip.add(new InfoOfPOI("The Mission Trail",
                "https://static.onecms.io/wp-content/uploads/sites/24/2008/09/trmosa041078516r-2000.jpg"));
        roadTrip.add(new InfoOfPOI("Napa Valley",
                "https://cdn.vox-cdn.com/thumbor/Od8dYZeYqGRog2ntUZ1W4EdOLPk=/5x0:747x557/1200x800/filters:focal(5x0:747x557)/cdn.vox-cdn.com/uploads/chorus_image/image/49150393/Screen_Shot_2016-03-23_at_2.12.29_PM.0.0.png"));
        roadTrip.add(new InfoOfPOI("Gold Chain Highway (Highway 49)",
                "https://cdn.elebase.io/29559e61-1a75-4e70-a155-f8688960c1c1/98c735c3-235f-4999-bff9-92a4cc0dccdd-sie7cc9e4713fce27f4e.jpg?w=680&h=382&fit=crop&rot=auto&dpr=2&q=75"));
        roadTrip.add(new InfoOfPOI("Rim of the World Scenic Byway (State Highway 18)",
                "https://drupal8-prod.visitcalifornia.com/sites/drupal8-prod.visitcalifornia.com/files/styles/fluid_1200/public/VC_California101_InlandEmpire_SilverwoodLake_Stock_RF_GHJDJN_1280x640.jpg?itok=JO7HU8e-"));
/*        roadTrip.add(new InfoOfPOI("Golden Gate Bridge",R.drawable.golden_gate_bridge));
        roadTrip.add(new InfoOfPOI("Hollywood Sign",R.drawable.hollywood_sign));
        roadTrip.add(new InfoOfPOI("California State Capitol",R.drawable.california_state_capitol));
        roadTrip.add(new InfoOfPOI("Mission San Diego de Alcalá",R.drawable.mission_san_diego));
        roadTrip.add(new InfoOfPOI("Walt Disney Concert Hall",R.drawable.walt_disney_concert_hall));
        roadTrip.add(new InfoOfPOI("HP Garage",R.drawable.hp_garage));
        roadTrip.add(new InfoOfPOI("Santa Monica Pier",R.drawable.santa_monica_pier));
        roadTrip.add(new InfoOfPOI("Hollywood Walk of Fame",R.drawable.walk_of_fame));
        roadTrip.add(new InfoOfPOI("Griffith Observatory",R.drawable.griffith_observatory));
        roadTrip.add(new InfoOfPOI("San Francisco City Hall",R.drawable.san_francisco_city_hall));*/

        InfoOfPOIAdapter itemsAdapter = new InfoOfPOIAdapter(getActivity(),roadTrip);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}