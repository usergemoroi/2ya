/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.a
 *  okhttp3.a0
 *  okhttp3.b0
 *  okhttp3.b0$a
 *  okhttp3.d0
 *  okhttp3.d0$a
 *  okhttp3.e
 *  okhttp3.f0
 *  okhttp3.g
 *  okhttp3.g0
 *  okhttp3.i
 *  okhttp3.internal.concurrent.e
 *  okhttp3.internal.connection.b
 *  okhttp3.internal.connection.c
 *  okhttp3.internal.connection.f$a
 *  okhttp3.internal.connection.f$b
 *  okhttp3.internal.connection.g
 *  okhttp3.internal.connection.i
 *  okhttp3.internal.d
 *  okhttp3.internal.http.d
 *  okhttp3.internal.http2.a
 *  okhttp3.internal.http2.b
 *  okhttp3.internal.http2.f
 *  okhttp3.internal.http2.f$a
 *  okhttp3.internal.http2.f$c
 *  okhttp3.internal.http2.i
 *  okhttp3.internal.http2.m
 *  okhttp3.internal.http2.n
 *  okhttp3.internal.platform.h
 *  okhttp3.internal.tls.c
 *  okhttp3.internal.tls.d
 *  okhttp3.internal.ws.d$d
 *  okhttp3.j
 *  okhttp3.l
 *  okhttp3.r
 *  okhttp3.t
 *  okhttp3.v
 *  okio.j0
 *  okio.l0
 *  okio.m0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.connection;

