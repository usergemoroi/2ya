/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  androidx.annotation.VisibleForTesting
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import java.util.List;

public class ContentLayoutManager {
    private final BlocksViewHolder blocksViewHolder;
    private final Context context;

    public ContentLayoutManager(Context context, BlocksViewHolder blocksViewHolder) {
        this.context = context;
        this.blocksViewHolder = blocksViewHolder;
    }

    @VisibleForTesting
    void renderBlock(Block block, String object, LinearLayout linearLayout) {
        object = new Appearance.Builder().withTextColor((String)object);
        object = new BlockMetadata.Builder().withAppearance((Appearance.Builder)object).build();
        linearLayout.addView(block.getType().getView(this.blocksViewHolder, block, (ViewGroup)linearLayout, (BlockMetadata)object));
    }

    public void renderCarouselScreen(CarouselScreen carouselScreen, FrameLayout frameLayout) {
        LinearLayout linearLayout = (LinearLayout)LayoutInflater.from((Context)this.context).inflate(this.blocksViewHolder.getLayout(), (ViewGroup)frameLayout, false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)linearLayout.getLayoutParams();
        layoutParams.gravity = carouselScreen.getGravity();
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        frameLayout.addView((View)linearLayout);
        this.renderContent(carouselScreen.getBlocks(), carouselScreen.getTextColor(), linearLayout);
    }

    @VisibleForTesting
    void renderContent(List<Block> object, String string2, LinearLayout linearLayout) {
        object = object.iterator();
        while (object.hasNext()) {
            this.renderBlock((Block)object.next(), string2, linearLayout);
        }
    }
}

