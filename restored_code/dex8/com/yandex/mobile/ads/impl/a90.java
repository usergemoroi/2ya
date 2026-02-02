/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.DiffUtil$ItemCallback
 *  androidx.recyclerview.widget.ListAdapter
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.yandex.mobile.ads.R$layout
 *  com.yandex.mobile.ads.impl.a90$a
 *  com.yandex.mobile.ads.impl.ca0
 *  com.yandex.mobile.ads.impl.ha0
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.j90
 *  com.yandex.mobile.ads.impl.ju
 *  com.yandex.mobile.ads.impl.n50
 *  com.yandex.mobile.ads.impl.u80
 *  com.yandex.mobile.ads.impl.v80
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.a90;
import com.yandex.mobile.ads.impl.b90;
import com.yandex.mobile.ads.impl.ba0;
import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.ca0;
import com.yandex.mobile.ads.impl.da0;
import com.yandex.mobile.ads.impl.ga0;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.ha0;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.iq2;
import com.yandex.mobile.ads.impl.j90;
import com.yandex.mobile.ads.impl.ju;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.u80;
import com.yandex.mobile.ads.impl.v80;
import com.yandex.mobile.ads.impl.w90;
import com.yandex.mobile.ads.impl.z90;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class a90
extends ListAdapter<ca0, ga0> {
    @NotNull
    private final ha0 a;
    @NotNull
    private final v80 b;
    @NotNull
    private final q0 c;
    @NotNull
    private final LinkedHashMap d;
    @Nullable
    private a e;
    private boolean f;

    public a90(@NotNull ha0 ha02, @NotNull v80 v802) {
        super((DiffUtil.ItemCallback)new da0());
        this.a = ha02;
        this.b = v802;
        this.c = ju.b((n50)ha02.a().p().c());
        this.d = new LinkedHashMap();
    }

    public /* synthetic */ a90(ha0 ha02, v80 v802, int n10, p p14) {
        if ((n10 & 2) != 0) {
            v802 = new v80();
        }
        this(ha02, v802);
    }

    private static final void a(a90 a902, int n10) {
        a902.a.a(n10);
    }

    public static final void access$bindHolder(a90 a902, ga0 ga02, int n10) {
        a902 = (ca0)a902.getCurrentList().get(n10);
        if (ga02 instanceof w90 && a902 instanceof h90) {
            ((w90)ga02).a((h90)((Object)a902));
        }
    }

    public static final /* synthetic */ Map access$getBoundViewHolders$p(a90 a902) {
        return a902.d;
    }

    public static final /* synthetic */ ha0 access$getFeedViewModel$p(a90 a902) {
        return a902.a;
    }

    public static final /* synthetic */ void access$registerTrackers(a90 a902) {
        a902.c();
    }

    public static final void access$unbindHolder(a90 object, ga0 ga02) {
        ((Object)object).getClass();
        object = ga02 instanceof w90 ? (w90)ga02 : null;
        if (object != null) {
            ((w90)((Object)object)).a();
        }
    }

    public static final void access$unregisterTrackers(a90 a902) {
        a902.b.a();
        r0.f(a902.c, null, 1, null);
        a902.f = false;
    }

    public static /* synthetic */ void b(a90 a902, int n10) {
        a90.a(a902, n10);
    }

    private final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.b.a((u80)new iq2(this));
        i.d(this.c, null, null, new b90(this, null), 3, null);
    }

    @NotNull
    protected abstract ht a();

    @NotNull
    protected abstract bf2 b();

    public int getItemCount() {
        return this.getCurrentList().size();
    }

    public int getItemViewType(int n10) {
        return y.e(this.getCurrentList().get(n10), (Object)ba0.a) ? 1 : 0;
    }

    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        a a12;
        super.onAttachedToRecyclerView(recyclerView);
        a a13 = a12 = this.e;
        if (a12 == null) {
            a13 = new /* Unavailable Anonymous Inner Class!! */;
        }
        this.e = a13;
        recyclerView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)a13);
        recyclerView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)a13);
        if (this.a.d().get() < 0) {
            this.a.f();
        }
        this.c();
    }

    public void onBindViewHolder(@NotNull ga0 ga02, int n10) {
        this.d.put(ga02, n10);
        ca0 ca02 = (ca0)this.getCurrentList().get(n10);
        if (ga02 instanceof w90 && ca02 instanceof h90) {
            ((w90)ga02).a((h90)ca02);
        }
    }

    @NotNull
    public ga0 onCreateViewHolder(@NotNull ViewGroup object, int n10) {
        Context context = object.getContext();
        if (n10 == 0) {
            object = LayoutInflater.from((Context)context).inflate(R.layout.monetization_ads_feed_item, object, false);
            y.h(object, "null cannot be cast to non-null type android.view.ViewGroup");
            object = new w90((ViewGroup)object, new j90(this.a.a(), object, this.a(), this.b()));
        } else {
            object = new z90(LayoutInflater.from((Context)context).inflate(R.layout.monetization_ads_feed_progressbar, object, false));
        }
        return object;
    }

    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        a a12 = this.e;
        if (a12 != null) {
            recyclerView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)a12);
        }
        this.b.a();
        r0.f(this.c, null, 1, null);
        this.f = false;
    }

    public void onViewAttachedToWindow(@NotNull ga0 ga02) {
        super.onViewAttachedToWindow((RecyclerView.ViewHolder)ga02);
        int n10 = ga02.getBindingAdapterPosition();
        if (ga02 instanceof w90) {
            ga02 = ga02.itemView;
            this.b.a((View)ga02, n10);
        }
    }

    public void onViewDetachedFromWindow(@NotNull ga0 ga02) {
        super.onViewDetachedFromWindow((RecyclerView.ViewHolder)ga02);
        this.b.a(ga02.itemView);
    }

    public void onViewRecycled(@NotNull ga0 ga02) {
        super.onViewRecycled((RecyclerView.ViewHolder)ga02);
        this.d.remove((Object)ga02);
        ga02 = ga02 instanceof w90 ? (w90)ga02 : null;
        if (ga02 != null) {
            ((w90)ga02).a();
        }
    }
}

