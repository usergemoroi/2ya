/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a40
 *  com.yandex.mobile.ads.impl.fi$a
 *  com.yandex.mobile.ads.impl.hi1
 *  com.yandex.mobile.ads.impl.hi1$b
 *  com.yandex.mobile.ads.impl.hy
 *  com.yandex.mobile.ads.impl.ly
 *  com.yandex.mobile.ads.impl.rw0
 */
package com.yandex.mobile.ads.impl;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.iw0;
import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.rw0;
import java.util.List;

public interface xc
extends hi1.b,
rw0,
fi.a,
a40 {
    public void a(int var1, long var2);

    public void a(int var1, long var2, long var4);

    public void a(long var1);

    public void a(cc0 var1, @Nullable ly var2);

    public void a(hi1 var1, Looper var2);

    public void a(hy var1);

    public void a(iw0 var1);

    public void a(Exception var1);

    public void a(Object var1, long var2);

    public void a(String var1);

    public void a(String var1, long var2, long var4);

    public void a(List<qw0.b> var1, @Nullable qw0.b var2);

    public void b(int var1, long var2);

    public void b(cc0 var1, @Nullable ly var2);

    public void b(hy var1);

    public void b(Exception var1);

    public void b(String var1);

    public void b(String var1, long var2, long var4);

    public void c(hy var1);

    public void c(Exception var1);

    public void d(hy var1);

    public void release();
}

