package com.example.android.californiathebest;

public class InfoOfPOI {
    private String mPOIName;
    private String mUrl;

    public InfoOfPOI(String poiName, String imageURL){
        mPOIName = poiName;
        mUrl = imageURL;
    }

    public String getPOIName(){ return this.mPOIName; }
    public String getTitlePictureUrl(){ return this.mUrl; }
}
