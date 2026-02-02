/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.pool.g
 *  io.ktor.utils.io.pool.g$a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io.pool;

import io.ktor.utils.io.pool.g;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007\u00a2\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2={"Lio/ktor/utils/io/pool/f;", "", "T", "Lio/ktor/utils/io/pool/g;", "instance", "Lkotlin/k0;", "o", "(Ljava/lang/Object;)V", "dispose", "()V", "<init>", "ktor-io"}, k=1, mv={1, 8, 0})
public abstract class f<T>
implements g<T> {
    public void close() {
        g.a.a((g)this);
    }

    public void dispose() {
    }

    public void o(@NotNull T t3) {
        y.j(t3, (String)"instance");
    }
}

