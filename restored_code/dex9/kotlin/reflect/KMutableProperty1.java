/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.k0
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0010J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&\u00a2\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2={"Lkotlin/reflect/KMutableProperty1;", "T", "V", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/KMutableProperty;", "receiver", "value", "Lkotlin/k0;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/KMutableProperty1$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty1$Setter;", "getSetter$annotations", "()V", "setter", "Setter", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public interface KMutableProperty1<T, V>
extends KProperty1<T, V>,
KMutableProperty<V> {
    @NotNull
    public Setter<T, V> getSetter();

    @Override
    public /* synthetic */ Object invoke(Object var1);

    public void set(T var1, V var2);

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0006"}, d2={"Lkotlin/reflect/KMutableProperty1$Setter;", "T", "V", "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function2;", "Lkotlin/k0;", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static interface Setter<T, V>
    extends KMutableProperty.Setter<V>,
    p<T, V, k0> {
        @Override
        public /* synthetic */ Object invoke(Object var1, Object var2);
    }
}

