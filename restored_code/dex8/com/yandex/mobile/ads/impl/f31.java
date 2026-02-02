/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d62
 *  com.yandex.mobile.ads.impl.dh1
 *  com.yandex.mobile.ads.impl.f72
 *  com.yandex.mobile.ads.impl.f9
 *  com.yandex.mobile.ads.impl.gh1
 *  com.yandex.mobile.ads.impl.gy1
 *  com.yandex.mobile.ads.impl.hk0
 *  com.yandex.mobile.ads.impl.hy1
 *  com.yandex.mobile.ads.impl.i9
 *  com.yandex.mobile.ads.impl.ld1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.p62
 *  com.yandex.mobile.ads.impl.pd1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.rd1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 *  com.yandex.mobile.ads.impl.w62
 *  com.yandex.mobile.ads.impl.x62
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.d62;
import com.yandex.mobile.ads.impl.dh1;
import com.yandex.mobile.ads.impl.f72;
import com.yandex.mobile.ads.impl.f9;
import com.yandex.mobile.ads.impl.gh1;
import com.yandex.mobile.ads.impl.gy1;
import com.yandex.mobile.ads.impl.hk0;
import com.yandex.mobile.ads.impl.hy1;
import com.yandex.mobile.ads.impl.i9;
import com.yandex.mobile.ads.impl.ld1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.p62;
import com.yandex.mobile.ads.impl.pd1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.rd1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.w62;
import com.yandex.mobile.ads.impl.x62;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f31
implements pd1 {
    @NotNull
    private final Context a;
    @NotNull
    private final ld1 b;
    @NotNull
    private final p62 c;
    @NotNull
    private final String d;
    @NotNull
    private final f9 e;
    @NotNull
    private final i9 f;
    @NotNull
    private final pw1 g;
    @NotNull
    private final d62 h;
    @NotNull
    private final x62 i;
    @Nullable
    private hk0 j;
    private boolean k;
    private boolean l;
    @NotNull
    private final ArrayList m;

    @JvmOverloads
    public f31(@NotNull Context context, @NotNull ld1 ld12, @NotNull p62 p622, @NotNull String string2, @NotNull f9 f92, @NotNull i9 i92, @NotNull pw1 pw12, @NotNull d62 d622, @NotNull x62 x622) {
        this.a = context;
        this.b = ld12;
        this.c = p622;
        this.d = string2;
        this.e = f92;
        this.f = i92;
        this.g = pw12;
        this.h = d622;
        this.i = x622;
        this.m = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(w62 w622, u92 u922) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (u922.c() != u92.a.c) break block3;
                            this.f.a(w622.d(), f72.h);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.b.a(w622.c(), u922);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    int n10 = op0.b;
                    this.h.a();
                    Iterator iterator = this.m.iterator();
                    while (iterator.hasNext()) {
                        ((w62)iterator.next()).a(null);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(@NotNull b8<?> b82, @NotNull List<gy1> list) {
        synchronized (this) {
            int n10 = op0.b;
            this.b.a(b82);
            this.m.clear();
            this.b.invalidate();
            this.l = false;
            this.a();
            this.a(list);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull dh1 dh12, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    block5: {
                        try {
                            Objects.toString(dh12);
                            int n10 = op0.b;
                            n10 = dh12.ordinal();
                            if (n10 == 0) break block5;
                            if (n10 != 1) {
                                if (n10 == 2) break block5;
                                break block6;
                            }
                            this.a();
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if (bl2) {
                        this.b();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(@NotNull hk0 hk02) {
        this.j = hk02;
    }

    public final void a(@NotNull w62 w622) {
        this.f.a(w622.d(), f72.h);
        this.m.remove(w622);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @VisibleForTesting
    public final void a(@NotNull List<gy1> object) {
        synchronized (this) {
            Object object22;
            int n10;
            Object object3;
            Object object4;
            Object object5;
            block17: {
                Throwable throwable2;
                block15: {
                    try {
                        this.m.clear();
                        object5 = this.i;
                        object4 = this.e;
                        object5.getClass();
                        object3 = new ArrayList(t.x(object, (int)10));
                        object5 = object.iterator();
                        while (object5.hasNext()) {
                            ((ArrayList)object3).add(((gy1)object5.next()).b());
                        }
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                    object5 = t.j1(object3);
                    n10 = ((Enum)object4).ordinal();
                    if (n10 != 0) {
                        if (n10 != 1) {
                            if (n10 != 2) {
                                object = new r();
                                throw object;
                            }
                            object4 = hy1.b;
                        } else {
                            object4 = hy1.c;
                        }
                    } else if (!(object5 instanceof Collection) || !object5.isEmpty()) {
                        object4 = object5.iterator();
                        while (object4.hasNext()) {
                            if ((hy1)object4.next() != hy1.c) continue;
                            object4 = null;
                            break;
                        }
                    } else {
                        object4 = hy1.b;
                    }
                    object5 = new ArrayList();
                    object3 = new ArrayList();
                    for (Object object22 : object) {
                        if (((gy1)object22).c() == null) continue;
                        ((ArrayList)object3).add(object22);
                    }
                    break block17;
                }
                throw throwable2;
            }
            object22 = ((ArrayList)object3).iterator();
            while (true) {
                if (!object22.hasNext()) {
                    this.m.addAll(object5);
                    return;
                }
                object = (gy1)object22.next();
                object3 = object.c();
                long l10 = object.a();
                n10 = object.d();
                object = object.b() == hy1.d ? (object4 == null ? object.b() : object4) : object.b();
                if (object3 == null) continue;
                w62 w622 = new w62(n10, l10, (hy1)object, (String)object3);
                ((ArrayList)object5).add(w622);
            }
        }
    }

    @NotNull
    public final u92 b(@NotNull w62 w622) {
        w622 = this.c.b(w622.e());
        w622.c().a();
        int n10 = op0.b;
        return w622;
    }

    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n10 = op0.b;
                        if (!gh1.h.a(this.a).b() || !(this.m.isEmpty() ^ true) || this.h.b()) break block3;
                        this.h.a((pd1)this);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            Iterator iterator;
            ArrayList<rd1> arrayList;
            int n10;
            try {
                this.m.size();
                n10 = op0.b;
                this.a();
                arrayList = new ArrayList<rd1>();
                iterator = this.m.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                Object object;
                if (!iterator.hasNext()) {
                    this.b.a(arrayList);
                    this.b();
                    return;
                }
                w62 w622 = (w62)iterator.next();
                ou1 ou12 = this.g.a(this.a);
                ou12 = ou12 != null && ou12.l0() ? this.c.b(w622.e()) : this.c.a(w622.e());
                ou12.c().getClass();
                n10 = op0.b;
                this.a(w622, (u92)ou12);
                if (ou12.c() == u92.a.c) {
                    iterator.remove();
                    this.f();
                    this.e();
                    this.b.a(w622.c());
                    ou12 = this.b;
                    w622 = w622.c();
                    Object object2 = this.m;
                    object = new ArrayList(t.x((Iterable)object2, (int)10));
                    object2 = ((ArrayList)object2).iterator();
                    while (object2.hasNext()) {
                        ((ArrayList)object).add(((w62)object2.next()).c());
                    }
                    ou12.a((hy1)w622, (List)object);
                    continue;
                }
                object = new rd1(w622, (u92)ou12);
                arrayList.add((rd1)object);
            }
        }
    }

    @NotNull
    public final List<w62> d() {
        return t.e1((Iterable)this.m);
    }

    public final void e() {
        if (!this.l && this.m.isEmpty()) {
            this.l = true;
            hk0 hk02 = this.j;
            if (hk02 != null) {
                hk02.g();
            }
        }
    }

    public final void f() {
        if (!this.k) {
            this.k = true;
            hk0 hk02 = this.j;
            if (hk02 != null) {
                hk02.c();
            }
        }
    }
}

