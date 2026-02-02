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

public class BlockAttachment
implements Parcelable {
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new Parcelable.Creator<BlockAttachment>(){

        public BlockAttachment createFromParcel(Parcel parcel) {
            return new BlockAttachment(parcel);
        }

        public BlockAttachment[] newArray(int n10) {
            return new BlockAttachment[n10];
        }
    };
    private final String contentType;
    private final int id;
    private final String name;
    private final long size;
    private final String url;

    public BlockAttachment() {
        this(new Builder());
    }

    protected BlockAttachment(Parcel parcel) {
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.contentType = parcel.readString();
        this.id = parcel.readInt();
        this.size = parcel.readLong();
    }

    public BlockAttachment(Builder builder) {
        String string2 = builder.name;
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        this.name = string4;
        string4 = string2 = builder.url;
        if (string2 == null) {
            string4 = "";
        }
        this.url = string4;
        string4 = builder.contentType;
        if (string4 == null) {
            string4 = string3;
        }
        this.contentType = string4;
        this.id = builder.id;
        this.size = builder.size;
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
            object = (BlockAttachment)object;
            if (this.size != ((BlockAttachment)object).size) {
                return false;
            }
            if (this.id != ((BlockAttachment)object).id) {
                return false;
            }
            String string2 = this.name;
            if (string2 != null ? !string2.equals(((BlockAttachment)object).name) : ((BlockAttachment)object).name != null) {
                return false;
            }
            string2 = this.url;
            if (string2 != null ? !string2.equals(((BlockAttachment)object).url) : ((BlockAttachment)object).url != null) {
                return false;
            }
            string2 = this.contentType;
            object = ((BlockAttachment)object).contentType;
            if (string2 != null) {
                bl2 = string2.equals(object);
            } else if (object != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String string2 = this.name;
        int n10 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.url;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.contentType;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        long l10 = this.size;
        return (((n13 * 31 + n14) * 31 + n10) * 31 + (int)(l10 ^ l10 >>> 32)) * 31 + this.id;
    }

    public Builder toBuilder() {
        return new Builder().withName(this.name).withUrl(this.url).withContentType(this.contentType).withId(this.id).withSize(this.size);
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeInt(this.id);
        parcel.writeLong(this.size);
    }

    public static final class Builder {
        String contentType;
        int id;
        String name;
        long size;
        String url;

        public BlockAttachment build() {
            return new BlockAttachment(this);
        }

        public Builder withContentType(String string2) {
            this.contentType = string2;
            return this;
        }

        public Builder withId(int n10) {
            this.id = n10;
            return this;
        }

        public Builder withName(String string2) {
            this.name = string2;
            return this;
        }

        public Builder withSize(long l10) {
            this.size = l10;
            return this;
        }

        public Builder withUrl(String string2) {
            this.url = string2;
            return this;
        }
    }
}

