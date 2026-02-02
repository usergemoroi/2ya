/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.c$a
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.ranges.g;
import kotlin.ranges.j;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\u00a2\u0006\u0004\b(\u0010)J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006\u00a2\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0014\u0010'\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\u0002*+\u00a8\u0006,"}, d2={"Lkotlinx/serialization/internal/l1;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/a;", "", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "", "startIndex", "size", "Lkotlin/k0;", "o", "(Lkotlinx/serialization/encoding/c;Ljava/util/Map;II)V", "index", "", "checkIndex", "p", "(Lkotlinx/serialization/encoding/c;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlinx/serialization/KSerializer;", "m", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "n", "valueSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/internal/p0;", "Lkotlinx/serialization/internal/b1;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
@SourceDebugExtension(value={"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n488#3,2:285\n490#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
public abstract class l1<Key, Value, Collection, Builder extends Map<Key, Value>>
extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    @NotNull
    private final KSerializer<Key> a;
    @NotNull
    private final KSerializer<Value> b;

    private l1(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public /* synthetic */ l1(KSerializer kSerializer, KSerializer kSerializer2, p p4) {
        this(kSerializer, kSerializer2);
    }

    @Override
    @NotNull
    public abstract SerialDescriptor getDescriptor();

    @NotNull
    public final KSerializer<Key> m() {
        return this.a;
    }

    @NotNull
    public final KSerializer<Value> n() {
        return this.b;
    }

    protected final void o(@NotNull c c4, @NotNull Builder Builder2, int n4, int n5) {
        block3: {
            block6: {
                int n6;
                int n7;
                block5: {
                    int n8;
                    block4: {
                        y.j((Object)c4, (String)"decoder");
                        y.j(Builder2, (String)"builder");
                        if (n5 < 0) break block3;
                        g g4 = j.u(j.v(0, n5 * 2), 2);
                        n8 = g4.d();
                        n7 = g4.e();
                        n6 = g4.f();
                        if (n6 <= 0) break block4;
                        n5 = n8;
                        if (n8 <= n7) break block5;
                    }
                    if (n6 >= 0 || n7 > n8) break block6;
                    n5 = n8;
                }
                while (true) {
                    this.p(c4, n4 + n5, Builder2, false);
                    if (n5 == n7) break;
                    n5 += n6;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void p(@NotNull c object, int n4, @NotNull Builder Builder2, boolean bl) {
        y.j((Object)object, (String)"decoder");
        y.j(Builder2, (String)"builder");
        Object object2 = c.a.c((c)object, (SerialDescriptor)this.getDescriptor(), (int)n4, this.a, null, (int)8, null);
        if (bl) {
            int n5 = object.w(this.getDescriptor());
            if (n5 != n4 + 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Value must follow key in a map, index for key: ");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(", returned index for value: ");
                ((StringBuilder)object).append(n5);
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            n4 = n5;
        } else {
            ++n4;
        }
        object = Builder2.containsKey(object2) && !(this.b.getDescriptor().getKind() instanceof e) ? object.p(this.getDescriptor(), n4, this.b, s0.k(Builder2, object2)) : c.a.c((c)object, (SerialDescriptor)this.getDescriptor(), (int)n4, this.b, null, (int)8, null);
        Builder2.put((Object)object2, (Object)object);
    }

    public void serialize(@NotNull Encoder encoder, Collection object) {
        y.j((Object)encoder, (String)"encoder");
        int n4 = this.e(object);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        encoder = encoder.z(serialDescriptor, n4);
        object = this.d(object);
        n4 = 0;
        while (true) {
            int n5 = n4;
            if (!object.hasNext()) break;
            Map.Entry entry = (Map.Entry)object.next();
            Object object2 = entry.getKey();
            entry = entry.getValue();
            encoder.F(this.getDescriptor(), n5, this.m(), object2);
            object2 = this.getDescriptor();
            n4 = n5 + 2;
            encoder.F(object2, n5 + 1, this.n(), (Object)entry);
        }
        encoder.c(serialDescriptor);
    }
}

