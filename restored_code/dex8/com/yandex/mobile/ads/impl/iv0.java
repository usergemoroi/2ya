/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaCrypto
 *  android.media.MediaCryptoException
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.SystemClock
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.bm
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.cv0
 *  com.yandex.mobile.ads.impl.cv0$a
 *  com.yandex.mobile.ads.impl.cv0$b
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.eb3
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.gv0
 *  com.yandex.mobile.ads.impl.hy
 *  com.yandex.mobile.ads.impl.iv0$a
 *  com.yandex.mobile.ads.impl.iv0$b
 *  com.yandex.mobile.ads.impl.jv0
 *  com.yandex.mobile.ads.impl.jy$a
 *  com.yandex.mobile.ads.impl.k52
 *  com.yandex.mobile.ads.impl.kv0
 *  com.yandex.mobile.ads.impl.ly
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.mv0$b
 *  com.yandex.mobile.ads.impl.rm1
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.x52
 *  com.yandex.mobile.ads.impl.z30
 *  com.yandex.mobile.ads.impl.z30$a
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.bm;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.eb3;
import com.yandex.mobile.ads.impl.fv0;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.iv0;
import com.yandex.mobile.ads.impl.jk;
import com.yandex.mobile.ads.impl.jv0;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.k52;
import com.yandex.mobile.ads.impl.kc0;
import com.yandex.mobile.ads.impl.kv0;
import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.mv0;
import com.yandex.mobile.ads.impl.rm1;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.x52;
import com.yandex.mobile.ads.impl.xz;
import com.yandex.mobile.ads.impl.z30;
import com.yandex.mobile.ads.impl.zs0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class iv0
extends ck {
    private static final jv0 F0 = rm1.f();
    private static final byte[] G0 = new byte[]{0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final long[] A;
    @Nullable
    private g60 A0;
    @Nullable
    private cc0 B;
    protected hy B0;
    @Nullable
    private cc0 C;
    private long C0;
    @Nullable
    private z30 D;
    private long D0;
    @Nullable
    private z30 E;
    private int E0;
    @Nullable
    private MediaCrypto F;
    private boolean G;
    private long H;
    private float I;
    private float J;
    @Nullable
    private cv0 K;
    @Nullable
    private cc0 L;
    @Nullable
    private MediaFormat M;
    private boolean N;
    private float O;
    @Nullable
    private ArrayDeque<gv0> P;
    @Nullable
    private b Q;
    @Nullable
    private gv0 R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    private boolean b0;
    private boolean c0;
    @Nullable
    private bm d0;
    private long e0;
    private int f0;
    private int g0;
    @Nullable
    private ByteBuffer h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private boolean m0;
    private final cv0.b n;
    private boolean n0;
    private final kv0 o;
    private int o0;
    private final boolean p;
    private int p0;
    private final float q;
    private int q0;
    private final jy r;
    private boolean r0;
    private final jy s;
    private boolean s0;
    private final jy t;
    private boolean t0;
    private final jk u;
    private long u0;
    private final k52<cc0> v;
    private long v0;
    private final ArrayList<Long> w;
    private boolean w0;
    private final MediaCodec.BufferInfo x;
    private boolean x0;
    private final long[] y;
    private boolean y0;
    private final long[] z;
    private boolean z0;

    public iv0(int n10, xz object, kv0 kv02, float f10) {
        super(n10);
        this.n = object;
        this.o = (kv0)uf.a((Object)kv02);
        this.p = false;
        this.q = f10;
        this.r = jy.j();
        this.s = new jy(0);
        this.t = new jy(2);
        object = new jk();
        this.u = object;
        this.v = new k52();
        this.w = new ArrayList();
        this.x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.y = new long[10];
        this.z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        ((jy)((Object)object)).e(0);
        ((jy)((Object)object)).d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.o0 = 0;
        this.f0 = -1;
        this.g0 = -1;
        this.e0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.p0 = 0;
        this.q0 = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean A() throws g60 {
        block58: {
            block55: {
                block54: {
                    block56: {
                        block52: {
                            var10_1 = this.K;
                            if (var10_1 == null) return false;
                            if (this.p0 == 2) return false;
                            if (this.w0) {
                                return false;
                            }
                            if (this.f0 < 0) {
                                this.f0 = var1_4 = var10_1.b();
                                if (var1_4 < 0) {
                                    return false;
                                }
                                this.s.d = this.K.b(var1_4);
                                this.s.b();
                            }
                            if (this.p0 == 1) {
                                if (!this.c0) {
                                    this.s0 = true;
                                    this.K.a(this.f0, 0, 0L, 4);
                                    this.f0 = -1;
                                    this.s.d = null;
                                }
                                this.p0 = 2;
                                return false;
                            }
                            if (this.a0) {
                                this.a0 = false;
                                var11_5 = this.s.d;
                                var10_1 = iv0.G0;
                                var11_5.put((byte[])var10_1);
                                this.K.a(this.f0, ((cv0)var10_1).length, 0L, 0);
                                this.f0 = -1;
                                this.s.d = null;
                                this.r0 = true;
                                return true;
                            }
                            if (this.o0 == 1) {
                                for (var1_4 = 0; var1_4 < this.L.o.size(); ++var1_4) {
                                    var10_1 = this.L.o.get(var1_4);
                                    this.s.d.put((byte[])var10_1);
                                }
                                this.o0 = 2;
                            }
                            var2_9 = this.s.d.position();
                            var10_1 = this.q();
                            try {
                                var1_4 = this.a((dc0)var10_1, this.s, 0);
                                if (this.e()) {
                                    this.v0 = this.u0;
                                }
                                if (var1_4 == -3) {
                                    return false;
                                }
                                if (var1_4 != -5) break block52;
                                if (this.o0 == 2) {
                                    this.s.b();
                                    this.o0 = 1;
                                }
                                this.a((dc0)var10_1);
                                return true;
                            }
                            catch (jy.a var10_3) {
                                this.a((Exception)var10_3);
                                this.c(0);
                                this.B();
                                return true;
                            }
                        }
                        if (!this.s.f()) break block56;
                        if (this.o0 == 2) {
                            this.s.b();
                            this.o0 = 1;
                        }
                        this.w0 = true;
                        if (!this.r0) {
                            this.M();
                            return false;
                        }
                        try {
                            if (this.c0) {
                                return false;
                            }
                            this.s0 = true;
                            this.K.a(this.f0, 0, 0L, 4);
                            this.f0 = -1;
                            this.s.d = null;
                            return false;
                        }
                        catch (MediaCodec.CryptoException var10_2) {
                            block57: {
                                var11_6 = this.B;
                                var1_4 = var10_2.getErrorCode();
                                var2_9 = m92.a;
                                if (var1_4 == 2 || var1_4 == 4) break block57;
                                if (var1_4 == 10) ** GOTO lbl-1000
                                if (var1_4 == 7) break block57;
                                if (var1_4 == 8) ** GOTO lbl-1000
                                switch (var1_4) {
                                    default: {
                                        switch (var1_4) {
                                            default: {
                                                var1_4 = 6006;
                                                throw this.a((Exception)var10_2, var11_6, var1_4);
                                            }
                                            case 24: 
                                            case 25: 
                                            case 26: 
                                            case 27: 
                                            case 28: 
                                        }
                                        var1_4 = 6002;
                                        throw this.a((Exception)var10_2, var11_6, var1_4);
                                    }
                                    case 15: // 2 sources

                                    {
                                        var1_4 = 6003;
                                        throw this.a((Exception)var10_2, var11_6, var1_4);
                                    }
                                    case 17: 
                                    case 19: 
                                    case 20: 
                                    case 21: 
                                    case 22: // 2 sources

                                    {
                                        var1_4 = 6004;
                                        throw this.a((Exception)var10_2, var11_6, var1_4);
                                    }
                                    case 16: 
                                    case 18: 
                                }
                            }
                            var1_4 = 6005;
                            throw this.a((Exception)var10_2, var11_6, var1_4);
                        }
                    }
                    if (!this.r0 && !this.s.g()) {
                        this.s.b();
                        if (this.o0 != 2) return true;
                        this.o0 = 1;
                        return true;
                    }
                    var9_10 = this.s.i();
                    if (var9_10) {
                        this.s.c.a(var2_9);
                    }
                    if (this.T && !var9_10) {
                        block53: {
                            var10_1 = this.s.d;
                            var11_7 = g41.a;
                            var5_11 = var10_1.position();
                            var3_12 = 0;
                            var1_4 = 0;
                            while ((var4_13 = var3_12 + 1) < var5_11) {
                                var6_14 = var10_1.get(var3_12) & 255;
                                if (var1_4 == 3) {
                                    var2_9 = var1_4;
                                    if (var6_14 == 1) {
                                        var2_9 = var1_4;
                                        if ((var10_1.get(var4_13) & 31) == 7) {
                                            var11_7 = var10_1.duplicate();
                                            var11_7.position(var3_12 - 3);
                                            var11_7.limit(var5_11);
                                            var10_1.position(0);
                                            var10_1.put((ByteBuffer)var11_7);
                                            break block53;
                                        }
                                    }
                                } else {
                                    var2_9 = var1_4;
                                    if (var6_14 == 0) {
                                        var2_9 = var1_4 + 1;
                                    }
                                }
                                var1_4 = var2_9;
                                if (var6_14 != 0) {
                                    var1_4 = 0;
                                }
                                var3_12 = var4_13;
                            }
                            var10_1.clear();
                        }
                        if (this.s.d.position() == 0) {
                            return true;
                        }
                        this.T = false;
                    }
                    var10_1 = this.s;
                    var7_15 = var10_1.f;
                    var11_7 = this.d0;
                    if (var11_7 != null) {
                        var7_15 = var11_7.a(this.B, (jy)var10_1);
                        this.u0 = Math.max(this.u0, this.d0.a(this.B));
                    }
                    if (this.s.e()) {
                        this.w.add(var7_15);
                    }
                    if (this.y0) {
                        this.v.a((Object)this.B, var7_15);
                        this.y0 = false;
                    }
                    this.u0 = Math.max(this.u0, var7_15);
                    this.s.h();
                    if (this.s.d()) {
                        this.a(this.s);
                    }
                    this.b(this.s);
                    if (var9_10) {
                        try {
                            this.K.a(this.f0, this.s.c, var7_15);
                            break block54;
                        }
                        catch (MediaCodec.CryptoException var11_8) {
                            break block55;
                        }
                    }
                    this.K.a(this.f0, this.s.d.limit(), var7_15, 0);
                }
                this.f0 = -1;
                this.s.d = null;
                this.r0 = true;
                this.o0 = 0;
                var10_1 = this.B0;
                ++var10_1.c;
                return true;
            }
            var10_1 = this.B;
            var1_4 = var11_8.getErrorCode();
            var2_9 = m92.a;
            if (var1_4 == 2 || var1_4 == 4) break block58;
            if (var1_4 == 10) ** GOTO lbl-1000
            if (var1_4 == 7) break block58;
            if (var1_4 == 8) ** GOTO lbl-1000
            switch (var1_4) {
                default: {
                    switch (var1_4) {
                        default: {
                            var1_4 = 6006;
                            throw this.a((Exception)var11_8, (cc0)var10_1, var1_4);
                        }
                        case 24: 
                        case 25: 
                        case 26: 
                        case 27: 
                        case 28: 
                    }
                    var1_4 = 6002;
                    throw this.a((Exception)var11_8, (cc0)var10_1, var1_4);
                }
                case 15: // 2 sources

                {
                    var1_4 = 6003;
                    throw this.a((Exception)var11_8, (cc0)var10_1, var1_4);
                }
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: // 2 sources

                {
                    var1_4 = 6004;
                    throw this.a((Exception)var11_8, (cc0)var10_1, var1_4);
                }
                case 16: 
                case 18: 
            }
        }
        var1_4 = 6005;
        throw this.a((Exception)var11_8, (cc0)var10_1, var1_4);
    }

    private void B() {
        try {
            this.K.flush();
            return;
        }
        finally {
            this.P();
        }
    }

    @TargetApi(value=23)
    private void M() throws g60 {
        int n10 = this.q0;
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    this.x0 = true;
                    this.O();
                } else {
                    this.N();
                    this.K();
                }
            } else {
                this.B();
                this.S();
            }
        } else {
            this.B();
        }
    }

    @RequiresApi(value=23)
    private void S() throws g60 {
        z30 z302;
        try {
            this.F.setMediaDrmSession(this.a((z30)this.E).b);
            z302 = this.E;
        }
        catch (MediaCryptoException mediaCryptoException) {
            throw this.a((Exception)((Object)mediaCryptoException), this.B, 6006);
        }
        eb3.b((z30)this.D, (z30)z302);
        this.D = z302;
        this.p0 = 0;
        this.q0 = 0;
    }

    @Nullable
    private kc0 a(z30 z302) throws g60 {
        if ((z302 = z302.getCryptoConfig()) != null && !(z302 instanceof kc0)) {
            StringBuilder stringBuilder = new StringBuilder("Expecting FrameworkCryptoConfig but found: ");
            stringBuilder.append(z302);
            throw this.a(new IllegalArgumentException(stringBuilder.toString()), this.B, 6001);
        }
        return (kc0)z302;
    }

    private List<gv0> a(boolean bl2) throws mv0.b {
        ArrayList arrayList = this.a(this.o, this.B, bl2);
        Serializable serializable = arrayList;
        if (arrayList.isEmpty()) {
            serializable = arrayList;
            if (bl2) {
                arrayList = this.a(this.o, this.B, false);
                serializable = arrayList;
                if (!arrayList.isEmpty()) {
                    serializable = new StringBuilder("Drm session requires secure decoder for ");
                    ((StringBuilder)serializable).append(this.B.m);
                    ((StringBuilder)serializable).append(", but no secure decoder available. Trying to proceed with ");
                    ((StringBuilder)serializable).append(arrayList);
                    ((StringBuilder)serializable).append(".");
                    zs0.d((String)"MediaCodecRenderer", (String)((StringBuilder)serializable).toString());
                    serializable = arrayList;
                }
            }
        }
        return serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(MediaCrypto mediaCrypto, boolean bl2) throws b {
        gv0 gv02;
        Object object;
        if (this.P == null) {
            block12: {
                block11: {
                    try {
                        object = this.a(bl2);
                        this.P = gv02 = new ArrayDeque();
                        if (!this.p) break block11;
                        gv02.addAll(object);
                        break block12;
                    }
                    catch (mv0.b b10) {
                        throw new /* Unavailable Anonymous Inner Class!! */;
                    }
                }
                if (!object.isEmpty()) {
                    this.P.add(object.get(0));
                }
            }
            this.Q = null;
        }
        if (this.P.isEmpty()) throw new /* Unavailable Anonymous Inner Class!! */;
        gv02 = this.P.peekFirst();
        while (true) {
            if (this.K != null) {
                this.P = null;
                return;
            }
            gv0 gv03 = this.P.peekFirst();
            if (!this.a(gv03)) {
                return;
            }
            try {
                this.a(gv03, mediaCrypto);
                continue;
            }
            catch (Exception exception) {
                if (gv03 != gv02) throw exception;
                try {
                    zs0.d((String)"MediaCodecRenderer", (String)"Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    this.a(gv03, mediaCrypto);
                    continue;
                }
                catch (Exception exception2) {}
                object = new StringBuilder("Failed to initialize decoder: ");
                ((StringBuilder)object).append(gv03);
                zs0.b((String)"MediaCodecRenderer", (String)((StringBuilder)object).toString(), (Throwable)exception2);
                this.P.removeFirst();
                object = this.B;
                CharSequence charSequence = new StringBuilder("Decoder init failed: ");
                charSequence.append(gv03.a);
                charSequence.append(", ");
                charSequence.append(object);
                charSequence = charSequence.toString();
                String string2 = ((cc0)object).m;
                object = m92.a >= 21 ? b.b((Exception)exception2) : null;
                gv03 = new /* Unavailable Anonymous Inner Class!! */;
                this.a((Exception)gv03);
                object = this.Q;
                this.Q = object == null ? gv03 : new /* Unavailable Anonymous Inner Class!! */;
                if (this.P.isEmpty()) throw this.Q;
                continue;
            }
            break;
        }
    }

    private void a(gv0 gv02, MediaCrypto object) throws Exception {
        jv0 jv02;
        String string2 = gv02.a;
        int n10 = m92.a;
        float f10 = -1.0f;
        float f11 = n10 < 23 ? -1.0f : this.a(this.J, this.s());
        if (f11 <= this.q) {
            f11 = f10;
        }
        long l10 = SystemClock.elapsedRealtime();
        object = this.a(gv02, this.B, (MediaCrypto)object, f11);
        if (n10 >= 31) {
            a.a((cv0.a)object, (mi1)this.r());
        }
        CharSequence charSequence = new StringBuilder("createCodec:");
        ((StringBuilder)charSequence).append(string2);
        x52.a((String)((StringBuilder)charSequence).toString());
        this.K = this.n.a((cv0.a)object);
        long l11 = SystemClock.elapsedRealtime();
        this.R = gv02;
        this.O = f11;
        this.L = this.B;
        int n12 = n10 <= 25 && (object = F0).p().equals(string2) && (((String)(charSequence = m92.d)).startsWith(object.J()) || ((String)charSequence).startsWith(object.F()) || ((String)charSequence).startsWith(object.G()) || ((String)charSequence).startsWith(object.I())) ? 2 : (!(n10 >= 24 || !(jv02 = F0).s().equals(string2) && !jv02.t().equals(string2) || !((String)(object = jv02.f())).equals(charSequence = m92.b) && !jv02.g().equals(charSequence) && !jv02.k().equals(charSequence) && !jv02.M().equals(charSequence)) ? 1 : 0);
        this.S = n12;
        object = this.L;
        boolean bl2 = n10 < 21 && ((cc0)object).o.isEmpty() && F0.r().equals(string2);
        this.T = bl2;
        bl2 = n10 < 18 || n10 == 18 && ((object = F0).u().equals(string2) || object.v().equals(string2)) || n10 == 19 && ((String)(charSequence = m92.d)).startsWith((object = F0).H()) && (object.o().equals(string2) || object.p().equals(string2));
        this.U = bl2;
        bl2 = n10 == 29 && F0.d().equals(string2);
        this.V = bl2;
        bl2 = n10 <= 23 && F0.D().equals(string2) || n10 <= 19 && (((String)(object = (jv02 = F0).l())).equals(charSequence = m92.b) || jv02.L().equals(charSequence)) && (jv02.y().equals(string2) || jv02.z().equals(string2));
        this.W = bl2;
        bl2 = n10 == 21 && F0.C().equals(string2);
        this.X = bl2;
        bl2 = n10 < 21 && (charSequence = F0).w().equals(string2) && charSequence.K().equals(m92.c) && (((String)(object = m92.b)).startsWith(charSequence.c()) || ((String)object).startsWith(charSequence.j()) || ((String)object).startsWith(charSequence.h()) || ((String)object).startsWith(charSequence.i()) || ((String)object).startsWith(charSequence.m()) || ((String)object).startsWith(charSequence.n()));
        this.Y = bl2;
        object = this.L;
        bl2 = n10 <= 18 && ((cc0)object).z == 1 && F0.q().equals(string2);
        this.Z = bl2;
        object = gv02.a;
        bl2 = n10 <= 25 && F0.E().equals(object) || n10 <= 17 && F0.x().equals(object) || n10 <= 29 && ((charSequence = F0).A().equals(object) || charSequence.B().equals(object)) || (object = F0).b().equals(m92.c) && object.a().equals(m92.d) && gv02.f || this.G();
        this.c0 = bl2;
        this.K.getClass();
        if (F0.e().equals(gv02.a)) {
            this.d0 = new bm();
        }
        if (this.getState() == 2) {
            this.e0 = SystemClock.elapsedRealtime() + 1000L;
        }
        gv02 = this.B0;
        ++gv02.a;
        this.a(string2, l11, l11 - l10);
        return;
        finally {
            x52.a();
        }
    }

    private boolean b(long l10, long l11) throws g60 {
        if (this.x0 ^ true) {
            if (this.u.m()) {
                jk jk3 = this.u;
                ByteBuffer byteBuffer = jk3.d;
                int n10 = this.g0;
                int n12 = jk3.l();
                if (this.a(l10, l11, null, byteBuffer, n10, 0, n12, jk3.f, (jk3 = this.u).e(), this.u.f(), this.C)) {
                    this.c(this.u.k());
                    this.u.b();
                } else {
                    return false;
                }
            }
            if (this.w0) {
                this.x0 = true;
                return false;
            }
            if (this.l0) {
                if (this.u.a(this.t)) {
                    this.l0 = false;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.m0) {
                if (this.u.m()) {
                    return true;
                }
                this.m0 = false;
                this.u.b();
                this.t.b();
                this.l0 = false;
                this.k0 = false;
                this.m0 = false;
                this.K();
                if (!this.k0) {
                    return false;
                }
            }
            this.y();
            if (this.u.m()) {
                this.u.h();
            }
            boolean bl2 = this.u.m() || this.w0 || this.m0;
            return bl2;
        }
        throw new IllegalStateException();
    }

    private boolean c(int n10) throws g60 {
        dc0 dc02 = this.q();
        this.r.b();
        n10 = this.a(dc02, this.r, n10 | 4);
        if (n10 == -5) {
            this.a(dc02);
            return true;
        }
        if (n10 == -4 && this.r.f()) {
            this.w0 = true;
            this.M();
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean c(long var1_1, long var3_2) throws g60 {
        block28: {
            if (this.g0 < 0) {
                block27: {
                    if (this.X && this.s0) {
                        try {
                            var5_3 = this.K.a(this.x);
                        }
                        catch (IllegalStateException var13_4) {
                            this.M();
                            if (this.x0) {
                                this.N();
                            }
                            return false;
                        }
                    } else {
                        var5_3 = this.K.a(this.x);
                    }
                    if (var5_3 < 0) {
                        if (var5_3 == -2) {
                            this.t0 = true;
                            var13_5 = this.K.a();
                            if (this.S != 0 && var13_5.getInteger("width") == 32 && var13_5.getInteger("height") == 32) {
                                this.b0 = true;
                            } else {
                                if (this.Z) {
                                    var13_5.setInteger("channel-count", 1);
                                }
                                this.M = var13_5;
                                this.N = true;
                            }
                            return true;
                        }
                        if (this.c0 && (this.w0 || this.p0 == 2)) {
                            this.M();
                        }
                        return false;
                    }
                    if (this.b0) {
                        this.b0 = false;
                        this.K.a(false, var5_3);
                        return true;
                    }
                    var13_6 = this.x;
                    if (var13_6.size == 0 && (var13_6.flags & 4) != 0) {
                        this.M();
                        return false;
                    }
                    this.g0 = var5_3;
                    var13_6 = this.K.c(var5_3);
                    this.h0 = var13_6;
                    if (var13_6 != null) {
                        var13_6.position(this.x.offset);
                        var13_6 = this.h0;
                        var14_9 /* !! */  = this.x;
                        var13_6.limit(var14_9 /* !! */ .offset + var14_9 /* !! */ .size);
                    }
                    if (this.Y) {
                        var13_6 = this.x;
                        if (var13_6.presentationTimeUs == 0L && (var13_6.flags & 4) != 0 && (var9_10 = this.u0) != -9223372036854775807L) {
                            var13_6.presentationTimeUs = var9_10;
                        }
                    }
                    var9_10 = this.x.presentationTimeUs;
                    var6_11 = this.w.size();
                    for (var5_3 = 0; var5_3 < var6_11; ++var5_3) {
                        if (this.w.get(var5_3) != var9_10) continue;
                        this.w.remove(var5_3);
                        var7_12 = true;
                        break block27;
                    }
                    var7_12 = false;
                }
                this.i0 = var7_12;
                var11_13 = this.v0;
                var9_10 = this.x.presentationTimeUs;
                var7_12 = var11_13 == var9_10;
                this.j0 = var7_12;
                this.d(var9_10);
            }
            if (this.X && this.s0) {
                try {
                    var13_6 = this.K;
                    var14_9 /* !! */  = this.h0;
                    var6_11 = this.g0;
                    var15_14 /* !! */  = this.x;
                    var5_3 = var15_14 /* !! */ .flags;
                    var9_10 = var15_14 /* !! */ .presentationTimeUs;
                    var8_16 = this.i0;
                    var7_12 = this.j0;
                    var15_14 /* !! */  = this.C;
                }
                catch (IllegalStateException var13_7) // 2 sources

                {
                    while (true) {
                        this.M();
                        if (this.x0) {
                            this.N();
                        }
                        return false;
                    }
                }
                var7_12 = this.a(var1_1, var3_2, (cv0)var13_6, (ByteBuffer)var14_9 /* !! */ , var6_11, var5_3, 1, var9_10, var8_16, var7_12, (cc0)var15_14 /* !! */ );
                break block28;
            }
            var14_9 /* !! */  = this.K;
            var15_15 = this.h0;
            var5_3 = this.g0;
            var13_6 = this.x;
            var7_12 = this.a(var1_1, var3_2, var14_9 /* !! */ , var15_15, var5_3, var13_6.flags, 1, var13_6.presentationTimeUs, this.i0, this.j0, this.C);
        }
        if (var7_12) {
            this.c(this.x.presentationTimeUs);
            var5_3 = (this.x.flags & 4) != 0 ? 1 : 0;
            this.g0 = -1;
            this.h0 = null;
            if (var5_3 == 0) {
                return true;
            }
            this.M();
        }
        return false;
        // Removed invalid catch block
        }
    }

    private boolean c(cc0 cc02) throws g60 {
        if (m92.a < 23) {
            return true;
        }
        if (this.K != null && this.q0 != 3 && this.getState() != 0) {
            float f10 = this.O;
            float f11 = this.a(this.J, this.s());
            if (f10 == f11) {
                return true;
            }
            if (f11 == -1.0f) {
                if (this.r0) {
                    this.p0 = 1;
                    this.q0 = 3;
                } else {
                    this.N();
                    this.K();
                }
                return false;
            }
            if (f10 == -1.0f && !(f11 > this.q)) {
                return true;
            }
            cc02 = new Bundle();
            cc02.putFloat("operating-rate", f11);
            this.K.a((Bundle)cc02);
            this.O = f11;
        }
        return true;
    }

    private void y() throws g60 {
        if (this.w0 ^ true) {
            dc0 dc02;
            block6: {
                dc02 = this.q();
                this.t.b();
                do {
                    this.t.b();
                    int n10 = this.a(dc02, this.t, 0);
                    if (n10 == -5) break block6;
                    if (n10 != -4) {
                        if (n10 == -3) {
                            return;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.t.f()) {
                        this.w0 = true;
                        return;
                    }
                    if (this.y0) {
                        cc0 cc02 = this.B;
                        cc02.getClass();
                        this.C = cc02;
                        this.a(cc02, null);
                        this.y0 = false;
                    }
                    this.t.h();
                } while (this.u.a(this.t));
                this.l0 = true;
                return;
            }
            this.a(dc02);
            return;
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     */
    @TargetApi(value=23)
    private boolean z() throws g60 {
        if (!this.r0) {
            this.S();
            return true;
        }
        this.p0 = 1;
        if (!this.U && !this.W) {
            this.q0 = 2;
            return true;
        }
        this.q0 = 3;
        return false;
    }

    protected final void C() throws g60 {
        if (this.D()) {
            this.K();
        }
    }

    protected final boolean D() {
        if (this.K == null) {
            return false;
        }
        int n10 = this.q0;
        if (!(n10 == 3 || this.U || this.V && !this.t0 || this.W && this.s0)) {
            if (n10 == 2) {
                n10 = m92.a;
                if (n10 >= 23) {
                    if (n10 >= 23) {
                        try {
                            this.S();
                        }
                        catch (g60 g602) {
                            zs0.b((String)"MediaCodecRenderer", (String)"Failed to update the DRM session, releasing the codec instead.", (Throwable)g602);
                            this.N();
                            return true;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            this.B();
            return false;
        }
        this.N();
        return true;
    }

    @Nullable
    protected final cv0 E() {
        return this.K;
    }

    @Nullable
    protected final gv0 F() {
        return this.R;
    }

    protected boolean G() {
        return false;
    }

    @Nullable
    protected final MediaFormat H() {
        return this.M;
    }

    protected final long I() {
        return this.D0;
    }

    protected final float J() {
        return this.I;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void K() throws g60 {
        if (this.K != null) return;
        if (this.k0) return;
        Object object2 = this.B;
        if (object2 == null) {
            return;
        }
        Object object = this.E;
        boolean bl2 = false;
        if (object == null && this.b((cc0)object2)) {
            object = this.B;
            this.m0 = false;
            this.u.b();
            this.t.b();
            this.l0 = false;
            this.k0 = false;
            object = ((cc0)object).m;
            if (!("audio/mp4a-latm".equals(object) || "audio/mpeg".equals(object) || "audio/opus".equals(object))) {
                this.u.f(1);
            } else {
                this.u.f(32);
            }
            this.k0 = true;
            return;
        }
        object2 = this.E;
        eb3.b((z30)this.D, (z30)object2);
        this.D = object2;
        object = this.B.m;
        if (object2 != null) {
            if (this.F == null) {
                if ((object2 = this.a((z30)object2)) == null) {
                    if (this.D.getError() == null) return;
                } else {
                    boolean bl3;
                    block16: {
                        MediaCrypto mediaCrypto;
                        try {
                            this.F = mediaCrypto = new MediaCrypto(((kc0)object2).a, ((kc0)object2).b);
                            bl3 = bl2;
                            if (((kc0)object2).c) break block16;
                            bl3 = bl2;
                        }
                        catch (MediaCryptoException mediaCryptoException) {
                            throw this.a((Exception)((Object)mediaCryptoException), this.B, 6006);
                        }
                        if (mediaCrypto.requiresSecureDecoderComponent((String)object)) {
                            bl3 = true;
                        }
                    }
                    this.G = bl3;
                }
            }
            if (kc0.d) {
                int n10 = this.D.getState();
                if (n10 == 1) {
                    object = this.D.getError();
                    object.getClass();
                    throw this.a((Exception)object, this.B, ((z30.a)object).b);
                }
                if (n10 != 4) {
                    return;
                }
            }
        }
        try {
            this.a(this.F, this.G);
            return;
        }
        catch (b b10) {
            throw this.a((Exception)((Object)b10), this.B, 4001);
        }
    }

    protected abstract void L();

    protected final void N() {
        Throwable throwable4;
        block14: {
            Throwable throwable22;
            block13: {
                MediaCrypto mediaCrypto;
                block10: {
                    Throwable throwable32;
                    block12: {
                        block11: {
                            cv0 cv02;
                            block9: {
                                try {
                                    cv02 = this.K;
                                    if (cv02 == null) break block9;
                                }
                                catch (Throwable throwable22) {
                                    break block10;
                                }
                                cv02.release();
                                cv02 = this.B0;
                                ++cv02.b;
                                this.a(this.R.a);
                            }
                            this.K = null;
                            try {
                                cv02 = this.F;
                                if (cv02 == null) break block11;
                            }
                            catch (Throwable throwable32) {
                                break block12;
                            }
                            cv02.release();
                        }
                        this.F = null;
                        eb3.b((z30)this.D, null);
                        this.D = null;
                        this.Q();
                        return;
                    }
                    this.F = null;
                    eb3.b((z30)this.D, null);
                    this.D = null;
                    this.Q();
                    throw throwable32;
                }
                this.K = null;
                try {
                    mediaCrypto = this.F;
                    if (mediaCrypto == null) break block13;
                }
                catch (Throwable throwable4) {
                    break block14;
                }
                mediaCrypto.release();
            }
            this.F = null;
            eb3.b((z30)this.D, null);
            this.D = null;
            this.Q();
            throw throwable22;
        }
        this.F = null;
        eb3.b((z30)this.D, null);
        this.D = null;
        this.Q();
        throw throwable4;
    }

    protected void O() throws g60 {
    }

    @CallSuper
    protected void P() {
        this.f0 = -1;
        this.s.d = null;
        this.g0 = -1;
        this.h0 = null;
        this.e0 = -9223372036854775807L;
        this.s0 = false;
        this.r0 = false;
        this.a0 = false;
        this.b0 = false;
        this.i0 = false;
        this.j0 = false;
        this.w.clear();
        this.u0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        bm bm3 = this.d0;
        if (bm3 != null) {
            bm3.a();
        }
        this.p0 = 0;
        this.q0 = 0;
        this.o0 = this.n0 ? 1 : 0;
    }

    @CallSuper
    protected final void Q() {
        this.P();
        this.A0 = null;
        this.d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.c0 = false;
        this.n0 = false;
        this.o0 = 0;
        this.G = false;
    }

    protected final void R() {
        this.z0 = true;
    }

    protected abstract float a(float var1, cc0[] var2);

    public final int a(cc0 cc02) throws g60 {
        try {
            int n10 = this.a(this.o, cc02);
            return n10;
        }
        catch (mv0.b b10) {
            throw this.a((Exception)((Object)b10), cc02, 4002);
        }
    }

    protected abstract int a(kv0 var1, cc0 var2) throws mv0.b;

    protected abstract cv0.a a(gv0 var1, cc0 var2, @Nullable MediaCrypto var3, float var4);

    protected fv0 a(IllegalStateException illegalStateException, @Nullable gv0 gv02) {
        return new fv0(illegalStateException, gv02);
    }

    @CallSuper
    @Nullable
    protected ly a(dc0 dc02) throws g60 {
        cc0 cc02;
        block9: {
            cc0 cc03;
            gv0 gv02;
            block11: {
                int n10;
                z30 z302;
                block20: {
                    block17: {
                        block12: {
                            block18: {
                                block22: {
                                    block21: {
                                        block19: {
                                            block16: {
                                                block13: {
                                                    int n12;
                                                    boolean bl2;
                                                    boolean bl3;
                                                    block14: {
                                                        block15: {
                                                            block10: {
                                                                Object object;
                                                                bl3 = true;
                                                                this.y0 = true;
                                                                cc02 = dc02.b;
                                                                cc02.getClass();
                                                                if (cc02.m == null) break block9;
                                                                z302 = dc02.a;
                                                                eb3.b((z30)this.E, (z30)z302);
                                                                this.E = z302;
                                                                this.B = cc02;
                                                                if (this.k0) {
                                                                    this.m0 = true;
                                                                    return null;
                                                                }
                                                                dc02 = this.K;
                                                                if (dc02 == null) {
                                                                    this.P = null;
                                                                    this.K();
                                                                    return null;
                                                                }
                                                                gv02 = this.R;
                                                                cc03 = this.L;
                                                                z30 z303 = this.D;
                                                                if (z303 == z302) break block10;
                                                                if (z302 == null || z303 == null || m92.a < 23 || ((UUID)(object = cm.e)).equals(z303.getSchemeUuid()) || ((UUID)object).equals(z302.getSchemeUuid()) || (object = this.a(z302)) == null) break block11;
                                                                bl2 = ((kc0)object).c ? false : z302.requiresSecureDecoder(cc02.m);
                                                                if (!gv02.f && bl2) break block11;
                                                            }
                                                            if ((n10 = this.E != this.D ? 1 : 0) != 0 && m92.a < 23) {
                                                                throw new IllegalStateException();
                                                            }
                                                            z302 = this.a(gv02, cc03, cc02);
                                                            n12 = z302.d;
                                                            if (n12 == 0) break block12;
                                                            if (n12 == 1) break block13;
                                                            if (n12 == 2) break block14;
                                                            if (n12 != 3) break block15;
                                                            if (!this.c(cc02)) break block16;
                                                            this.L = cc02;
                                                            if (n10 == 0 || this.z()) break block17;
                                                            break block18;
                                                        }
                                                        throw new IllegalStateException();
                                                    }
                                                    if (!this.c(cc02)) break block16;
                                                    this.n0 = true;
                                                    this.o0 = 1;
                                                    n12 = this.S;
                                                    bl2 = bl3;
                                                    if (n12 != 2) {
                                                        bl2 = n12 == 1 && cc02.r == cc03.r && cc02.s == cc03.s ? bl3 : false;
                                                    }
                                                    this.a0 = bl2;
                                                    this.L = cc02;
                                                    if (n10 == 0 || this.z()) break block17;
                                                    break block18;
                                                }
                                                if (this.c(cc02)) break block19;
                                            }
                                            n10 = 16;
                                            break block20;
                                        }
                                        this.L = cc02;
                                        if (n10 == 0) break block21;
                                        if (this.z()) break block17;
                                        break block18;
                                    }
                                    if (!this.r0) break block17;
                                    this.p0 = 1;
                                    if (this.U || this.W) break block22;
                                    this.q0 = 1;
                                    break block17;
                                }
                                this.q0 = 3;
                            }
                            n10 = 2;
                            break block20;
                        }
                        if (this.r0) {
                            this.p0 = 1;
                            this.q0 = 3;
                        } else {
                            this.N();
                            this.K();
                        }
                    }
                    n10 = 0;
                }
                if (z302.d != 0 && (this.K != dc02 || this.q0 == 3)) {
                    return new ly(gv02.a, cc03, cc02, 0, n10);
                }
                return z302;
            }
            if (this.r0) {
                this.p0 = 1;
                this.q0 = 3;
            } else {
                this.N();
                this.K();
            }
            return new ly(gv02.a, cc03, cc02, 0, 128);
        }
        throw this.a(new IllegalArgumentException(), cc02, 4005);
    }

    protected abstract ly a(gv0 var1, cc0 var2, cc0 var3);

    protected abstract ArrayList a(kv0 var1, cc0 var2, boolean var3) throws mv0.b;

    @Override
    public void a(float f10, float f11) throws g60 {
        this.I = f10;
        this.J = f11;
        this.c(this.L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void a(long l10, long l11) throws g60 {
        IllegalStateException illegalStateException2;
        Object object;
        boolean bl2;
        boolean bl3;
        block19: {
            bl3 = this.z0;
            bl2 = false;
            if (bl3) {
                this.z0 = false;
                this.M();
            }
            if ((object = this.A0) != null) {
                this.A0 = null;
                throw object;
            }
            try {
                if (this.x0) {
                    this.O();
                    return;
                }
            }
            catch (IllegalStateException illegalStateException2) {
                break block19;
            }
            if (this.B == null && !this.c(2)) {
                return;
            }
            this.K();
            if (this.k0) {
                x52.a((String)"bypassRender");
                while (this.b(l10, l11)) {
                }
                x52.a();
            } else if (this.K != null) {
                long l13 = SystemClock.elapsedRealtime();
                x52.a((String)"drainAndFeed");
                while (this.c(l10, l11) && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - l13 < this.H)) {
                }
                while (this.A() && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - l13 < this.H)) {
                }
                x52.a();
            } else {
                object = this.B0;
                object.d += this.b(l10);
                this.c(1);
            }
            object = this.B0;
            // MONITORENTER : object
            // MONITOREXIT : object
            return;
        }
        int n10 = m92.a;
        if (n10 < 21 || !(illegalStateException2 instanceof MediaCodec.CodecException)) {
            object = illegalStateException2.getStackTrace();
            if (((StackTraceElement[])object).length <= 0) throw illegalStateException2;
            if (!object[0].getClassName().equals("android.media.MediaCodec")) throw illegalStateException2;
        }
        this.a(illegalStateException2);
        bl3 = bl2;
        if (n10 >= 21) {
            bl3 = bl2;
            if (illegalStateException2 instanceof MediaCodec.CodecException) {
                bl3 = bl2;
                if (((MediaCodec.CodecException)illegalStateException2).isRecoverable()) {
                    bl3 = true;
                }
            }
        }
        if (bl3) {
            this.N();
        }
        object = this.a(illegalStateException2, this.R);
        throw this.a(4003, this.B, (Exception)object, bl3);
    }

    @Override
    protected void a(long l10, boolean bl2) throws g60 {
        this.w0 = false;
        this.x0 = false;
        this.z0 = false;
        if (this.k0) {
            this.u.b();
            this.t.b();
            this.l0 = false;
        } else {
            this.C();
        }
        if (this.v.d() > 0) {
            this.y0 = true;
        }
        this.v.a();
        int n10 = this.E0;
        if (n10 != 0) {
            long[] lArray = this.z;
            this.D0 = lArray[--n10];
            this.C0 = this.y[n10];
            this.E0 = 0;
        }
    }

    protected abstract void a(cc0 var1, @Nullable MediaFormat var2) throws g60;

    protected final void a(g60 g602) {
        this.A0 = g602;
    }

    protected void a(jy jy2) throws g60 {
    }

    protected abstract void a(Exception var1);

    protected abstract void a(String var1);

    protected abstract void a(String var1, long var2, long var4);

    @Override
    protected void a(boolean bl2, boolean bl3) throws g60 {
        this.B0 = new hy();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final void a(cc0[] object, long l10, long l11) throws g60 {
        if (this.D0 == -9223372036854775807L) {
            if (this.C0 != -9223372036854775807L) throw new IllegalStateException();
            this.C0 = l10;
            this.D0 = l11;
            return;
        } else {
            int n10 = this.E0;
            if (n10 == this.z.length) {
                object = new StringBuilder("Too many stream changes, so dropping offset: ");
                ((StringBuilder)object).append(this.z[this.E0 - 1]);
                zs0.d((String)"MediaCodecRenderer", (String)((StringBuilder)object).toString());
            } else {
                this.E0 = n10 + 1;
            }
            object = this.y;
            n10 = this.E0 - 1;
            object[n10] = (cc0)l10;
            this.z[n10] = l11;
            this.A[n10] = this.u0;
        }
    }

    @Override
    public boolean a() {
        return this.x0;
    }

    protected abstract boolean a(long var1, long var3, @Nullable cv0 var5, @Nullable ByteBuffer var6, int var7, int var8, int var9, long var10, boolean var12, boolean var13, cc0 var14) throws g60;

    protected boolean a(gv0 gv02) {
        return true;
    }

    protected abstract void b(jy var1) throws g60;

    protected boolean b(cc0 cc02) {
        return false;
    }

    @CallSuper
    protected void c(long l10) {
        int n10;
        while ((n10 = this.E0) != 0 && l10 >= this.A[0]) {
            long[] lArray = this.y;
            this.C0 = lArray[0];
            this.D0 = this.z[0];
            this.E0 = --n10;
            System.arraycopy(lArray, 1, lArray, 0, n10);
            lArray = this.z;
            System.arraycopy(lArray, 1, lArray, 0, this.E0);
            lArray = this.A;
            System.arraycopy(lArray, 1, lArray, 0, this.E0);
            this.L();
        }
    }

    protected final void d(long l10) throws g60 {
        block7: {
            block6: {
                block5: {
                    cc0 cc02;
                    cc0 cc03 = cc02 = (cc0)this.v.b(l10);
                    if (cc02 == null) {
                        cc03 = cc02;
                        if (this.N) {
                            cc03 = (cc0)this.v.c();
                        }
                    }
                    if (cc03 == null) break block5;
                    this.C = cc03;
                    break block6;
                }
                if (!this.N || this.C == null) break block7;
            }
            this.a(this.C, this.M);
            this.N = false;
        }
    }

    @Override
    public boolean d() {
        boolean bl2 = this.B != null && (this.t() || this.g0 >= 0 || this.e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.e0);
        return bl2;
    }

    @Override
    public final int f() {
        return 8;
    }

    @Override
    protected void u() {
        this.B = null;
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.E0 = 0;
        this.D();
    }

    @Override
    protected void v() {
        try {
            this.m0 = false;
            this.u.b();
            this.t.b();
            this.l0 = false;
            this.k0 = false;
            this.N();
            return;
        }
        finally {
            eb3.b((z30)this.E, null);
            this.E = null;
        }
    }
}

