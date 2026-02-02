/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.widget.ImageView$ScaleType
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.ar1$a
 *  com.yandex.mobile.ads.impl.ar1$b
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ej2
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.e00;
import com.yandex.mobile.ads.impl.eg1;
import com.yandex.mobile.ads.impl.ej2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.yp1;

public final class fj0
extends yp1<Bitmap> {
    private static final Object y = new Object();
    private final Object s = new Object();
    @GuardedBy(value="mLock")
    @Nullable
    private ar1.b<Bitmap> t;
    private final Bitmap.Config u;
    private final int v;
    private final int w;
    private final ImageView.ScaleType x;

    public fj0(String string2, ar1.b<Bitmap> b10, int n10, int n12, ImageView.ScaleType scaleType, Bitmap.Config config, @Nullable ar1.a a13) {
        super(0, string2, a13);
        this.a(new e00(2.0f, 1000, 2));
        this.t = b10;
        this.u = config;
        this.v = n10;
        this.w = n12;
        this.x = scaleType;
    }

    private static int a(int n10, int n12, int n13, int n14, ImageView.ScaleType scaleType) {
        if (n10 == 0 && n12 == 0) {
            return n13;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (n10 == 0) {
                return n13;
            }
            return n10;
        }
        if (n10 == 0) {
            double d10 = (double)n12 / (double)n14;
            return (int)((double)n13 * d10);
        }
        if (n12 == 0) {
            return n10;
        }
        double d14 = (double)n14 / (double)n13;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d15 = n10;
            double d16 = n12;
            if (d15 * d14 < d16) {
                n10 = (int)(d16 / d14);
            }
            return n10;
        }
        double d17 = n10;
        double d18 = n12;
        if (d17 * d14 > d18) {
            n10 = (int)(d18 / d14);
        }
        return n10;
    }

    private ar1<Bitmap> b(uc1 uc12) {
        Object object;
        block6: {
            int n10;
            int n12;
            Object object2;
            block7: {
                float f11;
                block5: {
                    object2 = uc12.b;
                    object = new BitmapFactory.Options();
                    if (this.v != 0 || this.w != 0) break block5;
                    object.inPreferredConfig = this.u;
                    object = BitmapFactory.decodeByteArray((byte[])object2, (int)0, (int)((byte[])object2).length, (BitmapFactory.Options)object);
                    break block6;
                }
                object.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray((byte[])object2, (int)0, (int)((byte[])object2).length, (BitmapFactory.Options)object);
                int n13 = object.outWidth;
                int n14 = object.outHeight;
                n12 = fj0.a(this.v, this.w, n13, n14, this.x);
                n10 = fj0.a(this.w, this.v, n14, n13, this.x);
                object.inJustDecodeBounds = false;
                double d10 = Math.min((double)n13 / (double)n12, (double)n14 / (double)n10);
                float f12 = 1.0f;
                while ((double)(f11 = 2.0f * f12) <= d10) {
                    f12 = f11;
                }
                object.inSampleSize = (int)f12;
                object2 = BitmapFactory.decodeByteArray((byte[])object2, (int)0, (int)((byte[])object2).length, (BitmapFactory.Options)object);
                object = object2;
                if (object2 == null) break block6;
                if (object2.getWidth() > n12) break block7;
                object = object2;
                if (object2.getHeight() <= n10) break block6;
            }
            object = Bitmap.createScaledBitmap((Bitmap)object2, (int)n12, (int)n10, (boolean)true);
            object2.recycle();
        }
        if (object == null) {
            return ar1.a((dj2)new eg1(uc12));
        }
        return ar1.a((Object)object, (em.a)hh0.a((uc1)uc12));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final ar1<Bitmap> a(uc1 object) {
        Object object2 = y;
        synchronized (object2) {
            try {
                try {
                    return this.b((uc1)object);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    int n10 = object.b.length;
                    boolean bl2 = ej2.a;
                    n10 = op0.b;
                    object = new eg1(outOfMemoryError);
                    return ar1.a((dj2)object);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        super.a();
        Object object = this.s;
        synchronized (object) {
            this.t = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final void a(Object object) {
        Bitmap bitmap = (Bitmap)object;
        object = this.s;
        // MONITORENTER : object
        ar1.b<Bitmap> b10 = this.t;
        // MONITOREXIT : object
        if (b10 == null) return;
        b10.a((Object)bitmap);
    }

    public final int g() {
        return 1;
    }
}

