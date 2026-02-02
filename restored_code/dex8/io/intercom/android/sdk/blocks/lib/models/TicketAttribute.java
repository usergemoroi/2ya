/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  kotlin.collections.t
 */
package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0004\b/\u00100J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00c6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0019\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u001e\u0010\u0004J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b#\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b)\u0010\u0007R\u0017\u0010\u0013\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010\u000bR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b,\u0010\u0007R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010\u000f\u00a8\u00061"}, d2={"Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "Landroid/os/Parcelable;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "", "component4", "()Z", "component5", "", "component6", "()Ljava/util/List;", "id", "name", "type", "required", "identifier", "options", "copy", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lio/intercom/android/sdk/blocks/lib/models/TicketAttribute;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getName", "getType", "Z", "getRequired", "getIdentifier", "Ljava/util/List;", "getOptions", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Parcelize
public final class TicketAttribute
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<TicketAttribute> CREATOR = new Creator();
    private final int id;
    @Nullable
    private final String identifier;
    @NotNull
    private final String name;
    @NotNull
    private final List<String> options;
    private final boolean required;
    @NotNull
    private final String type;

    public TicketAttribute(int n10, @NotNull String string2, @NotNull String string3, boolean bl2, @Nullable String string4, @NotNull List<String> list) {
        y.j(string2, "name");
        y.j(string3, "type");
        y.j(list, "options");
        this.id = n10;
        this.name = string2;
        this.type = string3;
        this.required = bl2;
        this.identifier = string4;
        this.options = list;
    }

    public /* synthetic */ TicketAttribute(int n10, String string2, String string3, boolean bl2, String string4, List list, int n13, p p14) {
        if ((n13 & 0x20) != 0) {
            list = t.m();
        }
        this(n10, string2, string3, bl2, string4, list);
    }

    public static /* synthetic */ TicketAttribute copy$default(TicketAttribute ticketAttribute, int n10, String string2, String string3, boolean bl2, String string4, List list, int n13, Object object) {
        if ((n13 & 1) != 0) {
            n10 = ticketAttribute.id;
        }
        if ((n13 & 2) != 0) {
            string2 = ticketAttribute.name;
        }
        if ((n13 & 4) != 0) {
            string3 = ticketAttribute.type;
        }
        if ((n13 & 8) != 0) {
            bl2 = ticketAttribute.required;
        }
        if ((n13 & 0x10) != 0) {
            string4 = ticketAttribute.identifier;
        }
        if ((n13 & 0x20) != 0) {
            list = ticketAttribute.options;
        }
        return ticketAttribute.copy(n10, string2, string3, bl2, string4, list);
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
        return this.type;
    }

    public final boolean component4() {
        return this.required;
    }

    @Nullable
    public final String component5() {
        return this.identifier;
    }

    @NotNull
    public final List<String> component6() {
        return this.options;
    }

    @NotNull
    public final TicketAttribute copy(int n10, @NotNull String string2, @NotNull String string3, boolean bl2, @Nullable String string4, @NotNull List<String> list) {
        y.j(string2, "name");
        y.j(string3, "type");
        y.j(list, "options");
        return new TicketAttribute(n10, string2, string3, bl2, string4, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TicketAttribute)) {
            return false;
        }
        object = (TicketAttribute)object;
        if (this.id != ((TicketAttribute)object).id) {
            return false;
        }
        if (!y.e(this.name, ((TicketAttribute)object).name)) {
            return false;
        }
        if (!y.e(this.type, ((TicketAttribute)object).type)) {
            return false;
        }
        if (this.required != ((TicketAttribute)object).required) {
            return false;
        }
        if (!y.e(this.identifier, ((TicketAttribute)object).identifier)) {
            return false;
        }
        return y.e(this.options, ((TicketAttribute)object).options);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<String> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String string2;
        int n10;
        int n13 = this.id;
        int n14 = this.name.hashCode();
        int n15 = this.type.hashCode();
        int n16 = n10 = this.required;
        if (n10 != 0) {
            n16 = 1;
        }
        n10 = (string2 = this.identifier) == null ? 0 : string2.hashCode();
        return ((((n13 * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n10) * 31 + ((Object)this.options).hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TicketAttribute(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", required=");
        stringBuilder.append(this.required);
        stringBuilder.append(", identifier=");
        stringBuilder.append(this.identifier);
        stringBuilder.append(", options=");
        stringBuilder.append(this.options);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        y.j(parcel, "out");
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeString(this.identifier);
        parcel.writeStringList(this.options);
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public static final class Creator
    implements Parcelable.Creator<TicketAttribute> {
        @NotNull
        public final TicketAttribute createFromParcel(@NotNull Parcel parcel) {
            y.j(parcel, "parcel");
            int n10 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean bl2 = parcel.readInt() != 0;
            return new TicketAttribute(n10, string2, string3, bl2, parcel.readString(), parcel.createStringArrayList());
        }

        @NotNull
        public final TicketAttribute[] newArray(int n10) {
            return new TicketAttribute[n10];
        }
    }
}

