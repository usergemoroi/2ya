/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.collections.i$a
 *  kotlin.jvm.internal.markers.a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b'\u0018\u0000 \u000e*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\t\b\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/i;", "E", "Lkotlin/collections/a;", "", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "<init>", "()V", "Companion", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.1")
public abstract class i<E>
extends kotlin.collections.a<E>
implements Set<E>,
kotlin.jvm.internal.markers.a {
    @NotNull
    public static final a Companion = new /* Unavailable Anonymous Inner Class!! */;

    protected i() {
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        return Companion.a((Set)this, (Set)object);
    }

    @Override
    public int hashCode() {
        return Companion.b((Collection)this);
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

