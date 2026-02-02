/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  com.yandex.mobile.ads.impl.d62
 *  com.yandex.mobile.ads.impl.hy1
 *  com.yandex.mobile.ads.impl.ld1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pd1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 *  com.yandex.mobile.ads.impl.w62
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.yandex.mobile.ads.impl.d62;
import com.yandex.mobile.ads.impl.f31;
import com.yandex.mobile.ads.impl.hy1;
import com.yandex.mobile.ads.impl.ld1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pd1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.w62;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class yf1
extends Handler
implements d62 {
    @NotNull
    private final ld1 b;
    private final long c;

    public yf1(@NotNull Looper looper, @NotNull ld1 ld12, long l10) {
        super(looper);
        this.b = ld12;
        this.c = l10;
    }

    public final void a() {
        this.removeMessages(2);
        this.removeMessages(1);
    }

    public final void a(@NotNull pd1 pd12) {
        this.sendMessage(Message.obtain((Handler)this, (int)2, new WeakReference<pd1>(pd12)));
    }

    public final boolean b() {
        return this.hasMessages(2);
    }

    public final void handleMessage(@NotNull Message object) {
        int n10 = ((Message)object).what;
        if (n10 != 1) {
            if (n10 == 2) {
                object = ((Message)object).obj;
                y.h(object, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
                f31 f312 = (f31)((WeakReference)object).get();
                if (f312 != null) {
                    List<w62> list = f312.d();
                    list.size();
                    n10 = op0.b;
                    Iterator<w62> iterator = list.iterator();
                    n10 = Integer.MIN_VALUE;
                    while (iterator.hasNext()) {
                        long l10;
                        Long l11;
                        object = iterator.next();
                        if (object.e() > n10) {
                            l11 = f312.b((w62)object);
                            if (l11.c() == u92.a.c) {
                                n10 = object.e();
                                l11 = object.b();
                                if (l11 != null) {
                                    l10 = l11;
                                } else {
                                    l10 = SystemClock.elapsedRealtime();
                                    object.a(Long.valueOf(l10));
                                }
                                if (SystemClock.elapsedRealtime() - l10 >= object.a()) {
                                    this.sendMessage(Message.obtain((Handler)this, (int)1, z.a(new WeakReference<f31>(f312), object)));
                                }
                                f312.f();
                                this.b.a(object.c());
                                continue;
                            }
                            object.a(null);
                            this.b.a(object.c(), (u92)l11);
                            continue;
                        }
                        l11 = object.b();
                        if (l11 != null) {
                            l10 = l11;
                        } else {
                            l10 = SystemClock.elapsedRealtime();
                            object.a(Long.valueOf(l10));
                        }
                        if (SystemClock.elapsedRealtime() - l10 >= object.a()) {
                            this.sendMessage(Message.obtain((Handler)this, (int)1, z.a(new WeakReference<f31>(f312), object)));
                        }
                        f312.f();
                        this.b.a(object.c());
                    }
                    if (list.isEmpty() ^ true) {
                        this.sendMessageDelayed(Message.obtain((Handler)this, (int)2, new WeakReference<f31>(f312)), this.c);
                    }
                }
            }
        } else {
            object = ((Message)object).obj;
            y.h(object, "null cannot be cast to non-null type kotlin.Pair<java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager>, com.monetization.ads.base.impression.tracking.model.TrackingNotice>");
            object = (kotlin.t)object;
            Object object2 = (f31)((WeakReference)((kotlin.t)object).c()).get();
            if (object2 != null) {
                w62 w622 = (w62)((kotlin.t)object).d();
                n10 = op0.b;
                ((f31)object2).a(w622);
                ((f31)object2).e();
                object = this.b;
                w622 = w622.c();
                Object object3 = ((f31)object2).d();
                object2 = new ArrayList(t.x(object3, (int)10));
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    ((ArrayList)object2).add(((w62)object3.next()).c());
                }
                object.a((hy1)w622, (List)object2);
            }
        }
    }
}

