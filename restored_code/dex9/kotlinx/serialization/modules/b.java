/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.a1
 *  kotlin.jvm.internal.v0
 *  kotlin.jvm.internal.y
 *  kotlin.r
 *  kotlinx.serialization.c
 *  kotlinx.serialization.modules.a
 *  kotlinx.serialization.modules.c
 *  kotlinx.serialization.modules.f
 *  kotlinx.serialization.o
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.r;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c;
import kotlinx.serialization.modules.a;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u00ee\u0001\u0012\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u001b0\u001a\u0012*\u0010\u001e\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u001a0\u001a\u0012.\u0010\"\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001fj\u0006\u0012\u0002\b\u0003` 0\u001a\u0012&\u0010$\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u001a0\u001a\u0012A\u0010)\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001fj\u0006\u0012\u0002\b\u0003`(0\u001a\u0012\u0006\u0010-\u001a\u00020*\u00a2\u0006\u0004\b.\u0010/J9\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ;\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJA\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u001cR8\u0010\u001e\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u001a0\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u001cR<\u0010\"\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001fj\u0006\u0012\u0002\b\u0003` 0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\u001cR4\u0010$\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u001a0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010\u001cRO\u0010)\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001fj\u0006\u0012\u0002\b\u0003`(0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001a\u0010-\u001a\u00020*8\u0010X\u0090\u0004\u00a2\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b#\u0010,\u00a8\u00060"}, d2={"Lkotlinx/serialization/modules/b;", "Lkotlinx/serialization/modules/c;", "", "T", "Lkotlin/reflect/KClass;", "baseClass", "value", "Lkotlinx/serialization/o;", "f", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/o;", "", "serializedClassName", "Lkotlinx/serialization/c;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlinx/serialization/c;", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/f;", "collector", "Lkotlin/k0;", "a", "(Lkotlinx/serialization/modules/f;)V", "", "Lkotlinx/serialization/modules/a;", "Ljava/util/Map;", "class2ContextualFactory", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "c", "polyBase2DefaultSerializerProvider", "d", "polyBase2NamedSerializers", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "Z", "()Z", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,245:1\n216#2,2:246\n216#2:248\n216#2:249\n217#2:251\n217#2:252\n216#2,2:253\n216#2,2:255\n78#3:250\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n186#1:246,2\n196#1:248\n197#1:249\n197#1:251\n196#1:252\n206#1:253,2\n210#1:255,2\n201#1:250\n*E\n"})
public final class b
extends kotlinx.serialization.modules.c {
    @NotNull
    private final Map<KClass<?>, a> a;
    @JvmField
    @NotNull
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> b;
    @NotNull
    private final Map<KClass<?>, l<?, o<?>>> c;
    @NotNull
    private final Map<KClass<?>, Map<String, KSerializer<?>>> d;
    @NotNull
    private final Map<KClass<?>, l<String, c<?>>> e;
    private final boolean f;

    public b(@NotNull Map<KClass<?>, ? extends a> map2, @NotNull Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> map3, @NotNull Map<KClass<?>, ? extends l<?, ? extends o<?>>> map4, @NotNull Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> map5, @NotNull Map<KClass<?>, ? extends l<? super String, ? extends c<?>>> map6, boolean bl) {
        y.j(map2, (String)"class2ContextualFactory");
        y.j(map3, (String)"polyBase2Serializers");
        y.j(map4, (String)"polyBase2DefaultSerializerProvider");
        y.j(map5, (String)"polyBase2NamedSerializers");
        y.j(map6, (String)"polyBase2DefaultDeserializerProvider");
        super(null);
        this.a = map2;
        this.b = map3;
        this.c = map4;
        this.d = map5;
        this.e = map6;
        this.f = bl;
    }

    public void a(@NotNull f f4) {
        KClass<?> kClass;
        y.j((Object)f4, (String)"collector");
        for (Map.Entry<KClass<?>, a> entry : this.a.entrySet()) {
            kClass = entry.getKey();
            a a4 = entry.getValue();
            if (a4 instanceof a.a) {
                y.h(kClass, (String)"null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> kSerializer = ((a.a)a4).b();
                y.h(kSerializer, (String)"null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                f4.d(kClass, kSerializer);
                continue;
            }
            if (a4 instanceof a.b) {
                f4.e(kClass, ((a.b)a4).b());
                continue;
            }
            throw new r();
        }
        for (Map.Entry<KClass<?>, Object> entry : this.b.entrySet()) {
            kClass = entry.getKey();
            for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                KClass kClass2 = (KClass)entry2.getKey();
                KSerializer kSerializer = (KSerializer)entry2.getValue();
                y.h(kClass, (String)"null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                y.h((Object)kClass2, (String)"null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                y.h((Object)kSerializer, (String)"null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                f4.c(kClass, kClass2, kSerializer);
            }
        }
        for (Map.Entry<KClass<?>, Object> entry : this.c.entrySet()) {
            kClass = entry.getKey();
            l l4 = (l)entry.getValue();
            y.h(kClass, (String)"null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            y.h((Object)l4, (String)"null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            f4.b(kClass, (l)a1.e((Object)l4, (int)1));
        }
        for (Map.Entry<KClass<?>, Object> entry : this.e.entrySet()) {
            kClass = entry.getKey();
            l l5 = (l)entry.getValue();
            y.h(kClass, (String)"null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            y.h((Object)l5, (String)"null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            f4.a(kClass, (l)a1.e((Object)l5, (int)1));
        }
    }

    @Nullable
    public <T> KSerializer<T> b(@NotNull KClass<T> object, @NotNull List<? extends KSerializer<?>> object2) {
        y.j(object, (String)"kClass");
        y.j(object2, (String)"typeArgumentsSerializers");
        object = this.a.get(object);
        Object var3_3 = null;
        object = object != null ? object.a(object2) : null;
        object2 = var3_3;
        if (object instanceof KSerializer) {
            object2 = object;
        }
        return object2;
    }

    public boolean d() {
        return this.f;
    }

    @Nullable
    public <T> c<T> e(@NotNull KClass<? super T> l4, @Nullable String string) {
        y.j(l4, (String)"baseClass");
        KSerializer<Object> kSerializer = this.d.get(l4);
        Object var4_4 = null;
        kSerializer = kSerializer != null ? kSerializer.get(string) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l4 = a1.k((Object)(l4 = this.e.get(l4)), (int)1) ? (l)l4 : null;
        kSerializer = var4_4;
        if (l4 != null) {
            kSerializer = (c)l4.invoke(string);
        }
        return kSerializer;
    }

    @Nullable
    public <T> o<T> f(@NotNull KClass<? super T> l4, @NotNull T t3) {
        y.j(l4, (String)"baseClass");
        y.j(t3, (String)"value");
        boolean bl = l4.isInstance(t3);
        Object var5_4 = null;
        if (!bl) {
            return null;
        }
        Object object = this.b.get(l4);
        object = object != null ? object.get(v0.b(t3.getClass())) : null;
        if (!(object instanceof o)) {
            object = null;
        }
        if (object != null) {
            return object;
        }
        l4 = a1.k((Object)(l4 = this.c.get(l4)), (int)1) ? (l)l4 : null;
        object = var5_4;
        if (l4 != null) {
            object = (o)l4.invoke(t3);
        }
        return object;
    }
}

