/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.v5;
import org.jetbrains.annotations.NotNull;

public abstract class r5 {
    public final v5 a;
    public final String b;

    public r5(v5 v54) {
        this.a = v54;
        this.b = "[ComponentMigrationToV113]";
    }

    @NotNull
    public final v5 a() {
        return this.a;
    }

    public final void a(int n10) {
        if (this.b(n10)) {
            this.c();
        }
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public abstract boolean b(int var1);

    public abstract void c();
}

