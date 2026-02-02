/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.Encoder$a
 *  kotlinx.serialization.encoding.d
 *  kotlinx.serialization.n
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.n;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007\u00a2\u0006\u0004\br\u0010sJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00028\u0000*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0013H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0019H\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u001cH\u0014\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u001fH\u0014\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0014\u00a2\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020$H\u0014\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020'H\u0014\u00a2\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013\u00a2\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016\u00a2\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0019\u00a2\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u001c\u00a2\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u001f\u00a2\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020$\u00a2\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020'\u00a2\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005\u00a2\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\bJ\u0010IJ%\u0010K\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\bK\u0010LJ%\u0010M\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0013\u00a2\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0016\u00a2\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0019\u00a2\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u001c\u00a2\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u001f\u00a2\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020$\u00a2\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020'\u00a2\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b]\u0010^JA\u0010a\u001a\u00020\u0010\"\n\b\u0001\u0010(*\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00010_2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\ba\u0010bJA\u0010c\u001a\u00020\u0010\"\b\b\u0001\u0010(*\u00020\u00012\u0006\u00101\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00010_2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0004\bc\u0010bJ\u0017\u0010e\u001a\u00020\u00102\u0006\u0010d\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bg\u0010hR$\u0010m\u001a\u0012\u0012\u0004\u0012\u00028\u00000ij\b\u0012\u0004\u0012\u00028\u0000`j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010o\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bn\u0010hR\u0016\u0010q\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bp\u0010h\u00a8\u0006t"}, d2={"Lkotlinx/serialization/internal/a3;", "", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "", "index", "", "H", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "X", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "value", "Lkotlin/k0;", "Q", "(Ljava/lang/Object;I)V", "", "K", "(Ljava/lang/Object;B)V", "", "S", "(Ljava/lang/Object;S)V", "", "R", "(Ljava/lang/Object;J)V", "", "O", "(Ljava/lang/Object;F)V", "", "M", "(Ljava/lang/Object;D)V", "J", "(Ljava/lang/Object;Z)V", "", "L", "(Ljava/lang/Object;C)V", "", "T", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "N", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "P", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "l", "(Z)V", "f", "(B)V", "k", "(S)V", "s", "(I)V", "A", "(J)V", "m", "(F)V", "x", "(D)V", "D", "(C)V", "v", "(Ljava/lang/String;)V", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "U", "o", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "j", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "n", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "u", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "G", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/o;", "serializer", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/o;Ljava/lang/Object;)V", "y", "name", "Z", "(Ljava/lang/Object;)V", "Y", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "V", "currentTag", "W", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
@SourceDebugExtension(value={"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public abstract class a3<Tag>
implements Encoder,
d {
    @NotNull
    private final ArrayList<Tag> a = new ArrayList();

    private final boolean H(SerialDescriptor serialDescriptor, int n4) {
        this.Z(this.X(serialDescriptor, n4));
        return true;
    }

    public final void A(long l4) {
        this.R(this.Y(), l4);
    }

    public final void C(@NotNull SerialDescriptor serialDescriptor, int n4, float f4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.O(this.X(serialDescriptor, n4), f4);
    }

    public final void D(char c4) {
        this.L(this.Y(), c4);
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
        this.M(this.X(serialDescriptor, n4), d4);
    }

    @ExperimentalSerializationApi
    public <T> void I(@NotNull o<? super T> o4, @Nullable T t3) {
        Encoder.a.c((Encoder)this, o4, t3);
    }

    protected abstract void J(Tag var1, boolean var2);

    protected abstract void K(Tag var1, byte var2);

    protected abstract void L(Tag var1, char var2);

    protected abstract void M(Tag var1, double var2);

    protected abstract void N(Tag var1, @NotNull SerialDescriptor var2, int var3);

    protected abstract void O(Tag var1, float var2);

    @NotNull
    protected Encoder P(Tag Tag, @NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"inlineDescriptor");
        this.Z(Tag);
        return this;
    }

    protected abstract void Q(Tag var1, int var2);

    protected abstract void R(Tag var1, long var2);

    protected abstract void S(Tag var1, short var2);

    protected abstract void T(Tag var1, @NotNull String var2);

    protected abstract void U(@NotNull SerialDescriptor var1);

    protected final Tag V() {
        return (Tag)t.D0(this.a);
    }

    @Nullable
    protected final Tag W() {
        return (Tag)t.E0(this.a);
    }

    protected abstract Tag X(@NotNull SerialDescriptor var1, int var2);

    protected final Tag Y() {
        if (this.a.isEmpty() ^ true) {
            ArrayList<Tag> arrayList = this.a;
            return arrayList.remove(t.o(arrayList));
        }
        throw new n("No tag in stack for requested element");
    }

    protected final void Z(Tag Tag) {
        this.a.add(Tag);
    }

    public final void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.a.isEmpty() ^ true) {
            this.Y();
        }
        this.U(serialDescriptor);
    }

    public abstract <T> void e(@NotNull o<? super T> var1, T var2);

    public final void f(byte by) {
        this.K(this.Y(), by);
    }

    public final void g(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"enumDescriptor");
        this.N(this.Y(), serialDescriptor, n4);
    }

    @NotNull
    public Encoder h(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.P(this.Y(), serialDescriptor);
    }

    public final void i(@NotNull SerialDescriptor serialDescriptor, int n4, char c4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.L(this.X(serialDescriptor, n4), c4);
    }

    public final void j(@NotNull SerialDescriptor serialDescriptor, int n4, byte by) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.K(this.X(serialDescriptor, n4), by);
    }

    public final void k(short s3) {
        this.S(this.Y(), s3);
    }

    public final void l(boolean bl) {
        this.J(this.Y(), bl);
    }

    public final void m(float f4) {
        this.O(this.Y(), f4);
    }

    public final void n(@NotNull SerialDescriptor serialDescriptor, int n4, int n5) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.Q(this.X(serialDescriptor, n4), n5);
    }

    public final void o(@NotNull SerialDescriptor serialDescriptor, int n4, boolean bl) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.J(this.X(serialDescriptor, n4), bl);
    }

    public final void p(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull String string) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j((Object)string, (String)"value");
        this.T(this.X(serialDescriptor, n4), string);
    }

    public final void s(int n4) {
        this.Q(this.Y(), n4);
    }

    public final void t(@NotNull SerialDescriptor serialDescriptor, int n4, short s3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.S(this.X(serialDescriptor, n4), s3);
    }

    public final void u(@NotNull SerialDescriptor serialDescriptor, int n4, long l4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.R(this.X(serialDescriptor, n4), l4);
    }

    public final void v(@NotNull String string) {
        y.j((Object)string, (String)"value");
        this.T(this.Y(), string);
    }

    @NotNull
    public final Encoder w(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.P(this.X(serialDescriptor, n4), serialDescriptor.d(n4));
    }

    public final void x(double d4) {
        this.M(this.Y(), d4);
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

