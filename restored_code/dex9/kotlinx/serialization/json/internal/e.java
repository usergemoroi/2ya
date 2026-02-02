/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.a0
 *  kotlin.c0
 *  kotlin.e0
 *  kotlin.h0
 *  kotlin.j
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.k0
 *  kotlin.r
 *  kotlinx.serialization.ExperimentalSerializationApi
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.d
 *  kotlinx.serialization.h
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.a
 *  kotlinx.serialization.json.f
 *  kotlinx.serialization.json.i
 *  kotlinx.serialization.json.internal.SuppressAnimalSniffer
 *  kotlinx.serialization.json.internal.d1
 *  kotlinx.serialization.json.internal.d1$a
 *  kotlinx.serialization.json.internal.f
 *  kotlinx.serialization.json.internal.g
 *  kotlinx.serialization.json.internal.k1
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.internal.p0
 *  kotlinx.serialization.json.internal.r1
 *  kotlinx.serialization.json.internal.t1
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.a0;
import kotlin.c0;
import kotlin.e0;
import kotlin.h0;
import kotlin.j;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.h;
import kotlinx.serialization.internal.o1;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import kotlinx.serialization.json.internal.b1;
import kotlinx.serialization.json.internal.d;
import kotlinx.serialization.json.internal.d1;
import kotlinx.serialization.json.internal.g;
import kotlinx.serialization.json.internal.k1;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.p0;
import kotlinx.serialization.json.internal.r1;
import kotlinx.serialization.json.internal.s0;
import kotlinx.serialization.json.internal.t1;
import kotlinx.serialization.json.internal.x0;
import kotlinx.serialization.json.internal.z0;
import kotlinx.serialization.json.p;
import kotlinx.serialization.json.r;
import kotlinx.serialization.json.u;
import kotlinx.serialization.modules.c;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\u0005\n\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010X\u001a\u00020T\u0012\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140Y\u00a2\u0006\u0004\bj\u0010kJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H&\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020+H\u0014\u00a2\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020.H\u0014\u00a2\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u000201H\u0014\u00a2\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u000204H\u0014\u00a2\u0006\u0004\b5\u00106J+\u0010:\u001a\u00020\u0014\"\u0004\b\u0000\u001072\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000082\u0006\u0010(\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020<H\u0014\u00a2\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0017H\u0014\u00a2\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020AH\u0014\u00a2\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\bD\u0010EJ'\u0010H\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020J2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0014\u00a2\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020J2\u0006\u0010\r\u001a\u00020\bH\u0016\u00a2\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020O2\u0006\u0010\r\u001a\u00020\bH\u0016\u00a2\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\bH\u0014\u00a2\u0006\u0004\bR\u0010SR\u0017\u0010X\u001a\u00020T8\u0006\u00a2\u0006\f\n\u0004\bP\u0010U\u001a\u0004\bV\u0010WR&\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140Y8\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8\u0004X\u0085\u0004\u00a2\u0006\u0006\n\u0004\bV\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bd\u0010bR\u0011\u0010i\u001a\u00020f8F\u00a2\u0006\u0006\u001a\u0004\bg\u0010h\u0082\u0001\u0003lmn\u00a8\u0006o"}, d2={"Lkotlinx/serialization/json/internal/e;", "Lkotlinx/serialization/internal/o1;", "Lkotlinx/serialization/json/r;", "", "tag", "kotlinx/serialization/json/internal/e$b", "v0", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/e$b;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "inlineDescriptor", "kotlinx/serialization/json/internal/e$a", "u0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/e$a;", "descriptor", "", "index", "b0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlin/k0;", "r", "(Lkotlinx/serialization/json/JsonElement;)V", "", "q", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "parentName", "childName", "a0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "E", "()V", "B", "p0", "(Ljava/lang/String;)V", "value", "n0", "(Ljava/lang/String;I)V", "", "h0", "(Ljava/lang/String;B)V", "", "q0", "(Ljava/lang/String;S)V", "", "o0", "(Ljava/lang/String;J)V", "", "l0", "(Ljava/lang/String;F)V", "T", "Lkotlinx/serialization/o;", "serializer", "e", "(Lkotlinx/serialization/o;Ljava/lang/Object;)V", "", "j0", "(Ljava/lang/String;D)V", "g0", "(Ljava/lang/String;Z)V", "", "i0", "(Ljava/lang/String;C)V", "r0", "(Ljava/lang/String;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "k0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "Lkotlinx/serialization/encoding/Encoder;", "m0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/d;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/d;", "U", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/b;", "Lkotlinx/serialization/json/b;", "d", "()Lkotlinx/serialization/json/b;", "json", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/l;", "t0", "()Lkotlin/jvm/functions/l;", "nodeConsumer", "Lkotlinx/serialization/json/f;", "Lkotlinx/serialization/json/f;", "configuration", "Ljava/lang/String;", "polymorphicDiscriminator", "f", "polymorphicSerialName", "Lkotlinx/serialization/modules/c;", "a", "()Lkotlinx/serialization/modules/c;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/b;Lkotlin/jvm/functions/l;)V", "Lkotlinx/serialization/json/internal/s0;", "Lkotlinx/serialization/json/internal/x0;", "Lkotlinx/serialization/json/internal/z0;", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@ExperimentalSerializationApi
@SourceDebugExtension(value={"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,280:1\n21#2,12:281\n35#2,13:294\n1#3:293\n36#4,9:307\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n84#1:281,12\n84#1:294,13\n84#1:293\n154#1:307,9\n*E\n"})
abstract class e
extends o1
implements r {
    @NotNull
    private final kotlinx.serialization.json.b b;
    @NotNull
    private final l<JsonElement, k0> c;
    @JvmField
    @NotNull
    protected final f d;
    @Nullable
    private String e;
    @Nullable
    private String f;

    private e(kotlinx.serialization.json.b b4, l<? super JsonElement, k0> l4) {
        this.b = b4;
        this.c = l4;
        this.d = b4.e();
    }

    public /* synthetic */ e(kotlinx.serialization.json.b b4, l l4, kotlin.jvm.internal.p p4) {
        this(b4, l4);
    }

    public static /* synthetic */ k0 e0(e e4, JsonElement jsonElement) {
        return kotlinx.serialization.json.internal.e.f0(e4, jsonElement);
    }

    private static final k0 f0(e e4, JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"node");
        e4.w0((String)e4.V(), jsonElement);
        return k0.a;
    }

    private final a u0(String string, SerialDescriptor serialDescriptor) {
        return new kotlinx.serialization.encoding.b(this, string, serialDescriptor){
            final e a;
            final String b;
            final SerialDescriptor c;
            {
                this.a = e4;
                this.b = string;
                this.c = serialDescriptor;
            }

            public c a() {
                return this.a.d().a();
            }

            @Override
            public void v(String string) {
                y.j((Object)string, (String)"value");
                this.a.w0(this.b, new u(string, false, this.c));
            }
        };
    }

    @SuppressAnimalSniffer
    private final b v0(String string) {
        return new kotlinx.serialization.encoding.b(this, string){
            private final c a;
            final e b;
            final String c;
            {
                this.b = e4;
                this.c = string;
                this.a = e4.d().a();
            }

            @Override
            public void A(long l4) {
                this.K(g.a((long)e0.c((long)l4)));
            }

            public final void K(String string) {
                y.j((Object)string, (String)"s");
                this.b.w0(this.c, new u(string, false, null, 4, null));
            }

            public c a() {
                return this.a;
            }

            @Override
            public void f(byte by) {
                this.K(a0.f((byte)a0.c((byte)by)));
            }

            @Override
            public void k(short s3) {
                this.K(h0.f((short)h0.c((short)s3)));
            }

            @Override
            public void s(int n4) {
                this.K(kotlinx.serialization.json.internal.f.a((int)c0.c((int)n4)));
            }
        };
    }

    public void B() {
        String string = (String)this.W();
        if (string == null) {
            this.c.invoke(JsonNull.INSTANCE);
            return;
        }
        this.p0(string);
    }

    public void E() {
    }

    @Override
    protected void U(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.c.invoke(this.s0());
    }

    @NotNull
    public final c a() {
        return this.b.a();
    }

    @Override
    @NotNull
    protected String a0(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"parentName");
        y.j((Object)string2, (String)"childName");
        return string2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    public kotlinx.serialization.encoding.d b(@NotNull SerialDescriptor serialDescriptor) {
        String string;
        Object object;
        y.j((Object)serialDescriptor, (String)"descriptor");
        Object object2 = this.W() == null ? this.c : new d(this);
        kotlinx.serialization.descriptors.l l4 = serialDescriptor.getKind();
        if (!y.e((Object)l4, (Object)((Object)m.b.a)) && !(l4 instanceof kotlinx.serialization.descriptors.d)) {
            if (y.e((Object)l4, (Object)((Object)m.c.a))) {
                object = this.b;
                SerialDescriptor serialDescriptor2 = t1.a((SerialDescriptor)serialDescriptor.d(0), (c)((kotlinx.serialization.json.b)object).a());
                string = serialDescriptor2.getKind();
                if (!(string instanceof kotlinx.serialization.descriptors.e) && !y.e((Object)string, (Object)((Object)l.b.a))) {
                    if (!((kotlinx.serialization.json.b)object).e().c()) throw n0.d((SerialDescriptor)serialDescriptor2);
                    object2 = new z0(this.b, (l<? super JsonElement, k0>)object2);
                } else {
                    object2 = new b1(this.b, (l<? super JsonElement, k0>)object2);
                }
            } else {
                object2 = new x0(this.b, (l<? super JsonElement, k0>)object2);
            }
        } else {
            object2 = new z0(this.b, (l<? super JsonElement, k0>)object2);
        }
        String string2 = this.e;
        if (string2 == null) return object2;
        if (object2 instanceof b1) {
            void var3_8;
            object = (b1)object2;
            ((b1)object).w0("key", i.c((String)string2));
            String string3 = string = this.f;
            if (string == null) {
                String string4 = serialDescriptor.h();
            }
            ((b1)object).w0("value", i.c((String)var3_8));
        } else {
            void var3_11;
            String string5 = string = this.f;
            if (string == null) {
                String string6 = serialDescriptor.h();
            }
            ((e)object2).w0(string2, i.c((String)var3_11));
        }
        this.e = null;
        this.f = null;
        return object2;
    }

    @Override
    @NotNull
    protected String b0(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return p0.h((SerialDescriptor)serialDescriptor, (kotlinx.serialization.json.b)this.b, (int)n4);
    }

    @Override
    @NotNull
    public final kotlinx.serialization.json.b d() {
        return this.b;
    }

    @Override
    public <T> void e(@NotNull o<? super T> object, T t3) {
        block6: {
            Object object2;
            boolean bl;
            block12: {
                block9: {
                    block11: {
                        block10: {
                            block8: {
                                block7: {
                                    block5: {
                                        y.j(object, (String)"serializer");
                                        if (this.W() != null || !r1.b((SerialDescriptor)t1.a((SerialDescriptor)object.getDescriptor(), (c)this.a()))) break block5;
                                        new s0(this.b, this.c).e((o<? super T>)object, t3);
                                        break block6;
                                    }
                                    if (!this.d().e().p()) break block7;
                                    object.serialize((Encoder)this, t3);
                                    break block6;
                                }
                                bl = object instanceof kotlinx.serialization.internal.b;
                                if (!bl) break block8;
                                if (this.d().e().f() == kotlinx.serialization.json.a.c) break block9;
                                break block10;
                            }
                            object2 = this.d().e().f();
                            int n4 = d1.a.a[object2.ordinal()];
                            if (n4 == 1 || n4 == 2) break block9;
                            if (n4 != 3) break block11;
                            object2 = object.getDescriptor().getKind();
                            if (!y.e((Object)object2, (Object)((Object)m.a.a)) && !y.e((Object)object2, (Object)((Object)m.d.a))) break block9;
                        }
                        object2 = d1.c((SerialDescriptor)object.getDescriptor(), (kotlinx.serialization.json.b)this.d());
                        break block12;
                    }
                    throw new kotlin.r();
                }
                object2 = null;
            }
            kotlinx.serialization.internal.b b4 = object;
            if (bl) {
                b4 = (kotlinx.serialization.internal.b)object;
                if (t3 != null) {
                    b4 = h.b((kotlinx.serialization.internal.b)b4, (Encoder)this, t3);
                    if (object2 != null) {
                        d1.a((o)object, (o)b4, (String)object2);
                    }
                    d1.b((kotlinx.serialization.descriptors.l)b4.getDescriptor().getKind());
                    y.h((Object)b4, (String)"null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Value for serializer ");
                    ((StringBuilder)object).append(b4.getDescriptor());
                    ((StringBuilder)object).append(" should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                    throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                }
            }
            if (object2 != null) {
                object = b4.getDescriptor().h();
                this.e = object2;
                this.f = object;
            }
            b4.serialize(this, t3);
        }
    }

    protected void g0(@NotNull String string, boolean bl) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.a((Boolean)bl));
    }

    @Override
    @NotNull
    public Encoder h(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.W() != null) {
            if (this.e != null) {
                this.f = serialDescriptor.h();
            }
            serialDescriptor = super.h(serialDescriptor);
        } else {
            serialDescriptor = new s0(this.b, this.c).h(serialDescriptor);
        }
        return serialDescriptor;
    }

    protected void h0(@NotNull String string, byte by) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.b((Number)by));
    }

    protected void i0(@NotNull String string, char c4) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.c((String)String.valueOf(c4)));
    }

    protected void j0(@NotNull String string, double d4) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.b((Number)d4));
        if (!this.d.b() && (Double.isInfinite(d4) || Double.isNaN(d4))) {
            throw n0.c((Number)d4, (String)string, (String)this.s0().toString());
        }
    }

    protected void k0(@NotNull String string, @NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)string, (String)"tag");
        y.j((Object)serialDescriptor, (String)"enumDescriptor");
        this.w0(string, i.c((String)serialDescriptor.f(n4)));
    }

    protected void l0(@NotNull String string, float f4) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.b((Number)Float.valueOf(f4)));
        if (!this.d.b() && (Float.isInfinite(f4) || Float.isNaN(f4))) {
            throw n0.c((Number)Float.valueOf(f4), (String)string, (String)this.s0().toString());
        }
    }

    @NotNull
    protected Encoder m0(@NotNull String object, @NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)object, (String)"tag");
        y.j((Object)serialDescriptor, (String)"inlineDescriptor");
        object = k1.b((SerialDescriptor)serialDescriptor) ? this.v0((String)object) : (k1.a((SerialDescriptor)serialDescriptor) ? this.u0((String)object, serialDescriptor) : super.P(object, serialDescriptor));
        return object;
    }

    protected void n0(@NotNull String string, int n4) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.b((Number)n4));
    }

    protected void o0(@NotNull String string, long l4) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.b((Number)l4));
    }

    protected void p0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        this.w0(string, JsonNull.INSTANCE);
    }

    public boolean q(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.d.i();
    }

    protected void q0(@NotNull String string, short s3) {
        y.j((Object)string, (String)"tag");
        this.w0(string, i.b((Number)s3));
    }

    @Override
    public void r(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        if (this.e != null && !(jsonElement instanceof JsonObject)) {
            d1.d((String)this.f, (JsonElement)jsonElement);
            throw new j();
        }
        this.e(p.a, jsonElement);
    }

    protected void r0(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"tag");
        y.j((Object)string2, (String)"value");
        this.w0(string, i.c((String)string2));
    }

    @NotNull
    public abstract JsonElement s0();

    @NotNull
    protected final l<JsonElement, k0> t0() {
        return this.c;
    }

    public abstract void w0(@NotNull String var1, @NotNull JsonElement var2);
}

