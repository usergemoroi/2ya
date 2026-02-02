/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.LinearLayout
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.Nullable
 *  com.google.gson.Gson
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.Attachment;
import io.intercom.android.sdk.blocks.Button;
import io.intercom.android.sdk.blocks.ButtonClickListener;
import io.intercom.android.sdk.blocks.Code;
import io.intercom.android.sdk.blocks.ConversationRatingCard;
import io.intercom.android.sdk.blocks.Heading;
import io.intercom.android.sdk.blocks.ImageClickListener;
import io.intercom.android.sdk.blocks.ImageText;
import io.intercom.android.sdk.blocks.LinkCard;
import io.intercom.android.sdk.blocks.LinkListRenderer;
import io.intercom.android.sdk.blocks.ListBlock;
import io.intercom.android.sdk.blocks.LocalImage;
import io.intercom.android.sdk.blocks.NetworkImage;
import io.intercom.android.sdk.blocks.Paragraph;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.VideoFile;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.messengercard.MessengerCard;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;

public class ViewHolderGenerator {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    @Nullable
    private final ButtonClickListener buttonClickListener;
    private final String conversationId;
    private final Gson gson;
    @Nullable
    private final ImageClickListener imageListener;
    private final MetricTracker metricTracker;
    private final UploadingImageCache uploadingImageCache;

    public ViewHolderGenerator(UploadingImageCache uploadingImageCache, Api api, Provider<AppConfig> provider, String string2, @Nullable ImageClickListener imageClickListener, @Nullable ButtonClickListener buttonClickListener, Gson gson, MetricTracker metricTracker) {
        this.uploadingImageCache = uploadingImageCache;
        this.api = api;
        this.appConfigProvider = provider;
        this.conversationId = string2;
        this.imageListener = imageClickListener;
        this.buttonClickListener = buttonClickListener;
        this.gson = gson;
        this.metricTracker = metricTracker;
    }

    public static LinearLayout createLayoutFromBlocks(BlocksViewHolder blocksViewHolder, List<Block> list, Context context) {
        return new Blocks(context, LumberMill.getBlocksTwig()).createBlocks(list, blocksViewHolder);
    }

    /*
     * WARNING - void declaration
     */
    public static LinearLayout createPartsLayout(BlocksViewHolder blocksViewHolder, Part object2, Context context) {
        void var2_4;
        List<Block> list = ((Part)object2).getBlocks();
        if (!((Part)object2).getAttachments().isEmpty()) {
            ArrayList<BlockAttachment> arrayList = new ArrayList<BlockAttachment>();
            for (Attachments attachments : ((Part)object2).getAttachments()) {
                arrayList.add(new BlockAttachment.Builder().withName(attachments.getName()).withUrl(attachments.getUrl()).build());
            }
            list.add(new Block.Builder().withType(BlockType.ATTACHMENTLIST.name()).withAttachments(arrayList).build());
        }
        return new Blocks((Context)var2_4, LumberMill.getBlocksTwig()).createBlocks(list, blocksViewHolder);
    }

    private BlocksViewHolder generateHolder(@LayoutRes int n10, StyleType styleType) {
        BlocksViewHolder blocksViewHolder = new BlocksViewHolder();
        Button button = new Button(styleType, this.appConfigProvider, this.buttonClickListener);
        Heading heading = new Heading(styleType, this.appConfigProvider);
        ListBlock listBlock = new ListBlock(styleType, this.appConfigProvider);
        Attachment attachment = new Attachment(styleType, this.appConfigProvider);
        blocksViewHolder.setLayout(n10);
        blocksViewHolder.setParagraph(new Paragraph(styleType, this.appConfigProvider));
        blocksViewHolder.setHeading(heading);
        blocksViewHolder.setSubheading(heading);
        blocksViewHolder.setCode(new Code());
        blocksViewHolder.setUnorderedList(listBlock);
        blocksViewHolder.setOrderedList(listBlock);
        blocksViewHolder.setImage(new NetworkImage(styleType, this.uploadingImageCache, this.imageListener));
        blocksViewHolder.setLocalImage(new LocalImage(styleType));
        blocksViewHolder.setButton(button);
        blocksViewHolder.setAttachmentList(attachment);
        blocksViewHolder.setLocalAttachment(attachment);
        blocksViewHolder.setTwitterButton(button);
        blocksViewHolder.setFacebookButton(button);
        blocksViewHolder.setVideo(new Video(styleType, this.api, this.appConfigProvider));
        blocksViewHolder.setVideoFile(new VideoFile(styleType, this.appConfigProvider, this.metricTracker));
        blocksViewHolder.setLink(new LinkCard(styleType, this.appConfigProvider, this.conversationId));
        blocksViewHolder.setConversationRating(new ConversationRatingCard(this.api, this.conversationId, this.appConfigProvider));
        blocksViewHolder.setLinkList(new LinkListRenderer(this.api, this.appConfigProvider, this.conversationId));
        blocksViewHolder.setImageText(new ImageText(styleType, this.uploadingImageCache));
        if (!((Object)((Object)styleType)).equals((Object)StyleType.CHAT_FULL)) {
            blocksViewHolder.setMessengerCardBlock(new MessengerCard(this.appConfigProvider, this.gson, this.metricTracker, this.conversationId));
        }
        return blocksViewHolder;
    }

    public BlocksViewHolder getAdminHolder() {
        return this.generateHolder(R.layout.intercom_blocks_admin_layout, StyleType.ADMIN);
    }

    public BlocksViewHolder getArticleHolder() {
        return this.generateHolder(R.layout.intercom_blocks_article_layout, StyleType.ARTICLE);
    }

    public BlocksViewHolder getCarouselHolder() {
        return this.generateHolder(R.layout.intercom_blocks_carousel_layout, StyleType.CAROUSEL);
    }

    public BlocksViewHolder getChatFullHolder() {
        return this.generateHolder(R.layout.intercom_blocks_admin_layout, StyleType.CHAT_FULL);
    }

    public BlocksViewHolder getContainerCardHolder() {
        return this.generateHolder(R.layout.intercom_blocks_container_card_layout, StyleType.CONTAINER_CARD);
    }

    public BlocksViewHolder getConversationRatingHolder() {
        return this.generateHolder(R.layout.intercom_blocks_container_layout, StyleType.CHAT_FULL);
    }

    public BlocksViewHolder getLinkHolder() {
        return this.generateHolder(R.layout.intercom_blocks_container_layout, StyleType.CHAT_FULL);
    }

    public BlocksViewHolder getLinkListHolder() {
        return this.generateHolder(R.layout.intercom_blocks_container_card_layout, StyleType.CHAT_FULL);
    }

    public BlocksViewHolder getNoteHolder() {
        return this.generateHolder(R.layout.intercom_blocks_note_layout, StyleType.NOTE);
    }

    public BlocksViewHolder getPostHolder() {
        return this.generateHolder(R.layout.intercom_blocks_container_layout, StyleType.POST);
    }

    public BlocksViewHolder getPreviewHolder() {
        return this.generateHolder(R.layout.intercom_blocks_user_layout, StyleType.PREVIEW);
    }

    public BlocksViewHolder getUserHolder() {
        return this.generateHolder(R.layout.intercom_blocks_user_layout, StyleType.USER);
    }
}

