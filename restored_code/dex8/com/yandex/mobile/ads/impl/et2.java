/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.WindowInsetsCompat
 *  com.yandex.mobile.ads.impl.fb
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.yandex.mobile.ads.impl.fb;

public final class et2
implements OnApplyWindowInsetsListener {
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return fb.b((View)view, (WindowInsetsCompat)windowInsetsCompat);
    }
}

