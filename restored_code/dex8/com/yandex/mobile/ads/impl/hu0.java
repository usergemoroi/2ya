/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.av2
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.bt0
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.g62$a
 *  com.yandex.mobile.ads.impl.gu0
 *  com.yandex.mobile.ads.impl.hu0$b
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.m30
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.nf0
 *  com.yandex.mobile.ads.impl.p72
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.s40
 *  com.yandex.mobile.ads.impl.t40
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.w02
 *  com.yandex.mobile.ads.impl.wh
 *  com.yandex.mobile.ads.impl.x92
 *  com.yandex.mobile.ads.impl.y30
 *  com.yandex.mobile.ads.impl.y30$b
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.av2;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.bt0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.fq;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.gu0;
import com.yandex.mobile.ads.impl.hu0;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.m30;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mz;
import com.yandex.mobile.ads.impl.nf0;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.p72;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.s40;
import com.yandex.mobile.ads.impl.t40;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.w02;
import com.yandex.mobile.ads.impl.wh;
import com.yandex.mobile.ads.impl.wn;
import com.yandex.mobile.ads.impl.x92;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.y30;
import com.yandex.mobile.ads.impl.zs0;
import com.yandex.mobile.ads.impl.zu2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class hu0
implements t70 {
    private static final byte[] c0;
    private static final byte[] d0;
    private static final byte[] e0;
    private static final byte[] f0;
    private static final UUID g0;
    private static final Map<String, Integer> h0;
    private long A = -1L;
    private long B = -9223372036854775807L;
    @Nullable
    private bt0 C;
    @Nullable
    private bt0 D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;
    private final t40 a;
    private boolean a0;
    private final x92 b;
    private v70 b0;
    private final SparseArray<b> c;
    private final boolean d;
    private final bg1 e;
    private final bg1 f;
    private final bg1 g;
    private final bg1 h;
    private final bg1 i;
    private final bg1 j;
    private final bg1 k;
    private final bg1 l;
    private final bg1 m;
    private final bg1 n;
    private ByteBuffer o;
    private long p;
    private long q = -1L;
    private long r = -9223372036854775807L;
    private long s = -9223372036854775807L;
    private long t = -9223372036854775807L;
    @Nullable
    private b u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z = -1L;

    static {
        new zu2();
        c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        d0 = m92.c((String)"Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(0x100000000001000L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        gu0.a((int)0, hashMap, (String)"htc_video_rotA-000", (int)90, (String)"htc_video_rotA-090");
        gu0.a((int)180, hashMap, (String)"htc_video_rotA-180", (int)270, (String)"htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public hu0() {
        this(new mz());
    }

    hu0(mz mz3) {
        this.a = mz3;
        mz3.a(new a(this, null));
        this.d = true;
        this.b = new x92();
        this.c = new SparseArray();
        this.g = new bg1(4);
        this.h = new bg1(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new bg1(4);
        this.e = new bg1(g41.a);
        this.f = new bg1(4);
        this.j = new bg1();
        this.k = new bg1();
        this.l = new bg1(8);
        this.m = new bg1();
        this.n = new bg1();
        this.L = new int[1];
    }

    static /* bridge */ /* synthetic */ boolean A(hu0 hu02) {
        return hu02.v;
    }

    static /* bridge */ /* synthetic */ long B(hu0 hu02) {
        return hu02.z;
    }

    static /* bridge */ /* synthetic */ void C(hu0 hu02, long l10) {
        hu02.B = l10;
    }

    static /* bridge */ /* synthetic */ void D(hu0 hu02, bt0 bt02) {
        hu02.C = bt02;
    }

    static /* bridge */ /* synthetic */ void E(hu0 hu02, bt0 bt02) {
        hu02.D = bt02;
    }

    static /* bridge */ /* synthetic */ void F(hu0 hu02, boolean bl2) {
        hu02.E = bl2;
    }

    static /* bridge */ /* synthetic */ void G(hu0 hu02, int n10) {
        hu02.G = n10;
    }

    static /* bridge */ /* synthetic */ void H(hu0 hu02, long l10) {
        hu02.H = l10;
    }

    static /* bridge */ /* synthetic */ void I(hu0 hu02, long l10) {
        hu02.I = l10;
    }

    static /* bridge */ /* synthetic */ void J(hu0 hu02, int n10) {
        hu02.J = n10;
    }

    static /* bridge */ /* synthetic */ void K(hu0 hu02, int n10) {
        hu02.K = n10;
    }

    static /* bridge */ /* synthetic */ void L(hu0 hu02, int[] nArray) {
        hu02.L = nArray;
    }

    static /* bridge */ /* synthetic */ void M(hu0 hu02, int n10) {
        hu02.M = n10;
    }

    static /* bridge */ /* synthetic */ void N(hu0 hu02, int n10) {
        hu02.N = n10;
    }

    static /* bridge */ /* synthetic */ void O(hu0 hu02, int n10) {
        hu02.O = n10;
    }

    static /* bridge */ /* synthetic */ void P(hu0 hu02, int n10) {
        hu02.P = n10;
    }

    static /* bridge */ /* synthetic */ void Q(hu0 hu02, boolean bl2) {
        hu02.Q = bl2;
    }

    static /* bridge */ /* synthetic */ void S(hu0 hu02, long l10) {
        hu02.p = l10;
    }

    static /* bridge */ /* synthetic */ void T(hu0 hu02, long l10) {
        hu02.q = l10;
    }

    static /* bridge */ /* synthetic */ void W(hu0 hu02, b b10) {
        hu02.u = b10;
    }

    static /* bridge */ /* synthetic */ void X(hu0 hu02, boolean bl2) {
        hu02.v = bl2;
    }

    static /* bridge */ /* synthetic */ void Y(hu0 hu02, int n10) {
        hu02.w = n10;
    }

    @RequiresNonNull(value={"#2.output"})
    private int a(oz oz3, b b10, int n10, boolean bl2) throws IOException {
        int n13;
        int n14;
        Object object;
        int n15;
        int n16;
        if ("S_TEXT/UTF8".equals(b10.b)) {
            this.a(oz3, c0, n10);
            n10 = this.T;
            this.b();
            return n10;
        }
        if ("S_TEXT/ASS".equals(b10.b)) {
            this.a(oz3, e0, n10);
            n10 = this.T;
            this.b();
            return n10;
        }
        if ("S_TEXT/WEBVTT".equals(b10.b)) {
            this.a(oz3, f0, n10);
            n10 = this.T;
            this.b();
            return n10;
        }
        g62 g622 = b10.X;
        if (!this.V) {
            if (b10.h) {
                this.O &= 0xBFFFFFFF;
                boolean bl3 = this.W;
                n16 = 128;
                if (!bl3) {
                    oz3.a(this.g.c(), 0, 1, false);
                    ++this.S;
                    if ((this.g.c()[0] & 0x80) != 128) {
                        this.Z = this.g.c()[0];
                        this.W = true;
                    } else {
                        throw fg1.a((String)"Extension bit is set in signal byte", null);
                    }
                }
                if (((n15 = (int)this.Z) & 1) == 1) {
                    n15 = (n15 & 2) == 2 ? 1 : 0;
                    this.O |= 0x40000000;
                    if (!this.a0) {
                        oz3.a(this.l.c(), 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        object = this.g.c();
                        if (n15 == 0) {
                            n16 = 0;
                        }
                        object[0] = (byte)(n16 | 8);
                        this.g.e(0);
                        g622.b(1, this.g);
                        ++this.T;
                        this.l.e(0);
                        g622.b(8, this.l);
                        this.T += 8;
                    }
                    if (n15 != 0) {
                        if (!this.X) {
                            oz3.a(this.g.c(), 0, 1, false);
                            ++this.S;
                            this.g.e(0);
                            this.Y = this.g.t();
                            this.X = true;
                        }
                        n15 = this.Y * 4;
                        this.g.c(n15);
                        oz3.a(this.g.c(), 0, n15, false);
                        this.S += n15;
                        short s13 = (short)(this.Y / 2 + 1);
                        n14 = s13 * 6 + 2;
                        object = this.o;
                        if (object == null || object.capacity() < n14) {
                            this.o = ByteBuffer.allocate(n14);
                        }
                        this.o.position(0);
                        this.o.putShort(s13);
                        n16 = 0;
                        for (n15 = 0; n15 < (n13 = this.Y); ++n15) {
                            n13 = this.g.x();
                            if (n15 % 2 == 0) {
                                this.o.putShort((short)(n13 - n16));
                            } else {
                                this.o.putInt(n13 - n16);
                            }
                            n16 = n13;
                        }
                        n15 = n10 - this.S - n16;
                        if (n13 % 2 == 1) {
                            this.o.putInt(n15);
                        } else {
                            this.o.putShort((short)n15);
                            this.o.putInt(0);
                        }
                        this.m.a(n14, this.o.array());
                        g622.b(n14, this.m);
                        this.T += n14;
                    }
                }
            } else {
                object = b10.i;
                if (object != null) {
                    this.j.a(((byte[])object).length, object);
                }
            }
            if ("A_OPUS".equals(b10.b) ? bl2 : b10.f > 0) {
                this.O |= 0x10000000;
                this.n.c(0);
                n15 = this.j.e() + n10 - this.S;
                this.g.c(4);
                this.g.c()[0] = (byte)(n15 >> 24 & 0xFF);
                this.g.c()[1] = (byte)(n15 >> 16 & 0xFF);
                this.g.c()[2] = (byte)(n15 >> 8 & 0xFF);
                this.g.c()[3] = (byte)(n15 & 0xFF);
                g622.b(4, this.g);
                this.T += 4;
            }
            this.V = true;
        }
        n15 = this.j.e() + n10;
        if (!"V_MPEG4/ISO/AVC".equals(b10.b) && !"V_MPEGH/ISO/HEVC".equals(b10.b)) {
            if (b10.T != null) {
                if (this.j.e() == 0) {
                    b10.T.a((u70)oz3);
                } else {
                    throw new IllegalStateException();
                }
            }
            while ((n10 = this.S) < n15) {
                n10 = n15 - n10;
                n16 = this.j.a();
                if (n16 > 0) {
                    n10 = Math.min(n10, n16);
                    g622.a(n10, this.j);
                } else {
                    n10 = g622.b((iv)oz3, n10, false);
                }
                this.S += n10;
                this.T += n10;
            }
        } else {
            object = this.f.c();
            object[0] = 0;
            object[1] = 0;
            object[2] = 0;
            n16 = b10.Y;
            n13 = 4 - n16;
            while (this.S < n15) {
                n10 = this.U;
                if (n10 == 0) {
                    n10 = Math.min(n16, this.j.a());
                    oz3.a((byte[])object, n13 + n10, n16 - n10, false);
                    if (n10 > 0) {
                        this.j.a(object, n13, n10);
                    }
                    this.S += n16;
                    this.f.e(0);
                    this.U = this.f.x();
                    this.e.e(0);
                    g622.a(4, this.e);
                    this.T += 4;
                    continue;
                }
                n14 = this.j.a();
                if (n14 > 0) {
                    n10 = Math.min(n10, n14);
                    g622.a(n10, this.j);
                } else {
                    n10 = g622.b((iv)oz3, n10, false);
                }
                this.S += n10;
                this.T += n10;
                this.U -= n10;
            }
        }
        if ("A_VORBIS".equals(b10.b)) {
            this.h.e(0);
            g622.a(4, this.h);
            this.T += 4;
        }
        n10 = this.T;
        this.b();
        return n10;
    }

    private long a(long l10) throws fg1 {
        long l11 = this.r;
        if (l11 != -9223372036854775807L) {
            return m92.a((long)l10, (long)l11, (long)1000L);
        }
        throw fg1.a((String)"Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull(value={"currentTrack"})
    private void a(int n10) throws fg1 {
        if (this.u != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Element ");
        stringBuilder.append(n10);
        stringBuilder.append(" must be in a TrackEntry");
        throw fg1.a((String)stringBuilder.toString(), null);
    }

    @RequiresNonNull(value={"#1.output"})
    private void a(b b10, long l10, int n10, int n13, int n14) {
        Object object = b10.T;
        if (object != null) {
            object.a(b10.X, l10, n10, n13, n14, b10.j);
        } else {
            int n15;
            if ("S_TEXT/UTF8".equals(b10.b) || "S_TEXT/ASS".equals(b10.b) || "S_TEXT/WEBVTT".equals(b10.b)) {
                if (this.K > 1) {
                    zs0.d((String)"MatroskaExtractor", (String)"Skipping subtitle sample in laced block.");
                } else {
                    long l11 = this.I;
                    if (l11 == -9223372036854775807L) {
                        zs0.d((String)"MatroskaExtractor", (String)"Skipping subtitle sample with no duration.");
                    } else {
                        object = b10.b;
                        Object object2 = this.k.c();
                        object.getClass();
                        int n16 = object.hashCode();
                        n15 = -1;
                        switch (n16) {
                            default: {
                                break;
                            }
                            case 1422270023: {
                                if (!object.equals("S_TEXT/UTF8")) break;
                                n15 = 2;
                                break;
                            }
                            case 1045209816: {
                                if (!object.equals("S_TEXT/WEBVTT")) break;
                                n15 = 1;
                                break;
                            }
                            case 738597099: {
                                if (!object.equals("S_TEXT/ASS")) break;
                                n15 = 0;
                            }
                        }
                        switch (n15) {
                            default: {
                                throw new IllegalArgumentException();
                            }
                            case 2: {
                                object = hu0.a("%02d:%02d:%02d,%03d", l11, 1000L);
                                n15 = 19;
                                break;
                            }
                            case 1: {
                                object = hu0.a("%02d:%02d:%02d.%03d", l11, 1000L);
                                n15 = 25;
                                break;
                            }
                            case 0: {
                                object = hu0.a("%01d:%02d:%02d:%02d", l11, 10000L);
                                n15 = 21;
                            }
                        }
                        System.arraycopy(object, 0, object2, n15, ((p72)object).length);
                        for (n15 = this.k.d(); n15 < this.k.e(); ++n15) {
                            if (this.k.c()[n15] != 0) continue;
                            this.k.d(n15);
                            break;
                        }
                        object = b10.X;
                        object2 = this.k;
                        object.a(object2.e(), (bg1)object2);
                        n13 = this.k.e() + n13;
                    }
                }
            }
            n15 = n13;
            if ((n10 & 0x10000000) != 0) {
                if (this.K > 1) {
                    this.n.c(0);
                    n15 = n13;
                } else {
                    n15 = this.n.e();
                    b10.X.b(n15, this.n);
                    n15 = n13 + n15;
                }
            }
            b10.X.a(l10, n10, n15, n14, b10.j);
        }
        this.F = true;
    }

    private void a(oz oz3, int n10) throws IOException {
        if (this.g.e() >= n10) {
            return;
        }
        if (this.g.b() < n10) {
            bg1 bg12 = this.g;
            bg12.a(Math.max(bg12.b() * 2, n10));
        }
        oz3.a(this.g.c(), this.g.e(), n10 - this.g.e(), false);
        this.g.d(n10);
    }

    private void a(oz oz3, byte[] byArray, int n10) throws IOException {
        int n13 = byArray.length + n10;
        if (this.k.b() < n13) {
            this.k.a(Arrays.copyOf(byArray, n13 + n10));
        } else {
            System.arraycopy(byArray, 0, this.k.c(), 0, byArray.length);
        }
        oz3.a(this.k.c(), byArray.length, n10, false);
        this.k.e(0);
        this.k.d(n13);
    }

    private static byte[] a(String string2, long l10, long l11) {
        if (l10 != -9223372036854775807L) {
            int n10 = (int)(l10 / 3600000000L);
            int n13 = (int)((l10 -= (long)n10 * 3600000000L) / 60000000L);
            int n14 = (int)((l10 -= (long)n13 * 60000000L) / 1000000L);
            int n15 = (int)((l10 - (long)n14 * 1000000L) / l11);
            return m92.c((String)String.format(Locale.US, string2, n10, n13, n14, n15));
        }
        throw new IllegalArgumentException();
    }

    private static t70[] a() {
        return new t70[]{new hu0(new mz())};
    }

    static /* bridge */ /* synthetic */ void a0(hu0 hu02, boolean bl2) {
        hu02.y = bl2;
    }

    private void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = 0;
        this.a0 = false;
        this.j.c(0);
    }

    static /* bridge */ /* synthetic */ int b0(hu0 hu02, oz oz3, b b10, int n10, boolean bl2) {
        return hu02.a(oz3, b10, n10, bl2);
    }

    public static /* synthetic */ t70[] c() {
        return hu0.a();
    }

    static /* bridge */ /* synthetic */ long c0(hu0 hu02, long l10) {
        return hu02.a(l10);
    }

    static /* bridge */ /* synthetic */ long d(hu0 hu02) {
        return hu02.B;
    }

    static /* bridge */ /* synthetic */ bt0 e(hu0 hu02) {
        return hu02.C;
    }

    static /* bridge */ /* synthetic */ void e0(hu0 hu02, b b10, long l10, int n10, int n13, int n14) {
        hu02.a(b10, l10, n10, n13, n14);
    }

    static /* bridge */ /* synthetic */ bt0 f(hu0 hu02) {
        return hu02.D;
    }

    static /* bridge */ /* synthetic */ void f0(hu0 hu02, oz oz3, int n10) {
        hu02.a(oz3, n10);
    }

    static /* bridge */ /* synthetic */ boolean g(hu0 hu02) {
        return hu02.E;
    }

    static /* bridge */ /* synthetic */ int h(hu0 hu02) {
        return hu02.G;
    }

    static /* bridge */ /* synthetic */ long i(hu0 hu02) {
        return hu02.H;
    }

    static /* bridge */ /* synthetic */ int j(hu0 hu02) {
        return hu02.J;
    }

    static /* bridge */ /* synthetic */ int k(hu0 hu02) {
        return hu02.K;
    }

    static /* bridge */ /* synthetic */ int[] l(hu0 hu02) {
        return hu02.L;
    }

    static /* bridge */ /* synthetic */ int m(hu0 hu02) {
        return hu02.M;
    }

    static /* bridge */ /* synthetic */ int n(hu0 hu02) {
        return hu02.N;
    }

    static /* bridge */ /* synthetic */ int o(hu0 hu02) {
        return hu02.O;
    }

    static /* bridge */ /* synthetic */ int p(hu0 hu02) {
        return hu02.P;
    }

    static /* bridge */ /* synthetic */ x92 q(hu0 hu02) {
        return hu02.b;
    }

    static /* bridge */ /* synthetic */ v70 r(hu0 hu02) {
        return hu02.b0;
    }

    static /* bridge */ /* synthetic */ SparseArray s(hu0 hu02) {
        return hu02.c;
    }

    static /* bridge */ /* synthetic */ boolean t(hu0 hu02) {
        return hu02.d;
    }

    static /* bridge */ /* synthetic */ bg1 u(hu0 hu02) {
        return hu02.g;
    }

    static /* bridge */ /* synthetic */ bg1 v(hu0 hu02) {
        return hu02.i;
    }

    static /* bridge */ /* synthetic */ bg1 w(hu0 hu02) {
        return hu02.n;
    }

    static /* bridge */ /* synthetic */ long y(hu0 hu02) {
        return hu02.t;
    }

    public final int a(u70 u702, qj1 qj12) throws IOException {
        int n10 = 0;
        this.F = false;
        boolean bl2 = true;
        while (bl2 && !this.F) {
            boolean bl3;
            mz mz3 = (mz)this.a;
            oz oz3 = (oz)u702;
            bl2 = bl3 = mz3.a(oz3);
            if (!bl3) continue;
            long l10 = oz3.a();
            if (this.y) {
                this.A = l10;
                qj12.a = this.z;
                this.y = false;
            } else {
                bl2 = bl3;
                if (!this.v) continue;
                l10 = this.A;
                bl2 = bl3;
                if (l10 == -1L) continue;
                qj12.a = l10;
                this.A = -1L;
            }
            return 1;
        }
        if (!bl2) {
            while (n10 < this.c.size()) {
                qj12 = this.c.valueAt(n10);
                qj12.X.getClass();
                u702 = qj12.T;
                if (u702 != null) {
                    u702.a(qj12.X, qj12.j);
                }
                ++n10;
            }
            return -1;
        }
        return 0;
    }

    @CallSuper
    public final void a(long l10, long l11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((mz)this.a).a();
        this.b.b();
        this.b();
        for (int i14 = 0; i14 < this.c.size(); ++i14) {
            p72 p722 = (this.c.valueAt((int)i14)).T;
            if (p722 == null) continue;
            p722.a();
        }
    }

    public final void a(v70 v702) {
        this.b0 = v702;
    }

    public final boolean a(u70 u702) throws IOException {
        return new w02().b((oz)u702);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @CallSuper
    protected final void b(int var1_1) throws fg1 {
        block223: {
            var5_2 = 1;
            var20_3 = this.b0;
            if (var20_3 == null) throw new IllegalStateException();
            if (var1_1 == 160) break block223;
            if (var1_1 != 174) {
                if (var1_1 == 19899) {
                    var1_1 = this.w;
                    if (var1_1 == -1) throw fg1.a((String)"Mandatory element SeekID or SeekPosition not found", null);
                    var7_31 = this.x;
                    if (var7_31 == -1L) throw fg1.a((String)"Mandatory element SeekID or SeekPosition not found", null);
                    if (var1_1 != 475249515) return;
                    this.z = var7_31;
                    return;
                }
                if (var1_1 == 25152) {
                    this.a(var1_1);
                    var12_6 = this.u;
                    if (var12_6.h == false) return;
                    var13_16 = var12_6.j;
                    if (var13_16 == null) throw fg1.a((String)"Encrypted Track found but ContentEncKeyID was not found", null);
                    var12_6.l = new y30(new y30.b[]{new y30.b(cm.a, null, "video/webm", var13_16.b)});
                    return;
                }
                if (var1_1 == 28032) {
                    this.a(var1_1);
                    var12_5 = this.u;
                    if (var12_5.h == false) return;
                    if (var12_5.i != null) throw fg1.a((String)"Combining encryption and compression is not supported", null);
                    return;
                }
                if (var1_1 != 357149030) {
                    if (var1_1 == 374648427) {
                        if (this.c.size() == 0) throw fg1.a((String)"No valid tracks were found", null);
                        this.b0.a();
                        return;
                    }
                    if (var1_1 != 475249515) {
                        return;
                    }
                    if (!this.v) {
                        var12_4 /* !! */  = this.C;
                        var13_15 /* !! */  = this.D;
                        if (this.q != -1L && this.t != -9223372036854775807L && var12_4 /* !! */  != null && var12_4 /* !! */ .a() != 0 && var13_15 /* !! */  != null && var13_15 /* !! */ .a() == var12_4 /* !! */ .a()) {
                            var4_18 = var12_4 /* !! */ .a();
                            var19_21 = new int[var4_18];
                            var18_23 = new long[var4_18];
                            var17_25 = new long[var4_18];
                            var16_27 = new long[var4_18];
                            for (var1_1 = 0; var1_1 < var4_18; ++var1_1) {
                                var16_27[var1_1] = var12_4 /* !! */ .a(var1_1);
                                var7_29 = this.q;
                                var18_23[var1_1] = var13_15 /* !! */ .a(var1_1) + var7_29;
                            }
                            var1_1 = 0;
                            while (var1_1 < (var3_35 = var4_18 - 1)) {
                                var3_35 = var1_1 + 1;
                                var19_21[var1_1] = (int)(var18_23[var3_35] - var18_23[var1_1]);
                                var17_25[var1_1] = var16_27[var3_35] - var16_27[var1_1];
                                var1_1 = var3_35;
                            }
                            var19_21[var3_35] = (int)(this.q + this.p - var18_23[var3_35]);
                            var17_25[var3_35] = var7_29 = this.t - var16_27[var3_35];
                            var15_38 = var19_21;
                            var14_40 = var18_23;
                            var13_15 /* !! */  = (bt0)var17_25;
                            var12_4 /* !! */  = (bt0)var16_27;
                            if (var7_29 <= 0L) {
                                var12_4 /* !! */  = new StringBuilder("Discarding last cue point with unexpected duration: ");
                                var12_4 /* !! */ .append(var7_29);
                                zs0.d((String)"MatroskaExtractor", (String)var12_4 /* !! */ .toString());
                                var15_38 = Arrays.copyOf(var19_21, var3_35);
                                var14_40 = Arrays.copyOf(var18_23, var3_35);
                                var13_15 /* !! */  = (bt0)Arrays.copyOf(var17_25, var3_35);
                                var12_4 /* !! */  = (bt0)Arrays.copyOf(var16_27, var3_35);
                            }
                            var12_4 /* !! */  = new wn(var15_38, var14_40, (long[])var13_15 /* !! */ , (long[])var12_4 /* !! */ );
                        } else {
                            var12_4 /* !! */  = new ex1.b(this.t, 0L);
                        }
                        var20_3.a((ex1)var12_4 /* !! */ );
                        this.v = true;
                    }
                    this.C = null;
                    this.D = null;
                    return;
                }
                if (this.r == -9223372036854775807L) {
                    this.r = 1000000L;
                }
                if ((var7_30 = this.s) == -9223372036854775807L) return;
                this.t = this.a(var7_30);
                return;
            }
            var17_26 = this.u;
            if (var17_26 == null) throw new IllegalStateException();
            var12_7 = var17_26.b;
            if (var12_7 == null) throw fg1.a((String)"CodecId is missing in TrackEntry element", null);
            var1_1 = var12_7.hashCode();
            var3_36 = 4;
            switch (var1_1) lbl-1000:
            // 34 sources

            {
                default: {
                    var1_1 = -1;
                    break;
                }
                case 1951062397: {
                    if (!var12_7.equals("A_OPUS")) ** GOTO lbl-1000
                    var1_1 = 32;
                    break;
                }
                case 1950789798: {
                    if (!var12_7.equals("A_FLAC")) ** GOTO lbl-1000
                    var1_1 = 31;
                    break;
                }
                case 1950749482: {
                    if (!var12_7.equals("A_EAC3")) ** GOTO lbl-1000
                    var1_1 = 30;
                    break;
                }
                case 1809237540: {
                    if (!var12_7.equals("V_MPEG2")) ** GOTO lbl-1000
                    var1_1 = 29;
                    break;
                }
                case 1422270023: {
                    if (!var12_7.equals("S_TEXT/UTF8")) ** GOTO lbl-1000
                    var1_1 = 28;
                    break;
                }
                case 1045209816: {
                    if (!var12_7.equals("S_TEXT/WEBVTT")) ** GOTO lbl-1000
                    var1_1 = 27;
                    break;
                }
                case 855502857: {
                    if (!var12_7.equals("V_MPEGH/ISO/HEVC")) ** GOTO lbl-1000
                    var1_1 = 26;
                    break;
                }
                case 738597099: {
                    if (!var12_7.equals("S_TEXT/ASS")) ** GOTO lbl-1000
                    var1_1 = 25;
                    break;
                }
                case 725957860: {
                    if (!var12_7.equals("A_PCM/INT/LIT")) ** GOTO lbl-1000
                    var1_1 = 24;
                    break;
                }
                case 725948237: {
                    if (!var12_7.equals("A_PCM/INT/BIG")) ** GOTO lbl-1000
                    var1_1 = 23;
                    break;
                }
                case 635596514: {
                    if (!var12_7.equals("A_PCM/FLOAT/IEEE")) ** GOTO lbl-1000
                    var1_1 = 22;
                    break;
                }
                case 542569478: {
                    if (!var12_7.equals("A_DTS/EXPRESS")) ** GOTO lbl-1000
                    var1_1 = 21;
                    break;
                }
                case 444813526: {
                    if (!var12_7.equals("V_THEORA")) ** GOTO lbl-1000
                    var1_1 = 20;
                    break;
                }
                case 99146302: {
                    if (!var12_7.equals("S_HDMV/PGS")) ** GOTO lbl-1000
                    var1_1 = 19;
                    break;
                }
                case 82338134: {
                    if (!var12_7.equals("V_VP9")) ** GOTO lbl-1000
                    var1_1 = 18;
                    break;
                }
                case 82338133: {
                    if (!var12_7.equals("V_VP8")) ** GOTO lbl-1000
                    var1_1 = 17;
                    break;
                }
                case 82318131: {
                    if (!var12_7.equals("V_AV1")) ** GOTO lbl-1000
                    var1_1 = 16;
                    break;
                }
                case 62927045: {
                    if (!var12_7.equals("A_DTS")) ** GOTO lbl-1000
                    var1_1 = 15;
                    break;
                }
                case 62923603: {
                    if (!var12_7.equals("A_AC3")) ** GOTO lbl-1000
                    var1_1 = 14;
                    break;
                }
                case 62923557: {
                    if (!var12_7.equals("A_AAC")) ** GOTO lbl-1000
                    var1_1 = 13;
                    break;
                }
                case -356037306: {
                    if (!var12_7.equals("A_DTS/LOSSLESS")) ** GOTO lbl-1000
                    var1_1 = 12;
                    break;
                }
                case -425012669: {
                    if (!var12_7.equals("S_VOBSUB")) ** GOTO lbl-1000
                    var1_1 = 11;
                    break;
                }
                case -538363109: {
                    if (!var12_7.equals("V_MPEG4/ISO/AVC")) ** GOTO lbl-1000
                    var1_1 = 10;
                    break;
                }
                case -538363189: {
                    if (!var12_7.equals("V_MPEG4/ISO/ASP")) ** GOTO lbl-1000
                    var1_1 = 9;
                    break;
                }
                case -933872740: {
                    if (!var12_7.equals("S_DVBSUB")) ** GOTO lbl-1000
                    var1_1 = 8;
                    break;
                }
                case -1373388978: {
                    if (!var12_7.equals("V_MS/VFW/FOURCC")) ** GOTO lbl-1000
                    var1_1 = 7;
                    break;
                }
                case -1482641357: {
                    if (!var12_7.equals("A_MPEG/L3")) ** GOTO lbl-1000
                    var1_1 = 6;
                    break;
                }
                case -1482641358: {
                    if (!var12_7.equals("A_MPEG/L2")) ** GOTO lbl-1000
                    var1_1 = 5;
                    break;
                }
                case -1730367663: {
                    if (!var12_7.equals("A_VORBIS")) ** GOTO lbl-1000
                    var1_1 = 4;
                    break;
                }
                case -1784763192: {
                    if (!var12_7.equals("A_TRUEHD")) ** GOTO lbl-1000
                    var1_1 = 3;
                    break;
                }
                case -1985379776: {
                    if (!var12_7.equals("A_MS/ACM")) ** GOTO lbl-1000
                    var1_1 = 2;
                    break;
                }
                case -2095575984: {
                    if (!var12_7.equals("V_MPEG4/ISO/SP")) ** GOTO lbl-1000
                    var1_1 = 1;
                    break;
                }
                case -2095576542: {
                    if (!var12_7.equals("V_MPEG4/ISO/AP")) ** GOTO lbl-1000
                    var1_1 = 0;
                }
            }
            switch (var1_1) {
                default: {
                    ** break;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
            }
            var6_42 = var17_26.c;
            tmp = -1;
            switch (var12_7.hashCode()) {
                case 1951062397: {
                    if (var12_7.equals("A_OPUS")) {
                        tmp = 1;
                        ** break;
                    }
                }
lbl236:
                // 68 sources

                default: {
                    break;
                }
                case 1950789798: {
                    if (!var12_7.equals("A_FLAC")) ** GOTO lbl236
                    tmp = 2;
                    ** break;
                }
                case 1950749482: {
                    if (!var12_7.equals("A_EAC3")) ** GOTO lbl236
                    tmp = 3;
                    ** break;
                }
                case 1809237540: {
                    if (!var12_7.equals("V_MPEG2")) ** GOTO lbl236
                    tmp = 4;
                    ** break;
                }
                case 1422270023: {
                    if (!var12_7.equals("S_TEXT/UTF8")) ** GOTO lbl236
                    tmp = 5;
                    ** break;
                }
                case 1045209816: {
                    if (!var12_7.equals("S_TEXT/WEBVTT")) ** GOTO lbl236
                    tmp = 6;
                    ** break;
                }
                case 855502857: {
                    if (!var12_7.equals("V_MPEGH/ISO/HEVC")) ** GOTO lbl236
                    tmp = 7;
                    ** break;
                }
                case 738597099: {
                    if (!var12_7.equals("S_TEXT/ASS")) ** GOTO lbl236
                    tmp = 8;
                    ** break;
                }
                case 725957860: {
                    if (!var12_7.equals("A_PCM/INT/LIT")) ** GOTO lbl236
                    tmp = 9;
                    ** break;
                }
                case 725948237: {
                    if (!var12_7.equals("A_PCM/INT/BIG")) ** GOTO lbl236
                    tmp = 10;
                    ** break;
                }
                case 635596514: {
                    if (!var12_7.equals("A_PCM/FLOAT/IEEE")) ** GOTO lbl236
                    tmp = 11;
                    ** break;
                }
                case 542569478: {
                    if (!var12_7.equals("A_DTS/EXPRESS")) ** GOTO lbl236
                    tmp = 12;
                    ** break;
                }
                case 444813526: {
                    if (!var12_7.equals("V_THEORA")) ** GOTO lbl236
                    tmp = 13;
                    ** break;
                }
                case 99146302: {
                    if (!var12_7.equals("S_HDMV/PGS")) ** GOTO lbl236
                    tmp = 14;
                    ** break;
                }
                case 82338134: {
                    if (!var12_7.equals("V_VP9")) ** GOTO lbl236
                    tmp = 15;
                    ** break;
                }
                case 82338133: {
                    if (!var12_7.equals("V_VP8")) ** GOTO lbl236
                    tmp = 16;
                    ** break;
                }
                case 82318131: {
                    if (!var12_7.equals("V_AV1")) ** GOTO lbl236
                    tmp = 17;
                    ** break;
                }
                case 62927045: {
                    if (!var12_7.equals("A_DTS")) ** GOTO lbl236
                    tmp = 18;
                    ** break;
                }
                case 62923603: {
                    if (!var12_7.equals("A_AC3")) ** GOTO lbl236
                    tmp = 19;
                    ** break;
                }
                case 62923557: {
                    if (!var12_7.equals("A_AAC")) ** GOTO lbl236
                    tmp = 20;
                    ** break;
                }
                case -356037306: {
                    if (!var12_7.equals("A_DTS/LOSSLESS")) ** GOTO lbl236
                    tmp = 21;
                    ** break;
                }
                case -425012669: {
                    if (!var12_7.equals("S_VOBSUB")) ** GOTO lbl236
                    tmp = 22;
                    ** break;
                }
                case -538363109: {
                    if (!var12_7.equals("V_MPEG4/ISO/AVC")) ** GOTO lbl236
                    tmp = 23;
                    ** break;
                }
                case -538363189: {
                    if (!var12_7.equals("V_MPEG4/ISO/ASP")) ** GOTO lbl236
                    tmp = 24;
                    ** break;
                }
                case -933872740: {
                    if (!var12_7.equals("S_DVBSUB")) ** GOTO lbl236
                    tmp = 25;
                    ** break;
                }
                case -1373388978: {
                    if (!var12_7.equals("V_MS/VFW/FOURCC")) ** GOTO lbl236
                    tmp = 26;
                    ** break;
                }
                case -1482641357: {
                    if (!var12_7.equals("A_MPEG/L3")) ** GOTO lbl236
                    tmp = 27;
                    ** break;
                }
                case -1482641358: {
                    if (!var12_7.equals("A_MPEG/L2")) ** GOTO lbl236
                    tmp = 28;
                    ** break;
                }
                case -1730367663: {
                    if (!var12_7.equals("A_VORBIS")) ** GOTO lbl236
                    tmp = 29;
                    ** break;
                }
                case -1784763192: {
                    if (!var12_7.equals("A_TRUEHD")) ** GOTO lbl236
                    tmp = 30;
                    ** break;
                }
                case -1985379776: {
                    if (!var12_7.equals("A_MS/ACM")) ** GOTO lbl236
                    tmp = 31;
                    ** break;
                }
                case -2095575984: {
                    if (!var12_7.equals("V_MPEG4/ISO/SP")) ** GOTO lbl236
                    tmp = 32;
                    ** break;
                }
                case -2095576542: {
                    if (!var12_7.equals("V_MPEG4/ISO/AP")) ** GOTO lbl236
                    tmp = 33;
                    ** break;
                }
            }
            switch (tmp) {
                default: {
                    var1_1 = -1;
                    break;
                }
                case 1: {
                    var1_1 = 32;
                    break;
                }
                case 2: {
                    var1_1 = 31;
                    break;
                }
                case 3: {
                    var1_1 = 30;
                    break;
                }
                case 4: {
                    var1_1 = 29;
                    break;
                }
                case 5: {
                    var1_1 = 28;
                    break;
                }
                case 6: {
                    var1_1 = 27;
                    break;
                }
                case 7: {
                    var1_1 = 26;
                    break;
                }
                case 8: {
                    var1_1 = 25;
                    break;
                }
                case 9: {
                    var1_1 = 24;
                    break;
                }
                case 10: {
                    var1_1 = 23;
                    break;
                }
                case 11: {
                    var1_1 = 22;
                    break;
                }
                case 12: {
                    var1_1 = 21;
                    break;
                }
                case 13: {
                    var1_1 = 20;
                    break;
                }
                case 14: {
                    var1_1 = 19;
                    break;
                }
                case 15: {
                    var1_1 = 18;
                    break;
                }
                case 16: {
                    var1_1 = 17;
                    break;
                }
                case 17: {
                    var1_1 = 16;
                    break;
                }
                case 18: {
                    var1_1 = 15;
                    break;
                }
                case 19: {
                    var1_1 = 14;
                    break;
                }
                case 20: {
                    var1_1 = 13;
                    break;
                }
                case 21: {
                    var1_1 = 12;
                    break;
                }
                case 22: {
                    var1_1 = 11;
                    break;
                }
                case 23: {
                    var1_1 = 10;
                    break;
                }
                case 24: {
                    var1_1 = 9;
                    break;
                }
                case 25: {
                    var1_1 = 8;
                    break;
                }
                case 26: {
                    var1_1 = 7;
                    break;
                }
                case 27: {
                    var1_1 = 6;
                    break;
                }
                case 28: {
                    var1_1 = 5;
                    break;
                }
                case 29: {
                    var1_1 = 4;
                    break;
                }
                case 30: {
                    var1_1 = 3;
                    break;
                }
                case 31: {
                    var1_1 = 2;
                    break;
                }
                case 32: {
                    var1_1 = 1;
                    break;
                }
                case 33: {
                    var1_1 = 0;
                }
            }
            var14_41 = "audio/raw";
            switch (var1_1) {
                default: {
                    throw fg1.a((String)"Unrecognized codec identifier.", null);
                }
                case 32: {
                    var13_17 = new ArrayList<E>(3);
                    var13_17.add(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var17_26.b));
                    var12_7 = ByteBuffer.allocate(8);
                    var14_41 = ByteOrder.LITTLE_ENDIAN;
                    var13_17.add(var12_7.order((ByteOrder)var14_41).putLong(var17_26.R).array());
                    var13_17.add(ByteBuffer.allocate(8).order((ByteOrder)var14_41).putLong(var17_26.S).array());
                    var12_7 = "audio/opus";
                    var1_1 = 5760;
                    ** break;
                }
                case 31: {
                    var13_17 = Collections.singletonList(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7));
                    var12_7 = "audio/flac";
lbl488:
                    // 5 sources

                    while (true) {
                        var1_1 = -1;
                        ** break;
                        break;
                    }
                }
                case 30: {
                    var12_7 = "audio/eac3";
lbl493:
                    // 13 sources

                    while (true) {
                        var13_17 = null;
                        ** GOTO lbl488
                        break;
                    }
                }
                case 29: {
                    var12_7 = "video/mpeg2";
                    ** GOTO lbl493
                }
                case 28: {
                    var12_7 = "application/x-subrip";
                    ** GOTO lbl493
                }
                case 27: {
                    var12_7 = "text/vtt";
                    ** GOTO lbl493
                }
                case 26: {
                    var13_17 = nf0.a((bg1)new bg1(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7)));
                    var12_7 = var13_17.a;
                    var17_26.Y = var13_17.b;
                    var14_41 = var13_17.d;
                    var13_17 = "video/hevc";
                    ** GOTO lbl643
                }
                case 25: {
                    var13_17 = xj0.a(hu0.d0, com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7));
                    var12_7 = "text/x-ssa";
                    ** GOTO lbl488
                }
                case 24: {
                    var1_1 = var3_36 = m92.b((int)var17_26.P);
                    if (var3_36 != 0) ** GOTO lbl528
                    var12_7 = new StringBuilder("Unsupported little endian PCM bit depth: ");
                    var12_7.append(var17_26.P);
                    var12_7.append(". Setting mimeType to audio/x-unknown");
                    zs0.d((String)"MatroskaExtractor", (String)var12_7.toString());
lbl525:
                    // 3 sources

                    while (true) {
                        var12_7 = "audio/x-unknown";
                        ** GOTO lbl493
                        break;
                    }
lbl528:
                    // 3 sources

                    while (true) {
                        var13_17 = null;
                        var3_36 = -1;
                        var12_7 = null;
                        ** break;
                        break;
                    }
                }
                case 23: {
                    var1_1 = var17_26.P;
                    if (var1_1 == 8) {
                        var13_17 = null;
                        var3_36 = -1;
                        var12_7 = null;
                        var1_1 = 3;
                        ** break;
                    }
                    if (var1_1 != 16) ** GOTO lbl544
                    var1_1 = 0x10000000;
                    ** GOTO lbl528
lbl544:
                    // 1 sources

                    var12_7 = new StringBuilder("Unsupported big endian PCM bit depth: ");
                    var12_7.append(var17_26.P);
                    var12_7.append(". Setting mimeType to audio/x-unknown");
                    zs0.d((String)"MatroskaExtractor", (String)var12_7.toString());
                    ** GOTO lbl525
                }
                case 22: {
                    if (var17_26.P == 32) {
                        var1_1 = var3_36;
                        ** continue;
                    }
                    var12_7 = new StringBuilder("Unsupported floating point PCM bit depth: ");
                    var12_7.append(var17_26.P);
                    var12_7.append(". Setting mimeType to audio/x-unknown");
                    zs0.d((String)"MatroskaExtractor", (String)var12_7.toString());
                    ** continue;
                }
                case 20: {
                    var12_7 = "video/x-unknown";
                    ** GOTO lbl493
                }
                case 19: {
                    var12_7 = "application/pgs";
                    ** GOTO lbl493
                }
                case 18: {
                    var12_7 = "video/x-vnd.on2.vp9";
                    ** GOTO lbl493
                }
                case 17: {
                    var12_7 = "video/x-vnd.on2.vp8";
                    ** GOTO lbl493
                }
                case 16: {
                    var12_7 = "video/av01";
                    ** GOTO lbl493
                }
                case 15: 
                case 21: {
                    var12_7 = "audio/vnd.dts";
                    ** GOTO lbl493
                }
                case 14: {
                    var12_7 = "audio/ac3";
                    ** GOTO lbl493
                }
                case 13: {
                    var12_7 = Collections.singletonList(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7));
                    var13_17 = var17_26.k;
                    var13_17 = com.yandex.mobile.ads.impl.a.a((ag1)new ag1(((byte[])var13_17).length, (byte[])var13_17), (boolean)false);
                    var17_26.Q = var13_17.a;
                    var17_26.O = var13_17.b;
                    var14_41 = var13_17.c;
                    var13_17 = "audio/mp4a-latm";
                    ** GOTO lbl643
                }
                case 12: {
                    var12_7 = "audio/vnd.dts.hd";
                    ** continue;
                }
                case 11: {
                    var13_17 = xj0.a(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7));
                    var12_7 = "application/vobsub";
                    ** GOTO lbl488
                }
                case 10: {
                    var13_17 = wh.a((bg1)new bg1(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7)));
                    var12_7 = var13_17.a;
                    var17_26.Y = var13_17.b;
                    var14_41 = var13_17.f;
                    var13_17 = "video/avc";
                    ** GOTO lbl643
                }
                case 8: {
                    var13_17 = new byte[4];
                    System.arraycopy(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7), 0, var13_17, 0, 4);
                    var13_17 = xj0.a(var13_17);
                    var12_7 = "application/dvbsubs";
                    ** continue;
                }
                case 7: {
                    var12_7 = new bg1(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7));
                    var12_7.f(16);
                    var7_32 = var12_7.n();
                    if (var7_32 == 1482049860L) {
                    }
                    ** GOTO lbl625
                    {
                        catch (ArrayIndexOutOfBoundsException var12_8) {
                            throw fg1.a((String)"Error parsing FourCC private data", null);
                        }
                        ** try [egrp 1[TRYBLOCK] [1 : 3680->3726)] { 
lbl623:
                        // 1 sources

                        var12_7 = new Pair((Object)"video/divx", null);
                        ** GOTO lbl663
lbl625:
                        // 1 sources

                        if (var7_32 != 859189832L) ** GOTO lbl628
                        var12_7 = new Pair((Object)"video/3gpp", null);
                        ** GOTO lbl663
lbl628:
                        // 1 sources

                        if (var7_32 != 826496599L) ** GOTO lbl661
                        ** GOTO lbl-1000
                    }
lbl630:
                    // 1 sources

                    catch (ArrayIndexOutOfBoundsException var12_13) {
                        throw fg1.a((String)"Error parsing FourCC private data", null);
                    }
                }
lbl632:
                // 3 sources

                while (true) {
                    var15_39 = null;
                    var14_41 = var12_7;
                    var12_7 = var13_17;
lbl636:
                    // 2 sources

                    while (true) {
                        var3_36 = var1_1;
lbl638:
                        // 2 sources

                        while (true) {
                            var1_1 = -1;
                            var13_17 = var12_7;
                            var12_7 = var15_39;
                            ** break;
                            break;
                        }
                        break;
                    }
                    break;
                }
lbl643:
                // 4 sources

                while (true) {
                    var1_1 = -1;
                    var15_39 = var14_41;
                    var14_41 = var13_17;
                    ** continue;
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    var1_1 = var12_7.d() + 20;
                    var12_7 = var12_7.c();
                    ** while (var1_1 < ((Object)var12_7).length - 4)
                }
lbl-1000:
                // 1 sources

                {
                    if (var12_7[var1_1] != false || var12_7[var1_1 + 1] != false || var12_7[var1_1 + 2] != true || var12_7[var1_1 + 3] != 15) ** GOTO lbl654
                    {
                        var12_7 = new Pair((Object)"video/wvc1", Collections.singletonList(Arrays.copyOfRange((byte[])var12_7, var1_1, ((Object)var12_7).length)));
                        ** GOTO lbl663
                    }
lbl654:
                    // 1 sources

                    ++var1_1;
                    continue;
                }
lbl656:
                // 1 sources

                try {
                    var12_7 = fg1.a((String)"Failed to find FourCC VC1 initialization data", null);
                    throw var12_7;
                }
                catch (ArrayIndexOutOfBoundsException var12_9) {
                    throw fg1.a((String)"Error parsing FourCC private data", null);
                }
lbl661:
                // 1 sources

                zs0.d((String)"MatroskaExtractor", (String)"Unknown FourCC. Setting mimeType to video/x-unknown");
                var12_7 = new Pair((Object)"video/x-unknown", null);
lbl663:
                // 4 sources

                var14_41 = null;
                var13_17 = (String)var12_7.first;
                var12_7 = (List)var12_7.second;
                ** continue;
                case 6: {
                    var12_7 = "audio/mpeg";
lbl669:
                    // 2 sources

                    while (true) {
                        var1_1 = 4096;
                        var13_17 = null;
                        ** continue;
                        break;
                    }
                }
                case 5: {
                    var12_7 = "audio/mpeg-L2";
                    ** continue;
                }
                case 4: {
                    var13_17 = com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7);
                    if (var13_17[0] != 2) throw fg1.a((String)"Error parsing vorbis codec private", null);
                    var3_36 = 1;
                    var1_1 = 0;
                    while ((var4_19 = var13_17[var3_36] & 255) == 255) {
                        var1_1 += 255;
                        ++var3_36;
                    }
                    ++var3_36;
                    var4_19 = var1_1 + var4_19;
                    var1_1 = 0;
                    while ((var5_2 = var13_17[var3_36] & 255) == 255) {
                        var1_1 += 255;
                        ++var3_36;
                    }
                    if (var13_17[++var3_36] != true) throw fg1.a((String)"Error parsing vorbis codec private", null);
                    try {
                        var14_41 = new byte[var4_19];
                        System.arraycopy(var13_17, var3_36, var14_41, 0, var4_19);
                    }
                    catch (ArrayIndexOutOfBoundsException var12_10) {
                        throw fg1.a((String)"Error parsing vorbis codec private", null);
                    }
lbl697:
                    // 2 sources

                    while (true) {
                        var15_39 = null;
                        var12_7 = var13_17;
                        ** continue;
                        break;
                    }
                    if (var13_17[var3_36 += var4_19] != 3) throw fg1.a((String)"Error parsing vorbis codec private", null);
                    if (var13_17[var1_1 = var3_36 + (var1_1 + var5_2)] != 5) throw fg1.a((String)"Error parsing vorbis codec private", null);
                    {
                        var12_7 = new byte[((Object)var13_17).length - var1_1];
                        System.arraycopy(var13_17, var1_1, var12_7, 0, ((Object)var13_17).length - var1_1);
                        var13_17 = new ArrayList(2);
                        var13_17.add(var14_41);
                        var13_17.add(var12_7);
                        var14_41 = "audio/vorbis";
                        var3_36 = 8192;
                        ** GOTO lbl697
                    }
                }
                case 3: {
                    var17_26.T = new p72();
                    var12_7 = "audio/true-hd";
lbl718:
                    // 3 sources

                    while (true) {
                        var13_17 = null;
lbl720:
                        // 2 sources

                        while (true) {
                            var3_36 = -1;
                            var14_41 = var12_7;
                            ** continue;
                            break;
                        }
                        break;
                    }
                }
                case 2: {
                    var12_7 = new bg1(com.yandex.mobile.ads.impl.hu0$b.e(var17_26, (String)var12_7));
                    try {
                        var1_1 = var12_7.o();
                        if (var1_1 == 1) ** GOTO lbl738
                        if (var1_1 != 65534) ** GOTO lbl752
                        var12_7.e(24);
                        var7_33 = var12_7.p();
                        var13_17 = hu0.g0;
                        if (var7_33 == var13_17.getMostSignificantBits() && (var7_33 = var12_7.p()) == (var9_44 = var13_17.getLeastSignificantBits())) {
                        }
                        ** GOTO lbl752
                    }
                    catch (ArrayIndexOutOfBoundsException var12_11) {
                        throw fg1.a((String)"Error parsing MS/ACM codec private", null);
                    }
lbl738:
                    // 2 sources

                    if ((var1_1 = m92.b((int)var17_26.P)) != 0) ** GOTO lbl748
                    var12_7 = new StringBuilder("Unsupported PCM bit depth: ");
                    var12_7.append(var17_26.P);
                    var12_7.append(". Setting mimeType to audio/x-unknown");
                    zs0.d((String)"MatroskaExtractor", (String)var12_7.toString());
lbl745:
                    // 2 sources

                    while (true) {
                        var12_7 = "audio/x-unknown";
                        ** GOTO lbl718
                        break;
                    }
lbl748:
                    // 1 sources

                    var13_17 = null;
                    var3_36 = -1;
                    var12_7 = null;
                    ** break;
lbl752:
                    // 2 sources

                    zs0.d((String)"MatroskaExtractor", (String)"Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    ** continue;
                }
                case 0: 
                case 1: 
                case 9: 
            }
            var13_17 = var17_26.k;
            var12_7 = "video/mp4v-es";
            if (var13_17 != null) ** break;
            ** while (true)
            var13_17 = Collections.singletonList(var13_17);
            ** while (true)
lbl761:
            // 4 sources

            var18_24 = var17_26.N;
            var16_28 = var12_7;
            var15_39 = var14_41;
            if (var18_24 != null) {
                var18_24 = m30.a((bg1)new bg1((byte[])var18_24));
                var16_28 = var12_7;
                var15_39 = var14_41;
                if (var18_24 != null) {
                    var16_28 = var18_24.a;
                    var15_39 = "video/dolby-vision";
                }
            }
            var11_46 = var17_26.V;
            var4_19 = var17_26.U != false ? 2 : 0;
            var14_41 = new /* Unavailable Anonymous Inner Class!! */;
            if (w01.d((String)var15_39)) {
                var14_41.c(var17_26.O).l(var17_26.Q).i(var1_1);
                var1_1 = 1;
            } else if (w01.f((String)var15_39)) {
                if (var17_26.q == 0) {
                    var1_1 = var5_2 = var17_26.o;
                    if (var5_2 == -1) {
                        var1_1 = var17_26.m;
                    }
                    var17_26.o = var1_1;
                    var1_1 = var5_2 = var17_26.p;
                    if (var5_2 == -1) {
                        var1_1 = var17_26.n;
                    }
                    var17_26.p = var1_1;
                }
                var2_47 = (var5_2 = var17_26.o) != -1 && (var1_1 = var17_26.p) != -1 ? (float)(var17_26.n * var5_2) / (float)(var17_26.m * var1_1) : -1.0f;
                if (var17_26.x) {
                    if (var17_26.D != -1.0f && var17_26.E != -1.0f && var17_26.F != -1.0f && var17_26.G != -1.0f && var17_26.H != -1.0f && var17_26.I != -1.0f && var17_26.J != -1.0f && var17_26.K != -1.0f && var17_26.L != -1.0f && var17_26.M != -1.0f) {
                        var12_7 = new byte[25];
                        var18_24 = ByteBuffer.wrap((byte[])var12_7).order(ByteOrder.LITTLE_ENDIAN);
                        var18_24.put((byte)0);
                        var18_24.putShort((short)(var17_26.D * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.E * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.F * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.G * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.H * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.I * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.J * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.K * 50000.0f + 0.5f));
                        var18_24.putShort((short)(var17_26.L + 0.5f));
                        var18_24.putShort((short)(var17_26.M + 0.5f));
                        var18_24.putShort((short)var17_26.B);
                        var18_24.putShort((short)var17_26.C);
                    } else {
                        var12_7 = null;
                    }
                    var12_7 = new fq(var17_26.y, var17_26.A, var17_26.z, (byte[])var12_7);
                } else {
                    var12_7 = null;
                }
                var19_22 = var17_26.a;
                var1_1 = var19_22 != null && (var18_24 = (Object)hu0.h0).containsKey(var19_22) != false ? (Integer)var18_24.get(var17_26.a) : -1;
                if (var17_26.r == 0 && Float.compare(var17_26.s, 0.0f) == 0 && Float.compare(var17_26.t, 0.0f) == 0) {
                    if (Float.compare(var17_26.u, 0.0f) == 0) {
                        var1_1 = 0;
                    } else if (Float.compare(var17_26.t, 90.0f) == 0) {
                        var1_1 = 90;
                    } else if (Float.compare(var17_26.t, -180.0f) != 0 && Float.compare(var17_26.t, 180.0f) != 0) {
                        if (Float.compare(var17_26.t, -90.0f) == 0) {
                            var1_1 = 270;
                        }
                    } else {
                        var1_1 = 180;
                    }
                }
                var14_41.o(var17_26.m).f(var17_26.n).b(var2_47).k(var1_1).a(var17_26.v).n(var17_26.w).a((fq)var12_7);
                var1_1 = 2;
            } else {
                if (!("application/x-subrip".equals(var15_39) || "text/x-ssa".equals(var15_39) || "text/vtt".equals(var15_39) || "application/vobsub".equals(var15_39) || "application/pgs".equals(var15_39))) {
                    if ("application/dvbsubs".equals(var15_39) == false) throw fg1.a((String)"Unexpected MIME type.", null);
                }
                var1_1 = 3;
            }
            var12_7 = var17_26.a;
            if (var12_7 != null && !hu0.h0.containsKey(var12_7)) {
                var14_41.c(var17_26.a);
            }
            var12_7 = var14_41.g(var6_42).e((String)var15_39).h(var3_36).d(com.yandex.mobile.ads.impl.hu0$b.a(var17_26)).m(var11_46 | var4_19).a((List)var13_17).a((String)var16_28).a(var17_26.l).a();
            var13_17 = var20_3.a(var17_26.c, var1_1);
            var17_26.X = var13_17;
            var13_17.a((cc0)var12_7);
            this.c.put(var17_26.c, (Object)var17_26);
            ** break;
lbl856:
            // 2 sources

            this.u = null;
            return;
        }
        if (this.G != 2) {
            return;
        }
        var12_12 = this.c.get(this.M);
        var12_12.X.getClass();
        if (this.R > 0L && "A_OPUS".equals(var12_12.b)) {
            this.n.a(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
        }
        var1_1 = 0;
        for (var3_37 = 0; var3_37 < this.K; var1_1 += this.L[var3_37], ++var3_37) {
        }
        var4_20 = 0;
        var3_37 = var5_2;
        while (true) {
            if (var4_20 >= this.K) {
                this.G = 0;
                return;
            }
            var7_34 = this.H;
            var9_45 = var12_12.e * var4_20 / 1000;
            var5_2 = var6_43 = this.O;
            if (var4_20 == 0) {
                var5_2 = var6_43;
                if (!this.Q) {
                    var5_2 = var6_43 | var3_37;
                }
            }
            var6_43 = this.L[var4_20];
            this.a(var12_12, var7_34 + var9_45, var5_2, var6_43, var1_1 -= var6_43);
            var4_20 += var3_37;
        }
    }

    public final void release() {
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    private final class a
    implements s40 {
        final hu0 a;

        private a(hu0 hu02) {
            this.a = hu02;
        }

        /* synthetic */ a(hu0 hu02, av2 av22) {
            this(hu02);
        }

        public final void a(int n10, double d10) throws fg1 {
            hu0 hu02 = this.a;
            if (n10 != 181) {
                if (n10 != 17545) {
                    block0 : switch (n10) {
                        default: {
                            switch (n10) {
                                default: {
                                    hu02.getClass();
                                    break block0;
                                }
                                case 30325: {
                                    hu02.a(n10);
                                    ((hu0)hu02).u.u = (float)d10;
                                    break block0;
                                }
                                case 30324: {
                                    hu02.a(n10);
                                    ((hu0)hu02).u.t = (float)d10;
                                    break block0;
                                }
                                case 30323: 
                            }
                            hu02.a(n10);
                            ((hu0)hu02).u.s = (float)d10;
                            break;
                        }
                        case 21978: {
                            hu02.a(n10);
                            ((hu0)hu02).u.M = (float)d10;
                            break;
                        }
                        case 21977: {
                            hu02.a(n10);
                            ((hu0)hu02).u.L = (float)d10;
                            break;
                        }
                        case 21976: {
                            hu02.a(n10);
                            ((hu0)hu02).u.K = (float)d10;
                            break;
                        }
                        case 21975: {
                            hu02.a(n10);
                            ((hu0)hu02).u.J = (float)d10;
                            break;
                        }
                        case 21974: {
                            hu02.a(n10);
                            ((hu0)hu02).u.I = (float)d10;
                            break;
                        }
                        case 21973: {
                            hu02.a(n10);
                            ((hu0)hu02).u.H = (float)d10;
                            break;
                        }
                        case 21972: {
                            hu02.a(n10);
                            ((hu0)hu02).u.G = (float)d10;
                            break;
                        }
                        case 21971: {
                            hu02.a(n10);
                            ((hu0)hu02).u.F = (float)d10;
                            break;
                        }
                        case 21970: {
                            hu02.a(n10);
                            ((hu0)hu02).u.E = (float)d10;
                            break;
                        }
                        case 21969: {
                            hu02.a(n10);
                            ((hu0)hu02).u.D = (float)d10;
                            break;
                        }
                    }
                } else {
                    hu02.s = (long)d10;
                }
            } else {
                hu02.a(n10);
                ((hu0)hu02).u.Q = (int)d10;
            }
        }

        /*
         * Unable to fully structure code
         */
        public final void a(int var1_1, int var2_2, oz var3_3) throws IOException {
            block42: {
                block44: {
                    block43: {
                        block36: {
                            block37: {
                                block38: {
                                    block39: {
                                        block40: {
                                            block41: {
                                                var16_4 = this.a;
                                                var16_4.getClass();
                                                var4_5 = 4;
                                                if (var1_1 == 161 || var1_1 == 163) break block36;
                                                if (var1_1 == 165) break block37;
                                                if (var1_1 == 16877) break block38;
                                                if (var1_1 == 16981) break block39;
                                                if (var1_1 == 18402) break block40;
                                                if (var1_1 == 21419) break block41;
                                                if (var1_1 == 25506) ** GOTO lbl24
                                                if (var1_1 == 30322) {
                                                    hu0.d0((hu0)var16_4, var1_1);
                                                    var16_4 = hu0.z((hu0)var16_4);
                                                    var15_6 = new byte[var2_2];
                                                    var16_4.v = var15_6;
                                                    var3_3.a(var15_6, 0, var2_2, false);
                                                } else {
                                                    var3_3 = new StringBuilder("Unexpected id: ");
                                                    var3_3.append(var1_1);
                                                    throw fg1.a((String)var3_3.toString(), null);
lbl24:
                                                    // 1 sources

                                                    hu0.d0((hu0)var16_4, var1_1);
                                                    var16_4 = hu0.z((hu0)var16_4);
                                                    var15_7 = new byte[var2_2];
                                                    var16_4.k = var15_7;
                                                    var3_3.a(var15_7, 0, var2_2, false);
                                                }
                                                break block42;
                                            }
                                            Arrays.fill(hu0.v((hu0)var16_4).c(), (byte)0);
                                            var3_3.a(hu0.v((hu0)var16_4).c(), 4 - var2_2, var2_2, false);
                                            hu0.v((hu0)var16_4).e(0);
                                            hu0.Y((hu0)var16_4, (int)hu0.v((hu0)var16_4).v());
                                            break block42;
                                        }
                                        var15_8 = new byte[var2_2];
                                        var3_3.a(var15_8, 0, var2_2, false);
                                        hu0.d0((hu0)var16_4, var1_1);
                                        hu0.z((hu0)var16_4).j = new g62.a(1, 0, 0, var15_8);
                                        break block42;
                                    }
                                    hu0.d0((hu0)var16_4, var1_1);
                                    var15_9 = hu0.z((hu0)var16_4);
                                    var16_4 = new byte[var2_2];
                                    var15_9.i = (byte[])var16_4;
                                    var3_3.a((byte[])var16_4, 0, var2_2, false);
                                    break block42;
                                }
                                hu0.d0((hu0)var16_4, var1_1);
                                var15_10 = hu0.z((hu0)var16_4);
                                var1_1 = com.yandex.mobile.ads.impl.hu0$b.b(var15_10);
                                if (var1_1 != 1685485123 && var1_1 != 1685480259) {
                                    var3_3.a(var2_2);
                                } else {
                                    var16_4 = new byte[var2_2];
                                    var15_10.N = (byte[])var16_4;
                                    var3_3.a((byte[])var16_4, 0, var2_2, false);
                                }
                                break block42;
                            }
                            if (hu0.h((hu0)var16_4) != 2) break block42;
                            var15_11 = hu0.s((hu0)var16_4).get(hu0.m((hu0)var16_4));
                            if (hu0.p((hu0)var16_4) == 4 && "V_VP9".equals(var15_11.b)) {
                                hu0.w((hu0)var16_4).c(var2_2);
                                var3_3.a(hu0.w((hu0)var16_4).c(), 0, var2_2, false);
                            } else {
                                var3_3.a(var2_2);
                            }
                            break block42;
                        }
                        if (hu0.h((hu0)var16_4) == 0) {
                            hu0.M((hu0)var16_4, (int)hu0.q((hu0)var16_4).a((oz)var3_3, false, true, 8));
                            hu0.N((hu0)var16_4, hu0.q((hu0)var16_4).a());
                            hu0.I((hu0)var16_4, -9223372036854775807L);
                            hu0.G((hu0)var16_4, 1);
                            hu0.u((hu0)var16_4).c(0);
                        }
                        if ((var17_13 = hu0.s((hu0)var16_4).get(hu0.m((hu0)var16_4))) != null) break block43;
                        var3_3.a(var2_2 - hu0.n((hu0)var16_4));
                        hu0.G((hu0)var16_4, 0);
                        break block42;
                    }
                    var17_13.X.getClass();
                    if (hu0.h((hu0)var16_4) != 1) break block44;
                    hu0.f0((hu0)var16_4, (oz)var3_3, 3);
                    var5_14 = (hu0.u((hu0)var16_4).c()[2] & 6) >> 1;
                    if (var5_14 == 0) {
                        hu0.K((hu0)var16_4, 1);
                        var15_12 = hu0.l((hu0)var16_4);
                        if (var15_12 == null) {
                            var15_12 = new int[1];
                        } else if (var15_12.length < 1) {
                            var15_12 = new int[Math.max(var15_12.length * 2, 1)];
                        }
                        hu0.L((hu0)var16_4, var15_12);
                        var15_12[0] = var2_2 - hu0.n((hu0)var16_4) - 3;
                    } else {
                        hu0.f0((hu0)var16_4, (oz)var3_3, 4);
                        var6_15 = (hu0.u((hu0)var16_4).c()[3] & 255) + 1;
                        hu0.K((hu0)var16_4, var6_15);
                        var15_12 = hu0.l((hu0)var16_4);
                        if (var15_12 == null) {
                            var15_12 = new int[var6_15];
                        } else if (var15_12.length < var6_15) {
                            var15_12 = new int[Math.max(var15_12.length * 2, var6_15)];
                        }
                        hu0.L((hu0)var16_4, var15_12);
                        if (var5_14 == 2) {
                            var5_14 = hu0.n((hu0)var16_4);
                            var4_5 = hu0.k((hu0)var16_4);
                            Arrays.fill(var15_12, 0, var4_5, (var2_2 - var5_14 - 4) / var4_5);
                        } else if (var5_14 == 1) {
                            var6_15 = 0;
                            block0: for (var5_14 = 0; var5_14 < (var7_16 = hu0.k((hu0)var16_4) - 1); ++var5_14) {
                                hu0.l((hu0)var16_4)[var5_14] = 0;
                                var7_16 = var4_5;
                                while (true) {
                                    var4_5 = var7_16 + 1;
                                    hu0.f0((hu0)var16_4, (oz)var3_3, var4_5);
                                    var7_16 = hu0.u((hu0)var16_4).c()[var7_16] & 255;
                                    var15_12 = hu0.l((hu0)var16_4);
                                    var15_12[var5_14] = var8_17 = var15_12[var5_14] + var7_16;
                                    if (var7_16 != 255) {
                                        var6_15 += var8_17;
                                        continue block0;
                                    }
                                    var7_16 = var4_5;
                                }
                            }
                            hu0.l((hu0)var16_4)[var7_16] = var2_2 - hu0.n((hu0)var16_4) - var4_5 - var6_15;
                        } else {
                            if (var5_14 != 3) {
                                var3_3 = new StringBuilder("Unexpected lacing value: ");
                                var3_3.append(var5_14);
                                throw fg1.a((String)var3_3.toString(), null);
                            }
                            var6_15 = 0;
                            for (var5_14 = 0; var5_14 < (var7_16 = hu0.k((hu0)var16_4) - 1); ++var5_14) {
                                hu0.l((hu0)var16_4)[var5_14] = 0;
                                var7_16 = var4_5 + 1;
                                hu0.f0((hu0)var16_4, (oz)var3_3, var7_16);
                                if (hu0.u((hu0)var16_4).c()[var4_5] != 0) {
                                    block35: {
                                        for (var8_17 = 0; var8_17 < 8; ++var8_17) {
                                            var10_19 = 1 << 7 - var8_17;
                                            if ((hu0.u((hu0)var16_4).c()[var4_5] & var10_19) == 0) continue;
                                            var9_18 = var7_16 + var8_17;
                                            hu0.f0((hu0)var16_4, (oz)var3_3, var9_18);
                                            var13_21 = hu0.u((hu0)var16_4).c()[var4_5] & 255 & ~var10_19;
                                            while (var7_16 < var9_18) {
                                                var13_21 = var13_21 << 8 | (long)(hu0.u((hu0)var16_4).c()[var7_16] & 255);
                                                ++var7_16;
                                            }
                                            var11_20 = var13_21;
                                            if (var5_14 > 0) {
                                                var11_20 = var13_21 - ((1L << var8_17 * 7 + 6) - 1L);
                                            }
                                            var4_5 = var9_18;
                                            break block35;
                                        }
                                        var11_20 = 0L;
                                        var4_5 = var7_16;
                                    }
                                    if (var11_20 >= -2147483648L && var11_20 <= 0x7FFFFFFFL) {
                                        var7_16 = (int)var11_20;
                                        var15_12 = hu0.l((hu0)var16_4);
                                        if (var5_14 != 0) {
                                            var7_16 += var15_12[var5_14 - 1];
                                        }
                                        var15_12[var5_14] = var7_16;
                                        var6_15 += var7_16;
                                        continue;
                                    }
                                    throw fg1.a((String)"EBML lacing sample size out of range.", null);
                                }
                                throw fg1.a((String)"No valid varint length mask found", null);
                            }
                            hu0.l((hu0)var16_4)[var7_16] = var2_2 - hu0.n((hu0)var16_4) - var4_5 - var6_15;
                        }
                    }
                    var2_2 = hu0.u((hu0)var16_4).c()[0];
                    var4_5 = hu0.u((hu0)var16_4).c()[1];
                    hu0.H((hu0)var16_4, hu0.d((hu0)var16_4) + hu0.c0((hu0)var16_4, var2_2 << 8 | var4_5 & 255));
                    var2_2 = var17_13.d != 2 && (var1_1 != 163 || (hu0.u((hu0)var16_4).c()[2] & 128) != 128) ? 0 : 1;
                    hu0.O((hu0)var16_4, var2_2);
                    hu0.G((hu0)var16_4, 2);
                    hu0.J((hu0)var16_4, 0);
                }
                if (var1_1 == 163) {
                    while ((var1_1 = hu0.j((hu0)var16_4)) < hu0.k((hu0)var16_4)) {
                        var1_1 = hu0.b0((hu0)var16_4, (oz)var3_3, var17_13, hu0.l((hu0)var16_4)[var1_1], false);
                        hu0.e0((hu0)var16_4, var17_13, hu0.i((hu0)var16_4) + (long)(hu0.j((hu0)var16_4) * var17_13.e / 1000), hu0.o((hu0)var16_4), var1_1, 0);
                        hu0.J((hu0)var16_4, hu0.j((hu0)var16_4) + 1);
                    }
                    hu0.G((hu0)var16_4, 0);
                } else {
                    while ((var1_1 = hu0.j((hu0)var16_4)) < hu0.k((hu0)var16_4)) {
                        var15_12 = hu0.l((hu0)var16_4);
                        var15_12[var1_1] = hu0.b0((hu0)var16_4, (oz)var3_3, var17_13, var15_12[var1_1], true);
                        hu0.J((hu0)var16_4, hu0.j((hu0)var16_4) + 1);
                    }
                }
            }
        }

        public final void a(int n10, long l10) throws fg1 {
            vl.a<fq> a13;
            block80: {
                block79: {
                    block77: {
                        block78: {
                            a13 = this.a;
                            a13.getClass();
                            if (n10 == 20529) break block77;
                            if (n10 == 20530) break block78;
                            boolean bl2 = false;
                            boolean bl3 = false;
                            int n13 = 3;
                            int n14 = 2;
                            switch (n10) {
                                default: {
                                    switch (n10) {
                                        default: {
                                            break;
                                        }
                                        case 21949: {
                                            ((hu0)a13).a(n10);
                                            ((hu0)a13).u.C = (int)l10;
                                            break;
                                        }
                                        case 21948: {
                                            ((hu0)a13).a(n10);
                                            ((hu0)a13).u.B = (int)l10;
                                            break;
                                        }
                                        case 21947: {
                                            ((hu0)a13).a(n10);
                                            b b10 = ((hu0)a13).u;
                                            b10.x = true;
                                            n13 = (int)l10;
                                            a13 = fq.g;
                                            if (n13 != 1) {
                                                if (n13 != 9) {
                                                    n10 = n14;
                                                    if (n13 != 4) {
                                                        n10 = n14;
                                                        if (n13 != 5) {
                                                            n10 = n14;
                                                            if (n13 != 6) {
                                                                n10 = n14;
                                                                if (n13 != 7) {
                                                                    n10 = -1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    n10 = 6;
                                                }
                                            } else {
                                                n10 = 1;
                                            }
                                            if (n10 != -1) {
                                                b10.y = n10;
                                                break;
                                            }
                                            break block79;
                                        }
                                        case 21946: {
                                            ((hu0)a13).a(n10);
                                            n14 = (int)l10;
                                            vl.a<fq> a14 = fq.g;
                                            n10 = n13;
                                            if (n14 != 1) {
                                                if (n14 != 16) {
                                                    if (n14 != 18) {
                                                        n10 = n13;
                                                        if (n14 != 6) {
                                                            n10 = n13;
                                                            if (n14 != 7) {
                                                                n10 = -1;
                                                            }
                                                        }
                                                    } else {
                                                        n10 = 7;
                                                    }
                                                } else {
                                                    n10 = 6;
                                                }
                                            }
                                            if (n10 != -1) {
                                                ((hu0)a13).u.z = n10;
                                                break;
                                            }
                                            break block79;
                                        }
                                        case 21945: {
                                            ((hu0)a13).a(n10);
                                            n10 = (int)l10;
                                            if (n10 != 1) {
                                                if (n10 != 2) break;
                                                ((hu0)a13).u.A = 1;
                                                break;
                                            }
                                            ((hu0)a13).u.A = 2;
                                            break;
                                        }
                                    }
                                    break block79;
                                }
                                case 2807729: {
                                    ((hu0)a13).r = l10;
                                    break;
                                }
                                case 2352003: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.e = (int)l10;
                                    break;
                                }
                                case 30321: {
                                    ((hu0)a13).a(n10);
                                    n10 = (int)l10;
                                    if (n10 != 0) {
                                        if (n10 != 1) {
                                            if (n10 != 2) {
                                                if (n10 != 3) break;
                                                ((hu0)a13).u.r = 3;
                                                break;
                                            }
                                            ((hu0)a13).u.r = 2;
                                            break;
                                        }
                                        ((hu0)a13).u.r = 1;
                                        break;
                                    }
                                    ((hu0)a13).u.r = 0;
                                    break;
                                }
                                case 30114: {
                                    ((hu0)a13).R = l10;
                                    break;
                                }
                                case 25188: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.P = (int)l10;
                                    break;
                                }
                                case 22203: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.S = l10;
                                    break;
                                }
                                case 22186: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.R = l10;
                                    break;
                                }
                                case 21998: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.f = (int)l10;
                                    break;
                                }
                                case 21930: {
                                    ((hu0)a13).a(n10);
                                    a13 = ((hu0)a13).u;
                                    if (l10 == 1L) {
                                        bl3 = true;
                                    }
                                    a13.U = bl3;
                                    break;
                                }
                                case 21690: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.p = (int)l10;
                                    break;
                                }
                                case 21682: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.q = (int)l10;
                                    break;
                                }
                                case 21680: {
                                    ((hu0)a13).a(n10);
                                    ((hu0)a13).u.o = (int)l10;
                                    break;
                                }
                                case 21432: {
                                    n14 = (int)l10;
                                    ((hu0)a13).a(n10);
                                    if (n14 != 0) {
                                        if (n14 != 1) {
                                            if (n14 != 3) {
                                                if (n14 != 15) break;
                                                ((hu0)a13).u.w = 3;
                                                break;
                                            }
                                            ((hu0)a13).u.w = 1;
                                            break;
                                        }
                                        ((hu0)a13).u.w = 2;
                                        break;
                                    }
                                    ((hu0)a13).u.w = 0;
                                    break;
                                }
                                case 21420: {
                                    ((hu0)a13).x = l10 + ((hu0)a13).q;
                                    break;
                                }
                                case 18408: {
                                    if (l10 == 1L) break;
                                    a13 = new StringBuilder("AESSettingsCipherMode ");
                                    a13.append(l10);
                                    a13.append(" not supported");
                                    throw fg1.a((String)a13.toString(), null);
                                }
                                case 18401: {
                                    if (l10 == 5L) break;
                                    a13 = new StringBuilder("ContentEncAlgo ");
                                    a13.append(l10);
                                    a13.append(" not supported");
                                    throw fg1.a((String)a13.toString(), null);
                                }
                                case 17143: {
                                    if (l10 == 1L) break;
                                    a13 = new StringBuilder("EBMLReadVersion ");
                                    a13.append(l10);
                                    a13.append(" not supported");
                                    throw fg1.a((String)a13.toString(), null);
                                }
                                case 17029: {
                                    if (l10 >= 1L && l10 <= 2L) break;
                                    a13 = new StringBuilder("DocTypeReadVersion ");
                                    a13.append(l10);
                                    a13.append(" not supported");
                                    throw fg1.a((String)a13.toString(), null);
                                }
                                case 16980: {
                                    if (l10 == 3L) break;
                                    a13 = new StringBuilder("ContentCompAlgo ");
                                    a13.append(l10);
                                    a13.append(" not supported");
                                    throw fg1.a((String)a13.toString(), null);
                                }
                                case 16871: {
                                    ((hu0)a13).a(n10);
                                    com.yandex.mobile.ads.impl.hu0$b.d(((hu0)a13).u, (int)((int)l10));
                                    break;
                                }
                                case 251: {
                                    hu0.Q((hu0)a13, true);
                                    break;
                                }
                                case 241: {
                                    if (!hu0.g((hu0)a13)) {
                                        bt0 bt02;
                                        if (hu0.e((hu0)a13) != null && (bt02 = hu0.f((hu0)a13)) != null) {
                                            bt02.a(l10);
                                            hu0.F(a13, true);
                                            break;
                                        }
                                        a13 = new StringBuilder("Element ");
                                        a13.append(n10);
                                        a13.append(" must be in a Cues");
                                        throw fg1.a((String)a13.toString(), null);
                                    }
                                    break block79;
                                }
                                case 238: {
                                    hu0.P((hu0)a13, (int)l10);
                                    break;
                                }
                                case 231: {
                                    hu0.C((hu0)a13, hu0.c0((hu0)a13, l10));
                                    break;
                                }
                                case 215: {
                                    hu0.d0((hu0)a13, n10);
                                    hu0.z((hu0)a13).c = (int)l10;
                                    break;
                                }
                                case 186: {
                                    hu0.d0((hu0)a13, n10);
                                    hu0.z((hu0)a13).n = (int)l10;
                                    break;
                                }
                                case 179: {
                                    bt0 bt03 = hu0.e((hu0)a13);
                                    if (bt03 != null && hu0.f((hu0)a13) != null) {
                                        bt03.a(hu0.c0((hu0)a13, l10));
                                        break;
                                    }
                                    a13 = new StringBuilder("Element ");
                                    a13.append(n10);
                                    a13.append(" must be in a Cues");
                                    throw fg1.a((String)a13.toString(), null);
                                }
                                case 176: {
                                    hu0.d0((hu0)a13, n10);
                                    hu0.z((hu0)a13).m = (int)l10;
                                    break;
                                }
                                case 159: {
                                    hu0.d0((hu0)a13, n10);
                                    hu0.z((hu0)a13).O = (int)l10;
                                    break;
                                }
                                case 155: {
                                    hu0.I((hu0)a13, hu0.c0((hu0)a13, l10));
                                    break;
                                }
                                case 136: {
                                    hu0.d0((hu0)a13, n10);
                                    a13 = hu0.z((hu0)a13);
                                    bl3 = bl2;
                                    if (l10 == 1L) {
                                        bl3 = true;
                                    }
                                    a13.V = bl3;
                                    break;
                                }
                                case 131: {
                                    hu0.d0((hu0)a13, n10);
                                    hu0.z((hu0)a13).d = (int)l10;
                                    break;
                                }
                            }
                            break block79;
                        }
                        if (l10 != 1L) {
                            a13 = new StringBuilder("ContentEncodingScope ");
                            a13.append(l10);
                            a13.append(" not supported");
                            throw fg1.a((String)a13.toString(), null);
                        }
                        break block79;
                    }
                    if (l10 != 0L) break block80;
                }
                return;
            }
            a13 = new StringBuilder("ContentEncodingOrder ");
            a13.append(l10);
            a13.append(" not supported");
            throw fg1.a((String)a13.toString(), null);
        }

        public final void a(int n10, long l10, long l11) throws fg1 {
            hu0 hu02 = this.a;
            v70 v702 = hu0.r(hu02);
            if (v702 != null) {
                if (n10 != 160) {
                    if (n10 != 174) {
                        if (n10 != 187) {
                            if (n10 != 19899) {
                                if (n10 != 20533) {
                                    if (n10 != 21968) {
                                        if (n10 != 408125543) {
                                            if (n10 != 475249515) {
                                                if (n10 == 524531317 && !hu0.A(hu02)) {
                                                    if (hu0.t(hu02) && hu0.B(hu02) != -1L) {
                                                        hu0.a0(hu02, true);
                                                    } else {
                                                        v702.a((ex1)new ex1.b(hu0.y(hu02), 0L));
                                                        hu0.X(hu02, true);
                                                    }
                                                }
                                            } else {
                                                hu0.D(hu02, new bt0(0));
                                                hu0.E(hu02, new bt0(0));
                                            }
                                        } else {
                                            long l13 = hu0.x(hu02);
                                            if (l13 != -1L && l13 != l10) {
                                                throw fg1.a((String)"Multiple Segment elements not supported", null);
                                            }
                                            hu0.T(hu02, l10);
                                            hu0.S(hu02, l11);
                                        }
                                    } else {
                                        hu0.d0(hu02, n10);
                                        hu0.z((hu0)hu02).x = true;
                                    }
                                } else {
                                    hu0.d0(hu02, n10);
                                    hu0.z((hu0)hu02).h = true;
                                }
                            } else {
                                hu0.Y(hu02, -1);
                                hu0.Z(hu02, -1L);
                            }
                        } else {
                            hu0.F(hu02, false);
                        }
                    } else {
                        hu0.W(hu02, new /* Unavailable Anonymous Inner Class!! */);
                    }
                } else {
                    hu0.Q(hu02, false);
                    hu0.R(hu02, 0L);
                }
                return;
            }
            throw new IllegalStateException();
        }

        public final void a(int n10, String string2) throws fg1 {
            Object object = this.a;
            object.getClass();
            if (n10 != 134) {
                if (n10 != 17026) {
                    if (n10 != 21358) {
                        if (n10 == 2274716) {
                            hu0.d0((hu0)object, n10);
                            com.yandex.mobile.ads.impl.hu0$b.c(hu0.z((hu0)object), (String)string2);
                        }
                    } else {
                        hu0.d0((hu0)object, n10);
                        hu0.z((hu0)object).a = string2;
                    }
                } else if (!"webm".equals(string2) && !"matroska".equals(string2)) {
                    object = new StringBuilder("DocType ");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(" not supported");
                    throw fg1.a((String)((StringBuilder)object).toString(), null);
                }
            } else {
                hu0.d0((hu0)object, n10);
                hu0.z((hu0)object).b = string2;
            }
        }
    }
}

