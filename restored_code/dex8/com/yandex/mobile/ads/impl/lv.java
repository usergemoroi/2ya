/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.pv;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface lv
extends iv {
    public long a(pv var1) throws IOException;

    public void a(k72 var1);

    public void close() throws IOException;

    public Map<String, List<String>> getResponseHeaders();

    @Nullable
    public Uri getUri();
}

