/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.CheckResult
 *  androidx.annotation.IntRange
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.t63
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.r63;
import com.yandex.mobile.ads.impl.s63;
import com.yandex.mobile.ads.impl.t63;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vl;
import java.util.ArrayList;
import java.util.Arrays;

public final class w4
implements vl {
    public static final w4 h = new w4(null, new a[0], 0L, -9223372036854775807L, 0);
    private static final a i = new a(0L, -1, new int[0], new Uri[0], new long[0], 0L, false, null).a();
    public static final vl.a<w4> j = new r63();
    @Nullable
    public final Object b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    private final a[] g;

    private w4(@Nullable Object object, a[] aArray, long l10, long l11, int n10) {
        this.b = object;
        this.d = l10;
        this.e = l11;
        this.c = aArray.length + n10;
        this.g = aArray;
        this.f = n10;
    }

    private static w4 a(Bundle bundle) {
        a[] aArray;
        ArrayList arrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (arrayList == null) {
            aArray = new a[]{};
        } else {
            aArray = new a[arrayList.size()];
            for (int i14 = 0; i14 < arrayList.size(); ++i14) {
                aArray[i14] = (a)a.i.fromBundle((Bundle)arrayList.get(i14));
            }
        }
        return new w4(null, aArray, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public static /* synthetic */ w4 b(Bundle bundle) {
        return w4.a(bundle);
    }

    public final a a(@IntRange(from=0L) int n10) {
        int n13 = this.f;
        a a14 = n10 < n13 ? i : this.g[n10 - n13];
        return a14;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && w4.class == object.getClass()) {
            object = (w4)object;
            if (!m92.a((Object)this.b, (Object)((w4)object).b) || this.c != ((w4)object).c || this.d != ((w4)object).d || this.e != ((w4)object).e || this.f != ((w4)object).f || !Arrays.equals(this.g, ((w4)object).g)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.c;
        Object object = this.b;
        int n13 = object == null ? 0 : object.hashCode();
        return ((((n10 * 31 + n13) * 31 + (int)this.d) * 31 + (int)this.e) * 31 + this.f) * 31 + Arrays.hashCode(this.g);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdPlaybackState(adsId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", adResumePositionUs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", adGroups=[");
        for (int i14 = 0; i14 < this.g.length; ++i14) {
            stringBuilder.append("adGroup(timeUs=");
            stringBuilder.append(this.g[i14].b);
            stringBuilder.append(", ads=[");
            for (int i15 = 0; i15 < this.g[i14].e.length; ++i15) {
                stringBuilder.append("ad(state=");
                int n10 = this.g[i14].e[i15];
                if (n10 != 0) {
                    if (n10 != 1) {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 != 4) {
                                    stringBuilder.append('?');
                                } else {
                                    stringBuilder.append('!');
                                }
                            } else {
                                stringBuilder.append('P');
                            }
                        } else {
                            stringBuilder.append('S');
                        }
                    } else {
                        stringBuilder.append('R');
                    }
                } else {
                    stringBuilder.append('_');
                }
                stringBuilder.append(", durationUs=");
                stringBuilder.append(this.g[i14].f[i15]);
                stringBuilder.append(')');
                if (i15 >= this.g[i14].e.length - 1) continue;
                stringBuilder.append(", ");
            }
            stringBuilder.append("])");
            if (i14 >= this.g.length - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public static final class a
    implements vl {
        public static final vl.a<a> i = new s63();
        public final long b;
        public final int c;
        public final Uri[] d;
        public final int[] e;
        public final long[] f;
        public final long g;
        public final boolean h;

        private a(long l10, int n10, int[] nArray, Uri[] uriArray, long[] lArray, long l11, boolean bl2) {
            boolean bl3 = nArray.length == uriArray.length;
            uf.a((boolean)bl3);
            this.b = l10;
            this.c = n10;
            this.e = nArray;
            this.d = uriArray;
            this.f = lArray;
            this.g = l11;
            this.h = bl2;
        }

        /* synthetic */ a(long l10, int n10, int[] nArray, Uri[] uriArray, long[] lArray, long l11, boolean bl2, t63 t632) {
            this(l10, n10, nArray, uriArray, lArray, l11, bl2);
        }

        private static a a(Bundle object) {
            long l10 = object.getLong(Integer.toString(0, 36));
            int n10 = object.getInt(Integer.toString(1, 36), -1);
            ArrayList arrayList = object.getParcelableArrayList(Integer.toString(2, 36));
            Object[] objectArray = object.getIntArray(Integer.toString(3, 36));
            long[] lArray = object.getLongArray(Integer.toString(4, 36));
            long l11 = object.getLong(Integer.toString(5, 36));
            boolean bl2 = object.getBoolean(Integer.toString(6, 36));
            object = objectArray == null ? (Object)new int[0] : (Object)objectArray;
            objectArray = arrayList == null ? (Object[])new Uri[0] : (Object[])arrayList.toArray(new Uri[0]);
            if (lArray == null) {
                lArray = new long[]{};
            }
            return new a(l10, n10, (int[])object, (Uri[])objectArray, lArray, l11, bl2);
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a.a(bundle);
        }

        public final int a(@IntRange(from=-1L) int n10) {
            int n13;
            int[] nArray;
            ++n10;
            while (n10 < (nArray = this.e).length && !this.h && (n13 = nArray[n10]) != 0 && n13 != 1) {
                ++n10;
            }
            return n10;
        }

        @CheckResult
        public final a a() {
            int[] nArray = this.e;
            int n10 = nArray.length;
            int n13 = Math.max(0, n10);
            nArray = Arrays.copyOf(nArray, n13);
            Arrays.fill(nArray, n10, n13, 0);
            Object[] objectArray = this.f;
            n13 = objectArray.length;
            n10 = Math.max(0, n13);
            long[] lArray = Arrays.copyOf(objectArray, n10);
            Arrays.fill(lArray, n13, n10, -9223372036854775807L);
            objectArray = Arrays.copyOf(this.d, 0);
            return new a(this.b, 0, nArray, (Uri[])objectArray, lArray, this.g, this.h);
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (!(this.b == ((a)object).b && this.c == ((a)object).c && Arrays.equals(this.d, ((a)object).d) && Arrays.equals(this.e, ((a)object).e) && Arrays.equals(this.f, ((a)object).f) && this.g == ((a)object).g && this.h == ((a)object).h)) {
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public final int hashCode() {
            int n10 = this.c;
            long l10 = this.b;
            int n13 = (int)(l10 ^ l10 >>> 32);
            int n14 = Arrays.hashCode(this.d);
            int n15 = Arrays.hashCode(this.e);
            int n16 = Arrays.hashCode(this.f);
            l10 = this.g;
            return ((n16 + (n15 + ((n10 * 31 + n13) * 31 + n14) * 31) * 31) * 31 + (int)(l10 ^ l10 >>> 32)) * 31 + this.h;
        }
    }
}

