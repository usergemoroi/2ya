/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.z2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\f\u0010\u0007J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2={"Lkotlinx/serialization/internal/n1;", "Lkotlinx/serialization/internal/z2;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "g0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "nestedName", "h0", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "f0", "parentName", "childName", "e0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "i0", "()Ljava/lang/String;", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
public abstract class n1
extends z2<String> {
    @NotNull
    protected abstract String e0(@NotNull String var1, @NotNull String var2);

    @NotNull
    protected String f0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return serialDescriptor.f(n4);
    }

    @NotNull
    protected final String g0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"<this>");
        return this.h0(this.f0(serialDescriptor, n4));
    }

    @NotNull
    protected final String h0(@NotNull String string) {
        String string2;
        y.j((Object)string, (String)"nestedName");
        String string3 = string2 = (String)this.Y();
        if (string2 == null) {
            string3 = "";
        }
        return this.e0(string3, string);
    }

    @NotNull
    protected final String i0() {
        String string = this.a0().isEmpty() ? "$" : t.B0(this.a0(), ".", "$.", null, 0, null, null, 60, null);
        return string;
    }
}

