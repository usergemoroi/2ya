/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.k
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
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.d3;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u00a2\u0006\u0004\b \u0010!J)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\n\u0010\tJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006\""}, d2={"Lkotlinx/serialization/internal/c3;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/y;", "Lkotlinx/serialization/encoding/c;", "composite", "b", "(Lkotlinx/serialization/encoding/c;)Lkotlin/y;", "c", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "f", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/y;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "e", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlin/y;", "a", "Lkotlinx/serialization/KSerializer;", "aSerializer", "bSerializer", "cSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class c3<A, B, C>
implements KSerializer<y<? extends A, ? extends B, ? extends C>> {
    @NotNull
    private final KSerializer<A> a;
    @NotNull
    private final KSerializer<B> b;
    @NotNull
    private final KSerializer<C> c;
    @NotNull
    private final SerialDescriptor d;

    public c3(@NotNull KSerializer<A> object, @NotNull KSerializer<B> kSerializer, @NotNull KSerializer<C> kSerializer2) {
        kotlin.jvm.internal.y.j(object, (String)"aSerializer");
        kotlin.jvm.internal.y.j(kSerializer, (String)"bSerializer");
        kotlin.jvm.internal.y.j(kSerializer2, (String)"cSerializer");
        this.a = object;
        this.b = kSerializer;
        this.c = kSerializer2;
        object = new b3(this);
        this.d = k.c((String)"kotlin.Triple", (SerialDescriptor[])new SerialDescriptor[0], (l)object);
    }

    public static /* synthetic */ k0 a(c3 c32, a a4) {
        return c3.d(c32, a4);
    }

    private final y<A, B, C> b(c c4) {
        Object object = c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)0, this.a, null, (int)8, null);
        Object object2 = c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)1, this.b, null, (int)8, null);
        Object object3 = c.a.c((c)c4, (SerialDescriptor)this.getDescriptor(), (int)2, this.c, null, (int)8, null);
        c4.c(this.getDescriptor());
        return new y(object, object2, object3);
    }

    private final y<A, B, C> c(c object) {
        int n4;
        Object object2 = d3.a();
        Object object3 = d3.a();
        Object object4 = d3.a();
        while ((n4 = object.w(this.getDescriptor())) != -1) {
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 == 2) {
                        object4 = c.a.c((c)object, (SerialDescriptor)this.getDescriptor(), (int)2, this.c, null, (int)8, null);
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unexpected index ");
                    ((StringBuilder)object).append(n4);
                    throw new n(((StringBuilder)object).toString());
                }
                object3 = c.a.c((c)object, (SerialDescriptor)this.getDescriptor(), (int)1, this.b, null, (int)8, null);
                continue;
            }
            object2 = c.a.c((c)object, (SerialDescriptor)this.getDescriptor(), (int)0, this.a, null, (int)8, null);
        }
        object.c(this.getDescriptor());
        if (object2 != d3.a()) {
            if (object3 != d3.a()) {
                if (object4 != d3.a()) {
                    return new y(object2, object3, object4);
                }
                throw new n("Element 'third' is missing");
            }
            throw new n("Element 'second' is missing");
        }
        throw new n("Element 'first' is missing");
    }

    private static final k0 d(c3 c32, a a4) {
        kotlin.jvm.internal.y.j((Object)a4, (String)"$this$buildClassSerialDescriptor");
        kotlinx.serialization.descriptors.a.b((a)a4, (String)"first", (SerialDescriptor)c32.a.getDescriptor(), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((a)a4, (String)"second", (SerialDescriptor)c32.b.getDescriptor(), null, (boolean)false, (int)12, null);
        kotlinx.serialization.descriptors.a.b((a)a4, (String)"third", (SerialDescriptor)c32.c.getDescriptor(), null, (boolean)false, (int)12, null);
        return k0.a;
    }

    @NotNull
    public y<A, B, C> e(@NotNull Decoder decoder) {
        kotlin.jvm.internal.y.j((Object)decoder, (String)"decoder");
        decoder = decoder.b(this.getDescriptor());
        if (decoder.k()) {
            return this.b((c)decoder);
        }
        return this.c((c)decoder);
    }

    public void f(@NotNull Encoder encoder, @NotNull y<? extends A, ? extends B, ? extends C> y3) {
        kotlin.jvm.internal.y.j((Object)encoder, (String)"encoder");
        kotlin.jvm.internal.y.j(y3, (String)"value");
        encoder = encoder.b(this.getDescriptor());
        encoder.F(this.getDescriptor(), 0, this.a, y3.d());
        encoder.F(this.getDescriptor(), 1, this.b, y3.e());
        encoder.F(this.getDescriptor(), 2, this.c, y3.f());
        encoder.c(this.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.d;
    }
}

