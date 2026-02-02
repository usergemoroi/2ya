/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class wn1
extends tj {
    private final Resources e;
    private final String f;
    @Nullable
    private Uri g;
    @Nullable
    private AssetFileDescriptor h;
    @Nullable
    private FileInputStream i;
    private long j;
    private boolean k;

    public wn1(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int n10) {
        StringBuilder stringBuilder = new StringBuilder("rawresource:///");
        stringBuilder.append(n10);
        return Uri.parse((String)stringBuilder.toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv var1_1) throws a {
        block21: {
            block22: {
                block23: {
                    this.g = var9_6 = var1_1 /* !! */ .a;
                    if (TextUtils.equals((CharSequence)"rawresource", (CharSequence)var9_6.getScheme())) ** GOTO lbl-1000
                    if (!TextUtils.equals((CharSequence)"android.resource", (CharSequence)var9_6.getScheme()) || var9_6.getPathSegments().size() != 1) ** GOTO lbl-1000
                    var7_7 = var9_6.getLastPathSegment();
                    var7_7.getClass();
                    if (!var7_7.matches("\\d+")) lbl-1000:
                    // 2 sources

                    {
                        if (TextUtils.equals((CharSequence)"android.resource", (CharSequence)var9_6.getScheme()) == false) throw new a(1004, "URI must either use scheme rawresource or android.resource", null);
                        var8_8 = var9_6.getPath();
                        var8_8.getClass();
                        var7_7 = var8_8;
                        if (var8_8.startsWith("/")) {
                            var7_7 = var8_8.substring(1);
                        }
                        var11_9 = var9_6.getHost();
                        var10_10 = new StringBuilder();
                        if (TextUtils.isEmpty((CharSequence)var11_9)) {
                            var8_8 = "";
                        } else {
                            var8_8 = new StringBuilder();
                            var8_8.append(var11_9);
                            var8_8.append(":");
                            var8_8 = var8_8.toString();
                        }
                        var10_10.append((String)var8_8);
                        var10_10.append((String)var7_7);
                        var7_7 = var10_10.toString();
                        var2_11 = this.e.getIdentifier((String)var7_7, "raw", this.f);
                        if (var2_11 == 0) throw new a(2005, "Resource not found.", null);
                    } else lbl-1000:
                    // 2 sources

                    {
                        try {
                            var7_7 = var9_6.getLastPathSegment();
                            var7_7.getClass();
                            var2_11 = Integer.parseInt((String)var7_7);
                        }
                        catch (NumberFormatException var1_5) {
                            throw new a(1004, "Resource identifier must be an integer.", null);
                        }
                    }
                    this.b(var1_1 /* !! */ );
                    try {
                        var7_7 = this.e.openRawResourceFd(var2_11);
                        this.h = var7_7;
                        if (var7_7 == null) break block21;
                    }
                    catch (Resources.NotFoundException var1_4) {
                        throw new a(2005, null, (Exception)var1_4);
                    }
                    var3_12 = var7_7.getLength();
                    this.i = var8_8 = new FileInputStream(var7_7.getFileDescriptor());
                    cfr_temp_0 = var3_12 - -1L;
                    var2_11 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var2_11 != 0) {
                        try {
                            if (var1_1 /* !! */ .f > var3_12) {
                                var1_1 /* !! */  = new a(2008, null, null);
                                throw var1_1 /* !! */ ;
                            }
                        }
                        catch (IOException var1_2) {
                            throw new a(2000, null, var1_2);
                        }
                        catch (a var1_3) {
                            throw var1_3;
                        }
                    }
                    var5_13 = var7_7.getStartOffset();
                    if ((var5_13 = var8_8.skip(var1_1 /* !! */ .f + var5_13) - var5_13) != var1_1 /* !! */ .f) ** GOTO lbl93
                    if (var2_11 != 0) break block23;
                    var7_7 = var8_8.getChannel();
                    if (var7_7.size() == 0L) {
                        this.j = -1L;
                        break block22;
                    } else {
                        this.j = var3_12 = var7_7.size() - var7_7.position();
                        if (var3_12 < 0L) {
                            var1_1 /* !! */  = new a(2008, null, null);
                            throw var1_1 /* !! */ ;
                        }
                    }
                    break block22;
                }
                this.j = var3_12 -= var5_13;
                if (var3_12 < 0L) ** GOTO lbl-1000
            }
            var3_12 = var1_1 /* !! */ .g;
            if (var3_12 != -1L) {
                var5_13 = this.j;
                if (var5_13 != -1L) {
                    var3_12 = Math.min(var5_13, var3_12);
                }
                this.j = var3_12;
            }
            this.k = true;
            this.c(var1_1 /* !! */ );
            var3_12 = var1_1 /* !! */ .g;
            if (var3_12 == -1L) return this.j;
            return var3_12;
lbl-1000:
            // 1 sources

            {
                var1_1 /* !! */  = new mv(2008);
                throw var1_1 /* !! */ ;
lbl93:
                // 1 sources

                var1_1 /* !! */  = new a(2008, null, null);
                throw var1_1 /* !! */ ;
            }
        }
        var1_1 /* !! */  = new StringBuilder("Resource is compressed: ");
        var1_1 /* !! */ .append(var9_6);
        throw new a(2000, var1_1 /* !! */ .toString(), null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() throws a {
        Throwable throwable422222;
        block21: {
            Throwable throwable2222222;
            IOException iOException322222;
            block20: {
                Throwable throwable3222222;
                Object object;
                block19: {
                    block18: {
                        this.g = null;
                        object = this.i;
                        if (object != null) {
                            ((InputStream)object).close();
                        }
                        this.i = null;
                        object = this.h;
                        if (object != null) {
                            object.close();
                        }
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            this.e();
                        }
                        return;
                        catch (Throwable throwable3222222) {
                            break block18;
                        }
                        catch (IOException iOException2) {}
                        {
                            a a14 = new a(2000, null, iOException2);
                            throw a14;
                        }
                    }
                    this.i = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.h = null;
                        if (!this.k) break block19;
                        this.k = false;
                        this.e();
                    }
                    catch (Throwable throwable422222) {
                        break block21;
                    }
                    catch (IOException iOException322222) {}
                }
                throw throwable3222222;
                catch (Throwable throwable2222222) {
                    break block20;
                }
                catch (IOException iOException4) {}
                {
                    object = new a(2000, null, iOException4);
                    throw object;
                }
            }
            this.h = null;
            if (this.k) {
                this.k = false;
                this.e();
            }
            throw throwable2222222;
            {
                a a15 = new a(2000, null, iOException322222);
                throw a15;
            }
        }
        this.h = null;
        if (this.k) {
            this.k = false;
            this.e();
        }
        throw throwable422222;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.g;
    }

    /*
     * Unable to fully structure code
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) throws a {
        block6: {
            if (var3_4 == 0) {
                return 0;
            }
            var5_5 = this.j;
            if (var5_5 == 0L) {
                return -1;
            }
            if (var5_5 == -1L) ** GOTO lbl10
            var7_6 = var3_4;
            try {
                var3_4 = (int)Math.min(var5_5, var7_6);
lbl10:
                // 2 sources

                var9_7 = this.i;
                var4_8 = m92.a;
                var2_3 = var9_7.read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    if (this.j == -1L) {
                        return -1;
                    }
                    throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
                }
                var5_5 = this.j;
                if (var5_5 == -1L) break block6;
            }
            catch (IOException var1_2) {
                throw new a(2000, null, var1_2);
            }
            this.j = var5_5 - (long)var2_3;
        }
        this.c(var2_3);
        return var2_3;
    }

    public static final class a
    extends mv {
        public a(int n10, @Nullable String string2, @Nullable Exception exception) {
            super(n10, string2, (Throwable)exception);
        }
    }
}

