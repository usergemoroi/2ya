/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.SinceKotlin
 *  kotlin.collections.k$a
 *  kotlin.collections.m
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.c;
import kotlin.collections.f;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0007\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010S\u001a\u00020\u0003\u00a2\u0006\u0004\bT\u0010\u0007B\t\b\u0016\u00a2\u0006\u0004\bT\u0010\u001eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u000f\u0010\fJ%\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00028\u0000\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00028\u0000\u00a2\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b&\u0010#J\u0015\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u0000\u00a2\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00028\u0000\u00a2\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00028\u0000\u00a2\u0006\u0004\b+\u0010#J\u000f\u0010,\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b,\u0010#J\r\u0010-\u001a\u00028\u0000\u00a2\u0006\u0004\b-\u0010#J\u000f\u0010.\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\b.\u0010#J\u0017\u0010/\u001a\u00020\u001f2\u0006\u0010'\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b/\u00100J\u001f\u0010/\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b/\u00101J\u001d\u00102\u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016\u00a2\u0006\u0004\b2\u00103J%\u00102\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016\u00a2\u0006\u0004\b2\u00104J\u0018\u00105\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b5\u00106J \u00107\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u001f2\u0006\u0010'\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\b9\u00100J\u0017\u0010:\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u001f2\u0006\u0010'\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b=\u00100J\u0017\u0010>\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b>\u00106J\u001d\u0010?\u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016\u00a2\u0006\u0004\b?\u00103J\u001d\u0010@\u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016\u00a2\u0006\u0004\b@\u00103J\u000f\u0010A\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\bA\u0010\u001eJ)\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010C\"\u0004\b\u0001\u0010B2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010CH\u0016\u00a2\u0006\u0004\bE\u0010FJ\u0017\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0CH\u0016\u00a2\u0006\u0004\bE\u0010HJ\u001f\u0010I\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\bI\u0010\u0018R\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010MR$\u0010R\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00038\u0016@RX\u0096\u000e\u00a2\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bP\u0010Q\u00a8\u0006U"}, d2={"Lkotlin/collections/k;", "E", "Lkotlin/collections/f;", "", "minCapacity", "Lkotlin/k0;", "f", "(I)V", "newCapacity", "d", "index", "m", "(I)I", "k", "h", "e", "internalIndex", "", "elements", "a", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "q", "(II)V", "r", "internalFromIndex", "internalToIndex", "l", "n", "()V", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "g", "last", "i", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "o", "removeLast", "p", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "c", "I", "head", "[Ljava/lang/Object;", "elementData", "<set-?>", "getSize", "()I", "size", "initialCapacity", "<init>", "kotlin-stdlib"}, k=1, mv={1, 9, 0})
@SinceKotlin(version="1.4")
@SourceDebugExtension(value={"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
public final class k<E>
extends f<E> {
    @NotNull
    public static final a f = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final Object[] g = new Object[0];
    private int c;
    @NotNull
    private Object[] d;
    private int e;

    public k() {
        this.d = g;
    }

    public k(int n4) {
        block4: {
            Object[] objectArray;
            block3: {
                block2: {
                    if (n4 != 0) break block2;
                    objectArray = g;
                    break block3;
                }
                if (n4 <= 0) break block4;
                objectArray = new Object[n4];
            }
            this.d = objectArray;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal Capacity: ");
        stringBuilder.append(n4);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final void a(int n4, Collection<? extends E> collection) {
        Iterator<E> iterator = collection.iterator();
        int n5 = this.d.length;
        while (n4 < n5 && iterator.hasNext()) {
            this.d[n4] = iterator.next();
            ++n4;
        }
        n5 = this.c;
        for (n4 = 0; n4 < n5 && iterator.hasNext(); ++n4) {
            this.d[n4] = iterator.next();
        }
        this.e = this.size() + collection.size();
    }

    private final void d(int n4) {
        Object[] objectArray = new Object[n4];
        Object[] objectArray2 = this.d;
        l.m(objectArray2, objectArray, 0, this.c, objectArray2.length);
        objectArray2 = this.d;
        int n5 = objectArray2.length;
        n4 = this.c;
        l.m(objectArray2, objectArray, n5 - n4, 0, n4);
        this.c = 0;
        this.d = objectArray;
    }

    private final int e(int n4) {
        n4 = n4 == 0 ? l.q0(this.d) : --n4;
        return n4;
    }

    private final void f(int n4) {
        if (n4 >= 0) {
            Object[] objectArray = this.d;
            if (n4 <= objectArray.length) {
                return;
            }
            if (objectArray == g) {
                this.d = new Object[j.e(n4, 10)];
                return;
            }
            this.d(kotlin.collections.c.Companion.e(objectArray.length, n4));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int h(int n4) {
        n4 = n4 == l.q0(this.d) ? 0 : ++n4;
        return n4;
    }

    private final int k(int n4) {
        int n5 = n4;
        if (n4 < 0) {
            n5 = n4 + this.d.length;
        }
        return n5;
    }

    private final void l(int n4, int n5) {
        if (n4 < n5) {
            l.x(this.d, null, n4, n5);
        } else {
            Object[] objectArray = this.d;
            l.x(objectArray, null, n4, objectArray.length);
            l.x(this.d, null, 0, n5);
        }
    }

    private final int m(int n4) {
        Object[] objectArray = this.d;
        int n5 = n4;
        if (n4 >= objectArray.length) {
            n5 = n4 - objectArray.length;
        }
        return n5;
    }

    private final void n() {
        ++this.modCount;
    }

    private final void q(int n4, int n5) {
        int n6 = this.m(this.c + (n4 - 1));
        int n7 = this.m(this.c + (n5 - 1));
        n5 = n6;
        while (n4 > 0) {
            int n8 = n5 + 1;
            n6 = Math.min(n4, Math.min(n8, n7 + 1));
            Object[] objectArray = this.d;
            l.m(objectArray, objectArray, (n7 -= n6) + 1, (n5 -= n6) + 1, n8);
            n5 = this.k(n5);
            n7 = this.k(n7);
            n4 -= n6;
        }
    }

    private final void r(int n4, int n5) {
        int n6 = this.m(this.c + n5);
        n4 = this.m(this.c + n4);
        int n7 = this.size();
        int n8 = n5;
        n5 = n6;
        while ((n7 -= n8) > 0) {
            Object[] objectArray = this.d;
            n8 = Math.min(n7, Math.min(objectArray.length - n5, objectArray.length - n4));
            objectArray = this.d;
            n6 = n5 + n8;
            l.m(objectArray, objectArray, n4, n5, n6);
            n5 = this.m(n6);
            n4 = this.m(n4 + n8);
        }
    }

    @Override
    public void add(int n4, E e4) {
        kotlin.collections.c.Companion.c(n4, this.size());
        if (n4 == this.size()) {
            this.addLast(e4);
            return;
        }
        if (n4 == 0) {
            this.addFirst(e4);
            return;
        }
        this.n();
        this.f(this.size() + 1);
        int n5 = this.m(this.c + n4);
        if (n4 < this.size() + 1 >> 1) {
            n5 = this.e(n5);
            n4 = this.e(this.c);
            int n6 = this.c;
            if (n5 >= n6) {
                Object[] objectArray = this.d;
                objectArray[n4] = objectArray[n6];
                l.m(objectArray, objectArray, n6, n6 + 1, n5 + 1);
            } else {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, n6 - 1, n6, objectArray.length);
                objectArray = this.d;
                objectArray[objectArray.length - 1] = objectArray[0];
                l.m(objectArray, objectArray, 0, 1, n5 + 1);
            }
            this.d[n5] = e4;
            this.c = n4;
        } else {
            n4 = this.m(this.c + this.size());
            if (n5 < n4) {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, n5 + 1, n5, n4);
            } else {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, 1, 0, n4);
                objectArray = this.d;
                objectArray[0] = objectArray[objectArray.length - 1];
                l.m(objectArray, objectArray, n5 + 1, n5, objectArray.length - 1);
            }
            this.d[n5] = e4;
        }
        this.e = this.size() + 1;
    }

    @Override
    public boolean add(E e4) {
        this.addLast(e4);
        return true;
    }

    @Override
    public boolean addAll(int n4, @NotNull Collection<? extends E> collection) {
        y.j(collection, (String)"elements");
        kotlin.collections.c.Companion.c(n4, this.size());
        if (collection.isEmpty()) {
            return false;
        }
        if (n4 == this.size()) {
            return this.addAll(collection);
        }
        this.n();
        this.f(this.size() + collection.size());
        int n5 = this.m(this.c + this.size());
        int n6 = this.m(this.c + n4);
        int n7 = collection.size();
        if (n4 < this.size() + 1 >> 1) {
            n5 = this.c;
            n4 = n5 - n7;
            if (n6 >= n5) {
                if (n4 >= 0) {
                    Object[] objectArray = this.d;
                    l.m(objectArray, objectArray, n4, n5, n6);
                } else {
                    Object[] objectArray = this.d;
                    int n8 = objectArray.length - (n4 += objectArray.length);
                    if (n8 >= n6 - n5) {
                        l.m(objectArray, objectArray, n4, n5, n6);
                    } else {
                        l.m(objectArray, objectArray, n4, n5, n5 + n8);
                        objectArray = this.d;
                        l.m(objectArray, objectArray, 0, this.c + n8, n6);
                    }
                }
            } else {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, n4, n5, objectArray.length);
                if (n7 >= n6) {
                    objectArray = this.d;
                    l.m(objectArray, objectArray, objectArray.length - n7, 0, n6);
                } else {
                    objectArray = this.d;
                    l.m(objectArray, objectArray, objectArray.length - n7, 0, n7);
                    objectArray = this.d;
                    l.m(objectArray, objectArray, 0, n7, n6);
                }
            }
            this.c = n4;
            this.a(this.k(n6 - n7), collection);
        } else {
            n4 = n6 + n7;
            if (n6 < n5) {
                Object[] objectArray = this.d;
                if ((n7 += n5) <= objectArray.length) {
                    l.m(objectArray, objectArray, n4, n6, n5);
                } else if (n4 >= objectArray.length) {
                    l.m(objectArray, objectArray, n4 - objectArray.length, n6, n5);
                } else {
                    n7 = n5 - (n7 - objectArray.length);
                    l.m(objectArray, objectArray, 0, n7, n5);
                    objectArray = this.d;
                    l.m(objectArray, objectArray, n4, n6, n7);
                }
            } else {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, n7, 0, n5);
                objectArray = this.d;
                if (n4 >= objectArray.length) {
                    l.m(objectArray, objectArray, n4 - objectArray.length, n6, objectArray.length);
                } else {
                    l.m(objectArray, objectArray, 0, objectArray.length - n7, objectArray.length);
                    objectArray = this.d;
                    l.m(objectArray, objectArray, n4, n6, objectArray.length - n7);
                }
            }
            this.a(n6, collection);
        }
        return true;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        y.j(collection, (String)"elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.n();
        this.f(this.size() + collection.size());
        this.a(this.m(this.c + this.size()), collection);
        return true;
    }

    @Override
    public final void addFirst(E e4) {
        int n4;
        this.n();
        this.f(this.size() + 1);
        this.c = n4 = this.e(this.c);
        this.d[n4] = e4;
        this.e = this.size() + 1;
    }

    @Override
    public final void addLast(E e4) {
        this.n();
        this.f(this.size() + 1);
        this.d[this.m((int)(this.c + this.size()))] = e4;
        this.e = this.size() + 1;
    }

    @Override
    public void clear() {
        if (this.isEmpty() ^ true) {
            this.n();
            int n4 = this.m(this.c + this.size());
            this.l(this.c, n4);
        }
        this.c = 0;
        this.e = 0;
    }

    @Override
    public boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    public final E first() {
        if (!this.isEmpty()) {
            return (E)this.d[this.c];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E g() {
        Object object = this.isEmpty() ? null : this.d[this.c];
        return (E)object;
    }

    @Override
    public E get(int n4) {
        kotlin.collections.c.Companion.b(n4, this.size());
        return (E)this.d[this.m(this.c + n4)];
    }

    @Override
    public int getSize() {
        return this.e;
    }

    @Nullable
    public final E i() {
        Object object = this.isEmpty() ? null : this.d[this.m(this.c + t.o((List)this))];
        return (E)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int indexOf(Object object) {
        int n4 = this.c;
        int n5 = this.m(this.c + this.size());
        if (n4 < n5) {
            while (n4 < n5) {
                if (y.e((Object)object, (Object)this.d[n4])) {
                    n5 = this.c;
                    return n4 - n5;
                }
                ++n4;
            }
            return -1;
        }
        if (n4 < n5) return -1;
        int n6 = this.d.length;
        while (n4 < n6) {
            if (y.e((Object)object, (Object)this.d[n4])) {
                n5 = this.c;
                return n4 - n5;
            }
            ++n4;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            if (!y.e((Object)object, (Object)this.d[n4])) continue;
            n4 += this.d.length;
            n5 = this.c;
            return n4 - n5;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.size() == 0;
        return bl;
    }

    public final E last() {
        if (!this.isEmpty()) {
            return (E)this.d[this.m(this.c + t.o((List)this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int lastIndexOf(Object object) {
        int n4 = this.c;
        int n5 = this.m(this.c + this.size());
        if (n4 < n5) {
            if (n4 > --n5) return -1;
            while (true) {
                if (y.e((Object)object, (Object)this.d[n5])) {
                    n4 = this.c;
                    return n5 - n4;
                }
                if (n5 == n4) return -1;
                --n5;
            }
        }
        if (n4 <= n5) return -1;
        --n5;
        while (-1 < n5) {
            if (y.e((Object)object, (Object)this.d[n5])) {
                n5 += this.d.length;
                n4 = this.c;
                return n5 - n4;
            }
            --n5;
        }
        n4 = this.c;
        n5 = l.q0(this.d);
        if (n4 > n5) return -1;
        while (true) {
            if (y.e((Object)object, (Object)this.d[n5])) {
                n4 = this.c;
                return n5 - n4;
            }
            if (n5 == n4) return -1;
            --n5;
        }
    }

    @Nullable
    public final E o() {
        E e4 = this.isEmpty() ? null : (E)this.removeFirst();
        return e4;
    }

    @Nullable
    public final E p() {
        E e4 = this.isEmpty() ? null : (E)this.removeLast();
        return e4;
    }

    @Override
    public boolean remove(Object object) {
        int n4 = this.indexOf(object);
        if (n4 == -1) {
            return false;
        }
        this.remove(n4);
        return true;
    }

    @Override
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        boolean bl = this.isEmpty();
        int n4 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.d.length == 0) {
                bl4 = bl2;
            } else {
                int n5 = this.c;
                int n6 = this.m(this.c + this.size());
                if (n5 < n6) {
                    int n7 = n5;
                    while (n5 < n6) {
                        Object object = this.d[n5];
                        if (collection.contains(object) ^ true) {
                            this.d[n7] = object;
                            ++n7;
                        } else {
                            bl3 = true;
                        }
                        ++n5;
                    }
                    l.x(this.d, null, n7, n6);
                    n5 = n7;
                } else {
                    Object[] objectArray;
                    Object object;
                    int n8 = this.d.length;
                    bl3 = false;
                    int n9 = n5;
                    while (n5 < n8) {
                        object = this.d;
                        objectArray = object[n5];
                        object[n5] = null;
                        if (collection.contains(objectArray) ^ true) {
                            this.d[n9] = objectArray;
                            ++n9;
                        } else {
                            bl3 = true;
                        }
                        ++n5;
                    }
                    n5 = this.m(n9);
                    for (n9 = n4; n9 < n6; ++n9) {
                        objectArray = this.d;
                        object = objectArray[n9];
                        objectArray[n9] = null;
                        if (collection.contains(object) ^ true) {
                            this.d[n5] = object;
                            n5 = this.h(n5);
                            continue;
                        }
                        bl3 = true;
                    }
                }
                bl4 = bl3;
                if (bl3) {
                    this.n();
                    this.e = this.k(n5 - this.c);
                    bl4 = bl3;
                }
            }
        }
        return bl4;
    }

    @Override
    public E removeAt(int n4) {
        kotlin.collections.c.Companion.b(n4, this.size());
        if (n4 == t.o((List)this)) {
            return this.removeLast();
        }
        if (n4 == 0) {
            return this.removeFirst();
        }
        this.n();
        int n5 = this.m(this.c + n4);
        Object object = this.d[n5];
        if (n4 < this.size() >> 1) {
            Object[] objectArray;
            n4 = this.c;
            if (n5 >= n4) {
                objectArray = this.d;
                l.m(objectArray, objectArray, n4 + 1, n4, n5);
            } else {
                objectArray = this.d;
                l.m(objectArray, objectArray, 1, 0, n5);
                objectArray = this.d;
                objectArray[0] = objectArray[objectArray.length - 1];
                n4 = this.c;
                l.m(objectArray, objectArray, n4 + 1, n4, objectArray.length - 1);
            }
            objectArray = this.d;
            n4 = this.c;
            objectArray[n4] = null;
            this.c = this.h(n4);
        } else {
            n4 = this.m(this.c + t.o((List)this));
            if (n5 <= n4) {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, n5, n5 + 1, n4 + 1);
            } else {
                Object[] objectArray = this.d;
                l.m(objectArray, objectArray, n5, n5 + 1, objectArray.length);
                objectArray = this.d;
                objectArray[objectArray.length - 1] = objectArray[0];
                l.m(objectArray, objectArray, 0, 1, n4 + 1);
            }
            this.d[n4] = null;
        }
        this.e = this.size() - 1;
        return (E)object;
    }

    @Override
    public final E removeFirst() {
        if (!this.isEmpty()) {
            this.n();
            Object[] objectArray = this.d;
            int n4 = this.c;
            Object object = objectArray[n4];
            objectArray[n4] = null;
            this.c = this.h(n4);
            this.e = this.size() - 1;
            return (E)object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final E removeLast() {
        if (!this.isEmpty()) {
            this.n();
            int n4 = this.m(this.c + t.o((List)this));
            Object[] objectArray = this.d;
            Object object = objectArray[n4];
            objectArray[n4] = null;
            this.e = this.size() - 1;
            return (E)object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    protected void removeRange(int n4, int n5) {
        kotlin.collections.c.Companion.d(n4, n5, this.size());
        int n6 = n5 - n4;
        if (n6 == 0) {
            return;
        }
        if (n6 == this.size()) {
            this.clear();
            return;
        }
        if (n6 == 1) {
            this.remove(n4);
            return;
        }
        this.n();
        if (n4 < this.size() - n5) {
            this.q(n4, n5);
            n4 = this.m(this.c + n6);
            this.l(this.c, n4);
            this.c = n4;
        } else {
            this.r(n4, n5);
            n4 = this.m(this.c + this.size());
            this.l(this.k(n4 - n6), n4);
        }
        this.e = this.size() - n6;
    }

    @Override
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        y.j(collection, (String)"elements");
        boolean bl = this.isEmpty();
        int n4 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.d.length == 0) {
                bl4 = bl2;
            } else {
                int n5 = this.c;
                int n6 = this.m(this.c + this.size());
                if (n5 < n6) {
                    int n7 = n5;
                    while (n5 < n6) {
                        Object object = this.d[n5];
                        if (collection.contains(object)) {
                            this.d[n7] = object;
                            ++n7;
                        } else {
                            bl3 = true;
                        }
                        ++n5;
                    }
                    l.x(this.d, null, n7, n6);
                    n5 = n7;
                } else {
                    Object object;
                    Object[] objectArray;
                    int n8 = this.d.length;
                    bl3 = false;
                    int n9 = n5;
                    while (n5 < n8) {
                        objectArray = this.d;
                        object = objectArray[n5];
                        objectArray[n5] = null;
                        if (collection.contains(object)) {
                            this.d[n9] = object;
                            ++n9;
                        } else {
                            bl3 = true;
                        }
                        ++n5;
                    }
                    n5 = this.m(n9);
                    for (n9 = n4; n9 < n6; ++n9) {
                        objectArray = this.d;
                        object = objectArray[n9];
                        objectArray[n9] = null;
                        if (collection.contains(object)) {
                            this.d[n5] = object;
                            n5 = this.h(n5);
                            continue;
                        }
                        bl3 = true;
                    }
                }
                bl4 = bl3;
                if (bl3) {
                    this.n();
                    this.e = this.k(n5 - this.c);
                    bl4 = bl3;
                }
            }
        }
        return bl4;
    }

    @Override
    public E set(int n4, E e4) {
        kotlin.collections.c.Companion.b(n4, this.size());
        n4 = this.m(this.c + n4);
        Object[] objectArray = this.d;
        Object object = objectArray[n4];
        objectArray[n4] = e4;
        return (E)object;
    }

    @Override
    @NotNull
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    @NotNull
    public <T> T[] toArray(@NotNull T[] objectArray) {
        y.j(objectArray, (String)"array");
        if (objectArray.length < this.size()) {
            objectArray = m.a((Object[])objectArray, (int)this.size());
        }
        int n4 = this.m(this.c + this.size());
        int n5 = this.c;
        if (n5 < n4) {
            l.r(this.d, objectArray, 0, n5, n4, 2, null);
        } else if (this.isEmpty() ^ true) {
            Object[] objectArray2 = this.d;
            l.m(objectArray2, objectArray, 0, this.c, objectArray2.length);
            objectArray2 = this.d;
            l.m(objectArray2, objectArray, objectArray2.length - this.c, 0, n4);
        }
        return t.f(this.size(), objectArray);
    }
}

