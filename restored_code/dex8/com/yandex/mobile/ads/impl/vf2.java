/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.du
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.du;
import com.yandex.mobile.ads.impl.wf2;
import org.jetbrains.annotations.Nullable;

public final class vf2
implements du {
    @Nullable
    private du a;

    public final void a(@Nullable wf2 wf22) {
        this.a = wf22;
    }

    public final void onVideoCompleted() {
        du du3 = this.a;
        if (du3 != null) {
            du3.onVideoCompleted();
        }
    }

    public final void onVideoError() {
        du du3 = this.a;
        if (du3 != null) {
            du3.onVideoError();
        }
    }

    public final void onVideoPaused() {
        du du3 = this.a;
        if (du3 != null) {
            du3.onVideoPaused();
        }
    }

    public final void onVideoPrepared() {
        du du3 = this.a;
        if (du3 != null) {
            du3.onVideoPrepared();
        }
    }

    public final void onVideoResumed() {
        du du3 = this.a;
        if (du3 != null) {
            du3.onVideoResumed();
        }
    }
}

