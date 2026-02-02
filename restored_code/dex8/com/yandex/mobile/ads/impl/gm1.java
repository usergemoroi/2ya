/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.et1
 *  com.yandex.mobile.ads.impl.gl1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.pv$a
 *  com.yandex.mobile.ads.impl.sm
 *  com.yandex.mobile.ads.impl.sm$a
 *  com.yandex.mobile.ads.impl.u30
 *  com.yandex.mobile.ads.impl.u30$a
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.au2;
import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.gl1;
import com.yandex.mobile.ads.impl.hm;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.r30;
import com.yandex.mobile.ads.impl.sm;
import com.yandex.mobile.ads.impl.u30;
import com.yandex.mobile.ads.impl.uf;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class gm1
implements u30 {
    private final Executor a;
    private final pv b;
    private final hm c;
    private final sm d;
    @Nullable
    private u30.a e;
    private volatile et1<Void, IOException> f;
    private volatile boolean g;

    public gm1(ew0 ew02, hm.a object, Executor executor) {
        this.a = (Executor)uf.a((Object)executor);
        uf.a((Object)((Object)ew02.c));
        ew02 = new pv.a().a(ew02.c.a).a(ew02.c.e).a(4).a();
        this.b = ew02;
        this.c = object = ((hm.a)object).b();
        this.d = new sm((hm)object, (pv)ew02, (sm.a)new au2(this));
    }

    private void a(long l10, long l11, long l13) {
        u30.a a13 = this.e;
        if (a13 == null) {
            return;
        }
        float f11 = l10 != -1L && l10 != 0L ? (float)l11 * 100.0f / (float)l10 : -1.0f;
        ((r30.d)a13).a(l10, l11, f11);
    }

    public static /* synthetic */ void a(gm1 gm12, long l10, long l11, long l13) {
        gm12.a(l10, l11, l13);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable u30.a object) throws IOException, InterruptedException {
        this.e = object;
        this.f = new et1<Void, IOException>(this){
            final gm1 h;
            {
                this.h = gm12;
            }

            protected final void b() {
                this.h.d.b();
            }

            protected final void c() throws Exception {
                this.h.d.a();
            }
        };
        int n10 = 0;
        while (n10 == 0) {
            try {
                if (!this.g) {
                    this.a.execute((Runnable)this.f);
                    try {
                        this.f.get();
                        n10 = 1;
                        continue;
                    }
                    catch (ExecutionException executionException) {
                        object = executionException.getCause();
                        object.getClass();
                        if (object instanceof gl1) continue;
                        if (object instanceof IOException) {
                            throw (IOException)object;
                        }
                        n10 = m92.a;
                        throw object;
                    }
                }
                break;
            }
            catch (Throwable throwable) {}
            this.f.a();
            throw throwable;
        }
        this.f.a();
    }

    public final void cancel() {
        this.g = true;
        et1<Void, IOException> et12 = this.f;
        if (et12 != null) {
            et12.cancel(true);
        }
    }

    public final void remove() {
        this.c.f().a(this.c.g().a(this.b));
    }
}

