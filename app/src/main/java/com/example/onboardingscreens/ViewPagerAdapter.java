package com.example.onboardingscreens;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int sliderAllImage[] = {R.drawable.upload, R.drawable.shorts, R.drawable.live};
    int slideAllTitle[] = {R.string.screen1, R.string.screen2, R.string.screen3};
    int slideAllDesc[] = {R.string.screen1desc, R.string.screen2desc, R.string.screen3desc};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return slideAllTitle.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
