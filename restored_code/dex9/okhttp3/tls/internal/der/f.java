/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  okhttp3.tls.internal.der.f$a
 *  okhttp3.tls.internal.der.j
 *  okhttp3.tls.internal.der.j$a
 *  okhttp3.tls.internal.der.k
 *  okhttp3.tls.internal.der.l
 *  okhttp3.tls.internal.der.m
 *  okio.h
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.tls.internal.der;

import java.net.ProtocolException;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import okhttp3.tls.internal.der.f;
import okhttp3.tls.internal.der.j;
import okhttp3.tls.internal.der.k;
import okhttp3.tls.internal.der.l;
import okhttp3.tls.internal.der.m;
import okio.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006BM\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u00a2\u0006\u0004\b=\u0010>J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!Jd\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\b\u0002\u0010%\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010&\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\b+\u0010,R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0017\u0010%\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0006\u00a2\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010&\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u00106\u00a8\u0006?"}, d2={"Lokhttp3/tls/internal/der/f;", "T", "Lokhttp3/tls/internal/der/j;", "Lokhttp3/tls/internal/der/k;", "header", "", "a", "(Lokhttp3/tls/internal/der/k;)Z", "Lokhttp3/tls/internal/der/l;", "reader", "b", "(Lokhttp3/tls/internal/der/l;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/m;", "writer", "value", "Lkotlin/k0;", "c", "(Lokhttp3/tls/internal/der/m;Ljava/lang/Object;)V", "", "tagClass", "", "tag", "q", "(IJ)Lokhttp3/tls/internal/der/f;", "defaultValue", "n", "(Ljava/lang/Object;)Lokhttp3/tls/internal/der/f;", "h", "()Lokhttp3/tls/internal/der/f;", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Lokhttp3/tls/internal/der/f$a;", "codec", "isOptional", "typeHint", "i", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/f$a;ZLjava/lang/Object;Z)Lokhttp3/tls/internal/der/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "I", "m", "J", "l", "()J", "d", "Lokhttp3/tls/internal/der/f$a;", "e", "Z", "()Z", "f", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "g", "<init>", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/f$a;ZLjava/lang/Object;Z)V", "okhttp-tls"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nBasicDerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicDerAdapter.kt\nokhttp3/tls/internal/der/BasicDerAdapter\n+ 2 DerReader.kt\nokhttp3/tls/internal/der/DerReader\n*L\n1#1,144:1\n163#2,30:145\n*S KotlinDebug\n*F\n+ 1 BasicDerAdapter.kt\nokhttp3/tls/internal/der/BasicDerAdapter\n*L\n62#1:145,30\n*E\n"})
public final class f<T>
implements j<T> {
    @NotNull
    private final String a;
    private final int b;
    private final long c;
    @NotNull
    private final a<T> d;
    private final boolean e;
    @Nullable
    private final T f;
    private final boolean g;

    public f(@NotNull String string, int n4, long l4, @NotNull a<T> a4, boolean bl, @Nullable T t3, boolean bl2) {
        y.j((Object)string, (String)"name");
        y.j(a4, (String)"codec");
        this.a = string;
        this.b = n4;
        this.c = l4;
        this.d = a4;
        this.e = bl;
        this.f = t3;
        this.g = bl2;
        if (n4 >= 0) {
            if (l4 >= 0L) {
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public /* synthetic */ f(String string, int n4, long l4, a a4, boolean bl, Object object, boolean bl2, int n5, p p4) {
        if ((n5 & 0x10) != 0) {
            bl = false;
        }
        if ((n5 & 0x20) != 0) {
            object = null;
        }
        if ((n5 & 0x40) != 0) {
            bl2 = false;
        }
        this(string, n4, l4, a4, bl, object, bl2);
    }

    public static /* synthetic */ f j(f f4, String string, int n4, long l4, a a4, boolean bl, Object object, boolean bl2, int n5, Object object2) {
        block6: {
            if ((n5 & 1) != 0) {
                string = f4.a;
            }
            if ((n5 & 2) != 0) {
                n4 = f4.b;
            }
            if ((n5 & 4) != 0) {
                l4 = f4.c;
            }
            if ((n5 & 8) != 0) {
                a4 = f4.d;
            }
            if ((n5 & 0x10) != 0) {
                bl = f4.e;
            }
            if ((n5 & 0x20) != 0) {
                object = f4.f;
            }
            if ((n5 & 0x40) == 0) break block6;
            bl2 = f4.g;
        }
        return f4.i(string, n4, l4, a4, bl, object, bl2);
    }

    public static /* synthetic */ f o(f f4, Object object, int n4, Object object2) {
        if ((n4 & 1) != 0) {
            object = null;
        }
        return f4.n(object);
    }

    public static /* synthetic */ f r(f f4, int n4, long l4, int n5, Object object) {
        if ((n5 & 1) != 0) {
            n4 = 128;
        }
        return f4.q(n4, l4);
    }

    public boolean a(@NotNull k k4) {
        y.j((Object)k4, (String)"header");
        boolean bl = k4.d() == this.b && k4.c() == this.c;
        return bl;
    }

    public T b(@NotNull l l4) {
        y.j((Object)l4, (String)"reader");
        Object object = l4.m();
        if (object != null && object.d() == this.b && object.c() == this.c) {
            String string = this.a;
            if (l4.l()) {
                Throwable throwable2;
                boolean bl;
                long l5;
                block13: {
                    block12: {
                        object = l.e((l)l4);
                        y.g((Object)object);
                        l.h((l)l4, null);
                        l5 = l.c((l)l4);
                        bl = l.b((l)l4);
                        long l6 = object.b() != -1L ? l.a((l)l4) + object.b() : -1L;
                        if (l5 != -1L && l6 > l5) {
                            throw new ProtocolException("enclosed object too large");
                        }
                        l.g((l)l4, (long)l6);
                        l.f((l)l4, (boolean)object.a());
                        if (string != null) {
                            ((Collection)l.d((l)l4)).add(string);
                        }
                        try {
                            object = this.d.a(l4);
                            if (l6 == -1L) break block12;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                        if (l.a((l)l4) > l6) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("unexpected byte count at ");
                            ((StringBuilder)object).append(l4);
                            ProtocolException protocolException = new ProtocolException(((StringBuilder)object).toString());
                            throw protocolException;
                        }
                    }
                    l.h((l)l4, null);
                    l.g((l)l4, (long)l5);
                    l.f((l)l4, (boolean)bl);
                    if (string != null) {
                        l.d((l)l4).remove(l.d((l)l4).size() - 1);
                    }
                    if (this.g) {
                        l4.x(object);
                    }
                    return (T)object;
                }
                l.h((l)l4, null);
                l.g((l)l4, (long)l5);
                l.f((l)l4, (boolean)bl);
                if (string != null) {
                    l.d((l)l4).remove(l.d((l)l4).size() - 1);
                }
                throw throwable2;
            }
            throw new ProtocolException("expected a value");
        }
        if (this.e) {
            return this.f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected ");
        stringBuilder.append(this);
        stringBuilder.append(" but was ");
        stringBuilder.append(object);
        stringBuilder.append(" at ");
        stringBuilder.append(l4);
        throw new ProtocolException(stringBuilder.toString());
    }

    public void c(@NotNull m m4, T t3) {
        y.j((Object)m4, (String)"writer");
        if (this.g) {
            m4.c(t3);
        }
        if (this.e && y.e(t3, this.f)) {
            return;
        }
        m4.f(this.a, this.b, this.c, (kotlin.jvm.functions.l)new kotlin.jvm.functions.l<okio.f, k0>(this, m4, t3){
            final f<T> g;
            final m h;
            final T i;
            {
                this.g = f4;
                this.h = m4;
                this.i = t3;
                super(1);
            }

            public final void a(@NotNull okio.f f4) {
                y.j((Object)f4, (String)"it");
                this.g.d.b(this.h, this.i);
            }
        });
    }

    @NotNull
    public f<T> d(int n4, long l4, @Nullable Boolean bl) {
        return j.a.f((j)this, (int)n4, (long)l4, (Boolean)bl);
    }

    @NotNull
    public f<List<T>> e(@NotNull String string, int n4, long l4) {
        return j.a.a((j)this, (String)string, (int)n4, (long)l4);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (!y.e((Object)this.a, (Object)((f)object).a)) {
            return false;
        }
        if (this.b != ((f)object).b) {
            return false;
        }
        if (this.c != ((f)object).c) {
            return false;
        }
        if (!y.e(this.d, ((f)object).d)) {
            return false;
        }
        if (this.e != ((f)object).e) {
            return false;
        }
        if (!y.e(this.f, ((f)object).f)) {
            return false;
        }
        return this.g == ((f)object).g;
    }

    @NotNull
    public f<List<T>> g() {
        return j.a.c((j)this);
    }

    @NotNull
    public final f<T> h() {
        return okhttp3.tls.internal.der.f.j(this, null, 0, 0L, null, false, null, true, 63, null);
    }

    public int hashCode() {
        int n4 = this.a.hashCode();
        int n5 = this.b;
        int n6 = (int)this.c;
        int n7 = this.d.hashCode();
        int n8 = this.e;
        T t3 = this.f;
        int n9 = t3 != null ? t3.hashCode() : 0;
        return (((((n4 * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + this.g;
    }

    @NotNull
    public final f<T> i(@NotNull String string, int n4, long l4, @NotNull a<T> a4, boolean bl, @Nullable T t3, boolean bl2) {
        y.j((Object)string, (String)"name");
        y.j(a4, (String)"codec");
        return new f<T>(string, n4, l4, a4, bl, t3, bl2);
    }

    public T k(@NotNull h h4) {
        return (T)j.a.d((j)this, (h)h4);
    }

    public final long l() {
        return this.c;
    }

    public final int m() {
        return this.b;
    }

    @NotNull
    public final f<T> n(@Nullable T t3) {
        return okhttp3.tls.internal.der.f.j(this, null, 0, 0L, null, true, t3, false, 79, null);
    }

    @NotNull
    public h p(T t3) {
        return j.a.e((j)this, t3);
    }

    @NotNull
    public final f<T> q(int n4, long l4) {
        return okhttp3.tls.internal.der.f.j(this, null, n4, l4, null, false, null, false, 121, null);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(" [");
        stringBuilder.append(this.b);
        stringBuilder.append('/');
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

