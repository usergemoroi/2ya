/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.blocks.lib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.blocks.lib.BlockTypeNotImplementedException;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;
import java.util.List;

public class Blocks {
    private final Appearance appearance;
    private final LayoutInflater inflater;
    private final Twig twig;

    public Blocks(Context context, Twig twig) {
        this.inflater = LayoutInflater.from((Context)context);
        this.twig = twig;
        this.appearance = Appearance.NULL;
    }

    public Blocks(Context context, Twig twig, Appearance appearance) {
        this.inflater = LayoutInflater.from((Context)context);
        this.twig = twig;
        this.appearance = appearance;
    }

    public LinearLayout createBlocks(List<Block> list, BlocksViewHolder blocksViewHolder) {
        LinearLayout linearLayout = (LinearLayout)this.inflater.inflate(blocksViewHolder.getLayout(), null);
        if (list != null) {
            for (int i14 = 0; i14 < list.size(); ++i14) {
                Block block = list.get(i14);
                boolean bl2 = i14 == 0;
                boolean bl3 = i14 == list.size() - 1;
                BlockMetadata blockMetadata = new BlockMetadata.Builder().withAppearance(this.appearance.toBuilder()).isFirstObject(bl2).isLastObject(bl3).build();
                try {
                    linearLayout.addView(block.getType().getView(blocksViewHolder, block, (ViewGroup)linearLayout, blockMetadata));
                    continue;
                }
                catch (BlockTypeNotImplementedException blockTypeNotImplementedException) {
                    this.twig.e((Throwable)blockTypeNotImplementedException, "Error creating view for block with type %s ", new Object[]{block.getType()});
                }
            }
        }
        return linearLayout;
    }
}

