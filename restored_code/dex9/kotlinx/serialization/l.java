/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.collections.k0
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlin.jvm.internal.z0
 *  kotlin.k0
 *  kotlin.m
 *  kotlin.q
 *  kotlinx.serialization.InternalSerializationApi
 *  kotlinx.serialization.builtins.a
 *  kotlinx.serialization.c
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.k
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.encoding.c
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z0;
import kotlin.k0;
import kotlin.m;
import kotlin.n;
import kotlin.q;
import kotlin.reflect.KClass;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.a;
import kotlinx.serialization.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.b;
import kotlinx.serialization.j;
import kotlinx.serialization.k;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00110'\u0012\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\"0'\u00a2\u0006\u0004\b*\u0010+BY\b\u0011\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00110'\u0012\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\"0'\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180'\u00a2\u0006\u0004\b*\u0010-J)\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010$\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010#R(\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010#\u00a8\u0006."}, d2={"Lkotlinx/serialization/l;", "", "T", "Lkotlinx/serialization/internal/b;", "Lkotlinx/serialization/encoding/c;", "decoder", "", "klassName", "Lkotlinx/serialization/c;", "c", "(Lkotlinx/serialization/encoding/c;Ljava/lang/String;)Lkotlinx/serialization/c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/o;", "d", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/o;", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/m;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "serialName", "", "subclasses", "subclassSerializers", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "classAnnotations", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@InternalSerializationApi
@SourceDebugExtension(value={"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,154:1\n1544#2:155\n1246#2,4:165\n53#3:156\n80#3,6:157\n462#4:163\n412#4:164\n82#5:169\n216#6,2:170\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n109#1:170,2\n*E\n"})
public final class l<T>
extends b<T> {
    @NotNull
    private final KClass<T> a;
    @NotNull
    private List<? extends Annotation> b;
    @NotNull
    private final m c;
    @NotNull
    private final Map<KClass<? extends T>, KSerializer<? extends T>> d;
    @NotNull
    private final Map<String, KSerializer<? extends T>> e;

    public l(@NotNull String object6, @NotNull KClass<T> object2, @NotNull KClass<? extends T>[] object3, @NotNull KSerializer<? extends T>[] object4) {
        y.j((Object)object6, (String)"serialName");
        y.j(object2, (String)"baseClass");
        y.j(object3, (String)"subclasses");
        y.j(object4, (String)"subclassSerializers");
        this.a = object2;
        this.b = t.m();
        this.c = n.a(q.d, new i((String)object6, this));
        if (((KClass<? extends T>[])object3).length == ((KSerializer<? extends T>[])object4).length) {
            this.d = object6 = s0.v((Iterable)kotlin.collections.l.o1((Object[])object3, (Object[])object4));
            kotlin.collections.k0 k02 = new kotlin.collections.k0<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String>(object6.entrySet()){
                final Iterable a;
                {
                    this.a = iterable;
                }

                /*
                 * Ignored method signature, as it can't be verified against descriptor
                 */
                public Object a(Object object) {
                    return ((KSerializer)((Map.Entry)object).getValue()).getDescriptor().h();
                }

                public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> b() {
                    return this.a.iterator();
                }
            };
            object6 = new LinkedHashMap();
            object4 = k02.b();
            while (object4.hasNext()) {
                object2 = object4.next();
                object3 = k02.a(object2);
                Object object5 = object6.get(object3);
                if (object5 == null) {
                    object6.containsKey(object3);
                }
                object2 = (Map.Entry)object2;
                object5 = (Map.Entry)object5;
                String string = (String)object3;
                if (object5 == null) {
                    object6.put(object3, object2);
                    continue;
                }
                object6 = new StringBuilder();
                ((StringBuilder)object6).append("Multiple sealed subclasses of '");
                ((StringBuilder)object6).append(this.e());
                ((StringBuilder)object6).append("' have the same serial name '");
                ((StringBuilder)object6).append(string);
                ((StringBuilder)object6).append("': '");
                ((StringBuilder)object6).append(object5.getKey());
                ((StringBuilder)object6).append("', '");
                ((StringBuilder)object6).append(object2.getKey());
                ((StringBuilder)object6).append('\'');
                throw new IllegalStateException(((StringBuilder)object6).toString().toString());
            }
            object2 = new LinkedHashMap(s0.f(object6.size()));
            for (Object object6 : (Iterable)object6.entrySet()) {
                object2.put(object6.getKey(), (KSerializer)((Map.Entry)object6.getValue()).getValue());
            }
            this.e = object2;
            return;
        }
        object6 = new StringBuilder();
        ((StringBuilder)object6).append("All subclasses of sealed class ");
        ((StringBuilder)object6).append(this.e().getSimpleName());
        ((StringBuilder)object6).append(" should be marked @Serializable");
        throw new IllegalArgumentException(((StringBuilder)object6).toString());
    }

    @PublishedApi
    public l(@NotNull String string, @NotNull KClass<T> kClass, @NotNull KClass<? extends T>[] kClassArray, @NotNull KSerializer<? extends T>[] kSerializerArray, @NotNull Annotation[] annotationArray) {
        y.j((Object)string, (String)"serialName");
        y.j(kClass, (String)"baseClass");
        y.j(kClassArray, (String)"subclasses");
        y.j(kSerializerArray, (String)"subclassSerializers");
        y.j((Object)annotationArray, (String)"classAnnotations");
        this(string, kClass, kClassArray, kSerializerArray);
        this.b = kotlin.collections.l.e(annotationArray);
    }

    public static /* synthetic */ k0 f(l l4, kotlinx.serialization.descriptors.a a4) {
        return l.j(l4, a4);
    }

    public static /* synthetic */ k0 g(l l4, kotlinx.serialization.descriptors.a a4) {
        return l.k(l4, a4);
    }

    public static /* synthetic */ SerialDescriptor h(String string, l l4) {
        return l.i(string, l4);
    }

    private static final SerialDescriptor i(String string, l object) {
        d.b b4 = d.b.a;
        object = new j((l)object);
        return kotlinx.serialization.descriptors.k.d((String)string, (kotlinx.serialization.descriptors.l)b4, (SerialDescriptor[])new SerialDescriptor[0], (kotlin.jvm.functions.l)object);
    }

    private static final k0 j(l l4, kotlinx.serialization.descriptors.a a4) {
        y.j((Object)a4, (String)"$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"type", (SerialDescriptor)kotlinx.serialization.builtins.a.I((z0)z0.a).getDescriptor(), null, (boolean)false, (int)12, null);
        Object object = new StringBuilder();
        object.append("kotlinx.serialization.Sealed<");
        object.append(l4.e().getSimpleName());
        object.append('>');
        String string = object.toString();
        object = l.a.a;
        k k4 = new k(l4);
        kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)a4, (String)"value", (SerialDescriptor)kotlinx.serialization.descriptors.k.d((String)string, (kotlinx.serialization.descriptors.l)object, (SerialDescriptor[])new SerialDescriptor[0], (kotlin.jvm.functions.l)k4), null, (boolean)false, (int)12, null);
        a4.h(l4.b);
        return k0.a;
    }

    /*
     * WARNING - void declaration
     */
    private static final k0 k(l object2, kotlinx.serialization.descriptors.a a4) {
        void var1_3;
        y.j((Object)var1_3, (String)"$this$buildSerialDescriptor");
        for (Map.Entry entry : ((l)object2).e.entrySet()) {
            kotlinx.serialization.descriptors.a.b((kotlinx.serialization.descriptors.a)var1_3, (String)entry.getKey(), (SerialDescriptor)entry.getValue().getDescriptor(), null, (boolean)false, (int)12, null);
        }
        return k0.a;
    }

    @Override
    @Nullable
    public c<T> c(@NotNull kotlinx.serialization.encoding.c c4, @Nullable String string) {
        y.j((Object)c4, (String)"decoder");
        KSerializer<? extends T> kSerializer = this.e.get(string);
        c4 = kSerializer != null ? kSerializer : super.c((kotlinx.serialization.encoding.c)c4, string);
        return c4;
    }

    @Override
    @Nullable
    public o<T> d(@NotNull Encoder o4, @NotNull T t3) {
        y.j((Object)o4, (String)"encoder");
        y.j(t3, (String)"value");
        KSerializer<? extends T> kSerializer = this.d.get(v0.b(t3.getClass()));
        o4 = kSerializer != null ? kSerializer : super.d((Encoder)o4, t3);
        if (o4 == null) {
            o4 = null;
        }
        return o4;
    }

    @Override
    @NotNull
    public KClass<T> e() {
        return this.a;
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }
}

