/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  kotlin.text.p
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.Hg;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.f8;
import io.appmetrica.analytics.impl.m6;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.ro;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.p;

public final class km
extends m6 {
    public List d;
    public List e;
    public String f;
    public String g;
    public Map h;
    public Q3 i = new Q3(null, q8.c);
    public List j;
    public boolean k;
    public boolean l;
    public String m;
    public long n = 0L;
    public final Hg o;
    public final f8 p;

    public km() {
        this(Na.j().t(), new f8());
    }

    public km(Hg hg3, f8 f84) {
        this.o = hg3;
        this.p = f84;
    }

    public final long a(long l10) {
        if (this.n == 0L) {
            this.n = l10;
        }
        return this.n;
    }

    public final void a(String string2) {
        this.m = string2;
    }

    public final void a(@Nullable List<String> list) {
        this.j = list;
    }

    public final void a(boolean bl2) {
        this.k = bl2;
    }

    @NonNull
    public final Q3 c() {
        return this.i;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.h;
    }

    public final String e() {
        return this.m;
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.n;
    }

    @Nullable
    public final String h() {
        return this.g;
    }

    @Nullable
    public final List<String> i() {
        return this.j;
    }

    @NonNull
    public final Hg j() {
        return this.o;
    }

    /*
     * WARNING - void declaration
     */
    public final List<String> k() {
        void var4_18;
        LinkedHashSet linkedHashSet;
        block13: {
            ArrayList<void> arrayList;
            int n10;
            String[] stringArray;
            block12: {
                void var4_12;
                linkedHashSet = new LinkedHashSet();
                if (!ro.a(this.d)) {
                    linkedHashSet.addAll(this.d);
                }
                if (!ro.a(this.e)) {
                    linkedHashSet.addAll(this.e);
                }
                stringArray = (String[])this.p.a.a();
                n10 = 0;
                if (stringArray == null) break block12;
                arrayList = new ArrayList<void>();
                for (String string2 : stringArray) {
                    void object2;
                    if (string2 == null || !(kotlin.text.p.h0((CharSequence)string2) ^ true)) {
                        Object var4_9 = null;
                    }
                    if (object2 == null) continue;
                    arrayList.add(object2);
                }
                if (arrayList.isEmpty() ^ true) {
                    ArrayList<void> arrayList2 = arrayList;
                } else {
                    Object var4_11 = null;
                }
                if (var4_12 != null) break block13;
            }
            stringArray = BuildConfig.DEFAULT_HOSTS;
            arrayList = new ArrayList();
            int n13 = stringArray.length;
            int n14 = n10;
            while (true) {
                void var4_17;
                ArrayList<void> arrayList3 = arrayList;
                if (n14 >= n13) break;
                String string3 = stringArray[n14];
                if (string3 == null || !(kotlin.text.p.h0((CharSequence)string3) ^ true)) {
                    Object var4_16 = null;
                }
                if (var4_17 != null) {
                    arrayList.add(var4_17);
                }
                ++n14;
            }
        }
        linkedHashSet.addAll(var4_18);
        return new ArrayList<String>(linkedHashSet);
    }

    public final List<String> l() {
        return this.e;
    }

    public final List<String> m() {
        return this.d;
    }

    @Nullable
    public final boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.l;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupRequestConfig{mStartupHostsFromStartup=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mStartupHostsFromClient=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mDistributionReferrer='");
        stringBuilder.append(this.f);
        stringBuilder.append("', mInstallReferrerSource='");
        stringBuilder.append(this.g);
        stringBuilder.append("', mClidsFromClient=");
        stringBuilder.append(this.h);
        stringBuilder.append(", mNewCustomHosts=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mHasNewCustomHosts=");
        stringBuilder.append(this.k);
        stringBuilder.append(", mSuccessfulStartup=");
        stringBuilder.append(this.l);
        stringBuilder.append(", mCountryInit='");
        stringBuilder.append(this.m);
        stringBuilder.append("', mFirstStartupTime=");
        stringBuilder.append(this.n);
        stringBuilder.append("} ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}

