/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.ou2
 *  com.yandex.mobile.ads.impl.pu2
 *  com.yandex.mobile.ads.impl.qu2
 *  com.yandex.mobile.ads.impl.ru2
 *  com.yandex.mobile.ads.impl.su2
 *  com.yandex.mobile.ads.impl.tu2
 *  com.yandex.mobile.ads.impl.uu2
 *  com.yandex.mobile.ads.impl.vu2
 *  com.yandex.mobile.ads.impl.wu2
 *  com.yandex.mobile.ads.impl.xu2
 *  com.yandex.mobile.ads.impl.yu2
 *  com.yandex.mobile.ads.impl.zs
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.ou2;
import com.yandex.mobile.ads.impl.pu2;
import com.yandex.mobile.ads.impl.qu2;
import com.yandex.mobile.ads.impl.ru2;
import com.yandex.mobile.ads.impl.su2;
import com.yandex.mobile.ads.impl.tu2;
import com.yandex.mobile.ads.impl.uu2;
import com.yandex.mobile.ads.impl.vu2;
import com.yandex.mobile.ads.impl.wu2;
import com.yandex.mobile.ads.impl.xu2;
import com.yandex.mobile.ads.impl.yu2;
import com.yandex.mobile.ads.impl.zs;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class hm0
implements zs {
    @NotNull
    private final Object a;
    @NotNull
    private final ct0 b;
    @NotNull
    private final LinkedHashMap c;

    public /* synthetic */ hm0() {
        this(new Object(), new ct0());
    }

    public hm0(@NotNull Object object, @NotNull ct0 ct02) {
        this.a = object;
        this.b = ct02;
        this.c = new LinkedHashMap();
    }

    private static final void a(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).h(co02);
        }
    }

    private static final void a(Set object, co0 co02, float f11) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).a(co02, f11);
        }
    }

    private static final void a(Set object, co0 co02, id2 id22) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).a(co02, id22);
        }
    }

    private static final void b(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).i(co02);
        }
    }

    public static /* synthetic */ void b(Set set, co0 co02, float f11) {
        hm0.a(set, co02, f11);
    }

    private static final void c(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).g(co02);
        }
    }

    private static final void d(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).c(co02);
        }
    }

    private static final void e(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).b(co02);
        }
    }

    private static final void f(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).e(co02);
        }
    }

    private static final void g(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).a(co02);
        }
    }

    private static final void h(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).d(co02);
        }
    }

    private static final void i(Set object, co0 co02) {
        object = object.iterator();
        while (object.hasNext()) {
            ((zs)object.next()).f(co02);
        }
    }

    private final HashSet j(co0 object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            object = (Set)this.c.get(object);
                            if (object == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        object = new HashSet(object);
                        break block5;
                    }
                    object = null;
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ void j(Set set, co0 co02) {
        hm0.g(set, co02);
    }

    public static /* synthetic */ void k(Set set, co0 co02) {
        hm0.f(set, co02);
    }

    public static /* synthetic */ void l(Set set, co0 co02) {
        hm0.a(set, co02);
    }

    public static /* synthetic */ void m(Set set, co0 co02) {
        hm0.b(set, co02);
    }

    public static /* synthetic */ void n(Set set, co0 co02, id2 id22) {
        hm0.a(set, co02, id22);
    }

    public static /* synthetic */ void o(Set set, co0 co02) {
        hm0.d(set, co02);
    }

    public static /* synthetic */ void p(Set set, co0 co02) {
        hm0.i(set, co02);
    }

    public static /* synthetic */ void q(Set set, co0 co02) {
        hm0.h(set, co02);
    }

    public static /* synthetic */ void r(Set set, co0 co02) {
        hm0.c(set, co02);
    }

    public static /* synthetic */ void s(Set set, co0 co02) {
        hm0.e(set, co02);
    }

    public final void a() {
        this.b.a();
    }

    public final void a(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new tu2((Set)hashSet, co02));
        }
    }

    public final void a(@NotNull co0 co02, float f11) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new vu2((Set)hashSet, co02, f11));
        }
    }

    public final void a(@NotNull co0 co02, @NotNull id2 id22) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new ou2((Set)hashSet, co02, id22));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull co0 co02, @NotNull zs zs3) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                HashSet<zs> hashSet;
                block3: {
                    try {
                        HashSet<zs> hashSet2;
                        hashSet = hashSet2 = (HashSet<zs>)this.c.get(co02);
                        if (hashSet2 != null) break block3;
                        hashSet = new HashSet<zs>();
                        this.c.put(co02, hashSet);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                hashSet.add(zs3);
                return;
            }
            throw throwable2;
        }
    }

    public final void b(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new pu2((Set)hashSet, co02));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(@NotNull co0 object, @NotNull zs zs3) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = (Set)this.c.get(object);
                        if (object == null) break block4;
                        object = object.iterator();
                        while (object.hasNext()) {
                            if (!y.e(zs3, (zs)object.next())) continue;
                            object.remove();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }

    public final void c(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new qu2((Set)hashSet, co02));
        }
    }

    public final void d(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new xu2((Set)hashSet, co02));
        }
    }

    public final void e(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new yu2((Set)hashSet, co02));
        }
    }

    public final void f(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new uu2((Set)hashSet, co02));
        }
    }

    public final void g(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new wu2((Set)hashSet, co02));
        }
    }

    public final void h(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new su2((Set)hashSet, co02));
        }
    }

    public final void i(@NotNull co0 co02) {
        HashSet hashSet = this.j(co02);
        if (hashSet != null) {
            this.b.a((Runnable)new ru2((Set)hashSet, co02));
        }
    }
}

