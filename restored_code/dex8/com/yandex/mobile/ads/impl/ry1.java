/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.gy
 *  com.yandex.mobile.ads.impl.iy
 *  com.yandex.mobile.ads.impl.ry1$a
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.gy;
import com.yandex.mobile.ads.impl.iy;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.ky;
import com.yandex.mobile.ads.impl.ry1;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.wy1;
import java.util.ArrayDeque;

public abstract class ry1<I extends jy, O extends ky, E extends iy>
implements gy<I, O, E> {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque();
    private final ArrayDeque<O> d = new ArrayDeque();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    @Nullable
    private I i;
    @Nullable
    private s32 j;
    private boolean k;
    private boolean l;

    protected ry1(I[] a12, O[] OArray) {
        int n10;
        this.e = a12;
        this.g = ((I[])a12).length;
        int n12 = 0;
        for (n10 = 0; n10 < this.g; ++n10) {
            this.e[n10] = this.c();
        }
        this.f = OArray;
        this.h = OArray.length;
        for (n10 = n12; n10 < this.h; ++n10) {
            this.f[n10] = this.d();
        }
        a12 = new a((wy1)this);
        this.a = a12;
        a12.start();
    }

    static /* bridge */ /* synthetic */ boolean a(ry1 ry12) {
        return ry12.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private boolean e() throws InterruptedException {
        int n10;
        Object object = this.b;
        // MONITORENTER : object
        while (!this.l && (this.c.isEmpty() || this.h <= 0)) {
            this.b.wait();
        }
        if (this.l) {
            // MONITOREXIT : object
            return false;
        }
        Object object2 = (jy)((Object)this.c.removeFirst());
        Object object3 = this.f;
        this.h = n10 = this.h - 1;
        object3 = object3[n10];
        boolean bl2 = this.k;
        this.k = false;
        // MONITOREXIT : object
        if (object2.c(4)) {
            object3.b(4);
        } else {
            if (object2.c(Integer.MIN_VALUE)) {
                object3.b(Integer.MIN_VALUE);
            }
            if (object2.c(0x8000000)) {
                object3.b(0x8000000);
            }
            try {
                object = this.a((jy)((Object)object2), (ky)((Object)object3), bl2);
            }
            catch (OutOfMemoryError outOfMemoryError) {
                object = new s32("Unexpected decode error", outOfMemoryError);
            }
            catch (RuntimeException runtimeException) {
                object = new s32("Unexpected decode error", runtimeException);
            }
            if (object != null) {
                object2 = this.b;
                // MONITORENTER : object2
                this.j = object;
                // MONITOREXIT : object2
                return false;
            }
        }
        object = this.b;
        // MONITORENTER : object
        if (this.k) {
            ((ky)((Object)object3)).h();
        } else if (object3.c(Integer.MIN_VALUE)) {
            ((ky)((Object)object3)).h();
        } else {
            this.d.addLast(object3);
        }
        object2.b();
        object3 = this.e;
        n10 = this.g;
        this.g = n10 + 1;
        object3[n10] = object2;
        // MONITOREXIT : object
        return true;
    }

    @Nullable
    protected abstract s32 a(jy var1, ky var2, boolean var3);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Object a() throws iy {
        Object object = this.b;
        synchronized (object) {
            try {
                Object object2 = this.j;
                if (object2 != null) throw object2;
                if (!this.d.isEmpty()) return (ky)((Object)this.d.removeFirst());
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @CallSuper
    protected final void a(O o11) {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    o11.b();
                    O[] OArray = this.f;
                    int n10 = this.h;
                    this.h = n10 + 1;
                    OArray[n10] = o11;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
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
    public final void a(u32 object) throws iy {
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        s32 s322 = this.j;
                        if (s322 != null) {
                            throw s322;
                        }
                        if (object != this.i) {
                            object = new IllegalArgumentException();
                            throw object;
                        }
                        this.c.addLast((I)object);
                        if (this.c.isEmpty() || this.h <= 0) break block5;
                        this.b.notify();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                this.i = null;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Object b() throws iy {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                Object object2;
                block6: {
                    block7: {
                        block8: {
                            int n10;
                            try {
                                object2 = this.j;
                                if (object2 != null) break block6;
                                if (this.i != null) break block7;
                                n10 = this.g;
                                if (n10 == 0) {
                                    object2 = null;
                                    break block8;
                                }
                                object2 = this.e;
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                            {
                                this.g = --n10;
                            }
                            object2 = object2[n10];
                        }
                        this.i = object2;
                        return object2;
                    }
                    object2 = new IllegalStateException();
                    throw object2;
                }
                throw object2;
            }
            throw throwable2;
        }
    }

    protected abstract u32 c();

    protected abstract O d();

    protected final void f() {
        int n10 = this.g;
        I[] IArray = this.e;
        if (n10 == IArray.length) {
            int n12 = IArray.length;
            for (n10 = 0; n10 < n12; ++n10) {
                ((jy)((Object)IArray[n10])).e(1024);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                int n10;
                Object object2;
                Object object3;
                block8: {
                    try {
                        this.k = true;
                        object3 = this.i;
                        if (object3 == null) break block8;
                        ((jy)((Object)object3)).b();
                        object2 = this.e;
                        n10 = this.g;
                        this.g = n10 + 1;
                        object2[n10] = object3;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    object2 = (jy)((Object)this.c.removeFirst());
                    ((jy)((Object)object2)).b();
                    object3 = this.e;
                    n10 = this.g;
                    this.g = n10 + 1;
                    object3[n10] = object2;
                }
                {
                    while (true) {
                        if (this.d.isEmpty()) {
                            return;
                        }
                        ((ky)((Object)this.d.removeFirst())).h();
                    }
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @CallSuper
    public final void release() {
        Object object = this.b;
        synchronized (object) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}

