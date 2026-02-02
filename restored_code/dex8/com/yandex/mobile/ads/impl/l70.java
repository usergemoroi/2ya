/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  com.yandex.mobile.ads.impl.oq0
 *  com.yandex.mobile.ads.impl.v0
 */
package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import com.yandex.mobile.ads.impl.oq0;
import com.yandex.mobile.ads.impl.v0;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class l70
implements oq0 {
    private final int b;
    @Nullable
    private final RectF c;

    public l70(int n10, @Nullable RectF rectF) {
        this.b = n10;
        this.c = rectF;
    }

    @NotNull
    public final String a() {
        Object object = z0.a;
        int n10 = this.b;
        object = this.c;
        object = object != null ? v0.a((Object[])new Object[]{Float.valueOf(((RectF)object).left), Float.valueOf(((RectF)object).top), Float.valueOf(object.width()), Float.valueOf(object.height())}, (int)4, (String)"{x:%s,y:%s,width:%s,height:%s}", (String)"format(...)") : null;
        return v0.a((Object[])new Object[]{n10, object}, (int)2, (String)"exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", (String)"format(...)");
    }
}

