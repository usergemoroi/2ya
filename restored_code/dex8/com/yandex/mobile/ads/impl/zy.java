/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioTrack
 *  android.media.PlaybackParams
 *  android.os.SystemClock
 *  android.util.Pair
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.media3.exoplayer.audio.q
 *  androidx.media3.exoplayer.audio.r
 *  androidx.media3.exoplayer.audio.s
 *  androidx.media3.exoplayer.audio.t
 *  androidx.media3.exoplayer.audio.u
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.g21
 *  com.yandex.mobile.ads.impl.gh
 *  com.yandex.mobile.ads.impl.jb3
 *  com.yandex.mobile.ads.impl.jh
 *  com.yandex.mobile.ads.impl.jh$a
 *  com.yandex.mobile.ads.impl.jh$b
 *  com.yandex.mobile.ads.impl.kb3
 *  com.yandex.mobile.ads.impl.lh
 *  com.yandex.mobile.ads.impl.lh$a
 *  com.yandex.mobile.ads.impl.lh$b
 *  com.yandex.mobile.ads.impl.lh$c
 *  com.yandex.mobile.ads.impl.lh$d
 *  com.yandex.mobile.ads.impl.lh$e
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.oh
 *  com.yandex.mobile.ads.impl.oh$a
 *  com.yandex.mobile.ads.impl.p
 *  com.yandex.mobile.ads.impl.s
 *  com.yandex.mobile.ads.impl.sh
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.wq
 *  com.yandex.mobile.ads.impl.zs0
 *  com.yandex.mobile.ads.impl.zy$a
 *  com.yandex.mobile.ads.impl.zy$b
 *  com.yandex.mobile.ads.impl.zy$c
 *  com.yandex.mobile.ads.impl.zy$e
 *  com.yandex.mobile.ads.impl.zy$f
 *  com.yandex.mobile.ads.impl.zy$i
 *  com.yandex.mobile.ads.impl.zy$j
 *  com.yandex.mobile.ads.impl.zy$l
 */
package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.audio.q;
import androidx.media3.exoplayer.audio.r;
import androidx.media3.exoplayer.audio.t;
import androidx.media3.exoplayer.audio.u;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.az;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.dq0;
import com.yandex.mobile.ads.impl.dv0;
import com.yandex.mobile.ads.impl.eh;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.g21;
import com.yandex.mobile.ads.impl.gh;
import com.yandex.mobile.ads.impl.jb3;
import com.yandex.mobile.ads.impl.jh;
import com.yandex.mobile.ads.impl.kb3;
import com.yandex.mobile.ads.impl.lh;
import com.yandex.mobile.ads.impl.ly1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.o72;
import com.yandex.mobile.ads.impl.oh;
import com.yandex.mobile.ads.impl.p;
import com.yandex.mobile.ads.impl.p12;
import com.yandex.mobile.ads.impl.rn;
import com.yandex.mobile.ads.impl.s;
import com.yandex.mobile.ads.impl.sh;
import com.yandex.mobile.ads.impl.vb0;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.wq;
import com.yandex.mobile.ads.impl.wq1;
import com.yandex.mobile.ads.impl.zs0;
import com.yandex.mobile.ads.impl.zy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/*
 * Exception performing whole class analysis ignored.
 */
