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

public class Image
implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>(){

        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        public Image[] newArray(int n10) {
            return new Image[n10];
        }
    };
    private final String alt;
    private final String attribution;
    private final int height;
    private final String previewUrl;
    private final String url;
    private final int width;

    Image() {
        this(new Builder());
    }

    protected Image(Parcel parcel) {
        this.attribution = parcel.readString();
        this.previewUrl = parcel.readString();
        this.alt = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    private Image(Builder builder) {
        String string2 = builder.alt;
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        this.alt = string4;
        string4 = string2 = builder.url;
        if (string2 == null) {
            string4 = "";
        }
        this.url = string4;
        string4 = string2 = builder.previewUrl;
        if (string2 == null) {
            string4 = "";
        }
        this.previewUrl = string4;
        string4 = builder.attribution;
        if (string4 == null) {
            string4 = string3;
        }
        this.attribution = string4;
        this.width = builder.width;
        this.height = builder.height;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        block9: {
            boolean bl2;
            block11: {
                block12: {
                    block10: {
                        bl2 = true;
                        if (this == object) {
                            return true;
                        }
                        if (object == null || this.getClass() != object.getClass()) break block9;
                        object = (Image)object;
                        String string2 = this.alt;
                        if (string2 != null ? !string2.equals(((Image)object).alt) : ((Image)object).alt != null) {
                            return false;
                        }
                        string2 = this.previewUrl;
                        if (string2 != null ? !string2.equals(((Image)object).previewUrl) : ((Image)object).previewUrl != null) {
                            return false;
                        }
                        string2 = this.attribution;
                        if (string2 != null ? !string2.equals(((Image)object).attribution) : ((Image)object).attribution != null) {
                            return false;
                        }
                        if (this.width != ((Image)object).width) {
                            return false;
                        }
                        if (this.height != ((Image)object).height) {
                            return false;
                        }
                        string2 = this.url;
                        object = ((Image)object).url;
                        if (string2 == null) break block10;
                        if (string2.equals(object)) break block11;
                        break block12;
                    }
                    if (object == null) break block11;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String string2 = this.alt;
        int n10 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.url;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.previewUrl;
        int n15 = string2 != null ? string2.hashCode() : 0;
        string2 = this.attribution;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return ((((n13 * 31 + n14) * 31 + n15) * 31 + n10) * 31 + this.width) * 31 + this.height;
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.attribution);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.alt);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public static final class Builder {
        String alt;
        String attribution;
        int height;
        String previewUrl;
        String url;
        int width;

        public Image build() {
            return new Image(this);
        }

        public Builder withAlt(String string2) {
            this.alt = string2;
            return this;
        }

        public Builder withAttribution(String string2) {
            this.attribution = string2;
            return this;
        }

        public Builder withHeight(int n10) {
            this.height = n10;
            return this;
        }

        public Builder withPreviewUrl(String string2) {
            this.previewUrl = string2;
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

