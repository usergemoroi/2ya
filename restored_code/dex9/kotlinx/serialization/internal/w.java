/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.c$a
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.a;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u00a2\u0006\u0004\b#\u0010$J#\u0010\t\u001a\u00020\b*\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H$\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0004\u00a2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0003%&'\u00a8\u0006("}, d2={"Lkotlinx/serialization/internal/w;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/a;", "", "index", "element", "Lkotlin/k0;", "n", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "startIndex", "size", "g", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;II)V", "", "checkIndex", "h", "(Lkotlinx/serialization/encoding/c;ILjava/lang/Object;Z)V", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlinx/serialization/KSerializer;", "elementSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/internal/x;", "Lkotlinx/serialization/internal/m2;", "Lkotlinx/serialization/internal/p2;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
public abstract class w<Element, Collection, Builder>
extends a<Element, Collection, Builder> {
    @NotNull
    private final KSerializer<Element> a;

    private w(KSerializer<Element> kSerializer) {
        super(null);
        this.a = kSerializer;
    }

    public /* synthetic */ w(KSerializer kSerializer, p p4) {
        this(kSerializer);
    }

    @Override
    protected final void g(@NotNull c c4, Builder Builder2, int n4, int n5) {
        y.j((Object)c4, (String)"decoder");
        if (n5 >= 0) {
            for (int i4 = 0; i4 < n5; ++i4) {
                this.h(c4, n4 + i4, Builder2, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @Override
    protected void h(@NotNull c c4, int n4, Builder Builder2, boolean bl) {
        y.j((Object)c4, (String)"decoder");
        this.n(Builder2, n4, c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)n4, this.a, null, (int)8, null));
    }

    protected abstract void n(Builder var1, int var2, Element var3);

    public void serialize(@NotNull Encoder encoder, Collection object) {
        y.j((Object)encoder, (String)"encoder");
        int n4 = this.e(object);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        encoder = encoder.z(serialDescriptor, n4);
        object = this.d(object);
        for (int i4 = 0; i4 < n4; ++i4) {
            encoder.F(this.getDescriptor(), i4, (o)this.a, object.next());
        }
        encoder.c(serialDescriptor);
    }
}

