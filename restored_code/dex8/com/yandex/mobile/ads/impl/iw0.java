/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.DeniedByServerException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.MediaDrmResetException
 *  android.media.NotProvisionedException
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.MediaMetricsManager
 *  android.media.metrics.NetworkEvent
 *  android.media.metrics.NetworkEvent$Builder
 *  android.media.metrics.PlaybackErrorEvent
 *  android.media.metrics.PlaybackErrorEvent$Builder
 *  android.media.metrics.PlaybackMetrics
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.PlaybackStateEvent
 *  android.media.metrics.PlaybackStateEvent$Builder
 *  android.media.metrics.TrackChangeEvent
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.util.Pair
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.media3.exoplayer.analytics.a2
 *  androidx.media3.exoplayer.analytics.a3
 *  androidx.media3.exoplayer.analytics.b2
 *  androidx.media3.exoplayer.analytics.b3
 *  androidx.media3.exoplayer.analytics.c2
 *  androidx.media3.exoplayer.analytics.c3
 *  androidx.media3.exoplayer.analytics.d2
 *  androidx.media3.exoplayer.analytics.d3
 *  androidx.media3.exoplayer.analytics.e2
 *  androidx.media3.exoplayer.analytics.e3
 *  androidx.media3.exoplayer.analytics.f2
 *  androidx.media3.exoplayer.analytics.f3
 *  androidx.media3.exoplayer.analytics.g2
 *  androidx.media3.exoplayer.analytics.g3
 *  androidx.media3.exoplayer.analytics.h2
 *  androidx.media3.exoplayer.analytics.h3
 *  androidx.media3.exoplayer.analytics.i2
 *  androidx.media3.exoplayer.analytics.i3
 *  androidx.media3.exoplayer.analytics.j2
 *  androidx.media3.exoplayer.analytics.j3
 *  androidx.media3.exoplayer.analytics.k3
 *  androidx.media3.exoplayer.analytics.l2
 *  androidx.media3.exoplayer.analytics.l3
 *  androidx.media3.exoplayer.analytics.m2
 *  androidx.media3.exoplayer.analytics.m3
 *  androidx.media3.exoplayer.analytics.n2
 *  androidx.media3.exoplayer.analytics.n3
 *  androidx.media3.exoplayer.analytics.o2
 *  androidx.media3.exoplayer.analytics.o3
 *  androidx.media3.exoplayer.analytics.p2
 *  androidx.media3.exoplayer.analytics.p3
 *  androidx.media3.exoplayer.analytics.q2
 *  androidx.media3.exoplayer.analytics.q3
 *  androidx.media3.exoplayer.analytics.r2
 *  androidx.media3.exoplayer.analytics.r3
 *  androidx.media3.exoplayer.analytics.s2
 *  androidx.media3.exoplayer.analytics.s3
 *  androidx.media3.exoplayer.analytics.t2
 *  androidx.media3.exoplayer.analytics.t3
 *  androidx.media3.exoplayer.analytics.u2
 *  androidx.media3.exoplayer.analytics.u3
 *  androidx.media3.exoplayer.analytics.v1
 *  androidx.media3.exoplayer.analytics.v2
 *  androidx.media3.exoplayer.analytics.v3
 *  androidx.media3.exoplayer.analytics.w1
 *  androidx.media3.exoplayer.analytics.w2
 *  androidx.media3.exoplayer.analytics.x1
 *  androidx.media3.exoplayer.analytics.x2
 *  androidx.media3.exoplayer.analytics.y1
 *  androidx.media3.exoplayer.analytics.y2
 *  androidx.media3.exoplayer.analytics.z1
 *  androidx.media3.exoplayer.analytics.z2
 *  com.yandex.mobile.ads.impl.bd1
 *  com.yandex.mobile.ads.impl.c00
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.ed
 *  com.yandex.mobile.ads.impl.ed$a
 *  com.yandex.mobile.ads.impl.ed$b
 *  com.yandex.mobile.ads.impl.ei1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.gw0
 *  com.yandex.mobile.ads.impl.hi1
 *  com.yandex.mobile.ads.impl.hy
 *  com.yandex.mobile.ads.impl.iv0$b
 *  com.yandex.mobile.ads.impl.iw0$b
 *  com.yandex.mobile.ads.impl.kz$d
 *  com.yandex.mobile.ads.impl.lh$b
 *  com.yandex.mobile.ads.impl.lh$e
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.s82
 *  com.yandex.mobile.ads.impl.z30$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.analytics.a2;