public final class zy
implements lh {
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private float J;
    private jh[] K;
    private ByteBuffer[] L;
    @Nullable
    private ByteBuffer M;
    private int N;
    @Nullable
    private ByteBuffer O;
    private byte[] P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private sh X;
    private boolean Y;
    private long Z;
    private final gh a;
    private boolean a0;
    private final c b;
    private boolean b0;
    private final boolean c;
    private final rn d;
    private final o72 e;
    private final jh[] f;
    private final jh[] g;
    private final wq h;
    private final oh i;
    private final ArrayDeque<i> j;
    private final boolean k;
    private final int l;
    private l m;
    private final j<lh.b> n;
    private final j<lh.e> o;
    private final az p;
    @Nullable
    private mi1 q;
    @Nullable
    private lh.c r;
    @Nullable
    private f s;
    private f t;
    @Nullable
    private AudioTrack u;
    private eh v;
    @Nullable
    private i w;
    private i x;
    private bi1 y;
    @Nullable
    private ByteBuffer z;

    @RequiresNonNull(value={"#1.audioProcessorChain"})
    private zy(e object) {
        rn rn3;
        this.a = com.yandex.mobile.ads.impl.zy$e.a(object);
        g g11 = com.yandex.mobile.ads.impl.zy$e.b(object);
        this.b = g11;
        int n10 = m92.a;
        boolean bl2 = n10 >= 21 && com.yandex.mobile.ads.impl.zy$e.c(object);
        this.c = bl2;
        bl2 = n10 >= 23 && com.yandex.mobile.ads.impl.zy$e.d(object);
        this.k = bl2;
        n10 = n10 >= 29 ? com.yandex.mobile.ads.impl.zy$e.e(object) : 0;
        this.l = n10;
        this.p = object.f;
        object = new wq(0);
        this.h = object;
        object.e();
        this.i = new oh((oh.a)new k(this, null));
        this.d = rn3 = new rn();
        object = new o72();
        this.e = object;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new wq1(), rn3, object);
        Collections.addAll(arrayList, g11.a());
        this.f = arrayList.toArray(new jh[0]);
        this.g = new jh[]{new vb0()};
        this.J = 1.0f;
        this.v = eh.h;
        this.W = 0;
        this.X = new sh();
        object = bi1.e;
        this.x = new /* Unavailable Anonymous Inner Class!! */;
        this.y = object;
        this.R = -1;
        this.K = new jh[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new /* Unavailable Anonymous Inner Class!! */;
        this.o = new /* Unavailable Anonymous Inner Class!! */;
    }

    /* synthetic */ zy(e e11, kb3 kb32) {
        this(e11);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private void a(long var1_1) {
        if (this.Y || !"audio/raw".equals(this.t.a.m)) ** GOTO lbl-1000
        var3_2 = this.t.a.B;
        if (!this.c) ** GOTO lbl-1000
        var4_3 = m92.a;
        if (var3_2 != 0x20000000 && var3_2 != 0x30000000 && var3_2 != 4) // 2 sources

        {
            var8_4 = this.b;
            var7_5 = this.i().a;
            var8_4 = (g)var8_4;
            com.yandex.mobile.ads.impl.zy$g.b((g)var8_4).b(var7_5.b);
            com.yandex.mobile.ads.impl.zy$g.b((g)var8_4).a(var7_5.c);
        } else // 2 sources

        {
            var7_5 = bi1.e;
        }
        var6_6 = this.Y;
        var4_3 = 0;
        if (var6_6 || !"audio/raw".equals(this.t.a.m)) ** GOTO lbl-1000
        var3_2 = this.t.a.B;
        if (!this.c) ** GOTO lbl-1000
        var5_7 = m92.a;
        if (var3_2 != 0x20000000 && var3_2 != 0x30000000 && var3_2 != 4) // 2 sources

        {
            var8_4 = this.b;
            var6_6 = this.i().b;
            com.yandex.mobile.ads.impl.zy$g.a((g)var8_4).a(var6_6);
        } else // 2 sources

        {
            var6_6 = false;
        }
        var9_8 = this.j;
        var1_1 = Math.max(0L, var1_1);
        var8_4 = this.t;
        var9_8.add(new /* Unavailable Anonymous Inner Class!! */);
        var8_4 = this.t.i;
        var9_8 = new ArrayList<E>();
        for (lh.c var7_5 : var8_4) {
            if (var7_5.isActive()) {
                var9_8.add(var7_5);
                continue;
            }
            var7_5.flush();
        }
        var3_2 = var9_8.size();
        this.K = var9_8.toArray(new jh[var3_2]);
        this.L = new ByteBuffer[var3_2];
        for (var3_2 = var4_3; var3_2 < ((jh[])(var7_5 = this.K)).length; ++var3_2) {
            var7_5 = var7_5[var3_2];
            var7_5.flush();
            this.L[var3_2] = var7_5.c();
        }
        var7_5 = this.r;
        if (var7_5 != null) {
            ((dv0.a)var7_5).a(var6_6);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(ByteBuffer var1_1, long var2_2) throws lh.e {
        block28: {
            block31: {
                block32: {
                    block33: {
                        block29: {
                            block30: {
                                if (!var1_1.hasRemaining()) {
                                    return;
                                }
                                var9_3 /* !! */  = this.O;
                                var8_4 = false;
                                if (var9_3 /* !! */  != null) {
                                    if (var9_3 /* !! */  != var1_1) {
                                        throw new IllegalArgumentException();
                                    }
                                } else {
                                    this.O = var1_1;
                                    if (m92.a < 21) {
                                        var5_5 = var1_1.remaining();
                                        var9_3 /* !! */  = this.P;
                                        if (var9_3 /* !! */  == null || ((Object)var9_3 /* !! */ ).length < var5_5) {
                                            this.P = new byte[var5_5];
                                        }
                                        var4_6 = var1_1.position();
                                        var1_1.get(this.P, 0, var5_5);
                                        var1_1.position(var4_6);
                                        this.Q = 0;
                                    }
                                }
                                var6_7 = var1_1.remaining();
                                var7_8 = m92.a;
                                if (var7_8 >= 21) break block29;
                                var4_6 = this.i.b(this.D);
                                if (var4_6 <= 0) break block30;
                                var4_6 = Math.min(var6_7, var4_6);
                                var4_6 = var5_5 = this.u.write(this.P, this.Q, var4_6);
                                if (var5_5 > 0) {
                                    this.Q += var5_5;
                                    var1_1.position(var1_1.position() + var5_5);
                                    var4_6 = var5_5;
                                }
                                break block28;
                            }
                            while (true) {
                                var4_6 = 0;
                                break block28;
                                break;
                            }
                        }
                        if (!this.Y) break block31;
                        if (var2_2 == -9223372036854775807L) break block32;
                        var10_9 = this.u;
                        if (var7_8 < 26) break block33;
                        var4_6 = var10_9.write((ByteBuffer)var1_1, var6_7, 1, var2_2 * 1000L);
                        break block28;
                    }
                    if (this.z == null) {
                        this.z = var9_3 /* !! */  = ByteBuffer.allocate(16);
                        var9_3 /* !! */ .order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(0x55550001);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, var6_7);
                        this.z.putLong(8, var2_2 * 1000L);
                        this.z.position(0);
                        this.A = var6_7;
                    }
                    if ((var5_5 = this.z.remaining()) <= 0) ** GOTO lbl66
                    var4_6 = var10_9.write(this.z, var5_5, 1);
                    if (var4_6 < 0) {
                        this.A = 0;
                    } else {
                        if (var4_6 < var5_5) ** continue;
lbl66:

                        this.A = (var4_6 = var10_9.write((ByteBuffer)var1_1, var6_7, 1)) < 0 ? 0 : (this.A -= var4_6);
                    }
                    break block28;
                }
                throw new IllegalStateException();
            }
            var4_6 = this.u.write((ByteBuffer)var1_1, var6_7, 1);
        }
        this.Z = SystemClock.elapsedRealtime();
        if (var4_6 < 0) {
            if (var7_8 >= 24 && var4_6 == -6 || var4_6 == -32) {
                var8_4 = true;
            }
            if (var8_4 && this.t.c == 1) {
                this.a0 = true;
            }
            var9_3 /* !! */  = new lh.e(var4_6, this.t.a, var8_4);
            var1_1 = this.r;
            if (var1_1 != null) {
                ((dv0.a)var1_1).a((Exception)var9_3 /* !! */ );
            }
            if (!var9_3 /* !! */ .c) {
                var1_1 = this.o;
                var1_1.getClass();
                var2_2 = SystemClock.elapsedRealtime();
                if (com.yandex.mobile.ads.impl.zy$j.a(var1_1) == null) {
                    com.yandex.mobile.ads.impl.zy$j.c(var1_1, (Exception)var9_3 /* !! */ );
                    com.yandex.mobile.ads.impl.zy$j.d(var1_1, (long)(100L + var2_2));
                }
                if (var2_2 >= com.yandex.mobile.ads.impl.zy$j.b(var1_1)) {
                    var10_9 = com.yandex.mobile.ads.impl.zy$j.a(var1_1);
                    if (var10_9 != var9_3 /* !! */ ) {
                        var10_9.addSuppressed((Throwable)var9_3 /* !! */ );
                    }
                    var9_3 /* !! */  = com.yandex.mobile.ads.impl.zy$j.a(var1_1);
                    com.yandex.mobile.ads.impl.zy$j.c(var1_1, null);
                    throw var9_3 /* !! */ ;
                }
                return;
            }
            throw var9_3 /* !! */ ;
        }
        com.yandex.mobile.ads.impl.zy$j.c(this.o, null);
        if (zy.a(this.u)) {
            if (this.E > 0L) {
                this.b0 = false;
            }
            if (this.U && (var9_3 /* !! */  = this.r) != null && var4_6 < var6_7 && !this.b0) {
                ((dv0.a)var9_3 /* !! */ ).b();
            }
        }
        if ((var5_5 = this.t.c) == 0) {
            this.D += (long)var4_6;
        }
        if (var4_6 == var6_7) {
            if (var5_5 != 0) {
                if (var1_1 == this.M) {
                    var2_2 = this.E;
                    this.E = (long)this.F * (long)this.N + var2_2;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.O = null;
        }
    }

    private static boolean a(AudioTrack audioTrack) {
        boolean bl2 = m92.a >= 29 && androidx.media3.exoplayer.audio.u.a((AudioTrack)audioTrack);
        return bl2;
    }

    private boolean a(cc0 cc02, eh eh3) {
        boolean bl2;
        block7: {
            block9: {
                boolean bl3;
                int n10;
                block8: {
                    n10 = m92.a;
                    bl2 = bl3 = false;
                    if (n10 < 29) break block7;
                    if (this.l != 0) break block8;
                    bl2 = bl3;
                    break block7;
                }
                String string2 = cc02.m;
                string2.getClass();
                int n13 = w01.b((String)string2, (String)cc02.j);
                if (n13 == 0) {
                    return false;
                }
                int n14 = m92.a((int)cc02.z);
                if (n14 == 0) {
                    return false;
                }
                int n15 = cc02.A;
                string2 = new AudioFormat.Builder().setSampleRate(n15).setChannelMask(n14).setEncoding(n13).build();
                eh3 = eh3.a().a;
                n14 = n10 >= 31 ? androidx.media3.exoplayer.audio.r.a((AudioFormat)string2, (AudioAttributes)eh3) : (!androidx.media3.exoplayer.audio.q.a((AudioFormat)string2, (AudioAttributes)eh3) ? 0 : (n10 == 30 && m92.d.startsWith("Pixel") ? 2 : 1));
                bl2 = bl3;
                if (n14 == 0) break block7;
                if (n14 != 1) {
                    if (n14 == 2) {
                        return true;
                    }
                    throw new IllegalStateException();
                }
                n14 = cc02.C == 0 && cc02.D == 0 ? 0 : 1;
                n13 = this.l == 1 ? 1 : 0;
                if (n14 == 0) break block9;
                bl2 = bl3;
                if (n13 != 0) break block7;
            }
            bl2 = true;
        }
        return bl2;
    }

    private void b(long l10) throws lh.e {
        int n10;
        int n13 = n10 = this.K.length;
        while (n13 >= 0) {
            ByteBuffer byteBuffer;
            if (n13 > 0) {
                byteBuffer = this.L[n13 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = jh.a;
                }
            }
            if (n13 == n10) {
                this.a(byteBuffer, l10);
            } else {
                Object object = this.K[n13];
                if (n13 > this.R) {
                    object.a(byteBuffer);
                }
                object = object.c();
                this.L[n13] = object;
                if (((Buffer)object).hasRemaining()) {
                    ++n13;
                    continue;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            --n13;
        }
    }

    @RequiresApi(value=23)
    private void b(bi1 bi12) {
        bi1 bi13 = bi12;
        if (this.l()) {
            bi12 = new PlaybackParams().allowDefaults().setSpeed(bi12.b).setPitch(bi12.c).setAudioFallbackMode(2);
            try {
                this.u.setPlaybackParams((PlaybackParams)bi12);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                zs0.b((String)"DefaultAudioSink", (String)"Failed to set playback params", (Throwable)illegalArgumentException);
            }
            bi13 = new bi1(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            this.i.a(bi13.b);
        }
        this.y = bi13;
    }

    static /* bridge */ /* synthetic */ boolean c(zy zy3) {
        return zy3.U;
    }

    static /* bridge */ /* synthetic */ wq e(zy zy3) {
        return zy3.h;
    }

    static /* bridge */ /* synthetic */ AudioTrack h(zy zy3) {
        return zy3.u;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean h() throws lh.e {
        if (this.R == -1) {
            this.R = 0;
lbl3:

            while (true) {
                var1_1 = true;
                break;
            }
        } else {
            var1_1 = false;
        }
        var2_2 = ++this.R;
        var3_3 /* !! */  = this.K;
        if (var2_2 < ((jh[])var3_3 /* !! */ ).length) {
            var3_3 /* !! */  = var3_3 /* !! */ [var2_2];
            if (var1_1) {
                var3_3 /* !! */ .d();
            }
            this.b(-9223372036854775807L);
            if (!var3_3 /* !! */ .a()) {
                return false;
            }

        }
        var3_3 /* !! */  = this.O;
        if (var3_3 /* !! */  != null) {
            this.a((ByteBuffer)var3_3 /* !! */ , -9223372036854775807L);
            if (this.O != null) {
                return false;
            }
        }
        this.R = -1;
        return true;
    }

    private i i() {
        i i14 = this.w;
        if (i14 == null) {
            i14 = !this.j.isEmpty() ? this.j.getLast() : this.x;
        }
        return i14;
    }

    private long j() {
        f f11 = this.t;
        long l10 = f11.c == 0 ? this.D / (long)f11.d : this.E;
        return l10;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean k() throws lh.b {
        lh.b b11222222;
        block23: {
            int n10;
            AudioTrack audioTrack;
            lh.b b14222222;
            f f11;
            Object object;
            block22: {
                if (!this.h.d()) {
                    return false;
                }
                object = this.t;
                object.getClass();
                {
        // Removed invalid catch block
                try {
                    object = object.a(this.Y, this.v, this.W);
                    break block22;
                }
                catch (lh.b b15) {
                    object = this.r;
                    if (object == null) throw b15;
                    ((dv0.a)object).a((Exception)((Object)b15));
                    throw b15;
                }
                object = this.t;
                if (object.h <= 1000000) break block23;
                f11 = new /* Unavailable Anonymous Inner Class!! */;
                object = f11.a(this.Y, this.v, this.W);
                this.t = f11;
                {
                    catch (lh.b b14222222) {}
                }
            }
            this.u = object;
            if (zy.a((AudioTrack)object)) {
                object = this.u;
                if (this.m == null) {
                    this.m = new /* Unavailable Anonymous Inner Class!! */;
                }
                this.m.a((AudioTrack)object);
                if (this.l != 3) {
                    audioTrack = this.u;
                    object = this.t.a;
                    androidx.media3.exoplayer.audio.t.a((AudioTrack)audioTrack, (int)object.C, (int)object.D);
                }
            }
            if ((n10 = m92.a) >= 31 && (object = this.q) != null) {
                com.yandex.mobile.ads.impl.zy$b.a((AudioTrack)this.u, (mi1)object);
            }
            this.W = this.u.getAudioSessionId();
            f11 = this.i;
            object = this.u;
            audioTrack = this.t;
            boolean bl2 = audioTrack.c == 2;
            f11.a((AudioTrack)object, bl2, audioTrack.g, audioTrack.d, audioTrack.h);
            if (this.l()) {
                if (n10 >= 21) {
                    this.u.setVolume(this.J);
                } else {
                    object = this.u;
                    float f12 = this.J;
                    object.setStereoVolume(f12, f12);
                }
            }
            if ((n10 = this.X.a) != 0) {
                this.u.attachAuxEffect(n10);
                this.u.setAuxEffectSendLevel(this.X.b);
            }
            this.H = true;
            return true;
        // Removed invalid catch block
                if (object == null) throw b16;
                ((dv0.a)object).a((Exception)((Object)b16));
                throw b16;
            }
            b11222222.addSuppressed(b14222222);
        }
        if (this.t.c != 1) throw b11222222;
        this.a0 = true;
        throw b11222222;
    }

    private boolean l() {
        boolean bl2 = this.u != null;
        return bl2;
    }

    private void m() {
        jh jh3;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.b0 = false;
        this.F = 0;
        this.x = new /* Unavailable Anonymous Inner Class!! */;
        this.I = 0L;
        this.w = null;
        this.j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.z = null;
        this.A = 0;
        this.e.j();
        for (int i14 = 0; i14 < ((jh[])(jh3 = this.K)).length; ++i14) {
            jh3 = jh3[i14];
            jh3.flush();
            this.L[i14] = jh3.c();
        }
    }

    public final long a(boolean bl2) {
        if (this.l() && !this.H) {
            long l10 = this.i.a(bl2);
            f f11 = this.t;
            l10 = Math.min(l10, this.j() * 1000000L / (long)f11.e);
            while (!this.j.isEmpty() && l10 >= this.j.getFirst().d) {
                this.x = this.j.remove();
            }
            f11 = this.x;
            long l11 = l10 - f11.d;
            if (f11.a.equals(bi1.e)) {
                l10 = this.x.c + l11;
            } else if (this.j.isEmpty()) {
                l10 = com.yandex.mobile.ads.impl.zy$g.b((g)this.b).a(l11) + this.x.c;
            } else {
                f11 = this.j.getFirst();
                l10 = f11.d - l10;
                float f12 = this.x.a.b;
                int n10 = m92.a;
                if (f12 != 1.0f) {
                    l10 = Math.round((double)l10 * (double)f12);
                }
                l10 = f11.c - l10;
            }
            f11 = this.t;
            return com.yandex.mobile.ads.impl.zy$g.a((g)this.b).i() * 1000000L / (long)f11.e + l10;
        }
        return Long.MIN_VALUE;
    }

    public final void a(int n10) {
        if (this.W != n10) {
            this.W = n10;
            boolean bl2 = n10 != 0;
            this.V = bl2;
            this.flush();
        }
    }

    public final void a(bi1 bi12) {
        float f11 = bi12.b;
        int n10 = m92.a;
        bi1 bi13 = new bi1(Math.max(0.1f, Math.min(f11, 8.0f)), Math.max(0.1f, Math.min(bi12.c, 8.0f)));
        if (this.k && m92.a >= 23) {
            this.b(bi13);
        } else {
            boolean bl2 = this.i().b;
            bi12 = this.i();
            if (!bi13.equals(bi12.a) || bl2 != bi12.b) {
                bi12 = new /* Unavailable Anonymous Inner Class!! */;
                if (this.l()) {
                    this.w = bi12;
                } else {
                    this.x = bi12;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(cc0 cc02, @Nullable int[] object) throws lh.a {
        int n10;
        int n13;
        int n14;
        int n15;
        int n16;
        Object object2;
        int n17;
        int n18;
        if ("audio/raw".equals(cc02.m)) {
            if (!m92.e((int)cc02.B)) throw new IllegalArgumentException();
            n18 = m92.b((int)cc02.B, (int)cc02.z);
            n17 = cc02.B;
            object2 = this.c && (n17 == 0x20000000 || n17 == 0x30000000 || n17 == 4) ? this.g : this.f;
            this.e.a(cc02.C, cc02.D);
            if (m92.a < 21 && cc02.z == 8 && object == null) {
                int[] nArray = new int[6];
                n17 = 0;
                while (true) {
                    object = nArray;
                    if (n17 >= 6) break;
                    nArray[n17] = n17;
                    ++n17;
                }
            }
            this.d.a((int[])object);
            object = new jh.a(cc02.A, cc02.z, cc02.B);
            for (Object object3 : object2) {
                jh.a a14;
                try {
                    a14 = object3.a((jh.a)object);
                    boolean bl2 = object3.isActive();
                    if (!bl2) continue;
                }
                catch (jh.b b11) {
                    throw new lh.a(b11, cc02);
                }
                object = a14;
            }
            n16 = ((jh.a)object).c;
            n15 = ((jh.a)object).a;
            n14 = m92.a((int)((jh.a)object).b);
            n13 = m92.b((int)n16, (int)((jh.a)object).b);
            object = object2;
            n10 = 0;
        } else {
            object = new jh[]{};
            n15 = cc02.A;
            boolean bl3 = this.a(cc02, this.v);
            n18 = -1;
            if (bl3) {
                object2 = cc02.m;
                object2.getClass();
                n17 = w01.b((String)object2, (String)cc02.j);
                n14 = m92.a((int)cc02.z);
                n10 = 1;
            } else {
                object2 = this.a.a(cc02);
                if (object2 == null) {
                    object = new StringBuilder("Unable to configure passthrough for: ");
                    ((StringBuilder)object).append(cc02);
                    throw new lh.a(((StringBuilder)object).toString(), cc02);
                }
                n17 = (Integer)((Pair)object2).first;
                n14 = (Integer)((Pair)object2).second;
                n10 = 2;
            }
            n13 = -1;
            n16 = n17;
        }
        object2 = this.p;
        int n19 = AudioTrack.getMinBufferSize((int)n15, (int)n14, (int)n16);
        if (n19 == -2) throw new IllegalStateException();
        double d14 = this.k ? 8.0 : 1.0;
        object2.getClass();
        int n23 = 250000;
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) throw new IllegalArgumentException();
                if (n16 == 5) {
                    n23 = 500000;
                }
                switch (n16) {
                    default: {
                        throw new IllegalArgumentException();
                    }
                    case 17: {
                        n17 = 336000;
                        break;
                    }
                    case 16: {
                        n17 = 256000;
                        break;
                    }
                    case 15: {
                        n17 = 8000;
                        break;
                    }
                    case 14: {
                        n17 = 3062500;
                        break;
                    }
                    case 12: {
                        n17 = 7000;
                        break;
                    }
                    case 11: {
                        n17 = 16000;
                        break;
                    }
                    case 10: {
                        n17 = 100000;
                        break;
                    }
                    case 9: {
                        n17 = 40000;
                        break;
                    }
                    case 8: {
                        n17 = 2250000;
                        break;
                    }
                    case 7: {
                        n17 = 192000;
                        break;
                    }
                    case 6: 
                    case 18: {
                        n17 = 768000;
                        break;
                    }
                    case 5: {
                        n17 = 80000;
                    }
                }
                n17 = dq0.a((long)n23 * (long)n17 / 1000000L);
            } else {
                switch (n16) {
                    default: {
                        throw new IllegalArgumentException();
                    }
                    case 17: {
                        n17 = 336000;
                        break;
                    }
                    case 16: {
                        n17 = 256000;
                        break;
                    }
                    case 15: {
                        n17 = 8000;
                        break;
                    }
                    case 14: {
                        n17 = 3062500;
                        break;
                    }
                    case 12: {
                        n17 = 7000;
                        break;
                    }
                    case 11: {
                        n17 = 16000;
                        break;
                    }
                    case 10: {
                        n17 = 100000;
                        break;
                    }
                    case 9: {
                        n17 = 40000;
                        break;
                    }
                    case 8: {
                        n17 = 2250000;
                        break;
                    }
                    case 7: {
                        n17 = 192000;
                        break;
                    }
                    case 6: 
                    case 18: {
                        n17 = 768000;
                        break;
                    }
                    case 5: {
                        n17 = 80000;
                    }
                }
                n17 = dq0.a((long)50000000 * (long)n17 / 1000000L);
            }
        } else {
            long l10 = 250000;
            long l11 = n15;
            long l13 = n13;
            int n24 = dq0.a(l10 * l11 * l13 / 1000000L);
            n23 = dq0.a((long)750000 * l11 * l13 / 1000000L);
            n17 = m92.a;
            n17 = Math.max(n24, Math.min(n19 * 4, n23));
        }
        n17 = (Math.max(n19, (int)((double)n17 * d14)) + n13 - 1) / n13;
        if (n16 == 0) {
            object = new StringBuilder("Invalid output encoding (mode=");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(") for: ");
            ((StringBuilder)object).append(cc02);
            throw new lh.a(((StringBuilder)object).toString(), cc02);
        }
        if (n14 == 0) {
            object = new StringBuilder("Invalid output channel config (mode=");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(") for: ");
            ((StringBuilder)object).append(cc02);
            throw new lh.a(((StringBuilder)object).toString(), cc02);
        }
        this.a0 = false;
        cc02 = new /* Unavailable Anonymous Inner Class!! */;
        if (this.l()) {
            this.s = cc02;
            return;
        }
        this.t = cc02;
    }

    public final void a(eh eh3) {
        if (this.v.equals(eh3)) {
            return;
        }
        this.v = eh3;
        if (this.Y) {
            return;
        }
        this.flush();
    }

    public final void a(lh.c c11) {
        this.r = c11;
    }

    public final void a(@Nullable mi1 mi12) {
        this.q = mi12;
    }

    public final void a(sh sh3) {
        if (this.X.equals((Object)sh3)) {
            return;
        }
        int n10 = sh3.a;
        float f11 = sh3.b;
        AudioTrack audioTrack = this.u;
        if (audioTrack != null) {
            if (this.X.a != n10) {
                audioTrack.attachAuxEffect(n10);
            }
            if (n10 != 0) {
                this.u.setAuxEffectSendLevel(f11);
            }
        }
        this.X = sh3;
    }

    public final boolean a() {
        boolean bl2 = !this.l() || this.S && !this.e();
        return bl2;
    }

    public final boolean a(cc0 cc02) {
        boolean bl2 = this.b(cc02) != 0;
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean a(ByteBuffer var1_1, long var2_2, int var4_3) throws lh.b, lh.e {
        block49: {
            block50: {
                block51: {
                    var14_4 = this.M;
                    if (var14_4 != null && var1_1 != var14_4) {
                        throw new IllegalArgumentException();
                    }
                    if (this.s != null) {
                        if (!this.h()) {
                            return false;
                        }
                        var15_5 /* !! */  = this.s;
                        var14_4 = this.t;
                        var15_5 /* !! */ .getClass();
                        if (var14_4.c == var15_5 /* !! */ .c && var14_4.g == var15_5 /* !! */ .g && var14_4.e == var15_5 /* !! */ .e && var14_4.f == var15_5 /* !! */ .f && var14_4.d == var15_5 /* !! */ .d) {
                            this.t = this.s;
                            this.s = null;
                            if (zy.a(this.u) && this.l != 3) {
                                if (this.u.getPlayState() == 3) {
                                    androidx.media3.exoplayer.audio.s.a((AudioTrack)this.u);
                                }
                                var14_4 = this.u;
                                var15_5 /* !! */  = this.t.a;
                                androidx.media3.exoplayer.audio.t.a((AudioTrack)var14_4, (int)var15_5 /* !! */ .C, (int)var15_5 /* !! */ .D);
                                this.b0 = true;
                            }
                        } else {
                            if (!this.T) {
                                this.T = true;
                                this.i.c(this.j());
                                this.u.stop();
                                this.A = 0;
                            }
                            if (this.e()) {
                                return false;
                            }
                            this.flush();
                        }
                        this.a(var2_2);
                    }
                    if (!this.l()) {
                        try {
                            var13_7 = this.k();
                            if (!var13_7) {
                                return false;
                            }
                        }
                        catch (lh.b var15_6) {
                            if (!var15_6.c) {
                                var1_1 = this.n;
                                var1_1.getClass();
                                var2_2 = SystemClock.elapsedRealtime();
                                if (com.yandex.mobile.ads.impl.zy$j.a(var1_1) == null) {
                                    com.yandex.mobile.ads.impl.zy$j.c(var1_1, (Exception)var15_6);
                                    com.yandex.mobile.ads.impl.zy$j.d(var1_1, (long)(100L + var2_2));
                                }
                                if (var2_2 >= com.yandex.mobile.ads.impl.zy$j.b(var1_1)) {
                                    var14_4 = com.yandex.mobile.ads.impl.zy$j.a(var1_1);
                                    if (var14_4 != var15_6) {
                                        var14_4.addSuppressed(var15_6);
                                    }
                                    var14_4 = com.yandex.mobile.ads.impl.zy$j.a(var1_1);
                                    com.yandex.mobile.ads.impl.zy$j.c(var1_1, null);
                                    throw var14_4;
                                }
                                return false;
                            }
                            throw var15_6;
                        }
                    }
                    com.yandex.mobile.ads.impl.zy$j.c(this.n, null);
                    if (this.H) {
                        this.I = Math.max(0L, var2_2);
                        this.G = false;
                        this.H = false;
                        if (this.k && m92.a >= 23) {
                            this.b(this.y);
                        }
                        this.a(var2_2);
                        if (this.U) {
                            this.play();
                        }
                    }
                    if (!this.i.f(this.j())) {
                        return false;
                    }
                    if (this.M != null) break block49;
                    if (var1_1.order() != ByteOrder.LITTLE_ENDIAN) break block50;
                    if (!var1_1.hasRemaining()) {
                        return true;
                    }
                    var14_4 = this.t;
                    if (var14_4.c == 0 || this.F != 0) break block51;
                    var5_8 = var14_4.g;
                    switch (var5_8) {
                        default: {
                            throw new IllegalStateException(fe.a((String)"Unexpected audio encoding: ", (int)var5_8));
                        }
                        case 17: {
                            var14_4 = new byte[16];
                            var5_8 = var1_1.position();
                            var1_1.get((byte[])var14_4);
                            var1_1.position(var5_8);
                            var5_8 = com.yandex.mobile.ads.impl.s.a((ag1)new ag1((int)16, (byte[])var14_4)).c;
                            break;
                        }
                        case 15: {
                            var5_8 = 512;
                            break;
                        }
                        case 14: {
                            var7_9 = var1_1.position();
                            var8_10 = var1_1.limit();
                            for (var5_8 = var7_9; var5_8 <= var8_10 - 10; ++var5_8) {
                                var6_11 = m92.a;
                                var6_11 = var1_1.getInt(var5_8 + 4);
                                if (var1_1.order() != ByteOrder.BIG_ENDIAN) {
                                    var6_11 = Integer.reverseBytes(var6_11);
                                }
                                if ((var6_11 & -2) != -126718022) continue;
                                var5_8 -= var7_9;

                            }
                            var5_8 = -1;
lbl101:

                            if (var5_8 == -1) {
                                var5_8 = 0;
                                break;
                            }
                            var6_11 = (var1_1.get(var1_1.position() + var5_8 + 7) & 255) == 187 ? 1 : 0;
                            var7_9 = var1_1.position();
                            var6_11 = var6_11 != 0 ? 9 : 8;
                            var5_8 = (40 << (var1_1.get(var7_9 + var5_8 + var6_11) >> 4 & 7)) * 16;
                            break;
                        }
                        case 11: 
                        case 12: {
                            var5_8 = 2048;
                            break;
                        }
                        case 10: 
                        case 16: {
                            var5_8 = 1024;
                            break;
                        }
                        case 9: {
                            var5_8 = var1_1.position();
                            var6_12 = m92.a;
                            var5_8 = var1_1.getInt(var5_8);
                            if (var1_1.order() != ByteOrder.BIG_ENDIAN) {
                                var5_8 = Integer.reverseBytes(var5_8);
                            }
                            var5_8 = g21.b((int)var5_8);
                            if (var5_8 != -1) break;
                            throw new IllegalArgumentException();
                        }
                        case 7: 
                        case 8: {
                            var6_13 = var1_1.position();
                            var5_8 = var1_1.get(var6_13);
                            if (var5_8 == -2) ** GOTO lbl143
                            if (var5_8 == -1) ** GOTO lbl140
                            if (var5_8 == 31) ** GOTO lbl135
                            var5_8 = (var1_1.get(var6_13 + 4) & 1) << 6;
                            var6_13 = var1_1.get(var6_13 + 5);
lbl132:

                            while (true) {
                                var6_13 &= 252;

                                break;
                            }
lbl135:

                            var5_8 = (var1_1.get(var6_13 + 5) & 7) << 4;
                            var6_13 = var1_1.get(var6_13 + 6);
lbl137:

                            while (true) {
                                var6_13 &= 60;

                                break;
                            }
lbl140:

                            var5_8 = (var1_1.get(var6_13 + 4) & 7) << 4;
                            var6_13 = var1_1.get(var6_13 + 7);

lbl143:

                            var5_8 = (var1_1.get(var6_13 + 5) & 1) << 6;
                            var6_13 = var1_1.get(var6_13 + 4);

lbl146:

                            var5_8 = ((var6_13 >> 2 | var5_8) + 1) * 32;
                            break;
                        }
                        case 5: 
                        case 6: 
                        case 18: {
                            var5_8 = com.yandex.mobile.ads.impl.p.a(var1_1);
                        }
                    }
                    this.F = var5_8;
                    if (var5_8 == 0) {
                        return true;
                    }
                }
                if (this.w != null) {
                    if (!this.h()) {
                        return false;
                    }
                    this.a(var2_2);
                    this.w = null;
                }
                var11_14 = this.I;
                var14_4 = this.t;
                var9_15 = var14_4.c == 0 ? this.B / (long)var14_4.b : this.C;
                var9_15 = (var9_15 - this.e.i()) * 1000000L / (long)var14_4.a.A + var11_14;
                if (!this.G && Math.abs(var9_15 - var2_2) > 200000L) {
                    var15_5 /* !! */  = this.r;
                    var14_4 = new lh.d(var2_2, var9_15);
                    ((dv0.a)var15_5 /* !! */ ).a((Exception)var14_4);
                    this.G = true;
                }
                if (this.G) {
                    if (!this.h()) {
                        return false;
                    }
                    var9_15 = var2_2 - var9_15;
                    this.I += var9_15;
                    this.G = false;
                    this.a(var2_2);
                    var14_4 = this.r;
                    if (var14_4 != null && var9_15 != 0L) {
                        ((dv0.a)var14_4).c();
                    }
                }
                if (this.t.c == 0) {
                    this.B += (long)var1_1.remaining();
                } else {
                    var9_15 = this.C;
                    this.C = (long)this.F * (long)var4_3 + var9_15;
                }
                this.M = var1_1;
                this.N = var4_3;
                break block49;
            }
            throw new IllegalArgumentException();
        }
        this.b(var2_2);
        if (!this.M.hasRemaining()) {
            this.M = null;
            this.N = 0;
            return true;
        }
        if (this.i.e(this.j())) {
            zs0.d((String)"DefaultAudioSink", (String)"Resetting stalled audio track");
            this.flush();
            return true;
        }
        return false;
    }

    public final int b(cc0 cc02) {
        if ("audio/raw".equals(cc02.m)) {
            if (!m92.e((int)cc02.B)) {
                StringBuilder stringBuilder = new StringBuilder("Invalid PCM encoding: ");
                stringBuilder.append(cc02.B);
                zs0.d((String)"DefaultAudioSink", (String)stringBuilder.toString());
                return 0;
            }
            int n10 = cc02.B;
            if (!(n10 == 2 || this.c && n10 == 4)) {
                return 1;
            }
            return 2;
        }
        if (!this.a0 && this.a(cc02, this.v)) {
            return 2;
        }
        if (this.a.a(cc02) != null) {
            return 2;
        }
        return 0;
    }

    public final void b() {
        int n10;
        this.flush();
        jh[] jhArray = this.f;
        int n13 = jhArray.length;
        for (n10 = 0; n10 < n13; ++n10) {
            jhArray[n10].b();
        }
        jhArray = this.g;
        n13 = jhArray.length;
        for (n10 = 0; n10 < n13; ++n10) {
            jhArray[n10].b();
        }
        this.U = false;
        this.a0 = false;
    }

    public final void b(boolean bl2) {
        bi1 bi12 = this.i().a;
        i i14 = this.i();
        if (!bi12.equals(i14.a) || bl2 != i14.b) {
            bi12 = new /* Unavailable Anonymous Inner Class!! */;
            if (this.l()) {
                this.w = bi12;
            } else {
                this.x = bi12;
            }
        }
    }

    public final void c() {
        if (m92.a >= 21) {
            if (this.V) {
                if (!this.Y) {
                    this.Y = true;
                    this.flush();
                }
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void d() throws lh.e {
        if (!this.S && this.l() && this.h()) {
            if (!this.T) {
                this.T = true;
                this.i.c(this.j());
                this.u.stop();
                this.A = 0;
            }
            this.S = true;
        }
    }

    public final boolean e() {
        boolean bl2 = this.l() && this.i.d(this.j());
        return bl2;
    }

    public final void f() {
        if (this.Y) {
            this.Y = false;
            this.flush();
        }
    }

    public final void flush() {
        if (this.l()) {
            f f11;
            l l10;
            this.m();
            if (this.i.b()) {
                this.u.pause();
            }
            if (zy.a(this.u)) {
                l10 = this.m;
                l10.getClass();
                l10.b(this.u);
            }
            l10 = this.u;
            this.u = null;
            if (m92.a < 21 && !this.V) {
                this.W = 0;
            }
            if ((f11 = this.s) != null) {
                this.t = f11;
                this.s = null;
            }
            this.i.d();
            this.h.c();
            new a(this, (AudioTrack)l10).start();
        }
        com.yandex.mobile.ads.impl.zy$j.c(this.o, null);
        com.yandex.mobile.ads.impl.zy$j.c(this.n, null);
    }

    public final void g() {
        this.G = true;
    }

    public final bi1 getPlaybackParameters() {
        bi1 bi12 = this.k ? this.y : this.i().a;
        return bi12;
    }

    public final void pause() {
        this.U = false;
        if (this.l() && this.i.c()) {
            this.u.pause();
        }
    }

    public final void play() {
        this.U = true;
        if (this.l()) {
            this.i.e();
            this.u.play();
        }
    }

    public final void setVolume(float f11) {
        if (this.J != f11) {
            this.J = f11;
            if (this.l()) {
                if (m92.a >= 21) {
                    this.u.setVolume(this.J);
                } else {
                    AudioTrack audioTrack = this.u;
                    f11 = this.J;
                    audioTrack.setStereoVolume(f11, f11);
                }
            }
        }
    }

    public static final class g
    implements c {
        private final jh[] a;
        private final ly1 b;
        private final p12 c;

        public g(jh[] jhArray, ly1 ly12, p12 p122) {
            jh[] jhArray2 = new jh[jhArray.length + 2];
            this.a = jhArray2;
            System.arraycopy(jhArray, 0, jhArray2, 0, jhArray.length);
            this.b = ly12;
            this.c = p122;
            jhArray2[jhArray.length] = ly12;
            jhArray2[jhArray.length + 1] = p122;
        }

        static /* bridge */ /* synthetic */ ly1 a(g g11) {
            return g11.b;
        }

        static /* bridge */ /* synthetic */ p12 b(g g11) {
            return g11.c;
        }

        public final jh[] a() {
            return this.a;
        }
    }

    private final class k
    implements oh.a {
        final zy a;

        private k(zy zy3) {
            this.a = zy3;
        }

        /* synthetic */ k(zy zy3, jb3 jb32) {
            this(zy3);
        }

        public final void a(int n10, long l10) {
            if (this.a.r != null) {
                long l11 = SystemClock.elapsedRealtime();
                zy zy3 = this.a;
                long l13 = zy3.Z;
                ((dv0.a)zy3.r).a(n10, l10, l11 - l13);
            }
        }

        public final void a(long l10) {
            lh.c c11 = this.a.r;
            if (c11 != null) {
                ((dv0.a)c11).a(l10);
            }
        }

        public final void a(long l10, long l11, long l13, long l14) {
            StringBuilder stringBuilder = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            stringBuilder.append(l10);
            stringBuilder.append(", ");
            stringBuilder.append(l11);
            stringBuilder.append(", ");
            stringBuilder.append(l13);
            stringBuilder.append(", ");
            stringBuilder.append(l14);
            stringBuilder.append(", ");
            zy zy3 = this.a;
            f f11 = zy3.t;
            l10 = f11.c == 0 ? zy3.B / (long)f11.b : zy3.C;
            stringBuilder.append(l10);
            stringBuilder.append(", ");
            stringBuilder.append(this.a.j());
            zs0.d((String)"DefaultAudioSink", (String)stringBuilder.toString());
        }

        public final void b(long l10) {
            StringBuilder stringBuilder = new StringBuilder("Ignoring impossibly large audio latency: ");
            stringBuilder.append(l10);
            zs0.d((String)"DefaultAudioSink", (String)stringBuilder.toString());
        }

        public final void b(long l10, long l11, long l13, long l14) {
            StringBuilder stringBuilder = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            stringBuilder.append(l10);
            stringBuilder.append(", ");
            stringBuilder.append(l11);
            stringBuilder.append(", ");
            stringBuilder.append(l13);
            stringBuilder.append(", ");
            stringBuilder.append(l14);
            stringBuilder.append(", ");
            zy zy3 = this.a;
            f f11 = zy3.t;
            l10 = f11.c == 0 ? zy3.B / (long)f11.b : zy3.C;
            stringBuilder.append(l10);
            stringBuilder.append(", ");
            stringBuilder.append(this.a.j());
            zs0.d((String)"DefaultAudioSink", (String)stringBuilder.toString());
        }
    }
}

