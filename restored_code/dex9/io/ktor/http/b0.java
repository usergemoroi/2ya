/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.http;

import io.ktor.http.a0;
import io.ktor.http.c0;
import io.ktor.http.z;
import io.ktor.util.v;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2={"Lio/ktor/http/b0;", "Lio/ktor/util/v;", "Lio/ktor/http/a0;", "Lio/ktor/http/z;", "build", "()Lio/ktor/http/z;", "", "size", "<init>", "(I)V", "ktor-http"}, k=1, mv={1, 8, 0})
public final class b0
extends v
implements a0 {
    public b0(int n4) {
        super(true, n4);
    }

    @Override
    @NotNull
    public z build() {
        return new c0(this.i());
    }
}

