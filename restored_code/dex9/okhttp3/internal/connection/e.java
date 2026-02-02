/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  okhttp3.a
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.e
 *  okhttp3.f
 *  okhttp3.g
 *  okhttp3.internal.connection.c
 *  okhttp3.internal.connection.d
 *  okhttp3.internal.connection.g
 *  okhttp3.internal.d
 *  okhttp3.internal.http.d
 *  okhttp3.internal.platform.h
 *  okhttp3.j
 *  okhttp3.r
 *  okhttp3.v
 *  okhttp3.w
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.connection;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.internal.connection.a;
import okhttp3.internal.connection.d;
import okhttp3.internal.connection.f;
import okhttp3.internal.connection.g;
import okhttp3.internal.http.b;
import okhttp3.internal.platform.h;
import okhttp3.j;
import okhttp3.r;
import okhttp3.v;
import okhttp3.w;
import okhttp3.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00ab\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017*\u0001U\u0018\u00002\u00020\u0001:\u0002stB\u001f\u0012\u0006\u0010F\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020\u0018\u0012\u0006\u0010L\u001a\u00020\u001c\u00a2\u0006\u0004\bq\u0010rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001fH\u0000\u00a2\u0006\u0004\b&\u0010!J\u001d\u0010(\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001c\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0000\u00a2\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00022\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\b1\u00102J;\u00106\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0000\u00a2\u0006\u0004\b8\u0010\bJ\u0011\u0010:\u001a\u0004\u0018\u000109H\u0000\u00a2\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0002\u00a2\u0006\u0004\b<\u0010\u0004J\u0017\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u001c\u00a2\u0006\u0004\b@\u0010\u001eJ\u000f\u0010A\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\bA\u0010\u0012R\u0017\u0010F\u001a\u00020B8\u0006\u00a2\u0006\f\n\u0004\b1\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010I\u001a\u00020\u00188\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010\u001aR\u0017\u0010L\u001a\u00020\u001c8\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\u001eR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010NR\u001a\u0010T\u001a\u00020P8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b_\u0010`R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010b\u001a\u0004\u0018\u00010/8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\bR\u0010c\u001a\u0004\b_\u0010dR\u0016\u0010e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010JR(\u0010i\u001a\u0004\u0018\u00010,2\b\u0010b\u001a\u0004\u0018\u00010,8\u0000@BX\u0080\u000e\u00a2\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bf\u0010hR\u0016\u0010j\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u0010JR\u0016\u0010k\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010JR\u0016\u0010l\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b-\u0010JR\u0016\u0010m\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010JR\u0018\u00103\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u0010gR$\u0010p\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bA\u0010c\u001a\u0004\bn\u0010d\"\u0004\bo\u00102\u00a8\u0006u"}, d2={"Lokhttp3/internal/connection/e;", "Lokhttp3/e;", "Lkotlin/k0;", "e", "()V", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "z", "Lokhttp3/v;", "url", "Lokhttp3/a;", "g", "(Lokhttp3/v;)Lokhttp3/a;", "", "A", "()Ljava/lang/String;", "Lokio/c;", "x", "()Lokio/c;", "f", "()Lokhttp3/internal/connection/e;", "Lokhttp3/b0;", "request", "()Lokhttp3/b0;", "cancel", "", "isCanceled", "()Z", "Lokhttp3/d0;", "execute", "()Lokhttp3/d0;", "Lokhttp3/f;", "responseCallback", "enqueue", "(Lokhttp3/f;)V", "p", "newExchangeFinder", "h", "(Lokhttp3/b0;Z)V", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/connection/c;", "q", "(Lokhttp3/internal/http/g;)Lokhttp3/internal/connection/c;", "Lokhttp3/internal/connection/f;", "connection", "c", "(Lokhttp3/internal/connection/f;)V", "exchange", "requestDone", "responseDone", "r", "(Lokhttp3/internal/connection/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "s", "Ljava/net/Socket;", "u", "()Ljava/net/Socket;", "y", "closeExchange", "i", "(Z)V", "v", "t", "Lokhttp3/z;", "Lokhttp3/z;", "j", "()Lokhttp3/z;", "client", "Lokhttp3/b0;", "o", "originalRequest", "Z", "m", "forWebSocket", "Lokhttp3/internal/connection/g;", "Lokhttp3/internal/connection/g;", "connectionPool", "Lokhttp3/r;", "Lokhttp3/r;", "l", "()Lokhttp3/r;", "eventListener", "okhttp3/internal/connection/e$c", "Lokhttp3/internal/connection/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/internal/connection/d;", "k", "Lokhttp3/internal/connection/d;", "exchangeFinder", "<set-?>", "Lokhttp3/internal/connection/f;", "()Lokhttp3/internal/connection/f;", "timeoutEarlyExit", "n", "Lokhttp3/internal/connection/c;", "()Lokhttp3/internal/connection/c;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "getConnectionToCancel", "w", "connectionToCancel", "<init>", "(Lokhttp3/z;Lokhttp3/b0;Z)V", "a", "b", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class e
implements okhttp3.e {
    @NotNull
    private final z c;
    @NotNull
    private final b0 d;
    private final boolean e;
    @NotNull
    private final g f;
    @NotNull
    private final r g;
    @NotNull
    private final c h;
    @NotNull
    private final AtomicBoolean i;
    @Nullable
    private Object j;
    @Nullable
    private d k;
    @Nullable
    private f l;
    private boolean m;
    @Nullable
    private okhttp3.internal.connection.c n;
    private boolean o;
    private boolean p;
    private boolean q;
    private volatile boolean r;
    @Nullable
    private volatile okhttp3.internal.connection.c s;
    @Nullable
    private volatile f t;

    public e(@NotNull z z3, @NotNull b0 object, boolean bl) {
        y.j((Object)z3, (String)"client");
        y.j((Object)object, (String)"originalRequest");
        this.c = z3;
        this.d = object;
        this.e = bl;
        this.f = z3.l().a();
        this.g = z3.q().a((okhttp3.e)this);
        object = new okio.c(this){
            final e b;
            {
                this.b = e4;
            }

            @Override
            protected void timedOut() {
                this.b.cancel();
            }
        };
        object.timeout((long)z3.g(), TimeUnit.MILLISECONDS);
        this.h = object;
        this.i = new AtomicBoolean();
        this.q = true;
    }

    private final String A() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.isCanceled() ? "canceled " : "";
        stringBuilder.append(string);
        string = this.e ? "web socket" : "call";
        stringBuilder.append(string);
        stringBuilder.append(" to ");
        stringBuilder.append(this.t());
        return stringBuilder.toString();
    }

    public static final /* synthetic */ c a(e e4) {
        return e4.h;
    }

    public static final /* synthetic */ String b(e e4) {
        return e4.A();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final <E extends IOException> E d(E object) {
        boolean bl = okhttp3.internal.d.h;
        if (bl && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        Object object2 = this.l;
        if (object2 != null) {
            if (bl && Thread.holdsLock(object2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Thread ");
                ((StringBuilder)object).append(Thread.currentThread().getName());
                ((StringBuilder)object).append(" MUST NOT hold lock on ");
                ((StringBuilder)object).append(object2);
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
            // MONITORENTER : object2
            Socket socket = this.u();
            // MONITOREXIT : object2
            if (this.l == null) {
                if (socket != null) {
                    okhttp3.internal.d.n((Socket)socket);
                }
                this.g.l((okhttp3.e)this, (j)object2);
            } else if (socket != null) throw new IllegalStateException("Check failed.".toString());
        }
        object2 = this.z(object);
        if (object != null) {
            object = this.g;
            y.g((Object)object2);
            object.e((okhttp3.e)this, (IOException)object2);
            return (E)object2;
        }
        this.g.d((okhttp3.e)this);
        return (E)object2;
    }

    private final void e() {
        this.j = okhttp3.internal.platform.h.a.g().i("response.body().close()");
        this.g.f((okhttp3.e)this);
    }

    private final okhttp3.a g(v v3) {
        HostnameVerifier hostnameVerifier;
        HostnameVerifier hostnameVerifier2;
        SSLSocketFactory sSLSocketFactory;
        if (v3.j()) {
            sSLSocketFactory = this.c.I();
            hostnameVerifier2 = this.c.u();
            hostnameVerifier = this.c.j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = hostnameVerifier2 = null;
        }
        return new okhttp3.a(v3.i(), v3.n(), this.c.p(), this.c.H(), sSLSocketFactory, hostnameVerifier2, (okhttp3.g)hostnameVerifier, this.c.D(), this.c.C(), this.c.B(), this.c.m(), this.c.E());
    }

    private final <E extends IOException> E z(E e4) {
        if (this.m) {
            return e4;
        }
        if (!this.h.exit()) {
            return e4;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e4 != null) {
            interruptedIOException.initCause(e4);
        }
        return (E)interruptedIOException;
    }

    public final void c(@NotNull f f4) {
        y.j((Object)((Object)f4), (String)"connection");
        if (okhttp3.internal.d.h && !Thread.holdsLock((Object)f4)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append((Object)f4);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        if (this.l == null) {
            this.l = f4;
            f4.n().add((Reference<e>)new /* Unavailable Anonymous Inner Class!! */);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void cancel() {
        if (this.r) {
            return;
        }
        this.r = true;
        Object object = this.s;
        if (object != null) {
            object.b();
        }
        if ((object = this.t) != null) {
            ((f)((Object)object)).d();
        }
        this.g.g((okhttp3.e)this);
    }

    public void enqueue(@NotNull okhttp3.f f4) {
        y.j((Object)f4, (String)"responseCallback");
        if (this.i.compareAndSet(false, true)) {
            this.e();
            this.c.o().a(new /* Unavailable Anonymous Inner Class!! */);
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @NotNull
    public d0 execute() {
        if (this.i.compareAndSet(false, true)) {
            this.h.enter();
            this.e();
            try {
                this.c.o().b(this);
                d0 d02 = this.p();
                return d02;
            }
            finally {
                this.c.o().g(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @NotNull
    public e f() {
        return new e(this.c, this.d, this.e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h(@NotNull b0 object, boolean bl) {
        block4: {
            block5: {
                y.j((Object)object, (String)"request");
                if (this.n != null) throw new IllegalStateException("Check failed.".toString());
                // MONITORENTER : this
                if (!(this.p ^ true)) break block4;
                if (!(this.o ^ true)) break block5;
                k0 k02 = k0.a;
                // MONITOREXIT : this
                if (!bl) return;
                this.k = new d(this.f, this.g(object.k()), this, this.g);
                return;
            }
            object = new IllegalStateException("Check failed.".toString());
            throw object;
        }
        object = new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(boolean bl) {
        block4: {
            block5: {
                // MONITORENTER : this
                if (!this.q) break block4;
                k0 k02 = k0.a;
                // MONITOREXIT : this
                if (!bl || (k02 = this.s) == null) break block5;
                k02.d();
            }
            this.n = null;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("released".toString());
        throw illegalStateException;
    }

    public boolean isCanceled() {
        return this.r;
    }

    @NotNull
    public final z j() {
        return this.c;
    }

    @Nullable
    public final f k() {
        return this.l;
    }

    @NotNull
    public final r l() {
        return this.g;
    }

    public final boolean m() {
        return this.e;
    }

    @Nullable
    public final okhttp3.internal.connection.c n() {
        return this.n;
    }

    @NotNull
    public final b0 o() {
        return this.d;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final d0 p() throws IOException {
        void var3_6;
        boolean bl;
        Object object;
        block8: {
            object = new ArrayList<Object>();
            kotlin.collections.t.E(object, this.c.v());
            object.add(new okhttp3.internal.http.j(this.c));
            object.add(new okhttp3.internal.http.a(this.c.n()));
            object.add(new okhttp3.internal.cache.a(this.c.f()));
            object.add(a.a);
            if (!this.e) {
                kotlin.collections.t.E(object, this.c.x());
            }
            object.add(new b(this.e));
            object = new okhttp3.internal.http.g(this, (List<? extends w>)object, 0, null, this.d, this.c.k(), this.c.F(), this.c.K());
            bl = false;
            object = ((okhttp3.internal.http.g)object).proceed(this.d);
            boolean bl2 = this.isCanceled();
            if (bl2) break block8;
            this.s(null);
            return object;
        }
        try {
            okhttp3.internal.d.m((Closeable)object);
            object = new IOException("Canceled");
            throw object;
        }
        catch (Throwable throwable) {
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = this.s(iOException);
                y.h((Object)iOException2, (String)"null cannot be cast to non-null type kotlin.Throwable");
                throw iOException2;
            }
            catch (Throwable throwable) {
                bl = true;
            }
        }
        if (!bl) {
            this.s(null);
        }
        throw var3_6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @NotNull
    public final okhttp3.internal.connection.c q(@NotNull okhttp3.internal.http.g object) {
        block6: {
            block7: {
                block8: {
                    y.j((Object)object, (String)"chain");
                    // MONITORENTER : this
                    if (!this.q) break block6;
                    if (!(this.p ^ true)) break block7;
                    if (!(this.o ^ true)) break block8;
                    k0 k02 = k0.a;
                    // MONITOREXIT : this
                    k02 = this.k;
                    y.g((Object)k02);
                    object = k02.a(this.c, (okhttp3.internal.http.g)object);
                    object = new okhttp3.internal.connection.c(this, this.g, (d)k02, (okhttp3.internal.http.d)object);
                    this.n = object;
                    this.s = object;
                    // MONITORENTER : this
                    this.o = true;
                    this.p = true;
                    // MONITOREXIT : this
                    if (this.r) throw new IOException("Canceled");
                    return object;
                }
                object = new IllegalStateException("Check failed.".toString());
                throw object;
            }
            object = new IllegalStateException("Check failed.".toString());
            throw object;
        }
        object = new IllegalStateException("released".toString());
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final <E extends IOException> E r(@NotNull okhttp3.internal.connection.c object, boolean bl, boolean bl2, E e4) {
        boolean bl3;
        boolean bl4;
        block13: {
            block12: {
                boolean bl5;
                block11: {
                    y.j((Object)object, (String)"exchange");
                    if (!y.e((Object)object, (Object)this.s)) {
                        return e4;
                    }
                    // MONITORENTER : this
                    bl4 = false;
                    bl5 = false;
                    if (bl) {
                        if (this.o) break block11;
                    }
                    if (!bl2 || !this.p) break block12;
                }
                if (bl) {
                    this.o = false;
                }
                if (bl2) {
                    this.p = false;
                }
                bl4 = !(bl = this.o) && !this.p;
                bl3 = bl5;
                if (bl) break block13;
                bl3 = bl5;
                if (!this.p) {
                    bl3 = bl5;
                    if (!this.q) {
                        bl3 = true;
                    }
                }
                break block13;
            }
            bl3 = false;
        }
        object = k0.a;
        // MONITOREXIT : this
        if (bl4) {
            this.s = null;
            object = this.l;
            if (object != null) {
                object.s();
            }
        }
        if (!bl3) return e4;
        return this.d(e4);
    }

    @NotNull
    public b0 request() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final IOException s(@Nullable IOException iOException) {
        synchronized (this) {
            try {
                boolean bl;
                boolean bl2 = this.q;
                boolean bl3 = bl = false;
                if (bl2) {
                    this.q = false;
                    bl3 = bl;
                    if (!this.o) {
                        bl3 = bl;
                        if (!this.p) {
                            bl3 = true;
                        }
                    }
                }
                Object object = k0.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl13 : MonitorExitStatement: MONITOREXIT : this
                object = iOException;
                if (!bl3) return object;
                return this.d(iOException);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NotNull
    public final String t() {
        return this.d.k().p();
    }

    @Nullable
    public final Socket u() {
        int n4;
        List<Reference<e>> list;
        f f4;
        block6: {
            f4 = this.l;
            y.g((Object)((Object)f4));
            if (okhttp3.internal.d.h && !Thread.holdsLock((Object)f4)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(Thread.currentThread().getName());
                stringBuilder.append(" MUST hold lock on ");
                stringBuilder.append((Object)f4);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            list = f4.n();
            Iterator<Reference<e>> iterator = list.iterator();
            n4 = 0;
            while (iterator.hasNext()) {
                if (!y.e((Object)iterator.next().get(), (Object)this)) {
                    ++n4;
                    continue;
                }
                break block6;
            }
            n4 = -1;
        }
        if (n4 != -1) {
            list.remove(n4);
            this.l = null;
            if (list.isEmpty()) {
                f4.C(System.nanoTime());
                if (this.f.c(f4)) {
                    return f4.E();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean v() {
        d d4 = this.k;
        y.g((Object)d4);
        return d4.e();
    }

    public final void w(@Nullable f f4) {
        this.t = f4;
    }

    @NotNull
    public okio.c x() {
        return this.h;
    }

    public final void y() {
        if (this.m ^ true) {
            this.m = true;
            this.h.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

