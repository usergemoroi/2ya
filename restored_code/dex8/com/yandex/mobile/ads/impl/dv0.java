/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.util.Base64
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bv0
 *  com.yandex.mobile.ads.impl.cp1$a
 *  com.yandex.mobile.ads.impl.cv0
 *  com.yandex.mobile.ads.impl.cv0$a
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.dw0
 *  com.yandex.mobile.ads.impl.ev0
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.fs2
 *  com.yandex.mobile.ads.impl.gs2
 *  com.yandex.mobile.ads.impl.gv0
 *  com.yandex.mobile.ads.impl.kh
 *  com.yandex.mobile.ads.impl.kh$a
 *  com.yandex.mobile.ads.impl.kv0
 *  com.yandex.mobile.ads.impl.lh
 *  com.yandex.mobile.ads.impl.lh$a
 *  com.yandex.mobile.ads.impl.lh$b
 *  com.yandex.mobile.ads.impl.lh$c
 *  com.yandex.mobile.ads.impl.lh$e
 *  com.yandex.mobile.ads.impl.ly
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv0
 *  com.yandex.mobile.ads.impl.mv0$b
 *  com.yandex.mobile.ads.impl.rm1
 *  com.yandex.mobile.ads.impl.sh
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.eh;
import com.yandex.mobile.ads.impl.ev0;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.fs2;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.gs2;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.iv0;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.kh;
import com.yandex.mobile.ads.impl.kv0;
import com.yandex.mobile.ads.impl.lh;
import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv0;
import com.yandex.mobile.ads.impl.rm1;
import com.yandex.mobile.ads.impl.sh;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xz;
import com.yandex.mobile.ads.impl.zs0;
import com.yandex.mobile.ads.impl.zy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.d;

