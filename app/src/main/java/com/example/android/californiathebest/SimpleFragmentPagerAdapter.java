package com.example.android.californiathebest;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Landmarks", "National parks", "Museums", "RoadTrip" };

    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public int getCount() { return PAGE_COUNT; }

    @Override
    public Fragment getItem(int position) {
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
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