import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.internal.connection.f;
import okhttp3.internal.connection.g;
import okhttp3.internal.connection.i;
import okhttp3.internal.d;
import okhttp3.internal.http2.f;
import okhttp3.internal.http2.m;
import okhttp3.internal.http2.n;
import okhttp3.internal.platform.h;
import okhttp3.internal.ws.d;
import okhttp3.j;
import okhttp3.l;
import okhttp3.r;
import okhttp3.t;
import okhttp3.v;
import okhttp3.z;
import okio.j0;
import okio.l0;
import okio.m0;
import okio.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 72\u00020\u00012\u00020\u0002:\u0001VB\u0019\u0012\u0006\u0010m\u001a\u00020h\u0012\u0006\u0010o\u001a\u00020\"\u00a2\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\b0\u0010.JE\u00102\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u00101\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b2\u00103J'\u00107\u001a\u00020$2\u0006\u00105\u001a\u0002042\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0000\u00a2\u0006\u0004\b7\u00108J\u001f\u0010>\u001a\u00020=2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0000\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0000\u00a2\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\"H\u0016\u00a2\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u000b\u00a2\u0006\u0004\bG\u0010.J\u000f\u0010I\u001a\u00020HH\u0016\u00a2\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020$\u00a2\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020NH\u0016\u00a2\u0006\u0004\bP\u0010QJ\u001f\u0010V\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\bV\u0010WJ\u0011\u0010X\u001a\u0004\u0018\u00010)H\u0016\u00a2\u0006\u0004\bX\u0010YJ'\u0010]\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\u0006\u0010Z\u001a\u00020\"2\u0006\u0010\\\u001a\u00020[H\u0000\u00a2\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020_2\b\u0010+\u001a\u0004\u0018\u00010[H\u0000\u00a2\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016\u00a2\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016\u00a2\u0006\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020h8\u0006\u00a2\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u0010pR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010sR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001d\u0010{R%\u0010\u0082\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\b\u001f\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010}R(\u0010\u0089\u0001\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0005\b\u0088\u0001\u0010\u0016R\u0019\u0010\u008b\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b~\u0010\u0085\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R)\u0010\u0092\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020_0\u008f\u00010\u008e\u00018\u0006\u00a2\u0006\u000f\n\u0005\bX\u0010\u0090\u0001\u001a\u0006\b\u0084\u0001\u0010\u0091\u0001R)\u0010\u0098\u0001\u001a\u00030\u0093\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0005\b0\u0010\u0094\u0001\u001a\u0006\b\u008a\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u009a\u0001\u001a\u00020$8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u007f\u00a8\u0006\u009d\u0001"}, d2={"Lokhttp3/internal/connection/f;", "Lokhttp3/internal/http2/f$c;", "Lokhttp3/j;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/e;", "call", "Lokhttp3/r;", "eventListener", "Lkotlin/k0;", "j", "(IIILokhttp3/e;Lokhttp3/r;)V", "h", "(IILokhttp3/e;Lokhttp3/r;)V", "Lokhttp3/internal/connection/b;", "connectionSpecSelector", "pingIntervalMillis", "m", "(Lokhttp3/internal/connection/b;ILokhttp3/e;Lokhttp3/r;)V", "F", "(I)V", "i", "(Lokhttp3/internal/connection/b;)V", "Lokhttp3/b0;", "tunnelRequest", "Lokhttp3/v;", "url", "k", "(IILokhttp3/b0;Lokhttp3/v;)Lokhttp3/b0;", "l", "()Lokhttp3/b0;", "", "Lokhttp3/f0;", "candidates", "", "B", "(Ljava/util/List;)Z", "G", "(Lokhttp3/v;)Z", "Lokhttp3/t;", "handshake", "e", "(Lokhttp3/v;Lokhttp3/t;)Z", "z", "()V", "y", "s", "connectionRetryEnabled", "f", "(IIIIZLokhttp3/e;Lokhttp3/r;)V", "Lokhttp3/a;", "address", "routes", "t", "(Lokhttp3/a;Ljava/util/List;)Z", "Lokhttp3/z;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "w", "(Lokhttp3/z;Lokhttp3/internal/http/g;)Lokhttp3/internal/http/d;", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/internal/ws/d$d;", "x", "(Lokhttp3/internal/connection/c;)Lokhttp3/internal/ws/d$d;", "A", "()Lokhttp3/f0;", "d", "Ljava/net/Socket;", "E", "()Ljava/net/Socket;", "doExtensiveChecks", "u", "(Z)Z", "Lokhttp3/internal/http2/i;", "stream", "b", "(Lokhttp3/internal/http2/i;)V", "Lokhttp3/internal/http2/f;", "connection", "Lokhttp3/internal/http2/m;", "settings", "a", "(Lokhttp3/internal/http2/f;Lokhttp3/internal/http2/m;)V", "r", "()Lokhttp3/t;", "failedRoute", "Ljava/io/IOException;", "failure", "g", "(Lokhttp3/z;Lokhttp3/f0;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/e;", "H", "(Lokhttp3/internal/connection/e;Ljava/io/IOException;)V", "Lokhttp3/a0;", "protocol", "()Lokhttp3/a0;", "", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/connection/g;", "c", "Lokhttp3/internal/connection/g;", "getConnectionPool", "()Lokhttp3/internal/connection/g;", "connectionPool", "Lokhttp3/f0;", "route", "Ljava/net/Socket;", "rawSocket", "socket", "Lokhttp3/t;", "Lokhttp3/a0;", "Lokhttp3/internal/http2/f;", "http2Connection", "Lokio/g;", "Lokio/g;", "source", "Lokio/f;", "Lokio/f;", "sink", "Z", "p", "()Z", "D", "(Z)V", "noNewExchanges", "noCoalescedConnections", "n", "I", "q", "()I", "setRouteFailureCount$okhttp", "routeFailureCount", "o", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "C", "(J)V", "idleAtNs", "v", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/g;Lokhttp3/f0;)V", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
public final class f
extends f.c
implements j {
    @NotNull
    public static final a t = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final g c;
    @NotNull
    private final f0 d;
    @Nullable
    private Socket e;
    @Nullable
    private Socket f;
    @Nullable
    private t g;
    @Nullable
    private a0 h;
    @Nullable
    private okhttp3.internal.http2.f i;
    @Nullable
    private okio.g j;
    @Nullable
    private okio.f k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    @NotNull
    private final List<Reference<e>> r;
    private long s;

    public f(@NotNull g g4, @NotNull f0 f02) {
        y.j((Object)g4, (String)"connectionPool");
        y.j((Object)f02, (String)"route");
        this.c = g4;
        this.d = f02;
        this.q = 1;
        this.r = new ArrayList<Reference<e>>();
        this.s = Long.MAX_VALUE;
    }

    private final boolean B(List<f0> iterable) {
        boolean bl;
        block3: {
            iterable = iterable;
            bl = iterable instanceof Collection;
            boolean bl2 = false;
            if (bl && ((Collection)iterable).isEmpty()) {
                bl = bl2;
            } else {
                Proxy.Type type;
                Proxy.Type type2;
                Iterator<Object> iterator = iterable.iterator();
                do {
                    bl = bl2;
                    if (!iterator.hasNext()) break block3;
                } while ((type2 = (iterable = (f0)iterator.next()).b().type()) != (type = Proxy.Type.DIRECT) || this.d.b().type() != type || !y.e((Object)this.d.d(), (Object)iterable.d()));
                bl = true;
            }
        }
        return bl;
    }

    private final void F(int n4) throws IOException {
        Socket socket = this.f;
        y.g((Object)socket);
        okio.g g4 = this.j;
        y.g((Object)g4);
        okio.f f4 = this.k;
        y.g((Object)f4);
        socket.setSoTimeout(0);
        socket = new f.a(true, okhttp3.internal.concurrent.e.i).q(socket, this.d.a().l().i(), g4, f4).k((f.c)this).l(n4).a();
        this.i = socket;
        this.q = okhttp3.internal.http2.f.E.a().d();
        okhttp3.internal.http2.f.r0((okhttp3.internal.http2.f)socket, (boolean)false, null, (int)3, null);
    }

    private final boolean G(v object) {
        if (okhttp3.internal.d.h && !Thread.holdsLock((Object)this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append((Object)this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        v v3 = this.d.a().l();
        int n4 = object.n();
        int n5 = v3.n();
        boolean bl = false;
        if (n4 != n5) {
            return false;
        }
        if (y.e((Object)object.i(), (Object)v3.i())) {
            return true;
        }
        boolean bl2 = bl;
        if (!this.m) {
            v3 = this.g;
            bl2 = bl;
            if (v3 != null) {
                y.g((Object)v3);
                bl2 = bl;
                if (this.e((v)object, (t)v3)) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    private final boolean e(v object, t t3) {
        boolean bl;
        block3: {
            block2: {
                List list = t3.d();
                boolean bl2 = ((Collection)list).isEmpty();
                bl = true;
                if (!(bl2 ^ true)) break block2;
                t3 = okhttp3.internal.tls.d.c;
                object = object.i();
                list = list.get(0);
                y.h((Object)list, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
                if (t3.e((String)object, (X509Certificate)((Object)list))) break block3;
            }
            bl = false;
        }
        return bl;
    }

    private final void h(int n4, int n5, okhttp3.e e4, r object) throws IOException {
        NullPointerException nullPointerException2;
        block6: {
            Proxy proxy = this.d.b();
            Object object2 = this.d.a();
            Proxy.Type type = proxy.type();
            int n6 = type == null ? -1 : b.a[type.ordinal()];
            if (n6 != 1 && n6 != 2) {
                object2 = new Socket(proxy);
            } else {
                object2 = object2.j().createSocket();
                y.g((Object)object2);
            }
            this.e = object2;
            object.j(e4, this.d.d(), proxy);
            ((Socket)object2).setSoTimeout(n5);
            try {
                okhttp3.internal.platform.h.a.g().f((Socket)object2, this.d.d(), n4);
            }
            catch (ConnectException connectException) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed to connect to ");
                ((StringBuilder)object).append(this.d.d());
                object = new ConnectException(((StringBuilder)object).toString());
                ((Throwable)object).initCause(connectException);
                throw object;
            }
            try {
                this.j = x.d((l0)x.l((Socket)object2));
                this.k = x.c((j0)x.h((Socket)object2));
            }
            catch (NullPointerException nullPointerException2) {
                if (y.e((Object)((Throwable)nullPointerException2).getMessage(), (Object)"throw with null exception")) break block6;
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
    private final void i(okhttp3.internal.connection.b object) throws IOException {
        void var1_4;
        Object object2;
        block9: {
            t t3;
            Serializable serializable;
            Object object3;
            Object object4;
            block10: {
                object4 = this.d.a();
                object2 = object4.k();
                object3 = null;
                serializable = null;
                try {
                    y.g((Object)object2);
                    object2 = ((SSLSocketFactory)object2).createSocket(this.e, object4.l().i(), object4.l().n(), true);
                    y.h((Object)object2, (String)"null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                    object2 = (SSLSocket)object2;
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block9;
                }
                try {
                    object3 = object.a((SSLSocket)object2);
                    if (!object3.h()) break block10;
                    okhttp3.internal.platform.h.a.g().e((SSLSocket)object2, object4.l().i(), object4.f());
                }
                catch (Throwable throwable) {
                    break block9;
                }
            }
            ((SSLSocket)object2).startHandshake();
            SSLSession sSLSession = ((SSLSocket)object2).getSession();
            object = okhttp3.t.e;
            y.i((Object)sSLSession, (String)"sslSocketSession");
            object = object.a(sSLSession);
            HostnameVerifier hostnameVerifier = object4.e();
            y.g((Object)hostnameVerifier);
            if (!hostnameVerifier.verify(object4.l().i(), sSLSession)) {
                if (((Collection)(object = object.d())).isEmpty() ^ true) {
                    object = object.get(0);
                    y.h((Object)object, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
                    serializable = (X509Certificate)object;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("\n              |Hostname ");
                    ((StringBuilder)object3).append(object4.l().i());
                    ((StringBuilder)object3).append(" not verified:\n              |    certificate: ");
                    ((StringBuilder)object3).append(okhttp3.g.c.a((Certificate)serializable));
                    ((StringBuilder)object3).append("\n              |    DN: ");
                    ((StringBuilder)object3).append(((X509Certificate)serializable).getSubjectDN().getName());
                    ((StringBuilder)object3).append("\n              |    subjectAltNames: ");
                    ((StringBuilder)object3).append(okhttp3.internal.tls.d.c.a((X509Certificate)serializable));
                    ((StringBuilder)object3).append("\n              ");
                    object = new SSLPeerUnverifiedException(kotlin.text.p.h(((StringBuilder)object3).toString(), null, 1, null));
                    throw object;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Hostname ");
                ((StringBuilder)object).append(object4.l().i());
                ((StringBuilder)object).append(" not verified (no certificates)");
                serializable = new SSLPeerUnverifiedException(((StringBuilder)object).toString());
                throw serializable;
            }
            sSLSession = object4.a();
            y.g((Object)sSLSession);
            hostnameVerifier = object.e();
            okhttp3.i i4 = object.a();
            List list = object.c();
            kotlin.jvm.functions.a<List<? extends Certificate>> a4 = new kotlin.jvm.functions.a<List<? extends Certificate>>((okhttp3.g)sSLSession, (t)object, object4){
                final okhttp3.g g;
                final t h;
                final okhttp3.a i;
                {
                    this.g = g4;
                    this.h = t3;
                    this.i = a4;
                    super(0);
                }

                @Override
                @NotNull
                public final List<Certificate> invoke() {
                    okhttp3.internal.tls.c c4 = this.g.d();
                    y.g((Object)c4);
                    return c4.a(this.h.d(), this.i.l().i());
                }
            };
            this.g = t3 = new t((g0)hostnameVerifier, i4, list, (kotlin.jvm.functions.a)a4);
            object = object4.l().i();
            object4 = new kotlin.jvm.functions.a<List<? extends X509Certificate>>(this){
                final f g;
                {
                    this.g = f4;
                    super(0);
                }

                @Override
                @NotNull
                public final List<X509Certificate> invoke() {
                    Object object = this.g.g;
                    y.g((Object)object);
                    Object object2 = object.d();
                    object = new ArrayList(kotlin.collections.t.x((Iterable)object2, 10));
                    Iterator iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        object2 = (Certificate)iterator.next();
                        y.h((Object)object2, (String)"null cannot be cast to non-null type java.security.cert.X509Certificate");
                        object.add((X509Certificate)object2);
                    }
                    return object;
                }
            };
            sSLSession.b((String)object, (kotlin.jvm.functions.a)object4);
            object = serializable;
            if (object3.h()) {
                object = okhttp3.internal.platform.h.a.g().h((SSLSocket)object2);
            }
            this.f = object2;
            this.j = x.d((l0)x.l((Socket)object2));
            this.k = x.c((j0)x.h((Socket)object2));
            object = object != null ? a0.d.a((String)object) : a0.f;
            this.h = object;
            okhttp3.internal.platform.h.a.g().b((SSLSocket)object2);
            return;
        }
        if (object2 != null) {
            okhttp3.internal.platform.h.a.g().b((SSLSocket)object2);
        }
        if (object2 != null) {
            okhttp3.internal.d.n((Socket)object2);
        }
        throw var1_4;
    }

    private final void j(int n4, int n5, int n6, okhttp3.e e4, r r4) throws IOException {
        b0 b02 = this.l();
        v v3 = b02.k();
        for (int i4 = 0; i4 < 21; ++i4) {
            this.h(n4, n5, e4, r4);
            b02 = this.k(n5, n6, b02, v3);
            if (b02 == null) break;
            Socket socket = this.e;
            if (socket != null) {
                okhttp3.internal.d.n((Socket)socket);
            }
            this.e = null;
            this.k = null;
            this.j = null;
            r4.h(e4, this.d.d(), this.d.b(), null);
        }
    }

    private final b0 k(int n4, int n5, b0 object, v object2) throws IOException {
        okio.f f4;
        Object object3;
        block2: {
            m0 m02;
            block3: {
                block4: {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("CONNECT ");
                    ((StringBuilder)object3).append(okhttp3.internal.d.U((v)object2, (boolean)true));
                    ((StringBuilder)object3).append(" HTTP/1.1");
                    object2 = ((StringBuilder)object3).toString();
                    do {
                        object3 = this.j;
                        y.g((Object)object3);
                        f4 = this.k;
                        y.g((Object)f4);
                        okhttp3.internal.http1.b b4 = new okhttp3.internal.http1.b(null, this, (okio.g)object3, f4);
                        m02 = object3.timeout();
                        long l4 = n4;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        m02.timeout(l4, timeUnit);
                        f4.timeout().timeout((long)n5, timeUnit);
                        b4.w(object.f(), (String)object2);
                        b4.finishRequest();
                        m02 = b4.readResponseHeaders(false);
                        y.g((Object)m02);
                        m02 = m02.r((b0)object).c();
                        b4.v((d0)m02);
                        int n6 = m02.m();
                        if (n6 == 200) break block2;
                        if (n6 != 407) break block3;
                        object = this.d.a().h().a(this.d, (d0)m02);
                        if (object == null) break block4;
                    } while (!kotlin.text.p.z("close", d0.w((d0)m02, (String)"Connection", null, (int)2, null), true));
                    return object;
                }
                throw new IOException("Failed to authenticate with proxy");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected response code for CONNECT: ");
            ((StringBuilder)object).append(m02.m());
            throw new IOException(((StringBuilder)object).toString());
        }
        if (object3.getBuffer().exhausted() && f4.getBuffer().exhausted()) {
            return null;
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
    }

    private final b0 l() throws IOException {
        b0 b02 = new b0.a().l(this.d.a().l()).g("CONNECT", null).e("Host", okhttp3.internal.d.U((v)this.d.a().l(), (boolean)true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.12.0").b();
        d0 d02 = new d0.a().r(b02).p(a0.f).g(407).m("Preemptive Authenticate").b(okhttp3.internal.d.c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c();
        d02 = this.d.a().h().a(this.d, d02);
        if (d02 != null) {
            b02 = d02;
        }
        return b02;
    }

    private final void m(okhttp3.internal.connection.b b4, int n4, okhttp3.e object, r r4) throws IOException {
        if (this.d.a().k() == null) {
            object = this.d.a().f();
            if (object.contains(b4 = a0.i)) {
                this.f = this.e;
                this.h = b4;
                this.F(n4);
                return;
            }
            this.f = this.e;
            this.h = a0.f;
            return;
        }
        r4.C((okhttp3.e)object);
        this.i(b4);
        r4.B((okhttp3.e)object, this.g);
        if (this.h == a0.h) {
            this.F(n4);
        }
    }

    @NotNull
    public f0 A() {
        return this.d;
    }

    public final void C(long l4) {
        this.s = l4;
    }

    public final void D(boolean bl) {
        this.l = bl;
    }

    @NotNull
    public Socket E() {
        Socket socket = this.f;
        y.g((Object)socket);
        return socket;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void H(@NotNull e e4, @Nullable IOException iOException) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block10: {
                    block8: {
                        block9: {
                            try {
                                int n4;
                                y.j((Object)e4, (String)"call");
                                if (!(iOException instanceof n)) break block8;
                                if (((n)iOException).c != okhttp3.internal.http2.b.l) break block9;
                                this.p = n4 = this.p + 1;
                                if (n4 > 1) {
                                    this.l = true;
                                    ++this.n;
                                }
                                break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        if (((n)iOException).c != okhttp3.internal.http2.b.m || !e4.isCanceled()) {
                            this.l = true;
                            ++this.n;
                        }
                        break block10;
                    }
                    if (!this.v() || iOException instanceof okhttp3.internal.http2.a) {
                        this.l = true;
                        if (this.o == 0) {
                            if (iOException != null) {
                                this.g(e4.j(), this.d, iOException);
                            }
                            ++this.n;
                        }
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void a(@NotNull okhttp3.internal.http2.f f4, @NotNull m m4) {
        synchronized (this) {
            y.j((Object)f4, (String)"connection");
            y.j((Object)m4, (String)"settings");
            this.q = m4.d();
            return;
        }
    }

    public void b(@NotNull okhttp3.internal.http2.i i4) throws IOException {
        y.j((Object)i4, (String)"stream");
        i4.d(okhttp3.internal.http2.b.l, null);
    }

    public final void d() {
        Socket socket = this.e;
        if (socket != null) {
            okhttp3.internal.d.n((Socket)socket);
        }
    }

    public final void f(int n4, int n5, int n6, int n7, boolean bl, @NotNull okhttp3.e object, @NotNull r r4) {
        block16: {
            block20: {
                okhttp3.internal.connection.b b4;
                Object object2;
                block19: {
                    block17: {
                        block18: {
                            y.j((Object)object, (String)"call");
                            y.j((Object)r4, (String)"eventListener");
                            if (this.h != null) break block16;
                            object2 = this.d.a().b();
                            b4 = new okhttp3.internal.connection.b((List)object2);
                            if (this.d.a().k() != null) break block17;
                            if (!object2.contains(okhttp3.l.k)) break block18;
                            object2 = this.d.a().l().i();
                            if (!okhttp3.internal.platform.h.a.g().j((String)object2)) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("CLEARTEXT communication to ");
                                ((StringBuilder)object).append((String)object2);
                                ((StringBuilder)object).append(" not permitted by network security policy");
                                throw new i((IOException)new UnknownServiceException(((StringBuilder)object).toString()));
                            }
                            break block19;
                        }
                        throw new i((IOException)new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                    }
                    if (this.d.a().f().contains(a0.i)) break block20;
                }
                i i4 = null;
                do {
                    block15: {
                        block14: {
                            block13: {
                                block12: {
                                    try {
                                        if (!this.d.c()) break block12;
                                        this.j(n4, n5, n6, (okhttp3.e)object, r4);
                                        object2 = this.e;
                                        if (object2 != null) break block13;
                                        break block14;
                                    }
                                    catch (IOException iOException) {
                                        break block15;
                                    }
                                }
                                try {
                                    this.h(n4, n5, (okhttp3.e)object, r4);
                                }
                                catch (IOException iOException) {}
                            }
                            try {
                                this.m(b4, n7, (okhttp3.e)object, r4);
                                r4.h((okhttp3.e)object, this.d.d(), this.d.b(), this.h);
                            }
                            catch (IOException iOException) {}
                        }
                        if (this.d.c() && this.e == null) {
                            throw new i((IOException)new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.s = System.nanoTime();
                        return;
                    }
                    Socket socket = this.f;
                    if (socket != null) {
                        okhttp3.internal.d.n((Socket)socket);
                    }
                    if ((socket = this.e) != null) {
                        okhttp3.internal.d.n((Socket)socket);
                    }
                    this.f = null;
                    this.e = null;
                    this.j = null;
                    this.k = null;
                    this.g = null;
                    this.h = null;
                    this.i = null;
                    this.q = 1;
                    r4.i((okhttp3.e)object, this.d.d(), this.d.b(), null, (IOException)object2);
                    if (i4 == null) {
                        i4 = new i((IOException)object2);
                        continue;
                    }
                    i4.a((IOException)object2);
                } while (bl && b4.b((IOException)object2));
                throw i4;
            }
            throw new i((IOException)new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        throw new IllegalStateException("already connected".toString());
    }

    public final void g(@NotNull z z3, @NotNull f0 f02, @NotNull IOException iOException) {
        y.j((Object)z3, (String)"client");
        y.j((Object)f02, (String)"failedRoute");
        y.j((Object)iOException, (String)"failure");
        if (f02.b().type() != Proxy.Type.DIRECT) {
            okhttp3.a a4 = f02.a();
            a4.i().connectFailed(a4.l().s(), f02.b().address(), iOException);
        }
        z3.t().b(f02);
    }

    @NotNull
    public final List<Reference<e>> n() {
        return this.r;
    }

    public final long o() {
        return this.s;
    }

    public final boolean p() {
        return this.l;
    }

    @NotNull
    public a0 protocol() {
        a0 a02 = this.h;
        y.g((Object)a02);
        return a02;
    }

    public final int q() {
        return this.n;
    }

    @Nullable
    public t r() {
        return this.g;
    }

    public final void s() {
        synchronized (this) {
            ++this.o;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean t(@NotNull okhttp3.a object, @Nullable List<f0> g4) {
        y.j((Object)object, (String)"address");
        if (okhttp3.internal.d.h && !Thread.holdsLock((Object)this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append((Object)this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        if (this.r.size() >= this.q) return false;
        if (this.l) {
            return false;
        }
        if (!this.d.a().d((okhttp3.a)object)) {
            return false;
        }
        if (y.e((Object)object.l().i(), (Object)this.A().a().l().i())) {
            return true;
        }
        if (this.i == null) {
            return false;
        }
        if (g4 == null) return false;
        if (!this.B((List<f0>)g4)) {
            return false;
        }
        if (object.e() != okhttp3.internal.tls.d.c) {
            return false;
        }
        if (!this.G(object.l())) {
            return false;
        }
        try {
            g4 = object.a();
            y.g((Object)g4);
            String string = object.l().i();
            object = this.r();
            y.g((Object)object);
            g4.a(string, object.d());
            return true;
        }
        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
            return false;
        }
    }

    @NotNull
    public String toString() {
        Object object;
        StringBuilder stringBuilder;
        block3: {
            block2: {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Connection{");
                stringBuilder.append(this.d.a().l().i());
                stringBuilder.append(':');
                stringBuilder.append(this.d.a().l().n());
                stringBuilder.append(", proxy=");
                stringBuilder.append(this.d.b());
                stringBuilder.append(" hostAddress=");
                stringBuilder.append(this.d.d());
                stringBuilder.append(" cipherSuite=");
                object = this.g;
                if (object == null) break block2;
                okhttp3.i i4 = object.a();
                object = i4;
                if (i4 != null) break block3;
            }
            object = "none";
        }
        stringBuilder.append(object);
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean u(boolean bl) {
        long l4;
        if (okhttp3.internal.d.h && Thread.holdsLock((Object)this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append((Object)this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        long l5 = System.nanoTime();
        Socket socket = this.e;
        y.g((Object)socket);
        Socket socket2 = this.f;
        y.g((Object)socket2);
        okio.g g4 = this.j;
        y.g((Object)g4);
        if (socket.isClosed()) return false;
        if (socket2.isClosed()) return false;
        if (socket2.isInputShutdown()) return false;
        if (socket2.isOutputShutdown()) {
            return false;
        }
        socket = this.i;
        if (socket != null) {
            return socket.d0(l5);
        }
        synchronized (this) {
            l4 = this.s;
        }
        if (l5 - l4 < 10000000000L) return true;
        if (!bl) return true;
        return okhttp3.internal.d.G((Socket)socket2, (okio.g)g4);
    }

    public final boolean v() {
        boolean bl = this.i != null;
        return bl;
    }

    @NotNull
    public final okhttp3.internal.http.d w(@NotNull z object, @NotNull okhttp3.internal.http.g g4) throws SocketException {
        y.j((Object)object, (String)"client");
        y.j((Object)g4, (String)"chain");
        Object object2 = this.f;
        y.g((Object)object2);
        okio.g g5 = this.j;
        y.g((Object)g5);
        okio.f f4 = this.k;
        y.g((Object)f4);
        okhttp3.internal.http2.f f5 = this.i;
        if (f5 != null) {
            object = new okhttp3.internal.http2.g((z)object, this, g4, f5);
        } else {
            object2.setSoTimeout(g4.readTimeoutMillis());
            f5 = g5.timeout();
            long l4 = g4.f();
            object2 = TimeUnit.MILLISECONDS;
            f5.timeout(l4, (TimeUnit)((Object)object2));
            f4.timeout().timeout((long)g4.h(), (TimeUnit)((Object)object2));
            object = new okhttp3.internal.http1.b((z)object, this, g5, f4);
        }
        return object;
    }

    @NotNull
    public final d.d x(@NotNull c c4) throws SocketException {
        y.j((Object)c4, (String)"exchange");
        Socket socket = this.f;
        y.g((Object)socket);
        okio.g g4 = this.j;
        y.g((Object)g4);
        okio.f f4 = this.k;
        y.g((Object)f4);
        socket.setSoTimeout(0);
        this.z();
        return new d.d(g4, f4, c4){
            final c f;
            {
                this.f = c4;
                super(true, g4, f4);
            }

            public void close() {
                this.f.a(-1L, true, true, null);
            }
        };
    }

    public final void y() {
        synchronized (this) {
            this.m = true;
            return;
        }
    }

    public final void z() {
        synchronized (this) {
            this.l = true;
            return;
        }
    }
}

