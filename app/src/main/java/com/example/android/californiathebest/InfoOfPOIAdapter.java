package com.example.android.californiathebest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class InfoOfPOIAdapter extends ArrayAdapter<InfoOfPOI> {
    private int mColorResourceId;
    public InfoOfPOIAdapter(Activity context, ArrayList<InfoOfPOI> infoOfPOI,int colorResourceId) {
        super(context, 0, infoOfPOI);
        mColorResourceId = colorResourceId;
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
        int imageResourceId = currentInfoOfPOI.getTitlePictureResourceId();
        //titleImageView.setVisibility(View.VISIBLE);
        titleImageView.setImageResource(imageResourceId);

        TextView poiNameTextView = (TextView) listItemView.findViewById(R.id.name_of_POI);
        poiNameTextView.setText(currentInfoOfPOI.getPOIName());

        View listItem = listItemView.findViewById(R.id.list_item);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        listItem.setBackgroundColor(color);

        return listItemView;
    }
}
