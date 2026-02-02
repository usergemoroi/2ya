/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.TextureView
 *  com.yandex.mobile.ads.impl.hi1$b
 *  com.yandex.mobile.ads.impl.hz1
 *  com.yandex.mobile.ads.impl.ig2
 *  com.yandex.mobile.ads.impl.jg2
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.lu2
 *  kotlin.math.a
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.a10;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.hz1;
import com.yandex.mobile.ads.impl.i72;
import com.yandex.mobile.ads.impl.ig2;
import com.yandex.mobile.ads.impl.jg2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.lu2;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.yu;
import java.util.List;
import kotlin.math.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hg2
implements hi1.b {
    @Nullable
    private hz1 a;
    @Nullable
    private hz1 b;
    @Nullable
    private TextureView c;
    @Nullable
    private jg2 d;

    public /* synthetic */ void a(int n10) {
        lu2.a((hi1.b)this, (int)n10);
    }

    public final void a(@Nullable TextureView textureView) {
        this.c = textureView;
        if (this.d != null && textureView != null) {
            Matrix matrix = new Matrix();
            matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
            textureView.setTransform(matrix);
        }
    }

    public /* synthetic */ void a(a10 a102) {
        lu2.b((hi1.b)this, (a10)a102);
    }

    public /* synthetic */ void a(bi1 bi12) {
        lu2.c((hi1.b)this, (bi1)bi12);
    }

    public /* synthetic */ void a(ew0 ew02, int n10) {
        lu2.d((hi1.b)this, (ew0)ew02, (int)n10);
    }

    public /* synthetic */ void a(g60 g602) {
        lu2.e((hi1.b)this, (g60)g602);
    }

    public /* synthetic */ void a(hi1.a a13) {
        lu2.f((hi1.b)this, (hi1.a)a13);
    }

    public /* synthetic */ void a(hi1.c c10, hi1.c c11, int n10) {
        lu2.g((hi1.b)this, (hi1.c)c10, (hi1.c)c11, (int)n10);
    }

    public /* synthetic */ void a(hw0 hw02) {
        lu2.h((hi1.b)this, (hw0)hw02);
    }

    public /* synthetic */ void a(i72 i722) {
        lu2.i((hi1.b)this, (i72)i722);
    }

    public final void a(@Nullable jg2 jg22) {
        this.d = jg22;
        TextureView textureView = this.c;
        if (jg22 != null && textureView != null) {
            jg22 = new Matrix();
            jg22.setScale(0.0f, 0.0f, 0.0f, 0.0f);
            textureView.setTransform((Matrix)jg22);
        }
    }

    public /* synthetic */ void a(k01 k012) {
        lu2.j((hi1.b)this, (k01)k012);
    }

    public final void a(@NotNull ng2 ng22) {
        hz1 hz12;
        int n10 = ng22.b;
        float f11 = ng22.e;
        int n13 = n10;
        if (f11 > 0.0f) {
            n13 = kotlin.math.a.d((float)((float)n10 * f11));
        }
        this.a = hz12 = new hz1(n13, ng22.c);
        hz1 hz13 = this.b;
        jg2 jg22 = this.d;
        ng22 = this.c;
        if (hz13 != null && jg22 != null && ng22 != null && (hz13 = new ig2(hz13, hz12).a(jg22)) != null) {
            ng22.setTransform((Matrix)hz13);
        }
    }

    public /* synthetic */ void a(yu yu2) {
        lu2.l((hi1.b)this, (yu)yu2);
    }

    public /* synthetic */ void a(boolean bl2, int n10) {
        lu2.m((hi1.b)this, (boolean)bl2, (int)n10);
    }

    public /* synthetic */ void b(g60 g602) {
        lu2.n((hi1.b)this, (g60)g602);
    }

    public /* synthetic */ void onCues(List list) {
        lu2.o((hi1.b)this, (List)list);
    }

    public /* synthetic */ void onIsLoadingChanged(boolean bl2) {
        lu2.p((hi1.b)this, (boolean)bl2);
    }

    public /* synthetic */ void onIsPlayingChanged(boolean bl2) {
        lu2.q((hi1.b)this, (boolean)bl2);
    }

    public /* synthetic */ void onPlayWhenReadyChanged(boolean bl2, int n10) {
        lu2.r((hi1.b)this, (boolean)bl2, (int)n10);
    }

    public /* synthetic */ void onPlaybackStateChanged(int n10) {
        lu2.s((hi1.b)this, (int)n10);
    }

    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int n10) {
        lu2.t((hi1.b)this, (int)n10);
    }

    public /* synthetic */ void onPlayerStateChanged(boolean bl2, int n10) {
        lu2.u((hi1.b)this, (boolean)bl2, (int)n10);
    }

    public /* synthetic */ void onRenderedFirstFrame() {
        lu2.v((hi1.b)this);
    }

    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean bl2) {
        lu2.w((hi1.b)this, (boolean)bl2);
    }

    public final void onSurfaceSizeChanged(int n10, int n13) {
        hz1 hz12;
        this.b = hz12 = new hz1(n10, n13);
        jg2 jg22 = this.d;
        hz1 hz13 = this.a;
        TextureView textureView = this.c;
        if (hz13 != null && jg22 != null && textureView != null && (jg22 = new ig2(hz12, hz13).a(jg22)) != null) {
            textureView.setTransform((Matrix)jg22);
        }
    }

    public /* synthetic */ void onVolumeChanged(float f11) {
        lu2.y((hi1.b)this, (float)f11);
    }
}

