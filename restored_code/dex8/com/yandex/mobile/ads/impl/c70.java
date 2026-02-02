/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.TextureView
 *  com.yandex.mobile.ads.impl.cd2
 *  com.yandex.mobile.ads.impl.hi1$b
 *  com.yandex.mobile.ads.impl.jd2
 *  com.yandex.mobile.ads.impl.jg2
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.lu2
 *  com.yandex.mobile.ads.impl.n5
 *  com.yandex.mobile.ads.impl.ra1
 *  com.yandex.mobile.ads.impl.t60
 *  com.yandex.mobile.ads.impl.vw0
 *  com.yandex.mobile.ads.impl.xf2
 */
package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.a10;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.bk;
import com.yandex.mobile.ads.impl.cd2;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.h60;
import com.yandex.mobile.ads.impl.hg2;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.i72;
import com.yandex.mobile.ads.impl.jb1;
import com.yandex.mobile.ads.impl.jd2;
import com.yandex.mobile.ads.impl.jg2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.km1;
import com.yandex.mobile.ads.impl.lu2;
import com.yandex.mobile.ads.impl.n5;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.ra1;
import com.yandex.mobile.ads.impl.sa1;
import com.yandex.mobile.ads.impl.t60;
import com.yandex.mobile.ads.impl.vw0;
import com.yandex.mobile.ads.impl.xf2;
import com.yandex.mobile.ads.impl.yu;
import java.util.HashSet;
import java.util.List;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c70
implements sa1 {
    @NotNull
    private final h60 a;
    @NotNull
    private final vw0 b;
    @NotNull
    private final xf2 c;
    @NotNull
    private final ra1 d;
    @NotNull
    private final hg2 e;
    @NotNull
    private final a f;
    @NotNull
    private final t60 g;
    @Nullable
    private jb1 h;
    @Nullable
    private jb1 i;
    @Nullable
    private cd2 j;
    @Nullable
    private jd2 k;
    @NotNull
    private final HashSet<t<cd2, cd2>> l;
    private boolean m;
    private boolean n;

    public c70(@NotNull h60 h602, @NotNull vw0 object, @NotNull xf2 xf22, @NotNull ra1 ra12, @NotNull hg2 hg22) {
        this.a = h602;
        this.b = object;
        this.c = xf22;
        this.d = ra12;
        this.e = hg22;
        object = new a(this);
        this.f = object;
        this.g = new t60((hi1.b)object);
        this.l = new HashSet();
        h602.b((hi1.b)object);
        h602.b(hg22);
        n5.a((c70)this);
    }

    private final void a(cd2 object) {
        if (this.m) {
            return;
        }
        this.j = object;
        object = this.b.a(object);
        this.a.setPlayWhenReady(false);
        this.a.a((km1)object);
        this.a.prepare();
        this.g.a();
    }

    @Override
    public final void a() {
        if (!this.m) {
            jd2 jd22 = this.k;
            cd2 cd22 = this.j;
            if (jd22 != null && cd22 != null) {
                jd22.e();
            }
            this.m = true;
            this.n = false;
            this.g.b();
            this.a.setVideoTextureView(null);
            this.e.a((TextureView)null);
            this.a.a(this.f);
            this.a.a(this.e);
            this.a.release();
        }
    }

    @Override
    public final void a(@Nullable TextureView textureView) {
        if (!this.m) {
            this.e.a(textureView);
            this.a.setVideoTextureView(textureView);
        }
    }

    public final void a(@NotNull hi1.b b10) {
        this.a.b(b10);
    }

    @Override
    public final void a(@NotNull jb1 jb12, @Nullable jb1 jb13) {
        this.h = jb12;
        this.i = jb13;
        t<jb1, jb1> t13 = jb13 != null ? z.a(jb12, jb13) : null;
        if (t13 != null && this.l.contains(t13)) {
            this.a(jb13);
        } else {
            this.a(jb12);
        }
    }

    @Override
    public final void a(@Nullable jd2 jd22) {
        this.k = jd22;
    }

    @Override
    public final void a(@Nullable jg2 jg22) {
        if (!this.m) {
            this.e.a(jg22);
        }
    }

    @Override
    public final long b() {
        return this.a.getDuration();
    }

    @Override
    public final void c() {
        if (!this.m) {
            this.a.setPlayWhenReady(true);
        }
        if (this.n) {
            this.pauseAd();
        }
    }

    public final void d() {
        this.n = false;
    }

    @Override
    public final void e() {
        if (!this.m) {
            this.m = true;
            this.n = false;
            this.g.b();
            this.a.setVideoTextureView(null);
            this.e.a((TextureView)null);
            this.a.a(this.f);
            this.a.a(this.e);
            this.a.release();
        }
    }

    @Override
    public final boolean f() {
        return this.m;
    }

    public final void g() {
        this.n = true;
        this.pauseAd();
    }

    @Override
    public final long getAdPosition() {
        return this.a.getCurrentPosition();
    }

    @Override
    public final float getVolume() {
        return this.a.getVolume();
    }

    @Override
    public final boolean isPlayingAd() {
        return ((bk)((Object)this.a)).b();
    }

    @Override
    public final void pauseAd() {
        if (!this.m) {
            this.a.setPlayWhenReady(false);
        }
    }

    @Override
    public final void resumeAd() {
        if (!this.m && !this.n) {
            this.a.setPlayWhenReady(true);
        }
    }

    @Override
    public final void setVolume(float f10) {
        if (!this.m) {
            this.a.setVolume(f10);
            jd2 jd22 = this.k;
            cd2 cd22 = this.j;
            if (jd22 != null && cd22 != null) {
                jd22.onVolumeChanged(f10);
            }
        }
    }

    private final class a
    implements hi1.b {
        private boolean a;
        private boolean b;
        private boolean c;
        final c70 d;

        public a(c70 c702) {
            this.d = c702;
        }

        public /* synthetic */ void a(int n10) {
            lu2.a((hi1.b)this, (int)n10);
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

        public /* synthetic */ void a(hi1.a a12) {
            lu2.f((hi1.b)this, (hi1.a)a12);
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

        public /* synthetic */ void a(k01 k012) {
            lu2.j((hi1.b)this, (k01)k012);
        }

        public /* synthetic */ void a(ng2 ng22) {
            lu2.k((hi1.b)this, (ng2)ng22);
        }

        public /* synthetic */ void a(yu yu2) {
            lu2.l((hi1.b)this, (yu)yu2);
        }

        public /* synthetic */ void a(boolean bl2, int n10) {
            lu2.m((hi1.b)this, (boolean)bl2, (int)n10);
        }

        public final void b(@NotNull g60 g602) {
            cd2 cd22 = this.d.h;
            Object object = this.d.i;
            object = cd22 != null && object != null ? z.a(cd22, object) : null;
            if (object != null && !this.d.l.contains(object)) {
                this.d.l.add(object);
                this.d.a((cd2)((t)object).d());
                return;
            }
            this.a = false;
            this.d.g.b();
            this.d.a.stop();
            object = g602.getMessage();
            this.d.c.a((String)object);
            cd22 = this.d.k;
            object = this.d.j;
            if (cd22 != null && object != null) {
                this.d.d.getClass();
                cd22.a(ra1.a((g60)g602));
            }
        }

        public /* synthetic */ void onCues(List list) {
            lu2.o((hi1.b)this, (List)list);
        }

        public /* synthetic */ void onIsLoadingChanged(boolean bl2) {
            lu2.p((hi1.b)this, (boolean)bl2);
        }

        public final void onIsPlayingChanged(boolean bl2) {
            if (bl2) {
                if (!this.a) {
                    jd2 jd22 = this.d.k;
                    cd2 cd22 = this.d.j;
                    if (jd22 != null && cd22 != null) {
                        this.a = true;
                        jd22.c();
                    }
                } else if (this.c) {
                    this.c = false;
                    jd2 jd23 = this.d.k;
                    cd2 cd23 = this.d.j;
                    if (jd23 != null && cd23 != null) {
                        jd23.f();
                    }
                }
            } else if (!this.b) {
                this.c = true;
                jd2 jd24 = this.d.k;
                cd2 cd24 = this.d.j;
                if (jd24 != null && cd24 != null) {
                    jd24.i();
                }
            }
        }

        public /* synthetic */ void onPlayWhenReadyChanged(boolean bl2, int n10) {
            lu2.r((hi1.b)this, (boolean)bl2, (int)n10);
        }

        public final void onPlaybackStateChanged(int n10) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 == 4) {
                        this.a = false;
                        jd2 jd22 = this.d.k;
                        cd2 cd22 = this.d.j;
                        if (jd22 != null && cd22 != null) {
                            jd22.d();
                        }
                    }
                } else {
                    this.d.g.b();
                    jd2 jd23 = this.d.k;
                    cd2 cd23 = this.d.j;
                    if (jd23 != null && cd23 != null) {
                        jd23.h();
                    }
                    if (this.b) {
                        this.b = false;
                        cd23 = this.d.k;
                        jd23 = this.d.j;
                        if (cd23 != null && jd23 != null) {
                            cd23.a();
                        }
                    }
                }
            } else {
                this.b = true;
                jd2 jd24 = this.d.k;
                cd2 cd24 = this.d.j;
                if (jd24 != null && cd24 != null) {
                    jd24.b();
                }
            }
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

        public /* synthetic */ void onSurfaceSizeChanged(int n10, int n12) {
            lu2.x((hi1.b)this, (int)n10, (int)n12);
        }

        public /* synthetic */ void onVolumeChanged(float f10) {
            lu2.y((hi1.b)this, (float)f10);
        }
    }
}

