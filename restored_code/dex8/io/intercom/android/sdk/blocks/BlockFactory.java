/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import java.util.ArrayList;
import java.util.List;

public class BlockFactory {
    private final TextSplittingStrategy textSplittingStrategy;

    public BlockFactory(TextSplittingStrategy textSplittingStrategy) {
        this.textSplittingStrategy = textSplittingStrategy;
    }

    public List<Block.Builder> getBlocksForText(String object) {
        object = this.textSplittingStrategy.apply((String)object);
        int n10 = object.size();
        ArrayList<Block.Builder> arrayList = new ArrayList<Block.Builder>(n10);
        for (int i14 = 0; i14 < n10; ++i14) {
            arrayList.add(new Block.Builder().withType(BlockType.PARAGRAPH.name().toLowerCase()).withText((String)object.get(i14)));
        }
        return arrayList;
    }
}

