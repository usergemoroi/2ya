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
 *  com.yandex.mobile.ads.impl.l41
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.l41;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vd1
implements l41 {
    private final int a;

    public vd1(int n10) {
        this.a = n10;
    }

    @Nullable
    public final View a(@NotNull View view, @NotNull String string2) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(n10);
        view = view.findViewWithTag((Object)stringBuilder.toString());
        if (!(view instanceof View)) {
            view = null;
        }
        return view;
    }

    @Nullable
    public final TextView a(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("body_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final CheckBox b(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mute_button_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof CheckBox ? (CheckBox)object : null;
        return object;
    }

    @Nullable
    public final CustomizableMediaView c(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("media_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof CustomizableMediaView ? (CustomizableMediaView)object : null;
        return object;
    }

    @Nullable
    public final TextView d(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("price_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView e(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("call_to_action_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView f(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("warning_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ImageView g(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("favicon_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final TextView h(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("age_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final View i(@NotNull View view) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rating_");
        stringBuilder.append(n10);
        view = view.findViewWithTag((Object)stringBuilder.toString());
        if (!(view instanceof View)) {
            view = null;
        }
        return view;
    }

    @Nullable
    public final TextView j(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("title_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ProgressBar k(@NotNull View view) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("video_progress_");
        stringBuilder.append(n10);
        return (ProgressBar)view.findViewWithTag((Object)stringBuilder.toString());
    }

    @Nullable
    public final ImageView l(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("feedback_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final TextView m(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sponsored_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView n(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("domain_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ImageView o(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("icon_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final TextView p(@NotNull View object) {
        int n10 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("review_count_");
        stringBuilder.append(n10);
        object = object.findViewWithTag((Object)stringBuilder.toString());
        object = object instanceof TextView ? (TextView)object : null;
        return object;
    }
}

