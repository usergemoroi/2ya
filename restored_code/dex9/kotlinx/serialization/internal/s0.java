/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.h2;
import kotlinx.serialization.internal.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002\u00a2\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/internal/s0;", "Lkotlinx/serialization/internal/h2;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Z", "isInline", "()Z", "", "name", "Lkotlinx/serialization/internal/n0;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/n0;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
public final class s0
extends h2 {
    private final boolean m;

    public s0(@NotNull String string, @NotNull n0<?> n02) {
        y.j((Object)string, (String)"name");
        y.j(n02, (String)"generatedSerializer");
        super(string, n02, 1);
        this.m = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean equals(@Nullable Object object) {
        SerialDescriptor serialDescriptor;
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (!(object instanceof s0)) return false;
        String string = this.h();
        if (y.e((Object)string, (Object)(serialDescriptor = (SerialDescriptor)object).h())) {
            if (!((s0)(object = (s0)object)).isInline()) return false;
            if (!Arrays.equals(this.t(), ((h2)object).t())) return false;
            if (this.e() == serialDescriptor.e()) {
                int n4 = this.e();
                int n5 = 0;
                while (true) {
                    boolean bl2 = bl;
                    if (n5 >= n4) return bl2;
                    if (!y.e((Object)this.d(n5).h(), (Object)serialDescriptor.d(n5).h()) || !y.e((Object)this.d(n5).getKind(), (Object)serialDescriptor.d(n5).getKind())) break;
                    ++n5;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override
    public boolean isInline() {
        return this.m;
    }
}

