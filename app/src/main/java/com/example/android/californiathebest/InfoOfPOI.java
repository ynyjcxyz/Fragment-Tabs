package com.example.android.californiathebest;

import java.util.List;

public class InfoOfPOI {
    private String mPOIName;
    private String mUrl;
    private List<String> mDetailImageUrl;
    private String mAddress;
    private String mTimeSchedule;
    private String mTeleNumber;
    private String mOfficialWebsite;

    public InfoOfPOI(String poiName, String imageURL){
        mPOIName = poiName;
        mUrl = imageURL;
    }
    public String getPOIName(){ return this.mPOIName; }
    public String getTitlePictureUrl(){ return this.mUrl; }

    public InfoOfPOI(String poiName,
                     List<String> detailImageUrl,
                     String address,
                     String timeSchedule,
                     String teleNumber,
                     String officialWebsite){
        mPOIName = poiName;
        mDetailImageUrl = detailImageUrl;
        mAddress = address;
        mTimeSchedule = timeSchedule;
        mTeleNumber = teleNumber;
        mOfficialWebsite = officialWebsite;
    }
    public List<String> getDetailImageUrl(){ return this.mDetailImageUrl; }
    public String getAddress(){ return this.mAddress; }
    public String getTimeSchedule(){ return this.mTimeSchedule; }
    public String getTeleNumber(){ return this.mTeleNumber; }
    public String getOfficialWebsite(){ return this.mOfficialWebsite; }
}
