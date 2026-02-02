/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.m
 *  kotlin.q
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.m;
import kotlin.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.t1;
import kotlinx.serialization.internal.u1;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/v1;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "objectInstance", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/m;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "serialName", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,57:1\n570#2,4:58\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:58,4\n*E\n"})
public final class v1<T>
implements KSerializer<T> {
    @NotNull
    private final T a;
    @NotNull
    private List<? extends Annotation> b;
    @NotNull
    private final m c;

    public v1(@NotNull String string, @NotNull T t3) {
        y.j((Object)string, (String)"serialName");
        y.j(t3, (String)"objectInstance");
        this.a = t3;
        this.b = t.m();
        this.c = kotlin.n.a(q.d, new t1(string, this));
    }

    public static /* synthetic */ k0 a(v1 v12, a a4) {
        return v1.d(v12, a4);
    }

    public static /* synthetic */ SerialDescriptor b(String string, v1 v12) {
        return v1.c(string, v12);
    }

    private static final SerialDescriptor c(String string, v1 object) {
        m.d d4 = m.d.a;
        object = new u1((v1)object);
        return k.d((String)string, (kotlinx.serialization.descriptors.l)d4, (SerialDescriptor[])new SerialDescriptor[0], (l)object);
    }

    private static final k0 d(v1 v12, a a4) {
        y.j((Object)a4, (String)"$this$buildSerialDescriptor");
        a4.h(v12.b);
        return k0.a;
    }

    @NotNull
    public T deserialize(@NotNull Decoder object) {
        int n4;
        y.j((Object)object, (String)"decoder");
        SerialDescriptor serialDescriptor = this.getDescriptor();
        object = object.b(serialDescriptor);
        if (object.k() || (n4 = object.w(this.getDescriptor())) == -1) {
            k0 k02 = k0.a;
            object.c(serialDescriptor);
            return this.a;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected index ");
        ((StringBuilder)object).append(n4);
        throw new n(((StringBuilder)object).toString());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    public void serialize(@NotNull Encoder encoder, @NotNull T t3) {
        y.j((Object)encoder, (String)"encoder");
        y.j(t3, (String)"value");
        encoder.b(this.getDescriptor()).c(this.getDescriptor());
    }
}

