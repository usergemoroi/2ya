/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cm1
 *  com.yandex.mobile.ads.impl.ib1
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.t2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cm1;
import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.ib1;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.t2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cb1
implements rc0,
ib1 {
    @NotNull
    private final db1 a;
    @Nullable
    private final Long b;
    @Nullable
    private t2 c;
    @Nullable
    private cm1 d;

    @JvmOverloads
    public cb1(@NotNull db1 db12, @NotNull t2 t24, @NotNull cm1 cm12, @Nullable Long l10) {
        this.a = db12;
        this.b = l10;
        this.c = t24;
        this.d = cm12;
    }

    public final void a(long l10, long l11) {
        Object object = this.d;
        if (object != null) {
            object.a(l10, l11);
        }
        if ((object = this.b) != null && l11 > (Long)object) {
            object = this.d;
            if (object != null) {
                object.a();
            }
            if ((object = this.c) != null) {
                object.b();
            }
            this.a.b(this);
            this.c = null;
            this.d = null;
        }
    }

    public final void b() {
        t2 t24 = this.c;
        if (t24 != null) {
            t24.a();
        }
        this.c = null;
    }

    public final void c() {
        cm1 cm12 = this.d;
        if (cm12 != null) {
            cm12.a();
        }
        if ((cm12 = this.c) != null) {
            cm12.b();
        }
        this.a.b(this);
        this.c = null;
        this.d = null;
    }

    public final void invalidate() {
        this.a.b(this);
        this.c = null;
        this.d = null;
    }

    public final void pause() {
    }

    public final void resume() {
    }

    public final void start() {
        this.a.a(this);
    }
}

