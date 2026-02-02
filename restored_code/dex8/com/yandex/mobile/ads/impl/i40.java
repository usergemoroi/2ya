/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrmException
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.dt2
 *  com.yandex.mobile.ads.impl.f60
 *  com.yandex.mobile.ads.impl.f60$a
 *  com.yandex.mobile.ads.impl.f60$b
 *  com.yandex.mobile.ads.impl.f60$d
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.uu
 *  com.yandex.mobile.ads.impl.y30$b
 */
package com.yandex.mobile.ads.impl;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.dt2;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.uu;
import com.yandex.mobile.ads.impl.y30;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(value=18)
public final class i40
implements f60 {
    public final f60.a a(byte[] byArray, @Nullable List<y30.b> list, int n10, @Nullable HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    public final f60.d a() {
        throw new IllegalStateException();
    }

    public final Map<String, String> a(byte[] byArray) {
        throw new IllegalStateException();
    }

    public final void a(@Nullable f60.b b10) {
    }

    public /* synthetic */ void a(byte[] byArray, mi1 mi12) {
        dt2.a((f60)this, (byte[])byArray, (mi1)mi12);
    }

    public final void a(byte[] byArray, byte[] byArray2) {
        throw new IllegalStateException();
    }

    public final boolean a(String string2, byte[] byArray) {
        throw new IllegalStateException();
    }

    public final int b() {
        return 1;
    }

    public final void b(byte[] byArray) {
    }

    @Nullable
    public final byte[] b(byte[] byArray, byte[] byArray2) {
        throw new IllegalStateException();
    }

    public final void c(byte[] byArray) {
        throw new IllegalStateException();
    }

    public final byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public final uu d(byte[] byArray) {
        throw new IllegalStateException();
    }

    public final void release() {
    }
}

