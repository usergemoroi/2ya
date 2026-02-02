/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.z2
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.s51;
import com.yandex.mobile.ads.impl.z2;
import java.lang.ref.WeakReference;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class l4
implements z2 {
    @NotNull
    private final g8 a;
    @NotNull
    private final WeakReference<s51> b;

    @JvmOverloads
    public l4(@NotNull g8 g84, @NotNull WeakReference weakReference) {
        this.a = g84;
        this.b = weakReference;
        g84.a(this);
    }

    public /* synthetic */ l4(s51 s512) {
        this(new g8(), new WeakReference<s51>(s512));
    }

    @NotNull
    public final g8 a() {
        return this.a;
    }

    public final void a(int n10, @Nullable Bundle object) {
        object = (s51)this.b.get();
        if (object != null) {
            if (n10 != 19) {
                if (n10 != 20) {
                    switch (n10) {
                        default: {
                            break;
                        }
                        case 9: {
                            ((s51)object).b();
                            break;
                        }
                        case 8: {
                            ((s51)object).c();
                            break;
                        }
                        case 7: {
                            ((s51)object).d();
                            break;
                        }
                        case 6: {
                            ((s51)object).e();
                            break;
                        }
                    }
                } else {
                    ((s51)object).f();
                }
            } else {
                ((s51)object).g();
            }
        }
    }
}

