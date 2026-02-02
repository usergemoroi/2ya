/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.iy
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.wl
 *  com.yandex.mobile.ads.impl.xu
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.iy;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.r32;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.v32;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xu;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class d70
implements r32 {
    private final xu a = new xu();
    private final u32 b = new u32();
    private final ArrayDeque c = new ArrayDeque();
    private int d;
    private boolean e;

    public d70() {
        for (int i14 = 0; i14 < 2; ++i14) {
            this.c.addFirst(new v32(this){
                final d70 f;
                {
                    this.f = d702;
                }

                @Override
                public final void h() {
                    this.f.a(this);
                }
            });
        }
        this.d = 0;
    }

    private void a(v32 v322) {
        if (this.c.size() < 2) {
            if (this.c.contains((Object)v322) ^ true) {
                v322.b();
                this.c.addFirst(v322);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final Object a() throws iy {
        if (this.e ^ true) {
            v32 v322;
            if (this.d == 2 && !this.c.isEmpty()) {
                v322 = (v32)((Object)this.c.removeFirst());
                if (this.b.f()) {
                    v322.b(4);
                } else {
                    Object object = this.b;
                    long l10 = object.f;
                    Object object2 = this.a;
                    object = object.d;
                    ((Object)object).getClass();
                    object = ((ByteBuffer)object).array();
                    object2.getClass();
                    object2 = Parcel.obtain();
                    object2.unmarshall((byte[])object, 0, ((u32)object).length);
                    object2.setDataPosition(0);
                    object = object2.readBundle(Bundle.class.getClassLoader());
                    object2.recycle();
                    object2 = object.getParcelableArrayList("c");
                    object2.getClass();
                    object2 = new b(l10, wl.a(wu.t, (ArrayList)object2));
                    v322.a(this.b.f, (q32)object2, 0L);
                }
                this.b.b();
                this.d = 0;
            } else {
                v322 = null;
            }
            return v322;
        }
        throw new IllegalStateException();
    }

    @Override
    public final void a(long l10) {
    }

    public final void a(u32 u322) throws iy {
        if (this.e ^ true) {
            if (this.d == 1) {
                if (this.b == u322) {
                    this.d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final Object b() throws iy {
        if (this.e ^ true) {
            u32 u322;
            if (this.d != 0) {
                u322 = null;
            } else {
                this.d = 1;
                u322 = this.b;
            }
            return u322;
        }
        throw new IllegalStateException();
    }

    public final void flush() {
        if (this.e ^ true) {
            this.b.b();
            this.d = 0;
            return;
        }
        throw new IllegalStateException();
    }

    public final void release() {
        this.e = true;
    }

    private static final class b
    implements q32 {
        private final long b;
        private final xj0<wu> c;

        public b(long l10, xj0<wu> xj02) {
            this.b = l10;
            this.c = xj02;
        }

        public final int a() {
            return 1;
        }

        public final int a(long l10) {
            int n10 = this.b > l10 ? 0 : -1;
            return n10;
        }

        public final long a(int n10) {
            if (n10 == 0) {
                return this.b;
            }
            throw new IllegalArgumentException();
        }

        public final List<wu> b(long l10) {
            xj0<wu> xj02 = l10 >= this.b ? this.c : xj0.h();
            return xj02;
        }
    }
}

