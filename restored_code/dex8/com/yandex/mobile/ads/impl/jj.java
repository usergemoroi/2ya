/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bo
 *  com.yandex.mobile.ads.impl.gh1
 *  com.yandex.mobile.ads.impl.gh1$b
 *  com.yandex.mobile.ads.impl.op0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bo;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.op0;
import org.jetbrains.annotations.NotNull;

public abstract class jj<T>
implements gh1.b,
bo {
    @NotNull
    private final Context a;
    @NotNull
    private final b8<T> b;
    @NotNull
    private final gh1 c;

    public /* synthetic */ jj(Context context, b8 b82) {
        this(context, b82, gh1.h.a(context));
    }

    protected jj(@NotNull Context context, @NotNull b8<T> b82, @NotNull gh1 gh12) {
        this.a = context;
        this.b = b82;
        this.c = gh12;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return false;
    }

    public abstract void b();

    public void c() {
        this.b();
        ((Object)this.getClass()).toString();
        int n10 = op0.b;
    }

    @NotNull
    public final b8<T> d() {
        return this.b;
    }

    @NotNull
    public final Context e() {
        return this.a;
    }

    protected final boolean f() {
        return this.c.b() ^ true;
    }

    public final void g() {
        ((Object)this.getClass()).toString();
        int n10 = op0.b;
        this.c.a((gh1.b)this);
    }

    public final void h() {
        ((Object)this.getClass()).toString();
        int n10 = op0.b;
        this.c.b((gh1.b)this);
    }
}

