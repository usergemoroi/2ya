/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.j
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.h
 *  kotlinx.serialization.json.JsonElement
 *  kotlinx.serialization.json.f
 *  kotlinx.serialization.json.i
 *  kotlinx.serialization.json.internal.d1
 *  kotlinx.serialization.json.internal.k1
 *  kotlinx.serialization.json.internal.m1
 *  kotlinx.serialization.json.internal.n0
 *  kotlinx.serialization.json.internal.p0
 *  kotlinx.serialization.json.internal.p1
 *  kotlinx.serialization.json.internal.t1
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.h;
import kotlinx.serialization.internal.n1;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.g;
import kotlinx.serialization.json.i;
import kotlinx.serialization.json.internal.a1;
import kotlinx.serialization.json.internal.d1;
import kotlinx.serialization.json.internal.i0;
import kotlinx.serialization.json.internal.k1;
import kotlinx.serialization.json.internal.m1;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.p0;
import kotlinx.serialization.json.internal.p1;
import kotlinx.serialization.json.internal.r0;
import kotlinx.serialization.json.internal.t1;
import kotlinx.serialization.json.internal.w0;
import kotlinx.serialization.json.internal.y0;
import kotlinx.serialization.json.u;
import kotlinx.serialization.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010M\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020\u000b\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b^\u0010_J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u0011\u0010\rJ#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H$\u00a2\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u001bH\u0014\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\bB\u0010\u0010J\u001f\u0010E\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u001bH\u0014\u00a2\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020D2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\bG\u0010HR\u001a\u0010M\u001a\u00020I8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b!\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010P\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bK\u0010N\u001a\u0004\bO\u0010\rR\u001c\u0010U\u001a\u0004\u0018\u00010\u00058\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0004X\u0085\u0004\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0001\u0003`ab\u00a8\u0006c"}, d2={"Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/internal/n1;", "Lkotlinx/serialization/json/g;", "Lkotlinx/serialization/json/JsonPrimitive;", "literal", "", "primitive", "tag", "", "B0", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/json/JsonElement;", "m0", "()Lkotlinx/serialization/json/JsonElement;", "currentTag", "A0", "(Ljava/lang/String;)Ljava/lang/String;", "t", "T", "Lkotlinx/serialization/c;", "deserializer", "G", "(Lkotlinx/serialization/c;)Ljava/lang/Object;", "parentName", "childName", "e0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;", "Lkotlin/k0;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "D", "()Z", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "enumDescriptor", "", "r0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "n0", "(Ljava/lang/String;)Z", "", "o0", "(Ljava/lang/String;)B", "", "w0", "(Ljava/lang/String;)S", "u0", "(Ljava/lang/String;)I", "", "v0", "(Ljava/lang/String;)J", "", "s0", "(Ljava/lang/String;)F", "", "q0", "(Ljava/lang/String;)D", "", "p0", "(Ljava/lang/String;)C", "x0", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "t0", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "x", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/json/b;", "Lkotlinx/serialization/json/b;", "d", "()Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/JsonElement;", "z0", "value", "e", "Ljava/lang/String;", "y0", "()Ljava/lang/String;", "polymorphicDiscriminator", "Lkotlinx/serialization/json/f;", "f", "Lkotlinx/serialization/json/f;", "configuration", "Lkotlinx/serialization/modules/c;", "a", "()Lkotlinx/serialization/modules/c;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/b;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/json/internal/r0;", "Lkotlinx/serialization/json/internal/w0;", "Lkotlinx/serialization/json/internal/y0;", "kotlinx-serialization-json"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,334:1\n74#1:359\n74#1:373\n74#1:384\n74#1:394\n75#1:419\n75#1:428\n85#1:437\n75#1:438\n88#1:447\n75#1:448\n89#1,5:457\n88#1:462\n75#1:463\n89#1,5:472\n88#1:477\n75#1:478\n89#1,5:487\n88#1:492\n75#1:493\n89#1,5:502\n88#1:507\n75#1:508\n89#1,5:517\n88#1:522\n75#1:523\n89#1,5:532\n88#1:537\n75#1:538\n89#1,5:547\n88#1:552\n75#1:553\n89#1,5:562\n75#1:567\n85#1:576\n75#1:577\n1#2:335\n76#3,6:336\n82#3,9:350\n271#4,8:342\n271#4,8:360\n271#4,8:374\n271#4,8:385\n271#4,8:395\n271#4,8:403\n271#4,8:411\n271#4,8:420\n271#4,8:429\n271#4,8:439\n271#4,8:449\n271#4,8:464\n271#4,8:479\n271#4,8:494\n271#4,8:509\n271#4,8:524\n271#4,8:539\n271#4,8:554\n271#4,8:568\n271#4,8:578\n36#5,5:368\n41#5,2:382\n44#5:393\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n64#1:359\n67#1:373\n68#1:384\n70#1:394\n85#1:419\n88#1:428\n105#1:437\n105#1:438\n112#1:447\n112#1:448\n112#1:457,5\n114#1:462\n114#1:463\n114#1:472,5\n120#1:477\n120#1:478\n120#1:487,5\n126#1:492\n126#1:493\n126#1:502,5\n127#1:507\n127#1:508\n127#1:517,5\n130#1:522\n130#1:523\n130#1:532,5\n137#1:537\n137#1:538\n137#1:547,5\n143#1:552\n143#1:553\n143#1:562,5\n146#1:567\n159#1:576\n159#1:577\n56#1:336,6\n56#1:350,9\n56#1:342,8\n64#1:360,8\n67#1:374,8\n68#1:385,8\n70#1:395,8\n74#1:403,8\n75#1:411,8\n85#1:420,8\n88#1:429,8\n105#1:439,8\n112#1:449,8\n114#1:464,8\n120#1:479,8\n126#1:494,8\n127#1:509,8\n130#1:524,8\n137#1:539,8\n143#1:554,8\n146#1:568,8\n159#1:578,8\n65#1:368,5\n65#1:382,2\n65#1:393\n*E\n"})
abstract class c
extends n1
implements g {
    @NotNull
    private final b c;
    @NotNull
    private final JsonElement d;
    @Nullable
    private final String e;
    @JvmField
    @NotNull
    protected final f f;

    private c(b b4, JsonElement jsonElement, String string) {
        this.c = b4;
        this.d = jsonElement;
        this.e = string;
        this.f = this.d().e();
    }

    public /* synthetic */ c(b b4, JsonElement jsonElement, String string, int n4, p p4) {
        if ((n4 & 4) != 0) {
            string = null;
        }
        this(b4, jsonElement, string, null);
    }

    public /* synthetic */ c(b b4, JsonElement jsonElement, String string, p p4) {
        this(b4, jsonElement, string);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final Void B0(JsonPrimitive jsonPrimitive, String charSequence, String string) {
        void var4_5;
        String string2;
        if (kotlin.text.p.M((String)charSequence, "i", false, 2, null)) {
            StringBuilder stringBuilder = new StringBuilder();
            string2 = "an ";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            string2 = "a ";
        }
        var4_5.append(string2);
        var4_5.append((String)charSequence);
        String string3 = var4_5.toString();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed to parse literal '");
        ((StringBuilder)charSequence).append((Object)jsonPrimitive);
        ((StringBuilder)charSequence).append("' as ");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(" value at element: ");
        ((StringBuilder)charSequence).append(this.A0(string));
        throw n0.f((int)-1, (String)((StringBuilder)charSequence).toString(), (CharSequence)this.m0().toString());
    }

    @NotNull
    public final String A0(@NotNull String string) {
        y.j((Object)string, (String)"currentTag");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i0());
        stringBuilder.append('.');
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public boolean D() {
        return this.m0() instanceof JsonNull ^ true;
    }

    @Override
    public <T> T G(@NotNull kotlinx.serialization.c<? extends T> object) {
        block4: {
            block2: {
                Object object2;
                Object object3;
                block3: {
                    y.j(object, (String)"deserializer");
                    if (!(object instanceof kotlinx.serialization.internal.b) || this.d().e().p()) break block2;
                    object3 = (kotlinx.serialization.internal.b)object;
                    String string = d1.c((SerialDescriptor)object3.getDescriptor(), (b)this.d());
                    object2 = this.t();
                    object3 = object3.getDescriptor().h();
                    if (!(object2 instanceof JsonObject)) break block3;
                    object3 = (JsonObject)object2;
                    object2 = (object2 = (JsonElement)((JsonObject)object3).get(string)) != null && (object2 = i.k((JsonElement)object2)) != null ? i.f((JsonPrimitive)((Object)object2)) : null;
                    try {
                        object = h.a((kotlinx.serialization.internal.b)((kotlinx.serialization.internal.b)object), (kotlinx.serialization.encoding.c)this, (String)object2);
                    }
                    catch (n n4) {
                        String string2 = n4.getMessage();
                        y.g((Object)string2);
                        throw n0.f((int)-1, (String)string2, (CharSequence)((JsonObject)object3).toString());
                    }
                    y.h((Object)object, (String)"null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    object = p1.b((b)this.d(), (String)string, (JsonObject)object3, (kotlinx.serialization.c)object);
                    break block4;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected ");
                ((StringBuilder)object).append(v0.b(JsonObject.class).getSimpleName());
                ((StringBuilder)object).append(", but had ");
                ((StringBuilder)object).append(v0.b(object2.getClass()).getSimpleName());
                ((StringBuilder)object).append(" as the serialized body of ");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" at element: ");
                ((StringBuilder)object).append(this.i0());
                throw n0.f((int)-1, (String)((StringBuilder)object).toString(), (CharSequence)object2.toString());
            }
            object = object.deserialize((Decoder)this);
        }
        return (T)object;
    }

    @NotNull
    public kotlinx.serialization.modules.c a() {
        return this.d().a();
    }

    @NotNull
    public kotlinx.serialization.encoding.c b(@NotNull SerialDescriptor object) {
        Object object2;
        JsonElement jsonElement;
        block10: {
            block7: {
                block2: {
                    block9: {
                        block3: {
                            block8: {
                                block4: {
                                    SerialDescriptor serialDescriptor;
                                    block5: {
                                        block6: {
                                            y.j((Object)object, (String)"descriptor");
                                            jsonElement = this.m0();
                                            object2 = object.getKind();
                                            if (y.e((Object)object2, (Object)((Object)m.b.a)) || object2 instanceof d) break block2;
                                            if (!y.e((Object)object2, (Object)((Object)m.c.a))) break block3;
                                            object2 = this.d();
                                            serialDescriptor = t1.a((SerialDescriptor)object.d(0), (kotlinx.serialization.modules.c)((b)object2).a());
                                            l l4 = serialDescriptor.getKind();
                                            if (l4 instanceof e || y.e((Object)l4, (Object)((Object)l.b.a))) break block4;
                                            if (!((b)object2).e().c()) break block5;
                                            object2 = this.d();
                                            object = object.h();
                                            if (!(jsonElement instanceof JsonArray)) break block6;
                                            object = new y0((b)object2, (JsonArray)jsonElement);
                                            break block7;
                                        }
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("Expected ");
                                        ((StringBuilder)object2).append(v0.b(JsonArray.class).getSimpleName());
                                        ((StringBuilder)object2).append(", but had ");
                                        ((StringBuilder)object2).append(v0.b(jsonElement.getClass()).getSimpleName());
                                        ((StringBuilder)object2).append(" as the serialized body of ");
                                        ((StringBuilder)object2).append((String)object);
                                        ((StringBuilder)object2).append(" at element: ");
                                        ((StringBuilder)object2).append(this.i0());
                                        throw n0.f((int)-1, (String)((StringBuilder)object2).toString(), (CharSequence)jsonElement.toString());
                                    }
                                    throw n0.d((SerialDescriptor)serialDescriptor);
                                }
                                object2 = this.d();
                                object = object.h();
                                if (!(jsonElement instanceof JsonObject)) break block8;
                                object = new a1((b)object2, (JsonObject)jsonElement);
                                break block7;
                            }
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Expected ");
                            ((StringBuilder)object2).append(v0.b(JsonObject.class).getSimpleName());
                            ((StringBuilder)object2).append(", but had ");
                            ((StringBuilder)object2).append(v0.b(jsonElement.getClass()).getSimpleName());
                            ((StringBuilder)object2).append(" as the serialized body of ");
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append(" at element: ");
                            ((StringBuilder)object2).append(this.i0());
                            throw n0.f((int)-1, (String)((StringBuilder)object2).toString(), (CharSequence)jsonElement.toString());
                        }
                        object2 = this.d();
                        object = object.h();
                        if (!(jsonElement instanceof JsonObject)) break block9;
                        object = new w0((b)object2, (JsonObject)jsonElement, this.e, null, 8, null);
                        break block7;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Expected ");
                    ((StringBuilder)object2).append(v0.b(JsonObject.class).getSimpleName());
                    ((StringBuilder)object2).append(", but had ");
                    ((StringBuilder)object2).append(v0.b(jsonElement.getClass()).getSimpleName());
                    ((StringBuilder)object2).append(" as the serialized body of ");
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(" at element: ");
                    ((StringBuilder)object2).append(this.i0());
                    throw n0.f((int)-1, (String)((StringBuilder)object2).toString(), (CharSequence)jsonElement.toString());
                }
                object2 = this.d();
                object = object.h();
                if (!(jsonElement instanceof JsonArray)) break block10;
                object = new y0((b)object2, (JsonArray)jsonElement);
            }
            return object;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Expected ");
        ((StringBuilder)object2).append(v0.b(JsonArray.class).getSimpleName());
        ((StringBuilder)object2).append(", but had ");
        ((StringBuilder)object2).append(v0.b(jsonElement.getClass()).getSimpleName());
        ((StringBuilder)object2).append(" as the serialized body of ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" at element: ");
        ((StringBuilder)object2).append(this.i0());
        throw n0.f((int)-1, (String)((StringBuilder)object2).toString(), (CharSequence)jsonElement.toString());
    }

    public void c(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
    }

    @Override
    @NotNull
    public b d() {
        return this.c;
    }

    @Override
    @NotNull
    protected String e0(@NotNull String string, @NotNull String string2) {
        y.j((Object)string, (String)"parentName");
        y.j((Object)string2, (String)"childName");
        return string2;
    }

    @NotNull
    protected abstract JsonElement l0(@NotNull String var1);

    @NotNull
    protected final JsonElement m0() {
        String string;
        block3: {
            block2: {
                string = (String)this.Y();
                if (string == null) break block2;
                JsonElement jsonElement = this.l0(string);
                string = jsonElement;
                if (jsonElement != null) break block3;
            }
            string = this.z0();
        }
        return string;
    }

    protected boolean n0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            Boolean bl;
            block4: {
                jsonElement = (JsonPrimitive)jsonElement;
                try {
                    bl = i.e((JsonPrimitive)jsonElement);
                    if (bl == null) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.B0((JsonPrimitive)jsonElement, "boolean", string);
                    throw new j();
                }
                return bl;
            }
            this.B0((JsonPrimitive)jsonElement, "boolean", string);
            bl = new j();
            throw bl;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("boolean");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    protected byte o0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        Object object = this.l0(string);
        if (object instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive;
            block6: {
                int n4;
                jsonPrimitive = (JsonPrimitive)((Object)object);
                try {
                    n4 = i.i((JsonPrimitive)jsonPrimitive);
                    if (-128 > n4 || n4 > 127) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.B0(jsonPrimitive, "byte", string);
                    throw new j();
                }
                object = (byte)n4;
            }
            object = null;
            if (object != null) {
                return ((Number)object).byteValue();
            }
            this.B0(jsonPrimitive, "byte", string);
            object = new j();
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(object.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("byte");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)object.toString());
    }

    protected char p0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive)jsonElement;
            try {
                char c4 = kotlin.text.p.s1(jsonPrimitive.d());
                return c4;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.B0(jsonPrimitive, "char", string);
                throw new j();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("char");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    protected double q0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            double d4;
            jsonElement = (JsonPrimitive)jsonElement;
            try {
                d4 = i.g((JsonPrimitive)jsonElement);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.B0((JsonPrimitive)jsonElement, "double", string);
                throw new j();
            }
            if (!this.d().e().b() && (Double.isInfinite(d4) || Double.isNaN(d4))) {
                throw n0.a((Number)d4, (String)string, (String)this.m0().toString());
            }
            return d4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("double");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    protected int r0(@NotNull String string, @NotNull SerialDescriptor object) {
        y.j((Object)string, (String)"tag");
        y.j((Object)object, (String)"enumDescriptor");
        b b4 = this.d();
        JsonElement jsonElement = this.l0(string);
        String string2 = object.h();
        if (jsonElement instanceof JsonPrimitive) {
            return p0.k((SerialDescriptor)object, (b)b4, (String)((JsonPrimitive)jsonElement).d(), null, (int)4, null);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected ");
        ((StringBuilder)object).append(v0.b(JsonPrimitive.class).getSimpleName());
        ((StringBuilder)object).append(", but had ");
        ((StringBuilder)object).append(v0.b(jsonElement.getClass()).getSimpleName());
        ((StringBuilder)object).append(" as the serialized body of ");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" at element: ");
        ((StringBuilder)object).append(this.A0(string));
        throw n0.f((int)-1, (String)((StringBuilder)object).toString(), (CharSequence)jsonElement.toString());
    }

    protected float s0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            float f4;
            jsonElement = (JsonPrimitive)jsonElement;
            try {
                f4 = i.h((JsonPrimitive)jsonElement);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.B0((JsonPrimitive)jsonElement, "float", string);
                throw new j();
            }
            if (!this.d().e().b() && (Float.isInfinite(f4) || Float.isNaN(f4))) {
                throw n0.a((Number)Float.valueOf(f4), (String)string, (String)this.m0().toString());
            }
            return f4;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("float");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    @Override
    @NotNull
    public JsonElement t() {
        return this.m0();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    protected Decoder t0(@NotNull String object, @NotNull SerialDescriptor object2) {
        y.j((Object)object, (String)"tag");
        y.j((Object)object2, (String)"inlineDescriptor");
        if (!k1.b((SerialDescriptor)object2)) return super.T(object, (SerialDescriptor)object2);
        Object object3 = this.d();
        JsonElement jsonElement = this.l0((String)object);
        String string = object2.h();
        if (jsonElement instanceof JsonPrimitive) {
            return new i0(m1.a((b)object3, (String)((JsonPrimitive)jsonElement).d()), this.d());
        }
        object3 = new StringBuilder();
        ((StringBuilder)object3).append("Expected ");
        ((StringBuilder)object3).append(v0.b(JsonPrimitive.class).getSimpleName());
        ((StringBuilder)object3).append(", but had ");
        ((StringBuilder)object3).append(v0.b(jsonElement.getClass()).getSimpleName());
        ((StringBuilder)object3).append(" as the serialized body of ");
        ((StringBuilder)object3).append(string);
        ((StringBuilder)object3).append(" at element: ");
        ((StringBuilder)object3).append(this.A0((String)object));
        throw n0.f((int)-1, (String)((StringBuilder)object3).toString(), (CharSequence)jsonElement.toString());
    }

    protected int u0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            jsonElement = (JsonPrimitive)jsonElement;
            try {
                int n4 = i.i((JsonPrimitive)jsonElement);
                return n4;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.B0((JsonPrimitive)jsonElement, "int", string);
                throw new j();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("int");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    protected long v0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            jsonElement = (JsonPrimitive)jsonElement;
            try {
                long l4 = i.m((JsonPrimitive)jsonElement);
                return l4;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.B0((JsonPrimitive)jsonElement, "long", string);
                throw new j();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("long");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    protected short w0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        Object object = this.l0(string);
        if (object instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive;
            block6: {
                int n4;
                jsonPrimitive = (JsonPrimitive)((Object)object);
                try {
                    n4 = i.i((JsonPrimitive)jsonPrimitive);
                    if (Short.MIN_VALUE > n4 || n4 > Short.MAX_VALUE) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.B0(jsonPrimitive, "short", string);
                    throw new j();
                }
                object = (short)n4;
            }
            object = null;
            if (object != null) {
                return ((Number)object).shortValue();
            }
            this.B0(jsonPrimitive, "short", string);
            object = new j();
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(object.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("short");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)object.toString());
    }

    @Override
    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        y.j((Object)serialDescriptor, (String)"descriptor");
        serialDescriptor = this.Y() != null ? super.x(serialDescriptor) : new r0(this.d(), this.z0(), this.e).x(serialDescriptor);
        return serialDescriptor;
    }

    @NotNull
    protected String x0(@NotNull String string) {
        y.j((Object)string, (String)"tag");
        JsonElement jsonElement = this.l0(string);
        if (jsonElement instanceof JsonPrimitive) {
            Object object = (JsonPrimitive)jsonElement;
            if (object instanceof u) {
                if (!((u)((Object)(object = (u)((Object)object)))).f() && !this.d().e().q()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("String literal for key '");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("' should be quoted at element: ");
                    ((StringBuilder)object).append(this.A0(string));
                    ((StringBuilder)object).append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                    throw n0.f((int)-1, (String)((StringBuilder)object).toString(), (CharSequence)this.m0().toString());
                }
                return ((u)((Object)object)).d();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected string value for a non-null key '");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("', got null literal instead at element: ");
            ((StringBuilder)object).append(this.A0(string));
            throw n0.f((int)-1, (String)((StringBuilder)object).toString(), (CharSequence)this.m0().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(v0.b(JsonPrimitive.class).getSimpleName());
        stringBuilder.append(", but had ");
        stringBuilder.append(v0.b(jsonElement.getClass()).getSimpleName());
        stringBuilder.append(" as the serialized body of ");
        stringBuilder.append("string");
        stringBuilder.append(" at element: ");
        stringBuilder.append(this.A0(string));
        throw n0.f((int)-1, (String)stringBuilder.toString(), (CharSequence)jsonElement.toString());
    }

    @Nullable
    protected final String y0() {
        return this.e;
    }

    @NotNull
    public abstract JsonElement z0();
}

