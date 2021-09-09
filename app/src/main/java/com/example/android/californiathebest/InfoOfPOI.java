package com.example.android.californiathebest;

public class InfoOfPOI {
    private String mPOIName;
    private int mTitlePictureResourceId;

    public InfoOfPOI(String poiName, int titlePictureResourceId){
        mPOIName = poiName;
        mTitlePictureResourceId = titlePictureResourceId;
    }

    public String getPOIName(){ return this.mPOIName; }
    public int getTitlePictureResourceId(){ return this.mTitlePictureResourceId; }
}
