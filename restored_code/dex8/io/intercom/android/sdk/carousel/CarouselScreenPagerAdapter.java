/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentPagerAdapter
 */
package io.intercom.android.sdk.carousel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.List;

public class CarouselScreenPagerAdapter
extends FragmentPagerAdapter {
    private List<CarouselScreenFragment> fragments;

    public CarouselScreenPagerAdapter(FragmentManager fragmentManager, List<CarouselScreenFragment> list) {
        super(fragmentManager);
        this.fragments = list;
    }

    public int getCount() {
        return this.fragments.size();
    }

    public Fragment getItem(int n10) {
        return this.fragments.get(n10);
    }
}

