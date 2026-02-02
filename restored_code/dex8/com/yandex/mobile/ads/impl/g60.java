/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  androidx.annotation.CheckResult
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mw0
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.lt2;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mw0;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.yh1;
import java.io.IOException;

public final class g60
extends yh1 {
    public final int d;
    @Nullable
    public final String e;
    public final int f;
    @Nullable
    public final cc0 g;
    public final int h;
    @Nullable
    public final mw0 i;
    final boolean j;

    static {
        new lt2();
    }

    private g60(int n10, Throwable throwable, @Nullable int n12, int n13) {
        this(g60.a(n10, null, null, -1, null, 4), throwable, n12, n10, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    private g60(Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(yh1.a(1001), 2);
        this.e = bundle.getString(yh1.a(1002));
        this.f = bundle.getInt(yh1.a(1003), -1);
        Object object = bundle.getBundle(yh1.a(1004));
        object = object == null ? null : (cc0)cc0.I.fromBundle(object);
        this.g = object;
        this.h = bundle.getInt(yh1.a(1005), 4);
        this.j = bundle.getBoolean(yh1.a(1006), false);
        this.i = null;
    }

    private g60(String string2, @Nullable Throwable throwable, int n10, int n12, @Nullable String string3, int n13, @Nullable cc0 cc02, int n14, @Nullable qw0.b b10, long l10, boolean bl2) {
        boolean bl3;
        block4: {
            block3: {
                super(string2, throwable, n10, l10);
                boolean bl4 = false;
                bl3 = !bl2 || n12 == 1;
                uf.a((boolean)bl3);
                if (throwable != null) break block3;
                bl3 = bl4;
                if (n12 != 3) break block4;
            }
            bl3 = true;
        }
        uf.a((boolean)bl3);
        this.d = n12;
        this.e = string3;
        this.f = n13;
        this.g = cc02;
        this.h = n14;
        this.i = b10;
        this.j = bl2;
    }

    public static g60 a() {
        return new g60(g60.a(3, "Video load error occurred", null, -1, null, 4), null, 1001, 3, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static g60 a(IOException iOException, int n10) {
        return new g60(0, (Throwable)iOException, n10, 0);
    }

    public static g60 a(Exception exception, String string2, int n10, @Nullable cc0 cc02, int n12, boolean bl2, int n13) {
        if (cc02 == null) {
            n12 = 4;
        }
        return new g60(g60.a(1, null, string2, n10, cc02, n12), exception, n13, 1, string2, n10, cc02, n12, null, SystemClock.elapsedRealtime(), bl2);
    }

    @Deprecated
    public static g60 a(IllegalStateException illegalStateException) {
        return new g60(2, (Throwable)illegalStateException, 1000, 0);
    }

    public static g60 a(RuntimeException runtimeException, int n10) {
        return new g60(2, (Throwable)runtimeException, n10, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(int n10, @Nullable String string2, @Nullable String string3, int n12, @Nullable cc0 object, int n13) {
        if (n10 != 0) {
            if (n10 != 1) {
                string3 = n10 != 3 ? "Unexpected runtime error" : "Remote error";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(" error, index=");
                stringBuilder.append(n12);
                stringBuilder.append(", format=");
                stringBuilder.append(object);
                stringBuilder.append(", format_supported=");
                n10 = m92.a;
                if (n13 != 0) {
                    if (n13 != 1) {
                        if (n13 != 2) {
                            if (n13 != 3) {
                                if (n13 != 4) throw new IllegalStateException();
                                string3 = "YES";
                            } else {
                                string3 = "NO_EXCEEDS_CAPABILITIES";
                            }
                        } else {
                            string3 = "NO_UNSUPPORTED_DRM";
                        }
                    } else {
                        string3 = "NO_UNSUPPORTED_TYPE";
                    }
                } else {
                    string3 = "NO";
                }
                stringBuilder.append(string3);
                string3 = stringBuilder.toString();
            }
        } else {
            string3 = "Source error";
        }
        object = string3;
        if (TextUtils.isEmpty((CharSequence)string2)) return object;
        object = new StringBuilder();
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    public static /* synthetic */ g60 b(Bundle bundle) {
        return new g60(bundle);
    }

    @CheckResult
    final g60 a(@Nullable qw0.b b10) {
        String string2 = this.getMessage();
        int n10 = m92.a;
        return new g60(string2, this.getCause(), this.b, this.d, this.e, this.f, this.g, this.h, b10, this.c, this.j);
    }
}

