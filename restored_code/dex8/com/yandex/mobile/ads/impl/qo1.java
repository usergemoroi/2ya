/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.df0
 *  com.yandex.mobile.ads.impl.p82
 *  com.yandex.mobile.ads.impl.vj0
 *  com.yandex.mobile.ads.impl.wj1
 *  com.yandex.mobile.ads.impl.yj0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.df0;
import com.yandex.mobile.ads.impl.p82;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.yj0;
import com.yandex.mobile.ads.impl.zj0;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

final class qo1<K, V>
extends yj0<K, V> {
    static final yj0<Object, Object> h = new qo1<Object, Object>(null, new Object[0], 0);
    private static final long serialVersionUID = 0L;
    @CheckForNull
    private final transient Object e;
    final transient Object[] f;
    private final transient int g;

    private qo1(@CheckForNull Object object, Object[] objectArray, int n10) {
        this.e = object;
        this.f = objectArray;
        this.g = n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static <K, V> qo1<K, V> a(int n10, Object[] objectArray) {
        if (n10 == 0) {
            return (qo1)h;
        }
        Object object = null;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        if (n10 == 1) {
            Objects.requireNonNull(objectArray[0]);
            Objects.requireNonNull(objectArray[1]);
            return new qo1<K, V>(null, objectArray, 1);
        }
        wj1.b((int)n10, (int)(objectArray.length >> 1));
        int n16 = zj0.a(n10);
        if (n10 == 1) {
            Objects.requireNonNull(objectArray[0]);
            Objects.requireNonNull(objectArray[1]);
            return new qo1<K, V>(object, objectArray, n10);
        } else {
            int n17 = n16 - 1;
            if (n16 <= 128) {
                byte[] byArray = new byte[n16];
                Arrays.fill(byArray, (byte)-1);
                block0: while (true) {
                    object = byArray;
                    if (n15 >= n10) return new qo1<K, V>(object, objectArray, n10);
                    n14 = n15 * 2;
                    object = objectArray[n14];
                    Objects.requireNonNull(object);
                    Object object2 = objectArray[n14 ^ 1];
                    Objects.requireNonNull(object2);
                    n13 = df0.a((int)object.hashCode());
                    while (true) {
                        if ((n16 = byArray[n13 &= n17] & 0xFF) == 255) {
                            byArray[n13] = (byte)n14;
                            ++n15;
                            continue block0;
                        }
                        if (object.equals(objectArray[n16])) throw qo1.a(object, object2, objectArray, n16);
                        ++n13;
                    }
                    break;
                }
            }
            if (n16 <= 32768) {
                short[] sArray = new short[n16];
                Arrays.fill(sArray, (short)-1);
                n15 = n13;
                block2: while (true) {
                    object = sArray;
                    if (n15 >= n10) return new qo1<K, V>(object, objectArray, n10);
                    n14 = n15 * 2;
                    Object object3 = objectArray[n14];
                    Objects.requireNonNull(object3);
                    object = objectArray[n14 ^ 1];
                    Objects.requireNonNull(object);
                    n13 = df0.a((int)object3.hashCode());
                    while (true) {
                        if ((n16 = sArray[n13 &= n17] & 0xFFFF) == 65535) {
                            sArray[n13] = (short)n14;
                            ++n15;
                            continue block2;
                        }
                        if (object3.equals(objectArray[n16])) throw qo1.a(object3, object, objectArray, n16);
                        ++n13;
                    }
                    break;
                }
            }
            int[] nArray = new int[n16];
            Arrays.fill(nArray, -1);
            n15 = n14;
            block4: while (true) {
                object = nArray;
                if (n15 >= n10) return new qo1<K, V>(object, objectArray, n10);
                n14 = n15 * 2;
                Object object4 = objectArray[n14];
                Objects.requireNonNull(object4);
                object = objectArray[n14 ^ 1];
                Objects.requireNonNull(object);
                n13 = df0.a((int)object4.hashCode());
                while (true) {
                    if ((n13 = nArray[n16 = n13 & n17]) == -1) {
                        nArray[n16] = n14;
                        ++n15;
                        continue block4;
                    }
                    if (object4.equals(objectArray[n13])) throw qo1.a(object4, object, objectArray, n13);
                    n13 = n16 + 1;
                }
                break;
            }
        }
    }

    private static IllegalArgumentException a(Object object, Object object2, Object[] objectArray, int n10) {
        StringBuilder stringBuilder = new StringBuilder("Multiple entries with same key: ");
        stringBuilder.append(object);
        stringBuilder.append("=");
        stringBuilder.append(object2);
        stringBuilder.append(" and ");
        stringBuilder.append(objectArray[n10]);
        stringBuilder.append("=");
        stringBuilder.append(objectArray[n10 ^ 1]);
        return new IllegalArgumentException(stringBuilder.toString());
    }

    final zj0<Map.Entry<K, V>> b() {
        return new a(this, this.f, this.g);
    }

    final zj0<K> c() {
        return new b<Object>(this, new c(this.f, 0, this.g));
    }

    final vj0<V> d() {
        return new c(this.f, 1, this.g);
    }

    /*
     * Unable to fully structure code
     */
    @CheckForNull
    public final V get(@CheckForNull Object var1_1) {
        block19: {
            block15: {
                block16: {
                    block17: {
                        block18: {
                            var6_2 = this.e;
                            var5_3 = this.f;
                            var2_4 = this.g;
                            if (var1_1 == null) break block17;
                            if (var2_4 != 1) break block18;
                            var6_2 = var5_3[0];
                            Objects.requireNonNull(var6_2);
                            if (!var6_2.equals(var1_1)) break block17;
                            var1_1 = var5_3[1];
                            Objects.requireNonNull(var1_1);
                            break block15;
                        }
                        if (var6_2 != null) {
                            if (var6_2 instanceof byte[]) {
                                var6_2 = (byte[])var6_2;
                                var3_5 = ((Object)var6_2).length;
                                var2_4 = df0.a((int)var1_1.hashCode());
                                while ((var4_8 = var6_2[var2_4 &= var3_5 - 1] & 255) != 255) {
                                    if (var1_1.equals(var5_3[var4_8])) {
                                        var1_1 = var5_3[var4_8 ^ 1];
                                        break block15;
                                    }
                                    ++var2_4;
                                }
                            } else if (var6_2 instanceof short[]) {
                                var6_2 = (short[])var6_2;
                                var3_6 = ((Object)var6_2).length;
                                var2_4 = df0.a((int)var1_1.hashCode());
                                while ((var4_9 = var6_2[var2_4 &= var3_6 - 1] & 65535) != 65535) {
                                    if (var1_1.equals(var5_3[var4_9])) {
                                        var1_1 = var5_3[var4_9 ^ 1];
                                        break block15;
                                    }
                                    ++var2_4;
                                }
                            } else {
                                var6_2 = (int[])var6_2;
                                var3_7 = ((Object)var6_2).length;
                                var2_4 = df0.a((int)var1_1.hashCode());
lbl41:

                                while (true) {
                                    var4_10 = var6_2[var2_4 &= var3_7 - 1];
                                    if (var4_10 != -1) break block16;
                                    break;
                                }
                            }
                        }
                    }
                    var1_1 = null;
                    break block15;
                }
                if (!var1_1.equals(var5_3[var4_10])) break block19;
                var1_1 = var5_3[var4_10 ^ 1];
            }
            if (var1_1 == null) {
                return null;
            }
            return (V)var1_1;
        }
        ++var2_4;
        ** while (true)
    }

    public final int size() {
        return this.g;
    }

    static final class a<K, V>
    extends zj0<Map.Entry<K, V>> {
        private final transient yj0<K, V> d;
        private final transient Object[] e;
        private final transient int f;
        private final transient int g;

        a(yj0 yj02, Object[] objectArray, int n10) {
            this.d = yj02;
            this.e = objectArray;
            this.f = 0;
            this.g = n10;
        }

        final int a(int n10, Object[] objectArray) {
            return this.b().a(n10, objectArray);
        }

        @Override
        public final boolean contains(@CheckForNull Object object) {
            boolean bl2;
            boolean bl3 = object instanceof Map.Entry;
            boolean bl4 = bl2 = false;
            if (bl3) {
                Map.Entry entry = (Map.Entry)object;
                object = entry.getKey();
                entry = entry.getValue();
                bl4 = bl2;
                if (entry != null) {
                    bl4 = bl2;
                    if (((Object)entry).equals(this.d.get(object))) {
                        bl4 = true;
                    }
                }
            }
            return bl4;
        }

        final boolean f() {
            return true;
        }

        @Override
        final xj0<Map.Entry<K, V>> g() {
            return new xj0<Map.Entry<K, V>>(this){
                final a e;
                {
                    this.e = a14;
                }

                public final boolean f() {
                    return true;
                }

                @Override
                public final Object get(int n10) {
                    wj1.a((int)n10, (int)this.e.g);
                    Object object = this.e;
                    Object object2 = ((a)object).e;
                    object2 = object2[((a)object).f + (n10 *= 2)];
                    Objects.requireNonNull(object2);
                    object = this.e;
                    object = ((a)object).e[n10 + (((a)object).f ^ 1)];
                    Objects.requireNonNull(object);
                    return new AbstractMap.SimpleImmutableEntry<Object[], Object>((Object[])object2, object);
                }

                @Override
                public final int size() {
                    return this.e.g;
                }
            };
        }

        @Override
        public final p82<Map.Entry<K, V>> iterator() {
            return this.b().a(0);
        }

        @Override
        public final int size() {
            return this.g;
        }
    }

    static final class b<K>
    extends zj0<K> {
        private final transient yj0<K, ?> d;
        private final transient xj0<K> e;

        b(yj0<K, ?> yj02, xj0<K> xj02) {
            this.d = yj02;
            this.e = xj02;
        }

        final int a(int n10, Object[] objectArray) {
            return this.e.a(n10, objectArray);
        }

        @Override
        public final xj0<K> b() {
            return this.e;
        }

        @Override
        public final boolean contains(@CheckForNull Object object) {
            boolean bl2 = this.d.get(object) != null;
            return bl2;
        }

        final boolean f() {
            return true;
        }

        @Override
        public final p82<K> iterator() {
            return this.e.a(0);
        }

        @Override
        public final int size() {
            return this.d.size();
        }
    }

    static final class c
    extends xj0<Object> {
        private final transient Object[] e;
        private final transient int f;
        private final transient int g;

        c(Object[] objectArray, int n10, int n13) {
            this.e = objectArray;
            this.f = n10;
            this.g = n13;
        }

        final boolean f() {
            return true;
        }

        @Override
        public final Object get(int n10) {
            wj1.a((int)n10, (int)this.g);
            Object object = this.e[n10 * 2 + this.f];
            Objects.requireNonNull(object);
            return object;
        }

        @Override
        public final int size() {
            return this.g;
        }
    }
}

