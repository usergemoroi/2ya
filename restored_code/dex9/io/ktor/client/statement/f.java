/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.call.b
 *  io.ktor.client.statement.d
 *  io.ktor.client.statement.f$a
 *  io.ktor.util.pipeline.d
 *  io.ktor.util.pipeline.h
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.statement;

import io.ktor.client.call.b;
import io.ktor.client.statement.d;
import io.ktor.client.statement.f;
import io.ktor.util.pipeline.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u00a8\u0006\r"}, d2={"Lio/ktor/client/statement/f;", "Lio/ktor/util/pipeline/d;", "Lio/ktor/client/statement/d;", "Lio/ktor/client/call/b;", "", "g", "Z", "()Z", "developmentMode", "<init>", "(Z)V", "h", "a", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class f
extends io.ktor.util.pipeline.d<d, b> {
    @NotNull
    public static final a h = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final h i = new h("Receive");
    @NotNull
    private static final h j = new h("Parse");
    @NotNull
    private static final h k = new h("Transform");
    @NotNull
    private static final h l = new h("State");
    @NotNull
    private static final h m = new h("After");
    private final boolean g;

    public f(boolean bl) {
        super(new h[]{i, j, k, l, m});
        this.g = bl;
    }

    public static final /* synthetic */ h s() {
        return j;
    }

    public static final /* synthetic */ h t() {
        return i;
    }

    public static final /* synthetic */ h u() {
        return k;
    }

    public boolean g() {
        return this.g;
    }
}

