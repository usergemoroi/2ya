/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.Encoder$a
 *  kotlinx.serialization.encoding.d
 *  kotlinx.serialization.encoding.d$a
 *  kotlinx.serialization.n
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.p1;
import kotlinx.serialization.n;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\bM\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020%H\u0016\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020(H\u0016\u00a2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+H\u0016\u00a2\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0017\u00a2\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u001a\u00a2\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u001f\u00a2\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\"\u00a2\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020%\u00a2\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020(\u00a2\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020+\u00a2\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\bE\u0010FJA\u0010J\u001a\u00020\u0007\"\n\b\u0000\u0010G*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bJ\u0010KJA\u0010L\u001a\u00020\u0007\"\b\b\u0000\u0010G*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\bL\u0010K\u00a8\u0006N"}, d2={"Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/d;", "Lkotlin/k0;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "H", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", "value", "J", "(Ljava/lang/Object;)V", "B", "()V", "l", "(Z)V", "", "f", "(B)V", "", "k", "(S)V", "s", "(I)V", "", "A", "(J)V", "", "m", "(F)V", "", "x", "(D)V", "", "D", "(C)V", "", "v", "(Ljava/lang/String;)V", "enumDescriptor", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "o", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "n", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "u", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "Lkotlinx/serialization/o;", "serializer", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/o;Ljava/lang/Object;)V", "y", "<init>", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
public abstract class b
implements Encoder,
d {
    public void A(long l4) {
        this.J(l4);
    }

    public void B() {
        throw new n("'null' is not supported by default");
    }

    public final void C(@NotNull SerialDescriptor serialDescriptor, int n4, float f4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.m(f4);
        }
    }

    public void D(char c4) {
        this.J(Character.valueOf(c4));
    }

    @ExperimentalSerializationApi
    public void E() {
        Encoder.a.b((Encoder)this);
    }

    public <T> void F(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull o<? super T> o4, T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(o4, (String)"serializer");
        if (this.H(serialDescriptor, n4)) {
            this.e(o4, t3);
        }
    }

    public final void G(@NotNull SerialDescriptor serialDescriptor, int n4, double d4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.x(d4);
        }
    }

    public boolean H(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return true;
    }

    @ExperimentalSerializationApi
    public <T> void I(@NotNull o<? super T> o4, @Nullable T t3) {
        Encoder.a.c((Encoder)this, o4, t3);
    }

    public void J(@NotNull Object object) {
        y.j((Object)object, (String)"value");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Non-serializable ");
        stringBuilder.append(v0.b(object.getClass()));
        stringBuilder.append(" is not supported by ");
        stringBuilder.append(v0.b(this.getClass()));
        stringBuilder.append(" encoder");
        throw new n(stringBuilder.toString());
    }

    @NotNull
    public d b(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this;
    }

    public void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
    }

    public <T> void e(@NotNull o<? super T> o4, T t3) {
        Encoder.a.d((Encoder)this, o4, t3);
    }

    public void f(byte by) {
        this.J(by);
    }

    public void g(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"enumDescriptor");
        this.J(n4);
    }

    @NotNull
    public Encoder h(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this;
    }

    public final void i(@NotNull SerialDescriptor serialDescriptor, int n4, char c4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.D(c4);
        }
    }

    public final void j(@NotNull SerialDescriptor serialDescriptor, int n4, byte by) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.f(by);
        }
    }

    public void k(short s3) {
        this.J(s3);
    }

    public void l(boolean bl) {
        this.J(bl);
    }

    public void m(float f4) {
        this.J(Float.valueOf(f4));
    }

    public final void n(@NotNull SerialDescriptor serialDescriptor, int n4, int n5) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.s(n5);
        }
    }

    public final void o(@NotNull SerialDescriptor serialDescriptor, int n4, boolean bl) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.l(bl);
        }
    }

    public final void p(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull String string) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j((Object)string, (String)"value");
        if (this.H(serialDescriptor, n4)) {
            this.v(string);
        }
    }

    @ExperimentalSerializationApi
    public boolean q(@NotNull SerialDescriptor serialDescriptor, int n4) {
        return d.a.a((d)this, (SerialDescriptor)serialDescriptor, (int)n4);
    }

    public void s(int n4) {
        this.J(n4);
    }

    public final void t(@NotNull SerialDescriptor serialDescriptor, int n4, short s3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.k(s3);
        }
    }

    public final void u(@NotNull SerialDescriptor serialDescriptor, int n4, long l4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.H(serialDescriptor, n4)) {
            this.A(l4);
        }
    }

    public void v(@NotNull String string) {
        y.j((Object)string, (String)"value");
        this.J(string);
    }

    @NotNull
    public final Encoder w(@NotNull SerialDescriptor object, int n4) {
        y.j((Object)object, (String)"descriptor");
        object = this.H((SerialDescriptor)object, n4) ? this.h(object.d(n4)) : p1.a;
        return object;
    }

    public void x(double d4) {
        this.J(d4);
    }

    public <T> void y(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull o<? super T> o4, @Nullable T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(o4, (String)"serializer");
        if (this.H(serialDescriptor, n4)) {
            this.I(o4, t3);
        }
    }

    @NotNull
    public d z(@NotNull SerialDescriptor serialDescriptor, int n4) {
        return Encoder.a.a((Encoder)this, (SerialDescriptor)serialDescriptor, (int)n4);
    }
}

