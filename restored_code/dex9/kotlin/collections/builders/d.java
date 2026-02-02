/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.builders.c
 *  kotlin.collections.builders.d$a
 *  kotlin.collections.builders.d$d
 *  kotlin.collections.builders.i
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.collections.builders.g;
import kotlin.collections.builders.i;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.e;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
@Metadata(d1={"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\n\b\u0000\u0018\u0000 M*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\b\u008d\u0001\u008e\u0001Z]`cBI\b\u0002\u0012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0016\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020\f\u0012\u0006\u0010h\u001a\u00020\f\u00a2\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001B\n\b\u0016\u00a2\u0006\u0005\b\u008a\u0001\u0010\u000bB\u0013\b\u0016\u0012\u0007\u0010\u008c\u0001\u001a\u00020\f\u00a2\u0006\u0005\b\u008a\u0001\u0010\u000fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0001\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0001\u0010\u000fJ\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\fH\u0002\u00a2\u0006\u0004\b!\u0010\u0013J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00028\u0001H\u0002\u00a2\u0006\u0004\b$\u0010\u001bJ\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b&\u0010\u000fJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b(\u0010\u000fJ\u001f\u0010+\u001a\u00020\u00112\u000e\u0010*\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030)H\u0002\u00a2\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0002\u00a2\u0006\u0004\b/\u00100J)\u00103\u001a\u00020\u00112\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-01H\u0002\u00a2\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)\u00a2\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010#\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b;\u0010:J\u001a\u0010<\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b<\u0010=J!\u0010>\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\t2\u0014\u00102\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)H\u0016\u00a2\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u00020\tH\u0016\u00a2\u0006\u0004\bC\u0010\u000bJ\u001a\u0010D\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0096\u0002\u00a2\u0006\u0004\bD\u0010:J\u000f\u0010E\u001a\u00020\fH\u0016\u00a2\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016\u00a2\u0006\u0004\bH\u0010IJ\u000f\u0010\r\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010J\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\bJ\u0010\u001bJ\u0017\u0010K\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\bK\u0010:J#\u0010L\u001a\u00020\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0000\u00a2\u0006\u0004\bL\u00100J\u001b\u0010M\u001a\u00020\u00112\n\u00105\u001a\u0006\u0012\u0002\b\u000301H\u0000\u00a2\u0006\u0004\bM\u00104J#\u0010N\u001a\u00020\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0000\u00a2\u0006\u0004\bN\u00100J\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00028\u0001H\u0000\u00a2\u0006\u0004\bP\u0010:J\u001b\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010QH\u0000\u00a2\u0006\u0004\bR\u0010SJ\u001b\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010TH\u0000\u00a2\u0006\u0004\bU\u0010VJ\u001b\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010WH\u0000\u00a2\u0006\u0004\bX\u0010YR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bZ\u0010[R\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010[R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020_8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\be\u0010!R\u0016\u0010h\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bg\u0010!R\u0016\u0010i\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bj\u0010!R$\u0010n\u001a\u00020\f2\u0006\u0010l\u001a\u00020\f8\u0016@RX\u0096\u000e\u00a2\u0006\f\n\u0004\bJ\u0010!\u001a\u0004\bm\u0010FR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010o8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010pR\u001e\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u0010sR$\u0010w\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010u8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010vR$\u0010z\u001a\u00020\u00112\u0006\u0010l\u001a\u00020\u00118\u0000@BX\u0080\u000e\u00a2\u0006\f\n\u0004\b\u001d\u0010x\u001a\u0004\by\u00108R\u0014\u0010|\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b{\u0010FR\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0081\u00018VX\u0096\u0004\u00a2\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u0087\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0085\u00010}8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u007fR\u0016\u0010\u0089\u0001\u001a\u00020\f8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010F\u00a8\u0006\u008f\u0001"}, d2={"Lkotlin/collections/builders/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Lkotlin/k0;", "J", "()V", "", "n", "t", "(I)V", "extraCapacity", "", "Q", "(I)Z", "minCapacity", "s", "", "l", "()[Ljava/lang/Object;", "key", "D", "(Ljava/lang/Object;)I", "updateHashArray", "o", "(Z)V", "newHashSize", "i", "I", "v", "value", "w", "index", "M", "removedHash", "N", "", "other", "r", "(Ljava/util/Map;)Z", "", "entry", "H", "(Ljava/util/Map$Entry;)Z", "", "from", "G", "(Ljava/util/Collection;)Z", "m", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "k", "O", "q", "p", "L", "element", "P", "Lkotlin/collections/builders/d$e;", "F", "()Lkotlin/collections/builders/d$e;", "Lkotlin/collections/builders/d$f;", "R", "()Lkotlin/collections/builders/d$f;", "Lkotlin/collections/builders/d$b;", "u", "()Lkotlin/collections/builders/d$b;", "c", "[Ljava/lang/Object;", "keysArray", "d", "valuesArray", "", "e", "[I", "presenceArray", "f", "hashArray", "g", "maxProbeDistance", "h", "length", "hashShift", "j", "modCount", "<set-?>", "B", "size", "Lkotlin/collections/builders/f;", "Lkotlin/collections/builders/f;", "keysView", "Lkotlin/collections/builders/g;", "Lkotlin/collections/builders/g;", "valuesView", "Lkotlin/collections/builders/e;", "Lkotlin/collections/builders/e;", "entriesView", "Z", "E", "isReadOnly", "z", "hashSize", "", "A", "()Ljava/util/Set;", "keys", "", "C", "()Ljava/util/Collection;", "values", "", "y", "entries", "x", "capacity", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "a", "b", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,733:1\n1#2:734\n*E\n"})
public final class d<K, V>
implements Map<K, V>,
Serializable,
kotlin.jvm.internal.markers.e {
    @NotNull
    public static final a p = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final d q;
    @NotNull
    private K[] c;
    @Nullable
    private V[] d;
    @NotNull
    private int[] e;
    @NotNull
    private int[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    @Nullable
    private kotlin.collections.builders.f<K> l;
    @Nullable
    private g<V> m;
    @Nullable
    private kotlin.collections.builders.e<K, V> n;
    private boolean o;

    static {
        d d4 = new d(0);
        d4.o = true;
        q = d4;
    }

    public d() {
        this(8);
    }

    public d(int n4) {
        this(kotlin.collections.builders.c.d((int)n4), null, new int[n4], new int[a.a(p, (int)n4)], 2, 0);
    }

    private d(K[] KArray, V[] VArray, int[] nArray, int[] nArray2, int n4, int n5) {
        this.c = KArray;
        this.d = VArray;
        this.e = nArray;
        this.f = nArray2;
        this.g = n4;
        this.h = n5;
        this.i = a.b(p, (int)this.z());
    }

    private final int D(K k2) {
        int n4 = k2 != null ? k2.hashCode() : 0;
        return n4 * -1640531527 >>> this.i;
    }

    private final boolean G(Collection<? extends Map.Entry<? extends K, ? extends V>> object) {
        boolean bl = object.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        this.t(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            if (!this.H((Map.Entry)object.next())) continue;
            bl2 = true;
        }
        return bl2;
    }

    private final boolean H(Map.Entry<? extends K, ? extends V> entry) {
        int n4 = this.k(entry.getKey());
        V[] VArray = this.l();
        if (n4 >= 0) {
            VArray[n4] = entry.getValue();
            return true;
        }
        n4 = -n4 - 1;
        V v3 = VArray[n4];
        if (!y.e(entry.getValue(), v3)) {
            VArray[n4] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean I(int n4) {
        int n5 = this.D(this.c[n4]);
        int n6 = this.g;
        while (true) {
            int[] nArray;
            if ((nArray = this.f)[n5] == 0) {
                nArray[n5] = n4 + 1;
                this.e[n4] = n5;
                return true;
            }
            if (--n6 < 0) {
                return false;
            }
            if (n5 == 0) {
                n5 = this.z() - 1;
                continue;
            }
            --n5;
        }
    }

    private final void J() {
        ++this.j;
    }

    private final void K(int n4) {
        this.J();
        int n5 = this.h;
        int n6 = this.size();
        int n7 = 0;
        if (n5 > n6) {
            this.o(false);
        }
        this.f = new int[n4];
        this.i = a.b(p, (int)n4);
        for (n4 = n7; n4 < this.h; ++n4) {
            if (this.I(n4)) {
                continue;
            }
            throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        }
    }

    private final void M(int n4) {
        kotlin.collections.builders.c.f((Object[])this.c, (int)n4);
        Object[] objectArray = this.d;
        if (objectArray != null) {
            kotlin.collections.builders.c.f((Object[])objectArray, (int)n4);
        }
        this.N(this.e[n4]);
        this.e[n4] = -1;
        this.k = this.size() - 1;
        this.J();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void N(int n4) {
        int n5;
        int n6 = kotlin.ranges.j.i(this.g * 2, this.z() / 2);
        int n7 = 0;
        int n8 = n4;
        do {
            int n9;
            block8: {
                block7: {
                    int n10;
                    block6: {
                        n4 = n4 == 0 ? this.z() - 1 : --n4;
                        n5 = n7 + 1;
                        if (n5 > this.g) {
                            this.f[n8] = 0;
                            return;
                        }
                        int[] nArray = this.f;
                        n10 = nArray[n4];
                        if (n10 == 0) {
                            nArray[n8] = 0;
                            return;
                        }
                        if (n10 >= 0) break block6;
                        nArray[n8] = -1;
                        break block7;
                    }
                    K[] KArray = this.c;
                    int n11 = n10 - 1;
                    n9 = n8;
                    n7 = n5;
                    if ((this.D(KArray[n11]) - n4 & this.z() - 1) < n5) break block8;
                    this.f[n8] = n10;
                    this.e[n11] = n8;
                }
                n9 = n4;
                n7 = 0;
            }
            n5 = n6 - 1;
            n8 = n9;
            n6 = n5;
        } while (n5 >= 0);
        this.f[n9] = -1;
    }

    private final boolean Q(int n4) {
        int n5 = this.x();
        int n6 = this.h;
        n5 -= n6;
        boolean bl = n5 < n4 && n5 + (n6 -= this.size()) >= n4 && n6 >= this.x() / 4;
        return bl;
    }

    public static final /* synthetic */ d b() {
        return q;
    }

    public static final /* synthetic */ int f(d d4) {
        return d4.j;
    }

    public static final /* synthetic */ int[] g(d d4) {
        return d4.e;
    }

    public static final /* synthetic */ void i(d d4, int n4) {
        d4.M(n4);
    }

    private final V[] l() {
        Object[] objectArray = this.d;
        if (objectArray != null) {
            return objectArray;
        }
        this.d = objectArray = kotlin.collections.builders.c.d((int)this.x());
        return objectArray;
    }

    private final void o(boolean bl) {
        int n4;
        Object[] objectArray = this.d;
        int n5 = 0;
        for (int i4 = 0; i4 < (n4 = this.h); ++i4) {
            int[] nArray = this.e;
            int n6 = nArray[i4];
            n4 = n5;
            if (n6 >= 0) {
                K[] KArray = this.c;
                KArray[n5] = KArray[i4];
                if (objectArray != null) {
                    objectArray[n5] = objectArray[i4];
                }
                if (bl) {
                    nArray[n5] = n6;
                    this.f[n6] = n5 + 1;
                }
                n4 = n5 + 1;
            }
            n5 = n4;
        }
        kotlin.collections.builders.c.g((Object[])this.c, (int)n5, (int)n4);
        if (objectArray != null) {
            kotlin.collections.builders.c.g((Object[])objectArray, (int)n5, (int)this.h);
        }
        this.h = n5;
    }

    private final boolean r(Map<?, ?> map2) {
        boolean bl = this.size() == map2.size() && this.p((Collection)map2.entrySet());
        return bl;
    }

    private final void s(int n4) {
        if (n4 >= 0) {
            if (n4 > this.x()) {
                n4 = kotlin.collections.c.Companion.e(this.x(), n4);
                this.c = kotlin.collections.builders.c.e((Object[])this.c, (int)n4);
                Object object = this.d;
                object = object != null ? kotlin.collections.builders.c.e((Object[])object, (int)n4) : null;
                this.d = object;
                object = Arrays.copyOf(this.e, n4);
                y.i((Object)object, (String)"copyOf(...)");
                this.e = (int[])object;
                n4 = a.a(p, (int)n4);
                if (n4 > this.z()) {
                    this.K(n4);
                }
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void t(int n4) {
        if (this.Q(n4)) {
            this.o(true);
        } else {
            this.s(this.h + n4);
        }
    }

    private final int v(K k2) {
        int n4 = this.D(k2);
        int n5 = this.g;
        int n6;
        while ((n6 = this.f[n4]) != 0) {
            K[] KArray;
            if (n6 > 0 && y.e((KArray = this.c)[--n6], k2)) {
                return n6;
            }
            if (--n5 < 0) {
                return -1;
            }
            if (n4 == 0) {
                n4 = this.z() - 1;
                continue;
            }
            --n4;
        }
        return -1;
    }

    private final int w(V v3) {
        int n4;
        int n5 = this.h;
        while ((n4 = n5 - 1) >= 0) {
            n5 = n4;
            if (this.e[n4] < 0) continue;
            V[] VArray = this.d;
            y.g(VArray);
            n5 = n4;
            if (!y.e(VArray[n4], v3)) continue;
            return n4;
        }
        return -1;
    }

    private final Object writeReplace() {
        if (this.o) {
            return new i((Map)this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int z() {
        return this.f.length;
    }

    @NotNull
    public Set<K> A() {
        kotlin.collections.builders.f<K> f4;
        kotlin.collections.builders.f<Object> f5 = f4 = this.l;
        if (f4 == null) {
            this.l = f5 = new kotlin.collections.builders.f(this);
        }
        return f5;
    }

    public int B() {
        return this.k;
    }

    @NotNull
    public Collection<V> C() {
        g<V> g4;
        g<V> g5 = g4 = this.m;
        if (g4 == null) {
            this.m = g5 = new g(this);
        }
        return g5;
    }

    public final boolean E() {
        return this.o;
    }

    @NotNull
    public final e<K, V> F() {
        return new e(this);
    }

    public final boolean L(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        y.j(entry, (String)"entry");
        this.n();
        int n4 = this.v(entry.getKey());
        if (n4 < 0) {
            return false;
        }
        V[] VArray = this.d;
        y.g(VArray);
        if (!y.e(VArray[n4], entry.getValue())) {
            return false;
        }
        this.M(n4);
        return true;
    }

    public final boolean O(K k2) {
        this.n();
        int n4 = this.v(k2);
        if (n4 < 0) {
            return false;
        }
        this.M(n4);
        return true;
    }

    public final boolean P(V v3) {
        this.n();
        int n4 = this.w(v3);
        if (n4 < 0) {
            return false;
        }
        this.M(n4);
        return true;
    }

    @NotNull
    public final f<K, V> R() {
        return new f(this);
    }

    @Override
    public void clear() {
        Object[] objectArray;
        this.n();
        int n4 = this.h - 1;
        if (n4 >= 0) {
            int n5 = 0;
            while (true) {
                int n6;
                if ((n6 = (objectArray = this.e)[n5]) >= 0) {
                    this.f[n6] = 0;
                    objectArray[n5] = -1;
                }
                if (n5 == n4) break;
                ++n5;
            }
        }
        kotlin.collections.builders.c.g((Object[])this.c, (int)0, (int)this.h);
        objectArray = this.d;
        if (objectArray != null) {
            kotlin.collections.builders.c.g((Object[])objectArray, (int)0, (int)this.h);
        }
        this.k = 0;
        this.h = 0;
        this.J();
    }

    @Override
    public boolean containsKey(Object object) {
        boolean bl = this.v(object) >= 0;
        return bl;
    }

    @Override
    public boolean containsValue(Object object) {
        boolean bl = this.w(object) >= 0;
        return bl;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl = object == this || object instanceof Map && this.r((Map)object);
        return bl;
    }

    @Override
    @Nullable
    public V get(Object VArray) {
        int n4 = this.v(VArray);
        if (n4 < 0) {
            return null;
        }
        VArray = this.d;
        y.g(VArray);
        return VArray[n4];
    }

    @Override
    public int hashCode() {
        b<K, V> b4 = this.u();
        int n4 = 0;
        while (b4.hasNext()) {
            n4 += b4.l();
        }
        return n4;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.size() == 0;
        return bl;
    }

    public final int k(K k2) {
        this.n();
        block0: while (true) {
            int n4 = this.D(k2);
            int n5 = kotlin.ranges.j.i(this.g * 2, this.z() / 2);
            int n6 = 0;
            while (true) {
                int n7;
                if ((n7 = this.f[n4]) <= 0) {
                    if (this.h >= this.x()) {
                        this.t(1);
                        continue block0;
                    }
                    n5 = this.h;
                    this.h = n7 = n5 + 1;
                    this.c[n5] = k2;
                    this.e[n5] = n4;
                    this.f[n4] = n7;
                    this.k = this.size() + 1;
                    this.J();
                    if (n6 > this.g) {
                        this.g = n6;
                    }
                    return n5;
                }
                if (y.e(this.c[n7 - 1], k2)) {
                    return -n7;
                }
                if (++n6 > n5) {
                    this.K(this.z() * 2);
                    continue block0;
                }
                if (n4 == 0) {
                    n4 = this.z() - 1;
                    continue;
                }
                --n4;
            }
            break;
        }
    }

    @NotNull
    public final Map<K, V> m() {
        d d4;
        this.n();
        this.o = true;
        if (this.size() > 0) {
            d4 = this;
        } else {
            d4 = q;
            y.h((Object)d4, (String)"null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return d4;
    }

    public final void n() {
        if (!this.o) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean p(@NotNull Collection<?> iterator) {
        y.j(iterator, (String)"m");
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object e4 = iterator.next();
            if (e4 != null) {
                boolean bl = this.q((Map.Entry)e4);
                if (bl) continue;
            }
            return false;
        }
        return true;
        // Removed invalid catch block
        }
    }

    @Override
    @Nullable
    public V put(K object, V v3) {
        this.n();
        int n4 = this.k(object);
        V[] VArray = this.l();
        if (n4 < 0) {
            n4 = -n4 - 1;
            object = VArray[n4];
            VArray[n4] = v3;
            return (V)object;
        }
        VArray[n4] = v3;
        return null;
    }

    @Override
    public void putAll(@NotNull Map<? extends K, ? extends V> map2) {
        y.j(map2, (String)"from");
        this.n();
        this.G((Collection)map2.entrySet());
    }

    public final boolean q(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        y.j(entry, (String)"entry");
        int n4 = this.v(entry.getKey());
        if (n4 < 0) {
            return false;
        }
        V[] VArray = this.d;
        y.g(VArray);
        return y.e(VArray[n4], entry.getValue());
    }

    @Override
    @Nullable
    public V remove(Object object) {
        this.n();
        int n4 = this.v(object);
        if (n4 < 0) {
            return null;
        }
        object = this.d;
        y.g(object);
        object = object[n4];
        this.M(n4);
        return (V)object;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 3 + 2);
        stringBuilder.append("{");
        Object object = this.u();
        int n4 = 0;
        while (object.hasNext()) {
            if (n4 > 0) {
                stringBuilder.append(", ");
            }
            ((b)object).k(stringBuilder);
            ++n4;
        }
        stringBuilder.append("}");
        object = stringBuilder.toString();
        y.i((Object)object, (String)"toString(...)");
        return object;
    }

    @NotNull
    public final b<K, V> u() {
        return new b(this);
    }

    public final int x() {
        return this.c.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> y() {
        kotlin.collections.builders.e<K, V> e4;
        kotlin.collections.builders.e<K, V> e5 = e4 = this.n;
        if (e4 == null) {
            this.n = e5 = new kotlin.collections.builders.e(this);
        }
        return e5;
    }

    @Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0012\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2={"Lkotlin/collections/builders/d$b;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "", "Lkotlin/collections/builders/d$c;", "i", "()Lkotlin/collections/builders/d$c;", "", "l", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Lkotlin/k0;", "k", "(Ljava/lang/StringBuilder;)V", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static final class b<K, V>
    extends d<K, V>
    implements Iterator<Map.Entry<K, V>>,
    kotlin.jvm.internal.markers.a {
        public b(@NotNull d<K, V> d4) {
            y.j(d4, (String)"map");
            super(d4);
        }

        @NotNull
        public c<K, V> i() {
            this.a();
            if (this.b() < this.e().h) {
                int n4 = this.b();
                this.g(n4 + 1);
                this.h(n4);
                c c4 = new c(this.e(), this.d());
                this.f();
                return c4;
            }
            throw new NoSuchElementException();
        }

        public final void k(@NotNull StringBuilder stringBuilder) {
            y.j((Object)stringBuilder, (String)"sb");
            if (this.b() < this.e().h) {
                int n4 = this.b();
                this.g(n4 + 1);
                this.h(n4);
                Object object = this.e().c[this.d()];
                if (object == this.e()) {
                    stringBuilder.append("(this Map)");
                } else {
                    stringBuilder.append(object);
                }
                stringBuilder.append('=');
                object = this.e().d;
                y.g((Object)object);
                object = object[this.d()];
                if (object == this.e()) {
                    stringBuilder.append("(this Map)");
                } else {
                    stringBuilder.append(object);
                }
                this.f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int l() {
            if (this.b() < this.e().h) {
                int n4 = this.b();
                this.g(n4 + 1);
                this.h(n4);
                Object object = this.e().c[this.d()];
                int n5 = 0;
                n4 = object != null ? object.hashCode() : 0;
                object = this.e().d;
                y.g((Object)object);
                object = object[this.d()];
                if (object != null) {
                    n5 = object.hashCode();
                }
                this.f();
                return n4 ^ n5;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0006\u0010\u0018\u001a\u00020\f\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00028\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u00a8\u0006 "}, d2={"Lkotlin/collections/builders/d$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/collections/builders/d;", "c", "Lkotlin/collections/builders/d;", "map", "d", "I", "index", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "<init>", "(Lkotlin/collections/builders/d;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static final class c<K, V>
    implements Map.Entry<K, V>,
    e.a {
        @NotNull
        private final d<K, V> c;
        private final int d;

        public c(@NotNull d<K, V> d4, int n4) {
            y.j(d4, (String)"map");
            this.c = d4;
            this.d = n4;
        }

        @Override
        public boolean equals(@Nullable Object object) {
            boolean bl = object instanceof Map.Entry && y.e((object = (Map.Entry)object).getKey(), this.getKey()) && y.e(object.getValue(), this.getValue());
            return bl;
        }

        @Override
        public K getKey() {
            return (K)((d)this.c).c[this.d];
        }

        @Override
        public V getValue() {
            Object[] objectArray = ((d)this.c).d;
            y.g((Object)objectArray);
            return (V)objectArray[this.d];
        }

        @Override
        public int hashCode() {
            Object object = this.getKey();
            int n4 = 0;
            int n5 = object != null ? object.hashCode() : 0;
            object = this.getValue();
            if (object != null) {
                n4 = object.hashCode();
            }
            return n5 ^ n4;
        }

        @Override
        public V setValue(V v3) {
            this.c.n();
            Object[] objectArray = ((d)this.c).l();
            int n4 = this.d;
            Object object = objectArray[n4];
            objectArray[n4] = v3;
            return (V)object;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append('=');
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lkotlin/collections/builders/d$e;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "next", "()Ljava/lang/Object;", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static final class e<K, V>
    extends d<K, V>
    implements Iterator<K>,
    kotlin.jvm.internal.markers.a {
        public e(@NotNull d<K, V> d4) {
            y.j(d4, (String)"map");
            super(d4);
        }

        @Override
        public K next() {
            this.a();
            if (this.b() < this.e().h) {
                int n4 = this.b();
                this.g(n4 + 1);
                this.h(n4);
                Object object = this.e().c[this.d()];
                this.f();
                return (K)object;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lkotlin/collections/builders/d$f;", "K", "V", "Lkotlin/collections/builders/d$d;", "", "next", "()Ljava/lang/Object;", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    public static final class f<K, V>
    extends d<K, V>
    implements Iterator<V>,
    kotlin.jvm.internal.markers.a {
        public f(@NotNull d<K, V> d4) {
            y.j(d4, (String)"map");
            super(d4);
        }

        @Override
        public V next() {
            this.a();
            if (this.b() < this.e().h) {
                int n4 = this.b();
                this.g(n4 + 1);
                this.h(n4);
                Object object = this.e().d;
                y.g((Object)object);
                object = object[this.d()];
                this.f();
                return (V)object;
            }
            throw new NoSuchElementException();
        }
    }
}

