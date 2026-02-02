/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.ExperimentalUnsignedTypes
 *  kotlin.Metadata
 *  kotlin.PublishedApi
 *  kotlin.SinceKotlin
 *  kotlin.h0
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
import kotlin.h0;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003\u00a2\u0006\u0004\b(\u0010)B\u0011\b\u0001\u0012\u0006\u0010%\u001a\u00020 \u00a2\u0006\u0004\b*\u0010+J\u001b\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 \u0082\u0002\u0004\n\u0002\b!\u00a8\u0006-"}, d2={"Lkotlin/i0;", "", "Lkotlin/h0;", "", "index", "k", "([SI)S", "value", "Lkotlin/k0;", "q", "([SIS)V", "", "p", "([S)Ljava/util/Iterator;", "element", "", "g", "([SS)Z", "elements", "h", "([SLjava/util/Collection;)Z", "o", "([S)Z", "", "r", "([S)Ljava/lang/String;", "n", "([S)I", "", "other", "i", "([SLjava/lang/Object;)Z", "", "c", "[S", "getStorage$annotations", "()V", "storage", "m", "size", "d", "(I)[S", "e", "([S)[S", "a", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@JvmInline
@ExperimentalUnsignedTypes
@SinceKotlin(version="1.3")
@SourceDebugExtension(value={"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n63#1:88,3\n*E\n"})
public final class i0
implements Collection<h0>,
kotlin.jvm.internal.markers.a {
    @NotNull
    private final short[] c;

    @PublishedApi
    private /* synthetic */ i0(short[] sArray) {
        this.c = sArray;
    }

    public static final /* synthetic */ i0 a(short[] sArray) {
        return new i0(sArray);
    }

    @NotNull
    public static short[] d(int n4) {
        return i0.e(new short[n4]);
    }

    @PublishedApi
    @NotNull
    public static short[] e(@NotNull short[] sArray) {
        y.j((Object)sArray, (String)"storage");
        return sArray;
    }

    public static boolean g(short[] sArray, short s3) {
        return l.d0(sArray, s3);
    }

    public static boolean h(short[] sArray, @NotNull Collection<h0> object) {
        boolean bl;
        block3: {
            y.j(object, (String)"elements");
            object = (Iterable)object;
            bl = object.isEmpty();
            boolean bl2 = true;
            if (bl) {
                bl = bl2;
            } else {
                Iterator<Object> iterator = object.iterator();
                do {
                    bl = bl2;
                    if (!iterator.hasNext()) break block3;
                } while ((object = iterator.next()) instanceof h0 && l.d0(sArray, ((h0)object).g()));
                bl = false;
            }
        }
        return bl;
    }

    public static boolean i(short[] sArray, Object object) {
        if (!(object instanceof i0)) {
            return false;
        }
        return y.e((Object)sArray, (Object)((i0)object).s());
    }

    public static final short k(short[] sArray, int n4) {
        return h0.c((short)sArray[n4]);
    }

    public static int m(short[] sArray) {
        return sArray.length;
    }

    public static int n(short[] sArray) {
        return Arrays.hashCode(sArray);
    }

    public static boolean o(short[] sArray) {
        boolean bl = sArray.length == 0;
        return bl;
    }

    @NotNull
    public static Iterator<h0> p(short[] sArray) {
        return new a(sArray);
    }

    public static final void q(short[] sArray, int n4, short s3) {
        sArray[n4] = s3;
    }

    public static String r(short[] sArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UShortArray(storage=");
        stringBuilder.append(Arrays.toString(sArray));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Override
    public boolean addAll(Collection<? extends h0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        return i0.h(this.c, collection);
    }

    @Override
    public boolean equals(Object object) {
        return i0.i(this.c, object);
    }

    public boolean f(short s3) {
        return i0.g(this.c, s3);
    }

    @Override
    public int hashCode() {
        return i0.n(this.c);
    }

    @Override
    public boolean isEmpty() {
        return i0.o(this.c);
    }

    @Override
    @NotNull
    public Iterator<h0> iterator() {
        return i0.p(this.c);
    }

    public int l() {
        return i0.m(this.c);
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

    public final /* synthetic */ short[] s() {
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
        return i0.r(this.c);
    }

    @Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0012"}, d2={"Lkotlin/i0$a;", "", "Lkotlin/h0;", "", "hasNext", "()Z", "a", "()S", "", "c", "[S", "array", "", "d", "I", "index", "<init>", "([S)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
    private static final class a
    implements Iterator<h0>,
    kotlin.jvm.internal.markers.a {
        @NotNull
        private final short[] c;
        private int d;

        public a(@NotNull short[] sArray) {
            y.j((Object)sArray, (String)"array");
            this.c = sArray;
        }

        public short a() {
            int n4 = this.d;
            short[] sArray = this.c;
            if (n4 < sArray.length) {
                this.d = n4 + 1;
                return h0.c((short)sArray[n4]);
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

