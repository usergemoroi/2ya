/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.hp
 *  com.yandex.mobile.ads.impl.hp$a
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.hp;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class jp
extends gh2<TextView, hp> {
    public jp(@NotNull TextView textView) {
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

    public final boolean a(View view, Object object) {
        view = (TextView)view;
        boolean bl2 = hp.a.b == (object = (hp)object).b() ? y.e(((Object)view.getText()).toString(), object.a()) : true;
        return bl2;
    }

    public final void b(View view, Object object) {
        view = (TextView)view;
        if (hp.a.b == (object = (hp)object).b()) {
            view.setText((CharSequence)object.a());
        }
    }
}

