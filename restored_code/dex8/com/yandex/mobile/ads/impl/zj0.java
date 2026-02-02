/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.concurrent.LazyInit
 *  com.google.j2objc.annotations.RetainedWith
 *  com.yandex.mobile.ads.impl.df0
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.vj0
 *  com.yandex.mobile.ads.impl.yx1
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.yandex.mobile.ads.impl.df0;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.gz1;
import com.yandex.mobile.ads.impl.ro1;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.yx1;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

public abstract class zj0<E>
extends vj0<E>
implements Set<E> {
    @LazyInit
    @CheckForNull
    @RetainedWith
    private transient xj0<E> c;

    zj0() {
    }

    static int a(int n10) {
        int n12 = Math.max(n10, 2);
        n10 = 1;
        if (n12 < 0x2CCCCCCC) {
            n10 = Integer.highestOneBit(n12 - 1) << 1;
            while ((double)n10 * 0.7 < (double)n12) {
                n10 <<= 1;
            }
            return n10;
        }
        if (n12 >= 0x40000000) {
            n10 = 0;
        }
        if (n10 != 0) {
            return 0x40000000;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static zj0 a(String string2, String string3) {
        return zj0.b(2, string2, string3);
    }

    public static zj0 a(String string2, String string3, String string4) {
        return zj0.b(3, string2, string3, string4);
    }

    public static zj0 a(Set objectArray) {
        zj0 zj02;
        if (objectArray instanceof zj0 && !(objectArray instanceof SortedSet) && !(zj02 = (zj0)objectArray).f()) {
            return zj02;
        }
        objectArray = objectArray.toArray();
        return zj0.b(objectArray.length, objectArray);
    }

    public static <E> zj0<E> a(E[] EArray) {
        int n10 = EArray.length;
        if (n10 != 0) {
            if (n10 != 1) {
                return zj0.b(EArray.length, (Object[])EArray.clone());
            }
            return new gz1<E>(EArray[0]);
        }
        return ro1.j;
    }

    private static <E> zj0<E> b(int n10, Object ... objectArray) {
        if (n10 != 0) {
            if (n10 != 1) {
                Object object;
                int n12;
                int n13 = zj0.a(n10);
                Object[] objectArray2 = new Object[n13];
                int n14 = n13 - 1;
                int n15 = n12 = 0;
                block0: for (int i14 = 0; i14 < n10; ++i14) {
                    Object object2 = objectArray[i14];
                    if (object2 != null) {
                        int n16 = object2.hashCode();
                        int n17 = df0.a((int)n16);
                        while (true) {
                            int n18;
                            if ((object = objectArray2[n18 = n17 & n14]) == null) {
                                objectArray[n15] = object2;
                                objectArray2[n18] = object2;
                                n12 += n16;
                                ++n15;
                                continue block0;
                            }
                            if (object.equals(object2)) {
                                continue block0;
                            }
                            ++n17;
                        }
                    }
                    throw new NullPointerException(fe.a((String)"at index ", (int)i14));
                }
                Arrays.fill(objectArray, n15, n10, null);
                if (n15 == 1) {
                    objectArray = objectArray[0];
                    Objects.requireNonNull(objectArray);
                    return new gz1<Object[]>(objectArray);
                }
                if (zj0.a(n15) < n13 / 2) {
                    return zj0.b(n15, objectArray);
                }
                n10 = objectArray.length;
                object = objectArray;
                if (n15 < (n10 >> 1) + (n10 >> 2)) {
                    object = Arrays.copyOf(objectArray, n15);
                }
                return new ro1((Object[])object, n12, objectArray2, n14, n15);
            }
            objectArray = objectArray[0];
            Objects.requireNonNull(objectArray);
            return new gz1<Object[]>(objectArray);
        }
        return ro1.j;
    }

    public xj0<E> b() {
        xj0<E> xj02;
        xj0<E> xj03 = xj02 = this.c;
        if (xj02 == null) {
            this.c = xj03 = this.g();
        }
        return xj03;
    }

    @Override
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof zj0 && this instanceof ro1) {
            zj0 zj02 = (zj0)object;
            zj02.getClass();
            if (zj02 instanceof ro1 && this.hashCode() != object.hashCode()) {
                return false;
            }
        }
        return yx1.a((Set)this, (Object)object);
    }

    xj0<E> g() {
        Object[] objectArray = this.toArray();
        int n10 = xj0.d;
        return xj0.b(objectArray.length, objectArray);
    }

    @Override
    public int hashCode() {
        return yx1.a((Set)this);
    }

    Object writeReplace() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }
}

