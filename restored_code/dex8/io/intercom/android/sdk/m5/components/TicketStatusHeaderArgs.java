/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.text.font.FontWeight
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u00f8\u0001\u0002\u00a2\u0006\u0004\b#\u0010$J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\t\u001a\u00020\u0006H\u00c6\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\nH\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0004R \u0010\u000f\u001a\u00020\u00068\u0006\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\bR\u0017\u0010\u0010\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006%"}, d2={"Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "", "", "component1", "()Ljava/lang/String;", "component2", "Landroidx/compose/ui/graphics/Color;", "component3-0d7_KjU", "()J", "component3", "Landroidx/compose/ui/text/font/FontWeight;", "component4", "()Landroidx/compose/ui/text/font/FontWeight;", "title", "status", "tint", "fontWeight", "copy-9LQNqLg", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/text/font/FontWeight;)Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "copy", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getStatus", "J", "getTint-0d7_KjU", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/text/font/FontWeight;Lkotlin/jvm/internal/p;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class TicketStatusHeaderArgs {
    @NotNull
    private final FontWeight fontWeight;
    @NotNull
    private final String status;
    private final long tint;
    @NotNull
    private final String title;

    private TicketStatusHeaderArgs(String string2, String string3, long l10, FontWeight fontWeight) {
        y.j(string2, "title");
        y.j(string3, "status");
        y.j(fontWeight, "fontWeight");
        this.title = string2;
        this.status = string3;
        this.tint = l10;
        this.fontWeight = fontWeight;
    }

    public /* synthetic */ TicketStatusHeaderArgs(String string2, String string3, long l10, FontWeight fontWeight, int n10, p p14) {
        if ((n10 & 8) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        this(string2, string3, l10, fontWeight, null);
    }

    public /* synthetic */ TicketStatusHeaderArgs(String string2, String string3, long l10, FontWeight fontWeight, p p14) {
        this(string2, string3, l10, fontWeight);
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy-9LQNqLg$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String string2, String string3, long l10, FontWeight fontWeight, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = ticketStatusHeaderArgs.title;
        }
        if ((n10 & 2) != 0) {
            string3 = ticketStatusHeaderArgs.status;
        }
        if ((n10 & 4) != 0) {
            l10 = ticketStatusHeaderArgs.tint;
        }
        if ((n10 & 8) != 0) {
            fontWeight = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy-9LQNqLg(string2, string3, l10, fontWeight);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    public final long component3-0d7_KjU() {
        return this.tint;
    }

    @NotNull
    public final FontWeight component4() {
        return this.fontWeight;
    }

    @NotNull
    public final TicketStatusHeaderArgs copy-9LQNqLg(@NotNull String string2, @NotNull String string3, long l10, @NotNull FontWeight fontWeight) {
        y.j(string2, "title");
        y.j(string3, "status");
        y.j(fontWeight, "fontWeight");
        return new TicketStatusHeaderArgs(string2, string3, l10, fontWeight, null);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        object = (TicketStatusHeaderArgs)object;
        if (!y.e(this.title, ((TicketStatusHeaderArgs)object).title)) {
            return false;
        }
        if (!y.e(this.status, ((TicketStatusHeaderArgs)object).status)) {
            return false;
        }
        if (!Color.equals-impl0((long)this.tint, (long)((TicketStatusHeaderArgs)object).tint)) {
            return false;
        }
        return y.e(this.fontWeight, ((TicketStatusHeaderArgs)object).fontWeight);
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final long getTint-0d7_KjU() {
        return this.tint;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((this.title.hashCode() * 31 + this.status.hashCode()) * 31 + Color.hashCode-impl((long)this.tint)) * 31 + this.fontWeight.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TicketStatusHeaderArgs(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", tint=");
        stringBuilder.append((Object)Color.toString-impl((long)this.tint));
        stringBuilder.append(", fontWeight=");
        stringBuilder.append(this.fontWeight);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

