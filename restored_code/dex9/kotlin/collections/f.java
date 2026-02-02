/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 */
package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.d;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u00a6\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2={"Lkotlin/collections/f;", "E", "", "Ljava/util/AbstractList;", "", "index", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/k0;", "add", "(ILjava/lang/Object;)V", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.1")
public abstract class f<E>
extends AbstractList<E>
implements List<E>,
d {
    protected f() {
    }

    @Override
    public abstract void add(int var1, E var2);

    public abstract int getSize();

    public abstract E removeAt(int var1);

    @Override
    public abstract E set(int var1, E var2);
}

