/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.l0
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  kotlin.m
 *  kotlin.z
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.descriptors.SerialDescriptor$a
 *  kotlinx.serialization.descriptors.a
 *  kotlinx.serialization.descriptors.l
 *  kotlinx.serialization.internal.b2
 *  kotlinx.serialization.internal.i2
 *  kotlinx.serialization.internal.n
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.l0;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.n;
import kotlin.ranges.i;
import kotlin.ranges.j;
import kotlin.z;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.g;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010(\u001a\u00020\u0003\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0010G\u001a\u00020F\u00a2\u0006\u0004\bH\u0010IJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0019R \u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b\u001c\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0001018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u00104R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u00109R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0001018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u00104R\u001b\u0010D\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u0019\u00a8\u0006J"}, d2={"Lkotlinx/serialization/descriptors/h;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/n;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "i", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "serialName", "Lkotlinx/serialization/descriptors/l;", "b", "Lkotlinx/serialization/descriptors/l;", "getKind", "()Lkotlinx/serialization/descriptors/l;", "kind", "I", "e", "elementsCount", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "j", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "Lkotlin/m;", "m", "_hashCode", "typeParameters", "Lkotlinx/serialization/descriptors/a;", "builder", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/l;ILjava/util/List;Lkotlinx/serialization/descriptors/a;)V", "kotlinx-serialization-core"}, k=1, mv={2, 0, 0})
@SourceDebugExtension(value={"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,366:1\n37#2,2:367\n37#2,2:369\n1557#3:371\n1628#3,3:372\n16#4:375\n16#4:376\n16#4:377\n21#4:378\n111#5,10:379\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n336#1:367,2\n338#1:369,2\n340#1:371\n340#1:372,3\n344#1:375\n346#1:376\n347#1:377\n348#1:378\n351#1:379,10\n*E\n"})
public final class h
implements SerialDescriptor,
kotlinx.serialization.internal.n {
    @NotNull
    private final String a;
    @NotNull
    private final l b;
    private final int c;
    @NotNull
    private final List<Annotation> d;
    @NotNull
    private final Set<String> e;
    @NotNull
    private final String[] f;
    @NotNull
    private final SerialDescriptor[] g;
    @NotNull
    private final List<Annotation>[] h;
    @NotNull
    private final boolean[] i;
    @NotNull
    private final Map<String, Integer> j;
    @NotNull
    private final SerialDescriptor[] k;
    @NotNull
    private final m l;

    public h(@NotNull String object, @NotNull l object2, int n4, @NotNull List<? extends SerialDescriptor> list, @NotNull a a4) {
        y.j((Object)object, (String)"serialName");
        y.j((Object)object2, (String)"kind");
        y.j(list, (String)"typeParameters");
        y.j((Object)a4, (String)"builder");
        this.a = object;
        this.b = object2;
        this.c = n4;
        this.d = a4.c();
        this.e = t.c1((Iterable)a4.f());
        object = ((Collection)a4.f()).toArray(new String[0]);
        this.f = object;
        this.g = b2.b((List)a4.e());
        this.h = ((Collection)a4.d()).toArray(new List[0]);
        this.i = t.Z0((Collection)a4.g());
        object2 = kotlin.collections.l.n1((Object[])object);
        object = new ArrayList(t.x((Iterable)object2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            a4 = (l0)object2.next();
            object.add(z.a((Object)a4.b(), (Object)a4.a()));
        }
        this.j = s0.v((Iterable)object);
        this.k = b2.b(list);
        this.l = n.b(new f(this));
    }

    public static /* synthetic */ int j(h h4) {
        return kotlinx.serialization.descriptors.h.l(h4);
    }

    public static /* synthetic */ CharSequence k(h h4, int n4) {
        return kotlinx.serialization.descriptors.h.n(h4, n4);
    }

    private static final int l(h h4) {
        return i2.a((SerialDescriptor)h4, (SerialDescriptor[])h4.k);
    }

    private final int m() {
        return ((Number)this.l.getValue()).intValue();
    }

    private static final CharSequence n(h h4, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h4.f(n4));
        stringBuilder.append(": ");
        stringBuilder.append(h4.d(n4).h());
        return stringBuilder.toString();
    }

    @NotNull
    public Set<String> a() {
        return this.e;
    }

    public boolean b() {
        return SerialDescriptor.a.c((SerialDescriptor)this);
    }

    public int c(@NotNull String object) {
        y.j((Object)object, (String)"name");
        object = this.j.get(object);
        int n4 = object != null ? (Integer)object : -3;
        return n4;
    }

    @NotNull
    public SerialDescriptor d(int n4) {
        return this.g[n4];
    }

    public int e() {
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
        if (!(object instanceof h)) return false;
        String string = this.h();
        if (y.e((Object)string, (Object)(serialDescriptor = (SerialDescriptor)object).h())) {
            object = (h)object;
            if (Arrays.equals(this.k, ((h)object).k) && this.e() == serialDescriptor.e()) {
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
        return this.f[n4];
    }

    @NotNull
    public List<Annotation> g(int n4) {
        return this.h[n4];
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return this.d;
    }

    @NotNull
    public l getKind() {
        return this.b;
    }

    @NotNull
    public String h() {
        return this.a;
    }

    public int hashCode() {
        return this.m();
    }

    public boolean i(int n4) {
        return this.i[n4];
    }

    public boolean isInline() {
        return SerialDescriptor.a.b((SerialDescriptor)this);
    }

    @NotNull
    public String toString() {
        i i4 = kotlin.ranges.j.v(0, this.e());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h());
        stringBuilder.append('(');
        return t.B0(i4, ", ", stringBuilder.toString(), ")", 0, null, new g(this), 24, null);
    }
}

