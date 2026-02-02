/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.client.request.h$a
 *  io.ktor.util.pipeline.d
 *  io.ktor.util.pipeline.h
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.client.request;

import io.ktor.client.request.c;
import io.ktor.client.request.h;
import io.ktor.util.pipeline.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u00a8\u0006\r"}, d2={"Lio/ktor/client/request/h;", "Lio/ktor/util/pipeline/d;", "", "Lio/ktor/client/request/c;", "", "g", "Z", "()Z", "developmentMode", "<init>", "(Z)V", "h", "a", "ktor-client-core"}, k=1, mv={1, 8, 0})
public final class h
extends d<Object, c> {
    @NotNull
    public static final a h = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final io.ktor.util.pipeline.h i = new io.ktor.util.pipeline.h("Before");
    @NotNull
    private static final io.ktor.util.pipeline.h j = new io.ktor.util.pipeline.h("State");
    @NotNull
    private static final io.ktor.util.pipeline.h k = new io.ktor.util.pipeline.h("Monitoring");
    @NotNull
    private static final io.ktor.util.pipeline.h l = new io.ktor.util.pipeline.h("Engine");
    @NotNull
    private static final io.ktor.util.pipeline.h m = new io.ktor.util.pipeline.h("Receive");
    private final boolean g;

    public h(boolean bl) {
        super(new io.ktor.util.pipeline.h[]{i, j, k, l, m});
        this.g = bl;
    }

    public static final /* synthetic */ io.ktor.util.pipeline.h s() {
        return l;
    }

    public static final /* synthetic */ io.ktor.util.pipeline.h t() {
        return m;
    }

    public boolean g() {
        return this.g;
    }
}

