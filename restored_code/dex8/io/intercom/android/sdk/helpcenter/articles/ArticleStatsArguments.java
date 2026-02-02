/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package io.intercom.android.sdk.helpcenter.articles;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u0007\u00a8\u0006 "}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleStatsArguments;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Z", "articleId", "isFromSearchBrowse", "copy", "(Ljava/lang/String;Z)Lio/intercom/android/sdk/helpcenter/articles/ArticleStatsArguments;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getArticleId", "Z", "<init>", "(Ljava/lang/String;Z)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Parcelize
public final class ArticleStatsArguments
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<ArticleStatsArguments> CREATOR = new Creator();
    @NotNull
    private final String articleId;
    private final boolean isFromSearchBrowse;

    @JvmOverloads
    public ArticleStatsArguments() {
        this(null, false, 3, null);
    }

    @JvmOverloads
    public ArticleStatsArguments(@NotNull String string2) {
        y.j(string2, "articleId");
        this(string2, false, 2, null);
    }

    @JvmOverloads
    public ArticleStatsArguments(@NotNull String string2, boolean bl2) {
        y.j(string2, "articleId");
        this.articleId = string2;
        this.isFromSearchBrowse = bl2;
    }

    public /* synthetic */ ArticleStatsArguments(String string2, boolean bl2, int n10, p p14) {
        if ((n10 & 1) != 0) {
            string2 = "";
        }
        if ((n10 & 2) != 0) {
            bl2 = false;
        }
        this(string2, bl2);
    }

    public static /* synthetic */ ArticleStatsArguments copy$default(ArticleStatsArguments articleStatsArguments, String string2, boolean bl2, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = articleStatsArguments.articleId;
        }
        if ((n10 & 2) != 0) {
            bl2 = articleStatsArguments.isFromSearchBrowse;
        }
        return articleStatsArguments.copy(string2, bl2);
    }

    @NotNull
    public final String component1() {
        return this.articleId;
    }

    public final boolean component2() {
        return this.isFromSearchBrowse;
    }

    @NotNull
    public final ArticleStatsArguments copy(@NotNull String string2, boolean bl2) {
        y.j(string2, "articleId");
        return new ArticleStatsArguments(string2, bl2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ArticleStatsArguments)) {
            return false;
        }
        object = (ArticleStatsArguments)object;
        if (!y.e(this.articleId, ((ArticleStatsArguments)object).articleId)) {
            return false;
        }
        return this.isFromSearchBrowse == ((ArticleStatsArguments)object).isFromSearchBrowse;
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        int n10;
        int n13 = this.articleId.hashCode();
        int n14 = n10 = this.isFromSearchBrowse;
        if (n10 != 0) {
            n14 = 1;
        }
        return n13 * 31 + n14;
    }

    public final boolean isFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ArticleStatsArguments(articleId=");
        stringBuilder.append(this.articleId);
        stringBuilder.append(", isFromSearchBrowse=");
        stringBuilder.append(this.isFromSearchBrowse);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public void writeToParcel(@NotNull Parcel parcel, int n10) {
        y.j(parcel, "out");
        parcel.writeString(this.articleId);
        parcel.writeInt(this.isFromSearchBrowse ? 1 : 0);
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public static final class Creator
    implements Parcelable.Creator<ArticleStatsArguments> {
        @NotNull
        public final ArticleStatsArguments createFromParcel(@NotNull Parcel parcel) {
            y.j(parcel, "parcel");
            String string2 = parcel.readString();
            boolean bl2 = parcel.readInt() != 0;
            return new ArticleStatsArguments(string2, bl2);
        }

        @NotNull
        public final ArticleStatsArguments[] newArray(int n10) {
            return new ArticleStatsArguments[n10];
        }
    }
}

