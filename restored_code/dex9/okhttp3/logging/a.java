/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.io.c
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.JvmOverloads
 *  kotlin.jvm.internal.y
 *  okhttp3.c0
 *  okhttp3.d0
 *  okhttp3.internal.http.e
 *  okhttp3.logging.a$a
 *  okhttp3.logging.a$b
 *  okhttp3.logging.b
 *  okhttp3.w
 *  okhttp3.w$a
 *  okio.l0
 *  org.jetbrains.annotations.NotNull
 */
package okhttp3.logging;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.io.c;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.http.e;
import okhttp3.logging.a;
import okhttp3.u;
import okhttp3.w;
import okio.f;
import okio.l0;
import okio.r;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\n\u0016B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0016\u0010\u001e\u00a8\u0006\""}, d2={"Lokhttp3/logging/a;", "Lokhttp3/w;", "Lokhttp3/u;", "headers", "", "i", "Lkotlin/k0;", "c", "(Lokhttp3/u;I)V", "", "a", "(Lokhttp3/u;)Z", "Lokhttp3/w$a;", "chain", "Lokhttp3/d0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/d0;", "Lokhttp3/logging/a$b;", "Lokhttp3/logging/a$b;", "logger", "", "", "b", "Ljava/util/Set;", "headersToRedact", "Lokhttp3/logging/a$a;", "<set-?>", "Lokhttp3/logging/a$a;", "getLevel", "()Lokhttp3/logging/a$a;", "(Lokhttp3/logging/a$a;)V", "level", "<init>", "(Lokhttp3/logging/a$b;)V", "okhttp-logging-interceptor"}, k=1, mv={1, 8, 0})
public final class a
implements w {
    @NotNull
    private final b a;
    @NotNull
    private volatile Set<String> b;
    @NotNull
    private volatile a c;

    @JvmOverloads
    public a(@NotNull b b4) {
        y.j((Object)b4, (String)"logger");
        this.a = b4;
        this.b = b1.f();
        this.c = okhttp3.logging.a$a.c;
    }

    private final boolean a(u object) {
        object = ((u)object).a("Content-Encoding");
        boolean bl = false;
        if (object == null) {
            return false;
        }
        boolean bl2 = bl;
        if (!p.z((String)object, "identity", true)) {
            bl2 = bl;
            if (!p.z((String)object, "gzip", true)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private final void c(u u3, int n4) {
        String string = this.b.contains(u3.d(n4)) ? "\u2588\u2588" : u3.h(n4);
        b b4 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(u3.d(n4));
        stringBuilder.append(": ");
        stringBuilder.append(string);
        b4.log(stringBuilder.toString());
    }

    @JvmName(name="level")
    public final void b(@NotNull a a4) {
        y.j((Object)a4, (String)"<set-?>");
        this.c = a4;
    }

    @NotNull
    public d0 intercept(@NotNull w.a object) throws IOException {
        c0 c02;
        block43: {
            block44: {
                long l4;
                Object object2;
                Object object3;
                Object object4;
                block47: {
                    block46: {
                        long l5;
                        block45: {
                            int n4;
                            CharSequence charSequence;
                            Object object5;
                            int n5;
                            boolean bl;
                            block36: {
                                block37: {
                                    block42: {
                                        block41: {
                                            block40: {
                                                block39: {
                                                    block38: {
                                                        y.j((Object)object, (String)"chain");
                                                        object4 = this.c;
                                                        object3 = object.request();
                                                        if (object4 == okhttp3.logging.a$a.c) {
                                                            return object.proceed(object3);
                                                        }
                                                        bl = object4 == okhttp3.logging.a$a.f;
                                                        n5 = !bl && object4 != okhttp3.logging.a$a.e ? 0 : 1;
                                                        c02 = object3.a();
                                                        object5 = object.connection();
                                                        object2 = new StringBuilder();
                                                        ((StringBuilder)object2).append("--> ");
                                                        ((StringBuilder)object2).append(object3.h());
                                                        ((StringBuilder)object2).append(' ');
                                                        ((StringBuilder)object2).append(object3.k());
                                                        if (object5 != null) {
                                                            object4 = new StringBuilder();
                                                            ((StringBuilder)object4).append(' ');
                                                            ((StringBuilder)object4).append(object5.protocol());
                                                            object4 = ((StringBuilder)object4).toString();
                                                        } else {
                                                            object4 = "";
                                                        }
                                                        ((StringBuilder)object2).append((String)object4);
                                                        object4 = object2 = ((StringBuilder)object2).toString();
                                                        if (n5 == 0) {
                                                            object4 = object2;
                                                            if (c02 != null) {
                                                                object4 = new StringBuilder();
                                                                ((StringBuilder)object4).append((String)object2);
                                                                ((StringBuilder)object4).append(" (");
                                                                ((StringBuilder)object4).append(c02.contentLength());
                                                                ((StringBuilder)object4).append("-byte body)");
                                                                object4 = ((StringBuilder)object4).toString();
                                                            }
                                                        }
                                                        this.a.log((String)object4);
                                                        if (n5 == 0) break block36;
                                                        object4 = object3.f();
                                                        if (c02 != null) {
                                                            object5 = c02.contentType();
                                                            if (object5 != null && ((u)object4).a("Content-Type") == null) {
                                                                object2 = this.a;
                                                                charSequence = new StringBuilder();
                                                                charSequence.append("Content-Type: ");
                                                                charSequence.append(object5);
                                                                object2.log(charSequence.toString());
                                                            }
                                                            if (c02.contentLength() != -1L && ((u)object4).a("Content-Length") == null) {
                                                                object2 = this.a;
                                                                object5 = new StringBuilder();
                                                                ((StringBuilder)object5).append("Content-Length: ");
                                                                ((StringBuilder)object5).append(c02.contentLength());
                                                                object2.log(((StringBuilder)object5).toString());
                                                            }
                                                        }
                                                        int n6 = ((u)object4).size();
                                                        for (n4 = 0; n4 < n6; ++n4) {
                                                            this.c((u)object4, n4);
                                                        }
                                                        if (!bl || c02 == null) break block37;
                                                        if (!this.a(object3.f())) break block38;
                                                        object2 = this.a;
                                                        object4 = new StringBuilder();
                                                        ((StringBuilder)object4).append("--> END ");
                                                        ((StringBuilder)object4).append(object3.h());
                                                        ((StringBuilder)object4).append(" (encoded body omitted)");
                                                        object2.log(((StringBuilder)object4).toString());
                                                        break block36;
                                                    }
                                                    if (!c02.isDuplex()) break block39;
                                                    object4 = this.a;
                                                    object2 = new StringBuilder();
                                                    ((StringBuilder)object2).append("--> END ");
                                                    ((StringBuilder)object2).append(object3.h());
                                                    ((StringBuilder)object2).append(" (duplex request body omitted)");
                                                    object4.log(((StringBuilder)object2).toString());
                                                    break block36;
                                                }
                                                if (!c02.isOneShot()) break block40;
                                                object4 = this.a;
                                                object2 = new StringBuilder();
                                                ((StringBuilder)object2).append("--> END ");
                                                ((StringBuilder)object2).append(object3.h());
                                                ((StringBuilder)object2).append(" (one-shot body omitted)");
                                                object4.log(((StringBuilder)object2).toString());
                                                break block36;
                                            }
                                            object5 = new okio.e();
                                            c02.writeTo((f)object5);
                                            object4 = c02.contentType();
                                            if (object4 == null) break block41;
                                            object4 = object2 = object4.c(StandardCharsets.UTF_8);
                                            if (object2 != null) break block42;
                                        }
                                        object4 = StandardCharsets.UTF_8;
                                        y.i((Object)object4, (String)"UTF_8");
                                    }
                                    this.a.log("");
                                    if (okhttp3.logging.b.a((okio.e)object5)) {
                                        this.a.log(((okio.e)object5).readString((Charset)object4));
                                        object4 = this.a;
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("--> END ");
                                        ((StringBuilder)object2).append(object3.h());
                                        ((StringBuilder)object2).append(" (");
                                        ((StringBuilder)object2).append(c02.contentLength());
                                        ((StringBuilder)object2).append("-byte body)");
                                        object4.log(((StringBuilder)object2).toString());
                                    } else {
                                        object2 = this.a;
                                        object4 = new StringBuilder();
                                        ((StringBuilder)object4).append("--> END ");
                                        ((StringBuilder)object4).append(object3.h());
                                        ((StringBuilder)object4).append(" (binary ");
                                        ((StringBuilder)object4).append(c02.contentLength());
                                        ((StringBuilder)object4).append("-byte body omitted)");
                                        object2.log(((StringBuilder)object4).toString());
                                    }
                                    break block36;
                                }
                                object2 = this.a;
                                object4 = new StringBuilder();
                                ((StringBuilder)object4).append("--> END ");
                                ((StringBuilder)object4).append(object3.h());
                                object2.log(((StringBuilder)object4).toString());
                            }
                            l4 = System.nanoTime();
                            try {
                                c02 = object.proceed(object3);
                                l5 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l4);
                            }
                            catch (Exception exception) {
                                object4 = this.a;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("<-- HTTP FAILED: ");
                                ((StringBuilder)object2).append(exception);
                                object4.log(((StringBuilder)object2).toString());
                                throw exception;
                            }
                            object3 = c02.d();
                            y.g((Object)object3);
                            l4 = object3.contentLength();
                            if (l4 != -1L) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(l4);
                                ((StringBuilder)object).append("-byte");
                                object = ((StringBuilder)object).toString();
                            } else {
                                object = "unknown-length";
                            }
                            object5 = this.a;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("<-- ");
                            ((StringBuilder)object2).append(c02.m());
                            if (c02.C().length() == 0) {
                                object4 = "";
                            } else {
                                charSequence = c02.C();
                                object4 = new StringBuilder();
                                ((StringBuilder)object4).append(' ');
                                ((StringBuilder)object4).append((String)charSequence);
                                object4 = ((StringBuilder)object4).toString();
                            }
                            ((StringBuilder)object2).append((String)object4);
                            ((StringBuilder)object2).append(' ');
                            ((StringBuilder)object2).append(c02.V().k());
                            ((StringBuilder)object2).append(" (");
                            ((StringBuilder)object2).append(l5);
                            ((StringBuilder)object2).append("ms");
                            if (n5 == 0) {
                                object4 = new StringBuilder();
                                ((StringBuilder)object4).append(", ");
                                ((StringBuilder)object4).append((String)object);
                                ((StringBuilder)object4).append(" body");
                                object = ((StringBuilder)object4).toString();
                            } else {
                                object = "";
                            }
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append(')');
                            object5.log(((StringBuilder)object2).toString());
                            if (n5 == 0) break block43;
                            object = c02.z();
                            n4 = ((u)object).size();
                            for (n5 = 0; n5 < n4; ++n5) {
                                this.c((u)object, n5);
                            }
                            if (!bl || !e.b((d0)c02)) break block44;
                            if (!this.a(c02.z())) break block45;
                            this.a.log("<-- END HTTP (encoded body omitted)");
                            break block43;
                        }
                        object4 = object3.source();
                        object4.request(Long.MAX_VALUE);
                        object2 = object4.getBuffer();
                        boolean bl = p.z("gzip", ((u)object).a("Content-Encoding"), true);
                        object4 = null;
                        object = object2;
                        if (bl) {
                            l5 = ((okio.e)object2).size();
                            object4 = new r(((okio.e)object2).l());
                            try {
                                object = new okio.e();
                                ((okio.e)object).G((l0)object4);
                            }
                            catch (Throwable throwable) {
                                try {
                                    throw throwable;
                                }
                                catch (Throwable throwable2) {
                                    kotlin.io.c.a((Closeable)object4, (Throwable)throwable);
                                    throw throwable2;
                                }
                            }
                            kotlin.io.c.a((Closeable)object4, null);
                            object4 = l5;
                        }
                        if ((object2 = object3.contentType()) == null) break block46;
                        object3 = object2.c(StandardCharsets.UTF_8);
                        object2 = object3;
                        if (object3 != null) break block47;
                    }
                    object2 = StandardCharsets.UTF_8;
                    y.i((Object)object2, (String)"UTF_8");
                }
                if (!okhttp3.logging.b.a((okio.e)object)) {
                    this.a.log("");
                    object4 = this.a;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("<-- END HTTP (binary ");
                    ((StringBuilder)object2).append(((okio.e)object).size());
                    ((StringBuilder)object2).append("-byte body omitted)");
                    object4.log(((StringBuilder)object2).toString());
                    return c02;
                }
                if (l4 != 0L) {
                    this.a.log("");
                    this.a.log(((okio.e)object).l().readString((Charset)object2));
                }
                if (object4 != null) {
                    object3 = this.a;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("<-- END HTTP (");
                    ((StringBuilder)object2).append(((okio.e)object).size());
                    ((StringBuilder)object2).append("-byte, ");
                    ((StringBuilder)object2).append(object4);
                    ((StringBuilder)object2).append("-gzipped-byte body)");
                    object3.log(((StringBuilder)object2).toString());
                } else {
                    object4 = this.a;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("<-- END HTTP (");
                    ((StringBuilder)object2).append(((okio.e)object).size());
                    ((StringBuilder)object2).append("-byte body)");
                    object4.log(((StringBuilder)object2).toString());
                }
                break block43;
            }
            this.a.log("<-- END HTTP");
        }
        return c02;
    }
}

