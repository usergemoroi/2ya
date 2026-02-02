/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Decoder$a
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.c$a
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\bO\u0010PJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020%H\u0016\u00a2\u0006\u0004\b*\u0010+J5\u00100\u001a\u00028\u0000\"\n\b\u0000\u0010,*\u0004\u0018\u00010\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%H\u0016\u00a2\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010)\u001a\u00020%H\u0016\u00a2\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\u00062\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\r2\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u00102\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00132\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00162\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00192\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\"2\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013\u00a2\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00012\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\bJ\u0010KJ=\u0010L\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\b\u0010/\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\bL\u0010MJC\u0010N\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010,*\u00020\u00032\u0006\u0010)\u001a\u00020%2\u0006\u00107\u001a\u00020\u00132\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000-2\b\u0010/\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\bN\u0010M\u00a8\u0006Q"}, d2={"Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "", "J", "()Ljava/lang/Object;", "", "D", "()Z", "", "g", "()Ljava/lang/Void;", "A", "", "H", "()B", "", "m", "()S", "", "u", "()I", "", "h", "()J", "", "y", "()F", "", "n", "()D", "", "o", "()C", "", "q", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "descriptor", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/c;", "deserializer", "previousValue", "I", "(Lkotlinx/serialization/c;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;", "Lkotlin/k0;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "index", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "E", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "e", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "l", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/c;Ljava/lang/Object;)Ljava/lang/Object;", "j", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
@SourceDebugExtension(value={"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n270#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
public abstract class a
implements Decoder,
kotlinx.serialization.encoding.c {
    public boolean A() {
        Object object = this.J();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean)object;
    }

    public final byte B(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.H();
    }

    public final boolean C(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.A();
    }

    public boolean D() {
        return true;
    }

    public final short E(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.m();
    }

    public final double F(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.n();
    }

    public <T> T G(@NotNull c<? extends T> c4) {
        return (T)Decoder.a.a((Decoder)this, c4);
    }

    public abstract byte H();

    public <T> T I(@NotNull c<? extends T> c4, @Nullable T t3) {
        y.j(c4, (String)"deserializer");
        return this.G(c4);
    }

    @NotNull
    public Object J() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(v0.b(this.getClass()));
        stringBuilder.append(" can't retrieve untyped values");
        throw new n(stringBuilder.toString());
    }

    @NotNull
    public kotlinx.serialization.encoding.c b(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this;
    }

    public void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
    }

    public final long e(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.h();
    }

    public final int f(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.u();
    }

    @Nullable
    public Void g() {
        return null;
    }

    public abstract long h();

    @NotNull
    public final String i(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.q();
    }

    @Nullable
    public final <T> T j(@NotNull SerialDescriptor object, int n4, @NotNull c<? extends T> c4, @Nullable T t3) {
        y.j((Object)object, (String)"descriptor");
        y.j(c4, (String)"deserializer");
        object = !c4.getDescriptor().b() && !this.D() ? this.g() : this.I(c4, t3);
        return (T)object;
    }

    @ExperimentalSerializationApi
    public boolean k() {
        return c.a.b((kotlinx.serialization.encoding.c)this);
    }

    @NotNull
    public Decoder l(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.x(serialDescriptor.d(n4));
    }

    public abstract short m();

    public double n() {
        Object object = this.J();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.Double");
        return (Double)object;
    }

    public char o() {
        Object object = this.J();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.Char");
        return ((Character)object).charValue();
    }

    public <T> T p(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull c<? extends T> c4, @Nullable T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(c4, (String)"deserializer");
        return this.I(c4, t3);
    }

    @NotNull
    public String q() {
        Object object = this.J();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.String");
        return (String)object;
    }

    public final char r(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.o();
    }

    public int s(@NotNull SerialDescriptor object) {
        y.j((Object)object, (String)"enumDescriptor");
        object = this.J();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.Int");
        return (Integer)object;
    }

    public abstract int u();

    public int v(@NotNull SerialDescriptor serialDescriptor) {
        return c.a.a((kotlinx.serialization.encoding.c)this, (SerialDescriptor)serialDescriptor);
    }

    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this;
    }

    public float y() {
        Object object = this.J();
        y.h((Object)object, (String)"null cannot be cast to non-null type kotlin.Float");
        return ((Float)object).floatValue();
    }

    public final float z(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.y();
    }
}

