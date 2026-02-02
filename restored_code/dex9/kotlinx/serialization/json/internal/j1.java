/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.r
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.d
 *  kotlinx.serialization.h
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.a
 *  kotlinx.serialization.json.f
 *  kotlinx.serialization.json.internal.c0
 *  kotlinx.serialization.json.internal.d1
 *  kotlinx.serialization.json.internal.d1$a
 *  kotlinx.serialization.json.internal.g0
 *  kotlinx.serialization.json.internal.j1$a
 *  kotlinx.serialization.json.internal.k1
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.internal.p0
 *  kotlinx.serialization.json.internal.s
 *  kotlinx.serialization.json.internal.s1
 *  kotlinx.serialization.json.internal.t1
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.h;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.internal.a0;
import kotlinx.serialization.json.internal.c0;
import kotlinx.serialization.json.internal.d1;
import kotlinx.serialization.json.internal.g0;
import kotlinx.serialization.json.internal.j1;
import kotlinx.serialization.json.internal.k1;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.p0;
import kotlinx.serialization.json.internal.s;
import kotlinx.serialization.json.internal.s1;
import kotlinx.serialization.json.internal.t;
import kotlinx.serialization.json.internal.t1;
import kotlinx.serialization.json.p;
import kotlinx.serialization.json.r;
import kotlinx.serialization.modules.c;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010K\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020L\u0012\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010O\u00a2\u0006\u0004\b_\u0010`B1\b\u0010\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010K\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020L\u0012\u000e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010O\u00a2\u0006\u0004\b_\u0010cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u001f\u0010\u0013JA\u0010!\u001a\u00020\u0006\"\b\b\u0000\u0010\u0014*\u00020 2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020*H\u0016\u00a2\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020-H\u0016\u00a2\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u000202H\u0016\u00a2\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u000205H\u0016\u00a2\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u000208H\u0016\u00a2\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020;H\u0016\u00a2\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010K\u001a\u00020G8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010MR\u001e\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010PR\u001a\u0010U\u001a\u00020R8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\bD\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010WR\u0016\u0010Z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010[\u00a8\u0006d"}, d2={"Lkotlinx/serialization/json/internal/j1;", "Lkotlinx/serialization/json/r;", "Lkotlinx/serialization/encoding/b;", "", "discriminator", "serialName", "Lkotlin/k0;", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "r", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "q", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "T", "Lkotlinx/serialization/o;", "serializer", "value", "e", "(Lkotlinx/serialization/o;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/d;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/d;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "H", "", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/o;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "h", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "B", "()V", "l", "(Z)V", "", "f", "(B)V", "", "k", "(S)V", "s", "(I)V", "", "A", "(J)V", "", "m", "(F)V", "", "x", "(D)V", "", "D", "(C)V", "v", "(Ljava/lang/String;)V", "enumDescriptor", "g", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "Lkotlinx/serialization/json/internal/s;", "a", "Lkotlinx/serialization/json/internal/s;", "composer", "Lkotlinx/serialization/json/b;", "Lkotlinx/serialization/json/b;", "d", "()Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/internal/s1;", "Lkotlinx/serialization/json/internal/s1;", "mode", "", "[Lkotlinx/serialization/json/r;", "modeReuseCache", "Lkotlinx/serialization/modules/c;", "Lkotlinx/serialization/modules/c;", "()Lkotlinx/serialization/modules/c;", "serializersModule", "Lkotlinx/serialization/json/f;", "Lkotlinx/serialization/json/f;", "configuration", "Z", "forceQuoting", "Ljava/lang/String;", "polymorphicDiscriminator", "i", "polymorphicSerialName", "<init>", "(Lkotlinx/serialization/json/internal/s;Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/internal/s1;[Lkotlinx/serialization/json/r;)V", "Lkotlinx/serialization/json/internal/g0;", "output", "(Lkotlinx/serialization/json/internal/g0;Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/internal/s1;[Lkotlinx/serialization/json/r;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:259\n178#1,2:261\n21#2,12:233\n35#2,13:246\n1#3:245\n1#3:263\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:259,2\n169#1:261,2\n68#1:233,12\n68#1:246,13\n68#1:245\n*E\n"})
public final class j1
extends kotlinx.serialization.encoding.b
implements r {
    @NotNull
    private final s a;
    @NotNull
    private final b b;
    @NotNull
    private final s1 c;
    @Nullable
    private final r[] d;
    @NotNull
    private final c e;
    @NotNull
    private final f f;
    private boolean g;
    @Nullable
    private String h;
    @Nullable
    private String i;

    public j1(@NotNull g0 g02, @NotNull b b4, @NotNull s1 s12, @NotNull r[] rArray) {
        y.j((Object)g02, (String)"output");
        y.j((Object)b4, (String)"json");
        y.j((Object)s12, (String)"mode");
        y.j((Object)rArray, (String)"modeReuseCache");
        this(c0.a((g0)g02, (b)b4), b4, s12, rArray);
    }

    public j1(@NotNull s object, @NotNull b b4, @NotNull s1 s12, @Nullable r[] rArray) {
        y.j((Object)object, (String)"composer");
        y.j((Object)b4, (String)"json");
        y.j((Object)s12, (String)"mode");
        this.a = object;
        this.b = b4;
        this.c = s12;
        this.d = rArray;
        this.e = this.d().a();
        this.f = this.d().e();
        int n4 = s12.ordinal();
        if (rArray != null && ((object = rArray[n4]) != null || object != this)) {
            rArray[n4] = this;
        }
    }

    private final void K(String string, String string2) {
        this.a.c();
        this.v(string);
        this.a.f(':');
        this.a.p();
        this.v(string2);
    }

    @Override
    public void A(long l4) {
        if (this.g) {
            this.v(String.valueOf(l4));
        } else {
            this.a.j(l4);
        }
    }

    @Override
    public void B() {
        this.a.k("null");
    }

    @Override
    public void D(char c4) {
        this.v(String.valueOf(c4));
    }

    @Override
    public boolean H(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        s1 s12 = this.c;
        int n5 = kotlinx.serialization.json.internal.j1$a.a[s12.ordinal()];
        if (n5 != 1) {
            boolean bl = false;
            if (n5 != 2) {
                if (n5 != 3) {
                    if (!this.a.a()) {
                        this.a.f(',');
                    }
                    this.a.c();
                    this.v(p0.h((SerialDescriptor)serialDescriptor, (b)this.d(), (int)n4));
                    this.a.f(':');
                    this.a.p();
                } else {
                    if (n4 == 0) {
                        this.g = true;
                    }
                    if (n4 == 1) {
                        this.a.f(',');
                        this.a.p();
                        this.g = false;
                    }
                }
            } else if (!this.a.a()) {
                if (n4 % 2 == 0) {
                    this.a.f(',');
                    this.a.c();
                    bl = true;
                } else {
                    this.a.f(':');
                    this.a.p();
                }
                this.g = bl;
            } else {
                this.g = true;
                this.a.c();
            }
        } else {
            if (!this.a.a()) {
                this.a.f(',');
            }
            this.a.c();
        }
        return true;
    }

    @NotNull
    public c a() {
        return this.e;
    }

    @Override
    @NotNull
    public d b(@NotNull SerialDescriptor object) {
        String string;
        y.j((Object)object, (String)"descriptor");
        s1 s12 = t1.b((b)this.d(), (SerialDescriptor)object);
        char c4 = s12.c;
        if (c4 != '\u0000') {
            this.a.f(c4);
            this.a.b();
        }
        if ((string = this.h) != null) {
            String string2;
            String string3 = string2 = this.i;
            if (string2 == null) {
                string3 = object.h();
            }
            this.K(string, string3);
            this.h = null;
            this.i = null;
        }
        if (this.c == s12) {
            return this;
        }
        object = this.d;
        if (object == null || (object = object[s12.ordinal()]) == null) {
            object = new j1(this.a, this.d(), s12, this.d);
        }
        return object;
    }

    @Override
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.c.d != '\u0000') {
            this.a.q();
            this.a.d();
            this.a.f(this.c.d);
        }
    }

    @Override
    @NotNull
    public b d() {
        return this.b;
    }

    @Override
    public <T> void e(@NotNull o<? super T> object, T t3) {
        block6: {
            Object object2;
            boolean bl;
            block11: {
                block8: {
                    block10: {
                        block9: {
                            block7: {
                                block5: {
                                    y.j(object, (String)"serializer");
                                    if (!this.d().e().p()) break block5;
                                    object.serialize((Encoder)this, t3);
                                    break block6;
                                }
                                bl = object instanceof kotlinx.serialization.internal.b;
                                if (!bl) break block7;
                                if (this.d().e().f() == kotlinx.serialization.json.a.c) break block8;
                                break block9;
                            }
                            object2 = this.d().e().f();
                            int n4 = d1.a.a[object2.ordinal()];
                            if (n4 == 1 || n4 == 2) break block8;
                            if (n4 != 3) break block10;
                            object2 = object.getDescriptor().getKind();
                            if (!y.e((Object)object2, (Object)((Object)m.a.a)) && !y.e((Object)object2, (Object)((Object)m.d.a))) break block8;
                        }
                        object2 = d1.c((SerialDescriptor)object.getDescriptor(), (b)this.d());
                        break block11;
                    }
                    throw new kotlin.r();
                }
                object2 = null;
            }
            kotlinx.serialization.internal.b b4 = object;
            if (bl) {
                b4 = (kotlinx.serialization.internal.b)object;
                if (t3 != null) {
                    b4 = kotlinx.serialization.h.b((kotlinx.serialization.internal.b)b4, (Encoder)this, t3);
                    if (object2 != null) {
                        d1.a((o)object, (o)b4, (String)object2);
                    }
                    d1.b((l)b4.getDescriptor().getKind());
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
                this.h = object2;
                this.i = object;
            }
            b4.serialize(this, t3);
        }
    }

    @Override
    public void f(byte by) {
        if (this.g) {
            this.v(String.valueOf(by));
        } else {
            this.a.e(by);
        }
    }

    @Override
    public void g(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"enumDescriptor");
        this.v(serialDescriptor.f(n4));
    }

    @Override
    @NotNull
    public Encoder h(@NotNull SerialDescriptor object) {
        y.j((Object)object, (String)"descriptor");
        if (k1.b((SerialDescriptor)object)) {
            object = this.a;
            if (!(object instanceof a0)) {
                object = new a0(object.a, this.g);
            }
            object = new j1((s)object, this.d(), this.c, null);
        } else if (k1.a((SerialDescriptor)object)) {
            object = this.a;
            if (!(object instanceof t)) {
                object = new t(object.a, this.g);
            }
            object = new j1((s)object, this.d(), this.c, null);
        } else if (this.h != null) {
            this.i = object.h();
            object = this;
        } else {
            object = super.h((SerialDescriptor)object);
        }
        return object;
    }

    @Override
    public void k(short s3) {
        if (this.g) {
            this.v(String.valueOf(s3));
        } else {
            this.a.l(s3);
        }
    }

    @Override
    public void l(boolean bl) {
        if (this.g) {
            this.v(String.valueOf(bl));
        } else {
            this.a.m(bl);
        }
    }

    @Override
    public void m(float f4) {
        if (this.g) {
            this.v(String.valueOf(f4));
        } else {
            this.a.h(f4);
        }
        if (!this.f.b() && (Float.isInfinite(f4) || Float.isNaN(f4))) {
            throw n0.b((Number)Float.valueOf(f4), (String)this.a.a.toString());
        }
    }

    @Override
    public boolean q(@NotNull SerialDescriptor serialDescriptor, int n4) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        return this.f.i();
    }

    @Override
    public void r(@NotNull JsonElement jsonElement) {
        y.j((Object)jsonElement, (String)"element");
        if (this.h != null && !(jsonElement instanceof JsonObject)) {
            d1.d((String)this.i, (JsonElement)jsonElement);
            throw new j();
        }
        this.e(p.a, jsonElement);
    }

    @Override
    public void s(int n4) {
        if (this.g) {
            this.v(String.valueOf(n4));
        } else {
            this.a.i(n4);
        }
    }

    @Override
    public void v(@NotNull String string) {
        y.j((Object)string, (String)"value");
        this.a.n(string);
    }

    @Override
    public void x(double d4) {
        if (this.g) {
            this.v(String.valueOf(d4));
        } else {
            this.a.g(d4);
        }
        if (!this.f.b() && (Double.isInfinite(d4) || Double.isNaN(d4))) {
            throw n0.b((Number)d4, (String)this.a.a.toString());
        }
    }

    @Override
    public <T> void y(@NotNull SerialDescriptor serialDescriptor, int n4, @NotNull o<? super T> o4, @Nullable T t3) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        y.j(o4, (String)"serializer");
        if (t3 != null || this.f.j()) {
            super.y(serialDescriptor, n4, o4, t3);
        }
    }
}

