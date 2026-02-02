/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.Image;
import java.util.HashMap;
import java.util.Map;

public class Link
implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>(){

        public Link createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }

        public Link[] newArray(int n10) {
            return new Link[n10];
        }
    };
    private final String articleId;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final Image image;
    private final String linkType;
    private final String siteName;
    private final String text;
    private final String title;
    private final BlockType type;
    private final String url;

    Link() {
        this(new Builder());
    }

    protected Link(Parcel parcel) {
        this.type = BlockType.typeValueOf(parcel.readString());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.url = parcel.readString();
        this.author = (Author)parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image)parcel.readParcelable(Image.class.getClassLoader());
        this.data = new HashMap<String, String>();
        int n10 = parcel.readInt();
        for (int i14 = 0; i14 < n10; ++i14) {
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            this.data.put(string2, string3);
        }
    }

    private Link(Builder object) {
        this.type = BlockType.typeValueOf(((Builder)object).type);
        Map<String, String> map2 = ((Builder)object).text;
        String string2 = "";
        Map<String, String> map3 = map2;
        if (map2 == null) {
            map3 = "";
        }
        this.text = map3;
        map3 = map2 = ((Builder)object).title;
        if (map2 == null) {
            map3 = "";
        }
        this.title = map3;
        map3 = map2 = ((Builder)object).description;
        if (map2 == null) {
            map3 = "";
        }
        this.description = map3;
        map3 = map2 = ((Builder)object).linkType;
        if (map2 == null) {
            map3 = "";
        }
        this.linkType = map3;
        map3 = map2 = ((Builder)object).siteName;
        if (map2 == null) {
            map3 = "";
        }
        this.siteName = map3;
        map3 = map2 = ((Builder)object).articleId;
        if (map2 == null) {
            map3 = "";
        }
        this.articleId = map3;
        map3 = map2 = ((Builder)object).author;
        if (map2 == null) {
            map3 = new Author();
        }
        this.author = map3;
        map3 = map2 = ((Builder)object).image;
        if (map2 == null) {
            map3 = new Image();
        }
        this.image = map3;
        map3 = map2 = ((Builder)object).data;
        if (map2 == null) {
            map3 = new HashMap<String, String>();
        }
        this.data = map3;
        object = ((Builder)object).url;
        if (object == null) {
            object = string2;
        }
        this.url = object;
    }

    public static Link fromBlock(Block block) {
        if (block == null) {
            return new Link();
        }
        Builder builder = new Builder();
        builder.type = block.getType().name();
        builder.text = block.getText();
        builder.title = block.getTitle();
        builder.description = block.getDescription();
        builder.linkType = block.getLinkType();
        builder.author = block.getAuthor();
        builder.image = block.getImage();
        builder.data = block.getData();
        builder.siteName = block.getSiteName();
        builder.articleId = block.getArticleId();
        builder.url = block.getUrl();
        return new Link(builder);
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
            object = (Link)object;
            if (this.type != ((Link)object).type) {
                return false;
            }
            Object object2 = this.text;
            if (object2 != null ? !((String)object2).equals(((Link)object).text) : ((Link)object).text != null) {
                return false;
            }
            object2 = this.title;
            if (object2 != null ? !((String)object2).equals(((Link)object).title) : ((Link)object).title != null) {
                return false;
            }
            object2 = this.description;
            if (object2 != null ? !((String)object2).equals(((Link)object).description) : ((Link)object).description != null) {
                return false;
            }
            object2 = this.linkType;
            if (object2 != null ? !((String)object2).equals(((Link)object).linkType) : ((Link)object).linkType != null) {
                return false;
            }
            object2 = this.author;
            if (object2 != null ? !((Author)object2).equals(((Link)object).author) : ((Link)object).author != null) {
                return false;
            }
            object2 = this.image;
            if (object2 != null ? !((Image)object2).equals(((Link)object).image) : ((Link)object).image != null) {
                return false;
            }
            object2 = this.data;
            if (object2 != null ? !object2.equals(((Link)object).data) : ((Link)object).data != null) {
                return false;
            }
            object2 = this.siteName;
            if (object2 != null ? !((String)object2).equals(((Link)object).siteName) : ((Link)object).siteName != null) {
                return false;
            }
            object2 = this.articleId;
            if (object2 != null ? !((String)object2).equals(((Link)object).articleId) : ((Link)object).articleId != null) {
                return false;
            }
            object2 = this.url;
            object = ((Link)object).url;
            if (object2 != null) {
                bl2 = ((String)object2).equals(object);
            } else if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getArticleId() {
        return this.articleId;
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

    public Image getImage() {
        return this.image;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Object object = this.type;
        int n10 = 0;
        int n13 = object != null ? object.hashCode() : 0;
        object = this.text;
        int n14 = object != null ? ((String)object).hashCode() : 0;
        object = this.title;
        int n15 = object != null ? ((String)object).hashCode() : 0;
        object = this.description;
        int n16 = object != null ? ((String)object).hashCode() : 0;
        object = this.linkType;
        int n17 = object != null ? ((String)object).hashCode() : 0;
        object = this.author;
        int n18 = object != null ? ((Author)object).hashCode() : 0;
        object = this.image;
        int n19 = object != null ? ((Image)object).hashCode() : 0;
        object = this.data;
        int n23 = object != null ? object.hashCode() : 0;
        object = this.siteName;
        int n24 = object != null ? ((String)object).hashCode() : 0;
        object = this.articleId;
        int n25 = object != null ? ((String)object).hashCode() : 0;
        object = this.url;
        if (object != null) {
            n10 = ((String)object).hashCode();
        }
        return (((((((((n13 * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LinkCard{type=");
        stringBuilder.append((Object)this.type);
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
        stringBuilder.append(", author=");
        stringBuilder.append(this.author);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", siteName='");
        stringBuilder.append(this.siteName);
        stringBuilder.append('\'');
        stringBuilder.append(", articleId='");
        stringBuilder.append(this.articleId);
        stringBuilder.append('\'');
        stringBuilder.append(", url='");
        stringBuilder.append(this.url);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.url);
        parcel.writeParcelable((Parcelable)this.author, n10);
        parcel.writeParcelable((Parcelable)this.image, n10);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final class Builder {
        String articleId;
        Author author;
        Map<String, String> data;
        String description;
        Image image;
        String linkType;
        String siteName;
        String text;
        String title;
        String type;
        String url;

        public Link build() {
            return new Link(this);
        }

        public Builder withArticleId(String string2) {
            this.articleId = string2;
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

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withLinkType(String string2) {
            this.linkType = string2;
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

        public Builder withTitle(String string2) {
            this.title = string2;
            return this;
        }

        public Builder withType(String string2) {
            this.type = string2;
            return this;
        }

        public Builder withUrl(String string2) {
            this.url = string2;
            return this;
        }
    }
}

