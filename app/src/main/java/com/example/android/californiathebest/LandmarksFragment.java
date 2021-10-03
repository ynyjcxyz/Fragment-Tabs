package com.example.android.californiathebest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {
    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.poi_list, container, false);

        final ArrayList<InfoOfPOI> landmarks = new ArrayList<>();
        landmarks.add(new InfoOfPOI("Golden Gate Bridge",
                "https://sierranewsonline.com/wp-content/uploads/2021/03/fi-SalmaccaroneGGBArtDecoTowers.jpg"));
        landmarks.add(new InfoOfPOI("Hollywood Sign",
                "https://images.unsplash.com/photo-1594663805807-29a7cc1847c0?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8aG9sbHl3b29kJTIwc2lnbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80"));
        landmarks.add(new InfoOfPOI("California State Capitol",
                "https://s.hdnux.com/photos/01/20/60/41/21170296/9/1200x0.jpg"));
        landmarks.add(new InfoOfPOI("Mission San Diego de Alcalá",
                "https://roadtrippingcalifornia.com/wp-content/uploads/2021/03/San-Diego-Mission.jpg"));
        landmarks.add(new InfoOfPOI("Walt Disney Concert Hall",
                "https://ucarecdn.com/fd74ec7e-dfd2-4e1b-9427-70ee92122fc8/-/crop/3772x2321/175,0/-/resize/1300x800/"));
        landmarks.add(new InfoOfPOI("HP Garage",
                "https://www.hpmuseum.org/garage/garage1.jpg"));
        landmarks.add(new InfoOfPOI("Santa Monica Pier",
                "https://images.squarespace-cdn.com/content/v1/5e0e65adcd39ed279a0402fd/1580441261028-2FW8URSB0H2G8BER9EJ2/vasile-tiplea-473079-unsplash.jpg?format=1000w"));
        landmarks.add(new InfoOfPOI("Hollywood Walk of Fame",
                "https://metro.co.uk/wp-content/uploads/2018/08/gettyimages-138345374.jpg?quality=90&strip=all&zoom=1&resize=480%2C319"));
        landmarks.add(new InfoOfPOI("Griffith Observatory",
                "https://media.tacdn.com/media/attractions-splice-spp-674x446/07/96/8c/e1.jpg"));
        landmarks.add(new InfoOfPOI("San Francisco City Hall",
                "https://sf.gov/sites/default/files/styles/700x500/public/2021-05/SF%20City%20Hall%20at%20sunset.jpg?itok=sNoG-B7U"));
/*        landmarks.add(new InfoOfPOI("Golden Gate Bridge", R.drawable.golden_gate_bridge));
        landmarks.add(new InfoOfPOI("Hollywood Sign", R.drawable.hollywood_sign));
        landmarks.add(new InfoOfPOI("California State Capitol", R.drawable.california_state_capitol));
        landmarks.add(new InfoOfPOI("Mission San Diego de Alcalá", R.drawable.mission_san_diego));
        landmarks.add(new InfoOfPOI("Walt Disney Concert Hall", R.drawable.walt_disney_concert_hall));
        landmarks.add(new InfoOfPOI("HP Garage", R.drawable.hp_garage));
        landmarks.add(new InfoOfPOI("Santa Monica Pier", R.drawable.santa_monica_pier));
        landmarks.add(new InfoOfPOI("Hollywood Walk of Fame", R.drawable.walk_of_fame));
        landmarks.add(new InfoOfPOI("Griffith Observatory", R.drawable.griffith_observatory));
        landmarks.add(new InfoOfPOI("San Francisco City Hall", R.drawable.san_francisco_city_hall));*/

        InfoOfPOIAdapter itemsAdapter = new InfoOfPOIAdapter(getActivity(), landmarks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebViewUrl webUrl = new WebViewUrl();
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(view.getContext(), DetailPage.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), Page1_2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 2)));
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 3)));
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 4)));
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 5)));
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 6)));
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 7)));
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 8)));
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl.getWebViewUrl(0, 9)));
                        startActivity(intent9);
                        break;
                }
            }
        });

        return rootView;
    }
}