public final class dv0
extends iv0
implements bv0 {
    private static final ev0 S0 = rm1.d();
    private final Context H0;
    private final kh.a I0;
    private final lh J0;
    private int K0;
    private boolean L0;
    @Nullable
    private cc0 M0;
    private long N0;
    private boolean O0;
    private boolean P0;
    private boolean Q0;
    @Nullable
    private cp1.a R0;

    public dv0(Context context, xz xz3, kv0 kv02, @Nullable Handler handler, @Nullable kh kh3, zy zy3) {
        super(1, xz3, kv02, 44100.0f);
        this.H0 = context.getApplicationContext();
        this.J0 = zy3;
        this.I0 = new kh.a(handler, kh3);
        zy3.a(new a(this, null));
    }

    private int a(cc0 cc02, gv0 gv02) {
        int n10;
        if (S0.e().equals(gv02.a) && (n10 = m92.a) < 24 && (n10 != 23 || !m92.d((Context)this.H0))) {
            return -1;
        }
        return cc02.n;
    }

    private static xj0 a(kv0 object, cc0 object2, boolean bl2, lh object3) throws mv0.b {
        String string2 = ((cc0)object2).m;
        if (string2 == null) {
            return xj0.h();
        }
        if (object3.a((cc0)object2) && (object3 = (object3 = mv0.a((String)"audio/raw", (boolean)false, (boolean)false)).isEmpty() ? null : (gv0)object3.get(0)) != null) {
            return xj0.a(object3);
        }
        object3 = object.a(string2, bl2, false);
        if ((object2 = mv0.a((cc0)object2)) == null) {
            return xj0.a(object3);
        }
        object = object.a((String)object2, bl2, false);
        int n10 = xj0.d;
        return new xj0.a().b((List)object3).b((List)object).a();
    }

    @Override
    protected final void L() {
        this.J0.g();
    }

    @Override
    protected final void O() throws g60 {
        try {
            this.J0.d();
            return;
        }
        catch (lh.e e11) {
            throw this.a(5002, e11.d, (Exception)((Object)e11), e11.c);
        }
    }

    @Override
    protected final float a(float f10, cc0[] cc0Array) {
        int n10 = cc0Array.length;
        int n12 = -1;
        for (int i14 = 0; i14 < n10; ++i14) {
            int n13 = cc0Array[i14].A;
            int n14 = n12;
            if (n13 != -1) {
                n14 = Math.max(n12, n13);
            }
            n12 = n14;
        }
        f10 = n12 == -1 ? -1.0f : (f10 *= (float)n12);
        return f10;
    }

    @Override
    protected final int a(kv0 object, cc0 cc02) throws mv0.b {
        Object object2;
        boolean bl2 = w01.d((String)cc02.m);
        int n10 = 0;
        if (!bl2) {
            return fs2.b((int)0, (int)0, (int)0);
        }
        int n12 = m92.a >= 21 ? 32 : 0;
        int n13 = cc02.F;
        boolean bl3 = true;
        int n14 = n13 != 0 ? 1 : 0;
        n13 = n13 != 0 && n13 != 2 ? 0 : 1;
        int n15 = 8;
        int n16 = 4;
        if (n13 != 0 && this.J0.a(cc02) && (n14 == 0 || (object2 = (object2 = mv0.a((String)"audio/raw", (boolean)false, (boolean)false)).isEmpty() ? null : (gv0)object2.get(0)) != null)) {
            return fs2.b((int)4, (int)8, (int)n12);
        }
        if ("audio/raw".equals(cc02.m) && !this.J0.a(cc02)) {
            return fs2.b((int)1, (int)0, (int)0);
        }
        object2 = this.J0;
        n14 = cc02.z;
        int n17 = cc02.A;
        if (!object2.a(new /* Unavailable Anonymous Inner Class!! */.e("audio/raw").c(n14).l(n17).i(2).a())) {
            return fs2.b((int)1, (int)0, (int)0);
        }
        xj0 xj02 = dv0.a(object, cc02, false, this.J0);
        if (xj02.isEmpty()) {
            return fs2.b((int)1, (int)0, (int)0);
        }
        if (n13 == 0) {
            return fs2.b((int)2, (int)0, (int)0);
        }
        object2 = (gv0)xj02.get(0);
        bl2 = object2.a(cc02);
        if (!bl2) {
            for (n14 = 1; n14 < xj02.size(); ++n14) {
                object = (gv0)xj02.get(n14);
                if (!object.a(cc02)) continue;
                n14 = 0;
                bl2 = bl3;
                break;
            }
        } else {
            n14 = 1;
            object = object2;
        }
        n13 = bl2 ? n16 : 3;
        n16 = n15;
        if (bl2) {
            n16 = n15;
            if (object.b(cc02)) {
                n16 = 16;
            }
        }
        n15 = object.g ? 64 : 0;
        if (n14 != 0) {
            n10 = 128;
        }
        return n13 | n16 | n12 | n15 | n10;
    }

    @Override
    protected final cv0.a a(gv0 gv02, cc0 cc02, @Nullable MediaCrypto mediaCrypto, float f10) {
        Object object;
        int n10;
        int n12;
        MediaFormat mediaFormat = this.s();
        int n13 = this.a(cc02, gv02);
        if (((cc0[])mediaFormat).length == 1) {
            n12 = n13;
        } else {
            int n14 = ((cc0[])mediaFormat).length;
            n10 = 0;
            while (true) {
                n12 = n13;
                if (n10 >= n14) break;
                object = mediaFormat[n10];
                n12 = n13;
                if (gv02.a((cc0)cc02, (cc0)object).d != 0) {
                    n12 = Math.max(n13, this.a((cc0)object, gv02));
                }
                ++n10;
                n13 = n12;
            }
        }
        this.K0 = n12;
        mediaFormat = gv02.a;
        n10 = m92.a;
        boolean bl2 = n10 < 24 && (object = S0).d().equals(mediaFormat) && object.f().equals(m92.c) && ((mediaFormat = m92.b).startsWith(object.h()) || mediaFormat.startsWith(object.b()) || mediaFormat.startsWith(object.c()));
        this.L0 = bl2;
        object = gv02.c;
        n12 = this.K0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", (String)object);
        mediaFormat.setInteger("channel-count", cc02.z);
        mediaFormat.setInteger("sample-rate", cc02.A);
        object = cc02.o;
        for (n13 = 0; n13 < object.size(); ++n13) {
            mediaFormat.setByteBuffer(fe.a((String)"csd-", (int)n13), ByteBuffer.wrap(object.get(n13)));
        }
        dw0.a((MediaFormat)mediaFormat, (String)"max-input-size", (int)n12);
        if (n10 >= 23) {
            String string2;
            String string3;
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && (n10 != 23 || !(string3 = (object = S0).g()).equals(string2 = m92.d) && !object.a().equals(string2))) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (n10 <= 28 && "audio/ac4".equals(cc02.m)) {
            S0.getClass();
            mediaFormat.setInteger(new String(Base64.decode((String)"YWM0LWlzLXN5bmM=", (int)0), d.b), 1);
        }
        if (n10 >= 24) {
            object = this.J0;
            n13 = cc02.z;
            n12 = cc02.A;
            if (object.b(new /* Unavailable Anonymous Inner Class!! */.e("audio/raw").c(n13).l(n12).i(4).a()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (n10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        object = "audio/raw".equals(gv02.b) && !"audio/raw".equals(cc02.m) ? cc02 : null;
        this.M0 = object;
        return cv0.a.a((gv0)gv02, (MediaFormat)mediaFormat, (cc0)cc02, (MediaCrypto)mediaCrypto);
    }

    @Override
    @Nullable
    protected final ly a(dc0 dc02) throws g60 {
        ly ly2 = super.a(dc02);
        this.I0.a(dc02.b, ly2);
        return ly2;
    }

    @Override
    protected final ly a(gv0 object, cc0 cc02, cc0 cc03) {
        int n10;
        ly ly2 = object.a(cc02, cc03);
        int n12 = n10 = ly2.e;
        if (this.a(cc03, (gv0)object) > this.K0) {
            n12 = n10 | 0x40;
        }
        object = object.a;
        n10 = n12 != 0 ? 0 : ly2.d;
        return new ly((String)object, cc02, cc03, n10, n12);
    }

    @Override
    protected final ArrayList a(kv0 kv02, cc0 cc02, boolean bl2) throws mv0.b {
        return mv0.a((xj0)dv0.a(kv02, cc02, bl2, this.J0), (cc0)cc02);
    }

    @Override
    public final void a(int n10, @Nullable Object object) throws g60 {
        if (n10 != 2) {
            if (n10 != 3) {
                if (n10 != 6) {
                    switch (n10) {
                        default: {
                            break;
                        }
                        case 11: {
                            this.R0 = object;
                            break;
                        }
                        case 10: {
                            this.J0.a(((Integer)object).intValue());
                            break;
                        }
                        case 9: {
                            this.J0.b(((Boolean)object).booleanValue());
                            break;
                        }
                    }
                } else {
                    object = (sh)object;
                    this.J0.a((sh)object);
                }
            } else {
                object = (eh)object;
                this.J0.a((eh)object);
            }
        } else {
            this.J0.setVolume(((Float)object).floatValue());
        }
    }

    @Override
    protected final void a(long l10, boolean bl2) throws g60 {
        super.a(l10, bl2);
        this.J0.flush();
        this.N0 = l10;
        this.O0 = true;
        this.P0 = true;
    }

    public final void a(bi1 bi12) {
        this.J0.a(bi12);
    }

    @Override
    protected final void a(cc0 cc02, @Nullable MediaFormat object) throws g60 {
        cc0 cc03 = this.M0;
        cc0 cc04 = null;
        int[] nArray = null;
        if (cc03 != null) {
            cc02 = cc03;
            object = cc04;
        } else if (this.E() == null) {
            object = cc04;
        } else {
            int n10 = "audio/raw".equals(cc02.m) ? cc02.B : (m92.a >= 24 && object.containsKey("pcm-encoding") ? object.getInteger("pcm-encoding") : (object.containsKey("v-bits-per-sample") ? m92.b((int)object.getInteger("v-bits-per-sample")) : 2));
            cc04 = new /* Unavailable Anonymous Inner Class!! */.e("audio/raw").i(n10).d(cc02.C).e(cc02.D).c(object.getInteger("channel-count")).l(object.getInteger("sample-rate")).a();
            object = nArray;
            if (this.L0) {
                object = nArray;
                if (cc04.z == 6) {
                    n10 = cc02.z;
                    object = nArray;
                    if (n10 < 6) {
                        nArray = new int[n10];
                        n10 = 0;
                        while (true) {
                            object = nArray;
                            if (n10 >= cc02.z) break;
                            nArray[n10] = n10;
                            ++n10;
                        }
                    }
                }
            }
            cc02 = cc04;
        }
        try {
            this.J0.a(cc02, (int[])object);
            return;
        }
        catch (lh.a a12) {
            throw this.a((Exception)((Object)a12), a12.b, 5001);
        }
    }

    @Override
    protected final void a(Exception exception) {
        zs0.a((String)"MediaCodecAudioRenderer", (String)"Audio codec error", (Throwable)exception);
        this.I0.a(exception);
    }

    @Override
    protected final void a(String string2) {
        this.I0.a(string2);
    }

    @Override
    protected final void a(String string2, long l10, long l11) {
        this.I0.a(string2, l10, l11);
    }

    @Override
    protected final void a(boolean bl2, boolean bl3) throws g60 {
        super.a(bl2, bl3);
        this.I0.b(this.B0);
        if (this.p().a) {
            this.J0.c();
        } else {
            this.J0.f();
        }
        this.J0.a(this.r());
    }

    @Override
    public final boolean a() {
        boolean bl2 = super.a() && this.J0.a();
        return bl2;
    }

    @Override
    protected final boolean a(long l10, long l11, @Nullable cv0 cv02, @Nullable ByteBuffer byteBuffer, int n10, int n12, int n13, long l13, boolean bl2, boolean bl3, cc0 cc02) throws g60 {
        lh.b b102;
        block8: {
            lh.e e112;
            block6: {
                block7: {
                    byteBuffer.getClass();
                    if (this.M0 != null && (n12 & 2) != 0) {
                        cv02.getClass();
                        cv02.a(false, n10);
                        return true;
                    }
                    if (bl2) {
                        if (cv02 != null) {
                            cv02.a(false, n10);
                        }
                        cv02 = this.B0;
                        cv02.f += n13;
                        this.J0.g();
                        return true;
                    }
                    try {
                        bl2 = this.J0.a(byteBuffer, l13, n13);
                        if (!bl2) break block6;
                        if (cv02 == null) break block7;
                    }
                    catch (lh.e e112) {
                    }
                    catch (lh.b b102) {
                        break block8;
                    }
                    cv02.a(false, n10);
                }
                cv02 = this.B0;
                cv02.e += n13;
                return true;
            }
            return false;
            throw this.a(5002, cc02, (Exception)((Object)e112), e112.c);
        }
        throw this.a(5001, b102.d, (Exception)((Object)b102), b102.c);
    }

    @Override
    protected final void b(jy jy2) {
        if (this.O0 && !jy2.e()) {
            if (Math.abs(jy2.f - this.N0) > 500000L) {
                this.N0 = jy2.f;
            }
            this.O0 = false;
        }
    }

    @Override
    protected final boolean b(cc0 cc02) {
        return this.J0.a(cc02);
    }

    @Override
    public final boolean d() {
        boolean bl2 = this.J0.e() || super.d();
        return bl2;
    }

    @Override
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final bi1 getPlaybackParameters() {
        return this.J0.getPlaybackParameters();
    }

    @Override
    @Nullable
    public final bv0 l() {
        return this;
    }

    public final long o() {
        long l10;
        if (this.getState() == 2 && (l10 = this.J0.a(this.a())) != Long.MIN_VALUE) {
            if (!this.P0) {
                l10 = Math.max(this.N0, l10);
            }
            this.N0 = l10;
            this.P0 = false;
        }
        return this.N0;
    }

    @Override
    protected final void u() {
        this.Q0 = true;
        try {
            this.J0.flush();
        }
        catch (Throwable throwable) {
            try {
                super.u();
                throw throwable;
            }
            finally {
                this.I0.a(this.B0);
            }
        }
        try {
            super.u();
            return;
        }
        finally {
            this.I0.a(this.B0);
        }
    }

    @Override
    protected final void v() {
        try {
            super.v();
            return;
        }
        finally {
            if (this.Q0) {
                this.Q0 = false;
                this.J0.b();
            }
        }
    }

    @Override
    protected final void w() {
        this.J0.play();
    }

    @Override
    protected final void x() {
        long l10 = this.J0.a(this.a());
        if (l10 != Long.MIN_VALUE) {
            if (!this.P0) {
                l10 = Math.max(this.N0, l10);
            }
            this.N0 = l10;
            this.P0 = false;
        }
        this.J0.pause();
    }

    private final class a
    implements lh.c {
        final dv0 a;

        private a(dv0 dv02) {
            this.a = dv02;
        }

        /* synthetic */ a(dv0 dv02, gs2 gs22) {
            this(dv02);
        }

        public final void a() {
            cp1.a a12 = this.a.R0;
            if (a12 != null) {
                a12.b();
            }
        }

        public final void a(int n10, long l10, long l11) {
            this.a.I0.b(n10, l10, l11);
        }

        public final void a(long l10) {
            this.a.I0.b(l10);
        }

        public final void a(Exception exception) {
            zs0.a((String)"MediaCodecAudioRenderer", (String)"Audio sink error", (Throwable)exception);
            this.a.I0.b(exception);
        }

        public final void a(boolean bl2) {
            this.a.I0.b(bl2);
        }

        public final void b() {
            cp1.a a12 = this.a.R0;
            if (a12 != null) {
                a12.a();
            }
        }

        public final void c() {
            this.a.P0 = true;
        }
    }
}

