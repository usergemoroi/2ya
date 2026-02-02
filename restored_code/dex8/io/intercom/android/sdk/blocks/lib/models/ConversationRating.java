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
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import java.util.ArrayList;
import java.util.List;

public class ConversationRating
implements Parcelable {
    public static final Parcelable.Creator<ConversationRating> CREATOR = new Parcelable.Creator<ConversationRating>(){

        public ConversationRating createFromParcel(Parcel parcel) {
            return new ConversationRating(parcel);
        }

        public ConversationRating[] newArray(int n10) {
            return new ConversationRating[n10];
        }
    };
    private final List<ConversationRatingOption> options;
    private int ratingIndex;
    private String remark;

    ConversationRating(int n10, String string2, List<ConversationRatingOption> list) {
        this.ratingIndex = n10;
        this.remark = string2;
        this.options = list;
    }

    protected ConversationRating(Parcel parcel) {
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList<ConversationRatingOption> arrayList = new ArrayList<ConversationRatingOption>();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
    }

    public static ConversationRating fromBlock(Block block) {
        if (block == null) {
            return new ConversationRating(-1, "", new ArrayList<ConversationRatingOption>());
        }
        return new ConversationRating(block.getRatingIndex(), block.getRemark(), block.getOptions());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object list) {
        boolean bl2 = true;
        if (this == list) {
            return true;
        }
        if (list != null && this.getClass() == list.getClass()) {
            list = (ConversationRating)((Object)list);
            if (this.ratingIndex != ((ConversationRating)((Object)list)).ratingIndex) {
                return false;
            }
            Object object = this.remark;
            if (object != null ? !((String)object).equals(((ConversationRating)((Object)list)).remark) : ((ConversationRating)((Object)list)).remark != null) {
                return false;
            }
            object = this.options;
            list = ((ConversationRating)((Object)list)).options;
            if (object != null) {
                bl2 = object.equals(list);
            } else if (list != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public Integer getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        int n10 = this.ratingIndex;
        List<ConversationRatingOption> list = this.remark;
        int n13 = 0;
        int n14 = list != null ? ((String)((Object)list)).hashCode() : 0;
        list = this.options;
        if (list != null) {
            n13 = list.hashCode();
        }
        return (n10 * 31 + n14) * 31 + n13;
    }

    public void setRatingIndex(int n10) {
        this.ratingIndex = n10;
    }

    public void setRemark(String string2) {
        this.remark = string2;
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeList(this.options);
    }
}

