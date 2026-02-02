/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.uc
 *  com.yandex.mobile.ads.impl.vc
 *  com.yandex.mobile.ads.impl.vc$a
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.uc;
import com.yandex.mobile.ads.impl.vc;
import java.util.Arrays;

public final class vy
implements vc {
    private final boolean a;
    private final int b;
    @Nullable
    private final byte[] c = null;
    private int d;
    private int e;
    private int f = 0;
    private uc[] g = new uc[100];

    public vy() {
        this(0);
    }

    public vy(int n10) {
        this.a = true;
        this.b = 65536;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final uc a() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                uc uc3;
                block8: {
                    int n10;
                    block6: {
                        int n13;
                        try {
                            this.e = n10 = this.e + 1;
                            n13 = this.f;
                            if (n13 <= 0) break block6;
                            uc3 = this.g;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        {
                            this.f = --n13;
                        }
                        uc3 = uc3[n13];
                        uc3.getClass();
                        this.g[this.f] = null;
                        break block8;
                    }
                    uc3 = new uc(0, new byte[this.b]);
                    uc[] ucArray = this.g;
                    if (n10 > ucArray.length) {
                        this.g = Arrays.copyOf(ucArray, ucArray.length * 2);
                    }
                }
                return uc3;
            }
            throw throwable2;
        }
    }

    public final void a(int n10) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    boolean bl2;
                    try {
                        bl2 = n10 < this.d;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.d = n10;
                    if (!bl2) break block5;
                    this.e();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(uc uc3) {
        synchronized (this) {
            uc[] ucArray = this.g;
            int n10 = this.f;
            this.f = n10 + 1;
            ucArray[n10] = uc3;
            --this.e;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable vc.a a14) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                while (a14 != null) {
                    try {
                        uc[] ucArray = this.g;
                        int n10 = this.f;
                        this.f = n10 + 1;
                        ucArray[n10] = a14.a();
                        --this.e;
                        a14 = a14.next();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.notifyAll();
                return;
            }
            throw throwable2;
        }
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        synchronized (this) {
            int n10 = this.e;
            int n13 = this.b;
            return n10 * n13;
        }
    }

    public final void d() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.a) break block3;
                        this.a(0);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            Throwable throwable2;
            int n10;
            block11: {
                int n13;
                int n14;
                int n15;
                block10: {
                    n15 = this.d;
                    n10 = this.b;
                    n14 = m92.a;
                    n15 = (n15 + n10 - 1) / n10;
                    n10 = this.e;
                    n13 = 0;
                    n14 = Math.max(0, n15 - n10);
                    n15 = this.f;
                    if (n14 < n15) break block10;
                    return;
                }
                n10 = n14;
                if (this.c == null) break block11;
                --n15;
                n10 = n13;
                while (n10 <= n15) {
                    uc uc3;
                    uc uc4;
                    block13: {
                        block12: {
                            uc4 = this.g[n10];
                            uc4.getClass();
                            if (uc4.a != this.c) break block12;
                            ++n10;
                            continue;
                        }
                        uc3 = this.g[n15];
                        uc3.getClass();
                        if (uc3.a == this.c) break block13;
                        --n15;
                        continue;
                    }
                    uc[] ucArray = this.g;
                    ucArray[n10] = uc3;
                    ucArray[n15] = uc4;
                    --n15;
                    ++n10;
                }
                try {
                    n15 = Math.max(n14, n10);
                    n14 = this.f;
                    n10 = n15;
                    if (n15 < n14) break block11;
                }
                catch (Throwable throwable2) {}
                return;
            }
            Arrays.fill(this.g, n10, this.f, null);
            this.f = n10;
            return;
            throw throwable2;
        }
    }
}

