package com.example.android.californiathebest;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SimpleFragmentPagerAdapter extends FragmentStateAdapter {
    final int PAGE_COUNT = 4;
//    private String fragmentTitles[] = new String[] { "Landmarks", "National parks", "Museums", "RoadTrip" };

    public SimpleFragmentPagerAdapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @Override
    public int getItemCount() { return PAGE_COUNT; }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else if (position == 1) {
            return new NationalParksFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new RoadTripFragment();
        }
    }

}
