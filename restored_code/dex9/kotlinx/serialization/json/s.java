/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.json.f
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.modules.d
 *  kotlinx.serialization.modules.f
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.internal.e1;
import kotlinx.serialization.modules.c;
import kotlinx.serialization.modules.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/json/s;", "Lkotlinx/serialization/json/b;", "Lkotlin/k0;", "g", "()V", "Lkotlinx/serialization/json/f;", "configuration", "Lkotlinx/serialization/modules/c;", "module", "<init>", "(Lkotlinx/serialization/json/f;Lkotlinx/serialization/modules/c;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
final class s
extends b {
    public s(@NotNull f f4, @NotNull c c4) {
        y.j((Object)f4, (String)"configuration");
        y.j((Object)c4, (String)"module");
        super(f4, c4, null);
        this.g();
    }

    private final void g() {
        if (y.e((Object)this.a(), (Object)kotlinx.serialization.modules.d.a())) {
            return;
        }
        e1 e12 = new e1(this.e().p(), this.e().e());
        this.a().a((kotlinx.serialization.modules.f)e12);
    }
}

