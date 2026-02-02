/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.a0
 *  kotlin.c0
 *  kotlin.e0
 *  kotlin.h0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.SuppressAnimalSniffer
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.s
 *  kotlinx.serialization.json.internal.u
 *  kotlinx.serialization.json.internal.v
 *  kotlinx.serialization.json.internal.w
 *  kotlinx.serialization.json.internal.x
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.c0;
import kotlin.e0;
import kotlin.h0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.s;
import kotlinx.serialization.json.internal.u;
import kotlinx.serialization.json.internal.v;
import kotlinx.serialization.json.internal.w;
import kotlinx.serialization.json.internal.x;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/json/internal/a0;", "Lkotlinx/serialization/json/internal/s;", "", "v", "Lkotlin/k0;", "i", "(I)V", "", "j", "(J)V", "", "e", "(B)V", "", "l", "(S)V", "", "c", "Z", "forceQuoting", "Lkotlinx/serialization/json/internal/g0;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/g0;Z)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SuppressAnimalSniffer
public final class a0
extends s {
    private final boolean c;

    public a0(@NotNull g0 g02, boolean bl) {
        y.j((Object)g02, (String)"writer");
        super(g02);
        this.c = bl;
    }

    public void e(byte by) {
        boolean bl = this.c;
        String string = kotlin.a0.f((byte)kotlin.a0.c((byte)by));
        if (bl) {
            this.n(string);
        } else {
            this.k(string);
        }
    }

    public void i(int n4) {
        boolean bl = this.c;
        n4 = c0.c((int)n4);
        if (bl) {
            this.n(w.a((int)n4));
        } else {
            this.k(x.a((int)n4));
        }
    }

    public void j(long l4) {
        boolean bl = this.c;
        l4 = e0.c((long)l4);
        if (bl) {
            this.n(u.a((long)l4));
        } else {
            this.k(v.a((long)l4));
        }
    }

    public void l(short s3) {
        boolean bl = this.c;
        String string = h0.f((short)h0.c((short)s3));
        if (bl) {
            this.n(string);
        } else {
            this.k(string);
        }
    }
}

