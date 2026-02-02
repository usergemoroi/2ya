/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.ej2
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.ir1
 *  com.yandex.mobile.ads.impl.jm
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.yp1
 *  com.yandex.mobile.ads.impl.yp1$b
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.ej2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.ir1;
import com.yandex.mobile.ads.impl.jm;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.yp1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

final class sj2
implements yp1.b {
    private final HashMap a = new HashMap();
    private final ir1 b;
    @Nullable
    private final jm c;
    @Nullable
    private final BlockingQueue<yp1<?>> d;

    sj2(@NonNull jm jm3, @NonNull PriorityBlockingQueue priorityBlockingQueue, ir1 ir12) {
        this.b = ir12;
        this.c = jm3;
        this.d = priorityBlockingQueue;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(yp1<?> object, ar1<?> ar12) {
        long l10;
        Object object2 = ar12.b;
        if (object2 != null && ((em.a)object2).e >= (l10 = System.currentTimeMillis())) {
            object = object.d();
            // MONITORENTER : this
            object = (List)this.a.remove(object);
            // MONITOREXIT : this
            if (object == null) return;
            if (ej2.a) {
                object.size();
                int n10 = op0.b;
            }
            object2 = object.iterator();
            while (object2.hasNext()) {
                object = (yp1)object2.next();
                ((b60)this.b).a((yp1<?>)object, ar12, null);
            }
            return;
        }
        this.b((yp1<?>)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean a(yp1<?> yp12) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string2;
                block5: {
                    ArrayList arrayList;
                    block6: {
                        try {
                            ArrayList arrayList2;
                            string2 = yp12.d();
                            if (!this.a.containsKey(string2)) break block5;
                            arrayList = arrayList2 = (ArrayList)this.a.get(string2);
                            if (arrayList2 != null) break block6;
                            arrayList = new ArrayList();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    yp12.a("waiting-for-response");
                    arrayList.add(yp12);
                    this.a.put(string2, arrayList);
                    if (ej2.a) {
                        int n10 = op0.b;
                    }
                    return true;
                }
                this.a.put(string2, null);
                yp12.a((yp1.b)this);
                if (ej2.a) {
                    int n13 = op0.b;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(yp1<?> yp12) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block6: {
                    int n10;
                    List list;
                    Object object;
                    block7: {
                        try {
                            object = yp12.d();
                            list = (List)this.a.remove(object);
                            if (list == null || list.isEmpty()) break block6;
                            if (!ej2.a) break block7;
                            list.size();
                            n10 = op0.b;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    yp12 = (yp1)list.remove(0);
                    this.a.put(object, list);
                    yp12.a((yp1.b)this);
                    if (this.c != null && (object = this.d) != null) {
                        try {
                            object.put(yp12);
                        }
                        catch (InterruptedException interruptedException) {
                            n10 = op0.b;
                            Thread.currentThread().interrupt();
                            this.c.b();
                        }
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

