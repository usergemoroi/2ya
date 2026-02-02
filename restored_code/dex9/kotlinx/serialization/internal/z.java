/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.a
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.u
 *  kotlin.v
 *  kotlinx.serialization.internal.y1
 *  kotlinx.serialization.internal.z1
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.u;
import kotlin.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.internal.y1;
import kotlinx.serialization.internal.z1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r\u00a2\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR:\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u000eR*\u0010\u0015\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2={"Lkotlinx/serialization/internal/z;", "T", "Lkotlinx/serialization/internal/z1;", "Lkotlin/reflect/KClass;", "", "key", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/u;", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/p;", "compute", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/y1;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lkotlin/jvm/functions/p;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n72#2,2:220\n72#2,2:229\n1#3:222\n1#3:232\n212#4:223\n213#4:228\n214#4:231\n1557#5:224\n1628#5,3:225\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n158#1:220,2\n159#1:229,2\n158#1:222\n159#1:232\n159#1:223\n159#1:228\n159#1:231\n159#1:224\n159#1:225,3\n*E\n"})
final class z<T>
implements z1<T> {
    @NotNull
    private final p<KClass<Object>, List<? extends KType>, KSerializer<T>> a;
    @NotNull
    private final ConcurrentHashMap<Class<?>, y1<T>> b;

    public z(@NotNull p<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> p4) {
        y.j(p4, (String)"compute");
        this.a = p4;
        this.b = new ConcurrentHashMap();
    }

    @NotNull
    public Object a(@NotNull KClass<Object> object, @NotNull List<? extends KType> list) {
        Object object2;
        y.j(object, (String)"key");
        y.j(list, (String)"types");
        Serializable serializable = this.b;
        Serializable serializable2 = kotlin.jvm.a.a(object);
        Object object3 = object2 = serializable.get(serializable2);
        if (object2 == null && (object2 = serializable.putIfAbsent(serializable2, object3 = new y1())) != null) {
            object3 = object2;
        }
        object3 = (y1)object3;
        object2 = list;
        serializable = new ArrayList(t.x(object2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            serializable.add(new y0((KType)object2.next()));
        }
        serializable2 = y1.a(object3);
        object3 = object2 = serializable2.get(serializable);
        if (object2 == null) {
            try {
                object3 = u.d;
                object = u.b(this.a.invoke((KClass<Object>)object, list));
            }
            catch (Throwable throwable) {
                object = u.d;
                object = u.b((Object)v.a((Throwable)throwable));
            }
            object3 = u.a((Object)object);
            object = serializable2.putIfAbsent(serializable, object3);
            if (object != null) {
                object3 = object;
            }
        }
        y.i(object3, (String)"getOrPut(...)");
        return ((u)object3).j();
    }
}

