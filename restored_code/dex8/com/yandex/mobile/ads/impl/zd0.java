/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  com.yandex.mobile.ads.impl.ts0
 *  com.yandex.mobile.ads.impl.xs0
 *  com.yandex.mobile.ads.impl.ys0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.xs0;
import com.yandex.mobile.ads.impl.ys0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zd0
implements ts0 {
    @NotNull
    private final ys0 a;
    @NotNull
    private final Object b;

    public /* synthetic */ zd0(Context context, String string2) {
        this(new ys0(context, string2));
    }

    public zd0(@NotNull ys0 ys02) {
        this.a = ys02;
        this.b = new Object();
    }

    @Nullable
    public final Location a() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                xs0 xs02;
                block5: {
                    block4: {
                        try {
                            xs02 = this.a.b();
                            if (xs02 == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        if (!xs02.b()) break block4;
                        xs02 = xs02.a();
                        this.a.c();
                        break block5;
                    }
                    xs02 = null;
                }
                return xs02;
            }
            throw throwable2;
        }
    }
}

