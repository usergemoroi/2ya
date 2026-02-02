/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package io.intercom.android.sdk.blocks.lib;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.BlockTypeNotImplementedException;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.TwitterBlock;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.lib.models.LinkList;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import java.util.Locale;

public enum BlockType {
    PARAGRAPH("paragraph"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getParagraph().addParagraph(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    HEADING("heading"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getHeading().addHeading(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    SUBHEADING("subheading"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getSubheading().addSubheading(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    CODE("code"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getCode().addCode(HtmlCompat.fromHtml(block.getText()), blockMetadata, viewGroup);
        }
    }
    ,
    LINK("link"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLink().addLinkBlock(Link.fromBlock(block), blockMetadata, viewGroup);
        }
    }
    ,
    CONVERSATIONRATING("conversationRating"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getConversationRating().addConversationRatingBlock(ConversationRating.fromBlock(block), blockMetadata, viewGroup);
        }
    }
    ,
    LINKLIST("linkList"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLinkList().addLinkListBlock(LinkList.fromBlock(block), blockMetadata, viewGroup);
        }
    }
    ,
    UNORDEREDLIST("unorderedList"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getUnorderedList().addUnorderedList(block.getItems(), blockMetadata, viewGroup);
        }
    }
    ,
    ORDEREDLIST("orderedList"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getOrderedList().addOrderedList(block.getItems(), blockMetadata, viewGroup);
        }
    }
    ,
    ATTACHMENTLIST("attachmentList"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getAttachmentList().addAttachmentList(block.getAttachments(), blockMetadata, viewGroup);
        }
    }
    ,
    IMAGE("image"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getImage().addImage(block.getUrl(), BlockType.getLinkUrl(block), block.getDescription(), block.getWidth(), block.getHeight(), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    IMAGETEXT("imageText"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            block.getImage();
            return blocksViewHolder.getImageText().addImageText(HtmlCompat.fromHtml(block.getTitle()), HtmlCompat.fromHtml(block.getText()), block.getImageUrl(), block.getDescription(), block.getImageWidth(), block.getImageHeight(), blockMetadata, viewGroup);
        }
    }
    ,
    BUTTON("button"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getButton().addButton(HtmlCompat.fromHtml(block.getText()), BlockType.getLinkUrl(block), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    FACEBOOKLIKEBUTTON("facebookLikeButton"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getFacebookButton().addFacebookButton(block.getUrl(), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    TWITTERFOLLOWBUTTON("twitterFollowButton"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder object, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            TwitterBlock twitterBlock = ((BlocksViewHolder)object).getTwitterButton();
            object = new StringBuilder();
            ((StringBuilder)object).append("https://twitter.com/");
            ((StringBuilder)object).append(block.getUsername());
            return twitterBlock.addTwitterButton(((StringBuilder)object).toString(), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    VIDEO("video"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getVideo().addVideo(block.getText(), VideoProvider.videoValueOf(block.getProvider()), block.getId(), blockMetadata, viewGroup);
        }
    }
    ,
    VIDEOFILE("videoFile"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getVideoFile().addVideoFile(block.getText(), block.getUrl(), block.getThumbnailUrl(), blockMetadata, viewGroup);
        }
    }
    ,
    MESSENGERCARD("messengerCard"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getMessengerCardBlock().addCard(block.getText(), block.getFallbackUrl(), blockMetadata, viewGroup);
        }
    }
    ,
    LOCALIMAGE("localImage"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLocalImage().addImage(block.getUri(), block.getWidth(), block.getHeight(), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    LOCAL_ATTACHMENT("local_attachment"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLocalAttachment().addAttachment(block.getAttachments().get(0), blockMetadata, viewGroup);
        }
    }
    ,
    CREATETICKETCARD("createTicketCard"){

        @Override
        View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getParagraph().addParagraph(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }
    ,
    UNKNOWN("unknown"){

        @Override
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            if (!block.getText().isEmpty() && blocksViewHolder.getParagraph() != null) {
                return PARAGRAPH.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
            }
            throw new BlockTypeNotImplementedException();
        }
    };

    private final String serializedName;

    private BlockType(String string3) {
        this.serializedName = string3;
    }

    protected static String getLinkUrl(Block object) {
        object = ((Block)object).getTrackingUrl().isEmpty() ? ((Block)object).getLinkUrl() : ((Block)object).getTrackingUrl();
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static BlockType typeValueOf(String object) {
        void var0_2;
        BlockType blockType = UNKNOWN;
        try {
            BlockType blockType2 = BlockType.valueOf(((String)object).toUpperCase(Locale.ENGLISH));
            return var0_2;
        }
        catch (IllegalArgumentException | NullPointerException runtimeException) {
            BlockType blockType3 = blockType;
            return var0_2;
        }
    }

    abstract View generateViewFromBlockAndLayout(BlocksViewHolder var1, Block var2, ViewGroup var3, BlockMetadata var4);

    public String getSerializedName() {
        return this.serializedName;
    }

    public View getView(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) throws BlockTypeNotImplementedException {
        try {
            View view = this.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
            return view;
        }
        catch (NullPointerException nullPointerException) {
            try {
                blocksViewHolder = UNKNOWN.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
                return blocksViewHolder;
            }
            catch (BlockTypeNotImplementedException | NullPointerException runtimeException) {
                throw new BlockTypeNotImplementedException();
            }
        }
    }
}

