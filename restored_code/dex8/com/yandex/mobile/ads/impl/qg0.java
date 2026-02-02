/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.es
 *  com.yandex.mobile.ads.impl.gq1
 *  com.yandex.mobile.ads.impl.ih0
 *  com.yandex.mobile.ads.impl.lf0
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.rh0
 *  com.yandex.mobile.ads.impl.w22
 *  com.yandex.mobile.ads.impl.w22$a
 *  com.yandex.mobile.ads.impl.w50
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.yq1$a
 *  com.yandex.mobile.ads.impl.zp1
 *  kotlin.text.p
 *  okio.e
 *  okio.f
 *  okio.g
 *  okio.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.eo1;
import com.yandex.mobile.ads.impl.es;
import com.yandex.mobile.ads.impl.gq1;
import com.yandex.mobile.ads.impl.ih0;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.lf0;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.w22;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zp1;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okio.g;
import okio.j0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qg0
implements w50 {
    @Nullable
    private final ce1 a;
    @NotNull
    private final eo1 b;
    @NotNull
    private final g c;
    @NotNull
    private final okio.f d;
    private int e;
    @NotNull
    private final lf0 f;
    @Nullable
    private kf0 g;

    public qg0(@Nullable ce1 ce12, @NotNull eo1 eo12, @NotNull g g11, @NotNull okio.f f11) {
        this.a = ce12;
        this.b = eo12;
        this.c = g11;
        this.d = f11;
        this.f = new lf0(g11);
    }

    private final l0 a(long l10) {
        int n10 = this.e;
        if (n10 == 4) {
            this.e = 5;
            return new d(this, l10);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(n10);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final l0 a(rh0 object) {
        int n10 = this.e;
        if (n10 == 4) {
            this.e = 5;
            return new c(this, (rh0)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("state: ");
        ((StringBuilder)object).append(n10);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public static final void a(qg0 object, okio.p p14) {
        object.getClass();
        object = p14.b();
        p14.c(m0.NONE);
        ((m0)object).clearDeadline();
        ((m0)object).clearTimeout();
    }

    private final j0 d() {
        int n10 = this.e;
        if (n10 == 1) {
            this.e = 2;
            return new b(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(n10);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final j0 e() {
        int n10 = this.e;
        if (n10 == 1) {
            this.e = 2;
            return new e(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(n10);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final l0 f() {
        int n10 = this.e;
        if (n10 == 4) {
            this.e = 5;
            this.b.j();
            return new f(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(n10);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final yq1.a a(boolean bl2) {
        EOFException eOFException2;
        block5: {
            yq1.a a14;
            w22 w222;
            int n10 = this.e;
            if (n10 != 1 && n10 != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("state: ");
                stringBuilder.append(n10);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            try {
                w222 = w22.a.a((String)this.f.b());
                a14 = new yq1.a();
                a14 = a14.a(w222.a).a(w222.b).a(w222.c).a(this.f.a());
                if (bl2 && w222.b == 100) {
                    return null;
                }
            }
            catch (EOFException eOFException2) {
                break block5;
            }
            if (w222.b == 100) {
                this.e = 3;
                return a14;
            }
            this.e = 4;
            return a14;
        }
        String string2 = this.b.k().a().k().j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected end of stream on ");
        stringBuilder.append(string2);
        throw new IOException(stringBuilder.toString(), eOFException2);
    }

    @NotNull
    public final j0 a(@NotNull zp1 object, long l10) {
        block6: {
            block5: {
                block4: {
                    if (object.a() != null) {
                        object.a().getClass();
                    }
                    if (!p.z((String)"chunked", (String)object.a("Transfer-Encoding"), (boolean)true)) break block4;
                    object = this.d();
                    break block5;
                }
                if (l10 == -1L) break block6;
                object = this.e();
            }
            return object;
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @NotNull
    public final l0 a(@NotNull yq1 object) {
        long l10;
        object = !ih0.a((yq1)object) ? this.a(0L) : (p.z((String)"chunked", (String)yq1.a((yq1)object, (String)"Transfer-Encoding"), (boolean)true) ? this.a(object.n().g()) : ((l10 = n92.a((yq1)object)) != -1L ? this.a(l10) : this.f()));
        return object;
    }

    public final void a() {
        this.d.flush();
    }

    public final void a(@NotNull kf0 object, @NotNull String string2) {
        int n10 = this.e;
        if (n10 == 0) {
            this.d.writeUtf8(string2).writeUtf8("\r\n");
            int n13 = ((kf0)object).size();
            for (n10 = 0; n10 < n13; ++n10) {
                this.d.writeUtf8(((kf0)object).a(n10)).writeUtf8(": ").writeUtf8(((kf0)object).b(n10)).writeUtf8("\r\n");
            }
            this.d.writeUtf8("\r\n");
            this.e = 1;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("state: ");
        ((StringBuilder)object).append(n10);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public final void a(@NotNull zp1 zp12) {
        Object object = this.b.k().b().type();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(zp12.f());
        stringBuilder.append(' ');
        if (!zp12.e() && object == Proxy.Type.HTTP) {
            stringBuilder.append(zp12.g());
        } else {
            stringBuilder.append(gq1.a((rh0)zp12.g()));
        }
        stringBuilder.append(" HTTP/1.1");
        object = stringBuilder.toString();
        y.i(object, "toString(...)");
        this.a(zp12.d(), (String)object);
    }

    public final long b(@NotNull yq1 yq12) {
        long l10 = !ih0.a((yq1)yq12) ? 0L : (p.z((String)"chunked", (String)yq1.a((yq1)yq12, (String)"Transfer-Encoding"), (boolean)true) ? -1L : n92.a((yq1)yq12));
        return l10;
    }

    public final void b() {
        this.d.flush();
    }

    @NotNull
    public final eo1 c() {
        return this.b;
    }

    public final void c(@NotNull yq1 object) {
        long l10 = n92.a((yq1)object);
        if (l10 == -1L) {
            return;
        }
        object = this.a(l10);
        n92.a((l0)object, (int)Integer.MAX_VALUE, (TimeUnit)TimeUnit.MILLISECONDS);
        ((d)object).close();
    }

    public final void cancel() {
        this.b.a();
    }

    private abstract class a
    implements l0 {
        @NotNull
        private final okio.p a;
        private boolean b;
        final qg0 c;

        public a(qg0 qg02) {
            this.c = qg02;
            this.a = new okio.p(qg02.c.timeout());
        }

        protected final boolean a() {
            return this.b;
        }

        public final void b() {
            if (this.c.e == 6) {
                return;
            }
            if (this.c.e == 5) {
                qg0.a(this.c, this.a);
                this.c.e = 6;
                return;
            }
            int n10 = this.c.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(n10);
            throw new IllegalStateException(stringBuilder.toString());
        }

        protected final void c() {
            this.b = true;
        }

        @Override
        public abstract /* synthetic */ void close() throws IOException;

        @Override
        public long read(@NotNull okio.e e11, long l10) {
            try {
                l10 = this.c.c.read(e11, l10);
                return l10;
            }
            catch (IOException iOException) {
                this.c.c().j();
                this.b();
                throw iOException;
            }
        }

        @Override
        @NotNull
        public final m0 timeout() {
            return this.a;
        }
    }

    private final class b
    implements j0 {
        @NotNull
        private final okio.p a;
        private boolean b;
        final qg0 c;

        public b(qg0 qg02) {
            this.c = qg02;
            this.a = new okio.p(qg02.d.timeout());
        }

        @Override
        public final void close() {
            synchronized (this) {
                block4: {
                    boolean bl2 = this.b;
                    if (!bl2) break block4;
                    return;
                }
                this.b = true;
                this.c.d.writeUtf8("0\r\n\r\n");
                qg0.a(this.c, this.a);
                this.c.e = 3;
                return;
            }
        }

        @Override
        public final void flush() {
            synchronized (this) {
                block4: {
                    boolean bl2 = this.b;
                    if (!bl2) break block4;
                    return;
                }
                this.c.d.flush();
                return;
            }
        }

        @Override
        @NotNull
        public final m0 timeout() {
            return this.a;
        }

        @Override
        public final void write(@NotNull okio.e e11, long l10) {
            if (this.b ^ true) {
                if (l10 == 0L) {
                    return;
                }
                this.c.d.writeHexadecimalUnsignedLong(l10);
                this.c.d.writeUtf8("\r\n");
                this.c.d.write(e11, l10);
                this.c.d.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    private final class c
    extends a {
        @NotNull
        private final rh0 d;
        private long e;
        private boolean f;
        final qg0 g;

        public c(qg0 qg02, @NotNull rh0 rh02) {
            this.g = qg02;
            super(qg02);
            this.d = rh02;
            this.e = -1L;
            this.f = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final void d() {
            Object object;
            block4: {
                if (this.e != -1L) {
                    this.g.c.readUtf8LineStrict();
                }
                try {
                    boolean bl2;
                    this.e = this.g.c.readHexadecimalUnsignedLong();
                    object = ((Object)p.g1((CharSequence)this.g.c.readUtf8LineStrict())).toString();
                    if (this.e < 0L || object.length() > 0 && !(bl2 = p.M((String)object, (String)";", (boolean)false, (int)2, null))) break block4;
                    if (this.e != 0L) return;
                    this.f = false;
                    object = this.g;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new ProtocolException(numberFormatException.getMessage());
                }
                ((qg0)object).g = ((qg0)object).f.a();
                object = this.g.a;
                y.g(object);
                es es2 = ((ce1)object).h();
                rh0 rh02 = this.d;
                object = this.g.g;
                y.g(object);
                ih0.a((es)es2, (rh0)rh02, (kf0)object);
                this.b();
                return;
            }
            long l10 = this.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected chunk size and optional extensions but was \"");
            stringBuilder.append(l10);
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            ProtocolException protocolException = new ProtocolException(stringBuilder.toString());
            throw protocolException;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void close() {
            block4: {
                if (this.a()) {
                    return;
                }
                if (this.f) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    try {
                        boolean bl2 = n92.a((l0)this, (int)100, (TimeUnit)timeUnit);
                        if (bl2) break block4;
                    }
                    catch (IOException iOException) {}
                    this.g.c().j();
                    this.b();
                }
            }
            this.c();
        }

        @Override
        public final long read(@NotNull okio.e object, long l10) {
            if (l10 >= 0L) {
                if (this.a() ^ true) {
                    if (!this.f) {
                        return -1L;
                    }
                    long l11 = this.e;
                    if (l11 == 0L || l11 == -1L) {
                        this.d();
                        if (!this.f) {
                            return -1L;
                        }
                    }
                    if ((l10 = super.read((okio.e)object, Math.min(l10, this.e))) != -1L) {
                        this.e -= l10;
                        return l10;
                    }
                    this.g.c().j();
                    object = new ProtocolException("unexpected end of stream");
                    this.b();
                    throw object;
                }
                throw new IllegalStateException("closed".toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l10);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }

    private final class d
    extends a {
        private long d;
        final qg0 e;

        public d(qg0 qg02, long l10) {
            this.e = qg02;
            super(qg02);
            this.d = l10;
            if (l10 == 0L) {
                this.b();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void close() {
            block4: {
                if (this.a()) {
                    return;
                }
                if (this.d != 0L) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    try {
                        boolean bl2 = n92.a((l0)this, (int)100, (TimeUnit)timeUnit);
                        if (bl2) break block4;
                    }
                    catch (IOException iOException) {}
                    this.e.c().j();
                    this.b();
                }
            }
            this.c();
        }

        @Override
        public final long read(@NotNull okio.e object, long l10) {
            if (l10 >= 0L) {
                if (this.a() ^ true) {
                    long l11 = this.d;
                    if (l11 == 0L) {
                        return -1L;
                    }
                    if ((l11 = super.read((okio.e)object, Math.min(l11, l10))) != -1L) {
                        this.d = l10 = this.d - l11;
                        if (l10 == 0L) {
                            this.b();
                        }
                        return l11;
                    }
                    this.e.c().j();
                    object = new ProtocolException("unexpected end of stream");
                    this.b();
                    throw object;
                }
                throw new IllegalStateException("closed".toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l10);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }

    private final class e
    implements j0 {
        @NotNull
        private final okio.p a;
        private boolean b;
        final qg0 c;

        public e(qg0 qg02) {
            this.c = qg02;
            this.a = new okio.p(qg02.d.timeout());
        }

        @Override
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            qg0.a(this.c, this.a);
            this.c.e = 3;
        }

        @Override
        public final void flush() {
            if (this.b) {
                return;
            }
            this.c.d.flush();
        }

        @Override
        @NotNull
        public final m0 timeout() {
            return this.a;
        }

        @Override
        public final void write(@NotNull okio.e e11, long l10) {
            if (this.b ^ true) {
                long l11 = e11.size();
                byte[] byArray = n92.a;
                if (l10 >= 0L && 0L <= l11 && l11 >= l10) {
                    this.c.d.write(e11, l10);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    private final class f
    extends a {
        private boolean d;

        public f(qg0 qg02) {
            super(qg02);
        }

        @Override
        public final void close() {
            if (this.a()) {
                return;
            }
            if (!this.d) {
                this.b();
            }
            this.c();
        }

        @Override
        public final long read(@NotNull okio.e object, long l10) {
            if (l10 >= 0L) {
                if (this.a() ^ true) {
                    if (this.d) {
                        return -1L;
                    }
                    if ((l10 = super.read((okio.e)object, l10)) == -1L) {
                        this.d = true;
                        this.b();
                        return -1L;
                    }
                    return l10;
                }
                throw new IllegalStateException("closed".toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l10);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }
}

