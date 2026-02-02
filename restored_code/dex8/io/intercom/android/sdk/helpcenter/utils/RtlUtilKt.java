/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.TextView
 */
package io.intercom.android.sdk.helpcenter.utils;

import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Landroid/widget/TextView;", "Lkotlin/k0;", "setMaxWidthToScreen", "(Landroid/widget/TextView;)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
public final class RtlUtilKt {
    public static final void setMaxWidthToScreen(@NotNull TextView textView) {
        y.j(textView, "<this>");
        int n10 = textView.getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        y.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
        textView.setMaxWidth(n10 - layoutParams.getMarginStart() - layoutParams.getMarginEnd());
    }
}

