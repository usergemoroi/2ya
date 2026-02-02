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
import java.util.List;
import kotlin.jvm.internal.y;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class nx1
extends Handler
implements d62 {
    @NotNull
    private final ld1 b;
    private final long c;

    public nx1(@NotNull Looper looper, @NotNull ld1 ld12, long l10) {
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
                object = (f31)((WeakReference)object).get();
                if (object != null) {
                    List<w62> list = ((f31)object).d();
                    list.size();
                    n10 = op0.b;
                    for (w62 w622 : list) {
                        Object object2 = ((f31)object).b(w622);
                        if (object2.c() == u92.a.c) {
                            long l10;
                            object2 = w622.b();
                            if (object2 != null) {
                                l10 = (Long)object2;
                            } else {
                                l10 = SystemClock.elapsedRealtime();
                                w622.a(Long.valueOf(l10));
                            }
                            if (SystemClock.elapsedRealtime() - l10 >= w622.a()) {
                                this.sendMessage(Message.obtain((Handler)this, (int)1, z.a(new WeakReference<Object>(object), w622)));
                            }
                            ((f31)object).f();
                            this.b.a(w622.c());
                            continue;
                        }
                        w622.a(null);
                        this.b.a(w622.c(), (u92)object2);
                    }
                    if (list.isEmpty() ^ true) {
                        this.sendMessageDelayed(Message.obtain((Handler)this, (int)2, new WeakReference<Object>(object)), this.c);
                    }
                }
            }
        } else {
            object = ((Message)object).obj;
            y.h(object, "null cannot be cast to non-null type kotlin.Pair<java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager>, com.monetization.ads.base.impression.tracking.model.TrackingNotice>");
            object = (t)object;
            Object object3 = (f31)((WeakReference)((t)object).c()).get();
            if (object3 != null) {
                w62 w623 = (w62)((t)object).d();
                n10 = op0.b;
                ((f31)object3).a(w623);
                ((f31)object3).e();
                object = this.b;
                w623 = w623.c();
                Object object4 = ((f31)object3).d();
                object3 = new ArrayList(kotlin.collections.t.x(object4, (int)10));
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    ((ArrayList)object3).add(((w62)object4.next()).c());
                }
                object.a((hy1)w623, (List)object3);
            }
        }
    }
}

