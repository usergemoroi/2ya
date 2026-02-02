/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.m
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.internal.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/json/internal/l;", "Lkotlinx/serialization/json/internal/m;", "", "d", "()[B", "array", "Lkotlin/k0;", "c", "([B)V", "<init>", "()V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
public final class l
extends m {
    @NotNull
    public static final l c = new l();

    private l() {
    }

    public final void c(@NotNull byte[] byArray) {
        y.j((Object)byArray, (String)"array");
        this.a(byArray);
    }

    @NotNull
    public final byte[] d() {
        return super.b(512);
    }
}

