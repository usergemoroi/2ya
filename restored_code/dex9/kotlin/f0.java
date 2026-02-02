/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalUnsignedTypes
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.e0
 *  kotlin.jvm.JvmInline
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.markers.a
 *  kotlin.jvm.internal.o
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.l;
import kotlin.e0;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003\u00a2\u0006\u0004\b(\u0010)B\u0011\b\u0001\u0012\u0006\u0010%\u001a\u00020 \u00a2\u0006\u0004\b*\u0010+J\u001b\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 \u0082\u0002\u0004\n\u0002\b!\u00a8\u0006-"}, d2={"Lkotlin/f0;", "", "Lkotlin/e0;", "", "index", "k", "([JI)J", "value", "Lkotlin/k0;", "q", "([JIJ)V", "", "p", "([J)Ljava/util/Iterator;", "element", "", "g", "([JJ)Z", "elements", "h", "([JLjava/util/Collection;)Z", "o", "([J)Z", "", "r", "([J)Ljava/lang/String;", "n", "([J)I", "", "other", "i", "([JLjava/lang/Object;)Z", "", "c", "[J", "getStorage$annotations", "()V", "storage", "m", "size", "d", "(I)[J", "e", "([J)[J", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@JvmInline
@ExperimentalUnsignedTypes
@SinceKotlin(version="1.3")
@SourceDebugExtension(value={"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n63#1:88,3\n*E\n"})
public final class f0
implements Collection<e0>,
kotlin.jvm.internal.markers.a {
    @NotNull
    private final long[] c;

    @PublishedApi
    private /* synthetic */ f0(long[] lArray) {
        this.c = lArray;
    }

    public static final /* synthetic */ f0 a(long[] lArray) {
        return new f0(lArray);
    }

    @NotNull
    public static long[] d(int n4) {
        return f0.e(new long[n4]);
    }

    @PublishedApi
    @NotNull
    public static long[] e(@NotNull long[] lArray) {
        y.j((Object)lArray, (String)"storage");
        return lArray;
    }

    public static boolean g(long[] lArray, long l4) {
        return l.b0(lArray, l4);
    }

    public static boolean h(long[] lArray, @NotNull Collection<e0> object) {
        boolean bl;
        block3: {
            y.j(object, (String)"elements");
            object = (Iterable)object;
            bl = object.isEmpty();
            boolean bl2 = true;
            if (bl) {
                bl = bl2;
            } else {
                Object e4;
                object = object.iterator();
                do {
                    bl = bl2;
                    if (!object.hasNext()) break block3;
                } while ((e4 = object.next()) instanceof e0 && l.b0(lArray, ((e0)e4).h()));
                bl = false;
            }
        }
        return bl;
    }

    public static boolean i(long[] lArray, Object object) {
        if (!(object instanceof f0)) {
            return false;
        }
        return y.e((Object)lArray, (Object)((f0)object).s());
    }

    public static final long k(long[] lArray, int n4) {
        return e0.c((long)lArray[n4]);
    }

    public static int m(long[] lArray) {
        return lArray.length;
    }

    public static int n(long[] lArray) {
        return Arrays.hashCode(lArray);
    }

    public static boolean o(long[] lArray) {
        boolean bl = lArray.length == 0;
        return bl;
    }

    @NotNull
    public static Iterator<e0> p(long[] lArray) {
        return new a(lArray);
    }

    public static final void q(long[] lArray, int n4, long l4) {
        lArray[n4] = l4;
    }

    public static String r(long[] lArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ULongArray(storage=");
        stringBuilder.append(Arrays.toString(lArray));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public boolean addAll(Collection<? extends e0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return f0.h(this.c, collection);
    }

    @Override
    public boolean equals(Object object) {
        return f0.i(this.c, object);
    }

    public boolean f(long l4) {
        return f0.g(this.c, l4);
    }

    @Override
    public int hashCode() {
        return f0.n(this.c);
    }

    @Override
    public boolean isEmpty() {
        return f0.o(this.c);
    }

    @Override
    @NotNull
    public Iterator<e0> iterator() {
        return f0.p(this.c);
    }

    public int l() {
        return f0.m(this.c);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ long[] s() {
        return this.c;
    }

    @Override
    public Object[] toArray() {
        return o.a((Collection)this);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        y.j(TArray, (String)"array");
        return o.b((Collection)this, (Object[])TArray);
    }

    public String toString() {
        return f0.r(this.c);
    }

    @Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0012"}, d2={"Lkotlin/f0$a;", "", "Lkotlin/e0;", "", "hasNext", "()Z", "a", "()J", "", "c", "[J", "array", "", "d", "I", "index", "<init>", "([J)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    private static final class a
    implements Iterator<e0>,
    kotlin.jvm.internal.markers.a {
        @NotNull
        private final long[] c;
        private int d;

        public a(@NotNull long[] lArray) {
            y.j((Object)lArray, (String)"array");
            this.c = lArray;
        }

        public long a() {
            int n4 = this.d;
            long[] lArray = this.c;
            if (n4 < lArray.length) {
                this.d = n4 + 1;
                return e0.c((long)lArray[n4]);
            }
            throw new NoSuchElementException(String.valueOf(this.d));
        }

        @Override
        public boolean hasNext() {
            boolean bl = this.d < this.c.length;
            return bl;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}

