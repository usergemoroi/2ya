/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.u0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.c$a
 *  kotlinx.serialization.h
 *  kotlinx.serialization.n
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.h;
import kotlinx.serialization.n;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006 "}, d2={"Lkotlinx/serialization/internal/b;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/c;", "compositeDecoder", "b", "(Lkotlinx/serialization/encoding/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/k0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "", "klassName", "Lkotlinx/serialization/c;", "c", "(Lkotlinx/serialization/encoding/c;Ljava/lang/String;)Lkotlinx/serialization/c;", "Lkotlinx/serialization/o;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/o;", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
@SourceDebugExtension(value={"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n82#3:118\n570#4,2:121\n572#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
public abstract class b<T>
implements KSerializer<T> {
    private final T b(kotlinx.serialization.encoding.c c4) {
        c c5 = h.a((b)this, (kotlinx.serialization.encoding.c)c4, (String)c4.i(this.getDescriptor(), 0));
        return (T)c.a.c((kotlinx.serialization.encoding.c)c4, (SerialDescriptor)this.getDescriptor(), (int)1, (c)c5, null, (int)8, null);
    }

    @InternalSerializationApi
    @Nullable
    public c<T> c(@NotNull kotlinx.serialization.encoding.c c4, @Nullable String string) {
        y.j((Object)c4, (String)"decoder");
        return c4.a().e(this.e(), string);
    }

    @InternalSerializationApi
    @Nullable
    public o<T> d(@NotNull Encoder encoder, @NotNull T t3) {
        y.j((Object)encoder, (String)"encoder");
        y.j(t3, (String)"value");
        return encoder.a().f(this.e(), t3);
    }

    @NotNull
    public final T deserialize(@NotNull Decoder object) {
        u0 u02;
        block10: {
            Object object2;
            Object object3;
            block9: {
                int n4;
                block8: {
                    y.j((Object)object, (String)"decoder");
                    object3 = this.getDescriptor();
                    object2 = object.b(object3);
                    u02 = new u0();
                    if (!object2.k()) break block8;
                    object = this.b((kotlinx.serialization.encoding.c)object2);
                    break block9;
                }
                object = null;
                while ((n4 = object2.w(this.getDescriptor())) != -1) {
                    if (n4 != 0) {
                        if (n4 != 1) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Invalid index in polymorphic deserialization of ");
                            object3 = (String)u02.c;
                            object = object3;
                            if (object3 == null) {
                                object = "unknown class";
                            }
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            ((StringBuilder)object2).append(n4);
                            throw new n(((StringBuilder)object2).toString());
                        }
                        object = u02.c;
                        if (object != null) {
                            u02.c = object;
                            object = h.a((b)this, (kotlinx.serialization.encoding.c)object2, (String)((String)object));
                            object = c.a.c((kotlinx.serialization.encoding.c)object2, (SerialDescriptor)this.getDescriptor(), (int)n4, (c)object, null, (int)8, null);
                            continue;
                        }
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    u02.c = object2.i(this.getDescriptor(), n4);
                }
                if (object == null) break block10;
                y.h((Object)object, (String)"null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
            }
            object2.c(object3);
            return (T)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Polymorphic value has not been read for class ");
        ((StringBuilder)object).append((String)u02.c);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @NotNull
    public abstract KClass<T> e();

    public final void serialize(@NotNull Encoder encoder, @NotNull T t3) {
        y.j((Object)encoder, (String)"encoder");
        y.j(t3, (String)"value");
        o o4 = h.b((b)this, (Encoder)encoder, t3);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        encoder = encoder.b(serialDescriptor);
        encoder.p(this.getDescriptor(), 0, o4.getDescriptor().h());
        SerialDescriptor serialDescriptor2 = this.getDescriptor();
        y.h((Object)o4, (String)"null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        encoder.F(serialDescriptor2, 1, o4, t3);
        encoder.c(serialDescriptor);
    }
}

