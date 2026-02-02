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

public class Author
implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>(){

        public Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        public Author[] newArray(int n10) {
            return new Author[n10];
        }
    };
    private final String avatar;
    private final String firstName;
    private final String lastName;
    private final String name;

    Author() {
        this(new Builder());
    }

    protected Author(Parcel parcel) {
        this.name = parcel.readString();
        this.avatar = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }

    private Author(Builder object) {
        String string2 = ((Builder)object).name;
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        this.name = string4;
        string4 = string2 = ((Builder)object).avatar;
        if (string2 == null) {
            string4 = "";
        }
        this.avatar = string4;
        string4 = string2 = ((Builder)object).firstName;
        if (string2 == null) {
            string4 = "";
        }
        this.firstName = string4;
        object = ((Builder)object).lastName;
        if (object == null) {
            object = string3;
        }
        this.lastName = object;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        block7: {
            boolean bl2;
            block9: {
                block10: {
                    block8: {
                        bl2 = true;
                        if (this == object) {
                            return true;
                        }
                        if (object == null || this.getClass() != object.getClass()) break block7;
                        object = (Author)object;
                        String string2 = this.name;
                        if (string2 != null ? !string2.equals(((Author)object).name) : ((Author)object).name != null) {
                            return false;
                        }
                        string2 = this.firstName;
                        if (string2 != null ? !string2.equals(((Author)object).firstName) : ((Author)object).firstName != null) {
                            return false;
                        }
                        string2 = this.lastName;
                        if (string2 != null ? !string2.equals(((Author)object).lastName) : ((Author)object).lastName != null) {
                            return false;
                        }
                        string2 = this.avatar;
                        object = ((Author)object).avatar;
                        if (string2 == null) break block8;
                        if (string2.equals(object)) break block9;
                        break block10;
                    }
                    if (object == null) break block9;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String string2 = this.name;
        int n10 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        string2 = this.firstName;
        int n14 = string2 != null ? string2.hashCode() : 0;
        string2 = this.lastName;
        int n15 = string2 != null ? string2.hashCode() : 0;
        string2 = this.avatar;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return ((n13 * 31 + n14) * 31 + n15) * 31 + n10;
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.name);
        parcel.writeString(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    public static final class Builder {
        String avatar;
        String firstName;
        String lastName;
        String name;

        public Author build() {
            return new Author(this);
        }

        public Builder withAvatar(String string2) {
            this.avatar = string2;
            return this;
        }

        public Builder withFirstName(String string2) {
            this.firstName = string2;
            return this;
        }

        public Builder withLastName(String string2) {
            this.lastName = string2;
            return this;
        }

        public Builder withName(String string2) {
            this.name = string2;
            return this;
        }
    }
}

