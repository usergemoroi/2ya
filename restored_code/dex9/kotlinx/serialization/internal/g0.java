/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.i
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.internal.b2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.n;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.i;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.f0;
import kotlinx.serialization.internal.h2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2={"Lkotlinx/serialization/internal/g0;", "Lkotlinx/serialization/internal/h2;", "", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lkotlinx/serialization/descriptors/l;", "m", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "", "n", "Lkotlin/m;", "B", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "name", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n16#2:149\n160#3:150\n1797#4,3:151\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:149\n46#1:150\n46#1:151,3\n*E\n"})
public final class g0
extends h2 {
    @NotNull
    private final l m;
    @NotNull
    private final m n;

    public g0(@NotNull String string, int n4) {
        y.j((Object)string, (String)"name");
        super(string, null, n4, 2, null);
        this.m = l.b.a;
        this.n = kotlin.n.b(new f0(n4, string, this));
    }

    private static final SerialDescriptor[] A(int n4, String string, g0 g02) {
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[n4];
        for (int i4 = 0; i4 < n4; ++i4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append('.');
            stringBuilder.append(g02.f(i4));
            serialDescriptorArray[i4] = k.e((String)stringBuilder.toString(), (l)m.d.a, (SerialDescriptor[])new SerialDescriptor[0], null, (int)8, null);
        }
        return serialDescriptorArray;
    }

    private final SerialDescriptor[] B() {
        return (SerialDescriptor[])this.n.getValue();
    }

    public static /* synthetic */ SerialDescriptor[] z(int n4, String string, g0 g02) {
        return g0.A(n4, string, g02);
    }

    @Override
    @NotNull
    public SerialDescriptor d(int n4) {
        return this.B()[n4];
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof SerialDescriptor)) {
            return false;
        }
        if ((object = (SerialDescriptor)object).getKind() != l.b.a) {
            return false;
        }
        if (!y.e((Object)this.h(), (Object)object.h())) {
            return false;
        }
        return y.e((Object)b2.a((SerialDescriptor)this), (Object)b2.a((SerialDescriptor)object));
    }

    @Override
    @NotNull
    public l getKind() {
        return this.m;
    }

    @Override
    public int hashCode() {
        int n4 = this.h().hashCode();
        Iterator iterator = i.b((SerialDescriptor)this).iterator();
        int n5 = 1;
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            int n6 = string != null ? string.hashCode() : 0;
            n5 = n5 * 31 + n6;
        }
        return n4 * 31 + n5;
    }

    @Override
    @NotNull
    public String toString() {
        Iterable iterable = i.b((SerialDescriptor)this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h());
        stringBuilder.append('(');
        return t.B0(iterable, ", ", stringBuilder.toString(), ")", 0, null, null, 56, null);
    }
}

