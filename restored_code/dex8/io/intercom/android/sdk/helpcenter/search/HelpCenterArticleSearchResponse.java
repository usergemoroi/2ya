/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 *  kotlinx.serialization.KSerializer
 */
package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse$;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse$Highlight$;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.c2;
import kotlinx.serialization.internal.r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0003657B7\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\u0004\b/\u00100BW\b\u0017\u0012\u0006\u00101\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u00103\u001a\u0004\u0018\u000102\u00a2\u0006\u0004\b/\u00104J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b \u0010!R \u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\fR \u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\fR \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\fR \u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\fR \u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0017\u0010,\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u0012\u00a8\u00068"}, d2={"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "component5", "()Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "articleId", "summary", "title", "url", "highlight", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;)Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArticleId", "getArticleId$annotations", "()V", "getSummary", "getSummary$annotations", "getTitle", "getTitle$annotations", "getUrl", "getUrl$annotations", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "getHighlight", "getHighlight$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "Highlight", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@Serializable
public final class HelpCenterArticleSearchResponse {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String articleId;
    @NotNull
    private final Highlight highlight;
    @NotNull
    private final String summary;
    @NotNull
    private final String title;
    @NotNull
    private final String url;

    @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
    public /* synthetic */ HelpCenterArticleSearchResponse(int n10, @SerialName(value="id") String string2, @SerialName(value="summary") String string3, @SerialName(value="title") String string4, @SerialName(value="url") String string5, @SerialName(value="highlight") Highlight highlight, r2 r24) {
        if (1 != (n10 & 1)) {
            c2.a(n10, 1, $serializer.INSTANCE.getDescriptor());
        }
        this.articleId = string2;
        this.summary = (n10 & 2) == 0 ? "" : string3;
        this.title = (n10 & 4) == 0 ? "" : string4;
        this.url = (n10 & 8) == 0 ? "" : string5;
        this.highlight = (n10 & 0x10) == 0 ? new Highlight(null, null, 3, null) : highlight;
    }

    public HelpCenterArticleSearchResponse(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull String string5, @NotNull Highlight highlight) {
        y.j(string2, "articleId");
        y.j(string3, "summary");
        y.j(string4, "title");
        y.j(string5, "url");
        y.j(highlight, "highlight");
        this.articleId = string2;
        this.summary = string3;
        this.title = string4;
        this.url = string5;
        this.highlight = highlight;
    }

    public /* synthetic */ HelpCenterArticleSearchResponse(String string2, String string3, String string4, String string5, Highlight highlight, int n10, p p14) {
        if ((n10 & 2) != 0) {
            string3 = "";
        }
        if ((n10 & 4) != 0) {
            string4 = "";
        }
        if ((n10 & 8) != 0) {
            string5 = "";
        }
        if ((n10 & 0x10) != 0) {
            highlight = new Highlight(null, null, 3, null);
        }
        this(string2, string3, string4, string5, highlight);
    }

