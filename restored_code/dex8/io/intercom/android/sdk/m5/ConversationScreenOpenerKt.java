/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package io.intercom.android.sdk.m5;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001aK\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\b\u0002\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2={"Landroid/content/Context;", "context", "", "conversationId", "Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "lastParticipatingAdmin", "Landroid/content/Intent;", "getConversationIntent", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/models/LastParticipatingAdmin;)Landroid/content/Intent;", "initialMessage", "", "launchedProgrammatically", "articleId", "Ljava/lang/Class;", "activityName", "getComposerIntent", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Landroid/content/Intent;", "Lkotlin/k0;", "openComposer", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nConversationScreenOpener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenOpener.kt\nio/intercom/android/sdk/m5/ConversationScreenOpenerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class ConversationScreenOpenerKt {
    @NotNull
    public static final Intent getComposerIntent(@NotNull Context context, @NotNull String string2, boolean bl2, @Nullable String string3, @Nullable String string4, @NotNull Class<?> clazz) {
        y.j(context, "context");
        y.j(string2, "initialMessage");
        y.j(clazz, "activityName");
        return IntercomRootActivityArgsKt.getIntentForArgs(context, new IntercomRootActivityArgs.ConversationScreenArgs(string4, string2, bl2, string3), clazz);
    }

    public static /* synthetic */ Intent getComposerIntent$default(Context context, String string2, boolean bl2, String string3, String string4, Class clazz, int n10, Object object) {
        if ((n10 & 2) != 0) {
            string2 = "";
        }
        if ((n10 & 0x20) != 0) {
            clazz = IntercomRootActivity.class;
        }
        return ConversationScreenOpenerKt.getComposerIntent(context, string2, bl2, string3, string4, clazz);
    }

    @NotNull
    public static final Intent getConversationIntent(@NotNull Context context, @Nullable String string2, @Nullable LastParticipatingAdmin lastParticipatingAdmin) {
        y.j(context, "context");
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(string2, "", false, null), null, 4, null);
    }

    public static final void openComposer(@NotNull Context context, @NotNull String string2, boolean bl2, @Nullable String string3, @Nullable String string4) {
        y.j(context, "context");
        y.j(string2, "initialMessage");
        context.startActivity(ConversationScreenOpenerKt.getComposerIntent$default(context, string2, bl2, string3, string4, null, 32, null));
    }

    public static /* synthetic */ void openComposer$default(Context context, String string2, boolean bl2, String string3, String string4, int n10, Object object) {
        if ((n10 & 2) != 0) {
            string2 = "";
        }
        if ((n10 & 4) != 0) {
            bl2 = false;
        }
        if ((n10 & 8) != 0) {
            string3 = null;
        }
        if ((n10 & 0x10) != 0) {
            string4 = null;
        }
        ConversationScreenOpenerKt.openComposer(context, string2, bl2, string3, string4);
    }
}

