/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.internal.SuppressAnimalSniffer
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.s
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2={"Lkotlinx/serialization/json/internal/t;", "Lkotlinx/serialization/json/internal/s;", "", "value", "Lkotlin/k0;", "n", "(Ljava/lang/String;)V", "", "c", "Z", "forceQuoting", "Lkotlinx/serialization/json/internal/g0;", "writer", "<init>", "(Lkotlinx/serialization/json/internal/g0;Z)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SuppressAnimalSniffer
public final class t
extends s {
    private final boolean c;

    public t(@NotNull g0 g02, boolean bl) {
        y.j((Object)g02, (String)"writer");
        super(g02);
        this.c = bl;
    }

    public void n(@NotNull String string) {
        y.j((Object)string, (String)"value");
        if (this.c) {
            super.n(string);
        } else {
            super.k(string);
        }
    }
}

