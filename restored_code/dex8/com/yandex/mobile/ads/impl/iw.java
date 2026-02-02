/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.DiffUtil$ItemCallback
 *  androidx.recyclerview.widget.ListAdapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.yandex.mobile.ads.R$layout
 *  com.yandex.mobile.ads.impl.dx
 *  com.yandex.mobile.ads.impl.fi2
 *  com.yandex.mobile.ads.impl.rh2
 *  com.yandex.mobile.ads.impl.zx
 *  kotlin.jvm.functions.l
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
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.dx;
import com.yandex.mobile.ads.impl.fi2;
import com.yandex.mobile.ads.impl.rh2;
import com.yandex.mobile.ads.impl.yw;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.l;
import kotlin.r;
import org.jetbrains.annotations.NotNull;

public final class iw
extends ListAdapter<zx, cy<zx>> {
    @NotNull
    private final rh2 a;
    @NotNull
    private final fi2 b;

    public iw(@NotNull rh2 rh22, @NotNull fi2 fi22) {
        super((DiffUtil.ItemCallback)new yw());
        this.a = rh22;
        this.b = fi22;
    }

    public /* synthetic */ iw(l l10, dx dx2) {
        this(new rh2(l10, dx2), new fi2());
    }

    public final int getItemViewType(int n10) {
        block10: {
            block3: {
                zx zx2;
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block5: {
                                    block4: {
                                        block2: {
                                            zx2 = (zx)this.getItem(n10);
                                            this.b.getClass();
                                            if (!(zx2 instanceof zx.c)) break block2;
                                            n10 = R.layout.debug_panel_item_action_button;
                                            break block3;
                                        }
                                        if (!(zx2 instanceof zx.h)) break block4;
                                        n10 = R.layout.debug_panel_item_switch;
                                        break block3;
                                    }
                                    if (!(zx2 instanceof zx.d)) break block5;
                                    n10 = R.layout.debug_panel_item_divider;
                                    break block3;
                                }
                                if (!(zx2 instanceof zx.e)) break block6;
                                n10 = R.layout.deubg_panel_item_header;
                                break block3;
                            }
                            if (!(zx2 instanceof zx.f)) break block7;
                            n10 = R.layout.deubg_panel_item_key_value;
                            break block3;
                        }
                        if (!(zx2 instanceof zx.g)) break block8;
                        n10 = R.layout.debug_panel_item_mediation_adapter;
                        break block3;
                    }
                    if (!(zx2 instanceof zx.b)) break block9;
                    n10 = R.layout.debug_panel_item_ad_units;
                    break block3;
                }
                if (!(zx2 instanceof zx.a)) break block10;
                n10 = R.layout.debug_panel_item_ad_unit;
            }
            return n10;
        }
        throw new r();
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n10) {
        ((cy)viewHolder).a((zx)this.getItem(n10));
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n10) {
        viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(n10, viewGroup, false);
        return this.a.a((View)viewGroup, n10);
    }
}

