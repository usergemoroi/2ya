/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dm
 *  com.yandex.mobile.ads.impl.dm$a
 *  com.yandex.mobile.ads.impl.kv
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.rr1
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.dm;
import com.yandex.mobile.ads.impl.kv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.rr1;
import com.yandex.mobile.ads.impl.uf;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class gm
implements kv {
    private final dm a;
    private final long b;
    private final int c;
    @Nullable
    private pv d;
    private long e;
    @Nullable
    private File f;
    @Nullable
    private OutputStream g;
    private long h;
    private long i;
    private rr1 j;

    public gm(dm dm3) {
        this.a = (dm)uf.a((Object)dm3);
        this.b = 0x500000L;
        this.c = 20480;
    }

    private void a() throws IOException {
        Object object = this.g;
        if (object == null) {
            return;
        }
        try {
            ((OutputStream)object).flush();
        }
        catch (Throwable throwable) {
            m92.a((Closeable)this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            file.delete();
            throw throwable;
        }
        m92.a((Closeable)this.g);
        this.g = null;
        object = this.f;
        this.f = null;
        this.a.a((File)object, this.h);
    }

    private void b(pv object) throws IOException {
        long l10 = object.g;
        long l11 = -1L;
        if (l10 != -1L) {
            l11 = Math.min(l10 - this.i, this.e);
        }
        dm dm3 = this.a;
        String string2 = object.h;
        int n10 = m92.a;
        this.f = dm3.a(string2, object.f + this.i, l11);
        object = new FileOutputStream(this.f);
        if (this.c > 0) {
            dm3 = this.j;
            if (dm3 == null) {
                this.j = new rr1((FileOutputStream)object, this.c);
            } else {
                dm3.a((OutputStream)object);
            }
            this.g = this.j;
        } else {
            this.g = object;
        }
        this.h = 0L;
    }

    public final void a(pv pv3) throws a {
        pv3.h.getClass();
        if (pv3.g == -1L && (pv3.i & 2) == 2) {
            this.d = null;
            return;
        }
        this.d = pv3;
        long l10 = (pv3.i & 4) == 4 ? this.b : Long.MAX_VALUE;
        this.e = l10;
        this.i = 0L;
        try {
            this.b(pv3);
            return;
        }
        catch (IOException iOException) {
            throw new a(iOException);
        }
    }

    public final void close() throws a {
        if (this.d == null) {
            return;
        }
        try {
            this.a();
            return;
        }
        catch (IOException iOException) {
            throw new a(iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void write(byte[] byArray, int n10, int n12) throws a {
        pv pv3 = this.d;
        if (pv3 == null) {
            return;
        }
        int n13 = 0;
        while (n13 < n12) {
            try {
                if (this.h == this.e) {
                    this.a();
                    this.b(pv3);
                }
            }
            catch (IOException iOException) {
                throw new a(iOException);
            }
            int n14 = (int)Math.min((long)(n12 - n13), this.e - this.h);
            OutputStream outputStream = this.g;
            int n15 = m92.a;
            outputStream.write(byArray, n10 + n13, n14);
            n13 += n14;
            long l10 = this.h;
            long l11 = n14;
            this.h = l10 + l11;
            this.i += l11;
        }
    }

    public static final class a
    extends dm.a {
        public a(IOException iOException) {
            super((Throwable)iOException);
        }
    }
}

