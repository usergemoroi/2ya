/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.util.DisplayMetrics
 *  android.view.Display
 */
package io.appmetrica.analytics.impl;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

public final class vj
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        Display display = (Display)object;
        object = new DisplayMetrics();
        display.getRealMetrics((DisplayMetrics)object);
        return new Point(((DisplayMetrics)object).widthPixels, ((DisplayMetrics)object).heightPixels);
    }
}

