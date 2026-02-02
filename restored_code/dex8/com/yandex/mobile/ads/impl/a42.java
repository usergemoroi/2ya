/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Surface
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.cv0
 *  com.yandex.mobile.ads.impl.cv0$a
 *  com.yandex.mobile.ads.impl.cv0$b
 *  com.yandex.mobile.ads.impl.cv0$c
 *  com.yandex.mobile.ads.impl.gq2
 *  com.yandex.mobile.ads.impl.hq2
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.vu
 *  com.yandex.mobile.ads.impl.x52
 */
package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.gq2;
import com.yandex.mobile.ads.impl.hq2;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.vu;
import com.yandex.mobile.ads.impl.x52;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a42
implements cv0 {
    private final MediaCodec a;
    @Nullable
    private ByteBuffer[] b;
    @Nullable
    private ByteBuffer[] c;

    private a42(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (m92.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    /* synthetic */ a42(MediaCodec mediaCodec, hq2 hq22) {
        this(mediaCodec);
    }

    public static /* synthetic */ void a(a42 a422, cv0.c c10, MediaCodec mediaCodec, long l10, long l11) {
        a422.a(c10, mediaCodec, l10, l11);
    }

    private /* synthetic */ void a(cv0.c c10, MediaCodec mediaCodec, long l10, long l11) {
        c10.a(l10);
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int n10;
        do {
            if ((n10 = this.a.dequeueOutputBuffer(bufferInfo, 0L)) != -3 || m92.a >= 21) continue;
            this.c = this.a.getOutputBuffers();
        } while (n10 == -3);
        return n10;
    }

    public final MediaFormat a() {
        return this.a.getOutputFormat();
    }

    public final void a(int n10) {
        this.a.setVideoScalingMode(n10);
    }

    public final void a(int n10, int n12, long l10, int n13) {
        this.a.queueInputBuffer(n10, 0, n12, l10, n13);
    }

    @RequiresApi(value=21)
    public final void a(int n10, long l10) {
        this.a.releaseOutputBuffer(n10, l10);
    }

    public final void a(int n10, vu vu2, long l10) {
        this.a.queueSecureInputBuffer(n10, 0, vu2.a(), l10, 0);
    }

    @RequiresApi(value=19)
    public final void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @RequiresApi(value=23)
    public final void a(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @RequiresApi(value=23)
    public final void a(cv0.c c10, Handler handler) {
        this.a.setOnFrameRenderedListener((MediaCodec.OnFrameRenderedListener)new gq2(this, c10), handler);
    }

    public final void a(boolean bl2, int n10) {
        this.a.releaseOutputBuffer(n10, bl2);
    }

    public final int b() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Nullable
    public final ByteBuffer b(int n10) {
        if (m92.a >= 21) {
            return this.a.getInputBuffer(n10);
        }
        return this.b[n10];
    }

    @Nullable
    public final ByteBuffer c(int n10) {
        if (m92.a >= 21) {
            return this.a.getOutputBuffer(n10);
        }
        return this.c[n10];
    }

    public final void flush() {
        this.a.flush();
    }

    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    public static final class a
    implements cv0.b {
        protected static MediaCodec b(cv0.a object) throws IOException {
            ((cv0.a)object).a.getClass();
            String string2 = ((cv0.a)object).a.a;
            object = new StringBuilder("createCodec:");
            ((StringBuilder)object).append(string2);
            x52.a((String)((StringBuilder)object).toString());
            object = MediaCodec.createByCodecName((String)string2);
            x52.a();
            return object;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final cv0 a(cv0.a object) throws IOException {
            void var1_3;
            MediaCodec mediaCodec;
            block6: {
                Object var3_7 = null;
                try {
                    mediaCodec = com.yandex.mobile.ads.impl.a42$a.b((cv0.a)object);
                }
                catch (RuntimeException runtimeException) {
                    mediaCodec = var3_7;
                    break block6;
                }
                catch (IOException iOException) {
                    mediaCodec = var3_7;
                    break block6;
                }
                try {
                    x52.a((String)"configureCodec");
                    mediaCodec.configure(((cv0.a)object).b, ((cv0.a)object).d, ((cv0.a)object).e, 0);
                    x52.a();
                    x52.a((String)"startCodec");
                    mediaCodec.start();
                    x52.a();
                    return new a42(mediaCodec, null);
                }
                catch (RuntimeException runtimeException) {
                }
                catch (IOException iOException) {}
            }
            if (mediaCodec == null) throw var1_3;
            mediaCodec.release();
            throw var1_3;
        }
    }
}

