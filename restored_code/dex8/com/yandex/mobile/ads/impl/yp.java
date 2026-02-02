/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bq
 *  com.yandex.mobile.ads.impl.ks0
 *  com.yandex.mobile.ads.impl.ks0$a
 *  com.yandex.mobile.ads.impl.m72
 *  com.yandex.mobile.ads.impl.up
 *  com.yandex.mobile.ads.impl.wp
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aq;
import com.yandex.mobile.ads.impl.bq;
import com.yandex.mobile.ads.impl.ks0;
import com.yandex.mobile.ads.impl.m72;
import com.yandex.mobile.ads.impl.up;
import com.yandex.mobile.ads.impl.wp;
import com.yandex.mobile.ads.impl.zp;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yp
implements wp,
ks0.a {
    @NotNull
    private static final Object j = new Object();
    @NotNull
    private final m72 b;
    @NotNull
    private final m72 c;
    @Nullable
    private String d;
    @Nullable
    private String e;
    private boolean f;
    @Nullable
    private String g;
    @Nullable
    private String h;
    @Nullable
    private String i;

    public yp(@NotNull zp upArray, @NotNull aq aq2, @NotNull ks0 ks02) {
        this.b = upArray;
        this.c = aq2;
        upArray = up.values();
        int n10 = upArray.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            this.a(ks02, upArray[i14]);
        }
        ks02.a((ks0.a)this);
    }

    private final void a(bq bq2) {
        if (bq2 instanceof bq.b) {
            this.f = ((bq.b)bq2).a();
        } else if (bq2 instanceof bq.c) {
            this.d = ((bq.c)bq2).a();
        } else if (bq2 instanceof bq.d) {
            this.e = ((bq.d)bq2).a();
        } else if (bq2 instanceof bq.e) {
            this.g = ((bq.e)bq2).a();
        } else if (bq2 instanceof bq.f) {
            this.h = ((bq.f)bq2).a();
        } else if (bq2 instanceof bq.a) {
            this.i = ((bq.a)bq2).a();
        }
    }

    private final void a(ks0 ks02, up up3) {
        bq bq2;
        bq bq3 = bq2 = this.c.a(ks02, up3);
        if (bq2 == null) {
            bq3 = this.b.a(ks02, up3);
        }
        this.a(bq3);
    }

    @Nullable
    public final String a() {
        Object object = j;
        synchronized (object) {
            String string2 = this.e;
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull ks0 object, @NotNull String string2) {
        Object object2 = j;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                bq bq2;
                block4: {
                    try {
                        bq bq3;
                        bq2 = bq3 = this.c.a(object, string2);
                        if (bq3 != null) break block4;
                        bq2 = this.b.a(object, string2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (bq2 != null) {
                    this.a(bq2);
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }

    @Nullable
    public final String b() {
        Object object = j;
        synchronized (object) {
            String string2 = this.d;
            return string2;
        }
    }

    @Nullable
    public final String c() {
        Object object = j;
        synchronized (object) {
            String string2 = this.g;
            return string2;
        }
    }

    @Nullable
    public final String d() {
        Object object = j;
        synchronized (object) {
            String string2 = this.i;
            return string2;
        }
    }

    public final boolean e() {
        Object object = j;
        synchronized (object) {
            boolean bl2 = this.f;
            return bl2;
        }
    }

    @Nullable
    public final String f() {
        Object object = j;
        synchronized (object) {
            String string2 = this.h;
            return string2;
        }
    }
}

