/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.fs2
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.l01
 *  com.yandex.mobile.ads.impl.m01
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.o01
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.fs2;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.l01;
import com.yandex.mobile.ads.impl.m01;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.n01;
import com.yandex.mobile.ads.impl.o01;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.uy1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class p01
extends ck
implements Handler.Callback {
    private final m01 n;
    private final o01 o;
    @Nullable
    private final Handler p;
    private final n01 q;
    @Nullable
    private l01 r;
    private boolean s;
    private boolean t;
    private long u;
    private long v;
    @Nullable
    private k01 w;

    public p01(o01 object, @Nullable Looper looper) {
        m01 m012 = m01.a;
        super(5);
        this.o = (o01)uf.a((Object)object);
        object = looper == null ? null : m92.a((Looper)looper, (Handler.Callback)this);
        this.p = object;
        this.n = (m01)uf.a((Object)m012);
        this.q = new n01();
        this.v = -9223372036854775807L;
    }

    private void a(k01 k012, ArrayList arrayList) {
        for (int i14 = 0; i14 < k012.c(); ++i14) {
            Object object = k012.a(i14).a();
            if (object != null && this.n.a((cc0)object)) {
                uy1 uy12 = this.n.b((cc0)object);
                object = k012.a(i14).b();
                object.getClass();
                this.q.b();
                this.q.e(((Object)object).length);
                ByteBuffer byteBuffer = this.q.d;
                int n10 = m92.a;
                byteBuffer.put((byte[])object);
                this.q.h();
                object = uy12.a(this.q);
                if (object == null) continue;
                this.a((k01)object, arrayList);
                continue;
            }
            arrayList.add(k012.a(i14));
        }
    }

    public final int a(cc0 cc02) {
        if (this.n.a(cc02)) {
            int n10 = cc02.F == 0 ? 4 : 2;
            return fs2.b((int)n10, (int)0, (int)0);
        }
        return fs2.b((int)0, (int)0, (int)0);
    }

    @Override
    public final void a(long l10, long l11) {
        int n10;
        do {
            k01 k012;
            Object object;
            boolean bl2 = this.s;
            int n13 = 0;
            if (!bl2 && this.w == null) {
                this.q.b();
                object = this.q();
                n10 = this.a((dc0)object, this.q, 0);
                if (n10 == -4) {
                    if (this.q.f()) {
                        this.s = true;
                    } else {
                        object = this.q;
                        ((n01)((Object)object)).j = this.u;
                        ((jy)((Object)object)).h();
                        object = this.r;
                        n10 = m92.a;
                        k012 = object.a(this.q);
                        if (k012 != null) {
                            object = new ArrayList(k012.c());
                            this.a(k012, (ArrayList)object);
                            if (!((ArrayList)object).isEmpty()) {
                                this.w = new k01((List)object);
                                this.v = this.q.f;
                            }
                        }
                    }
                } else if (n10 == -5) {
                    object = ((dc0)object).b;
                    object.getClass();
                    this.u = ((cc0)object).q;
                }
            }
            k012 = this.w;
            n10 = n13;
            if (k012 != null) {
                n10 = n13;
                if (this.v <= l10) {
                    object = this.p;
                    if (object != null) {
                        object.obtainMessage(0, (Object)k012).sendToTarget();
                    } else {
                        this.o.a(k012);
                    }
                    this.w = null;
                    this.v = -9223372036854775807L;
                    n10 = 1;
                }
            }
            if (!this.s || this.w != null) continue;
            this.t = true;
        } while (n10 != 0);
    }

    @Override
    protected final void a(long l10, boolean bl2) {
        this.w = null;
        this.v = -9223372036854775807L;
        this.s = false;
        this.t = false;
    }

    @Override
    protected final void a(cc0[] cc0Array, long l10, long l11) {
        this.r = this.n.b(cc0Array[0]);
    }

    @Override
    public final boolean a() {
        return this.t;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final String getName() {
        return "MetadataRenderer";
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            message = (k01)message.obj;
            this.o.a((k01)message);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    protected final void u() {
        this.w = null;
        this.v = -9223372036854775807L;
        this.r = null;
    }
}

