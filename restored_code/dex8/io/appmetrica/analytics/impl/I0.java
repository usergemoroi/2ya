/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.impl.Al;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.fd;
import io.appmetrica.analytics.impl.h0;
import java.util.AbstractMap;

public final class i0 {
    public fd a;
    public long b;
    public boolean c;
    public final Al d;

    public i0(String string2, long l10, Al al2) {
        this.b = l10;
        try {
            fd fd3;
            this.a = fd3 = new fd(string2);
        }
        catch (Throwable throwable) {
            this.a = new fd();
        }
        this.d = al2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final h0 a() {
        synchronized (this) {
            try {
                if (!this.c) return new h0(Gb.b(this.a), this.b);
                ++this.b;
                this.c = false;
                return new h0(Gb.b(this.a), this.b);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void a(Pair pair) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.d.b(this.a, (String)pair.first, (String)pair.second)) break block3;
                        this.c = true;
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

    public final String toString() {
        synchronized (this) {
            CharSequence charSequence = new StringBuilder("Map size ");
            charSequence.append(((AbstractMap)this.a).size());
            charSequence.append(". Is changed ");
            charSequence.append(this.c);
            charSequence.append(". Current revision ");
            charSequence.append(this.b);
            charSequence = charSequence.toString();
            return charSequence;
        }
    }
}

