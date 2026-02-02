/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ju0
 *  com.yandex.mobile.ads.impl.ke
 *  com.yandex.mobile.ads.impl.mi0
 *  com.yandex.mobile.ads.impl.ni0
 *  com.yandex.mobile.ads.impl.pe
 *  com.yandex.mobile.ads.impl.te
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ju0;
import com.yandex.mobile.ads.impl.ke;
import com.yandex.mobile.ads.impl.mi0;
import com.yandex.mobile.ads.impl.ni0;
import com.yandex.mobile.ads.impl.pe;
import com.yandex.mobile.ads.impl.re;
import com.yandex.mobile.ads.impl.te;
import kotlin.jvm.internal.u0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class li0
implements mi0 {
    @NotNull
    private static final Object h = new Object();
    @NotNull
    private final ke a;
    @NotNull
    private final te b;
    @NotNull
    private final re c;
    @NotNull
    private final Context d;
    @Nullable
    private pe e;
    @NotNull
    private final ni0 f;
    @NotNull
    private final String g;

    public li0(@NotNull Context context, @NotNull ke ke3, @NotNull te te3, @NotNull re re3, @NotNull ju0 ju02) {
        this.a = ke3;
        this.b = te3;
        this.c = re3;
        this.f = ni0.b;
        this.g = ju02.a();
        this.d = context.getApplicationContext();
    }

    public static final /* synthetic */ Object d() {
        return h;
    }

    @NotNull
    public final String a() {
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull pe object) {
        Object object2 = h;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.b.getClass();
                        if (!te.a((pe)object)) break block3;
                        this.e = object;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final pe b() {
        u0 u03 = new u0();
        Object object = h;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                pe pe3;
                Object object2;
                block3: {
                    try {
                        pe3 = object2 = this.e;
                        if (object2 != null) break block3;
                        object2 = this.a.a(this.d);
                        String string2 = this.a.b(this.d);
                        pe3 = new pe(null, string2, (String)object2);
                        this.c.a(this.d, this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                u03.c = pe3;
                object2 = k0.a;
                return pe3;
            }
            throw throwable2;
        }
    }

    @NotNull
    public final ni0 c() {
        return this.f;
    }
}

