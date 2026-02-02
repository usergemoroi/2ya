/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hi1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.l60;

public abstract class bk
implements hi1 {
    protected final l52.d a = new l52.d();

    protected bk() {
    }

    public final boolean b() {
        l60 l602 = (l60)this;
        boolean bl2 = l602.getPlaybackState() == 3 && l602.getPlayWhenReady() && l602.getPlaybackSuppressionReason() == 0;
        return bl2;
    }

    public final boolean hasNextMediaItem() {
        l60 l602 = (l60)this;
        l52 l522 = l602.getCurrentTimeline();
        boolean bl2 = l522.c();
        boolean bl3 = false;
        if (!bl2) {
            int n10 = l602.getCurrentMediaItemIndex();
            l602.d();
            l602.e();
            if (l522.a(n10, 0, false) != -1) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final boolean hasPreviousMediaItem() {
        l60 l602 = (l60)this;
        l52 l522 = l602.getCurrentTimeline();
        boolean bl2 = l522.c();
        boolean bl3 = false;
        if (!bl2) {
            int n10 = l602.getCurrentMediaItemIndex();
            l602.d();
            l602.e();
            if (l522.b(n10, 0, false) != -1) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final boolean isCurrentMediaItemDynamic() {
        l60 l602 = (l60)this;
        l52 l522 = l602.getCurrentTimeline();
        boolean bl2 = !l522.c() && l522.a((int)l602.getCurrentMediaItemIndex(), (l52.d)this.a, (long)0L).j;
        return bl2;
    }

    public final boolean isCurrentMediaItemLive() {
        l60 l602 = (l60)this;
        l52 l522 = l602.getCurrentTimeline();
        boolean bl2 = !l522.c() && l522.a(l602.getCurrentMediaItemIndex(), this.a, 0L).a();
        return bl2;
    }

    public final boolean isCurrentMediaItemSeekable() {
        l60 l602 = (l60)this;
        l52 l522 = l602.getCurrentTimeline();
        boolean bl2 = !l522.c() && l522.a((int)l602.getCurrentMediaItemIndex(), (l52.d)this.a, (long)0L).i;
        return bl2;
    }
}

