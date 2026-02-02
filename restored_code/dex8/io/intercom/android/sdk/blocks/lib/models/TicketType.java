/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.gson.annotations.SerializedName
 *  kotlin.collections.t
 */
package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.blocks.lib.models.TicketAttribute;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0001/B5\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0014\u001a\u00020\r\u00a2\u0006\u0004\b-\u0010.J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0014\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u0004J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\"\u0010#R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b(\u0010\u0007R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\fR\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b,\u0010\u000f\u00a8\u00060"}, d2={"Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "Landroid/os/Parcelable;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "", "Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "component4", "()Ljava/util/List;", "", "component5", "()Z", "id", "name", "emoji", "attributes", "archived", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getName", "getEmoji", "Ljava/util/List;", "getAttributes", "Z", "getArchived", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Parcelize
public final class TicketType
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<TicketType> CREATOR;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final TicketType NULL;
    @SerializedName(value="archived")
    private final boolean archived;
    @SerializedName(value="attributes")
    @NotNull
    private final List<TicketAttribute> attributes;
    @SerializedName(value="emoji")
    @NotNull
    private final String emoji;
    @SerializedName(value="id")
    private final int id;
    @SerializedName(value="name")
    @NotNull
    private final String name;

    static {
        Companion = new Companion(null);
        CREATOR = new Creator();
        NULL = new TicketType(-1, "", "", t.m(), false);
    }

    public TicketType(int n10, @NotNull String string2, @NotNull String string3, @NotNull List<TicketAttribute> list, boolean bl2) {
        y.j(string2, "name");
        y.j(string3, "emoji");
        y.j(list, "attributes");
        this.id = n10;
        this.name = string2;
        this.emoji = string3;
        this.attributes = list;
        this.archived = bl2;
    }

    public static /* synthetic */ TicketType copy$default(TicketType ticketType, int n10, String string2, String string3, List list, boolean bl2, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = ticketType.id;
        }
        if ((n13 & 2) != 0) {
            string2 = ticketType.name;
        }
        if ((n13 & 4) != 0) {
            string3 = ticketType.emoji;
        }
        if ((n13 & 8) != 0) {
            list = ticketType.attributes;
        }
        if ((n13 & 0x10) != 0) {
            bl2 = ticketType.archived;
        }
        return ticketType.copy(n10, string2, string3, list, bl2);
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.emoji;
    }

    @NotNull
    public final List<TicketAttribute> component4() {
        return this.attributes;
    }

    public final boolean component5() {
        return this.archived;
    }

    @NotNull
    public final TicketType copy(int n10, @NotNull String string2, @NotNull String string3, @NotNull List<TicketAttribute> list, boolean bl2) {
        y.j(string2, "name");
        y.j(string3, "emoji");
        y.j(list, "attributes");
        return new TicketType(n10, string2, string3, list, bl2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TicketType)) {
            return false;
        }
        object = (TicketType)object;
        if (this.id != ((TicketType)object).id) {
            return false;
        }
        if (!y.e(this.name, ((TicketType)object).name)) {
            return false;
        }
        if (!y.e(this.emoji, ((TicketType)object).emoji)) {
            return false;
        }
        if (!y.e(this.attributes, ((TicketType)object).attributes)) {
            return false;
        }
        return this.archived == ((TicketType)object).archived;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    @NotNull
    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getEmoji() {
        return this.emoji;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int n10;
        int n13 = this.id;
        int n14 = this.name.hashCode();
        int n15 = this.emoji.hashCode();
        int n16 = ((Object)this.attributes).hashCode();
        int n17 = n10 = this.archived;
        if (n10 != 0) {
            n17 = 1;
        }
        return (((n13 * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TicketType(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", emoji=");
        stringBuilder.append(this.emoji);
        stringBuilder.append(", attributes=");
        stringBuilder.append(this.attributes);
        stringBuilder.append(", archived=");
        stringBuilder.append(this.archived);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        y.j(parcel, "out");
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.emoji);
        Object object = this.attributes;
        parcel.writeInt(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            ((TicketAttribute)object.next()).writeToParcel(parcel, n10);
        }
        parcel.writeInt(this.archived ? 1 : 0);
    }

    @Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lio/intercom/android/sdk/blocks/lib/models/TicketType$Companion;", "", "()V", "NULL", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "getNULL", "()Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final TicketType getNULL() {
            return NULL;
        }
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public static final class Creator
    implements Parcelable.Creator<TicketType> {
        @NotNull
        public final TicketType createFromParcel(@NotNull Parcel parcel) {
            y.j(parcel, "parcel");
            int n10 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int n13 = parcel.readInt();
            ArrayList<TicketAttribute> arrayList = new ArrayList<TicketAttribute>(n13);
            for (int i14 = 0; i14 != n13; ++i14) {
                arrayList.add((TicketAttribute)TicketAttribute.CREATOR.createFromParcel(parcel));
            }
            boolean bl2 = parcel.readInt() != 0;
            return new TicketType(n10, string2, string3, arrayList, bl2);
        }

        @NotNull
        public final TicketType[] newArray(int n10) {
            return new TicketType[n10];
        }
    }
}

