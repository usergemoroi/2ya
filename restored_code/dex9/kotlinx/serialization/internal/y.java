/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.a
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.internal.m
 *  kotlinx.serialization.internal.s2
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.m;
import kotlinx.serialization.internal.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u000b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\t\u00a2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bR,\u0010\u000b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\nR*\u0010\u0011\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/internal/y;", "T", "Lkotlinx/serialization/internal/s2;", "Lkotlin/reflect/KClass;", "", "key", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/l;", "compute", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/m;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/l;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n72#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n142#1:220,2\n142#1:222\n*E\n"})
final class y<T>
implements s2<T> {
    @NotNull
    private final l<KClass<?>, KSerializer<T>> a;
    @NotNull
    private final ConcurrentHashMap<Class<?>, m<T>> b;

    public y(@NotNull l<? super KClass<?>, ? extends KSerializer<T>> l4) {
        kotlin.jvm.internal.y.j(l4, (String)"compute");
        this.a = l4;
        this.b = new ConcurrentHashMap();
    }

    @Nullable
    public KSerializer<T> a(@NotNull KClass<Object> kClass) {
        Object v3;
        kotlin.jvm.internal.y.j(kClass, (String)"key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.b;
        Class clazz = kotlin.jvm.a.a(kClass);
        Object object = v3 = concurrentHashMap.get(clazz);
        if (v3 == null && (kClass = concurrentHashMap.putIfAbsent(clazz, (m<T>)(object = new m(this.a.invoke(kClass))))) != null) {
            object = kClass;
        }
        return ((m)object).a;
    }
}

