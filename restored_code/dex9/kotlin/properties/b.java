/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.properties.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0011\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lkotlin/properties/b;", "V", "Lkotlin/properties/e;", "", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "beforeChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlin/k0;", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
public abstract class b<V>
implements e<Object, V> {
    private V value;

    public b(V v3) {
        this.value = v3;
    }

    protected void afterChange(@NotNull KProperty<?> kProperty, V v3, V v4) {
        y.j(kProperty, (String)"property");
    }

    protected boolean beforeChange(@NotNull KProperty<?> kProperty, V v3, V v4) {
        y.j(kProperty, (String)"property");
        return true;
    }

    @Override
    public V getValue(@Nullable Object object, @NotNull KProperty<?> kProperty) {
        y.j(kProperty, (String)"property");
        return this.value;
    }

    @Override
    public void setValue(@Nullable Object object, @NotNull KProperty<?> kProperty, V v3) {
        y.j(kProperty, (String)"property");
        object = this.value;
        if (!this.beforeChange(kProperty, object, v3)) {
            return;
        }
        this.value = v3;
        this.afterChange(kProperty, object, v3);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ObservableProperty(value=");
        stringBuilder.append(this.value);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

