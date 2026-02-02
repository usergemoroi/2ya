/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class fg
extends tj {
    private final AssetManager e;
    @Nullable
    private Uri f;
    @Nullable
    private InputStream g;
    private long h;
    private boolean i;

    public fg(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv object) throws a {
        int n10;
        IOException iOException2;
        block12: {
            Object object2;
            block11: {
                String string2;
                block10: {
                    try {
                        object2 = object.a;
                        this.f = object2;
                        string2 = object2.getPath();
                        string2.getClass();
                        if (!string2.startsWith("/android_asset/")) break block10;
                        object2 = string2.substring(15);
                        break block11;
                    }
                    catch (IOException iOException2) {
                        break block12;
                    }
                    catch (a a13) {
                        throw a13;
                    }
                }
                object2 = string2;
                if (string2.startsWith("/")) {
                    object2 = string2.substring(1);
                }
            }
            this.b((pv)object);
            object2 = this.e.open((String)object2, 1);
            this.g = object2;
            if (((InputStream)object2).skip(object.f) >= object.f) {
                long l10 = object.g;
                if (l10 != -1L) {
                    this.h = l10;
                } else {
                    this.h = l10 = (long)this.g.available();
                    if (l10 == Integer.MAX_VALUE) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                this.c((pv)object);
                return this.h;
            }
            object = new a(null, 2008);
            throw object;
        }
        if (iOException2 instanceof FileNotFoundException) {
            n10 = 2005;
            throw new a(iOException2, n10);
        }
        n10 = 2000;
        throw new a(iOException2, n10);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() throws a {
        Throwable throwable2;
        block7: {
            this.f = null;
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    this.e();
                }
                return;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (IOException iOException) {}
            {
                a a13 = new a(iOException, 2000);
                throw a13;
            }
        }
        this.g = null;
        if (this.i) {
            this.i = false;
            this.e();
        }
        throw throwable2;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) throws a {
        block5: {
            if (var3_4 == 0) {
                return 0;
            }
            var7_5 = this.h;
            if (var7_5 == 0L) {
                return -1;
            }
            if (var7_5 == -1L) ** GOTO lbl10
            var5_6 = var3_4;
            try {
                var3_4 = (int)Math.min(var7_5, var5_6);
lbl10:
                // 2 sources

                var9_7 = this.g;
                var4_8 = m92.a;
                var2_3 = var9_7.read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    return -1;
                }
                var5_6 = this.h;
                if (var5_6 == -1L) break block5;
            }
            catch (IOException var1_2) {
                throw new a(var1_2, 2000);
            }
            this.h = var5_6 - (long)var2_3;
        }
        this.c(var2_3);
        return var2_3;
    }

    public static final class a
    extends mv {
        public a(@Nullable IOException iOException, int n10) {
            super((Throwable)iOException, n10);
        }
    }
}

