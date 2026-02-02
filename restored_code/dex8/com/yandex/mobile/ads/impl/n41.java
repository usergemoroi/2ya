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

public final class n41
implements l41 {
    @Nullable
    public final View a(@NotNull View view, @NotNull String string2) {
        if (!((view = view.findViewWithTag((Object)string2)) instanceof View)) {
            view = null;
        }
        return view;
    }

    @Nullable
    public final TextView a(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"body")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final CheckBox b(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"mute_button")) instanceof CheckBox ? (CheckBox)object : null;
        return object;
    }

    @Nullable
    public final CustomizableMediaView c(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"media")) instanceof CustomizableMediaView ? (CustomizableMediaView)object : null;
        return object;
    }

    @Nullable
    public final TextView d(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"price")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView e(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"call_to_action")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView f(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"warning")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ImageView g(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"favicon")) instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final TextView h(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"age")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final View i(@NotNull View view) {
        if (!((view = view.findViewWithTag((Object)"rating")) instanceof View)) {
            view = null;
        }
        return view;
    }

    @Nullable
    public final TextView j(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"title")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ProgressBar k(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"video_progress")) instanceof ProgressBar ? (ProgressBar)object : null;
        return object;
    }

    @Nullable
    public final ImageView l(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"feedback")) instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final TextView m(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"sponsored")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final TextView n(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"domain")) instanceof TextView ? (TextView)object : null;
        return object;
    }

    @Nullable
    public final ImageView o(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"icon")) instanceof ImageView ? (ImageView)object : null;
        return object;
    }

    @Nullable
    public final TextView p(@NotNull View object) {
        object = (object = object.findViewWithTag((Object)"review_count")) instanceof TextView ? (TextView)object : null;
        return object;
    }
}

