/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.s
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\r\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/json/internal/b0;", "Lkotlinx/serialization/json/internal/s;", "Lkotlin/k0;", "b", "()V", "q", "c", "d", "p", "Lkotlinx/serialization/json/b;", "Lkotlinx/serialization/json/b;", "json", "", "I", "level", "Lkotlinx/serialization/json/internal/g0;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/g0;Lkotlinx/serialization/json/b;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class b0
extends s {
    @NotNull
    private final b c;
    private int d;

    public b0(@NotNull g0 g02, @NotNull b b4) {
        y.j((Object)g02, (String)"writer");
        y.j((Object)b4, (String)"json");
        super(g02);
        this.c = b4;
    }

    public void b() {
        this.o(true);
        ++this.d;
    }

    public void c() {
        this.o(false);
        this.k("\n");
        int n4 = this.d;
        for (int i4 = 0; i4 < n4; ++i4) {
            this.k(this.c.e().n());
        }
    }

    public void d() {
        if (this.a()) {
            this.o(false);
        } else {
            this.c();
        }
    }

    public void p() {
        this.f(' ');
    }

    public void q() {
        --this.d;
    }
}

