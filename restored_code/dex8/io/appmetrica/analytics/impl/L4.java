/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.Pair
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.D;
import io.appmetrica.analytics.impl.dj;
import io.appmetrica.analytics.impl.dn;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.impl.ij;
import io.appmetrica.analytics.impl.k4;
import io.appmetrica.analytics.impl.kj;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.oo;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.y3;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import kotlin.t;

public final class l4
extends o6 {
    public HashMap q = new HashMap();
    public fn r;
    public dn s;
    public dn t;
    public y3 u;
    public fn v;

    @VisibleForTesting
    public l4(@NonNull PublicLogger publicLogger) {
        this.a(publicLogger);
    }

    public l4(String string2, int n10, @NonNull PublicLogger publicLogger) {
        this("", string2, n10, publicLogger);
    }

    public l4(String string2, String string3, int n10, int n13, @NonNull PublicLogger publicLogger) {
        this.a(publicLogger);
        this.b = this.e(string2);
        this.a = this.d(string3);
        this.setType(n10);
        this.setCustomType(n13);
    }

    public l4(String string2, String string3, int n10, @NonNull PublicLogger publicLogger) {
        this(string2, string3, n10, 0, publicLogger);
    }

    public l4(byte[] byArray, @Nullable String string2, int n10, @NonNull PublicLogger publicLogger) {
        this.a(publicLogger);
        this.a(byArray);
        this.a = this.d(string2);
        this.setType(n10);
    }

    public static l4 a(PublicLogger object, D object2) {
        object = new l4((PublicLogger)object);
        Bb bb4 = Bb.c;
        ((o6)object).d = 40977;
        object2 = ((D)object2).a();
        ((o6)object).b = ((l4)object).e(new String(Base64.encode((byte[])((byte[])((t)object2).c()), (int)0)));
        ((o6)object).g = (Integer)((t)object2).d();
        return object;
    }

    public static l4 a(PublicLogger object, kj object2) {
        int n10;
        object = new l4((PublicLogger)object);
        Object object3 = Bb.c;
        ((o6)object).d = 40976;
        object3 = new ij();
        ((ij)object3).b = ((kj)object2).a.currency.getCurrencyCode().getBytes();
        ((ij)object3).f = ((kj)object2).a.priceMicros;
        ((ij)object3).c = StringUtils.stringToBytesForProtobuf(new fn(200, "revenue productID", ((kj)object2).e).a(((kj)object2).a.productID));
        ((ij)object3).a = WrapUtils.getOrDefault(((kj)object2).a.quantity, 1);
        Object object4 = ((kj)object2).b;
        Object object5 = ((kj)object2).a.payload;
        object4.getClass();
        ((ij)object3).d = StringUtils.stringToBytesForProtobuf(((dn)object4).a((String)object5));
        if (ro.a(((kj)object2).a.receipt)) {
            object5 = new dj();
            object4 = (String)((kj)object2).c.a(((kj)object2).a.receipt.data);
            n10 = true ^ StringUtils.equalsNullSafety(((kj)object2).a.receipt.data, (String)object4) ? ((kj)object2).a.receipt.data.length() : 0;
            object2 = (String)((kj)object2).d.a(((kj)object2).a.receipt.signature);
            ((dj)object5).a = StringUtils.stringToBytesForProtobuf((String)object4);
            ((dj)object5).b = StringUtils.stringToBytesForProtobuf((String)object2);
            ((ij)object3).e = object5;
        } else {
            n10 = 0;
        }
        object2 = new Pair((Object)MessageNano.toByteArray((MessageNano)object3), (Object)n10);
        ((o6)object).b = ((l4)object).e(new String(Base64.encode((byte[])((byte[])((Pair)object2).first), (int)0)));
        ((o6)object).g = (Integer)((Pair)object2).second;
        return object;
    }

    public static o6 a(@NonNull oo oo3) {
        o6 o63 = l4.o();
        o63.setValue(new String(Base64.encode((byte[])MessageNano.toByteArray(oo3), (int)0)));
        return o63;
    }

    public static o6 b(String string2, String string3) {
        o6 o63 = new o6("", 0);
        Bb bb4 = Bb.c;
        o63.d = 5376;
        o63.a(string2, string3);
        return o63;
    }

    public static o6 n() {
        o6 o63 = new o6("", 0);
        Bb bb4 = Bb.c;
        o63.d = 5632;
        return o63;
    }

    public static o6 o() {
        o6 o63 = new o6("", 0);
        Bb bb4 = Bb.c;
        o63.d = 40961;
        return o63;
    }

    public final l4 a(@NonNull HashMap<k4, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.r = new fn(1000, "event name", publicLogger);
        this.s = new dn(245760, "event value", publicLogger);
        this.t = new dn(1024000, "event extended value", publicLogger);
        this.u = new y3(245760, "event value bytes", publicLogger);
        this.v = new fn(200, "user profile id", publicLogger);
    }

    public final void a(String object, String string2, k4 k44) {
        if (StringUtils.equalsNullSafety((String)object, string2) ^ true) {
            this.q.put(k44, StringUtils.getUTF8Bytes((String)object).length - StringUtils.getUTF8Bytes(string2).length);
        } else {
            this.q.remove((Object)k44);
        }
        object = this.q.values().iterator();
        int n10 = 0;
        while (object.hasNext()) {
            n10 += ((Integer)object.next()).intValue();
        }
        this.g = n10;
    }

    public final void a(byte[] object) {
        Object object2 = this.u;
        object2.getClass();
        object2 = ((y3)object2).a((byte[])object);
        k4 k44 = k4.b;
        if (((byte[])object).length != ((Object)object2).length) {
            this.q.put(k44, ((byte[])object).length - ((Object)object2).length);
        } else {
            this.q.remove((Object)k44);
        }
        object = this.q.values().iterator();
        int n10 = 0;
        while (object.hasNext()) {
            n10 += ((Integer)object.next()).intValue();
        }
        this.g = n10;
        super.setValueBytes((byte[])object2);
    }

    @Override
    @NonNull
    public final void c(@Nullable String string2) {
        fn fn3 = this.v;
        fn3.getClass();
        this.h = fn3.a(string2);
    }

    public final String d(String string2) {
        Object object = this.r;
        object.getClass();
        object = ((fn)object).a(string2);
        this.a(string2, (String)object, k4.a);
        return object;
    }

    public final String e(String string2) {
        Object object = this.s;
        object.getClass();
        object = ((dn)object).a(string2);
        this.a(string2, (String)object, k4.b);
        return object;
    }

    public final l4 f(@NonNull String string2) {
        Object object = this.t;
        object.getClass();
        object = ((dn)object).a(string2);
        this.a(string2, (String)object, k4.b);
        this.b = object;
        return this;
    }

    @NonNull
    public final HashMap<k4, Integer> p() {
        return this.q;
    }

    @Override
    public final void setName(@Nullable String string2) {
        this.a = this.d(string2);
    }

    @Override
    public final void setValue(@Nullable String string2) {
        this.b = this.e(string2);
    }

    @Override
    @Nullable
    public final void setValueBytes(@Nullable byte[] byArray) {
        this.a(byArray);
    }
}

