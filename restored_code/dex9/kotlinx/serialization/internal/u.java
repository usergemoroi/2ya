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
 *  kotlinx.serialization.internal.m1
 *  kotlinx.serialization.internal.s
 *  kotlinx.serialization.internal.v
 *  kotlinx.serialization.internal.y1
 *  kotlinx.serialization.internal.z1
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.s;
import kotlinx.serialization.internal.v;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.internal.y1;
import kotlinx.serialization.internal.z1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r\u00a2\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR:\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lkotlinx/serialization/internal/u;", "T", "Lkotlinx/serialization/internal/z1;", "Lkotlin/reflect/KClass;", "", "key", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/u;", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/p;", "compute", "Lkotlinx/serialization/internal/v;", "Lkotlinx/serialization/internal/y1;", "b", "Lkotlinx/serialization/internal/v;", "classValue", "<init>", "(Lkotlin/jvm/functions/p;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n1#3:234\n212#4:225\n213#4:230\n214#4:233\n1557#5:226\n1628#5,3:227\n72#6,2:231\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n128#1:220,3\n128#1:224\n128#1:223\n129#1:234\n129#1:225\n129#1:230\n129#1:233\n129#1:226\n129#1:227,3\n129#1:231,2\n*E\n"})
final class u<T>
implements z1<T> {
    @NotNull
    private final p<KClass<Object>, List<? extends KType>, KSerializer<T>> a;
    @NotNull
    private final v<y1<T>> b;

    public u(@NotNull p<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> p4) {
        y.j(p4, (String)"compute");
        this.a = p4;
        this.b = new v();
    }

    @NotNull
    public Object a(@NotNull KClass<Object> object, @NotNull List<? extends KType> a4) {
        y.j(object, (String)"key");
        y.j(a4, (String)"types");
        Object object2 = s.a(this.b, (Class)kotlin.jvm.a.a(object));
        y.i((Object)object2, (String)"get(...)");
        Object object3 = (m1)object2;
        object2 = object3.a.get();
        if (object2 == null) {
            object2 = object3.a(new a<T>(){

                @Override
                public final T invoke() {
                    return new y1();
                }
            });
        }
        object2 = (y1)object2;
        object3 = (Iterable)a4;
        ArrayList<y0> arrayList = new ArrayList<y0>(t.x((Iterable)object3, 10));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            arrayList.add(new y0((KType)object3.next()));
        }
        ConcurrentHashMap concurrentHashMap = y1.a((y1)object2);
        object3 = concurrentHashMap.get(arrayList);
        object2 = object3;
        if (object3 == null) {
            try {
                object2 = kotlin.u.d;
                object = kotlin.u.b(this.a.invoke((KClass<Object>)object, (List<KType>)((List<? extends KType>)a4)));
            }
            catch (Throwable throwable) {
                a4 = kotlin.u.d;
                object = kotlin.u.b((Object)kotlin.v.a((Throwable)throwable));
            }
            object2 = kotlin.u.a((Object)object);
            object = concurrentHashMap.putIfAbsent(arrayList, object2);
            if (object != null) {
                object2 = object;
            }
        }
        y.i((Object)object2, (String)"getOrPut(...)");
        return ((kotlin.u)object2).j();
    }
}

