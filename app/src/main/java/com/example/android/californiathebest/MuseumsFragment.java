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
        museums.add(new InfoOfPOI("The Getty Center",
                "https://www.travelcaffeine.com/wp-content/uploads/2017/03/getty-center-los-angeles-california-art-museum-722.jpg"));
        museums.add(new InfoOfPOI("USS Midway Museum",
                "https://www.thelog.com/wp-content/uploads/2015/07/USSMidway_021513-700x445.jpg"));
        museums.add(new InfoOfPOI("The Hess Collection Winery & Art Museum",
                "https://www.sftravel.com/sites/sftravel.prod.acquia-sites.com/files/parters/images/P0045093_1_20140211133712.JPG"));
        museums.add(new InfoOfPOI("California State Railroad Museum",
                "https://www.visitcalifornia.com/sites/visitcalifornia.com/files/CARailroadMuseum_1280x642.jpg"));
        museums.add(new InfoOfPOI("The Getty Villa",
                "https://media-cdn.tripadvisor.com/media/photo-s/15/aa/de/7d/at-the-getty-villa-pacific.jpg"));
        museums.add(new InfoOfPOI("Rosicrucian Egyptian Museum",
                "https://egyptianmuseum.org/uploads/feature-boxes/home-feature-entrance.jpg"));
        museums.add(new InfoOfPOI("Norton Simon Museum",
                "https://www.visitpasadena.com/imager/s3_us-west-1_amazonaws_com/pasadena-2020/images/Museums-Culture/Norton-Simon-Museum-2_c3cc3d3e99a0496ea9909ca43528d03d.jpg"));
        museums.add(new InfoOfPOI("Mission San Luis Rey",
                "https://visitoceanside.org/wp-content/uploads/2019/07/Mission-San-Luis-Rey-PC-MARELBU.jpg"));
        museums.add(new InfoOfPOI("Tallac Historic Site",
                "https://tahoesouth.com/wp-content/uploads/2020/11/baldwin-museum-at-the-tallac-historic-site-lake-tahoe700.jpg"));
        museums.add(new InfoOfPOI("Petersen Automotive Museum",
                "https://www.travelcaffeine.com/wp-content/uploads/2018/03/petersen-automotive-museum-los-angeles-california-450.jpg"));
/*        museums.add(new InfoOfPOI("Golden Gate Bridge",R.drawable.golden_gate_bridge));
        museums.add(new InfoOfPOI("Hollywood Sign",R.drawable.hollywood_sign));
        museums.add(new InfoOfPOI("California State Capitol",R.drawable.california_state_capitol));
        museums.add(new InfoOfPOI("Walt Disney Concert Hall",R.drawable.walt_disney_concert_hall));
        museums.add(new InfoOfPOI("HP Garage",R.drawable.hp_garage));
        museums.add(new InfoOfPOI("Santa Monica Pier",R.drawable.santa_monica_pier));
        museums.add(new InfoOfPOI("Hollywood Walk of Fame",R.drawable.walk_of_fame));
        museums.add(new InfoOfPOI("Griffith Observatory",R.drawable.griffith_observatory));
        museums.add(new InfoOfPOI("San Francisco City Hall",R.drawable.san_francisco_city_hall));*/

        InfoOfPOIAdapter itemsAdapter = new InfoOfPOIAdapter(getActivity(),museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebViewUrl webUrl = new WebViewUrl();
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 0)));
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 1)));
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 2)));
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 3)));
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 4)));
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 5)));
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 6)));
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 7)));
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 8)));
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(2, 9)));
                        startActivity(intent9);
                        break;
                }
            }
        });

        return rootView;
    }
}