package com.example.android.californiathebest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class NationalParksFragment extends Fragment {
    public NationalParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<InfoOfPOI> nationalParks = new ArrayList<>();
        nationalParks.add(new InfoOfPOI("Yosemite National Park",
                "https://www.history.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTU3ODc4NjAwMjkxNzIyNTY5/yosemite-3.jpg"));
        nationalParks.add(new InfoOfPOI("Death Valley National Park",
                "https://national-park.com/wp-content/uploads/2016/04/Welcome-to-Death-Valley-National-Park.jpg"));
        nationalParks.add(new InfoOfPOI("Redwood National Park",
                "https://national-park.com/wp-content/uploads/2016/04/Welcome-to-Redwood-National-Park.jpg"));
        nationalParks.add(new InfoOfPOI("Joshua Tree National Park",
                "https://koa.com/blog/images/joshua-tree-national-park-california.png?preset=blogPhoto"));
        nationalParks.add(new InfoOfPOI("Sequoia and Kings Canyon National Parks",
                "https://drupal8-prod.visitcalifornia.com/sites/drupal8-prod.visitcalifornia.com/files/styles/fluid_1200/public/vc_ca101_nationalparks_sequoiakingsnationalparks_rf_673066812_1280x640.jpg?itok=EVBZ0WOL"));
        nationalParks.add(new InfoOfPOI("Pinnacles National Park",
                "https://www.justchasingsunsets.com/wp-content/uploads/2020/03/Pinnacles-national-park-3-1024x683.jpg"));
        nationalParks.add(new InfoOfPOI("Lassen Volcanic National Park",
                "https://www.visitcalifornia.com/sites/visitcalifornia.com/files/vc_spotlight_lassenvolcanicnationalpark_st_rf_112719648_1280x640.jpg"));
        nationalParks.add(new InfoOfPOI("Channel Islands National Park",
                "https://www.adventurousway.com/images/i/58l9tl9ff5c7/1200w/national-parks/channel-islands-national-park/channel-islands-national-park.jpeg"));
        nationalParks.add(new InfoOfPOI("Point Reyes National Seashore",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Chimney_Rock_Trail_Point_Reyes_December_2016_panorama_1.jpg/1200px-Chimney_Rock_Trail_Point_Reyes_December_2016_panorama_1.jpg"));
        nationalParks.add(new InfoOfPOI("Devils Postpile National Monument",
                "https://www.visitmammoth.com/wp-content/uploads/Devils-Postpile.jpg"));
/*        nationalParks.add(new InfoOfPOI("Golden Gate Bridge",R.drawable.golden_gate_bridge));
        nationalParks.add(new InfoOfPOI("Hollywood Sign",R.drawable.hollywood_sign));
        nationalParks.add(new InfoOfPOI("California State Capitol",R.drawable.california_state_capitol));
        nationalParks.add(new InfoOfPOI("Mission San Diego de Alcalá",R.drawable.mission_san_diego));
        nationalParks.add(new InfoOfPOI("Walt Disney Concert Hall",R.drawable.walt_disney_concert_hall));
        nationalParks.add(new InfoOfPOI("HP Garage",R.drawable.hp_garage));
        nationalParks.add(new InfoOfPOI("Santa Monica Pier",R.drawable.santa_monica_pier));
        nationalParks.add(new InfoOfPOI("Hollywood Walk of Fame",R.drawable.walk_of_fame));
        nationalParks.add(new InfoOfPOI("Griffith Observatory",R.drawable.griffith_observatory));
        nationalParks.add(new InfoOfPOI("San Francisco City Hall",R.drawable.san_francisco_city_hall));*/

        InfoOfPOIAdapter itemsAdapter = new InfoOfPOIAdapter(getActivity(),nationalParks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebViewUrl webUrl = new WebViewUrl();
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 0)));
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 1)));
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 2)));
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 3)));
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 4)));
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 5)));
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 6)));
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 7)));
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 8)));
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(1, 9)));
                        startActivity(intent9);
                        break;
                }
            }
        });
        return rootView;
    }
}