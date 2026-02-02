/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  okhttp3.a0
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.e
 *  okhttp3.f
 *  okhttp3.h0
 *  okhttp3.i0
 *  okhttp3.internal.concurrent.a
 *  okhttp3.internal.concurrent.d
 *  okhttp3.internal.concurrent.e
 *  okhttp3.internal.connection.c
 *  okhttp3.internal.d
 *  okhttp3.internal.ws.d$a
 *  okhttp3.internal.ws.d$b
 *  okhttp3.internal.ws.d$c
 *  okhttp3.internal.ws.d$d
 *  okhttp3.internal.ws.e
 *  okhttp3.internal.ws.f
 *  okhttp3.internal.ws.g
 *  okhttp3.internal.ws.g$a
 *  okhttp3.internal.ws.h
 *  okhttp3.r
 *  okio.h
 *  okio.h$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.ranges.i;
import kotlin.text.p;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.h0;
import okhttp3.i0;
import okhttp3.internal.ws.d;
import okhttp3.internal.ws.f;
import okhttp3.internal.ws.g;
import okhttp3.internal.ws.h;
import okhttp3.r;
import okhttp3.z;
import okio.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0005)*&J<BA\u0012\u0006\u0010z\u001a\u00020y\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020G\u0012\u0006\u0010L\u001a\u000203\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010P\u001a\u000203\u00a2\u0006\u0004\b{\u0010|J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r\u00a2\u0006\u0004\b!\u0010\u000fJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b*\u0010'J\u001f\u0010-\u001a\u00020\r2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u001b2\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0000\u00a2\u0006\u0004\b9\u0010\u000fJ#\u0010=\u001a\u00020\r2\n\u0010<\u001a\u00060:j\u0002`;2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010@R\u001a\u0010F\u001a\u00020B8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b*\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010HR\u0014\u0010L\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010MR\u0016\u0010P\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bO\u0010KR\u0014\u0010S\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010^R\u0016\u0010b\u001a\u00020`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010RR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010eR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020g0d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010eR\u0016\u0010i\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010KR\u0016\u0010k\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000b\u0010jR\u0016\u0010m\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010RR\u0016\u0010p\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bo\u0010jR\u0016\u0010r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bq\u0010lR\u0016\u0010t\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bs\u0010lR\u0016\u0010v\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bu\u0010lR\u0016\u0010x\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bw\u0010j\u00a8\u0006~"}, d2={"Lokhttp3/internal/ws/d;", "Lokhttp3/h0;", "Lokhttp3/internal/ws/g$a;", "Lokhttp3/internal/ws/e;", "", "o", "(Lokhttp3/internal/ws/e;)Z", "Lokio/h;", "data", "", "formatOpcode", "r", "(Lokio/h;I)Z", "Lkotlin/k0;", "q", "()V", "h", "Lokhttp3/z;", "client", "k", "(Lokhttp3/z;)V", "Lokhttp3/d0;", "response", "Lokhttp3/internal/connection/c;", "exchange", "i", "(Lokhttp3/d0;Lokhttp3/internal/connection/c;)V", "", "name", "Lokhttp3/internal/ws/d$d;", "streams", "n", "(Ljava/lang/String;Lokhttp3/internal/ws/d$d;)V", "p", "text", "onReadMessage", "(Ljava/lang/String;)V", "bytes", "c", "(Lokio/h;)V", "payload", "a", "b", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "close", "(ILjava/lang/String;)Z", "", "cancelAfterCloseMillis", "j", "(ILjava/lang/String;J)Z", "s", "()Z", "t", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "l", "(Ljava/lang/Exception;Lokhttp3/d0;)V", "Lokhttp3/b0;", "Lokhttp3/b0;", "originalRequest", "Lokhttp3/i0;", "Lokhttp3/i0;", "m", "()Lokhttp3/i0;", "listener", "Ljava/util/Random;", "Ljava/util/Random;", "random", "d", "J", "pingIntervalMillis", "Lokhttp3/internal/ws/e;", "extensions", "f", "minimumDeflateSize", "g", "Ljava/lang/String;", "key", "Lokhttp3/e;", "Lokhttp3/e;", "call", "Lokhttp3/internal/concurrent/a;", "Lokhttp3/internal/concurrent/a;", "writerTask", "Lokhttp3/internal/ws/g;", "Lokhttp3/internal/ws/g;", "reader", "Lokhttp3/internal/ws/h;", "Lokhttp3/internal/ws/h;", "writer", "Lokhttp3/internal/concurrent/d;", "Lokhttp3/internal/concurrent/d;", "taskQueue", "Lokhttp3/internal/ws/d$d;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "pongQueue", "", "messageAndCloseQueue", "queueSize", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "u", "failed", "v", "sentPingCount", "w", "receivedPingCount", "x", "receivedPongCount", "y", "awaitingPong", "Lokhttp3/internal/concurrent/e;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/e;Lokhttp3/b0;Lokhttp3/i0;Ljava/util/Random;JLokhttp3/internal/ws/e;J)V", "z", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class d
implements h0,
g.a {
    @NotNull
    private static final List<a0> A;
    @NotNull
    public static final b z;
    @NotNull
    private final b0 a;
    @NotNull
    private final i0 b;
    @NotNull
    private final Random c;
    private final long d;
    @Nullable
    private okhttp3.internal.ws.e e;
    private long f;
    @NotNull
    private final String g;
    @Nullable
    private okhttp3.e h;
    @Nullable
    private okhttp3.internal.concurrent.a i;
    @Nullable
    private g j;
    @Nullable
    private h k;
    @NotNull
    private okhttp3.internal.concurrent.d l;
    @Nullable
    private String m;
    @Nullable
    private d n;
    @NotNull
    private final ArrayDeque<okio.h> o;
    @NotNull
    private final ArrayDeque<Object> p;
    private long q;
    private boolean r;
    private int s;
    @Nullable
    private String t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private boolean y;

    static {
        z = new /* Unavailable Anonymous Inner Class!! */;
        A = kotlin.collections.t.e(a0.f);
    }

    public d(@NotNull okhttp3.internal.concurrent.e object, @NotNull b0 object2, @NotNull i0 i02, @NotNull Random random, long l4, @Nullable okhttp3.internal.ws.e e4, long l5) {
        kotlin.jvm.internal.y.j((Object)object, (String)"taskRunner");
        kotlin.jvm.internal.y.j((Object)object2, (String)"originalRequest");
        kotlin.jvm.internal.y.j((Object)i02, (String)"listener");
        kotlin.jvm.internal.y.j((Object)random, (String)"random");
        this.a = object2;
        this.b = i02;
        this.c = random;
        this.d = l4;
        this.e = e4;
        this.f = l5;
        this.l = object.i();
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.s = -1;
        if (kotlin.jvm.internal.y.e((Object)"GET", (Object)object2.h())) {
            object = okio.h.f;
            object2 = new byte[16];
            random.nextBytes((byte[])object2);
            i02 = k0.a;
            this.g = h.a.g((h.a)object, (byte[])object2, (int)0, (int)0, (int)3, null).a();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Request must be GET: ");
        ((StringBuilder)object).append(object2.h());
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    private final boolean o(okhttp3.internal.ws.e e4) {
        if (e4.f) {
            return false;
        }
        if (e4.b != null) {
            return false;
        }
        return e4.d == null || new i(8, 15).i(e4.d);
    }

    private final void q() {
        if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        okhttp3.internal.concurrent.a a4 = this.i;
        if (a4 != null) {
            okhttp3.internal.concurrent.d.j((okhttp3.internal.concurrent.d)this.l, (okhttp3.internal.concurrent.a)a4, (long)0L, (int)2, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean r(okio.h h4, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.u || this.r) break block4;
                        if (this.q + (long)h4.C() > 0x1000000L) {
                            this.close(1001, null);
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.q += (long)h4.C();
                    ArrayDeque<Object> arrayDeque = this.p;
                    c c4 = new /* Unavailable Anonymous Inner Class!! */;
                    arrayDeque.add(c4);
                    this.q();
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NotNull okio.h h4) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            kotlin.jvm.internal.y.j((Object)h4, (String)"payload");
                            if (!this.u && (!this.r || !this.p.isEmpty())) break block3;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.o.add(h4);
                    this.q();
                    ++this.w;
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void b(@NotNull okio.h h4) {
        synchronized (this) {
            kotlin.jvm.internal.y.j((Object)h4, (String)"payload");
            ++this.x;
            this.y = false;
            return;
        }
    }

    public void c(@NotNull okio.h h4) throws IOException {
        kotlin.jvm.internal.y.j((Object)h4, (String)"bytes");
        this.b.onMessage((h0)this, h4);
    }

    public boolean close(int n4, @Nullable String string) {
        return this.j(n4, string, 60000L);
    }

    public void h() {
        okhttp3.e e4 = this.h;
        kotlin.jvm.internal.y.g((Object)e4);
        e4.cancel();
    }

    public final void i(@NotNull d0 object, @Nullable okhttp3.internal.connection.c object2) throws IOException {
        kotlin.jvm.internal.y.j((Object)object, (String)"response");
        if (object.m() == 101) {
            String string = d0.w((d0)object, (String)"Connection", null, (int)2, null);
            if (kotlin.text.p.z("Upgrade", string, true)) {
                string = d0.w((d0)object, (String)"Upgrade", null, (int)2, null);
                if (kotlin.text.p.z("websocket", string, true)) {
                    object = d0.w((d0)object, (String)"Sec-WebSocket-Accept", null, (int)2, null);
                    string = okio.h.f;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.g);
                    stringBuilder.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    string = string.d(stringBuilder.toString()).A().a();
                    if (kotlin.jvm.internal.y.e((Object)string, (Object)object)) {
                        if (object2 != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Expected 'Sec-WebSocket-Accept' header value '");
                    ((StringBuilder)object2).append(string);
                    ((StringBuilder)object2).append("' but was '");
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append('\'');
                    throw new ProtocolException(((StringBuilder)object2).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected 'Upgrade' header value 'websocket' but was '");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('\'');
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected 'Connection' header value 'Upgrade' but was '");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('\'');
            throw new ProtocolException(((StringBuilder)object).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Expected HTTP 101 response but was '");
        ((StringBuilder)object2).append(object.m());
        ((StringBuilder)object2).append(' ');
        ((StringBuilder)object2).append(object.C());
        ((StringBuilder)object2).append('\'');
        throw new ProtocolException(((StringBuilder)object2).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j(int n4, @Nullable String object, long l4) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2;
                block6: {
                    block5: {
                        try {
                            okhttp3.internal.ws.f.a.c(n4);
                            if (object == null) break block5;
                            object2 = okio.h.f.d((String)object);
                            if ((long)object2.C() > 123L) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("reason.size() > 123: ");
                                ((StringBuilder)object2).append((String)object);
                                object2 = ((StringBuilder)object2).toString();
                                object = new IllegalArgumentException(object2.toString());
                                throw object;
                            }
                            object = object2;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object = null;
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    ArrayDeque<Object> arrayDeque = this.p;
                    object2 = new /* Unavailable Anonymous Inner Class!! */;
                    arrayDeque.add(object2);
                    this.q();
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final void k(@NotNull z z3) {
        kotlin.jvm.internal.y.j((Object)z3, (String)"client");
        if (this.a.d("Sec-WebSocket-Extensions") != null) {
            this.l(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        Object object = z3.y().g(okhttp3.r.b).N(A).c();
        z3 = this.a.i().e("Upgrade", "websocket").e("Connection", "Upgrade").e("Sec-WebSocket-Key", this.g).e("Sec-WebSocket-Version", "13").e("Sec-WebSocket-Extensions", "permessage-deflate").b();
        object = new okhttp3.internal.connection.e((z)object, (b0)z3, true);
        this.h = object;
        kotlin.jvm.internal.y.g((Object)object);
        object.enqueue(new okhttp3.f(this, (b0)z3){
            final d c;
            final b0 d;
            {
                this.c = d4;
                this.d = b02;
            }

            public void onFailure(@NotNull okhttp3.e e4, @NotNull IOException iOException) {
                kotlin.jvm.internal.y.j((Object)e4, (String)"call");
                kotlin.jvm.internal.y.j((Object)iOException, (String)"e");
                this.c.l(iOException, null);
            }

            public void onResponse(@NotNull okhttp3.e e4, @NotNull d0 d02) {
                kotlin.jvm.internal.y.j((Object)e4, (String)"call");
                kotlin.jvm.internal.y.j((Object)d02, (String)"response");
                Object object = d02.p();
                try {
                    this.c.i(d02, (okhttp3.internal.connection.c)object);
                    kotlin.jvm.internal.y.g((Object)object);
                    e4 = object.n();
                }
                catch (IOException iOException) {
                    this.c.l(iOException, d02);
                    okhttp3.internal.d.m((Closeable)d02);
                    if (object != null) {
                        object.v();
                    }
                    return;
                }
                object = okhttp3.internal.ws.e.g.a(d02.z());
                this.c.e = (okhttp3.internal.ws.e)object;
                if (!this.c.o((okhttp3.internal.ws.e)object)) {
                    object = this.c;
                    synchronized (object) {
                        ((d)object).p.clear();
                        ((d)object).close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(okhttp3.internal.d.i);
                    ((StringBuilder)object).append(" WebSocket ");
                    ((StringBuilder)object).append(this.d.k().p());
                    object = ((StringBuilder)object).toString();
                    this.c.n((String)object, e4);
                    this.c.m().onOpen((h0)this.c, d02);
                    this.c.p();
                }
                catch (Exception exception) {
                    this.c.l(exception, null);
                }
            }
        });
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(@NotNull Exception exception, @Nullable d0 d02) {
        h h4;
        g g4;
        d d4;
        kotlin.jvm.internal.y.j((Object)exception, (String)"e");
        synchronized (this) {
            boolean bl = this.u;
            if (bl) {
                return;
            }
            this.u = true;
            d4 = this.n;
            this.n = null;
            g4 = this.j;
            this.j = null;
            h4 = this.k;
            this.k = null;
            this.l.n();
            k0 k02 = k0.a;
        }
        try {
            void var2_3;
            this.b.onFailure((h0)this, (Throwable)exception, (d0)var2_3);
            return;
        }
        finally {
            if (d4 != null) {
                okhttp3.internal.d.m((Closeable)d4);
            }
            if (g4 != null) {
                okhttp3.internal.d.m((Closeable)g4);
            }
            if (h4 != null) {
                okhttp3.internal.d.m((Closeable)h4);
            }
        }
    }

    @NotNull
    public final i0 m() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void n(@NotNull String string, @NotNull d d4) throws IOException {
        Object object;
        kotlin.jvm.internal.y.j((Object)string, (String)"name");
        kotlin.jvm.internal.y.j((Object)d4, (String)"streams");
        okhttp3.internal.ws.e e4 = this.e;
        kotlin.jvm.internal.y.g((Object)e4);
        // MONITORENTER : this
        this.m = string;
        this.n = d4;
        this.k = object = new h(d4.d(), d4.h(), this.c, e4.a, e4.a(d4.d()), this.f);
        object = new e(this);
        this.i = object;
        long l4 = this.d;
        if (l4 != 0L) {
            l4 = TimeUnit.MILLISECONDS.toNanos(l4);
            object = this.l;
            Object object2 = new StringBuilder();
            object2.append(string);
            object2.append(" ping");
            string = object2.toString();
            object2 = new okhttp3.internal.concurrent.a(string, this, l4){
                final d e;
                final long f;
                {
                    this.e = d4;
                    this.f = l4;
                    super(string, false, 2, null);
                }

                public long f() {
                    this.e.t();
                    return this.f;
                }
            };
            object.i((okhttp3.internal.concurrent.a)object2, l4);
        }
        if (this.p.isEmpty() ^ true) {
            this.q();
        }
        string = k0.a;
        // MONITOREXIT : this
        this.j = new g(d4.d(), d4.k(), (g.a)this, e4.a, e4.a(d4.d() ^ true));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void onReadClose(int n4, @NotNull String object) {
        block12: {
            Throwable throwable2;
            h h4;
            g g4;
            d d4;
            block14: {
                block13: {
                    kotlin.jvm.internal.y.j((Object)object, (String)"reason");
                    if (n4 == -1) throw new IllegalArgumentException("Failed requirement.".toString());
                    // MONITORENTER : this
                    if (this.s != -1) break block12;
                    this.s = n4;
                    this.t = object;
                    boolean bl = this.r;
                    d4 = null;
                    if (bl && this.p.isEmpty()) {
                        d4 = this.n;
                        this.n = null;
                        g4 = this.j;
                        this.j = null;
                        h4 = this.k;
                        this.k = null;
                        this.l.n();
                    } else {
                        g4 = null;
                        h4 = null;
                    }
                    k0 k02 = k0.a;
                    // MONITOREXIT : this
                    try {
                        this.b.onClosing((h0)this, n4, (String)object);
                        if (d4 == null) break block13;
                        this.b.onClosed((h0)this, n4, (String)object);
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                }
                if (d4 != null) {
                    okhttp3.internal.d.m((Closeable)d4);
                }
                if (g4 != null) {
                    okhttp3.internal.d.m((Closeable)g4);
                }
                if (h4 == null) return;
                okhttp3.internal.d.m((Closeable)h4);
                return;
            }
            if (d4 != null) {
                okhttp3.internal.d.m((Closeable)d4);
            }
            if (g4 != null) {
                okhttp3.internal.d.m((Closeable)g4);
            }
            if (h4 == null) throw throwable2;
            okhttp3.internal.d.m((Closeable)h4);
            throw throwable2;
        }
        object = new IllegalStateException("already closed".toString());
        throw object;
    }

    public void onReadMessage(@NotNull String string) throws IOException {
        kotlin.jvm.internal.y.j((Object)string, (String)"text");
        this.b.onMessage((h0)this, string);
    }

    public final void p() throws IOException {
        while (this.s == -1) {
            g g4 = this.j;
            kotlin.jvm.internal.y.g((Object)g4);
            g4.d();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean s() throws IOException {
        block25: {
            block24: {
                block28: {
                    block23: {
                        synchronized (this) {
                            block26: {
                                block27: {
                                    block21: {
                                        try {
                                            var4_1 = this.u;
                                            if (!var4_1) break block21;
                                        }
                                        catch (Throwable var5_10) {
                                            ** break block22
                                        }
                                        return false;
                                    }
                                    var11_2 = this.k;
                                    var12_3 = this.o.poll();
                                    var10_4 = null;
                                    if (var12_3 != null) break block26;
                                    var9_5 = this.p.poll();
                                    if (!(var9_5 instanceof a)) break block27;
                                    var1_6 = this.s;
                                    var8_7 = this.t;
                                    if (var1_6 != -1) {
                                        var5_9 = this.n;
                                        this.n = null;
                                        var6_11 = this.j;
                                        this.j = null;
                                        var7_12 /* !! */  = this.k;
                                        this.k = null;
                                        this.l.n();
                                    } else {
                                        var2_13 = (var9_5).a();
                                        var5_9 = this.l;
                                        var6_11 = new StringBuilder();
                                        var6_11.append(this.m);
                                        var6_11.append(" cancel");
                                        var6_11 = var6_11.toString();
                                        var2_13 = TimeUnit.MILLISECONDS.toNanos(var2_13);
                                        var7_12 /* !! */  = new okhttp3.internal.concurrent.a((String)var6_11, true, this){
                                            final d e;
                                            {
                                                this.e = d4;
                                                super(string, bl);
                                            }

                                            public long f() {
                                                this.e.h();
                                                return -1L;
                                            }
                                        };
                                        var5_9.i((okhttp3.internal.concurrent.a)var7_12 /* !! */ , var2_13);
                                        var5_9 = null;
                                        var7_12 /* !! */  = var6_11 = null;
                                    }

                                }
                                if (var9_5 == null) {
                                    return false;
                                }
                                var8_7 = null;
                                var7_12 /* !! */  = var6_11 = null;
                                var1_6 = -1;
                                var5_9 = var7_12 /* !! */ ;

                            }
                            var8_7 = null;
                            var5_9 = var6_11 = null;
                            var1_6 = -1;
                            var9_5 = var5_9;
                            var7_12 /* !! */  = var5_9;
                            var5_9 = var9_5;
                            var9_5 = var10_4;

                            {
                                var10_4 = k0.a;
                                // MONITOREXIT @DISABLED, blocks:[2, 7] lbl57 : MonitorExitStatement: MONITOREXIT : this
                                if (var12_3 == null) break block23;
                            }
                        }
                        try {
                            kotlin.jvm.internal.y.g((Object)var11_2);
                            var11_2.f(var12_3);
                            break block24;
                        }
                        catch (Throwable var8_8) {
                            break block25;
                        }
                    }
                    if (!(var9_5 instanceof c)) break block28;
                    var8_7 = var9_5;
                    kotlin.jvm.internal.y.g((Object)var11_2);
                    var11_2.d(var8_7.b(), var8_7.a());
                    synchronized (this) {
                        this.q -= (long)var8_7.a().C();
                        break block24;
                    }
                }
                if (!(var9_5 instanceof a)) ** GOTO lbl-1000
                var9_5 = var9_5;
                kotlin.jvm.internal.y.g((Object)var11_2);
                var11_2.a(var9_5.b(), var9_5.c());
                if (var5_9 != null) {
                    var9_5 = this.b;
                    kotlin.jvm.internal.y.g((Object)var8_7);
                    var9_5.onClosed((h0)this, var1_6, (String)var8_7);
                }
            }
            if (var5_9 != null) {
                okhttp3.internal.d.m((Closeable)var5_9);
            }
            if (var6_11 != null) {
                okhttp3.internal.d.m((Closeable)var6_11);
            }
            if (var7_12 /* !! */  != null) {
                okhttp3.internal.d.m((Closeable)var7_12 /* !! */ );
            }
            return true;

            {
                var8_7 = new AssertionError();
                throw var8_7;
            }
        }
        if (var5_9 != null) {
            okhttp3.internal.d.m((Closeable)var5_9);
        }
        if (var6_11 != null) {
            okhttp3.internal.d.m((Closeable)var6_11);
        }
        if (var7_12 /* !! */  != null) {
            okhttp3.internal.d.m((Closeable)var7_12 /* !! */ );
        }
        throw var8_8;

        {
            throw var5_10;
        }
    }

    public boolean send(@NotNull String string) {
        kotlin.jvm.internal.y.j((Object)string, (String)"text");
        return this.r(okio.h.f.d(string), 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void t() {
        h h4;
        block9: {
            block8: {
                // MONITORENTER : this
                boolean bl = this.u;
                if (!bl) break block8;
                return;
            }
            h4 = this.k;
            if (h4 != null) break block9;
            // MONITOREXIT : this
            return;
        }
        int n4 = this.y ? this.v : -1;
        ++this.v;
        this.y = true;
        Object object = k0.a;
        // MONITOREXIT : this
        if (n4 != -1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("sent ping but didn't receive pong within ");
            ((StringBuilder)object).append(this.d);
            ((StringBuilder)object).append("ms (after ");
            ((StringBuilder)object).append(n4 - 1);
            ((StringBuilder)object).append(" successful ping/pongs)");
            this.l(new SocketTimeoutException(((StringBuilder)object).toString()), null);
            return;
        }
        try {
            h4.e(okio.h.g);
            return;
        }
        catch (IOException iOException) {
            this.l(iOException, null);
        }
    }

    @Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0007"}, d2={"Lokhttp3/internal/ws/d$e;", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "<init>", "(Lokhttp3/internal/ws/d;)V", "okhttp"}, k=1, mv={1, 8, 0})
    private final class e
    extends okhttp3.internal.concurrent.a {
        final d e;

        public e(d d4) {
            this.e = d4;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d4.m);
            stringBuilder.append(" writer");
            super(stringBuilder.toString(), false, 2, null);
        }

        public long f() {
            try {
                boolean bl = this.e.s();
                if (bl) {
                    return 0L;
                }
            }
            catch (IOException iOException) {
                this.e.l(iOException, null);
            }
            return -1L;
        }
    }
}

