/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dm
 *  com.yandex.mobile.ads.impl.dm$a
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.lv$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.nu2
 *  com.yandex.mobile.ads.impl.pm
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.qm
 *  com.yandex.mobile.ads.impl.sr
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ab0;
import com.yandex.mobile.ads.impl.dm;
import com.yandex.mobile.ads.impl.gm;
import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mh1;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.nu2;
import com.yandex.mobile.ads.impl.pm;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.q42;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.sr;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class hm
implements lv {
    private final dm a;
    private final lv b;
    @Nullable
    private final q42 c;
    private final lv d;
    private final pm e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    @Nullable
    private Uri i;
    @Nullable
    private pv j;
    @Nullable
    private pv k;
    @Nullable
    private lv l;
    private long m;
    private long n;
    private long o;
    @Nullable
    private qm p;
    private boolean q;
    private boolean r;
    private long s;

    private hm(dm object, @Nullable lv lv2, ab0 ab02, @Nullable gm gm3, @Nullable pm pm3, int n10, int n13) {
        this.a = object;
        this.b = ab02;
        if (pm3 == null) {
            pm3 = pm.a;
        }
        this.e = pm3;
        boolean bl2 = true;
        if ((n10 & 1) == 0) {
            bl2 = false;
        }
        this.f = bl2;
        this.g = false;
        this.h = false;
        object = null;
        if (lv2 != null) {
            this.d = lv2;
            if (gm3 != null) {
                object = new q42(lv2, gm3);
            }
            this.c = object;
        } else {
            this.d = mh1.a;
            this.c = null;
        }
    }

    /* synthetic */ hm(dm dm3, lv lv2, ab0 ab02, gm gm3, pm pm3, int n10, int n13, nu2 nu22) {
        this(dm3, lv2, ab02, gm3, pm3, n10, n13);
    }

    private void a(pv pv3, boolean bl2) throws IOException {
        long l10;
        Object object;
        Uri uri;
        lv lv2;
        Object object2;
        String string2 = pv3.h;
        int n10 = m92.a;
        boolean bl3 = this.r;
        Object var18_8 = null;
        if (bl3) {
            object2 = null;
        } else if (this.f) {
            try {
                object2 = this.a.e(string2, this.n, this.o);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            object2 = this.a.c(string2, this.n, this.o);
        }
        if (object2 == null) {
            lv2 = this.d;
            uri = pv3.a().b(this.n).a(this.o).a();
            object = object2;
            object2 = lv2;
        } else if (((qm)object2).e) {
            uri = Uri.fromFile((File)((qm)object2).f);
            long l11 = ((qm)object2).c;
            long l13 = this.n - l11;
            long l14 = ((qm)object2).d - l13;
            long l15 = this.o;
            l10 = l14;
            if (l15 != -1L) {
                l10 = Math.min(l14, l15);
            }
            uri = pv3.a().a(uri).c(l11).b(l13).a(l10).a();
            lv2 = this.b;
            object = object2;
            object2 = lv2;
        } else {
            long l16 = ((qm)object2).d;
            if (l16 == -1L) {
                l10 = this.o;
            } else {
                long l17 = this.o;
                l10 = l16;
                if (l17 != -1L) {
                    l10 = Math.min(l16, l17);
                }
            }
            uri = pv3.a().b(this.n).a(l10).a();
            lv2 = this.c;
            if (lv2 != null) {
                object = object2;
                object2 = lv2;
            } else {
                lv2 = this.d;
                this.a.b((qm)object2);
                object = null;
                object2 = lv2;
            }
        }
        l10 = !this.r && object2 == this.d ? this.n + 102400L : Long.MAX_VALUE;
        this.s = l10;
        if (bl2) {
            lv2 = this.l;
            lv lv3 = this.d;
            if (lv2 == lv3) {
                if (object2 == lv3) {
                    return;
                }
                try {
                    this.e();
                }
                catch (Throwable throwable) {
                    if (object.e ^ true) {
                        this.a.b(object);
                    }
                    throw throwable;
                }
            } else {
                throw new IllegalStateException();
            }
        }
        if (object != null && object.e ^ true) {
            this.p = object;
        }
        this.l = object2;
        this.k = uri;
        this.m = 0L;
        l10 = object2.a((pv)uri);
        object = new sr();
        if (uri.g == -1L && l10 != -1L) {
            this.o = l10;
            sr.a((sr)object, (long)(this.n + l10));
        }
        if (this.h() ^ true) {
            this.i = uri = object2.getUri();
            object2 = var18_8;
            if (pv3.a.equals((Object)uri) ^ true) {
                object2 = this.i;
            }
            sr.a((sr)object, (Uri)object2);
        }
        if (this.l == this.c) {
            this.a.a(string2, (sr)object);
        }
    }

    private void e() throws IOException {
        lv lv2 = this.l;
        if (lv2 == null) {
            return;
        }
        try {
            lv2.close();
            return;
        }
        finally {
            this.k = null;
            this.l = null;
            lv2 = this.p;
            if (lv2 != null) {
                this.a.b((qm)lv2);
                this.p = null;
            }
        }
    }

    private boolean h() {
        boolean bl2 = this.l == this.b;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv pv3) throws IOException {
        try {
            long l10;
            pv pv4;
            String string2 = this.e.a(pv3);
            this.j = pv4 = pv3.a().a(string2).a();
            Object object = this.a;
            Uri uri = pv4.a;
            object = object.b(string2).c();
            object = object == null ? null : Uri.parse((String)object);
            if (object != null) {
                uri = object;
            }
            this.i = uri;
            this.n = pv3.f;
            boolean bl2 = this.g && this.q || this.h && pv3.g == -1L;
            this.r = bl2;
            if (bl2) {
                this.o = -1L;
            } else {
                this.o = l10 = this.a.b(string2).b();
                if (l10 != -1L) {
                    this.o = l10 -= pv3.f;
                    if (l10 < 0L) {
                        pv3 = new mv(2008);
                        throw pv3;
                    }
                }
            }
            l10 = pv3.g;
            if (l10 != -1L) {
                long l11 = this.o;
                if (l11 != -1L) {
                    l10 = Math.min(l11, l10);
                }
                this.o = l10;
            }
            if ((l10 = this.o) > 0L || l10 == -1L) {
                this.a(pv4, false);
            }
            if ((l10 = pv3.g) == -1L) return this.o;
            return l10;
        }
        // Removed invalid catch block
        this.q = true;
        throw throwable;
    }

    @Override
    public final void a(k72 k722) {
        k722.getClass();
        this.b.a(k722);
        this.d.a(k722);
    }

    @Override
    public final void close() throws IOException {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            this.e();
            return;
        }
        catch (Throwable throwable) {
            if (this.h() || throwable instanceof dm.a) {
                this.q = true;
            }
            throw throwable;
        }
    }

    public final dm f() {
        return this.a;
    }

    public final pm g() {
        return this.e;
    }

    @Override
    public final Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> map2 = this.h() ^ true ? this.d.getResponseHeaders() : Collections.emptyMap();
        return map2;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read(byte[] object, int n10, int n13) throws IOException {
        Throwable throwable2;
        block9: {
            long l10;
            pv pv3;
            pv pv4;
            block8: {
                if (n13 == 0) {
                    return 0;
                }
                if (this.o == 0L) {
                    return -1;
                }
                pv4 = this.j;
                pv4.getClass();
                pv3 = this.k;
                pv3.getClass();
                try {
                    if (this.n < this.s) break block8;
                    this.a(pv4, true);
                }
                catch (Throwable throwable2) {
                    break block9;
                }
            }
            Object object2 = this.l;
            object2.getClass();
            int n14 = object2.read(object, n10, n13);
            if (n14 != -1) {
                long l11 = this.n;
                long l13 = n14;
                this.n = l11 + l13;
                this.m += l13;
                l11 = this.o;
                if (l11 == -1L) return n14;
                this.o = l11 - l13;
                return n14;
            }
            if (this.h() ^ true && ((l10 = pv3.g) == -1L || this.m < l10)) {
                object2 = pv4.h;
                n10 = m92.a;
                this.o = 0L;
                if (this.l != this.c) return n14;
                object = new sr;
                object();
                sr.a((sr)object, (long)this.n);
                this.a.a((String)object2, (sr)object);
                return n14;
            }
            l10 = this.o;
            if (l10 <= 0L) {
                if (l10 != -1L) return n14;
            }
            this.e();
            this.a(pv4, false);
            return this.read((byte[])object, n10, n13);
        }
        if (!this.h()) {
            if (!(throwable2 instanceof dm.a)) throw throwable2;
        }
        this.q = true;
        throw throwable2;
    }

    public static final class a
    implements lv.a {
        private dm a;
        private ab0.b b = new ab0.b();
        private pm c = pm.a;
        @Nullable
        private lv.a d;

        public final a a(dm dm3) {
            this.a = dm3;
            return this;
        }

        public final a a(@Nullable gz.a a13) {
            this.d = a13;
            return this;
        }

        public final lv a() {
            Object object = this.d;
            gm gm3 = null;
            object = object != null ? object.a() : null;
            dm dm3 = this.a;
            dm3.getClass();
            if (object != null) {
                gm3 = new /* Unavailable Anonymous Inner Class!! */.a(dm3).a();
            }
            this.b.getClass();
            return new hm(dm3, (lv)object, new ab0(), gm3, this.c, 0, 0, null);
        }

        public final hm b() {
            Object object = this.d;
            gm gm3 = null;
            object = object != null ? object.a() : null;
            dm dm3 = this.a;
            dm3.getClass();
            if (object != null) {
                gm3 = new /* Unavailable Anonymous Inner Class!! */.a(dm3).a();
            }
            this.b.getClass();
            return new hm(dm3, (lv)object, new ab0(), gm3, this.c, 1, -1000, null);
        }
    }
}

