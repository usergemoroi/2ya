/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.coroutines.g
 *  kotlin.coroutines.g$a
 *  kotlin.coroutines.g$c
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.s0
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001-B\u0017\u0012\u0006\u0010(\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0019H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\"\u0010\u0006J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*\u00a8\u0006."}, d2={"Lkotlin/coroutines/c;", "Lkotlin/coroutines/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "j", "()I", "Lkotlin/coroutines/g$b;", "element", "", "b", "(Lkotlin/coroutines/g$b;)Z", "context", "i", "(Lkotlin/coroutines/c;)Z", "", "writeReplace", "()Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/p;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "c", "Lkotlin/coroutines/g;", "left", "d", "Lkotlin/coroutines/g$b;", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)V", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.3")
@SourceDebugExtension(value={"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class c
implements g,
Serializable {
    @NotNull
    private final g c;
    @NotNull
    private final g.b d;

    public c(@NotNull g g4, @NotNull g.b b4) {
        y.j((Object)g4, (String)"left");
        y.j((Object)b4, (String)"element");
        this.c = g4;
        this.d = b4;
    }

    private final boolean b(g.b b4) {
        return y.e(this.get(b4.getKey()), (Object)b4);
    }

    private final boolean i(c c4) {
        do {
            if (this.b(c4.d)) continue;
            return false;
        } while ((c4 = c4.c) instanceof c);
        y.h((Object)c4, (String)"null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.b((g.b)((Object)c4));
    }

    private final int j() {
        int n4 = 2;
        c c4 = this;
        while (true) {
            if (!((c4 = c4.c) instanceof c)) {
                c4 = null;
            }
            if (c4 == null) {
                return n4;
            }
            ++n4;
        }
    }

    private final Object writeReplace() {
        int n4 = this.j();
        g[] gArray = new g[n4];
        s0 s02 = new s0();
        this.fold(k0.a, new p<k0, g.b, k0>(gArray, s02){
            final g[] g;
            final s0 h;
            {
                this.g = gArray;
                this.h = s02;
                super(2);
            }

            public final void a(k0 gArray, g.b b4) {
                y.j((Object)gArray, (String)"<anonymous parameter 0>");
                y.j((Object)b4, (String)"element");
                gArray = this.g;
                s0 s02 = this.h;
                int n4 = s02.c;
                s02.c = n4 + 1;
                gArray[n4] = b4;
            }
        });
        if (s02.c == n4) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = this == object || object instanceof c && super.j() == this.j() && super.i(this);
        return bl;
    }

    public <R> R fold(R r2, @NotNull p<? super R, ? super g.b, ? extends R> p4) {
        y.j(p4, (String)"operation");
        return p4.invoke(this.c.fold(r2, p4), this.d);
    }

    @Nullable
    public <E extends g.b> E get(@NotNull g.c<E> c4) {
        y.j(c4, (String)"key");
        c c5 = this;
        do {
            E e4;
            if ((e4 = c5.d.get(c4)) == null) continue;
            return e4;
        } while ((c5 = c5.c) instanceof c);
        return (E)c5.get(c4);
    }

    public int hashCode() {
        return this.c.hashCode() + this.d.hashCode();
    }

    @NotNull
    public g minusKey(@NotNull g.c<?> object) {
        y.j(object, (String)"key");
        if (this.d.get(object) != null) {
            return this.c;
        }
        object = (object = this.c.minusKey(object)) == this.c ? this : (object == h.c ? this.d : new c((g)object, this.d));
        return object;
    }

    @NotNull
    public g plus(@NotNull g g4) {
        return g.a.a((g)this, (g)g4);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.fold("", b.g));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

