/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections.builders;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&\u00a2\u0006\u0004\b\n\u0010\t\u00a8\u0006\r"}, d2={"Lkotlin/collections/builders/a;", "", "E", "K", "V", "Lkotlin/collections/h;", "element", "", "contains", "(Ljava/util/Map$Entry;)Z", "containsEntry", "<init>", "()V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V>
extends h<E> {
    @Override
    public final boolean contains(@NotNull E e4) {
        y.j(e4, (String)"element");
        return this.containsEntry((Map.Entry<? extends K, ? extends V>)e4);
    }

    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> var1);
}

