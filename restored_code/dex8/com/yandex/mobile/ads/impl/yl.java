/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.hm1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.x70
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b21;
import com.yandex.mobile.ads.impl.hm1;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.r82;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.x70;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

public final class yl
implements hm1 {
    private final x70 a;
    @Nullable
    private t70 b;
    @Nullable
    private oz c;

    public yl(x70 x702) {
        this.a = x702;
    }

    public final int a(qj1 qj12) throws IOException {
        t70 t702 = this.b;
        t702.getClass();
        oz oz3 = this.c;
        oz3.getClass();
        return t702.a((u70)oz3, qj12);
    }

    public final void a() {
        t70 t702 = this.b;
        if (t702 instanceof b21) {
            ((b21)t702).a();
        }
    }

    public final void a(long l10, long l11) {
        t70 t702 = this.b;
        t702.getClass();
        t702.a(l10, l11);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(lv object, Uri uri, Map object22, long l10, long l11, v70 object3) throws IOException {
        StringBuilder stringBuilder;
        block16: {
            int n13;
            int n10;
            t70[] throwable2;
            void var2_5;
            void var4_12;
            oz oz3;
            block15: {
                void var3_6;
                void var6_13;
                this.c = oz3 = new oz((lv)object, (long)var4_12, (long)var6_13);
                if (this.b != null) {
                    return;
                }
                throwable2 = this.a.a((Uri)var2_5, (Map)var3_6);
                n10 = throwable2.length;
                n13 = 0;
                if (n10 != 1) break block15;
                this.b = throwable2[0];
                break block16;
            }
            for (t70 t702 : throwable2) {
                block14: {
                    Throwable throwable322;
                    block13: {
                        try {
                            if (t702.a((u70)oz3)) {
                                this.b = t702;
                                oz3.c();
                                break;
                            }
                        }
                        catch (Throwable throwable322) {
                            break block13;
                        }
                        catch (EOFException eOFException) {
                            if (this.b == null && oz3.a() != var4_12) {
                                throw new IllegalStateException();
                            }
                            break block14;
                        }
                        if (this.b == null && oz3.a() != var4_12) {
                            throw new IllegalStateException();
                        }
                        break block14;
                    }
                    if (this.b == null && oz3.a() != var4_12) {
                        throw new IllegalStateException();
                    }
                    oz3.c();
                    throw throwable322;
                }
                oz3.c();
            }
            if (this.b == null) {
                StringBuilder stringBuilder2 = new StringBuilder("None of the available extractors (");
                n10 = m92.a;
                stringBuilder = new StringBuilder();
                n10 = n13;
                while (true) {
                    if (n10 >= throwable2.length) {
                        stringBuilder2.append(stringBuilder.toString());
                        stringBuilder2.append(") could read the stream.");
                        String string2 = stringBuilder2.toString();
                        var2_5.getClass();
                        throw new r82(string2);
                    }
                    stringBuilder.append(throwable2[n10].getClass().getSimpleName());
                    if (n10 < throwable2.length - 1) {
                        stringBuilder.append(", ");
                    }
                    ++n10;
                }
            }
        }
        this.b.a((v70)stringBuilder);
    }

    public final long b() {
        oz oz3 = this.c;
        long l10 = oz3 != null ? oz3.a() : -1L;
        return l10;
    }

    public final void c() {
        t70 t702 = this.b;
        if (t702 != null) {
            t702.release();
            this.b = null;
        }
        this.c = null;
    }
}

