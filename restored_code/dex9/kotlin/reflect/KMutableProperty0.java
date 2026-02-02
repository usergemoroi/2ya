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
import kotlin.jvm.functions.l;
import kotlin.k0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2={"Lkotlin/reflect/KMutableProperty0;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/KMutableProperty;", "value", "Lkotlin/k0;", "set", "(Ljava/lang/Object;)V", "Lkotlin/reflect/KMutableProperty0$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty0$Setter;", "getSetter$annotations", "()V", "setter", "Setter", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public interface KMutableProperty0<V>
extends KProperty0<V>,
KMutableProperty<V> {
    @Override
    @NotNull
    public Setter<V> getSetter();

    @Override
    public /* synthetic */ Object invoke();

    public void set(V var1);

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u00a8\u0006\u0005"}, d2={"Lkotlin/reflect/KMutableProperty0$Setter;", "V", "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function1;", "Lkotlin/k0;", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static interface Setter<V>
    extends KMutableProperty.Setter<V>,
    l<V, k0> {
        @Override
        public /* synthetic */ Object invoke(Object var1);
    }
}

