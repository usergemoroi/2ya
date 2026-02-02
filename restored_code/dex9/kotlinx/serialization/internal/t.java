/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.a
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.internal.m
 *  kotlinx.serialization.internal.m1
 *  kotlinx.serialization.internal.s
 *  kotlinx.serialization.internal.s2
 *  kotlinx.serialization.internal.v
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.m;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.s;
import kotlinx.serialization.internal.s2;
import kotlinx.serialization.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\r\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\t\u00a2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bR/\u0010\r\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\t8\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lkotlinx/serialization/internal/t;", "T", "Lkotlinx/serialization/internal/s2;", "Lkotlin/reflect/KClass;", "", "key", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/l;", "b", "()Lkotlin/jvm/functions/l;", "compute", "Lkotlinx/serialization/internal/v;", "Lkotlinx/serialization/internal/m;", "Lkotlinx/serialization/internal/v;", "classValue", "<init>", "(Lkotlin/jvm/functions/l;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:220,3\n52#1:224\n52#1:223\n*E\n"})
final class t<T>
implements s2<T> {
    @NotNull
    private final l<KClass<?>, KSerializer<T>> a;
    @NotNull
    private final v<m<T>> b;

    public t(@NotNull l<? super KClass<?>, ? extends KSerializer<T>> l4) {
        y.j(l4, (String)"compute");
        this.a = l4;
        this.b = new v();
    }

    @Nullable
    public KSerializer<T> a(@NotNull KClass<Object> object) {
        y.j(object, (String)"key");
        Object object2 = s.a(this.b, (Class)kotlin.jvm.a.a(object));
        y.i((Object)object2, (String)"get(...)");
        m1 m12 = (m1)object2;
        object2 = m12.a.get();
        object = object2 != null ? object2 : m12.a(new kotlin.jvm.functions.a<T>(this, (KClass)object){
            final t c;
            final KClass d;
            {
                this.c = t3;
                this.d = kClass;
            }

            @Override
            public final T invoke() {
                return new m(this.c.b().invoke(this.d));
            }
        });
        return ((m)object).a;
    }

    @NotNull
    public final l<KClass<?>, KSerializer<T>> b() {
        return this.a;
    }
}

