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

public class ConversationRatingOption
implements Parcelable {
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new Parcelable.Creator<ConversationRatingOption>(){

        public ConversationRatingOption createFromParcel(Parcel parcel) {
            return new ConversationRatingOption(parcel);
        }

        public ConversationRatingOption[] newArray(int n10) {
            return new ConversationRatingOption[n10];
        }
    };
    private final String emoji;
    private final int index;
    private final String unicode;

    protected ConversationRatingOption(Parcel parcel) {
        this.index = parcel.readInt();
        this.emoji = parcel.readString();
        this.unicode = parcel.readString();
    }

    private ConversationRatingOption(Builder object) {
        Object object2 = ((Builder)object).index;
        int n10 = object2 == null ? -1 : (Integer)object2;
        this.index = n10;
        String string2 = ((Builder)object).emoji;
        String string3 = "";
        object2 = string2;
        if (string2 == null) {
            object2 = "";
        }
        this.emoji = object2;
        object = ((Builder)object).unicode;
        if (object == null) {
            object = string3;
        }
        this.unicode = object;
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
            Object object2 = (ConversationRatingOption)object;
            if (this.index != ((ConversationRatingOption)object2).index) {
                return false;
            }
            object = this.emoji;
            if (object != null ? !((String)object).equals(((ConversationRatingOption)object2).emoji) : ((ConversationRatingOption)object2).emoji != null) {
                return false;
            }
            object = this.unicode;
            object2 = ((ConversationRatingOption)object2).unicode;
            if (object != null) {
                bl2 = ((String)object).equals(object2);
            } else if (object2 != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getUnicode() {
        return this.unicode;
    }

    public int hashCode() {
        int n10 = this.index;
        String string2 = this.emoji;
        int n13 = 0;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.unicode;
        if (string2 != null) {
            n13 = string2.hashCode();
        }
        return (n10 * 31 + n14) * 31 + n13;
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeInt(this.index);
        parcel.writeString(this.emoji);
        parcel.writeString(this.unicode);
    }

    public static final class Builder {
        String emoji;
        Integer index;
        String unicode;

        public ConversationRatingOption build() {
            return new ConversationRatingOption(this);
        }

        public Builder withEmoji(String string2) {
            this.emoji = string2;
            return this;
        }

        public Builder withIndex(Integer n10) {
            this.index = n10;
            return this;
        }

        public Builder withUnicode(String string2) {
            this.unicode = string2;
            return this;
        }
    }
}

