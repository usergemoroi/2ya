/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.enums.d
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.enums;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.l;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001e"}, d2={"Lkotlin/enums/c;", "", "T", "Lkotlin/enums/a;", "Lkotlin/collections/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "", "index", "d", "(I)Ljava/lang/Enum;", "element", "", "a", "(Ljava/lang/Enum;)Z", "e", "(Ljava/lang/Enum;)I", "f", "", "c", "[Ljava/lang/Enum;", "entries", "getSize", "()I", "size", "<init>", "([Ljava/lang/Enum;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.8")
final class c<T extends Enum<T>>
extends kotlin.collections.c<T>
implements a<T>,
Serializable {
    @NotNull
    private final T[] c;

    public c(@NotNull T[] TArray) {
        y.j(TArray, (String)"entries");
        this.c = TArray;
    }

    private final Object writeReplace() {
        return new d(this.c);
    }

    public boolean a(@NotNull T t3) {
        y.j(t3, (String)"element");
        boolean bl = (Enum)l.s0((Object[])this.c, ((Enum)t3).ordinal()) == t3;
        return bl;
    }

    @NotNull
    public T d(int n4) {
        kotlin.collections.c.Companion.b(n4, this.c.length);
        return this.c[n4];
    }

    public int e(@NotNull T t3) {
        y.j(t3, (String)"element");
        int n4 = ((Enum)t3).ordinal();
        if ((Enum)l.s0((Object[])this.c, n4) != t3) {
            n4 = -1;
        }
        return n4;
    }

    public int f(@NotNull T t3) {
        y.j(t3, (String)"element");
        return this.indexOf(t3);
    }

    @Override
    public int getSize() {
        return this.c.length;
    }
}

