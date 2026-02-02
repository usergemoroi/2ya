/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.l41
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.l41;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class m41
implements l41 {
    @Nullable
    public final View a(@NotNull View view, @NotNull String string2) {
        return null;
    }

    @Nullable
    public final TextView a(@NotNull View view) {
        return (TextView)view.findViewById(R.id.body);
    }

    @Nullable
    public final CheckBox b(@NotNull View view) {
        return null;
    }

    @Nullable
    public final CustomizableMediaView c(@NotNull View view) {
        return (CustomizableMediaView)view.findViewById(R.id.media);
    }

    @Nullable
    public final TextView d(@NotNull View view) {
        return (TextView)view.findViewById(R.id.price);
    }

    @Nullable
    public final TextView e(@NotNull View view) {
        return (TextView)view.findViewById(R.id.call_to_action);
    }

    @Nullable
    public final TextView f(@NotNull View view) {
        return (TextView)view.findViewById(R.id.warning);
    }

    @Nullable
    public final ImageView g(@NotNull View view) {
        return (ImageView)view.findViewById(R.id.favicon);
    }

    @Nullable
    public final TextView h(@NotNull View view) {
        return (TextView)view.findViewById(R.id.age);
    }

    @Nullable
    public final View i(@NotNull View view) {
        return view.findViewById(R.id.rating);
    }

    @Nullable
    public final TextView j(@NotNull View view) {
        return (TextView)view.findViewById(R.id.title);
    }

    @Nullable
    public final ProgressBar k(@NotNull View view) {
        return null;
    }

    @Nullable
    public final ImageView l(@NotNull View view) {
        return (ImageView)view.findViewById(R.id.feedback);
    }

    @Nullable
    public final TextView m(@NotNull View view) {
        return (TextView)view.findViewById(R.id.sponsored);
    }

    @Nullable
    public final TextView n(@NotNull View view) {
        return (TextView)view.findViewById(R.id.domain);
    }

    @Nullable
    public final ImageView o(@NotNull View view) {
        return (ImageView)view.findViewById(R.id.icon);
    }

    @Nullable
    public final TextView p(@NotNull View view) {
        return (TextView)view.findViewById(R.id.review_count);
    }
}

