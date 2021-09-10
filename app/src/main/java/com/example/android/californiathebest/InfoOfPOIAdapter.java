package com.example.android.californiathebest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class InfoOfPOIAdapter extends ArrayAdapter<InfoOfPOI> {
    public InfoOfPOIAdapter(Activity context, ArrayList<InfoOfPOI> infoOfPOI) {
        super(context, 0, infoOfPOI);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        InfoOfPOI currentInfoOfPOI = getItem(position);

        ImageView titleImageView = (ImageView) listItemView.findViewById(R.id.pic_of_POI);
        String imageResourceUrl = currentInfoOfPOI.getTitlePictureUrl();
        //titleImageView.setVisibility(View.VISIBLE);
        //titleImageView.setImageResource(imageResourceId);
        Picasso.get()
                .load(imageResourceUrl)
                .into(titleImageView);

        TextView poiNameTextView = (TextView) listItemView.findViewById(R.id.name_of_POI);
        poiNameTextView.setText(currentInfoOfPOI.getPOIName());

        return listItemView;
    }
}
