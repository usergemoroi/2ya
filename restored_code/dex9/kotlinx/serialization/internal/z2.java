/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.encoding.c$a
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.x2;
import kotlinx.serialization.internal.y2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007\u00a2\u0006\u0004\bv\u0010wJ+\u0010\t\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00028\u0000*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH$\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0006\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\b.\u0010/J3\u00103\u001a\u00028\u0001\"\n\b\u0001\u0010.*\u0004\u0018\u00010\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0001002\b\u00102\u001a\u0004\u0018\u00018\u0001H\u0014\u00a2\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0010\u00a2\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0013\u00a2\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0016\u00a2\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f\u00a2\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001b\u00a2\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001e\u00a2\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020!\u00a2\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020$\u00a2\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020'\u00a2\u0006\u0004\bK\u0010LJ\u0015\u0010M\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u000b\u00a2\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bQ\u0010RJ\u001d\u0010\u0005\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0005\u0010SJ\u001d\u0010T\u001a\u00020\f2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020!2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020$2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020'2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b`\u0010aJA\u0010b\u001a\u00028\u0001\"\n\b\u0001\u0010.*\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u0001002\b\u00102\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\bb\u0010cJC\u0010d\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010.*\u00020\u00012\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001002\b\u00102\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\bd\u0010cJ\u0017\u0010g\u001a\u00020f2\u0006\u0010e\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00028\u0000H\u0004\u00a2\u0006\u0004\bi\u0010jR*\u0010q\u001a\u0012\u0012\u0004\u0012\u00028\u00000kj\b\u0012\u0004\u0012\u00028\u0000`l8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\br\u0010\u000eR\u0016\u0010u\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bt\u0010j\u00a8\u0006x"}, d2={"Lkotlinx/serialization/internal/z2;", "", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "E", "tag", "Lkotlin/Function0;", "block", "d0", "(Ljava/lang/Object;Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "Z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "", "N", "(Ljava/lang/Object;)Z", "", "O", "(Ljava/lang/Object;)B", "", "W", "(Ljava/lang/Object;)S", "U", "(Ljava/lang/Object;)I", "", "V", "(Ljava/lang/Object;)J", "", "S", "(Ljava/lang/Object;)F", "", "Q", "(Ljava/lang/Object;)D", "", "P", "(Ljava/lang/Object;)C", "", "X", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "R", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "T", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/c;", "deserializer", "previousValue", "M", "(Lkotlinx/serialization/c;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "", "g", "()Ljava/lang/Void;", "A", "()Z", "H", "()B", "m", "()S", "u", "()I", "h", "()J", "y", "()F", "n", "()D", "o", "()C", "q", "()Ljava/lang/String;", "s", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "f", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "e", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "z", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "F", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "l", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/c;Ljava/lang/Object;)Ljava/lang/Object;", "j", "name", "Lkotlin/k0;", "c0", "(Ljava/lang/Object;)V", "b0", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "a0", "()Ljava/util/ArrayList;", "tagStack", "b", "flag", "Y", "currentTagOrNull", "<init>", "()V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
@SourceDebugExtension(value={"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,342:1\n1#2:343\n270#3,2:344\n*S KotlinDebug\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n*L\n287#1:344,2\n*E\n"})
public abstract class z2<Tag>
implements Decoder,
kotlinx.serialization.encoding.c {
    @NotNull
    private final ArrayList<Tag> a = new ArrayList();
    private boolean b;

    public static /* synthetic */ Object I(z2 z22, c c4, Object object) {
        return z2.K(z22, c4, object);
    }

    public static /* synthetic */ Object J(z2 z22, c c4, Object object) {
        return z2.L(z22, c4, object);
    }

    private static final Object K(z2 object, c c4, Object object2) {
        object = !c4.getDescriptor().b() && !object.D() ? object.g() : ((z2)object).M(c4, object2);
        return object;
    }

    private static final Object L(z2 z22, c c4, Object object) {
        return z22.M(c4, object);
    }

    private final <E> E d0(Tag object, a<? extends E> a4) {
        this.c0(object);
        object = a4.invoke();
        if (!this.b) {
            this.b0();
        }
        this.b = false;
        return (E)object;
    }

    public final boolean A() {
        return this.N(this.b0());
    }

    public final byte B(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.O(this.Z(serialDescriptor, n4));
    }

    public final boolean C(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.N(this.Z(serialDescriptor, n4));
    }

    public final short E(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.W(this.Z(serialDescriptor, n4));
    }

    public final double F(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.Q(this.Z(serialDescriptor, n4));
    }

    public abstract <T> T G(@NotNull c<? extends T> var1);

    public final byte H() {
        return this.O(this.b0());
    }

    protected <T> T M(@NotNull c<? extends T> c4, @Nullable T t3) {
        y.j(c4, (String)"deserializer");
        return this.G(c4);
    }

    protected abstract boolean N(Tag var1);

    protected abstract byte O(Tag var1);

    protected abstract char P(Tag var1);

    protected abstract double Q(Tag var1);

    protected abstract int R(Tag var1, @NotNull SerialDescriptor var2);

    protected abstract float S(Tag var1);

    @NotNull
    protected Decoder T(Tag Tag, @NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"inlineDescriptor");
        this.c0(Tag);
        return this;
    }

    protected abstract int U(Tag var1);

    protected abstract long V(Tag var1);

    protected abstract short W(Tag var1);

    @NotNull
    protected abstract String X(Tag var1);

    @Nullable
    protected final Tag Y() {
        return (Tag)t.E0(this.a);
    }

    protected abstract Tag Z(@NotNull SerialDescriptor var1, int var2);

    @NotNull
    public final ArrayList<Tag> a0() {
        return this.a;
    }

    protected final Tag b0() {
        ArrayList<Tag> arrayList = this.a;
        arrayList = arrayList.remove(t.o(arrayList));
        this.b = true;
        return (Tag)arrayList;
    }

    protected final void c0(Tag Tag) {
        this.a.add(Tag);
    }

    public final long e(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.V(this.Z(serialDescriptor, n4));
    }

    public final int f(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.U(this.Z(serialDescriptor, n4));
    }

    @Nullable
    public final Void g() {
        return null;
    }

    public final long h() {
        return this.V(this.b0());
    }

    @NotNull
    public final String i(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.X(this.Z(serialDescriptor, n4));
    }

    @Nullable
    public final <T> T j(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull c<? extends T> c4, @Nullable T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(c4, (String)"deserializer");
        return (T)this.d0(this.Z(serialDescriptor, n4), new y2(this, c4, t3));
    }

    @ExperimentalSerializationApi
    public boolean k() {
        return c.a.b((kotlinx.serialization.encoding.c)this);
    }

    @NotNull
    public final Decoder l(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.T(this.Z(serialDescriptor, n4), serialDescriptor.d(n4));
    }

    public final short m() {
        return this.W(this.b0());
    }

    public final double n() {
        return this.Q(this.b0());
    }

    public final char o() {
        return this.P(this.b0());
    }

    public final <T> T p(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull c<? extends T> c4, @Nullable T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(c4, (String)"deserializer");
        return (T)this.d0(this.Z(serialDescriptor, n4), new x2(this, c4, t3));
    }

    @NotNull
    public final String q() {
        return this.X(this.b0());
    }

    public final char r(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.P(this.Z(serialDescriptor, n4));
    }

    public final int s(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"enumDescriptor");
        return this.R(this.b0(), serialDescriptor);
    }

    public final int u() {
        return this.U(this.b0());
    }

    public int v(@NotNull SerialDescriptor serialDescriptor) {
        return c.a.a((kotlinx.serialization.encoding.c)this, (SerialDescriptor)serialDescriptor);
    }

    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.T(this.b0(), serialDescriptor);
    }

    public final float y() {
        return this.S(this.b0());
    }

    public final float z(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.S(this.Z(serialDescriptor, n4));
    }
}

