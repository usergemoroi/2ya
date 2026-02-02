/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.lib;

import io.intercom.android.sdk.blocks.lib.interfaces.AttachmentListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.ButtonBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.CodeBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.FacebookBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.HeadingBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.ImageTextBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.LinkBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.LinkListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalAttachmentBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.MessengerCardBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.OrderedListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.ParagraphBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.SubheadingBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.TwitterBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.UnorderedListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoFileBlock;

public class BlocksViewHolder {
    private AttachmentListBlock attachmentList;
    private ButtonBlock button;
    private CodeBlock code;
    private ConversationRatingBlock conversationRating;
    private FacebookBlock facebookButton;
    private HeadingBlock heading;
    private ImageBlock image;
    private ImageTextBlock imageText;
    private int layout;
    private LinkBlock link;
    private LinkListBlock linkList;
    private LocalAttachmentBlock localAttachment;
    private LocalImageBlock localImage;
    private MessengerCardBlock messengerCardBlock;
    private OrderedListBlock orderedList;
    private ParagraphBlock paragraph;
    private SubheadingBlock subheading;
    private TwitterBlock twitterButton;
    private UnorderedListBlock unorderedList;
    private VideoBlock video;
    private VideoFileBlock videoFile;

    public AttachmentListBlock getAttachmentList() {
        return this.attachmentList;
    }

    public ButtonBlock getButton() {
        return this.button;
    }

    public CodeBlock getCode() {
        return this.code;
    }

    public ConversationRatingBlock getConversationRating() {
        return this.conversationRating;
    }

    public FacebookBlock getFacebookButton() {
        return this.facebookButton;
    }

    public HeadingBlock getHeading() {
        return this.heading;
    }

    public ImageBlock getImage() {
        return this.image;
    }

    public ImageTextBlock getImageText() {
        return this.imageText;
    }

    public int getLayout() {
        return this.layout;
    }

    public LinkBlock getLink() {
        return this.link;
    }

    public LinkListBlock getLinkList() {
        return this.linkList;
    }

    public LocalAttachmentBlock getLocalAttachment() {
        return this.localAttachment;
    }

    public LocalImageBlock getLocalImage() {
        return this.localImage;
    }

    public MessengerCardBlock getMessengerCardBlock() {
        return this.messengerCardBlock;
    }

    public OrderedListBlock getOrderedList() {
        return this.orderedList;
    }

    public ParagraphBlock getParagraph() {
        return this.paragraph;
    }

    public SubheadingBlock getSubheading() {
        return this.subheading;
    }

    public TwitterBlock getTwitterButton() {
        return this.twitterButton;
    }

    public UnorderedListBlock getUnorderedList() {
        return this.unorderedList;
    }

    public VideoBlock getVideo() {
        return this.video;
    }

    public VideoFileBlock getVideoFile() {
        return this.videoFile;
    }

    public void setAttachmentList(AttachmentListBlock attachmentListBlock) {
        this.attachmentList = attachmentListBlock;
    }

    public void setButton(ButtonBlock buttonBlock) {
        this.button = buttonBlock;
    }

    public void setCode(CodeBlock codeBlock) {
        this.code = codeBlock;
    }

    public void setConversationRating(ConversationRatingBlock conversationRatingBlock) {
        this.conversationRating = conversationRatingBlock;
    }

    public void setFacebookButton(FacebookBlock facebookBlock) {
        this.facebookButton = facebookBlock;
    }

    public void setHeading(HeadingBlock headingBlock) {
        this.heading = headingBlock;
    }

    public void setImage(ImageBlock imageBlock) {
        this.image = imageBlock;
    }

    public void setImageText(ImageTextBlock imageTextBlock) {
        this.imageText = imageTextBlock;
    }

    public void setLayout(int n10) {
        this.layout = n10;
    }

    public void setLink(LinkBlock linkBlock) {
        this.link = linkBlock;
    }

    public void setLinkList(LinkListBlock linkListBlock) {
        this.linkList = linkListBlock;
    }

    public void setLocalAttachment(LocalAttachmentBlock localAttachmentBlock) {
        this.localAttachment = localAttachmentBlock;
    }

    public void setLocalImage(LocalImageBlock localImageBlock) {
        this.localImage = localImageBlock;
    }

    public void setMessengerCardBlock(MessengerCardBlock messengerCardBlock) {
        this.messengerCardBlock = messengerCardBlock;
    }

    public void setOrderedList(OrderedListBlock orderedListBlock) {
        this.orderedList = orderedListBlock;
    }

    public void setParagraph(ParagraphBlock paragraphBlock) {
        this.paragraph = paragraphBlock;
    }

    public void setSubheading(SubheadingBlock subheadingBlock) {
        this.subheading = subheadingBlock;
    }

    public void setTwitterButton(TwitterBlock twitterBlock) {
        this.twitterButton = twitterBlock;
    }

    public void setUnorderedList(UnorderedListBlock unorderedListBlock) {
        this.unorderedList = unorderedListBlock;
    }

    public void setVideo(VideoBlock videoBlock) {
        this.video = videoBlock;
    }

    public void setVideoFile(VideoFileBlock videoFileBlock) {
        this.videoFile = videoFileBlock;
    }
}

