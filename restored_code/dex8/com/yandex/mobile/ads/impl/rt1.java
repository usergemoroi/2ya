/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.media.MediaFormat
 *  android.opengl.GLES20
 *  android.opengl.Matrix
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.df2
 *  com.yandex.mobile.ads.impl.g33
 *  com.yandex.mobile.ads.impl.hn
 *  com.yandex.mobile.ads.impl.jc0
 *  com.yandex.mobile.ads.impl.k52
 *  com.yandex.mobile.ads.impl.ke0
 *  com.yandex.mobile.ads.impl.lm1
 *  com.yandex.mobile.ads.impl.lm1$a
 *  com.yandex.mobile.ads.impl.lm1$b
 *  com.yandex.mobile.ads.impl.mm1
 *  com.yandex.mobile.ads.impl.nm1
 */
package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.df2;
import com.yandex.mobile.ads.impl.g33;
import com.yandex.mobile.ads.impl.hn;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.k52;
import com.yandex.mobile.ads.impl.ke0;
import com.yandex.mobile.ads.impl.lm1;
import com.yandex.mobile.ads.impl.mm1;
import com.yandex.mobile.ads.impl.nm1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class rt1
implements df2,
hn {
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean(true);
    private final nm1 d = new nm1();
    private final jc0 e = new jc0();
    private final k52<Long> f = new k52();
    private final k52<lm1> g = new k52();
    private final float[] h = new float[16];
    private final float[] i = new float[16];
    private int j;
    private SurfaceTexture k;
    private volatile int l = 0;
    private int m = -1;
    @Nullable
    private byte[] n;

    private /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.b.set(true);
    }

    public static /* synthetic */ void a(rt1 rt12, SurfaceTexture surfaceTexture) {
        rt12.a(surfaceTexture);
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture;
        GLES20.glClearColor((float)0.5f, (float)0.5f, (float)0.5f, (float)1.0f);
        ke0.a();
        this.d.a();
        ke0.a();
        this.j = ke0.b();
        this.k = surfaceTexture = new SurfaceTexture(this.j);
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)new g33(this));
        return this.k;
    }

    public final void a(int n10) {
        this.l = n10;
    }

    public final void a(long l10, long l11, cc0 object, @Nullable MediaFormat object2) {
        block7: {
            block9: {
                int n10;
                int n13;
                int n14;
                block8: {
                    this.f.a((Object)l10, l11);
                    object2 = ((cc0)object).w;
                    n14 = ((cc0)object).x;
                    object = this.n;
                    n13 = this.m;
                    this.n = (byte[])object2;
                    n10 = n14;
                    if (n14 == -1) {
                        n10 = this.l;
                    }
                    this.m = n10;
                    if (n13 == n10 && Arrays.equals((byte[])object, this.n)) break block7;
                    object = this.n;
                    object = object != null ? mm1.a((int)this.m, (byte[])object) : null;
                    if (object == null) break block8;
                    lm1.a a14 = ((lm1)object).a;
                    object2 = ((lm1)object).b;
                    if (a14.b() == 1 && a14.a().a == 0 && object2.b() == 1 && object2.a().a == 0) break block9;
                }
                n14 = this.m;
                float f11 = (float)Math.toRadians(180.0f);
                float f12 = (float)Math.toRadians(360.0f);
                float f13 = f11 / (float)36;
                float f14 = f12 / (float)72;
                object = new float[15984];
                object2 = new float[10656];
                int n15 = 0;
                int n16 = 0;
                int n17 = 0;
                while (n15 < 36) {
                    float f15 = n15;
                    float f16 = f11 / 2.0f;
                    f15 = f15 * f13 - f16;
                    n10 = n15 + 1;
                    float f17 = (float)n10 * f13 - f16;
                    n13 = 0;
                    f16 = f14;
                    f14 = f17;
                    while (n13 < 73) {
                        int n18 = n16;
                        int n19 = n13;
                        n13 = n18;
                        for (n16 = 0; n16 < 2; ++n16) {
                            int n23;
                            block11: {
                                block10: {
                                    f17 = n16 == 0 ? f15 : f14;
                                    float f18 = (float)n19 * f16;
                                    float f19 = f12 / 2.0f;
                                    double d14 = 50.0f;
                                    double d15 = (float)Math.PI + f18 - f19;
                                    double d16 = Math.sin(d15);
                                    double d17 = f17;
                                    object[n13] = -((float)(Math.cos(d17) * (d16 * d14)));
                                    object[n13 + 1] = (float)(Math.sin(d17) * d14);
                                    n23 = n13 + 3;
                                    d16 = Math.cos(d15);
                                    object[n13 + 2] = (float)(Math.cos(d17) * (d16 * d14));
                                    object2[n17] = (MediaFormat)(f18 / f12);
                                    n18 = n17 + 2;
                                    object2[n17 + 1] = (MediaFormat)((float)(n15 + n16) * f13 / f11);
                                    if (n19 == 0 && n16 == 0) break block10;
                                    if (n19 != 72 || n16 != 1) break block11;
                                }
                                System.arraycopy(object, n13, object, n23, 3);
                                n13 += 6;
                                System.arraycopy(object2, n17, object2, n18, 2);
                                n17 += 4;
                                continue;
                            }
                            n13 = n23;
                            n17 = n18;
                        }
                        n16 = n13;
                        n13 = ++n19;
                    }
                    n15 = n10;
                    f14 = f16;
                }
                object = new lm1.a(new lm1.b[]{new lm1.b(0, (float[])object, (float[])object2, 1)});
                object = new lm1((lm1.a)object, (lm1.a)object, n14);
            }
            this.g.a(object, l11);
        }
    }

    public final void a(long l10, float[] fArray) {
        this.e.b(l10, fArray);
    }

    public final void a(float[] fArray) {
        GLES20.glClear((int)16384);
        ke0.a();
        if (this.b.compareAndSet(true, false)) {
            long l10;
            Long l11;
            Object object = this.k;
            object.getClass();
            object.updateTexImage();
            ke0.a();
            if (this.c.compareAndSet(true, false)) {
                Matrix.setIdentityM((float[])this.h, (int)0);
            }
            if ((l11 = (Long)this.f.a(l10 = this.k.getTimestamp())) != null) {
                jc0 jc02 = this.e;
                object = this.h;
                jc02.a(l11.longValue(), (float[])object);
            }
            if ((object = (lm1)this.g.b(l10)) != null) {
                this.d.a((lm1)object);
            }
        }
        Matrix.multiplyMM((float[])this.i, (int)0, (float[])fArray, (int)0, (float[])this.h, (int)0);
        this.d.a(this.j, this.i);
    }

    public final void f() {
        this.f.a();
        this.e.a();
        this.c.set(true);
    }
}

