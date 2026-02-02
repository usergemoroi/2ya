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
import io.intercom.android.sdk.blocks.lib.models.Link;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkList
implements Parcelable {
    public static final Parcelable.Creator<LinkList> CREATOR = new Parcelable.Creator<LinkList>(){

        public LinkList createFromParcel(Parcel parcel) {
            ArrayList<Link> arrayList = new ArrayList<Link>();
            parcel.readList(arrayList, Link.class.getClassLoader());
            return new LinkList(arrayList, (Link)parcel.readParcelable(Link.class.getClassLoader()));
        }

        public LinkList[] newArray(int n10) {
            return new LinkList[n10];
        }
    };
    private final Link footerLink;
    private final List<Link> links;

    public LinkList(List<Link> list, Link link) {
        this.links = list;
        this.footerLink = link;
    }

    public static LinkList fromBlock(Block block) {
        if (block == null) {
            return new LinkList(Collections.<Link>emptyList(), new Link.Builder().build());
        }
        return new LinkList(block.getLinks(), block.getFooterLink());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (LinkList)object;
            if (!this.links.equals(((LinkList)object).links)) {
                return false;
            }
            return this.footerLink.equals(((LinkList)object).footerLink);
        }
        return false;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public int hashCode() {
        return this.links.hashCode() * 31 + this.footerLink.hashCode();
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeList(this.links);
        parcel.writeParcelable((Parcelable)this.footerLink, n10);
    }
}

