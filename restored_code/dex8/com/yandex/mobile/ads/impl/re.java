/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.b33
 *  com.yandex.mobile.ads.impl.ke
 *  com.yandex.mobile.ads.impl.ne
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pe
 *  com.yandex.mobile.ads.impl.qe
 *  com.yandex.mobile.ads.impl.xe
 *  com.yandex.mobile.ads.impl.ye
 *  com.yandex.mobile.ads.impl.ze
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.b33;
import com.yandex.mobile.ads.impl.ke;
import com.yandex.mobile.ads.impl.li0;
import com.yandex.mobile.ads.impl.ne;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pe;
import com.yandex.mobile.ads.impl.qe;
import com.yandex.mobile.ads.impl.xe;
import com.yandex.mobile.ads.impl.ye;
import com.yandex.mobile.ads.impl.ze;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class re
implements ze {
    private static final long g = TimeUnit.SECONDS.toMillis(30L);
    @NotNull
    private final qe a;
    @NotNull
    private final ke b;
    @NotNull
    private final Handler c;
    @NotNull
    private final ne d;
    private boolean e;
    @NotNull
    private final Object f;

    public re(@NotNull qe qe3, @NotNull ke ke3) {
        this.a = qe3;
        this.b = ke3;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new ne();
        this.f = new Object();
    }

    private final void a() {
        a<k0> a14 = new a<k0>(this){
            final re b;
            {
                this.b = re3;
                super(0);
            }

            public final Object invoke() {
                this.b.b();
                this.b.d.getClass();
                ne.a();
                re.b(this.b);
                return k0.a;
            }
        };
        this.c.postDelayed((Runnable)new b33((a)a14), g);
    }

    private static final void a(a a14) {
        a14.invoke();
    }

    private final void b() {
        Object object = this.f;
        synchronized (object) {
            this.c.removeCallbacksAndMessages(null);
            this.e = false;
            k0 k02 = k0.a;
            return;
        }
    }

    public static final void b(re re3) {
        re3.getClass();
        int n10 = op0.b;
        re3.a.a();
    }

    public static /* synthetic */ void b(a a14) {
        re.a(a14);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@NotNull Context context, @NotNull li0 object) {
        int n10;
        block7: {
            block6: {
                this.a.a((li0)object);
                object = this.f;
                // MONITORENTER : object
                if (this.e) break block6;
                n10 = 1;
                this.e = true;
                break block7;
            }
            n10 = 0;
        }
        k0 k02 = k0.a;
        // MONITOREXIT : object
        if (n10 == 0) return;
        try {
            n10 = op0.b;
            this.a();
            this.b.a(context, (ze)this);
            return;
        }
        catch (Throwable throwable) {
            this.b();
            n10 = op0.b;
        }
    }

    public final void a(@NotNull xe xe2) {
        int n10 = op0.b;
        this.b();
        qe qe3 = this.a;
        String string2 = xe2.c();
        String string3 = xe2.a();
        qe3.a(new pe(xe2.b(), string3, string2));
    }

    public final void a(@NotNull ye ye2) {
        this.b();
        this.d.a(ye2);
        int n10 = op0.b;
        this.a.a();
    }
}

