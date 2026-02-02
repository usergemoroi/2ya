/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.b0
 *  okhttp3.d0
 *  okhttp3.e0
 *  okhttp3.internal.d
 *  okhttp3.internal.http.e
 *  okhttp3.m
 *  okhttp3.n
 *  okhttp3.v
 *  okhttp3.w
 *  okhttp3.w$a
 *  okhttp3.x
 *  okio.l0
 *  okio.x
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.internal.http;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.internal.d;
import okhttp3.internal.http.e;
import okhttp3.internal.http.h;
import okhttp3.m;
import okhttp3.n;
import okhttp3.u;
import okhttp3.v;
import okhttp3.w;
import okhttp3.x;
import okio.l0;
import okio.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lokhttp3/internal/http/a;", "Lokhttp3/w;", "", "Lokhttp3/m;", "cookies", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "Lokhttp3/n;", "Lokhttp3/n;", "cookieJar", "<init>", "(Lokhttp3/n;)V", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class a
implements w {
    @NotNull
    private final n a;

    public a(@NotNull n n4) {
        y.j((Object)n4, (String)"cookieJar");
        this.a = n4;
    }

    private final String a(List<m> object) {
        StringBuilder stringBuilder = new StringBuilder();
        object = ((Iterable)object).iterator();
        int n4 = 0;
        while (object.hasNext()) {
            Object object2 = object.next();
            if (n4 < 0) {
                t.w();
            }
            object2 = (m)object2;
            if (n4 > 0) {
                stringBuilder.append("; ");
            }
            stringBuilder.append(object2.e());
            stringBuilder.append('=');
            stringBuilder.append(object2.g());
            ++n4;
        }
        object = stringBuilder.toString();
        y.i((Object)object, (String)"StringBuilder().apply(builderAction).toString()");
        return object;
    }

    @NotNull
    public d0 intercept(@NotNull w.a a4) throws IOException {
        y.j((Object)a4, (String)"chain");
        b0 b02 = a4.request();
        Object object = b02.i();
        Object object2 = b02.a();
        if (object2 != null) {
            long l4;
            x x3 = object2.contentType();
            if (x3 != null) {
                object.e("Content-Type", x3.toString());
            }
            if ((l4 = object2.contentLength()) != -1L) {
                object.e("Content-Length", String.valueOf(l4));
                object.i("Transfer-Encoding");
            } else {
                object.e("Transfer-Encoding", "chunked");
                object.i("Content-Length");
            }
        }
        object2 = b02.d("Host");
        boolean bl = false;
        if (object2 == null) {
            object.e("Host", d.V((v)b02.k(), (boolean)false, (int)1, null));
        }
        if (b02.d("Connection") == null) {
            object.e("Connection", "Keep-Alive");
        }
        boolean bl2 = bl;
        if (b02.d("Accept-Encoding") == null) {
            bl2 = bl;
            if (b02.d("Range") == null) {
                object.e("Accept-Encoding", "gzip");
                bl2 = true;
            }
        }
        if (((Collection)(object2 = this.a.a(b02.k()))).isEmpty() ^ true) {
            object.e("Cookie", this.a((List<m>)object2));
        }
        if (b02.d("User-Agent") == null) {
            object.e("User-Agent", "okhttp/4.12.0");
        }
        a4 = a4.proceed(object.b());
        e.f((n)this.a, (v)b02.k(), (u)a4.z());
        b02 = a4.L().r(b02);
        if (bl2 && p.z("gzip", d0.w((d0)a4, (String)"Content-Encoding", null, (int)2, null), true) && e.b((d0)a4) && (object = a4.d()) != null) {
            object = new r(object.source());
            b02.k(a4.z().e().i("Content-Encoding").i("Content-Length").f());
            b02.b((e0)new h(d0.w((d0)a4, (String)"Content-Type", null, (int)2, null), -1L, okio.x.d((l0)object)));
        }
        return b02.c();
    }
}

