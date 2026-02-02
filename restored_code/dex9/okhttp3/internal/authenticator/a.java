/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  okhttp3.b
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.f0
 *  okhttp3.h
 *  okhttp3.internal.authenticator.a$a
 *  okhttp3.o
 *  okhttp3.q
 *  okhttp3.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.authenticator;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.b;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.h;
import okhttp3.internal.authenticator.a;
import okhttp3.o;
import okhttp3.q;
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0014\u0010\u0015J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2={"Lokhttp3/internal/authenticator/a;", "Lokhttp3/b;", "Ljava/net/Proxy;", "Lokhttp3/v;", "url", "Lokhttp3/q;", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Lokhttp3/v;Lokhttp3/q;)Ljava/net/InetAddress;", "Lokhttp3/f0;", "route", "Lokhttp3/d0;", "response", "Lokhttp3/b0;", "a", "(Lokhttp3/f0;Lokhttp3/d0;)Lokhttp3/b0;", "d", "Lokhttp3/q;", "defaultDns", "<init>", "(Lokhttp3/q;)V", "okhttp"}, k=1, mv={1, 8, 0})
public final class a
implements b {
    @NotNull
    private final q d;

    public a(@NotNull q q4) {
        y.j((Object)q4, (String)"defaultDns");
        this.d = q4;
    }

    public /* synthetic */ a(q q4, int n4, kotlin.jvm.internal.p p4) {
        if ((n4 & 1) != 0) {
            q4 = q.b;
        }
        this(q4);
    }

    private final InetAddress b(Proxy object, v v3, q q4) throws IOException {
        Proxy.Type type = ((Proxy)object).type();
        if (type != null && a.a[type.ordinal()] == 1) {
            object = (InetAddress)t.r0(q4.lookup(v3.i()));
        } else {
            object = ((Proxy)object).address();
            y.h((Object)object, (String)"null cannot be cast to non-null type java.net.InetSocketAddress");
            object = ((InetSocketAddress)object).getAddress();
            y.i((Object)object, (String)"address() as InetSocketAddress).address");
        }
        return object;
    }

    @Nullable
    public b0 a(@Nullable f0 object, @NotNull d0 object2) throws IOException {
        Object object3;
        boolean bl;
        v v3;
        b0 b02;
        Object object4;
        block10: {
            block9: {
                y.j((Object)object2, (String)"response");
                object4 = object2.l();
                b02 = object2.V();
                v3 = b02.k();
                bl = object2.m() == 407;
                if (object == null) break block9;
                object2 = object3 = object.b();
                if (object3 != null) break block10;
            }
            object2 = Proxy.NO_PROXY;
        }
        Iterator iterator = object4.iterator();
        while (iterator.hasNext()) {
            h h4;
            block12: {
                block11: {
                    h4 = (h)iterator.next();
                    if (!p.z("Basic", h4.c(), true)) continue;
                    if (object == null || (object3 = object.a()) == null) break block11;
                    object3 = object4 = object3.c();
                    if (object4 != null) break block12;
                }
                object3 = this.d;
            }
            if (bl) {
                object4 = ((Proxy)object2).address();
                y.h((Object)object4, (String)"null cannot be cast to non-null type java.net.InetSocketAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress)object4;
                object4 = inetSocketAddress.getHostName();
                y.i((Object)object2, (String)"proxy");
                object3 = Authenticator.requestPasswordAuthentication((String)object4, this.b((Proxy)object2, v3, (q)object3), inetSocketAddress.getPort(), v3.r(), h4.b(), h4.c(), v3.t(), Authenticator.RequestorType.PROXY);
            } else {
                object4 = v3.i();
                y.i((Object)object2, (String)"proxy");
                object3 = Authenticator.requestPasswordAuthentication((String)object4, this.b((Proxy)object2, v3, (q)object3), v3.n(), v3.r(), h4.b(), h4.c(), v3.t(), Authenticator.RequestorType.SERVER);
            }
            if (object3 == null) continue;
            object = bl ? "Proxy-Authorization" : "Authorization";
            object2 = ((PasswordAuthentication)object3).getUserName();
            y.i((Object)object2, (String)"auth.userName");
            object3 = ((PasswordAuthentication)object3).getPassword();
            y.i((Object)object3, (String)"auth.password");
            object2 = o.a((String)object2, (String)new String((char[])object3), (Charset)h4.a());
            return b02.i().e((String)object, (String)object2).b();
        }
        return null;
    }
}

