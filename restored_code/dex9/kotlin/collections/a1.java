/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.collections.c;
import kotlin.collections.l;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0006\u0010*\u001a\u00020\u0005\u00a2\u0006\u0004\b+\u0010,B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0005\u00a2\u0006\u0004\b+\u0010\u001eJ\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fH\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0014J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001a\u0010#R$\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00058\u0016@RX\u0096\u000e\u00a2\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b'\u0010(\u00a8\u0006-"}, d2={"Lkotlin/collections/a1;", "T", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "", "g", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "maxCapacity", "f", "(I)Lkotlin/collections/a1;", "element", "Lkotlin/k0;", "e", "(Ljava/lang/Object;)V", "n", "h", "(I)V", "c", "[Ljava/lang/Object;", "buffer", "d", "I", "capacity", "startIndex", "<set-?>", "getSize", "()I", "size", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SourceDebugExtension(value={"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
final class a1<T>
extends c<T>
implements RandomAccess {
    @NotNull
    private final Object[] c;
    private final int d;
    private int e;
    private int f;

    public a1(int n4) {
        this(new Object[n4], 0);
    }

    public a1(@NotNull Object[] object, int n4) {
        y.j((Object)object, (String)"buffer");
        this.c = object;
        if (n4 >= 0) {
            if (n4 <= ((Object[])object).length) {
                this.d = ((Object[])object).length;
                this.f = n4;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ring buffer filled size: ");
            stringBuilder.append(n4);
            stringBuilder.append(" cannot be larger than the buffer size: ");
            stringBuilder.append(((Object)object).length);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("ring buffer filled size should not be negative but it is ");
        ((StringBuilder)object).append(n4);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public final void e(T t3) {
        if (!this.g()) {
            this.c[(this.e + this.size()) % ((a1)this).d] = t3;
            this.f = this.size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @NotNull
    public final a1<T> f(int n4) {
        Object[] objectArray;
        int n5 = this.d;
        n4 = j.i(n5 + (n5 >> 1) + 1, n4);
        if (this.e == 0) {
            objectArray = Arrays.copyOf(this.c, n4);
            y.i((Object)objectArray, (String)"copyOf(...)");
        } else {
            objectArray = this.toArray(new Object[n4]);
        }
        return new a1<T>(objectArray, this.size());
    }

    public final boolean g() {
        boolean bl = this.size() == this.d;
        return bl;
    }

    @Override
    public T get(int n4) {
        kotlin.collections.c.Companion.b(n4, this.size());
        return (T)this.c[(this.e + n4) % this.d];
    }

    @Override
    public int getSize() {
        return this.f;
    }

    public final void h(int n4) {
        if (n4 >= 0) {
            if (n4 <= this.size()) {
                if (n4 > 0) {
                    int n5 = this.e;
                    int n6 = (n5 + n4) % this.d;
                    if (n5 > n6) {
                        l.x(this.c, null, n5, this.d);
                        l.x(this.c, null, 0, n6);
                    } else {
                        l.x(this.c, null, n5, n6);
                    }
                    this.e = n6;
                    this.f = this.size() - n4;
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n shouldn't be greater than the buffer size: n = ");
            stringBuilder.append(n4);
            stringBuilder.append(", size = ");
            stringBuilder.append(this.size());
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("n shouldn't be negative but it is ");
        stringBuilder.append(n4);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new b<T>(this){
            private int c;
            private int d;
            final a1<T> e;
            {
                this.e = a12;
                this.c = a12.size();
                this.d = a12.e;
            }

            @Override
            protected void computeNext() {
                if (this.c == 0) {
                    this.done();
                } else {
                    this.setNext(this.e.c[this.d]);
                    a1 a12 = this.e;
                    this.d = (this.d + 1) % a12.d;
                    --this.c;
                }
            }
        };
    }

    @Override
    @NotNull
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    @NotNull
    public <T> T[] toArray(@NotNull T[] TArray) {
        int n4;
        int n5;
        y.j(TArray, (String)"array");
        Object[] objectArray = TArray;
        if (TArray.length < this.size()) {
            objectArray = Arrays.copyOf(TArray, this.size());
            y.i(objectArray, (String)"copyOf(...)");
        }
        int n6 = this.size();
        int n7 = this.e;
        int n8 = 0;
        int n9 = 0;
        while (true) {
            n5 = n8;
            n4 = n9;
            if (n9 >= n6) break;
            n5 = n8;
            n4 = n9;
            if (n7 >= this.d) break;
            objectArray[n9] = this.c[n7];
            ++n9;
            ++n7;
        }
        while (n4 < n6) {
            objectArray[n4] = this.c[n5];
            ++n4;
            ++n5;
        }
        return t.f(n6, objectArray);
    }
}

