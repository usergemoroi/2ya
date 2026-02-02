/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.impl.Ao;
import io.appmetrica.analytics.impl.B3;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.E9;
import io.appmetrica.analytics.impl.G9;
import io.appmetrica.analytics.impl.I9;
import io.appmetrica.analytics.impl.U8;
import io.appmetrica.analytics.impl.V8;
import io.appmetrica.analytics.impl.Vn;
import io.appmetrica.analytics.impl.a9;
import io.appmetrica.analytics.impl.f9;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.impl.hg;
import io.appmetrica.analytics.impl.jg;
import io.appmetrica.analytics.impl.kg;
import io.appmetrica.analytics.impl.t9;
import io.appmetrica.analytics.impl.u9;
import io.appmetrica.analytics.impl.v8;
import io.appmetrica.analytics.impl.w8;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public abstract class lg {
    public static final Map a;
    public static final SparseArray b;
    public static final Map c;
    public static final Map d;

    static {
        Object object = new HashMap();
        Enum enum_ = fl.b;
        object.put(enum_, 0);
        Enum enum_2 = fl.c;
        Object object2 = 1;
        object.put(enum_2, object2);
        a = Collections.unmodifiableMap(object);
        object = new SparseArray();
        object.put(0, (Object)enum_);
        object.put(1, (Object)enum_2);
        b = object;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        enum_2 = Bb.d;
        hashMap.put(enum_2, object2);
        Object object3 = Bb.e;
        hashMap.put(object3, 4);
        Object object4 = Bb.o;
        hashMap.put(object4, 5);
        Bb bb4 = Bb.g;
        hashMap.put((Object)bb4, 7);
        Bb bb5 = Bb.t;
        object2 = 26;
        hashMap.put((Object)bb5, object2);
        Object object5 = Bb.s;
        hashMap.put(object5, object2);
        Bb bb6 = Bb.r;
        hashMap.put((Object)bb6, object2);
        Bb bb7 = Bb.y;
        hashMap.put((Object)bb7, 25);
        Bb bb8 = Bb.x;
        hashMap.put((Object)bb8, object2);
        Bb bb9 = Bb.w;
        hashMap.put((Object)bb9, object2);
        Bb bb10 = Bb.u;
        object2 = 27;
        hashMap.put((Object)bb10, object2);
        Bb bb11 = Bb.v;
        hashMap.put((Object)bb11, object2);
        Bb bb12 = Bb.A;
        hashMap.put((Object)bb12, 13);
        Bb bb13 = Bb.B;
        hashMap.put((Object)bb13, 2);
        object2 = Bb.E;
        hashMap.put(object2, 16);
        Bb bb14 = Bb.F;
        hashMap.put((Object)bb14, 17);
        object = Bb.G;
        hashMap.put(object, 18);
        Bb bb15 = Bb.H;
        hashMap.put((Object)bb15, 19);
        Bb bb16 = Bb.i;
        hashMap.put((Object)bb16, 20);
        Bb bb17 = Bb.k;
        hashMap.put((Object)bb17, 21);
        enum_ = Bb.l;
        hashMap.put(enum_, 40);
        Bb bb18 = Bb.m;
        hashMap.put((Object)bb18, 35);
        hashMap.put((Object)Bb.I, 29);
        Bb bb19 = Bb.J;
        hashMap.put((Object)bb19, 38);
        Bb bb20 = Bb.h;
        hashMap.put((Object)bb20, 42);
        c = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        U8 u82 = new U8();
        Object object6 = new a9(new f9());
        V8 v84 = new V8();
        B3 b34 = new B3(new f9());
        Object object7 = new Vn(new f9());
        Object object8 = new hg();
        Object object9 = u9.a();
        ((t9)object9).b = object8;
        ((t9)object9).c = object8;
        object8 = new u9((t9)object9);
        object9 = u9.a();
        ((t9)object9).b = object6;
        object6 = new u9((t9)object9);
        object9 = u9.a();
        ((t9)object9).b = b34;
        object9 = new u9((t9)object9);
        Object object10 = u9.a();
        ((t9)object10).b = object7;
        object7 = new u9((t9)object10);
        object10 = u9.a();
        ((t9)object10).a = u82;
        object10 = new u9((t9)object10);
        Object object11 = u9.a();
        ((t9)object11).b = new Ao(new a9());
        object11 = new u9((t9)object11);
        hashMap.put(object3, object6);
        object3 = u9.a();
        ((t9)object3).b = new jg();
        hashMap.put(object4, new u9((t9)object3));
        object4 = u9.a();
        ((t9)object4).a = u82;
        ((t9)object4).b = v84;
        ((t9)object4).e = new v8();
        ((t9)object4).f = new w8();
        hashMap.put((Object)bb4, new u9((t9)object4));
        hashMap.put((Object)bb8, object8);
        hashMap.put((Object)bb9, object8);
        hashMap.put((Object)bb10, object9);
        hashMap.put((Object)bb11, object9);
        hashMap.put((Object)bb5, object9);
        hashMap.put(object5, object9);
        hashMap.put((Object)bb6, object9);
        hashMap.put((Object)bb7, object9);
        object5 = u9.a();
        ((t9)object5).a = new U8();
        ((t9)object5).b = b34;
        hashMap.put((Object)bb13, new u9((t9)object5));
        bb6 = Bb.C;
        object5 = u9.a();
        ((t9)object5).d = new kg();
        hashMap.put((Object)bb6, new u9((t9)object5));
        hashMap.put(object2, object6);
        hashMap.put(object, object10);
        hashMap.put((Object)bb15, object10);
        hashMap.put((Object)bb16, object9);
        hashMap.put((Object)bb17, object9);
        hashMap.put(enum_, object9);
        hashMap.put((Object)bb18, object7);
        hashMap.put(enum_2, object11);
        hashMap.put((Object)bb14, object11);
        hashMap.put((Object)bb12, object6);
        hashMap.put((Object)bb19, object6);
        hashMap.put((Object)bb20, object9);
        d = Collections.unmodifiableMap(hashMap);
    }

    public static I9 a(Long l10, Long l11, Boolean bl2) {
        I9 i94 = new I9();
        if (l10 != null) {
            i94.a = l10;
            long l13 = l10;
            i94.b = ((GregorianCalendar)Calendar.getInstance()).getTimeZone().getOffset(l13 * 1000L) / 1000;
        }
        if (l11 != null) {
            i94.c = l11;
        }
        if (bl2 != null) {
            i94.d = bl2;
        }
        return i94;
    }

    public static void a(G9 messageNano2) {
        E9[] e9Array = ((G9)messageNano2).c;
        if (e9Array != null) {
            for (E9 e94 : e9Array) {
            }
        }
    }
}

