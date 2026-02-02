/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bv0
 *  com.yandex.mobile.ads.impl.ep1
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.ni1$b
 *  com.yandex.mobile.ads.impl.pt1
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.ep1;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.ni1;
import com.yandex.mobile.ads.impl.pt1;
import java.io.IOException;

public interface cp1
extends ni1.b {
    public void a(float var1, float var2) throws g60;

    public void a(int var1, mi1 var2);

    public void a(long var1) throws g60;

    public void a(long var1, long var3) throws g60;

    public void a(ep1 var1, cc0[] var2, pt1 var3, long var4, boolean var6, boolean var7, long var8, long var10) throws g60;

    public void a(cc0[] var1, pt1 var2, long var3, long var5) throws g60;

    public boolean a();

    public void b();

    public void c();

    public boolean d();

    public boolean e();

    @Nullable
    public pt1 g();

    public String getName();

    public int getState();

    public void h();

    public void i() throws IOException;

    public long j();

    public boolean k();

    @Nullable
    public bv0 l();

    public int m();

    public ck n();

    public void start() throws g60;

    public void stop();
}

