/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.f
 *  kotlin.jvm.internal.y
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.internal.a2
 *  org.jetbrains.annotations.NotNull
 */
package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.l;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.y;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.a2;
import kotlinx.serialization.internal.d;
import kotlinx.serialization.internal.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(\u00a2\u0006\u0004\b*\u0010+J\u0019\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014\u00a2\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014\u00a2\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014\u00a2\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014\u00a2\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u00020\u0017*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0016\u001a\u00020\bH\u0014\u00a2\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u0017*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0001H\u0014\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u00a8\u0006,"}, d2={"Lkotlinx/serialization/internal/p2;", "", "ElementKlass", "Element", "Lkotlinx/serialization/internal/w;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "s", "([Ljava/lang/Object;)I", "", "r", "([Ljava/lang/Object;)Ljava/util/Iterator;", "o", "()Ljava/util/ArrayList;", "p", "(Ljava/util/ArrayList;)I", "v", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "u", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "Lkotlin/k0;", "q", "(Ljava/util/ArrayList;I)V", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
public final class p2<ElementKlass, Element extends ElementKlass>
extends w<Element, Element[], ArrayList<Element>> {
    @NotNull
    private final KClass<ElementKlass> b;
    @NotNull
    private final SerialDescriptor c;

    public p2(@NotNull KClass<ElementKlass> kClass, @NotNull KSerializer<Element> kSerializer) {
        y.j(kClass, (String)"kClass");
        y.j(kSerializer, (String)"eSerializer");
        super(kSerializer, null);
        this.b = kClass;
        this.c = new d(kSerializer.getDescriptor());
    }

    @Override
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    @NotNull
    protected ArrayList<Element> o() {
        return new ArrayList();
    }

    protected int p(@NotNull ArrayList<Element> arrayList) {
        y.j(arrayList, (String)"<this>");
        return arrayList.size();
    }

    protected void q(@NotNull ArrayList<Element> arrayList, int n4) {
        y.j(arrayList, (String)"<this>");
        arrayList.ensureCapacity(n4);
    }

    @NotNull
    protected Iterator<Element> r(@NotNull Element[] ElementArray) {
        y.j(ElementArray, (String)"<this>");
        return f.a((Object[])ElementArray);
    }

    protected int s(@NotNull Element[] ElementArray) {
        y.j(ElementArray, (String)"<this>");
        return ElementArray.length;
    }

    protected void t(@NotNull ArrayList<Element> arrayList, int n4, Element Element) {
        y.j(arrayList, (String)"<this>");
        arrayList.add(n4, Element);
    }

    @NotNull
    protected ArrayList<Element> u(@NotNull Element[] ElementArray) {
        y.j(ElementArray, (String)"<this>");
        return new ArrayList(l.e(ElementArray));
    }

    @NotNull
    protected Element[] v(@NotNull ArrayList<Element> arrayList) {
        y.j(arrayList, (String)"<this>");
        return a2.r(arrayList, this.b);
    }
}

