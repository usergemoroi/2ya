/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  kotlin.q
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.SerialDescriptor$a
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.internal.b2
 *  kotlinx.serialization.internal.i2
 *  kotlinx.serialization.internal.j2
 *  kotlinx.serialization.internal.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.q;
import kotlin.ranges.i;
import kotlin.ranges.j;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.d2;
import kotlinx.serialization.internal.e2;
import kotlinx.serialization.internal.f2;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.i2;
import kotlinx.serialization.internal.j2;
import kotlinx.serialization.internal.n;
import kotlinx.serialization.internal.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010+\u0012\u0006\u00101\u001a\u00020\u0005\u00a2\u0006\u0004\bW\u0010XJ\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010'R\u001a\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0017\u00101\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u0010%R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0004038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00104R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u000106038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u00107R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010<R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010>R%\u0010E\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030@038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR!\u0010I\u001a\b\u0012\u0004\u0012\u00020\u0001038@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010%R\u0014\u0010P\u001a\u00020M8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040T8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010U\u00a8\u0006Y"}, d2={"Lkotlinx/serialization/internal/h2;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/n;", "", "", "", "q", "()Ljava/util/Map;", "name", "", "isOptional", "Lkotlin/k0;", "o", "(Ljava/lang/String;Z)V", "", "annotation", "v", "(Ljava/lang/annotation/Annotation;)V", "a", "w", "index", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "i", "(I)Z", "", "g", "(I)Ljava/util/List;", "f", "(I)Ljava/lang/String;", "c", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "h", "serialName", "Lkotlinx/serialization/internal/n0;", "b", "Lkotlinx/serialization/internal/n0;", "generatedSerializer", "I", "e", "elementsCount", "added", "", "[Ljava/lang/String;", "names", "", "[Ljava/util/List;", "propertiesAnnotations", "Ljava/util/List;", "classAnnotations", "", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lkotlinx/serialization/KSerializer;", "j", "Lkotlin/m;", "s", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "k", "t", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "l", "u", "_hashCode", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "()Ljava/util/Set;", "serialNames", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/n0;I)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@PublishedApi
@SourceDebugExtension(value={"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n16#2:135\n21#2:136\n16#2:137\n16#2:138\n111#3,10:139\n11165#4:149\n11500#4,3:150\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n40#1:149\n40#1:150,3\n*E\n"})
public class h2
implements SerialDescriptor,
n {
    @NotNull
    private final String a;
    @Nullable
    private final n0<?> b;
    private final int c;
    private int d;
    @NotNull
    private final String[] e;
    @NotNull
    private final List<Annotation>[] f;
    @Nullable
    private List<Annotation> g;
    @NotNull
    private final boolean[] h;
    @NotNull
    private Map<String, Integer> i;
    @NotNull
    private final m j;
    @NotNull
    private final m k;
    @NotNull
    private final m l;

    public h2(@NotNull String q4, @Nullable n0<?> n02, int n4) {
        y.j((Object)q4, (String)"serialName");
        this.a = q4;
        this.b = n02;
        this.c = n4;
        this.d = -1;
        q4 = new String[n4];
        for (int i4 = 0; i4 < n4; ++i4) {
            q4[i4] = "[UNINITIALIZED]";
        }
        this.e = q4;
        n4 = this.c;
        this.f = new List[n4];
        this.h = new boolean[n4];
        this.i = s0.j();
        q4 = q.d;
        this.j = kotlin.n.a(q4, new e2(this));
        this.k = kotlin.n.a(q4, new f2(this));
        this.l = kotlin.n.a(q4, new g2(this));
    }

    public /* synthetic */ h2(String string, n0 n02, int n4, int n5, p p4) {
        if ((n5 & 2) != 0) {
            n02 = null;
        }
        this(string, n02, n4);
    }

    public static /* synthetic */ CharSequence j(h2 h22, int n4) {
        return h2.x(h22, n4);
    }

    public static /* synthetic */ int k(h2 h22) {
        return h2.n(h22);
    }

    public static /* synthetic */ SerialDescriptor[] l(h2 h22) {
        return h2.y(h22);
    }

    public static /* synthetic */ KSerializer[] m(h2 h22) {
        return h2.r(h22);
    }

    private static final int n(h2 h22) {
        return i2.a((SerialDescriptor)h22, (SerialDescriptor[])h22.t());
    }

    public static /* synthetic */ void p(h2 h22, String string, boolean bl, int n4, Object object) {
        if (object == null) {
            if ((n4 & 2) != 0) {
                bl = false;
            }
            h22.o(string, bl);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map<String, Integer> q() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int n4 = this.e.length;
        for (int i4 = 0; i4 < n4; ++i4) {
            hashMap.put(this.e[i4], i4);
        }
        return hashMap;
    }

    private static final KSerializer[] r(h2 object) {
        block3: {
            block2: {
                object = object.b;
                if (object == null) break block2;
                KSerializer<?>[] kSerializerArray = object.childSerializers();
                object = kSerializerArray;
                if (kSerializerArray != null) break block3;
            }
            object = j2.a;
        }
        return object;
    }

    private final KSerializer<?>[] s() {
        return (KSerializer[])this.j.getValue();
    }

    private final int u() {
        return ((Number)this.l.getValue()).intValue();
    }

    private static final CharSequence x(h2 h22, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h22.f(n4));
        stringBuilder.append(": ");
        stringBuilder.append(h22.d(n4).h());
        return stringBuilder.toString();
    }

    private static final SerialDescriptor[] y(h2 object) {
        KSerializer<?>[] kSerializerArray;
        object = ((h2)object).b;
        if (object != null && (kSerializerArray = object.typeParametersSerializers()) != null) {
            ArrayList<SerialDescriptor> arrayList = new ArrayList<SerialDescriptor>(kSerializerArray.length);
            int n4 = kSerializerArray.length;
            int n5 = 0;
            while (true) {
                object = arrayList;
                if (n5 < n4) {
                    arrayList.add(kSerializerArray[n5].getDescriptor());
                    ++n5;
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        return b2.b((List)object);
    }

    @NotNull
    public Set<String> a() {
        return this.i.keySet();
    }

    public boolean b() {
        return SerialDescriptor.a.c((SerialDescriptor)this);
    }

    public int c(@NotNull String object) {
        y.j((Object)object, (String)"name");
        object = this.i.get(object);
        int n4 = object != null ? (Integer)object : -3;
        return n4;
    }

    @NotNull
    public SerialDescriptor d(int n4) {
        return this.s()[n4].getDescriptor();
    }

    public final int e() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(@Nullable Object object) {
        SerialDescriptor serialDescriptor;
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (!(object instanceof h2)) return false;
        String string = this.h();
        if (y.e((Object)string, (Object)(serialDescriptor = (SerialDescriptor)object).h())) {
            object = (h2)object;
            if (Arrays.equals(this.t(), ((h2)object).t()) && this.e() == serialDescriptor.e()) {
                int n4 = this.e();
                int n5 = 0;
                while (true) {
                    boolean bl2 = bl;
                    if (n5 >= n4) return bl2;
                    if (!y.e((Object)this.d(n5).h(), (Object)serialDescriptor.d(n5).h()) || !y.e((Object)this.d(n5).getKind(), (Object)serialDescriptor.d(n5).getKind())) break;
                    ++n5;
                }
            }
        }
        return false;
    }

    @NotNull
    public String f(int n4) {
        return this.e[n4];
    }

    @NotNull
    public List<Annotation> g(int n4) {
        List list;
        List list2 = list = this.f[n4];
        if (list == null) {
            list2 = t.m();
        }
        return list2;
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        List list;
        List list2 = list = this.g;
        if (list == null) {
            list2 = t.m();
        }
        return list2;
    }

    @NotNull
    public l getKind() {
        return m.a.a;
    }

    @NotNull
    public String h() {
        return this.a;
    }

    public int hashCode() {
        return this.u();
    }

    public boolean i(int n4) {
        return this.h[n4];
    }

    public boolean isInline() {
        return SerialDescriptor.a.b((SerialDescriptor)this);
    }

    public final void o(@NotNull String string, boolean bl) {
        int n4;
        y.j((Object)string, (String)"name");
        String[] stringArray = this.e;
        this.d = n4 = this.d + 1;
        stringArray[n4] = string;
        this.h[n4] = bl;
        this.f[n4] = null;
        if (n4 == this.c - 1) {
            this.i = this.q();
        }
    }

    @NotNull
    public final SerialDescriptor[] t() {
        return (SerialDescriptor[])this.k.getValue();
    }

    @NotNull
    public String toString() {
        i i4 = kotlin.ranges.j.v(0, this.c);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h());
        stringBuilder.append('(');
        return t.B0(i4, ", ", stringBuilder.toString(), ")", 0, null, new d2(this), 24, null);
    }

    public final void v(@NotNull Annotation annotation) {
        List<Annotation> list;
        y.j((Object)annotation, (String)"annotation");
        List<Annotation> list2 = list = this.f[this.d];
        if (list == null) {
            this.f[this.d] = list2 = new ArrayList<Annotation>(1);
        }
        list2.add(annotation);
    }

    public final void w(@NotNull Annotation annotation) {
        y.j((Object)annotation, (String)"a");
        if (this.g == null) {
            this.g = new ArrayList<Annotation>(1);
        }
        List<Annotation> list = this.g;
        y.g(list);
        list.add(annotation);
    }
}

