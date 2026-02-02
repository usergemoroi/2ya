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
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.c$a
 *  kotlinx.serialization.internal.d3
 *  kotlinx.serialization.n
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
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.d3;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H$\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0005\u001a\u00028\u0000*\u00028\u00028$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00028$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019\u0082\u0001\u0002\u001d\u001e\u00a8\u0006\u001f"}, d2={"Lkotlinx/serialization/internal/z0;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "key", "value", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "Lkotlin/k0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Lkotlinx/serialization/KSerializer;", "b", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "d", "valueSerializer", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/internal/j1;", "Lkotlinx/serialization/internal/x1;", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n570#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
public abstract class z0<K, V, R>
implements KSerializer<R> {
    @NotNull
    private final KSerializer<K> a;
    @NotNull
    private final KSerializer<V> b;

    private z0(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public /* synthetic */ z0(KSerializer kSerializer, KSerializer kSerializer2, p p4) {
        this(kSerializer, kSerializer2);
    }

    protected abstract K a(R var1);

    @NotNull
    protected final KSerializer<K> b() {
        return this.a;
    }

    protected abstract V c(R var1);

    @NotNull
    protected final KSerializer<V> d() {
        return this.b;
    }

    public R deserialize(@NotNull Decoder object) {
        block8: {
            block9: {
                c c4;
                SerialDescriptor serialDescriptor;
                block7: {
                    int n4;
                    block6: {
                        y.j((Object)object, (String)"decoder");
                        serialDescriptor = this.getDescriptor();
                        c4 = object.b(serialDescriptor);
                        if (!c4.k()) break block6;
                        object = this.e(c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)0, this.b(), null, (int)8, null), c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)1, this.d(), null, (int)8, null));
                        break block7;
                    }
                    object = d3.a();
                    Object object2 = d3.a();
                    while ((n4 = c4.w(this.getDescriptor())) != -1) {
                        if (n4 != 0) {
                            if (n4 == 1) {
                                object2 = c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)1, this.d(), null, (int)8, null);
                                continue;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Invalid index: ");
                            ((StringBuilder)object).append(n4);
                            throw new n(((StringBuilder)object).toString());
                        }
                        object = c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)0, this.b(), null, (int)8, null);
                    }
                    if (object == d3.a()) break block8;
                    if (object2 == d3.a()) break block9;
                    object = this.e(object, object2);
                }
                c4.c(serialDescriptor);
                return (R)object;
            }
            throw new n("Element 'value' is missing");
        }
        throw new n("Element 'key' is missing");
    }

    protected abstract R e(K var1, V var2);

    public void serialize(@NotNull Encoder encoder, R r4) {
        y.j((Object)encoder, (String)"encoder");
        encoder = encoder.b(this.getDescriptor());
        encoder.F(this.getDescriptor(), 0, this.a, this.a(r4));
        encoder.F(this.getDescriptor(), 1, this.b, this.c(r4));
        encoder.c(this.getDescriptor());
    }
}

