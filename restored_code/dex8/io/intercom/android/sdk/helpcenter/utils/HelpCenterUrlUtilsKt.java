/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000\u00a2\u0006\u0004\b\u0007\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0006\u0010\u000e\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0006\u00a8\u0006\u001b"}, d2={"", "url", "", "helpCenterUrls", "", "isHelpCenterArticleUrl", "(Ljava/lang/String;Ljava/util/Set;)Z", "isHelpCenterCollectionUrl", "lastSegment", "extractIdFromLastSegment", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "articleId", "place", "shouldHideReactions", "Lkotlin/k0;", "openArticle", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V", "collectionId", "openCollection", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "", "collectionIds", "openCollections", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V", "isHelpCenterUrl", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nHelpCenterUrlUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterUrlUtils.kt\nio/intercom/android/sdk/helpcenter/utils/HelpCenterUrlUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1747#2,3:67\n*S KotlinDebug\n*F\n+ 1 HelpCenterUrlUtils.kt\nio/intercom/android/sdk/helpcenter/utils/HelpCenterUrlUtilsKt\n*L\n65#1:67,3\n*E\n"})
public final class HelpCenterUrlUtilsKt {
    @NotNull
    public static final String extractIdFromLastSegment(@NotNull String object) {
        y.j(object, "lastSegment");
        object = p.G0((CharSequence)object, (String[])new String[]{"-"}, (boolean)false, (int)0, (int)6, null);
        if (((Collection)object).isEmpty() ^ true) {
            return (String)object.get(0);
        }
        return "";
    }

    public static final boolean isHelpCenterArticleUrl(@NotNull String string2, @NotNull Set<String> set) {
        boolean bl2;
        y.j(string2, "url");
        y.j(set, "helpCenterUrls");
        boolean bl3 = HelpCenterUrlUtilsKt.isHelpCenterUrl(string2, set);
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (p.R((CharSequence)string2, (CharSequence)"/articles/", (boolean)false, (int)2, null)) {
                bl4 = true;
            }
        }
        return bl4;
    }

    public static final boolean isHelpCenterCollectionUrl(@NotNull String string2, @NotNull Set<String> set) {
        boolean bl2;
        y.j(string2, "url");
        y.j(set, "helpCenterUrls");
        boolean bl3 = HelpCenterUrlUtilsKt.isHelpCenterUrl(string2, set);
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (p.R((CharSequence)string2, (CharSequence)"/collections/", (boolean)false, (int)2, null)) {
                bl4 = true;
            }
        }
        return bl4;
    }

    private static final boolean isHelpCenterUrl(String string2, Set<String> object) {
        boolean bl2;
        block3: {
            object = (Iterable)object;
            bl2 = object instanceof Collection;
            boolean bl3 = false;
            if (bl2 && ((Collection)object).isEmpty()) {
                bl2 = bl3;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl3;
                    if (!object.hasNext()) break block3;
                } while (!p.M((String)string2, (String)((String)object.next()), (boolean)false, (int)2, null));
                bl2 = true;
            }
        }
        return bl2;
    }

    @JvmOverloads
    public static final void openArticle(@NotNull Context context, @NotNull String string2, @NotNull String string3) {
        y.j(context, "context");
        y.j(string2, "articleId");
        y.j(string3, "place");
        HelpCenterUrlUtilsKt.openArticle$default(context, string2, string3, false, 8, null);
    }

    @JvmOverloads
    public static final void openArticle(@NotNull Context context, @NotNull String string2, @NotNull String string3, boolean bl2) {
        y.j(context, "context");
        y.j(string2, "articleId");
        y.j(string3, "place");
        context.startActivity(ArticleActivity.Companion.buildIntent(context, new ArticleActivity.ArticleActivityArguments(string2, string3, false, bl2, 4, null)));
    }

    public static /* synthetic */ void openArticle$default(Context context, String string2, String string3, boolean bl2, int n10, Object object) {
        if ((n10 & 8) != 0) {
            bl2 = false;
        }
        HelpCenterUrlUtilsKt.openArticle(context, string2, string3, bl2);
    }

    public static final void openCollection(@NotNull Context context, @NotNull String string2, @NotNull String string3) {
        y.j(context, "context");
        y.j(string2, "collectionId");
        y.j(string3, "place");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, string2, string3);
    }

    public static final void openCollections(@NotNull Context context, @NotNull List<String> list, @NotNull String string2) {
        y.j(context, "context");
        y.j(list, "collectionIds");
        y.j(string2, "place");
        if (list.size() == 1) {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, (String)t.r0(list), string2);
        } else {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, list, string2);
        }
    }
}