import androidx.media3.exoplayer.analytics.a3;
import androidx.media3.exoplayer.analytics.b2;
import androidx.media3.exoplayer.analytics.b3;
import androidx.media3.exoplayer.analytics.c2;
import androidx.media3.exoplayer.analytics.c3;
import androidx.media3.exoplayer.analytics.d2;
import androidx.media3.exoplayer.analytics.d3;
import androidx.media3.exoplayer.analytics.e2;
import androidx.media3.exoplayer.analytics.e3;
import androidx.media3.exoplayer.analytics.f2;
import androidx.media3.exoplayer.analytics.f3;
import androidx.media3.exoplayer.analytics.g2;
import androidx.media3.exoplayer.analytics.g3;
import androidx.media3.exoplayer.analytics.h2;
import androidx.media3.exoplayer.analytics.h3;
import androidx.media3.exoplayer.analytics.i2;
import androidx.media3.exoplayer.analytics.i3;
import androidx.media3.exoplayer.analytics.j2;
import androidx.media3.exoplayer.analytics.j3;
import androidx.media3.exoplayer.analytics.k3;
import androidx.media3.exoplayer.analytics.l2;
import androidx.media3.exoplayer.analytics.l3;
import androidx.media3.exoplayer.analytics.m2;
import androidx.media3.exoplayer.analytics.m3;
import androidx.media3.exoplayer.analytics.n2;
import androidx.media3.exoplayer.analytics.n3;
import androidx.media3.exoplayer.analytics.o2;
import androidx.media3.exoplayer.analytics.o3;
import androidx.media3.exoplayer.analytics.p2;
import androidx.media3.exoplayer.analytics.p3;
import androidx.media3.exoplayer.analytics.q2;
import androidx.media3.exoplayer.analytics.q3;
import androidx.media3.exoplayer.analytics.r2;
import androidx.media3.exoplayer.analytics.r3;
import androidx.media3.exoplayer.analytics.s2;
import androidx.media3.exoplayer.analytics.s3;
import androidx.media3.exoplayer.analytics.t2;
import androidx.media3.exoplayer.analytics.t3;
import androidx.media3.exoplayer.analytics.u2;
import androidx.media3.exoplayer.analytics.u3;
import androidx.media3.exoplayer.analytics.v1;
import androidx.media3.exoplayer.analytics.v2;
import androidx.media3.exoplayer.analytics.v3;
import androidx.media3.exoplayer.analytics.w1;
import androidx.media3.exoplayer.analytics.w2;
import androidx.media3.exoplayer.analytics.x1;
import androidx.media3.exoplayer.analytics.x2;
import androidx.media3.exoplayer.analytics.y1;
import androidx.media3.exoplayer.analytics.y2;
import androidx.media3.exoplayer.analytics.z1;
import androidx.media3.exoplayer.analytics.z2;
import com.yandex.mobile.ads.impl.ab0;
import com.yandex.mobile.ads.impl.bd1;
import com.yandex.mobile.ads.impl.c00;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ch0;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.dh0;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.ei1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.fv0;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.g82;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.i72;
import com.yandex.mobile.ads.impl.iv0;
import com.yandex.mobile.ads.impl.iw0;
import com.yandex.mobile.ads.impl.kz;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.lh;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.s82;
import com.yandex.mobile.ads.impl.yh1;
import com.yandex.mobile.ads.impl.z30;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi(value=31)
public final class iw0
implements ed,
ei1 {
    private boolean A;
    private final Context a;
    private final c00 b;
    private final PlaybackSession c;
    private final long d;
    private final l52.d e;
    private final l52.b f;
    private final HashMap<String, Long> g;
    private final HashMap<String, Long> h;
    @Nullable
    private String i;
    @Nullable
    private PlaybackMetrics.Builder j;
    private int k;
    private int l;
    private int m;
    @Nullable
    private yh1 n;
    @Nullable
    private b o;
    @Nullable
    private b p;
    @Nullable
    private b q;
    @Nullable
    private cc0 r;
    @Nullable
    private cc0 s;
    @Nullable
    private cc0 t;
    private boolean u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    private iw0(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        this.e = new l52.d();
        this.f = new l52.b();
        this.h = new HashMap();
        this.g = new HashMap();
        this.d = SystemClock.elapsedRealtime();
        this.l = 0;
        this.m = 0;
        context = new c00();
        this.b = context;
        context.a((ei1)this);
    }

    @Nullable
    public static iw0 a(Context object) {
        MediaMetricsManager mediaMetricsManager = v2.a((Object)object.getSystemService("media_metrics"));
        object = mediaMetricsManager == null ? null : new iw0((Context)object, w2.a((MediaMetricsManager)mediaMetricsManager));
        return object;
    }

    private void a() {
        Object object = this.j;
        if (object != null && this.A) {
            x2.a((PlaybackMetrics.Builder)object, (int)this.z);
            y2.a((PlaybackMetrics.Builder)this.j, (int)this.x);
            z2.a((PlaybackMetrics.Builder)this.j, (int)this.y);
            object = this.g.get(this.i);
            PlaybackMetrics.Builder builder = this.j;
            long l10 = object == null ? 0L : (Long)object;
            a3.a((PlaybackMetrics.Builder)builder, (long)l10);
            object = this.h.get(this.i);
            builder = this.j;
            l10 = object == null ? 0L : (Long)object;
            b3.a((PlaybackMetrics.Builder)builder, (long)l10);
            builder = this.j;
            int n10 = object != null && (Long)object > 0L ? 1 : 0;
            d3.a((PlaybackMetrics.Builder)builder, (int)n10);
            f3.a((PlaybackSession)this.c, (PlaybackMetrics)e3.a((PlaybackMetrics.Builder)this.j));
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    private void a(int n10, long l10, @Nullable cc0 cc02, int n13) {
        TrackChangeEvent.Builder builder = v1.a((TrackChangeEvent.Builder)l3.a((int)n10), (long)(l10 - this.d));
        if (cc02 != null) {
            float f11;
            r3.a((TrackChangeEvent.Builder)builder, (int)1);
            if (n13 != 1) {
                n10 = 3;
                if (n13 != 2) {
                    n10 = n13 != 3 ? 1 : 4;
                }
            } else {
                n10 = 2;
            }
            u3.a((TrackChangeEvent.Builder)builder, (int)n10);
            Object object = cc02.l;
            if (object != null) {
                v3.a((TrackChangeEvent.Builder)builder, (String)object);
            }
            if ((object = cc02.m) != null) {
                w1.a((TrackChangeEvent.Builder)builder, (String)object);
            }
            if ((object = cc02.j) != null) {
                x1.a((TrackChangeEvent.Builder)builder, (String)object);
            }
            if ((n10 = cc02.i) != -1) {
                y1.a((TrackChangeEvent.Builder)builder, (int)n10);
            }
            if ((n10 = cc02.r) != -1) {
                z1.a((TrackChangeEvent.Builder)builder, (int)n10);
            }
            if ((n10 = cc02.s) != -1) {
                a2.a((TrackChangeEvent.Builder)builder, (int)n10);
            }
            if ((n10 = cc02.z) != -1) {
                b2.a((TrackChangeEvent.Builder)builder, (int)n10);
            }
            if ((n10 = cc02.A) != -1) {
                g2.a((TrackChangeEvent.Builder)builder, (int)n10);
            }
            if ((object = cc02.d) != null) {
                n10 = m92.a;
                object = object.split("-", -1);
                String string2 = object[0];
                object = ((String[])object).length >= 2 ? object[1] : null;
                object = Pair.create((Object)string2, (Object)object);
                r2.a((TrackChangeEvent.Builder)builder, (String)((String)object.first));
                object = object.second;
                if (object != null) {
                    c3.a((TrackChangeEvent.Builder)builder, (String)((String)object));
                }
            }
            if ((f11 = cc02.t) != -1.0f) {
                n3.a((TrackChangeEvent.Builder)builder, (float)f11);
            }
        } else {
            r3.a((TrackChangeEvent.Builder)builder, (int)0);
        }
        this.A = true;
        t3.a((PlaybackSession)this.c, (TrackChangeEvent)s3.a((TrackChangeEvent.Builder)builder));
    }

    @RequiresNonNull(value={"metricsBuilder"})
    private void a(l52 object, @Nullable qw0.b object2) {
        PlaybackMetrics.Builder builder = this.j;
        if (object2 == null) {
            return;
        }
        int n10 = ((l52)object).a(object2.a);
        if (n10 == -1) {
            return;
        }
        object2 = this.f;
        int n13 = 0;
        ((l52)object).a(n10, (l52.b)object2, false);
        ((l52)object).a(this.f.d, this.e, 0L);
        object = this.e.d.c;
        n10 = 2;
        if (object != null) {
            n13 = m92.a((Uri)object.a, (String)object.b);
            n13 = n13 != 0 ? (n13 != 1 ? (n13 != 2 ? 1 : 4) : 5) : 3;
        }
        h2.a((PlaybackMetrics.Builder)builder, (int)n13);
        object = this.e;
        if (!(((l52.d)object).o == -9223372036854775807L || ((l52.d)object).m || ((l52.d)object).j || ((l52.d)object).a())) {
            i2.a((PlaybackMetrics.Builder)builder, (long)m92.b((long)this.e.o));
        }
        n13 = this.e.a() ? n10 : 1;
        j2.a((PlaybackMetrics.Builder)builder, (int)n13);
        this.A = true;
    }

    public final void a(int n10) {
        if (n10 == 1) {
            this.u = true;
        }
        this.k = n10;
    }

    public final void a(ed.a object, int n10, long l10) {
        Object object2 = ((ed.a)object).d;
        if (object2 != null) {
            object2 = this.b.a(((ed.a)object).b, object2);
            Serializable serializable = this.h.get(object2);
            object = this.g.get(object2);
            HashMap<String, Long> hashMap = this.h;
            long l11 = 0L;
            long l13 = serializable == null ? 0L : (Long)serializable;
            hashMap.put((String)object2, l13 + l10);
            serializable = this.g;
            l10 = object == null ? l11 : (Long)object;
            ((HashMap)serializable).put(object2, l10 + (long)n10);
        }
    }

    public final void a(ed.a object, gw0 gw02) {
        block4: {
            block2: {
                block3: {
                    if (((ed.a)object).d == null) {
                        return;
                    }
                    cc0 cc02 = gw02.c;
                    cc02.getClass();
                    int n10 = gw02.d;
                    c00 c002 = this.b;
                    l52 l522 = ((ed.a)object).b;
                    object = ((ed.a)object).d;
                    object.getClass();
                    object = new /* Unavailable Anonymous Inner Class!! */;
                    n10 = gw02.b;
                    if (n10 == 0) break block2;
                    if (n10 == 1) break block3;
                    if (n10 == 2) break block2;
                    if (n10 == 3) {
                        this.q = object;
                    }
                    break block4;
                }
                this.p = object;
                break block4;
            }
            this.o = object;
        }
    }

    public final void a(ed.a a13, String string2) {
        qw0.b b10 = a13.d;
        if (b10 != null && b10.a()) {
            return;
        }
        this.a();
        this.i = string2;
        this.j = n2.a((PlaybackMetrics.Builder)m2.a((PlaybackMetrics.Builder)o3.a(), (String)"ExoPlayerLib"), (String)"2.18.1");
        this.a(a13.b, a13.d);
    }

    public final void a(gw0 gw02) {
        this.v = gw02.a;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(hi1 var1_1, ed.b var2_2) {
        block102: {
            block104: {
                block121: {
                    block120: {
                        block119: {
                            block118: {
                                block117: {
                                    block116: {
                                        block115: {
                                            block114: {
                                                block113: {
                                                    block105: {
                                                        block107: {
                                                            block108: {
                                                                block110: {
                                                                    block111: {
                                                                        block112: {
                                                                            block109: {
                                                                                block106: {
                                                                                    block103: {
                                                                                        if (var2_2.a() == 0) {
                                                                                            return;
                                                                                        }
                                                                                        for (var3_3 = 0; var3_3 < var2_2.a(); ++var3_3) {
                                                                                            var4_4 = var2_2.b(var3_3);
                                                                                            var13_5 = var2_2.c(var4_4);
                                                                                            if (var4_4 == 0) {
                                                                                                this.b.d((ed.a)var13_5);
                                                                                                continue;
                                                                                            }
                                                                                            if (var4_4 == 11) {
                                                                                                this.b.a((ed.a)var13_5, this.k);
                                                                                                continue;
                                                                                            }
                                                                                            this.b.c((ed.a)var13_5);
                                                                                        }
                                                                                        var11_6 = SystemClock.elapsedRealtime();
                                                                                        if (var2_2.a(0)) {
                                                                                            var13_5 = var2_2.c(0);
                                                                                            if (this.j != null) {
                                                                                                this.a(var13_5.b, var13_5.d);
                                                                                            }
                                                                                        }
                                                                                        if (var2_2.a(2) && this.j != null) {
                                                                                            block100: {
                                                                                                var14_7 = var1_1.getCurrentTracks().a().a(0);
                                                                                                while (var14_7.hasNext()) {
                                                                                                    var15_8 = (i72.a)var14_7.next();
                                                                                                    for (var3_3 = 0; var3_3 < var15_8.b; ++var3_3) {
                                                                                                        if (!var15_8.b(var3_3) || (var13_5 = var15_8.a((int)var3_3).p) == null) {
                                                                                                            continue;
                                                                                                        }
                                                                                                        break block100;
                                                                                                    }
                                                                                                }
                                                                                                var13_5 = null;
                                                                                            }
                                                                                            if (var13_5 != null) {
                                                                                                block101: {
                                                                                                    var14_7 = this.j;
                                                                                                    var3_3 = m92.a;
                                                                                                    for (var3_3 = 0; var3_3 < var13_5.e; ++var3_3) {
                                                                                                        var15_8 = var13_5.a((int)var3_3).c;
                                                                                                        if (var15_8.equals(cm.d)) {
                                                                                                            var3_3 = 3;
                                                                                                        } else if (var15_8.equals(cm.e)) {
                                                                                                            var3_3 = 2;
                                                                                                        } else {
                                                                                                            if (!var15_8.equals(cm.c)) continue;
                                                                                                            var3_3 = 6;
                                                                                                        }
                                                                                                        break block101;
                                                                                                    }
                                                                                                    var3_3 = 1;
                                                                                                }
                                                                                                l2.a((PlaybackMetrics.Builder)var14_7, (int)var3_3);
                                                                                            }
                                                                                        }
                                                                                        if (var2_2.a(1011)) {
                                                                                            ++this.z;
                                                                                        }
                                                                                        if ((var14_7 = this.n) == null) break block102;
                                                                                        var15_8 = this.a;
                                                                                        var5_9 = this.v == 4 ? 1 : 0;
                                                                                        if (var14_7.b != 1001) break block103;
                                                                                        var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                                                        break block104;
                                                                                    }
                                                                                    if (var14_7 instanceof g60) {
                                                                                        var13_5 = (g60)var14_7;
                                                                                        var3_3 = var13_5.d == 1 ? 1 : 0;
                                                                                        var7_11 = var13_5.h;
                                                                                    } else {
                                                                                        var7_11 = 0;
                                                                                        var3_3 = 0;
                                                                                    }
                                                                                    var13_5 = var14_7.getCause();
                                                                                    var13_5.getClass();
                                                                                    var8_10 = var13_5 instanceof IOException;
                                                                                    var6_12 = 6004;
                                                                                    var4_4 = 27;
                                                                                    if (!var8_10) break block105;
                                                                                    if (!(var13_5 instanceof eh0)) break block106;
                                                                                    var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                                                    break block104;
                                                                                }
                                                                                if (var13_5 instanceof dh0 || var13_5 instanceof fg1) break block107;
                                                                                var8_10 = var13_5 instanceof ch0;
                                                                                if (var8_10 || var13_5 instanceof g82.a) break block108;
                                                                                if (var14_7.b != 1002) break block109;
                                                                                var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                                                break block104;
                                                                            }
                                                                            if (!(var13_5 instanceof z30.a)) break block110;
                                                                            var13_5 = var13_5.getCause();
                                                                            var13_5.getClass();
                                                                            var3_3 = m92.a;
                                                                            if (var3_3 < 21 || !(var13_5 instanceof MediaDrm.MediaDrmStateException)) break block111;
                                                                            var5_9 = m92.a((String)((MediaDrm.MediaDrmStateException)var13_5).getDiagnosticInfo());
                                                                            if (var5_9 == 2 || var5_9 == 4) ** GOTO lbl-1000
                                                                            var3_3 = var6_12;
                                                                            if (var5_9 == 10) break block112;
                                                                            if (var5_9 == 7) ** GOTO lbl-1000
                                                                            if (var5_9 == 8) ** GOTO lbl-1000
                                                                            var3_3 = var6_12;
                                                                            block0 : switch (var5_9) {
                                                                                default: {
                                                                                    switch (var5_9) {
                                                                                        default: {
                                                                                            var3_3 = 6006;
                                                                                            break block0;
                                                                                        }
                                                                                        case 24: 
                                                                                        case 25: 
                                                                                        case 26: 
                                                                                        case 27: 
                                                                                        case 28: 
                                                                                    }
                                                                                    var3_3 = 6002;
                                                                                    break;
                                                                                }
                                                                                case 15: lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var3_3 = 6003;
                                                                                    break;
                                                                                }
                                                                                case 16: 
                                                                                case 18: lbl-1000:
                                                                                // 3 sources

                                                                                {
                                                                                    var3_3 = 6005;
                                                                                }
                                                                                case 17: 
                                                                                case 19: 
                                                                                case 20: 
                                                                                case 21: 
                                                                                case 22: 
                                                                            }
                                                                        }
                                                                        switch (var3_3) {
                                                                            default: {
                                                                                var3_3 = var4_4;
                                                                                break;
                                                                            }
                                                                            case 6005: {
                                                                                var3_3 = 26;
                                                                                break;
                                                                            }
                                                                            case 6004: {
                                                                                var3_3 = 25;
                                                                                break;
                                                                            }
                                                                            case 6003: {
                                                                                var3_3 = 28;
                                                                                break;
                                                                            }
                                                                            case 6002: {
                                                                                var3_3 = 24;
                                                                            }
                                                                        }
                                                                        var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                                        break block104;
                                                                    }
                                                                    var13_5 = var3_3 >= 23 && var13_5 instanceof MediaDrmResetException ? new /* Unavailable Anonymous Inner Class!! */ : (var3_3 >= 18 && var13_5 instanceof NotProvisionedException ? new /* Unavailable Anonymous Inner Class!! */ : (var3_3 >= 18 && var13_5 instanceof DeniedByServerException ? new /* Unavailable Anonymous Inner Class!! */ : (var13_5 instanceof s82 ? new /* Unavailable Anonymous Inner Class!! */ : (var13_5 instanceof kz.d ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */))));
                                                                    break block104;
                                                                }
                                                                if (var13_5 instanceof ab0.c && var13_5.getCause() instanceof FileNotFoundException) {
                                                                    var13_5 = var13_5.getCause();
                                                                    var13_5.getClass();
                                                                    var13_5 = var13_5.getCause();
                                                                    var13_5 = m92.a >= 21 && var13_5 instanceof ErrnoException && ((ErrnoException)var13_5).errno == OsConstants.EACCES ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */;
                                                                } else {
                                                                    var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                                }
                                                                break block104;
                                                            }
                                                            var13_5 = bd1.a((Context)var15_8).a() == 1 ? new /* Unavailable Anonymous Inner Class!! */ : ((var15_8 = var13_5.getCause()) instanceof UnknownHostException ? new /* Unavailable Anonymous Inner Class!! */ : (var15_8 instanceof SocketTimeoutException ? new /* Unavailable Anonymous Inner Class!! */ : (var8_10 && ((ch0)var13_5).d == 1 ? new /* Unavailable Anonymous Inner Class!! */ : new /* Unavailable Anonymous Inner Class!! */)));
                                                            break block104;
                                                        }
                                                        var3_3 = var5_9 != 0 ? 10 : 11;
                                                        var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                        break block104;
                                                    }
                                                    if (var3_3 == 0 || var7_11 != 0 && var7_11 != 1) break block113;
                                                    var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                    break block104;
                                                }
                                                if (var3_3 == 0 || var7_11 != 3) break block114;
                                                var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                                break block104;
                                            }
                                            if (var3_3 == 0 || var7_11 != 2) break block115;
                                            var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                            break block104;
                                        }
                                        if (!(var13_5 instanceof iv0.b)) break block116;
                                        var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                        break block104;
                                    }
                                    if (!(var13_5 instanceof fv0)) break block117;
                                    var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                    break block104;
                                }
                                if (!(var13_5 instanceof OutOfMemoryError)) break block118;
                                var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                                break block104;
                            }
                            if (!(var13_5 instanceof lh.b)) break block119;
                            var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                            break block104;
                        }
                        if (!(var13_5 instanceof lh.e)) break block120;
                        var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                        break block104;
                    }
                    if (m92.a < 16 || !(var13_5 instanceof MediaCodec.CryptoException)) break block121;
                    var5_9 = ((MediaCodec.CryptoException)var13_5).getErrorCode();
                    if (var5_9 == 2 || var5_9 == 4) ** GOTO lbl-1000
                    if (var5_9 == 10) ** GOTO lbl200
                    if (var5_9 == 7) ** GOTO lbl-1000
                    if (var5_9 == 8) ** GOTO lbl-1000
                    var3_3 = var6_12;
                    block14 : switch (var5_9) {
                        default: {
                            switch (var5_9) {
                                default: {
                                    var3_3 = 6006;
                                    break block14;
                                }
                                case 24: 
                                case 25: 
                                case 26: 
                                case 27: 
                                case 28: 
                            }
                            var3_3 = 6002;
                            break;
                        }
                        case 15: lbl-1000:
                        // 2 sources

                        {
                            var3_3 = 6003;
                            break;
                        }
lbl200:
                        // 1 sources

                        var3_3 = var6_12;
                        break;
                        case 16: 
                        case 18: lbl-1000:
                        // 3 sources

                        {
                            var3_3 = 6005;
                        }
                        case 17: 
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                    }
                    switch (var3_3) {
                        default: {
                            var3_3 = var4_4;
                            break;
                        }
                        case 6005: {
                            var3_3 = 26;
                            break;
                        }
                        case 6004: {
                            var3_3 = 25;
                            break;
                        }
                        case 6003: {
                            var3_3 = 28;
                            break;
                        }
                        case 6002: {
                            var3_3 = 24;
                        }
                    }
                    var13_5 = new /* Unavailable Anonymous Inner Class!! */;
                    break block104;
                }
                var13_5 = new /* Unavailable Anonymous Inner Class!! */;
            }
            u2.a((PlaybackSession)this.c, (PlaybackErrorEvent)t2.a((PlaybackErrorEvent.Builder)s2.a((PlaybackErrorEvent.Builder)q2.a((PlaybackErrorEvent.Builder)p2.a((PlaybackErrorEvent.Builder)o2.a((PlaybackErrorEvent.Builder)p3.a(), (long)(var11_6 - this.d)), (int)var13_5.a), (int)var13_5.b), (Exception)var14_7)));
            this.A = true;
            this.n = null;
        }
        if (var2_2.a(2)) {
            var13_5 = var1_1.getCurrentTracks();
            var9_13 = var13_5.a(2);
            var10_14 = var13_5.a(1);
            var8_10 = var13_5.a(3);
            if (var9_13 || var10_14 || var8_10) {
                if (!var9_13 && !m92.a((Object)this.r, null)) {
                    var3_3 = this.r == null ? 1 : 0;
                    this.r = null;
                    this.a(1, var11_6, null, var3_3);
                }
                if (!var10_14 && !m92.a((Object)this.s, null)) {
                    var3_3 = this.s == null ? 1 : 0;
                    this.s = null;
                    this.a(0, var11_6, null, var3_3);
                }
                if (!var8_10 && !m92.a((Object)this.t, null)) {
                    var3_3 = this.t == null ? 1 : 0;
                    this.t = null;
                    this.a(2, var11_6, null, var3_3);
                }
            }
        }
        if ((var13_5 = this.o) != null && var13_5.c.equals(this.b.b())) {
            var13_5 = this.o;
            var14_7 = var13_5.a;
            if (var14_7.s != -1) {
                var3_3 = var13_5.b;
                if (!m92.a((Object)this.r, (Object)var14_7)) {
                    if (this.r == null && var3_3 == 0) {
                        var3_3 = 1;
                    }
                    this.r = var14_7;
                    this.a(1, var11_6, (cc0)var14_7, var3_3);
                }
                this.o = null;
            }
        }
        if ((var13_5 = this.p) != null && var13_5.c.equals(this.b.b())) {
            var14_7 = this.p;
            var13_5 = var14_7.a;
            var3_3 = var14_7.b;
            if (!m92.a((Object)this.s, (Object)var13_5)) {
                if (this.s == null && var3_3 == 0) {
                    var3_3 = 1;
                }
                this.s = var13_5;
                this.a(0, var11_6, (cc0)var13_5, var3_3);
            }
            this.p = null;
        }
        if ((var13_5 = this.q) != null && var13_5.c.equals(this.b.b())) {
            var13_5 = this.q;
            var14_7 = var13_5.a;
            var3_3 = var13_5.b;
            if (!m92.a((Object)this.t, (Object)var14_7)) {
                if (this.t == null && var3_3 == 0) {
                    var3_3 = 1;
                }
                this.t = var14_7;
                this.a(2, var11_6, (cc0)var14_7, var3_3);
            }
            this.q = null;
        }
        switch (bd1.a((Context)this.a).a()) {
            default: {
                var3_3 = 1;
                break;
            }
            case 10: {
                var3_3 = 7;
                break;
            }
            case 9: {
                var3_3 = 8;
                break;
            }
            case 7: {
                var3_3 = 3;
                break;
            }
            case 5: {
                var3_3 = 6;
                break;
            }
            case 4: {
                var3_3 = 5;
                break;
            }
            case 3: {
                var3_3 = 4;
                break;
            }
            case 2: {
                var3_3 = 2;
                break;
            }
            case 1: {
                var3_3 = 9;
                break;
            }
            case 0: {
                var3_3 = 0;
            }
        }
        if (var3_3 != this.m) {
            this.m = var3_3;
            f2.a((PlaybackSession)this.c, (NetworkEvent)e2.a((NetworkEvent.Builder)d2.a((NetworkEvent.Builder)c2.a((NetworkEvent.Builder)m3.a(), (int)var3_3), (long)(var11_6 - this.d))));
        }
        if (var1_1.getPlaybackState() != 2) {
            this.u = false;
        }
        if (var1_1.a() == null) {
            this.w = false;
        } else if (var2_2.a(10)) {
            this.w = true;
        }
        var3_3 = 10;
        var4_4 = var1_1.getPlaybackState();
        if (this.u) {
            var3_3 = 5;
        } else if (this.w) {
            var3_3 = 13;
        } else if (var4_4 == 4) {
            var3_3 = 11;
        } else if (var4_4 == 2) {
            var4_4 = this.l;
            if (var4_4 != 0 && var4_4 != 2) {
                if (!var1_1.getPlayWhenReady()) {
                    var3_3 = 7;
                } else if (var1_1.getPlaybackSuppressionReason() == 0) {
                    var3_3 = 6;
                }
            } else {
                var3_3 = 2;
            }
        } else {
            var3_3 = 3;
            if (var4_4 == 3) {
                if (!var1_1.getPlayWhenReady()) {
                    var3_3 = 4;
                } else if (var1_1.getPlaybackSuppressionReason() != 0) {
                    var3_3 = 9;
                }
            } else {
                var3_3 = var4_4 == 1 && this.l != 0 ? 12 : this.l;
            }
        }
        if (this.l != var3_3) {
            this.l = var3_3;
            this.A = true;
            j3.a((PlaybackSession)this.c, (PlaybackStateEvent)i3.a((PlaybackStateEvent.Builder)h3.a((PlaybackStateEvent.Builder)g3.a((PlaybackStateEvent.Builder)q3.a(), (int)this.l), (long)(var11_6 - this.d))));
        }
        if (var2_2.a(1028)) {
            this.b.a(var2_2.c(1028));
        }
    }

    public final void a(hy hy2) {
        this.x += hy2.g;
        this.y += hy2.e;
    }

    public final void a(ng2 ng22) {
        b b10 = this.o;
        if (b10 != null) {
            cc0 cc02 = b10.a;
            if (cc02.s == -1) {
                this.o = new /* Unavailable Anonymous Inner Class!! */;
            }
        }
    }

    public final void a(yh1 yh12) {
        this.n = yh12;
    }

    public final LogSessionId b() {
        return k3.a((PlaybackSession)this.c);
    }

    public final void b(ed.a object, String string2) {
        object = object.d;
        if ((object == null || !object.a()) && string2.equals(this.i)) {
            this.a();
        }
        this.g.remove(string2);
        this.h.remove(string2);
    }
}

