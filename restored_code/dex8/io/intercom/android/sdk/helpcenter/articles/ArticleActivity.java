/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package io.intercom.android.sdk.helpcenter.articles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\nB\u0007\u00a2\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k0;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "<init>", "Companion", "ArticleActivityArguments", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class ArticleActivity
extends IntercomHelpCenterBaseActivity {
    @NotNull
    private static final String ARTICLE_ID = "ARTICLE_ID";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";
    @NotNull
    private static final String METRIC_PLACE = "METRIC_PLACE";
    @NotNull
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";

    @JvmStatic
    @NotNull
    public static final Intent buildIntent(@NotNull Context context, @NotNull ArticleActivityArguments articleActivityArguments) {
        return Companion.buildIntent(context, articleActivityArguments);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.overridePendingTransition(R.anim.intercom_donothing, R.anim.intercom_composer_slide_down);
    }

    @Override
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.intercom_activity_help_center_article);
        this.overridePendingTransition(R.anim.intercom_composer_slide_up, R.anim.intercom_donothing);
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0018"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "", "articleId", "", "metricPlace", "isFromSearchBrowse", "", "shouldHideReactions", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getArticleId", "()Ljava/lang/String;", "()Z", "getMetricPlace", "getShouldHideReactions", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class ArticleActivityArguments {
        @NotNull
        private final String articleId;
        private final boolean isFromSearchBrowse;
        @NotNull
        private final String metricPlace;
        private final boolean shouldHideReactions;

        @JvmOverloads
        public ArticleActivityArguments(@NotNull String string2, @NotNull String string3) {
            y.j(string2, "articleId");
            y.j(string3, "metricPlace");
            this(string2, string3, false, false, 12, null);
        }

        @JvmOverloads
        public ArticleActivityArguments(@NotNull String string2, @NotNull String string3, boolean bl2) {
            y.j(string2, "articleId");
            y.j(string3, "metricPlace");
            this(string2, string3, bl2, false, 8, null);
        }

        @JvmOverloads
        public ArticleActivityArguments(@NotNull String string2, @NotNull String string3, boolean bl2, boolean bl3) {
            y.j(string2, "articleId");
            y.j(string3, "metricPlace");
            this.articleId = string2;
            this.metricPlace = string3;
            this.isFromSearchBrowse = bl2;
            this.shouldHideReactions = bl3;
        }

        public /* synthetic */ ArticleActivityArguments(String string2, String string3, boolean bl2, boolean bl3, int n10, p p14) {
            if ((n10 & 4) != 0) {
                bl2 = false;
            }
            if ((n10 & 8) != 0) {
                bl3 = false;
            }
            this(string2, string3, bl2, bl3);
        }

        public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String string2, String string3, boolean bl2, boolean bl3, int n10, Object object) {
            if ((n10 & 1) != 0) {
                string2 = articleActivityArguments.articleId;
            }
            if ((n10 & 2) != 0) {
                string3 = articleActivityArguments.metricPlace;
            }
            if ((n10 & 4) != 0) {
                bl2 = articleActivityArguments.isFromSearchBrowse;
            }
            if ((n10 & 8) != 0) {
                bl3 = articleActivityArguments.shouldHideReactions;
            }
            return articleActivityArguments.copy(string2, string3, bl2, bl3);
        }

        @NotNull
        public final String component1() {
            return this.articleId;
        }

        @NotNull
        public final String component2() {
            return this.metricPlace;
        }

        public final boolean component3() {
            return this.isFromSearchBrowse;
        }

        public final boolean component4() {
            return this.shouldHideReactions;
        }

        @NotNull
        public final ArticleActivityArguments copy(@NotNull String string2, @NotNull String string3, boolean bl2, boolean bl3) {
            y.j(string2, "articleId");
            y.j(string3, "metricPlace");
            return new ArticleActivityArguments(string2, string3, bl2, bl3);
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ArticleActivityArguments)) {
                return false;
            }
            object = (ArticleActivityArguments)object;
            if (!y.e(this.articleId, ((ArticleActivityArguments)object).articleId)) {
                return false;
            }
            if (!y.e(this.metricPlace, ((ArticleActivityArguments)object).metricPlace)) {
                return false;
            }
            if (this.isFromSearchBrowse != ((ArticleActivityArguments)object).isFromSearchBrowse) {
                return false;
            }
            return this.shouldHideReactions == ((ArticleActivityArguments)object).shouldHideReactions;
        }

        @NotNull
        public final String getArticleId() {
            return this.articleId;
        }

        @NotNull
        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final boolean getShouldHideReactions() {
            return this.shouldHideReactions;
        }

        public int hashCode() {
            int n10 = this.articleId.hashCode();
            int n13 = this.metricPlace.hashCode();
            int n14 = this.isFromSearchBrowse;
            int n15 = 1;
            int n16 = n14;
            if (n14 != 0) {
                n16 = 1;
            }
            if ((n14 = this.shouldHideReactions) == 0) {
                n15 = n14;
            }
            return ((n10 * 31 + n13) * 31 + n16) * 31 + n15;
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ArticleActivityArguments(articleId=");
            stringBuilder.append(this.articleId);
            stringBuilder.append(", metricPlace=");
            stringBuilder.append(this.metricPlace);
            stringBuilder.append(", isFromSearchBrowse=");
            stringBuilder.append(this.isFromSearchBrowse);
            stringBuilder.append(", shouldHideReactions=");
            stringBuilder.append(this.shouldHideReactions);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    @Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$Companion;", "", "()V", "ARTICLE_ID", "", "IS_SEARCH_BROWSE", "METRIC_PLACE", "SHOULD_HIDE_REACTIONS", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "articleActivityArguments", "Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "getArguments", "intent", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent buildIntent(@NotNull Context context, @NotNull ArticleActivityArguments articleActivityArguments) {
            y.j(context, "context");
            y.j(articleActivityArguments, "articleActivityArguments");
            context = new Intent(context, ArticleActivity.class);
            context.setFlags(0x10000000);
            context.putExtra(ArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
            context.putExtra(ArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
            context.putExtra(ArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
            context.putExtra(ArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
            return context;
        }

        @SuppressLint(value={"WrongConstant"})
        @NotNull
        public final ArticleActivityArguments getArguments(@NotNull Intent intent) {
            y.j(intent, "intent");
            String string2 = intent.getStringExtra(ArticleActivity.ARTICLE_ID);
            String string3 = "";
            String string4 = string2;
            if (string2 == null) {
                string4 = "";
            }
            if ((string2 = intent.getStringExtra(ArticleActivity.METRIC_PLACE)) != null) {
                string3 = string2;
            }
            return new ArticleActivityArguments(string4, string3, intent.getBooleanExtra(ArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(ArticleActivity.SHOULD_HIDE_REACTIONS, false));
        }
    }
}

