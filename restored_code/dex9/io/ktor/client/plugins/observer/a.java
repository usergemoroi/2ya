/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.a
 *  io.ktor.client.call.b
 *  io.ktor.utils.io.g
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.plugins.observer;

import io.ktor.client.call.b;
import io.ktor.client.plugins.observer.c;
import io.ktor.client.plugins.observer.d;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lio/ktor/client/plugins/observer/a;", "Lio/ktor/client/call/b;", "Lio/ktor/client/a;", "client", "Lio/ktor/utils/io/g;", "content", "originCall", "<init>", "(Lio/ktor/client/a;Lio/ktor/utils/io/g;Lio/ktor/client/call/b;)V", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class a
extends b {
    public a(@NotNull io.ktor.client.a a4, @NotNull g g4, @NotNull b b4) {
        y.j((Object)a4, (String)"client");
        y.j((Object)g4, (String)"content");
        y.j((Object)b4, (String)"originCall");
        super(a4);
        this.h(new c(this, b4.d()));
        this.i(new d(this, g4, b4.e()));
    }
}

