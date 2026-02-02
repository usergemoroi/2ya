/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.http.o
 *  kotlin.Metadata
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.http;

import io.ktor.http.k;
import io.ktor.http.m;
import io.ktor.http.o;
import io.ktor.util.v;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2={"Lio/ktor/http/l;", "Lio/ktor/util/v;", "Lio/ktor/http/k;", "n", "()Lio/ktor/http/k;", "", "name", "Lkotlin/k0;", "l", "(Ljava/lang/String;)V", "value", "m", "", "size", "<init>", "(I)V", "ktor-http"}, k=1, mv={1, 8, 0})
public final class l
extends v {
    public l() {
        this(0, 1, null);
    }

    public l(int n4) {
        super(true, n4);
    }

    public /* synthetic */ l(int n4, int n5, p p4) {
        if ((n5 & 1) != 0) {
            n4 = 8;
        }
        this(n4);
    }

    @Override
    protected void l(@NotNull String string) {
        y.j((Object)string, (String)"name");
        super.l(string);
        o.a.a(string);
    }

    @Override
    protected void m(@NotNull String string) {
        y.j((Object)string, (String)"value");
        super.m(string);
        o.a.b(string);
    }

    @NotNull
    public k n() {
        return new m(this.i());
    }
}

