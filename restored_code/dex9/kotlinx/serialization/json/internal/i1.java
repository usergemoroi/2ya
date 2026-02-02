/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.h
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.f
 *  kotlinx.serialization.json.i
 *  kotlinx.serialization.json.internal.a
 *  kotlinx.serialization.json.internal.c1
 *  kotlinx.serialization.json.internal.d1
 *  kotlinx.serialization.json.internal.i1$a
 *  kotlinx.serialization.json.internal.i1$b
 *  kotlinx.serialization.json.internal.k0
 *  kotlinx.serialization.json.internal.k1
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.internal.p0
 *  kotlinx.serialization.json.internal.p1
 *  kotlinx.serialization.json.internal.s1
 *  kotlinx.serialization.json.internal.t1
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import kotlinx.serialization.c;
import kotlinx.serialization.d;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.h;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.g;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.internal.c1;
import kotlinx.serialization.json.internal.d1;
import kotlinx.serialization.json.internal.i0;
import kotlinx.serialization.json.internal.i1;
import kotlinx.serialization.json.internal.k0;
import kotlinx.serialization.json.internal.k1;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.p0;
import kotlinx.serialization.json.internal.p1;
import kotlinx.serialization.json.internal.s1;
import kotlinx.serialization.json.internal.t1;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001OB1\u0012\u0006\u0010S\u001a\u00020N\u0012\u0006\u0010V\u001a\u00020T\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\bj\u0010kJ\u001d\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!J#\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b*\u0010\u000eJ\u000f\u0010+\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016\u00a2\u0006\u0004\b.\u0010/J=\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\u00100\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b3\u0010\u0018J\u000f\u00104\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b4\u0010,J\u000f\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016\u00a2\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b;\u0010\u0013J\u000f\u0010=\u001a\u00020<H\u0016\u00a2\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016\u00a2\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\bH\u0010\u001eJ\u0017\u0010J\u001a\u00020I2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\nH\u0016\u00a2\u0006\u0004\bM\u0010\u0018R\u0017\u0010S\u001a\u00020N8\u0006\u00a2\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010UR\u0014\u0010Y\u001a\u00020W8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010XR\u001a\u0010]\u001a\u00020Z8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bQ\u0010[\u001a\u0004\bO\u0010\\R\u0016\u0010`\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010h\u00a8\u0006l"}, d2={"Lkotlinx/serialization/json/internal/i1;", "Lkotlinx/serialization/json/g;", "", "Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/json/internal/i1$a;", "", "unknownKey", "", "S", "(Lkotlinx/serialization/json/internal/i1$a;Ljava/lang/String;)Z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/k0;", "R", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "K", "()V", "", "N", "()I", "index", "L", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "O", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "key", "Q", "(Ljava/lang/String;)Z", "M", "P", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "t", "()Lkotlinx/serialization/json/JsonElement;", "T", "Lkotlinx/serialization/c;", "deserializer", "G", "(Lkotlinx/serialization/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;", "c", "D", "()Z", "", "g", "()Ljava/lang/Void;", "previousValue", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/c;Ljava/lang/Object;)Ljava/lang/Object;", "w", "A", "", "H", "()B", "", "m", "()S", "u", "", "h", "()J", "", "y", "()F", "", "n", "()D", "", "o", "()C", "q", "Lkotlinx/serialization/encoding/Decoder;", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "enumDescriptor", "s", "Lkotlinx/serialization/json/b;", "a", "Lkotlinx/serialization/json/b;", "d", "()Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/internal/s1;", "Lkotlinx/serialization/json/internal/s1;", "mode", "Lkotlinx/serialization/json/internal/a;", "Lkotlinx/serialization/json/internal/a;", "lexer", "Lkotlinx/serialization/modules/c;", "Lkotlinx/serialization/modules/c;", "()Lkotlinx/serialization/modules/c;", "serializersModule", "e", "I", "currentIndex", "f", "Lkotlinx/serialization/json/internal/i1$a;", "discriminatorHolder", "Lkotlinx/serialization/json/f;", "Lkotlinx/serialization/json/f;", "configuration", "Lkotlinx/serialization/json/internal/k0;", "Lkotlinx/serialization/json/internal/k0;", "elementMarker", "<init>", "(Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/internal/s1;Lkotlinx/serialization/json/internal/a;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/i1$a;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n76#2,6:392\n82#2,9:406\n271#3,8:398\n513#4,3:415\n513#4,3:418\n133#5,18:421\n384#6,5:439\n384#6,5:444\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:392,6\n75#1:406,9\n75#1:398,8\n202#1:415,3\n203#1:418,3\n215#1:421,18\n308#1:439,5\n315#1:444,5\n*E\n"})
public class i1
extends kotlinx.serialization.encoding.a
implements g {
    @NotNull
    private final kotlinx.serialization.json.b a;
    @NotNull
    private final s1 b;
    @JvmField
    @NotNull
    public final kotlinx.serialization.json.internal.a c;
    @NotNull
    private final kotlinx.serialization.modules.c d;
    private int e;
    @Nullable
    private a f;
    @NotNull
    private final f g;
    @Nullable
    private final k0 h;

    public i1(@NotNull kotlinx.serialization.json.b b4, @NotNull s1 s12, @NotNull kotlinx.serialization.json.internal.a a4, @NotNull SerialDescriptor serialDescriptor, @Nullable a a5) {
        y.j((Object)b4, (String)"json");
        y.j((Object)s12, (String)"mode");
        y.j((Object)a4, (String)"lexer");
        y.j((Object)serialDescriptor, (String)"descriptor");
        this.a = b4;
        this.b = s12;
        this.c = a4;
        this.d = b4.a();
        this.e = -1;
        this.f = a5;
        b4 = b4.e();
        this.g = b4;
        b4 = b4.j() ? null : new k0(serialDescriptor);
        this.h = b4;
    }

    private final void K() {
        if (this.c.G() != 4) {
            return;
        }
        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)this.c, (String)"Unexpected leading comma", (int)0, null, (int)6, null);
        throw new j();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean L(SerialDescriptor serialDescriptor, int n4) {
        boolean bl;
        block6: {
            block5: {
                String string;
                kotlinx.serialization.json.b b4 = this.a;
                boolean bl2 = serialDescriptor.i(n4);
                serialDescriptor = serialDescriptor.d(n4);
                bl = true;
                if (bl2 && !serialDescriptor.b() && this.c.O(true)) {
                    return bl;
                }
                if (!y.e((Object)serialDescriptor.getKind(), (Object)((Object)l.b.a))) return false;
                if (serialDescriptor.b()) {
                    if (this.c.O(false)) return false;
                }
                if ((string = this.c.H(this.g.q())) == null) break block5;
                int n5 = p0.i((SerialDescriptor)serialDescriptor, (kotlinx.serialization.json.b)b4, (String)string);
                n4 = !b4.e().j() && serialDescriptor.b() ? 1 : 0;
                if (n5 != -3) return false;
                if (bl2 || n4 != 0) break block6;
            }
            return false;
        }
        this.c.o();
        return bl;
    }

    private final int M() {
        int n4;
        boolean bl = this.c.N();
        boolean bl2 = this.c.e();
        int n5 = -1;
        if (bl2) {
            n4 = this.e;
            if (n4 != -1 && !bl) {
                kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)this.c, (String)"Expected end of the array or comma", (int)0, null, (int)6, null);
                throw new j();
            }
            this.e = ++n4;
        } else {
            n4 = n5;
            if (bl) {
                if (this.a.e().d()) {
                    n4 = n5;
                } else {
                    n0.h((kotlinx.serialization.json.internal.a)this.c, (String)"array");
                    throw new j();
                }
            }
        }
        return n4;
    }

    private final int N() {
        int n4 = this.e;
        boolean bl = false;
        int n5 = n4 % 2 != 0 ? 1 : 0;
        int n6 = -1;
        if (n5 != 0) {
            if (n4 != -1) {
                bl = this.c.N();
            }
        } else {
            this.c.l(':');
        }
        if (this.c.e()) {
            if (n5 != 0) {
                if (this.e == -1) {
                    kotlinx.serialization.json.internal.a a4 = this.c;
                    n5 = a4.a;
                    if (!(bl ^ true)) {
                        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)"Unexpected leading comma", (int)n5, null, (int)4, null);
                        throw new j();
                    }
                } else {
                    kotlinx.serialization.json.internal.a a5 = this.c;
                    n5 = a5.a;
                    if (!bl) {
                        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a5, (String)"Expected comma after the key-value pair", (int)n5, null, (int)4, null);
                        throw new j();
                    }
                }
            }
            this.e = n5 = this.e + 1;
        } else {
            n5 = n6;
            if (bl) {
                if (this.a.e().d()) {
                    n5 = n6;
                } else {
                    n0.i((kotlinx.serialization.json.internal.a)this.c, null, (int)1, null);
                    throw new j();
                }
            }
        }
        return n5;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int O(SerialDescriptor serialDescriptor) {
        boolean bl = this.c.N();
        while (true) {
            String string;
            int n4;
            block5: {
                boolean bl2 = this.c.e();
                n4 = 1;
                if (!bl2) break;
                string = this.P();
                this.c.l(':');
                int n5 = p0.i((SerialDescriptor)serialDescriptor, (kotlinx.serialization.json.b)this.a, (String)string);
                if (n5 != -3) {
                    if (this.g.g() && this.L(serialDescriptor, n5)) {
                        bl = this.c.N();
                        n4 = 0;
                        break block5;
                    } else {
                        serialDescriptor = this.h;
                        if (serialDescriptor == null) return n5;
                        serialDescriptor.c(n5);
                        return n5;
                    }
                }
                bl = false;
            }
            if (n4 == 0) continue;
            bl = this.Q(string);
        }
        if (bl && !this.a.e().d()) {
            n0.i((kotlinx.serialization.json.internal.a)this.c, null, (int)1, null);
            throw new j();
        }
        serialDescriptor = this.h;
        if (serialDescriptor == null) return -1;
        return serialDescriptor.d();
    }

    private final String P() {
        String string = this.g.q() ? this.c.r() : this.c.i();
        return string;
    }

    private final boolean Q(String string) {
        if (!this.g.k() && !this.S(this.f, string)) {
            this.c.A(string);
        } else {
            this.c.J(this.g.q());
        }
        return this.c.N();
    }

    private final void R(SerialDescriptor serialDescriptor) {
        while (this.w(serialDescriptor) != -1) {
        }
    }

    private final boolean S(a a4, String string) {
        if (a4 == null) {
            return false;
        }
        if (y.e((Object)a4.a, (Object)string)) {
            a4.a = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean A() {
        return this.c.g();
    }

    @Override
    public boolean D() {
        boolean bl;
        block5: {
            boolean bl2;
            block4: {
                k0 k02 = this.h;
                bl2 = false;
                if (k02 == null) break block4;
                bl = bl2;
                if (k02.b()) break block5;
            }
            bl = bl2;
            if (!kotlinx.serialization.json.internal.a.P((kotlinx.serialization.json.internal.a)this.c, (boolean)false, (int)1, null)) {
                bl = true;
            }
        }
        return bl;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> T G(@NotNull c<? extends T> var1_1) {
        block11: {
            block10: {
                y.j(var1_1, (String)"deserializer");
                try {
                    block12: {
                        if (!(var1_1 instanceof kotlinx.serialization.internal.b) || this.a.e().p()) break block12;
                        var2_5 /* !! */  = d1.c((SerialDescriptor)((kotlinx.serialization.internal.b)var1_1).getDescriptor(), (kotlinx.serialization.json.b)this.a);
                        var3_8 = this.c.F(var2_5 /* !! */ , this.g.q());
                        if (var3_8 != null) break block10;
                        if (!(var1_1 instanceof kotlinx.serialization.internal.b) || this.d().e().p()) ** GOTO lbl48
                        var4_9 = d1.c((SerialDescriptor)((kotlinx.serialization.internal.b)var1_1).getDescriptor(), (kotlinx.serialization.json.b)this.d());
                        var3_8 = this.t();
                        var2_5 /* !! */  = ((kotlinx.serialization.internal.b)var1_1).getDescriptor().h();
                        if (var3_8 instanceof JsonObject) {
                            var2_5 /* !! */  = (JsonElement)(var3_8 = (JsonObject)var3_8).get(var4_9);
                            var2_5 /* !! */  = var2_5 /* !! */  != null && (var2_5 /* !! */  = i.k((JsonElement)var2_5 /* !! */ )) != null ? i.f((JsonPrimitive)var2_5 /* !! */ ) : null;
                        }

                    }
                    var1_1 = var1_1.deserialize((Decoder)this);
                }
                catch (d var1_2) {
                    break block11;
                }
                return (T)var1_1;
                var1_1 = kotlinx.serialization.h.a((kotlinx.serialization.internal.b)((kotlinx.serialization.internal.b)var1_1), (kotlinx.serialization.encoding.c)this, (String)var2_5 /* !! */ );
                {
        // Removed invalid catch block
                        y.g((Object)var1_4);
                        throw n0.f((int)-1, (String)var1_4, (CharSequence)var3_8.toString());
                    }
                    y.h((Object)var1_1, (String)"null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    var1_1 = p1.b((kotlinx.serialization.json.b)this.d(), (String)var4_9, (JsonObject)var3_8, (c)var1_1);
                    return (T)var1_1;
lbl30:

                    var1_1 = new StringBuilder();
                    var1_1.append("Expected ");
                    var1_1.append(v0.b(JsonObject.class).getSimpleName());
                    var1_1.append(", but had ");
                    var1_1.append(v0.b(var3_8.getClass()).getSimpleName());
                    var1_1.append(" as the serialized body of ");
                    var1_1.append(var2_5 /* !! */ );
                    var1_1.append(" at element: ");
                    var1_1.append(this.c.b.a());
                    throw n0.f((int)-1, (String)var1_1.toString(), (CharSequence)var3_8.toString());
lbl48:

                    var1_1 = var1_1.deserialize((Decoder)this);
                }
                return (T)var1_1;
            }
            try {
                var3_8 = kotlinx.serialization.h.a((kotlinx.serialization.internal.b)((kotlinx.serialization.internal.b)var1_1), (kotlinx.serialization.encoding.c)this, (String)var3_8);
            }
            catch (n var2_6) {
                var1_1 = var2_6.getMessage();
                y.g(var1_1);
                var1_1 = p.x0(p.Z0(var1_1, '\n', null, 2, null), ".");
                var2_7 = var2_6.getMessage();
                y.g((Object)var2_7);
                var2_7 = p.P0(var2_7, '\n', "");
                kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)this.c, (String)var1_1, (int)0, (String)var2_7, (int)2, null);
                var1_1 = new j();
                throw var1_1;
            }
            y.h((Object)var3_8, (String)"null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
            var1_1 = new /* Unavailable Anonymous Inner Class!! */;
            this.f = var1_1;
            return (T)var3_8.deserialize((Decoder)this);
        }
        var2_5 /* !! */  = var1_2.getMessage();
        y.g((Object)var2_5 /* !! */ );
        if (p.R(var2_5 /* !! */ , "at path", false, 2, null)) {
            throw var1_2;
        }
        var3_8 = var1_2.a();
        var2_5 /* !! */  = new StringBuilder();
        var2_5 /* !! */ .append(var1_2.getMessage());
        var2_5 /* !! */ .append(" at path: ");
        var2_5 /* !! */ .append(this.c.b.a());
        throw new d((List<String>)var3_8, var2_5 /* !! */ .toString(), (Throwable)var1_2);
    }

    @Override
    public byte H() {
        byte by;
        long l4 = this.c.m();
        if (l4 == (long)(by = (byte)l4)) {
            return by;
        }
        kotlinx.serialization.json.internal.a a4 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse byte for input '");
        stringBuilder.append(l4);
        stringBuilder.append('\'');
        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
        throw new j();
    }

    @NotNull
    public kotlinx.serialization.modules.c a() {
        return this.d;
    }

    @Override
    @NotNull
    public kotlinx.serialization.encoding.c b(@NotNull SerialDescriptor object) {
        y.j((Object)object, (String)"descriptor");
        s1 s12 = t1.b((kotlinx.serialization.json.b)this.a, (SerialDescriptor)object);
        this.c.b.c(object);
        this.c.l(s12.c);
        this.K();
        int n4 = kotlinx.serialization.json.internal.i1$b.a[s12.ordinal()];
        object = n4 != 1 && n4 != 2 && n4 != 3 ? (this.b == s12 && this.a.e().j() ? this : new i1(this.a, s12, this.c, (SerialDescriptor)object, this.f)) : new i1(this.a, s12, this.c, (SerialDescriptor)object, this.f);
        return object;
    }

    @Override
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        if (this.a.e().k() && serialDescriptor.e() == 0) {
            this.R(serialDescriptor);
        }
        if (this.c.N() && !this.a.e().d()) {
            n0.h((kotlinx.serialization.json.internal.a)this.c, (String)"");
            throw new j();
        }
        this.c.l(this.b.d);
        this.c.b.b();
    }

    @Override
    @NotNull
    public final kotlinx.serialization.json.b d() {
        return this.a;
    }

    @Override
    @Nullable
    public Void g() {
        return null;
    }

    @Override
    public long h() {
        return this.c.m();
    }

    @Override
    public short m() {
        short s3;
        long l4 = this.c.m();
        if (l4 == (long)(s3 = (short)l4)) {
            return s3;
        }
        kotlinx.serialization.json.internal.a a4 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse short for input '");
        stringBuilder.append(l4);
        stringBuilder.append('\'');
        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
        throw new j();
    }

    @Override
    public double n() {
        double d4;
        kotlinx.serialization.json.internal.a a4 = this.c;
        String string = a4.q();
        try {
            d4 = Double.parseDouble(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse type '");
            stringBuilder.append("double");
            stringBuilder.append("' for input '");
            stringBuilder.append(string);
            stringBuilder.append('\'');
            kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
            throw new j();
        }
        if (!this.a.e().b() && (Double.isInfinite(d4) || Double.isNaN(d4))) {
            n0.l((kotlinx.serialization.json.internal.a)this.c, (Number)d4);
            throw new j();
        }
        return d4;
    }

    @Override
    public char o() {
        String string = this.c.q();
        if (string.length() == 1) {
            return string.charAt(0);
        }
        kotlinx.serialization.json.internal.a a4 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected single char, but got '");
        stringBuilder.append(string);
        stringBuilder.append('\'');
        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
        throw new j();
    }

    @Override
    public <T> T p(@NotNull SerialDescriptor object, int n4, @NotNull c<? extends T> c4, @Nullable T t3) {
        y.j((Object)object, (String)"descriptor");
        y.j(c4, (String)"deserializer");
        boolean bl = this.b == s1.g && (n4 & 1) == 0;
        if (bl) {
            this.c.b.d();
        }
        object = super.p((SerialDescriptor)object, n4, c4, t3);
        if (bl) {
            this.c.b.f(object);
        }
        return (T)object;
    }

    @Override
    @NotNull
    public String q() {
        String string = this.g.q() ? this.c.r() : this.c.o();
        return string;
    }

    @Override
    public int s(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"enumDescriptor");
        kotlinx.serialization.json.b b4 = this.a;
        String string = this.q();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(this.c.b.a());
        return p0.j((SerialDescriptor)serialDescriptor, (kotlinx.serialization.json.b)b4, (String)string, (String)stringBuilder.toString());
    }

    @Override
    @NotNull
    public JsonElement t() {
        return new c1(this.a.e(), this.c).e();
    }

    @Override
    public int u() {
        int n4;
        long l4 = this.c.m();
        if (l4 == (long)(n4 = (int)l4)) {
            return n4;
        }
        kotlinx.serialization.json.internal.a a4 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse int for input '");
        stringBuilder.append(l4);
        stringBuilder.append('\'');
        kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
        throw new j();
    }

    public int w(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        s1 s12 = this.b;
        int n4 = kotlinx.serialization.json.internal.i1$b.a[s12.ordinal()];
        n4 = n4 != 2 ? (n4 != 4 ? this.M() : this.O(serialDescriptor)) : this.N();
        if (this.b != s1.g) {
            this.c.b.g(n4);
        }
        return n4;
    }

    @Override
    @NotNull
    public Decoder x(@NotNull SerialDescriptor object) {
        y.j((Object)object, (String)"descriptor");
        object = k1.b((SerialDescriptor)object) ? new i0(this.c, this.a) : super.x((SerialDescriptor)object);
        return object;
    }

    @Override
    public float y() {
        float f4;
        kotlinx.serialization.json.internal.a a4 = this.c;
        String string = a4.q();
        try {
            f4 = Float.parseFloat(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse type '");
            stringBuilder.append("float");
            stringBuilder.append("' for input '");
            stringBuilder.append(string);
            stringBuilder.append('\'');
            kotlinx.serialization.json.internal.a.x((kotlinx.serialization.json.internal.a)a4, (String)stringBuilder.toString(), (int)0, null, (int)6, null);
            throw new j();
        }
        if (!this.a.e().b() && (Float.isInfinite(f4) || Float.isNaN(f4))) {
            n0.l((kotlinx.serialization.json.internal.a)this.c, (Number)Float.valueOf(f4));
            throw new j();
        }
        return f4;
    }
}

