/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.gh2
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.gh2;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

public final class y42
extends gh2<TextView, String> {
    public y42(@NotNull TextView textView) {
        super((View)textView);
    }

    public final void a(View view) {
        view = (TextView)view;
        view.setText((CharSequence)"");
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public final boolean a(View object, Object object2) {
        object = (TextView)object;
        object2 = (String)object2;
        boolean bl2 = (object = object.getText()) != null ? p.z((String)String.valueOf(object), (String)object2, (boolean)true) : false;
        return bl2;
    }

    public final void b(View view, Object object) {
        ((TextView)view).setText((CharSequence)((String)object));
    }
}