    public static /* synthetic */ HelpCenterArticleSearchResponse copy$default(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, String string2, String string3, String string4, String string5, Highlight highlight, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = helpCenterArticleSearchResponse.articleId;
        }
        if ((n10 & 2) != 0) {
            string3 = helpCenterArticleSearchResponse.summary;
        }
        if ((n10 & 4) != 0) {
            string4 = helpCenterArticleSearchResponse.title;
        }
        if ((n10 & 8) != 0) {
            string5 = helpCenterArticleSearchResponse.url;
        }
        if ((n10 & 0x10) != 0) {
            highlight = helpCenterArticleSearchResponse.highlight;
        }
        return helpCenterArticleSearchResponse.copy(string2, string3, string4, string5, highlight);
    }

    @SerialName(value="id")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @SerialName(value="highlight")
    public static /* synthetic */ void getHighlight$annotations() {
    }

    @SerialName(value="summary")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName(value="title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName(value="url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, d d14, SerialDescriptor serialDescriptor) {
        d14.p(serialDescriptor, 0, helpCenterArticleSearchResponse.articleId);
        if (d14.q(serialDescriptor, 1) || !y.e(helpCenterArticleSearchResponse.summary, "")) {
            d14.p(serialDescriptor, 1, helpCenterArticleSearchResponse.summary);
        }
        if (d14.q(serialDescriptor, 2) || !y.e(helpCenterArticleSearchResponse.title, "")) {
            d14.p(serialDescriptor, 2, helpCenterArticleSearchResponse.title);
        }
        if (d14.q(serialDescriptor, 3) || !y.e(helpCenterArticleSearchResponse.url, "")) {
            d14.p(serialDescriptor, 3, helpCenterArticleSearchResponse.url);
        }
        if (d14.q(serialDescriptor, 4) || !y.e(helpCenterArticleSearchResponse.highlight, new Highlight(null, null, 3, null))) {
            d14.F(serialDescriptor, 4, Highlight$$serializer.INSTANCE, helpCenterArticleSearchResponse.highlight);
        }
    }

    @NotNull
    public final String component1() {
        return this.articleId;
    }

    @NotNull
    public final String component2() {
        return this.summary;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final Highlight component5() {
        return this.highlight;
    }

    @NotNull
    public final HelpCenterArticleSearchResponse copy(@NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull String string5, @NotNull Highlight highlight) {
        y.j(string2, "articleId");
        y.j(string3, "summary");
        y.j(string4, "title");
        y.j(string5, "url");
        y.j(highlight, "highlight");
        return new HelpCenterArticleSearchResponse(string2, string3, string4, string5, highlight);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof HelpCenterArticleSearchResponse)) {
            return false;
        }
        object = (HelpCenterArticleSearchResponse)object;
        if (!y.e(this.articleId, ((HelpCenterArticleSearchResponse)object).articleId)) {
            return false;
        }
        if (!y.e(this.summary, ((HelpCenterArticleSearchResponse)object).summary)) {
            return false;
        }
        if (!y.e(this.title, ((HelpCenterArticleSearchResponse)object).title)) {
            return false;
        }
        if (!y.e(this.url, ((HelpCenterArticleSearchResponse)object).url)) {
            return false;
        }
        return y.e(this.highlight, ((HelpCenterArticleSearchResponse)object).highlight);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final Highlight getHighlight() {
        return this.highlight;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.articleId.hashCode() * 31 + this.summary.hashCode()) * 31 + this.title.hashCode()) * 31 + this.url.hashCode()) * 31 + this.highlight.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HelpCenterArticleSearchResponse(articleId=");
        stringBuilder.append(this.articleId);
        stringBuilder.append(", summary=");
        stringBuilder.append(this.summary);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", highlight=");
        stringBuilder.append(this.highlight);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @NotNull
        public final KSerializer<HelpCenterArticleSearchResponse> serializer() {
            return $serializer.INSTANCE;
        }
    }

    @Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\b \u0010%J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\fR \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\f\u00a8\u0006("}, d2={"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/k0;", "write$Self", "(Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "title", "summary", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSummary", "getSummary$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/r2;)V", "Companion", "$serializer", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
    @Serializable
    @StabilityInferred(parameters=0)
    public static final class Highlight {
        public static final int $stable = 0;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final String summary;
        @NotNull
        private final String title;

        public Highlight() {
            this(null, null, 3, null);
        }

        @Deprecated(level=e.e, message="This synthesized declaration should not be used directly", replaceWith=@ReplaceWith(expression="", imports={}))
        public /* synthetic */ Highlight(int n10, @SerialName(value="title") String string2, @SerialName(value="summary") String string3, r2 r24) {
            this.title = (n10 & 1) == 0 ? "" : string2;
            this.summary = (n10 & 2) == 0 ? "" : string3;
        }

        public Highlight(@NotNull String string2, @NotNull String string3) {
            y.j(string2, "title");
            y.j(string3, "summary");
            this.title = string2;
            this.summary = string3;
        }

        public /* synthetic */ Highlight(String string2, String string3, int n10, p p14) {
            if ((n10 & 1) != 0) {
                string2 = "";
            }
            if ((n10 & 2) != 0) {
                string3 = "";
            }
            this(string2, string3);
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, String string2, String string3, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = highlight.title;
            }
            if ((n10 & 2) != 0) {
                string3 = highlight.summary;
            }
            return highlight.copy(string2, string3);
        }

        @SerialName(value="summary")
        public static /* synthetic */ void getSummary$annotations() {
        }

        @SerialName(value="title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self(Highlight highlight, d d14, SerialDescriptor serialDescriptor) {
            if (d14.q(serialDescriptor, 0) || !y.e(highlight.title, "")) {
                d14.p(serialDescriptor, 0, highlight.title);
            }
            if (d14.q(serialDescriptor, 1) || !y.e(highlight.summary, "")) {
                d14.p(serialDescriptor, 1, highlight.summary);
            }
        }

        @NotNull
        public final String component1() {
            return this.title;
        }

        @NotNull
        public final String component2() {
            return this.summary;
        }

        @NotNull
        public final Highlight copy(@NotNull String string2, @NotNull String string3) {
            y.j(string2, "title");
            y.j(string3, "summary");
            return new Highlight(string2, string3);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Highlight)) {
                return false;
            }
            object = (Highlight)object;
            if (!y.e(this.title, ((Highlight)object).title)) {
                return false;
            }
            return y.e(this.summary, ((Highlight)object).summary);
        }

        @NotNull
        public final String getSummary() {
            return this.summary;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() * 31 + this.summary.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Highlight(title=");
            stringBuilder.append(this.title);
            stringBuilder.append(", summary=");
            stringBuilder.append(this.summary);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }

        @Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2={"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(p p14) {
                this();
            }

            @NotNull
            public final KSerializer<Highlight> serializer() {
                return Highlight$$serializer.INSTANCE;
            }
        }
    }
}

