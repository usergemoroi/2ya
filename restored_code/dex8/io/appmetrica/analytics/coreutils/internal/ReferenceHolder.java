/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.coreutils.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Lio/appmetrica/analytics/coreutils/internal/ReferenceHolder;", "", "reference", "Lkotlin/k0;", "storeReference", "(Ljava/lang/Object;)V", "removeReference", "", "peekReferences", "()Ljava/util/Set;", "<init>", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class ReferenceHolder {
    private final LinkedHashSet a = new LinkedHashSet();

    @NotNull
    public final Set<Object> peekReferences() {
        return t.j1((Iterable)this.a);
    }

    public final void removeReference(@NotNull Object object) {
        this.a.remove(object);
    }

    public final void storeReference(@NotNull Object object) {
        this.a.add(object);
    }
}

