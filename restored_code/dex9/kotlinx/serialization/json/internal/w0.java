/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.internal.x0
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.c0
 *  kotlinx.serialization.json.i
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.internal.p0
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.collections.s0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.internal.x0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c0;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.internal.c;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b.\u0010/J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010)\u00a8\u00060"}, d2={"Lkotlinx/serialization/json/internal/w0;", "Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "tag", "", "D0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)Z", "C0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "w", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "D", "()Z", "f0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;", "Lkotlin/k0;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "g", "Lkotlinx/serialization/json/JsonObject;", "E0", "()Lkotlinx/serialization/json/JsonObject;", "value", "h", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "polyDescriptor", "i", "I", "position", "j", "Z", "forceNull", "Lkotlinx/serialization/json/b;", "json", "polymorphicDiscriminator", "<init>", "(Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 6 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,334:1\n125#2,22:335\n147#2,4:358\n131#3:357\n1#4:362\n74#5:363\n271#6,8:364\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n200#1:335,22\n200#1:358,4\n200#1:357\n262#1:363\n262#1:364,8\n*E\n"})
class w0
extends c {
    @NotNull
    private final JsonObject g;
    @Nullable
    private final SerialDescriptor h;
    private int i;
    private boolean j;

    public w0(@NotNull b b4, @NotNull JsonObject jsonObject, @Nullable String string, @Nullable SerialDescriptor serialDescriptor) {
        y.j((Object)b4, (String)"json");
        y.j((Object)jsonObject, (String)"value");
        super(b4, jsonObject, string, null);
        this.g = jsonObject;
        this.h = serialDescriptor;
    }

    public /* synthetic */ w0(b b4, JsonObject jsonObject, String string, SerialDescriptor serialDescriptor, int n4, p p4) {
        if ((n4 & 4) != 0) {
            string = null;
        }
        if ((n4 & 8) != 0) {
            serialDescriptor = null;
        }
        this(b4, jsonObject, string, serialDescriptor);
    }

    private final boolean C0(SerialDescriptor serialDescriptor, int n4) {
        boolean bl = !this.d().e().j() && !serialDescriptor.i(n4) && serialDescriptor.d(n4).b();
        this.j = bl;
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final boolean D0(SerialDescriptor object, int n4, String string) {
        void var1_5;
        String string2;
        boolean bl;
        b b4 = this.d();
        boolean bl2 = object.i(bl ? 1 : 0);
        SerialDescriptor serialDescriptor = object.d(bl ? 1 : 0);
        boolean bl3 = true;
        if (bl2 && !serialDescriptor.b() && this.l0(string2) instanceof JsonNull) {
            return bl3;
        }
        if (!y.e((Object)serialDescriptor.getKind(), (Object)((Object)l.b.a))) return false;
        if (serialDescriptor.b()) {
            if (this.l0(string2) instanceof JsonNull) return false;
        }
        JsonElement jsonElement = this.l0(string2);
        boolean bl4 = jsonElement instanceof JsonPrimitive;
        string2 = null;
        if (bl4) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive)jsonElement;
        } else {
            Object var1_4 = null;
        }
        if (var1_5 != null) {
            string2 = kotlinx.serialization.json.i.f((JsonPrimitive)var1_5);
        }
        if (string2 != null) {
            int n5 = p0.i((SerialDescriptor)serialDescriptor, (b)b4, (String)string2);
            bl = !b4.e().j() && serialDescriptor.b();
            if (n5 != -3) return false;
            bl4 = bl3;
            if (bl2) return bl4;
            if (bl) return bl3;
        }
        return false;
    }

    @Override
    public boolean D() {
        boolean bl = !this.j && super.D();
        return bl;
    }

    @NotNull
    public JsonObject E0() {
        return this.g;
    }

    @Override
    @NotNull
    public kotlinx.serialization.encoding.c b(@NotNull SerialDescriptor object) {
        y.j((Object)object, (String)"descriptor");
        if (object == this.h) {
            Object object2 = this.d();
            JsonElement jsonElement = this.m0();
            object = this.h.h();
            if (jsonElement instanceof JsonObject) {
                return new w0((b)object2, (JsonObject)jsonElement, this.y0(), this.h);
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Expected ");
            ((StringBuilder)object2).append(v0.b(JsonObject.class).getSimpleName());
            ((StringBuilder)object2).append(", but had ");
            ((StringBuilder)object2).append(v0.b(jsonElement.getClass()).getSimpleName());
            ((StringBuilder)object2).append(" as the serialized body of ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" at element: ");
            ((StringBuilder)object2).append(c.k0(this));
            throw n0.f((int)-1, (String)((StringBuilder)object2).toString(), (CharSequence)jsonElement.toString());
        }
        return super.b((SerialDescriptor)object);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void c(@NotNull SerialDescriptor object) {
        y.j((Object)object, (String)"descriptor");
        if (!this.f.k() && !(object.getKind() instanceof d)) {
            p0.m((SerialDescriptor)object, (b)this.d());
            if (!this.f.o()) {
                object = x0.a((SerialDescriptor)object);
            } else {
                void var2_5;
                Set set = x0.a((SerialDescriptor)object);
                object = (Map)c0.a((b)this.d()).a((SerialDescriptor)object, p0.g());
                object = object != null ? object.keySet() : null;
                Object object2 = object;
                if (object == null) {
                    Set set2 = b1.f();
                }
                object = b1.m(set, (Iterable)var2_5);
            }
            for (String string : this.E0().keySet()) {
                if (object.contains(string) || y.e((Object)string, (Object)this.y0())) continue;
                throw n0.g((String)string, (String)this.E0().toString());
            }
        }
    }

    @Override
    @NotNull
    protected String f0(@NotNull SerialDescriptor object2, int n4) {
        String string;
        block4: {
            y.j((Object)object2, (String)"descriptor");
            p0.m((SerialDescriptor)object2, (b)this.d());
            string = object2.f(n4);
            if (!this.f.o()) {
                return string;
            }
            if (this.E0().keySet().contains(string)) {
                return string;
            }
            Map map2 = p0.e((b)this.d(), (SerialDescriptor)object2);
            for (Object object2 : (Iterable)this.E0().keySet()) {
                Integer n5 = (Integer)map2.get((String)object2);
                if (n5 == null || n5 != n4) continue;
                break block4;
            }
            object2 = null;
        }
        object2 = (String)object2;
        if (object2 != null) {
            return object2;
        }
        return string;
    }

    @Override
    @NotNull
    protected JsonElement l0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        return (JsonElement)s0.k((Map)this.E0(), string);
    }

    public int w(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        while (this.i < serialDescriptor.e()) {
            int n4 = this.i;
            this.i = n4 + 1;
            String string = this.g0(serialDescriptor, n4);
            n4 = this.i - 1;
            this.j = false;
            if (!this.E0().containsKey(string) && !this.C0(serialDescriptor, n4) || this.f.g() && this.D0(serialDescriptor, n4, string)) continue;
            return n4;
        }
        return -1;
    }
}

