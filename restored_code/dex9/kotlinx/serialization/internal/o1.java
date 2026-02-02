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
import kotlin.jvm.internal.y;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.a3;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\f\u0010\u0007J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/internal/o1;", "Lkotlinx/serialization/internal/a3;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "c0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "nestedName", "d0", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "b0", "parentName", "childName", "a0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
public abstract class o1
extends a3<String> {
    @NotNull
    protected abstract String a0(@NotNull String var1, @NotNull String var2);

    @NotNull
    protected abstract String b0(@NotNull SerialDescriptor var1, int var2);

    @NotNull
    protected final String c0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"<this>");
        return this.d0(this.b0(serialDescriptor, n4));
    }

    @NotNull
    protected final String d0(@NotNull String string) {
        String string2;
        y.j((Object)string, (String)"nestedName");
        String string3 = string2 = (String)this.W();
        if (string2 == null) {
            string3 = "";
        }
        return this.a0(string3, string);
    }
}

