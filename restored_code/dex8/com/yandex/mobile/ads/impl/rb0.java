/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ae1
 *  com.yandex.mobile.ads.impl.b32
 *  com.yandex.mobile.ads.impl.b32$a
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qb0
 *  com.yandex.mobile.ads.impl.tb0
 *  com.yandex.mobile.ads.impl.tb0$a
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ae1;
import com.yandex.mobile.ads.impl.b32;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qb0;
import com.yandex.mobile.ads.impl.sb0;
import com.yandex.mobile.ads.impl.tb0;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

final class rb0
extends b32 {
    @Nullable
    private tb0 n;
    @Nullable
    private a o;

    rb0() {
    }

    /*
     * Unable to fully structure code
     */
    protected final long a(bg1 var1_1) {
        var3_2 = var1_1.c()[0];
        var2_3 = -1;
        if (var3_2 == -1) {
            var3_2 = (var1_1.c()[2] & 255) >> 4;
            if (var3_2 == 6 || var3_2 == 7) {
                var1_1.f(4);
                var1_1.A();
            }
            block0 : switch (var3_2) {
                default: {
                    break;
                }
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    var2_3 = var3_2 - 8;
                    var3_2 = 256;
lbl15:
                    // 2 sources

                    while (true) {
                        var2_3 = var3_2 << var2_3;
                        break block0;
                        break;
                    }
                }
                case 7: {
                    var2_3 = var1_1.z();
lbl20:
                    // 2 sources

                    while (true) {
                        ++var2_3;
                        break block0;
                        break;
                    }
                }
                case 6: {
                    var2_3 = var1_1.t();
                    ** continue;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    var2_3 = var3_2 - 2;
                    var3_2 = 576;
                    ** continue;
                }
                case 1: {
                    var2_3 = 192;
                }
            }
            var1_1.e(0);
            return var2_3;
        }
        return -1L;
    }

    protected final void a(boolean bl2) {
        super.a(bl2);
        if (bl2) {
            this.n = null;
            this.o = null;
        }
    }

    @EnsuresNonNullIf(expression={"#3.format"}, result=false)
    protected final boolean a(bg1 object, long l10, b32.a a14) {
        byte[] byArray = object.c();
        tb0 tb02 = this.n;
        if (tb02 == null) {
            this.n = tb02 = new tb0(17, byArray);
            a14.a = tb02.a(Arrays.copyOfRange(byArray, 9, object.e()), null);
            return true;
        }
        byte by = byArray[0];
        if ((by & 0x7F) == 3) {
            object = qb0.a((bg1)object);
            a14 = tb02.a((tb0.a)object);
            this.n = a14;
            this.o = new a((tb0)a14, (tb0.a)object);
            return true;
        }
        if (by == -1) {
            object = this.o;
            if (object != null) {
                ((a)object).c = l10;
                a14.b = object;
            }
            a14.a.getClass();
            return false;
        }
        return true;
    }

    private static final class a
    implements ae1 {
        private tb0 a;
        private tb0.a b;
        private long c;
        private long d;

        public a(tb0 tb02, tb0.a a14) {
            this.a = tb02;
            this.b = a14;
            this.c = -1L;
            this.d = -1L;
        }

        public final long a(oz oz3) {
            long l10 = this.d;
            if (l10 >= 0L) {
                l10 = -(l10 + 2L);
                this.d = -1L;
                return l10;
            }
            return -1L;
        }

        public final ex1 a() {
            long l10 = this.c;
            if (l10 != -1L) {
                return new sb0(this.a, l10);
            }
            throw new IllegalStateException();
        }

        public final void a(long l10) {
            long[] lArray = this.b.a;
            this.d = lArray[m92.b((long[])lArray, (long)l10, (boolean)true)];
        }
    }
}

