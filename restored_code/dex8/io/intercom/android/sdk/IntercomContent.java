/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.runtime.internal.StabilityInferred
 */
package io.intercom.android.sdk;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2={"Lio/intercom/android/sdk/IntercomContent;", "", "()V", "Article", "Carousel", "Conversation", "HelpCenterCollections", "Survey", "Ticket", "Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent$Ticket;", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
@StabilityInferred(parameters=0)
public abstract class IntercomContent {
    public static final int $stable = 0;

    private IntercomContent() {
    }

    public /* synthetic */ IntercomContent(p p14) {
        this();
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Article
    extends IntercomContent {
        public static final int $stable = 0;
        @NotNull
        private final String id;

        public Article(@NotNull String string2) {
            y.j(string2, "id");
            super(null);
            this.id = string2;
        }

        public static /* synthetic */ Article copy$default(Article article, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = article.id;
            }
            return article.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Article copy(@NotNull String string2) {
            y.j(string2, "id");
            return new Article(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Article)) {
                return false;
            }
            object = (Article)object;
            return y.e(this.id, ((Article)object).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Article(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Carousel
    extends IntercomContent {
        public static final int $stable = 0;
        @NotNull
        private final String id;

        public Carousel(@NotNull String string2) {
            y.j(string2, "id");
            super(null);
            this.id = string2;
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = carousel.id;
            }
            return carousel.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Carousel copy(@NotNull String string2) {
            y.j(string2, "id");
            return new Carousel(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Carousel)) {
                return false;
            }
            object = (Carousel)object;
            return y.e(this.id, ((Carousel)object).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Carousel(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Conversation
    extends IntercomContent {
        public static final int $stable = 0;
        @NotNull
        private final String id;

        public Conversation(@NotNull String string2) {
            y.j(string2, "id");
            super(null);
            this.id = string2;
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = conversation.id;
            }
            return conversation.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Conversation copy(@NotNull String string2) {
            y.j(string2, "id");
            return new Conversation(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Conversation)) {
                return false;
            }
            object = (Conversation)object;
            return y.e(this.id, ((Conversation)object).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Conversation(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent;", "ids", "", "", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class HelpCenterCollections
    extends IntercomContent {
        public static final int $stable = 8;
        @NotNull
        private final List<String> ids;

        public HelpCenterCollections(@NotNull List<String> list) {
            y.j(list, "ids");
            super(null);
            this.ids = list;
        }

        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List list, int n10, Object object) {
            if ((n10 & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.ids;
        }

        @NotNull
        public final HelpCenterCollections copy(@NotNull List<String> list) {
            y.j(list, "ids");
            return new HelpCenterCollections(list);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof HelpCenterCollections)) {
                return false;
            }
            object = (HelpCenterCollections)object;
            return y.e(this.ids, ((HelpCenterCollections)object).ids);
        }

        @NotNull
        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return ((Object)this.ids).hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HelpCenterCollections(ids=");
            stringBuilder.append(this.ids);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Survey
    extends IntercomContent {
        public static final int $stable = 0;
        @NotNull
        private final String id;

        public Survey(@NotNull String string2) {
            y.j(string2, "id");
            super(null);
            this.id = string2;
        }

        public static /* synthetic */ Survey copy$default(Survey survey, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = survey.id;
            }
            return survey.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Survey copy(@NotNull String string2) {
            y.j(string2, "id");
            return new Survey(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Survey)) {
                return false;
            }
            object = (Survey)object;
            return y.e(this.id, ((Survey)object).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Survey(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/IntercomContent$Ticket;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    @StabilityInferred(parameters=0)
    public static final class Ticket
    extends IntercomContent {
        public static final int $stable = 0;
        @NotNull
        private final String id;

        public Ticket(@NotNull String string2) {
            y.j(string2, "id");
            super(null);
            this.id = string2;
        }

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String string2, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = ticket.id;
            }
            return ticket.copy(string2);
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Ticket copy(@NotNull String string2) {
            y.j(string2, "id");
            return new Ticket(string2);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Ticket)) {
                return false;
            }
            object = (Ticket)object;
            return y.e(this.id, ((Ticket)object).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ticket(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

