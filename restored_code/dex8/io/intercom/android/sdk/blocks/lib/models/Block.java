/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package io.intercom.android.sdk.blocks.lib.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.blocks.lib.models.Image;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Block
implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>(){

        public Block createFromParcel(Parcel parcel) {
            return new Block(parcel);
        }

        public Block[] newArray(int n10) {
            return new Block[n10];
        }
    };
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;
    private final String id;
    private final Image image;
    private final int imageHeight;
    private final String imageUrl;
    private final int imageWidth;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private int ticketTypeId;
    private final TicketType ticket_type;
    private final String ticket_type_title;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final Uri uri;
    private final String url;
    private final String username;
    private final int width;

    Block() {
        this(new Builder());
    }

    protected Block(Parcel parcel) {
        Object object;
        String string2;
        int n10;
        this.attachments = parcel.createTypedArrayList(BlockAttachment.CREATOR);
        this.items = parcel.createStringArrayList();
        int n13 = parcel.readInt();
        this.data = new HashMap<String, String>(n13);
        for (n10 = 0; n10 < n13; ++n10) {
            string2 = parcel.readString();
            object = parcel.readString();
            this.data.put(string2, (String)object);
        }
        n10 = parcel.readInt();
        string2 = null;
        object = n10 == -1 ? null : BlockType.values()[n10];
        this.type = object;
        n10 = parcel.readInt();
        object = n10 == -1 ? string2 : BlockAlignment.values()[n10];
        this.align = object;
        this.author = (Author)parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image)parcel.readParcelable(Image.class.getClassLoader());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.language = parcel.readString();
        this.url = parcel.readString();
        this.thumbnailUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.fallbackUrl = parcel.readString();
        this.username = parcel.readString();
        this.provider = parcel.readString();
        this.previewUrl = parcel.readString();
        this.attribution = parcel.readString();
        this.id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        object = new ArrayList();
        this.options = object;
        parcel.readList((List)object, ConversationRatingOption.class.getClassLoader());
        object = new ArrayList();
        this.links = object;
        parcel.readList((List)object, Link.class.getClassLoader());
        this.footerLink = (Link)parcel.readParcelable(Link.class.getClassLoader());
        this.uri = (Uri)parcel.readParcelable(Uri.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.imageWidth = parcel.readInt();
        this.imageHeight = parcel.readInt();
        this.ticket_type_title = parcel.readString();
        this.ticket_type = (TicketType)parcel.readParcelable(TicketType.class.getClassLoader());
    }

    private Block(Builder builder) {
        this.type = BlockType.typeValueOf(builder.type);
        Object object = builder.text;
        Object object2 = "";
        Object object3 = object;
        if (object == null) {
            object3 = "";
        }
        this.text = object3;
        object3 = object = builder.title;
        if (object == null) {
            object3 = "";
        }
        this.title = object3;
        object3 = object = builder.description;
        if (object == null) {
            object3 = "";
        }
        this.description = object3;
        object3 = object = builder.linkType;
        if (object == null) {
            object3 = "";
        }
        this.linkType = object3;
        object3 = object = builder.siteName;
        if (object == null) {
            object3 = "";
        }
        this.siteName = object3;
        object3 = object = builder.articleId;
        if (object == null) {
            object3 = "";
        }
        this.articleId = object3;
        object3 = object = builder.author;
        if (object == null) {
            object3 = new Author();
        }
        this.author = object3;
        object3 = object = builder.image;
        if (object == null) {
            object3 = new Image();
        }
        this.image = object3;
        object3 = object = builder.data;
        if (object == null) {
            object3 = Collections.emptyMap();
        }
        this.data = object3;
        object3 = object = builder.language;
        if (object == null) {
            object3 = "";
        }
        this.language = object3;
        object3 = object = builder.url;
        if (object == null) {
            object3 = "";
        }
        this.url = object3;
        object3 = object = builder.thumbnailUrl;
        if (object == null) {
            object3 = "";
        }
        this.thumbnailUrl = object3;
        object3 = object = builder.linkUrl;
        if (object == null) {
            object3 = "";
        }
        this.linkUrl = object3;
        object3 = object = builder.trackingUrl;
        if (object == null) {
            object3 = "";
        }
        this.trackingUrl = object3;
        object3 = object = builder.fallbackUrl;
        if (object == null) {
            object3 = "";
        }
        this.fallbackUrl = object3;
        object3 = object = builder.username;
        if (object == null) {
            object3 = "";
        }
        this.username = object3;
        object3 = object = builder.provider;
        if (object == null) {
            object3 = "";
        }
        this.provider = object3;
        object3 = object = builder.id;
        if (object == null) {
            object3 = "";
        }
        this.id = object3;
        this.align = BlockAlignment.alignValueOf(builder.align);
        object3 = builder.width;
        int n10 = 0;
        int n13 = object3 == null ? 0 : (Integer)object3;
        this.width = n13;
        object3 = builder.height;
        n13 = object3 == null ? 0 : (Integer)object3;
        this.height = n13;
        object3 = object = builder.previewUrl;
        if (object == null) {
            object3 = "";
        }
        this.previewUrl = object3;
        object3 = object = builder.attribution;
        if (object == null) {
            object3 = "";
        }
        this.attribution = object3;
        object3 = object = builder.uri;
        if (object == null) {
            object3 = Uri.EMPTY;
        }
        this.uri = object3;
        object3 = object = builder.imageUrl;
        if (object == null) {
            object3 = "";
        }
        this.imageUrl = object3;
        object3 = builder.imageWidth;
        n13 = object3 == null ? 0 : (Integer)object3;
        this.imageWidth = n13;
        object3 = builder.imageHeight;
        n13 = object3 == null ? n10 : (Integer)object3;
        this.imageHeight = n13;
        this.attachments = new ArrayList<BlockAttachment>();
        object3 = builder.attachments;
        if (object3 != null) {
            object3 = object3.iterator();
            while (object3.hasNext()) {
                object = (BlockAttachment)object3.next();
                if (object == null) continue;
                this.attachments.add((BlockAttachment)object);
            }
        }
        this.items = new ArrayList<String>();
        object3 = builder.items;
        if (object3 != null) {
            object3 = object3.iterator();
            while (object3.hasNext()) {
                object = (String)object3.next();
                if (object == null) continue;
                this.items.add((String)object);
            }
        }
        this.ratingIndex = (object3 = builder.ratingIndex) != null ? (Integer)object3 : ((object3 = builder.rating_index) != null ? (Integer)object3 : -1);
        object3 = object = builder.remark;
        if (object == null) {
            object3 = "";
        }
        this.remark = object3;
        this.options = new ArrayList<ConversationRatingOption>();
        object3 = builder.options;
        if (object3 != null) {
            object = object3.iterator();
            while (object.hasNext()) {
                object3 = object.next();
                if (object3 == null) continue;
                this.options.add(((ConversationRatingOption.Builder)object3).build());
            }
        }
        this.links = new ArrayList<Link>();
        object3 = builder.links;
        if (object3 != null) {
            object3 = object3.iterator();
            while (object3.hasNext()) {
                object = (Builder)object3.next();
                if (object == null) continue;
                this.links.add(Link.fromBlock(((Builder)object).build()));
            }
        }
        object3 = (object3 = builder.footerLink) == null ? new Link() : Link.fromBlock(((Builder)object3).build());
        this.footerLink = object3;
        object3 = builder.ticket_type_title;
        if (object3 == null) {
            object3 = object2;
        }
        this.ticket_type_title = object3;
        object3 = object2 = builder.ticket_type;
        if (object2 == null) {
            object3 = TicketType.Companion.getNULL();
        }
        this.ticket_type = object3;
        this.ticketTypeId = builder.ticket_type_id;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (Block)object;
            if (this.width != ((Block)object).width) {
                return false;
            }
            if (this.height != ((Block)object).height) {
                return false;
            }
            if (this.ratingIndex != ((Block)object).ratingIndex) {
                return false;
            }
            Object object2 = this.attachments;
            if (object2 != null ? !object2.equals(((Block)object).attachments) : ((Block)object).attachments != null) {
                return false;
            }
            object2 = this.items;
            if (object2 != null ? !object2.equals(((Block)object).items) : ((Block)object).items != null) {
                return false;
            }
            object2 = this.data;
            if (object2 != null ? !object2.equals(((Block)object).data) : ((Block)object).data != null) {
                return false;
            }
            if (this.type != ((Block)object).type) {
                return false;
            }
            if (this.align != ((Block)object).align) {
                return false;
            }
            object2 = this.author;
            if (object2 != null ? !((Author)object2).equals(((Block)object).author) : ((Block)object).author != null) {
                return false;
            }
            object2 = this.image;
            if (object2 != null ? !((Image)object2).equals(((Block)object).image) : ((Block)object).image != null) {
                return false;
            }
            object2 = this.text;
            if (object2 != null ? !((String)object2).equals(((Block)object).text) : ((Block)object).text != null) {
                return false;
            }
            object2 = this.title;
            if (object2 != null ? !((String)object2).equals(((Block)object).title) : ((Block)object).title != null) {
                return false;
            }
            object2 = this.description;
            if (object2 != null ? !((String)object2).equals(((Block)object).description) : ((Block)object).description != null) {
                return false;
            }
            object2 = this.linkType;
            if (object2 != null ? !((String)object2).equals(((Block)object).linkType) : ((Block)object).linkType != null) {
                return false;
            }
            object2 = this.siteName;
            if (object2 != null ? !((String)object2).equals(((Block)object).siteName) : ((Block)object).siteName != null) {
                return false;
            }
            object2 = this.articleId;
            if (object2 != null ? !((String)object2).equals(((Block)object).articleId) : ((Block)object).articleId != null) {
                return false;
            }
            object2 = this.language;
            if (object2 != null ? !((String)object2).equals(((Block)object).language) : ((Block)object).language != null) {
                return false;
            }
            object2 = this.url;
            if (object2 != null ? !((String)object2).equals(((Block)object).url) : ((Block)object).url != null) {
                return false;
            }
            object2 = this.thumbnailUrl;
            if (object2 != null ? !((String)object2).equals(((Block)object).thumbnailUrl) : ((Block)object).thumbnailUrl != null) {
                return false;
            }
            object2 = this.previewUrl;
            if (object2 != null ? !((String)object2).equals(((Block)object).previewUrl) : ((Block)object).previewUrl != null) {
                return false;
            }
            object2 = this.attribution;
            if (object2 != null ? !((String)object2).equals(((Block)object).attribution) : ((Block)object).attribution != null) {
                return false;
            }
            object2 = this.linkUrl;
            if (object2 != null ? !((String)object2).equals(((Block)object).linkUrl) : ((Block)object).linkUrl != null) {
                return false;
            }
            object2 = this.trackingUrl;
            if (object2 != null ? !((String)object2).equals(((Block)object).trackingUrl) : ((Block)object).trackingUrl != null) {
                return false;
            }
            object2 = this.fallbackUrl;
            if (object2 != null ? !((String)object2).equals(((Block)object).fallbackUrl) : ((Block)object).fallbackUrl != null) {
                return false;
            }
            object2 = this.username;
            if (object2 != null ? !((String)object2).equals(((Block)object).username) : ((Block)object).username != null) {
                return false;
            }
            object2 = this.provider;
            if (object2 != null ? !((String)object2).equals(((Block)object).provider) : ((Block)object).provider != null) {
                return false;
            }
            object2 = this.id;
            if (object2 != null ? !((String)object2).equals(((Block)object).id) : ((Block)object).id != null) {
                return false;
            }
            object2 = this.remark;
            if (object2 != null ? !((String)object2).equals(((Block)object).remark) : ((Block)object).remark != null) {
                return false;
            }
            object2 = this.options;
            if (object2 != null ? !object2.equals(((Block)object).options) : ((Block)object).options != null) {
                return false;
            }
            object2 = this.links;
            if (object2 != null ? !object2.equals(((Block)object).links) : ((Block)object).links != null) {
                return false;
            }
            object2 = this.uri;
            if (object2 != null ? !object2.equals((Object)((Block)object).uri) : ((Block)object).uri != null) {
                return false;
            }
            object2 = this.imageUrl;
            if (object2 != null ? !((String)object2).equals(((Block)object).imageUrl) : ((Block)object).imageUrl != null) {
                return false;
            }
            if (this.imageWidth != ((Block)object).imageWidth) {
                return false;
            }
            if (this.imageHeight != ((Block)object).imageHeight) {
                return false;
            }
            object2 = this.ticket_type_title;
            if (object2 != null ? !((String)object2).equals(((Block)object).ticket_type_title) : ((Block)object).ticket_type_title != null) {
                return false;
            }
            object2 = this.ticket_type;
            if (object2 != null ? !((TicketType)object2).equals(((Block)object).ticket_type) : ((Block)object).ticket_type != null) {
                return false;
            }
            object2 = this.footerLink;
            object = ((Block)object).footerLink;
            if (object2 != null) {
                bl2 = ((Link)object2).equals(object);
            } else if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public BlockAlignment getAlign() {
        return this.align;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public List<BlockAttachment> getAttachments() {
        return this.attachments;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public Image getImage() {
        return this.image;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public TicketType getTicketType() {
        return this.ticket_type;
    }

    public int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public String getTicketTypeTitle() {
        return this.ticket_type_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public BlockType getType() {
        return this.type;
    }

    public Uri getUri() {
        return this.uri;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        Object object = this.attachments;
        int n10 = 0;
        int n13 = object != null ? object.hashCode() : 0;
        object = this.items;
        int n14 = object != null ? object.hashCode() : 0;
        object = this.data;
        int n15 = object != null ? object.hashCode() : 0;
        object = this.type;
        int n16 = object != null ? object.hashCode() : 0;
        object = this.align;
        int n17 = object != null ? object.hashCode() : 0;
        object = this.author;
        int n18 = object != null ? ((Author)object).hashCode() : 0;
        object = this.image;
        int n19 = object != null ? ((Image)object).hashCode() : 0;
        object = this.text;
        int n23 = object != null ? ((String)object).hashCode() : 0;
        object = this.title;
        int n24 = object != null ? ((String)object).hashCode() : 0;
        object = this.description;
        int n25 = object != null ? ((String)object).hashCode() : 0;
        object = this.linkType;
        int n26 = object != null ? ((String)object).hashCode() : 0;
        object = this.siteName;
        int n27 = object != null ? ((String)object).hashCode() : 0;
        object = this.articleId;
        int n28 = object != null ? ((String)object).hashCode() : 0;
        object = this.language;
        int n29 = object != null ? ((String)object).hashCode() : 0;
        object = this.url;
        int n33 = object != null ? ((String)object).hashCode() : 0;
        object = this.thumbnailUrl;
        int n34 = object != null ? ((String)object).hashCode() : 0;
        object = this.previewUrl;
        int n35 = object != null ? ((String)object).hashCode() : 0;
        object = this.attribution;
        int n36 = object != null ? ((String)object).hashCode() : 0;
        object = this.linkUrl;
        int n37 = object != null ? ((String)object).hashCode() : 0;
        object = this.trackingUrl;
        int n38 = object != null ? ((String)object).hashCode() : 0;
        object = this.fallbackUrl;
        int n39 = object != null ? ((String)object).hashCode() : 0;
        object = this.username;
        int n42 = object != null ? ((String)object).hashCode() : 0;
        object = this.provider;
        int n44 = object != null ? ((String)object).hashCode() : 0;
        object = this.id;
        int n45 = object != null ? ((String)object).hashCode() : 0;
        int n46 = this.width;
        int n47 = this.height;
        int n48 = this.ratingIndex;
        object = this.remark;
        int n49 = object != null ? ((String)object).hashCode() : 0;
        object = this.options;
        int n54 = object != null ? object.hashCode() : 0;
        object = this.links;
        int n55 = object != null ? object.hashCode() : 0;
        object = this.footerLink;
        int n56 = object != null ? ((Link)object).hashCode() : 0;
        object = this.uri;
        int n57 = object != null ? object.hashCode() : 0;
        object = this.imageUrl;
        int n58 = object != null ? ((String)object).hashCode() : 0;
        int n59 = this.imageWidth;
        int n63 = this.imageHeight;
        object = this.ticket_type_title;
        int n64 = object != null ? ((String)object).hashCode() : 0;
        object = this.ticket_type;
        if (object != null) {
            n10 = ((TicketType)object).hashCode();
        }
        return (((((((((((((((((((((((((((((((((((n13 * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n26) * 31 + n27) * 31 + n28) * 31 + n29) * 31 + n33) * 31 + n34) * 31 + n35) * 31 + n36) * 31 + n37) * 31 + n38) * 31 + n39) * 31 + n42) * 31 + n44) * 31 + n45) * 31 + n46) * 31 + n47) * 31 + n48) * 31 + n49) * 31 + n54) * 31 + n55) * 31 + n56) * 31 + n57) * 31 + n58) * 31 + n59) * 31 + n63) * 31 + n64) * 31 + n10;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        int n10 = 2.$SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[this.type.ordinal()];
        if (n10 != 1) {
            if (n10 != 2 && n10 != 3) {
                if (n10 == 4) {
                    builder.withType(this.type.getSerializedName()).withAttachments(this.attachments);
                }
            } else {
                Builder builder2 = builder.withType(this.type.getSerializedName()).withUrl(this.url).withUri(this.uri);
                boolean bl2 = this.attribution.isEmpty();
                Object var4_5 = null;
                String string2 = bl2 ? null : this.attribution;
                builder2 = builder2.withAttribution(string2);
                string2 = this.previewUrl.isEmpty() ? var4_5 : this.previewUrl;
                builder2.withPreviewUrl(string2).withHeight(this.height).withWidth(this.width);
            }
        } else {
            builder.withText(this.text).withType(this.type.getSerializedName());
        }
        return builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Block{attachments=");
        stringBuilder.append(this.attachments);
        stringBuilder.append(", items=");
        stringBuilder.append(this.items);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", type=");
        stringBuilder.append((Object)this.type);
        stringBuilder.append(", align=");
        stringBuilder.append((Object)this.align);
        stringBuilder.append(", author=");
        stringBuilder.append(this.author);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", text='");
        stringBuilder.append(this.text);
        stringBuilder.append('\'');
        stringBuilder.append(", title='");
        stringBuilder.append(this.title);
        stringBuilder.append('\'');
        stringBuilder.append(", description='");
        stringBuilder.append(this.description);
        stringBuilder.append('\'');
        stringBuilder.append(", linkType='");
        stringBuilder.append(this.linkType);
        stringBuilder.append('\'');
        stringBuilder.append(", siteName='");
        stringBuilder.append(this.siteName);
        stringBuilder.append('\'');
        stringBuilder.append(", articleId='");
        stringBuilder.append(this.articleId);
        stringBuilder.append('\'');
        stringBuilder.append(", language='");
        stringBuilder.append(this.language);
        stringBuilder.append('\'');
        stringBuilder.append(", url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append(", thumbnailUrl='");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", previewUrl='");
        stringBuilder.append(this.previewUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", attribution='");
        stringBuilder.append(this.attribution);
        stringBuilder.append('\'');
        stringBuilder.append(", linkUrl='");
        stringBuilder.append(this.linkUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", trackingUrl='");
        stringBuilder.append(this.trackingUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", fallbackUrl='");
        stringBuilder.append(this.fallbackUrl);
        stringBuilder.append('\'');
        stringBuilder.append(", username='");
        stringBuilder.append(this.username);
        stringBuilder.append('\'');
        stringBuilder.append(", provider='");
        stringBuilder.append(this.provider);
        stringBuilder.append('\'');
        stringBuilder.append(", id='");
        stringBuilder.append(this.id);
        stringBuilder.append('\'');
        stringBuilder.append(", width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(", ratingIndex=");
        stringBuilder.append(this.ratingIndex);
        stringBuilder.append(", remark='");
        stringBuilder.append(this.remark);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(this.options);
        stringBuilder.append(", links=");
        stringBuilder.append(this.links);
        stringBuilder.append(", footerLink=");
        stringBuilder.append(this.footerLink);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.imageUrl);
        stringBuilder.append(", imageWidth=");
        stringBuilder.append(this.imageWidth);
        stringBuilder.append(", imageHeight=");
        stringBuilder.append(this.imageHeight);
        stringBuilder.append(", ticket_type_title=");
        stringBuilder.append(this.ticket_type_title);
        stringBuilder.append(", ticket_type=");
        stringBuilder.append(this.ticket_type);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeTypedList(this.attachments);
        parcel.writeStringList(this.items);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> object2 : this.data.entrySet()) {
            parcel.writeString(object2.getKey());
            parcel.writeString(object2.getValue());
        }
        BlockType blockType = this.type;
        int n13 = -1;
        int n14 = blockType == null ? -1 : blockType.ordinal();
        parcel.writeInt(n14);
        BlockAlignment blockAlignment = this.align;
        n14 = blockAlignment == null ? n13 : blockAlignment.ordinal();
        parcel.writeInt(n14);
        parcel.writeParcelable((Parcelable)this.author, n10);
        parcel.writeParcelable((Parcelable)this.image, n10);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.language);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.provider);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.attribution);
        parcel.writeString(this.id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeTypedList(this.options);
        parcel.writeTypedList(this.links);
        parcel.writeParcelable((Parcelable)this.footerLink, n10);
        parcel.writeParcelable((Parcelable)this.uri, n10);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.ticket_type_title);
        parcel.writeParcelable((Parcelable)this.ticket_type, n10);
    }

    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        Map<String, String> data;
        String description;
        String fallbackUrl;
        Builder footerLink;
        Integer height;
        String id;
        Image image;
        Integer imageHeight;
        String imageUrl;
        Integer imageWidth;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        List<ConversationRatingOption.Builder> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        TicketType ticket_type;
        int ticket_type_id;
        String ticket_type_title;
        String title;
        String trackingUrl;
        String type;
        Uri uri;
        String url;
        String username;
        Integer width;

        public Block build() {
            return new Block(this);
        }

        public boolean equals(Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (object != null && Builder.class == object.getClass()) {
                object = (Builder)object;
                Object object2 = this.type;
                if (object2 != null ? !((String)object2).equals(((Builder)object).type) : ((Builder)object).type != null) {
                    return false;
                }
                object2 = this.text;
                if (object2 != null ? !((String)object2).equals(((Builder)object).text) : ((Builder)object).text != null) {
                    return false;
                }
                object2 = this.title;
                if (object2 != null ? !((String)object2).equals(((Builder)object).title) : ((Builder)object).title != null) {
                    return false;
                }
                object2 = this.description;
                if (object2 != null ? !((String)object2).equals(((Builder)object).description) : ((Builder)object).description != null) {
                    return false;
                }
                object2 = this.linkType;
                if (object2 != null ? !((String)object2).equals(((Builder)object).linkType) : ((Builder)object).linkType != null) {
                    return false;
                }
                object2 = this.siteName;
                if (object2 != null ? !((String)object2).equals(((Builder)object).siteName) : ((Builder)object).siteName != null) {
                    return false;
                }
                object2 = this.articleId;
                if (object2 != null ? !((String)object2).equals(((Builder)object).articleId) : ((Builder)object).articleId != null) {
                    return false;
                }
                object2 = this.author;
                if (object2 != null ? !((Author)object2).equals(((Builder)object).author) : ((Builder)object).author != null) {
                    return false;
                }
                object2 = this.image;
                if (object2 != null ? !((Image)object2).equals(((Builder)object).image) : ((Builder)object).image != null) {
                    return false;
                }
                object2 = this.data;
                if (object2 != null ? !object2.equals(((Builder)object).data) : ((Builder)object).data != null) {
                    return false;
                }
                object2 = this.language;
                if (object2 != null ? !((String)object2).equals(((Builder)object).language) : ((Builder)object).language != null) {
                    return false;
                }
                object2 = this.url;
                if (object2 != null ? !((String)object2).equals(((Builder)object).url) : ((Builder)object).url != null) {
                    return false;
                }
                object2 = this.thumbnailUrl;
                if (object2 != null ? !((String)object2).equals(((Builder)object).thumbnailUrl) : ((Builder)object).thumbnailUrl != null) {
                    return false;
                }
                object2 = this.linkUrl;
                if (object2 != null ? !((String)object2).equals(((Builder)object).linkUrl) : ((Builder)object).linkUrl != null) {
                    return false;
                }
                object2 = this.trackingUrl;
                if (object2 != null ? !((String)object2).equals(((Builder)object).trackingUrl) : ((Builder)object).trackingUrl != null) {
                    return false;
                }
                object2 = this.fallbackUrl;
                if (object2 != null ? !((String)object2).equals(((Builder)object).fallbackUrl) : ((Builder)object).fallbackUrl != null) {
                    return false;
                }
                object2 = this.username;
                if (object2 != null ? !((String)object2).equals(((Builder)object).username) : ((Builder)object).username != null) {
                    return false;
                }
                object2 = this.provider;
                if (object2 != null ? !((String)object2).equals(((Builder)object).provider) : ((Builder)object).provider != null) {
                    return false;
                }
                object2 = this.id;
                if (object2 != null ? !((String)object2).equals(((Builder)object).id) : ((Builder)object).id != null) {
                    return false;
                }
                object2 = this.align;
                if (object2 != null ? !((String)object2).equals(((Builder)object).align) : ((Builder)object).align != null) {
                    return false;
                }
                object2 = this.width;
                if (object2 != null ? !((Integer)object2).equals(((Builder)object).width) : ((Builder)object).width != null) {
                    return false;
                }
                object2 = this.height;
                if (object2 != null ? !((Integer)object2).equals(((Builder)object).height) : ((Builder)object).height != null) {
                    return false;
                }
                object2 = this.previewUrl;
                if (object2 != null ? !((String)object2).equals(((Builder)object).previewUrl) : ((Builder)object).previewUrl != null) {
                    return false;
                }
                object2 = this.attribution;
                if (object2 != null ? !((String)object2).equals(((Builder)object).attribution) : ((Builder)object).attribution != null) {
                    return false;
                }
                object2 = this.attachments;
                if (object2 != null ? !object2.equals(((Builder)object).attachments) : ((Builder)object).attachments != null) {
                    return false;
                }
                object2 = this.items;
                if (object2 != null ? !object2.equals(((Builder)object).items) : ((Builder)object).items != null) {
                    return false;
                }
                object2 = this.rating_index;
                if (object2 != null ? !((Integer)object2).equals(((Builder)object).rating_index) : ((Builder)object).rating_index != null) {
                    return false;
                }
                object2 = this.ratingIndex;
                if (object2 != null ? !((Integer)object2).equals(((Builder)object).ratingIndex) : ((Builder)object).ratingIndex != null) {
                    return false;
                }
                object2 = this.remark;
                if (object2 != null ? !((String)object2).equals(((Builder)object).remark) : ((Builder)object).remark != null) {
                    return false;
                }
                object2 = this.options;
                if (object2 != null ? !object2.equals(((Builder)object).options) : ((Builder)object).options != null) {
                    return false;
                }
                object2 = this.links;
                if (object2 != null ? !object2.equals(((Builder)object).links) : ((Builder)object).links != null) {
                    return false;
                }
                object2 = this.imageUrl;
                if (object2 != null ? !((String)object2).equals(((Builder)object).imageUrl) : ((Builder)object).imageUrl != null) {
                    return false;
                }
                object2 = this.imageWidth;
                if (object2 != null ? !((Integer)object2).equals(((Builder)object).imageWidth) : ((Builder)object).imageWidth != null) {
                    return false;
                }
                object2 = this.imageHeight;
                if (object2 != null ? !((Integer)object2).equals(((Builder)object).imageHeight) : ((Builder)object).imageHeight != null) {
                    return false;
                }
                object2 = this.ticket_type_title;
                if (object2 != null ? !((String)object2).equals(((Builder)object).ticket_type_title) : ((Builder)object).ticket_type_title != null) {
                    return false;
                }
                object2 = this.ticket_type;
                if (object2 != null ? !((TicketType)object2).equals(((Builder)object).ticket_type) : ((Builder)object).ticket_type != null) {
                    return false;
                }
                if (!((Object)this.ticket_type_id).equals(((Builder)object).ticket_type_id)) {
                    return false;
                }
                object2 = this.footerLink;
                object = ((Builder)object).footerLink;
                if (object2 != null) {
                    bl2 = ((Builder)object2).equals(object);
                } else if (object != null) {
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public int hashCode() {
            Object object = this.type;
            int n10 = 0;
            int n13 = object != null ? ((String)object).hashCode() : 0;
            object = this.text;
            int n14 = object != null ? ((String)object).hashCode() : 0;
            object = this.title;
            int n15 = object != null ? ((String)object).hashCode() : 0;
            object = this.description;
            int n16 = object != null ? ((String)object).hashCode() : 0;
            object = this.linkType;
            int n17 = object != null ? ((String)object).hashCode() : 0;
            object = this.siteName;
            int n18 = object != null ? ((String)object).hashCode() : 0;
            object = this.articleId;
            int n19 = object != null ? ((String)object).hashCode() : 0;
            object = this.author;
            int n23 = object != null ? ((Author)object).hashCode() : 0;
            object = this.image;
            int n24 = object != null ? ((Image)object).hashCode() : 0;
            object = this.data;
            int n25 = object != null ? object.hashCode() : 0;
            object = this.language;
            int n26 = object != null ? ((String)object).hashCode() : 0;
            object = this.url;
            int n27 = object != null ? ((String)object).hashCode() : 0;
            object = this.thumbnailUrl;
            int n28 = object != null ? ((String)object).hashCode() : 0;
            object = this.linkUrl;
            int n29 = object != null ? ((String)object).hashCode() : 0;
            object = this.trackingUrl;
            int n33 = object != null ? ((String)object).hashCode() : 0;
            object = this.fallbackUrl;
            int n34 = object != null ? ((String)object).hashCode() : 0;
            object = this.username;
            int n35 = object != null ? ((String)object).hashCode() : 0;
            object = this.provider;
            int n36 = object != null ? ((String)object).hashCode() : 0;
            object = this.id;
            int n37 = object != null ? ((String)object).hashCode() : 0;
            object = this.align;
            int n38 = object != null ? ((String)object).hashCode() : 0;
            object = this.width;
            int n39 = object != null ? ((Integer)object).hashCode() : 0;
            object = this.height;
            int n42 = object != null ? ((Integer)object).hashCode() : 0;
            object = this.previewUrl;
            int n44 = object != null ? ((String)object).hashCode() : 0;
            object = this.attribution;
            int n45 = object != null ? ((String)object).hashCode() : 0;
            object = this.attachments;
            int n46 = object != null ? object.hashCode() : 0;
            object = this.items;
            int n47 = object != null ? object.hashCode() : 0;
            object = this.rating_index;
            int n48 = object != null ? ((Integer)object).hashCode() : 0;
            object = this.ratingIndex;
            int n49 = object != null ? ((Integer)object).hashCode() : 0;
            object = this.remark;
            int n54 = object != null ? ((String)object).hashCode() : 0;
            object = this.options;
            int n55 = object != null ? object.hashCode() : 0;
            object = this.links;
            int n56 = object != null ? object.hashCode() : 0;
            object = this.footerLink;
            int n57 = object != null ? ((Builder)object).hashCode() : 0;
            object = this.imageUrl;
            int n58 = object != null ? ((String)object).hashCode() : 0;
            object = this.imageWidth;
            int n59 = object != null ? ((Integer)object).hashCode() : 0;
            object = this.imageHeight;
            int n63 = object != null ? ((Integer)object).hashCode() : 0;
            object = this.ticket_type_title;
            int n64 = object != null ? ((String)object).hashCode() : 0;
            object = this.ticket_type;
            if (object != null) {
                n10 = ((TicketType)object).hashCode();
            }
            return ((((((((((((((((((((((((((((((((((((n13 * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n26) * 31 + n27) * 31 + n28) * 31 + n29) * 31 + n33) * 31 + n34) * 31 + n35) * 31 + n36) * 31 + n37) * 31 + n38) * 31 + n39) * 31 + n42) * 31 + n44) * 31 + n45) * 31 + n46) * 31 + n47) * 31 + n48) * 31 + n49) * 31 + n54) * 31 + n55) * 31 + n56) * 31 + n57) * 31 + n58) * 31 + n59) * 31 + n63) * 31 + n64) * 31 + n10) * 31 + this.ticket_type_id;
        }

        public Builder withAlign(String string2) {
            this.align = string2;
            return this;
        }

        public Builder withArticleId(String string2) {
            this.articleId = string2;
            return this;
        }

        public Builder withAttachments(List<BlockAttachment> list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String string2) {
            this.attribution = string2;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withData(Map<String, String> map2) {
            this.data = map2;
            return this;
        }

        public Builder withDescription(String string2) {
            this.description = string2;
            return this;
        }

        public Builder withHeight(int n10) {
            this.height = n10;
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withImageHeight(int n10) {
            this.imageHeight = n10;
            return this;
        }

        public Builder withImageUrl(String string2) {
            this.imageUrl = string2;
            return this;
        }

        public Builder withImageWidth(int n10) {
            this.imageWidth = n10;
            return this;
        }

        public Builder withItems(List<String> list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String string2) {
            this.linkType = string2;
            return this;
        }

        public Builder withOptions(List<ConversationRatingOption.Builder> list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String string2) {
            this.previewUrl = string2;
            return this;
        }

        public Builder withRatingIndex(Integer n10) {
            this.ratingIndex = n10;
            return this;
        }

        public Builder withRemark(String string2) {
            this.remark = string2;
            return this;
        }

        public Builder withSiteName(String string2) {
            this.siteName = string2;
            return this;
        }

        public Builder withText(String string2) {
            this.text = string2;
            return this;
        }

        public Builder withThumbnailUrl(String string2) {
            this.thumbnailUrl = string2;
            return this;
        }

        public Builder withTicketType(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public Builder withTicketTypeTitle(String string2) {
            this.ticket_type_title = string2;
            return this;
        }

        public Builder withTitle(String string2) {
            this.title = string2;
            return this;
        }

        public Builder withType(String string2) {
            this.type = string2;
            return this;
        }

        public Builder withUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder withUrl(String string2) {
            this.url = string2;
            return this;
        }

        public Builder withWidth(int n10) {
            this.width = n10;
            return this;
        }
    }
}

