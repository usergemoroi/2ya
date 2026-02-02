/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.wl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.za3;
import java.util.ArrayList;
import java.util.List;

public final class yu
implements vl {
    public static final int b = 0;

    static {
        new yu(xj0.<wu>h());
        new za3();
    }

    public yu(List<wu> list) {
        xj0.a(list);
    }

    private static final yu a(Bundle object) {
        object = (object = object.getParcelableArrayList(Integer.toString(0, 36))) == null ? xj0.h() : wl.a(wu.t, (ArrayList)object);
        return new yu((List<wu>)object);
    }

    public static /* synthetic */ yu b(Bundle bundle) {
        return yu.a(bundle);
    }
}

