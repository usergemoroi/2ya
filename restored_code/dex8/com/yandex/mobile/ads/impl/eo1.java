/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.be1
 *  com.yandex.mobile.ads.impl.bt1
 *  com.yandex.mobile.ads.impl.by1
 *  com.yandex.mobile.ads.impl.c32
 *  com.yandex.mobile.ads.impl.cf0
 *  com.yandex.mobile.ads.impl.cf0$a
 *  com.yandex.mobile.ads.impl.cr1
 *  com.yandex.mobile.ads.impl.eo1$a
 *  com.yandex.mobile.ads.impl.er
 *  com.yandex.mobile.ads.impl.fr
 *  com.yandex.mobile.ads.impl.gr
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.m50
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.o42
 *  com.yandex.mobile.ads.impl.pn
 *  com.yandex.mobile.ads.impl.q50
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.qm1$a
 *  com.yandex.mobile.ads.impl.qn
 *  com.yandex.mobile.ads.impl.qn$b
 *  com.yandex.mobile.ads.impl.rh0
 *  com.yandex.mobile.ads.impl.rh1
 *  com.yandex.mobile.ads.impl.rh1$a
 *  com.yandex.mobile.ads.impl.sg0
 *  com.yandex.mobile.ads.impl.sg0$a
 *  com.yandex.mobile.ads.impl.sg0$b
 *  com.yandex.mobile.ads.impl.t52
 *  com.yandex.mobile.ads.impl.ta
 *  com.yandex.mobile.ads.impl.w50
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.yq1$a
 *  com.yandex.mobile.ads.impl.zg0
 *  com.yandex.mobile.ads.impl.zn
 *  com.yandex.mobile.ads.impl.zp1
 *  com.yandex.mobile.ads.impl.zp1$a
 *  com.yandex.mobile.ads.impl.zs1
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.text.p
 *  okio.f
 *  okio.g
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.be1;
import com.yandex.mobile.ads.impl.bt1;
import com.yandex.mobile.ads.impl.by1;
import com.yandex.mobile.ads.impl.c32;
import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.cf0;
import com.yandex.mobile.ads.impl.cr1;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.eo1;
import com.yandex.mobile.ads.impl.er;
import com.yandex.mobile.ads.impl.fr;
import com.yandex.mobile.ads.impl.gr;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.o42;
import com.yandex.mobile.ads.impl.pn;
import com.yandex.mobile.ads.impl.q50;
import com.yandex.mobile.ads.impl.qg0;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.qn;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.rh1;
import com.yandex.mobile.ads.impl.sg0;
import com.yandex.mobile.ads.impl.t52;
import com.yandex.mobile.ads.impl.ta;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.xg0;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zg0;
import com.yandex.mobile.ads.impl.zn;
import com.yandex.mobile.ads.impl.zp1;
import com.yandex.mobile.ads.impl.zs1;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okio.f;
import okio.g;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class eo1
extends sg0.b {
    @NotNull
    private final zs1 b;
    @Nullable
    private Socket c;
    @Nullable
    private Socket d;
    @Nullable
    private cf0 e;
    @Nullable
    private qm1 f;
    @Nullable
    private sg0 g;
    @Nullable
    private g h;
    @Nullable
    private f i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    @NotNull
    private final ArrayList p;
    private long q;

    public eo1(@NotNull zs1 zs12) {
        this.b = zs12;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    private final zp1 a(int n10, int n12, zp1 object, rh0 object2) throws IOException {
        String string2 = n92.a((rh0)object2, (boolean)true);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("CONNECT ");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(" HTTP/1.1");
        String string3 = ((StringBuilder)object2).toString();
        g g10 = this.h;
        y.g(g10);
        string2 = this.i;
        y.g(string2);
        object2 = new qg0(null, this, g10, (f)string2);
        m0 m02 = g10.timeout();
        long l10 = n10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m02.timeout(l10, timeUnit);
        string2.timeout().timeout(n12, timeUnit);
        ((qg0)object2).a(object.d(), string3);
        ((qg0)object2).a();
        m02 = ((qg0)object2).a(false);
        y.g(m02);
        object = m02.a((zp1)object).a();
        ((qg0)object2).c((yq1)object);
        n10 = object.c();
        if (n10 != 200) {
            if (n10 == 407) {
                this.b.a().g().a(this.b, (yq1)object);
                throw new IOException("Failed to authenticate with proxy");
            }
            n10 = object.c();
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected response code for CONNECT: ");
            ((StringBuilder)object).append(n10);
            throw new IOException(((StringBuilder)object).toString());
        }
        if (g10.getBuffer().exhausted() && string2.getBuffer().exhausted()) {
            return null;
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
    }

    private final void a(int n10, int n12, int n13, q50 q502) throws IOException {
        zp1 zp12 = new zp1.a().a(this.b.a().k()).a("CONNECT", null).b("Host", n92.a((rh0)this.b.a().k(), (boolean)true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", "okhttp/4.9.3").a();
        yq1 yq12 = new yq1.a().a(zp12).a(qm1.e).a(407).a("Preemptive Authenticate").a((cr1)n92.c).b(-1L).a(-1L).c().a();
        this.b.a().g().a(this.b, yq12);
        yq12 = zp12.g();
        this.a(n10, n12, q502);
        this.a(n12, n13, zp12, (rh0)yq12);
    }

    private final void a(int n10, int n12, q50 q502) throws IOException {
        NullPointerException nullPointerException2;
        block6: {
            Object object = this.b.b();
            ta ta3 = this.b.a();
            Object object2 = ((Proxy)object).type();
            int n13 = object2 == null ? -1 : a.a[object2.ordinal()];
            if (n13 != 1 && n13 != 2) {
                object2 = new Socket((Proxy)object);
            } else {
                object2 = ta3.i().createSocket();
                y.g(object2);
            }
            this.c = object2;
            this.b.getClass();
            q502.getClass();
            ((Socket)object2).setSoTimeout(n12);
            try {
                n12 = rh1.c;
                rh1.a.a().a((Socket)object2, this.b.d(), n10);
            }
            catch (ConnectException connectException) {
                object2 = this.b.d();
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed to connect to ");
                ((StringBuilder)object).append(object2);
                object2 = new ConnectException(((StringBuilder)object).toString());
                ((Throwable)object2).initCause(connectException);
                throw object2;
            }
            try {
                this.h = x.d(x.l((Socket)object2));
                this.i = x.c(x.h((Socket)object2));
            }
            catch (NullPointerException nullPointerException2) {
                if (y.e(((Throwable)nullPointerException2).getMessage(), "throw with null exception")) break block6;
            }
            return;
        }
        throw new IOException(nullPointerException2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void a(gr object) throws IOException {
        void var1_4;
        Object object2;
        block11: {
            cf0 cf02;
            int n10;
            String string2;
            Object object3;
            Object object4;
            block12: {
                object4 = this.b.a();
                object2 = object4.j();
                object3 = null;
                string2 = null;
                try {
                    y.g(object2);
                    object2 = ((SSLSocketFactory)object2).createSocket(this.c, object4.k().g(), object4.k().i(), true);
                    y.h(object2, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                    object2 = (SSLSocket)object2;
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block11;
                }
                try {
                    object3 = object.a((SSLSocket)object2);
                    if (!object3.b()) break block12;
                    n10 = rh1.c;
                    rh1.a.a().a((SSLSocket)object2, object4.k().g(), object4.e());
                }
                catch (Throwable throwable) {
                    break block11;
                }
            }
            ((SSLSocket)object2).startHandshake();
            object = ((SSLSocket)object2).getSession();
            Object object5 = cf0.a.a((SSLSession)object);
            Object object6 = object4.d();
            y.g(object6);
            if (!object6.verify(object4.k().g(), (SSLSession)object)) {
                object = object5.c();
                if (object.isEmpty() ^ true) {
                    object = object.get(0);
                    y.h(object, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    object3 = (X509Certificate)object;
                    string2 = object4.k().g();
                    object4 = qn.c;
                    object4 = qn.b.a((X509Certificate)object3);
                    object5 = ((X509Certificate)object3).getSubjectDN().getName();
                    object3 = be1.a((X509Certificate)object3);
                    object6 = new StringBuilder();
                    ((StringBuilder)object6).append("\n              |Hostname ");
                    ((StringBuilder)object6).append(string2);
                    ((StringBuilder)object6).append(" not verified:\n              |    certificate: ");
                    ((StringBuilder)object6).append((String)object4);
                    ((StringBuilder)object6).append("\n              |    DN: ");
                    ((StringBuilder)object6).append((String)object5);
                    ((StringBuilder)object6).append("\n              |    subjectAltNames: ");
                    ((StringBuilder)object6).append(object3);
                    ((StringBuilder)object6).append("\n              ");
                    object = new SSLPeerUnverifiedException(kotlin.text.p.h((String)((StringBuilder)object6).toString(), null, (int)1, null));
                    throw object;
                }
                string2 = object4.k().g();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("Hostname ");
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(" not verified (no certificates)");
                object = new SSLPeerUnverifiedException(((StringBuilder)object3).toString());
                throw object;
            }
            object = object4.a();
            y.g(object);
            t52 t522 = object5.d();
            zn zn3 = object5.a();
            List list = object5.b();
            object6 = new kotlin.jvm.functions.a<List<? extends Certificate>>((qn)object, (cf0)object5, (ta)object4){
                final qn b;
                final cf0 c;
                final ta d;
                {
                    this.b = qn3;
                    this.c = cf02;
                    this.d = ta3;
                    super(0);
                }

                public final Object invoke() {
                    pn pn3 = this.b.a();
                    y.g(pn3);
                    List list = this.c.c();
                    return pn3.a(this.d.k().g(), list);
                }
            };
            this.e = cf02 = new cf0(t522, zn3, list, (kotlin.jvm.functions.a)object6);
            object4 = object4.k().g();
            object5 = new kotlin.jvm.functions.a<List<? extends X509Certificate>>(this){
                final eo1 b;
                {
                    this.b = eo12;
                    super(0);
                }

                public final Object invoke() {
                    Object object = this.b.e;
                    y.g(object);
                    Object object2 = object.c();
                    object = new ArrayList(t.x((Iterable)object2, (int)10));
                    object2 = object2.iterator();
                    while (object2.hasNext()) {
                        Certificate certificate = (Certificate)object2.next();
                        y.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        ((ArrayList)object).add((X509Certificate)certificate);
                    }
                    return object;
                }
            };
            object.a((String)object4, (kotlin.jvm.functions.a)object5);
            object = string2;
            if (object3.b()) {
                n10 = rh1.c;
                object = rh1.a.a().b((SSLSocket)object2);
            }
            this.d = object2;
            this.h = x.d(x.l((Socket)object2));
            this.i = x.c(x.h((Socket)object2));
            if (object != null) {
                qm1.c.getClass();
                object = qm1.a.a((String)object);
            } else {
                object = qm1.e;
            }
            this.f = object;
            n10 = rh1.c;
            rh1.a.a().a((SSLSocket)object2);
            return;
        }
        if (object2 != null) {
            int n12 = rh1.c;
            rh1.a.a().a((SSLSocket)object2);
        }
        if (object2 != null) {
            n92.a((Socket)object2);
        }
        throw var1_4;
    }

    private final void a(gr object, q50 q502) throws IOException {
        if (this.b.a().j() == null) {
            object = this.b.a().e();
            if (object.contains(q502 = qm1.h)) {
                this.d = this.c;
                this.f = q502;
                this.n();
                return;
            }
            this.d = this.c;
            this.f = qm1.e;
            return;
        }
        q502.getClass();
        this.a((gr)object);
        if (this.f == qm1.g) {
            this.n();
        }
    }

    private final boolean a(rh0 object) {
        if (n92.f && !Thread.holdsLock((Object)this)) {
            String string2 = Thread.currentThread().getName();
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append((Object)this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        Object object2 = this.b.a().k();
        int n10 = object.i();
        int n12 = object2.i();
        boolean bl2 = false;
        if (n10 != n12) {
            return false;
        }
        if (y.e(object.g(), object2.g())) {
            return true;
        }
        boolean bl3 = bl2;
        if (!this.k) {
            object2 = this.e;
            bl3 = bl2;
            if (object2 != null) {
                y.g(object2);
                object2 = object2.c();
                bl3 = bl2;
                if (object2.isEmpty() ^ true) {
                    object = object.g();
                    object2 = object2.get(0);
                    y.h(object2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    bl3 = bl2;
                    if (be1.a((String)object, (X509Certificate)((X509Certificate)object2))) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    private final void n() throws IOException {
        Socket socket = this.d;
        y.g(socket);
        g g10 = this.h;
        y.g(g10);
        f f11 = this.i;
        y.g(f11);
        socket.setSoTimeout(0);
        socket = new sg0(new sg0.a(o42.h).a(socket, this.b.a().k().g(), g10, f11).a((sg0.b)this).j());
        this.g = socket;
        this.o = sg0.a().c();
        sg0.l((sg0)socket);
    }

    @NotNull
    public final w50 a(@NotNull ce1 object, @NotNull ho1 ho12) throws SocketException {
        Object object2 = this.d;
        y.g(object2);
        g g10 = this.h;
        y.g(g10);
        f f11 = this.i;
        y.g(f11);
        Object object3 = this.g;
        if (object3 != null) {
            object = new xg0((ce1)object, this, ho12, (sg0)object3);
        } else {
            object2.setSoTimeout(ho12.h());
            object3 = g10.timeout();
            long l10 = ho12.e();
            object2 = TimeUnit.MILLISECONDS;
            ((m0)object3).timeout(l10, (TimeUnit)((Object)object2));
            f11.timeout().timeout(ho12.g(), (TimeUnit)((Object)object2));
            object = new qg0((ce1)object, this, g10, f11);
        }
        return object;
    }

    public final void a() {
        Socket socket = this.c;
        if (socket != null) {
            n92.a((Socket)socket);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n10, int n12, int n13, boolean bl2, @NotNull q50 object) {
        IOException iOException2;
        if (this.f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        Object object2 = this.b.a().b();
        gr gr3 = new gr((List)object2);
        if (this.b.a().j() == null) {
            if (!object2.contains(fr.f)) {
                throw new bt1((IOException)new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            object2 = this.b.a().k().g();
            int n14 = rh1.c;
            if (!rh1.a.a().a((String)object2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("CLEARTEXT communication to ");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" not permitted by network security policy");
                throw new bt1((IOException)new UnknownServiceException(((StringBuilder)object).toString()));
            }
        } else if (this.b.a().e().contains(qm1.h)) {
            throw new bt1((IOException)new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        object2 = null;
        do {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            try {
                                if (!this.b.c()) break block13;
                                this.a(n10, n12, n13, (q50)object);
                                if (this.c != null) break block14;
                                break block15;
                            }
                            catch (IOException iOException2) {
                                break block16;
                            }
                        }
                        this.a(n10, n12, (q50)object);
                    }
                    this.a(gr3, (q50)object);
                    this.b.getClass();
                    this.b.getClass();
                    object.getClass();
                }
                if (this.b.c() && this.c == null) {
                    throw new bt1((IOException)new ProtocolException("Too many tunnel connections attempted: 21"));
                }
                this.q = System.nanoTime();
                return;
            }
            Socket socket = this.d;
            if (socket != null) {
                n92.a((Socket)socket);
            }
            if ((socket = this.c) != null) {
                n92.a((Socket)socket);
            }
            this.d = null;
            this.c = null;
            this.h = null;
            this.i = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.o = 1;
            this.b.getClass();
            this.b.getClass();
            object.getClass();
            if (object2 == null) {
                object2 = new bt1(iOException2);
                continue;
            }
            object2.a(iOException2);
        } while (bl2 && gr3.a(iOException2));
        throw object2;
    }

    public final void a(long l10) {
        this.q = l10;
    }

    public final void a(@NotNull by1 by12) {
        synchronized (this) {
            this.o = by12.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull do1 do12, @Nullable IOException iOException) {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                block11: {
                    block9: {
                        block10: {
                            try {
                                int n10;
                                if (!(iOException instanceof c32)) break block9;
                                iOException = ((c32)iOException).b;
                                if (iOException != m50.h) break block10;
                                this.n = n10 = this.n + 1;
                                if (n10 > 1) {
                                    this.j = true;
                                    ++this.l;
                                }
                                break block11;
                            }
                            catch (Throwable throwable2) {
                                break block12;
                            }
                        }
                        if (iOException != m50.i || !do12.j()) {
                            this.j = true;
                            ++this.l;
                        }
                        break block11;
                    }
                    if (!this.h() || iOException instanceof er) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                ce1 ce12 = do12.c();
                                do12 = this.b;
                                if (do12.b().type() != Proxy.Type.DIRECT) {
                                    ta ta3 = do12.a();
                                    ta3.h().connectFailed(ta3.k().l(), do12.b().address(), iOException);
                                }
                                ce12.n().b((zs1)do12);
                            }
                            ++this.l;
                        }
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(@NotNull zg0 zg02) throws IOException {
        zg02.a(m50.h, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(@NotNull ta object, @Nullable List<zs1> object2) {
        Proxy.Type type;
        zs1 zs12;
        Proxy.Type type2;
        void var2_5;
        if (n92.f && !Thread.holdsLock((Object)this)) {
            String string2 = Thread.currentThread().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(string2);
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append((Object)this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        if (this.p.size() >= this.o) return false;
        if (this.j) {
            return false;
        }
        if (!this.b.a().a((ta)object)) {
            return false;
        }
        if (y.e(object.k().g(), this.b.a().k().g())) {
            return true;
        }
        if (this.g == null) {
            return false;
        }
        if (var2_5 == null) return false;
        if (var2_5.isEmpty()) {
            return false;
        }
        Iterator iterator = var2_5.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((type2 = (zs12 = (zs1)iterator.next()).b().type()) != (type = Proxy.Type.DIRECT) || this.b.b().type() != type || !y.e(this.b.d(), zs12.d()));
        if (object.d() != be1.a) {
            return false;
        }
        if (!this.a(object.k())) {
            return false;
        }
        try {
            qn qn3 = object.a();
            y.g(qn3);
            String string3 = object.k().g();
            cf0 cf02 = this.e;
            y.g(cf02);
            qn3.a(string3, cf02.c());
            return true;
        }
        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(boolean bl2) {
        long l10;
        if (n92.f && Thread.holdsLock((Object)this)) {
            String string2 = Thread.currentThread().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(string2);
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append((Object)this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        long l11 = System.nanoTime();
        Socket socket = this.c;
        y.g(socket);
        Socket stringBuilder = this.d;
        y.g(stringBuilder);
        g g10 = this.h;
        y.g(g10);
        if (socket.isClosed()) return false;
        if (stringBuilder.isClosed()) return false;
        if (stringBuilder.isInputShutdown()) return false;
        if (stringBuilder.isOutputShutdown()) {
            return false;
        }
        socket = this.g;
        if (socket != null) {
            return socket.a(l11);
        }
        synchronized (this) {
            l10 = this.q;
        }
        if (l11 - l10 < 10000000000L) return true;
        if (!bl2) return true;
        return n92.a((Socket)stringBuilder, (g)g10);
    }

    @NotNull
    public final ArrayList b() {
        return this.p;
    }

    public final long c() {
        return this.q;
    }

    public final boolean d() {
        return this.j;
    }

    public final int e() {
        return this.l;
    }

    @Nullable
    public final cf0 f() {
        return this.e;
    }

    public final void g() {
        synchronized (this) {
            ++this.m;
            return;
        }
    }

    public final boolean h() {
        boolean bl2 = this.g != null;
        return bl2;
    }

    public final void i() {
        synchronized (this) {
            this.k = true;
            return;
        }
    }

    public final void j() {
        synchronized (this) {
            this.j = true;
            return;
        }
    }

    @NotNull
    public final zs1 k() {
        return this.b;
    }

    public final void l() {
        this.j = true;
    }

    @NotNull
    public final Socket m() {
        Socket socket = this.d;
        y.g(socket);
        return socket;
    }

    @NotNull
    public final String toString() {
        Object object;
        Object object2;
        InetSocketAddress inetSocketAddress;
        Proxy proxy;
        int n10;
        String string2;
        block3: {
            block2: {
                string2 = this.b.a().k().g();
                n10 = this.b.a().k().i();
                proxy = this.b.b();
                inetSocketAddress = this.b.d();
                object2 = this.e;
                if (object2 == null) break block2;
                object = object2.a();
                object2 = object;
                if (object != null) break block3;
            }
            object2 = "none";
        }
        qm1 qm12 = this.f;
        object = new StringBuilder();
        ((StringBuilder)object).append("Connection{");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n10);
        ((StringBuilder)object).append(", proxy=");
        ((StringBuilder)object).append(proxy);
        ((StringBuilder)object).append(" hostAddress=");
        ((StringBuilder)object).append(inetSocketAddress);
        ((StringBuilder)object).append(" cipherSuite=");
        ((StringBuilder)object).append(object2);
        ((StringBuilder)object).append(" protocol=");
        ((StringBuilder)object).append(qm12);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

