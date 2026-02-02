/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.view.Surface
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.cv0
 *  com.yandex.mobile.ads.impl.cv0$a
 *  com.yandex.mobile.ads.impl.cv0$b
 *  com.yandex.mobile.ads.impl.cv0$c
 *  com.yandex.mobile.ads.impl.s53
 *  com.yandex.mobile.ads.impl.v53
 *  com.yandex.mobile.ads.impl.vu
 *  com.yandex.mobile.ads.impl.w32
 *  com.yandex.mobile.ads.impl.wg
 *  com.yandex.mobile.ads.impl.x52
 *  com.yandex.mobile.ads.impl.xg
 */
package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.s53;
import com.yandex.mobile.ads.impl.t53;
import com.yandex.mobile.ads.impl.u53;
import com.yandex.mobile.ads.impl.v53;
import com.yandex.mobile.ads.impl.vu;
import com.yandex.mobile.ads.impl.w32;
import com.yandex.mobile.ads.impl.wg;
import com.yandex.mobile.ads.impl.x52;
import com.yandex.mobile.ads.impl.xg;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(value=23)
final class vg
implements cv0 {
    private final MediaCodec a;
    private final xg b;
    private final wg c;
    private final boolean d;
    private boolean e;
    private int f;

    private vg(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean bl2) {
        this.a = mediaCodec;
        this.b = new xg(handlerThread);
        this.c = new wg(mediaCodec, handlerThread2);
        this.d = bl2;
        this.f = 0;
    }

    /* synthetic */ vg(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean bl2, v53 v532) {
        this(mediaCodec, handlerThread, handlerThread2, bl2);
    }

    private void a(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        this.b.a(this.a);
        x52.a((String)"configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, 0);
        x52.a();
        this.c.d();
        x52.a((String)"startCodec");
        this.a.start();
        x52.a();
        this.f = 1;
    }

    private /* synthetic */ void a(cv0.c c11, MediaCodec mediaCodec, long l10, long l11) {
        c11.a(l10);
    }

    public static /* synthetic */ void a(vg vg3, cv0.c c11, MediaCodec mediaCodec, long l10, long l11) {
        vg3.a(c11, mediaCodec, l10, l11);
    }

    private void c() {
        if (this.d) {
            try {
                this.c.e();
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(interruptedException);
            }
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    public final MediaFormat a() {
        return this.b.c();
    }

    public final void a(int n10) {
        this.c();
        this.a.setVideoScalingMode(n10);
    }

    public final void a(int n10, int n13, long l10, int n14) {
        this.c.a(n10, n13, l10, n14);
    }

    public final void a(int n10, long l10) {
        this.a.releaseOutputBuffer(n10, l10);
    }

    public final void a(int n10, vu vu3, long l10) {
        this.c.a(n10, vu3, l10);
    }

    public final void a(Bundle bundle) {
        this.c();
        this.a.setParameters(bundle);
    }

    public final void a(Surface surface) {
        this.c();
        this.a.setOutputSurface(surface);
    }

    public final void a(cv0.c c11, Handler handler) {
        this.c();
        this.a.setOnFrameRenderedListener((MediaCodec.OnFrameRenderedListener)new s53(this, c11), handler);
    }

    public final void a(boolean bl2, int n10) {
        this.a.releaseOutputBuffer(n10, bl2);
    }

    public final int b() {
        return this.b.a();
    }

    @Nullable
    public final ByteBuffer b(int n10) {
        return this.a.getInputBuffer(n10);
    }

    @Nullable
    public final ByteBuffer c(int n10) {
        return this.a.getOutputBuffer(n10);
    }

    public final void flush() {
        this.c.a();
        this.a.flush();
        this.b.b();
        this.a.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        Throwable throwable2;
        block5: {
            block4: {
                try {
                    if (this.f != 1) break block4;
                    this.c.c();
                    this.b.e();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            this.f = 2;
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
            return;
        }
        if (!this.e) {
            this.a.release();
            this.e = true;
        }
        throw throwable2;
    }

    public static final class a
    implements cv0.b {
        private final w32<HandlerThread> a;
        private final w32<HandlerThread> b;

        public a(int n10) {
            this(new t53(n10), new u53(n10));
        }

        @VisibleForTesting
        a(w32 w322, w32 w323) {
            this.a = w322;
            this.b = w323;
        }

        private static HandlerThread a(int n10) {
            StringBuilder stringBuilder = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
            if (n10 == 1) {
                stringBuilder.append("Audio");
            } else if (n10 == 2) {
                stringBuilder.append("Video");
            } else {
                stringBuilder.append("Unknown(");
                stringBuilder.append(n10);
                stringBuilder.append(")");
            }
            return new HandlerThread(stringBuilder.toString());
        }

        private static HandlerThread b(int n10) {
            StringBuilder stringBuilder = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
            if (n10 == 1) {
                stringBuilder.append("Audio");
            } else if (n10 == 2) {
                stringBuilder.append("Video");
            } else {
                stringBuilder.append("Unknown(");
                stringBuilder.append(n10);
                stringBuilder.append(")");
            }
            return new HandlerThread(stringBuilder.toString());
        }

        public static /* synthetic */ HandlerThread c(int n10) {
            return com.yandex.mobile.ads.impl.vg$a.a(n10);
        }

        public static /* synthetic */ HandlerThread d(int n10) {
            return com.yandex.mobile.ads.impl.vg$a.b(n10);
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final vg b(cv0.a a14) throws IOException {
            void var1_5;
            StringBuilder stringBuilder;
            Object object;
            block7: {
                Object object2 = a14.a.a;
                object = null;
                try {
                    stringBuilder = new StringBuilder("createCodec:");
                    stringBuilder.append((String)object2);
                    x52.a((String)stringBuilder.toString());
                    stringBuilder = MediaCodec.createByCodecName((String)object2);
                }
                catch (Exception exception) {
                    stringBuilder = null;
                    break block7;
                }
                try {
                    object2 = new vg((MediaCodec)stringBuilder, (HandlerThread)this.a.get(), (HandlerThread)this.b.get(), false, null);
                }
                catch (Exception exception) {
                    break block7;
                }
                try {
                    x52.a();
                    ((vg)object2).a(a14.b, a14.d, a14.e);
                    return object2;
                }
                catch (Exception exception) {
                    object = object2;
                }
            }
            if (object == null) {
                if (stringBuilder == null) throw var1_5;
                stringBuilder.release();
                throw var1_5;
            }
            ((vg)object).release();
            throw var1_5;
        }
    }
}

