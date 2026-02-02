/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.MutableState
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SnapshotStateKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.platform.AbstractComposeView
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AbstractComposeView;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010A\u001a\u00020@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\b\b\u0002\u0010D\u001a\u00020\u0015\u00a2\u0006\u0004\bE\u0010FJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\u0003\u0010\u0004R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR7\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R;\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010-\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\b\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00102\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b1\u0010\b\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R/\u00107\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\b\u001a\u0004\b5\u0010\n\"\u0004\b6\u0010\fR/\u0010;\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u0010\b\u001a\u0004\b9\u0010\n\"\u0004\b:\u0010\fR/\u0010?\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b<\u0010\b\u001a\u0004\b=\u0010\n\"\u0004\b>\u0010\f\u00a8\u0006G"}, d2={"Lio/intercom/android/sdk/m5/components/TopActionBar;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/k0;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "<set-?>", "title$delegate", "Landroidx/compose/runtime/MutableState;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "subtitle$delegate", "getSubtitle", "()Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;", "setSubtitle", "(Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ActualStringOrRes;)V", "subtitle", "", "subtitleIcon$delegate", "getSubtitleIcon", "()Ljava/lang/Integer;", "setSubtitleIcon", "(Ljava/lang/Integer;)V", "subtitleIcon", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars$delegate", "getAvatars", "()Ljava/util/List;", "setAvatars", "(Ljava/util/List;)V", "avatars", "Lkotlin/Function0;", "onBackClick$delegate", "getOnBackClick", "()Lkotlin/jvm/functions/a;", "setOnBackClick", "(Lkotlin/jvm/functions/a;)V", "onBackClick", "", "isActive$delegate", "isActive", "()Z", "setActive", "(Z)V", "isAIBot$delegate", "isAIBot", "setAIBot", "bgColor$delegate", "getBgColor", "setBgColor", "bgColor", "contentColor$delegate", "getContentColor", "setContentColor", "contentColor", "subtitleColor$delegate", "getSubtitleColor", "setSubtitleColor", "subtitleColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTopActionBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopActionBar.kt\nio/intercom/android/sdk/m5/components/TopActionBar\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,289:1\n81#2:290\n107#2,2:291\n81#2:293\n107#2,2:294\n81#2:296\n107#2,2:297\n81#2:299\n107#2,2:300\n81#2:302\n107#2,2:303\n81#2:305\n107#2,2:306\n81#2:308\n107#2,2:309\n81#2:311\n107#2,2:312\n81#2:314\n107#2,2:315\n81#2:317\n107#2,2:318\n*S KotlinDebug\n*F\n+ 1 TopActionBar.kt\nio/intercom/android/sdk/m5/components/TopActionBar\n*L\n161#1:290\n161#1:291,2\n162#1:293\n162#1:294,2\n163#1:296\n163#1:297,2\n164#1:299\n164#1:300,2\n165#1:302\n165#1:303,2\n166#1:305\n166#1:306,2\n167#1:308\n167#1:309,2\n168#1:311\n168#1:312,2\n169#1:314\n169#1:315,2\n170#1:317\n170#1:318,2\n*E\n"})
public final class TopActionBar
extends AbstractComposeView {
    @NotNull
    private final MutableState avatars$delegate;
    @NotNull
    private final MutableState bgColor$delegate;
    @NotNull
    private final MutableState contentColor$delegate;
    @NotNull
    private final MutableState isAIBot$delegate;
    @NotNull
    private final MutableState isActive$delegate;
    @NotNull
    private final MutableState onBackClick$delegate;
    @NotNull
    private final MutableState subtitle$delegate;
    @NotNull
    private final MutableState subtitleColor$delegate;
    @NotNull
    private final MutableState subtitleIcon$delegate;
    @NotNull
    private final MutableState title$delegate;

    @JvmOverloads
    public TopActionBar(@NotNull Context context) {
        y.j(context, "context");
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public TopActionBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        y.j(context, "context");
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public TopActionBar(@NotNull Context object, @Nullable AttributeSet attributeSet, int n10) {
        y.j(object, "context");
        super(object, attributeSet, n10);
        this.title$delegate = SnapshotStateKt.mutableStateOf$default((Object)"", null, (int)2, null);
        this.subtitle$delegate = SnapshotStateKt.mutableStateOf$default((Object)new TicketTimelineCardState.ActualStringOrRes.ActualString(""), null, (int)2, null);
        this.subtitleIcon$delegate = SnapshotStateKt.mutableStateOf$default(null, null, (int)2, null);
        this.avatars$delegate = SnapshotStateKt.mutableStateOf$default((Object)t.m(), null, (int)2, null);
        this.onBackClick$delegate = SnapshotStateKt.mutableStateOf$default(null, null, (int)2, null);
        object = Boolean.FALSE;
        this.isActive$delegate = SnapshotStateKt.mutableStateOf$default((Object)object, null, (int)2, null);
        this.isAIBot$delegate = SnapshotStateKt.mutableStateOf$default((Object)object, null, (int)2, null);
        this.bgColor$delegate = SnapshotStateKt.mutableStateOf$default(null, null, (int)2, null);
        this.contentColor$delegate = SnapshotStateKt.mutableStateOf$default(null, null, (int)2, null);
        this.subtitleColor$delegate = SnapshotStateKt.mutableStateOf$default(null, null, (int)2, null);
    }

    public /* synthetic */ TopActionBar(Context context, AttributeSet attributeSet, int n10, int n13, p p14) {
        if ((n13 & 2) != 0) {
            attributeSet = null;
        }
        if ((n13 & 4) != 0) {
            n10 = 0;
        }
        this(context, attributeSet, n10);
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer, int n10) {
        int n13;
        composer = composer.startRestartGroup(1923058969);
        if ((n10 & 0xE) == 0) {
            n13 = composer.changed((Object)this) ? 4 : 2;
            n13 |= n10;
        } else {
            n13 = n10;
        }
        if ((n13 & 0xB) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1923058969, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TopActionBar.Content (TopActionBar.kt:172)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, (kotlin.jvm.functions.p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)1419609263, (boolean)true, (Object)new kotlin.jvm.functions.p<Composer, Integer, k0>(this){
                final TopActionBar this$0;
                {
                    this.this$0 = topActionBar;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)1419609263, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TopActionBar.Content.<anonymous> (TopActionBar.kt:173)");
                        }
                        String string2 = this.this$0.getTitle();
                        String string3 = this.this$0.getSubtitle().getText(composer, 0);
                        List<AvatarWrapper> list = this.this$0.getAvatars();
                        a<k0> a14 = this.this$0.getOnBackClick();
                        boolean bl2 = this.this$0.isActive();
                        Integer n13 = this.this$0.getSubtitleIcon();
                        boolean bl3 = this.this$0.isAIBot();
                        String string4 = this.this$0.getBgColor();
                        Object var12_11 = null;
                        string4 = string4 != null ? Color.box-impl((long)ColorExtensionsKt.toComposeColor$default(string4, 0.0f, 1, null)) : null;
                        composer.startReplaceableGroup(-134673049);
                        long l10 = string4 == null ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getHeader-0d7_KjU() : string4.unbox-impl();
                        composer.endReplaceableGroup();
                        string4 = this.this$0.getContentColor();
                        string4 = string4 != null ? Color.box-impl((long)ColorExtensionsKt.toComposeColor$default(string4, 0.0f, 1, null)) : null;
                        composer.startReplaceableGroup(-134672960);
                        long l11 = string4 == null ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getOnHeader-0d7_KjU() : string4.unbox-impl();
                        composer.endReplaceableGroup();
                        String string5 = this.this$0.getSubtitleColor();
                        string4 = var12_11;
                        if (string5 != null) {
                            string4 = Color.box-impl((long)ColorExtensionsKt.toComposeColor$default(string5, 0.0f, 1, null));
                        }
                        composer.startReplaceableGroup(-134672863);
                        long l13 = string4 == null ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getOnHeader-0d7_KjU() : string4.unbox-impl();
                        composer.endReplaceableGroup();
                        TopActionBarKt.TopActionBar-qaS153M(null, string2, string3, n13, list, a14, null, bl2, l10, l11, l13, null, bl3, null, composer, 32768, 0, 10305);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<Composer, Integer, k0>(this, n10){
                final int $$changed;
                final TopActionBar $tmp0_rcvr;
                {
                    this.$tmp0_rcvr = topActionBar;
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    this.$tmp0_rcvr.Content(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return (List)this.avatars$delegate.getValue();
    }

    @Nullable
    public final String getBgColor() {
        return (String)this.bgColor$delegate.getValue();
    }

    @Nullable
    public final String getContentColor() {
        return (String)this.contentColor$delegate.getValue();
    }

    @Nullable
    public final a<k0> getOnBackClick() {
        return (a)this.onBackClick$delegate.getValue();
    }

    @NotNull
    public final TicketTimelineCardState.ActualStringOrRes getSubtitle() {
        return (TicketTimelineCardState.ActualStringOrRes)this.subtitle$delegate.getValue();
    }

    @Nullable
    public final String getSubtitleColor() {
        return (String)this.subtitleColor$delegate.getValue();
    }

    @Nullable
    public final Integer getSubtitleIcon() {
        return (Integer)this.subtitleIcon$delegate.getValue();
    }

    @NotNull
    public final String getTitle() {
        return (String)this.title$delegate.getValue();
    }

    public final boolean isAIBot() {
        return (Boolean)this.isAIBot$delegate.getValue();
    }

    public final boolean isActive() {
        return (Boolean)this.isActive$delegate.getValue();
    }

    public final void setAIBot(boolean bl2) {
        this.isAIBot$delegate.setValue((Object)bl2);
    }

    public final void setActive(boolean bl2) {
        this.isActive$delegate.setValue((Object)bl2);
    }

    public final void setAvatars(@NotNull List<AvatarWrapper> list) {
        y.j(list, "<set-?>");
        this.avatars$delegate.setValue(list);
    }

    public final void setBgColor(@Nullable String string2) {
        this.bgColor$delegate.setValue((Object)string2);
    }

    public final void setContentColor(@Nullable String string2) {
        this.contentColor$delegate.setValue((Object)string2);
    }

    public final void setOnBackClick(@Nullable a<k0> a14) {
        this.onBackClick$delegate.setValue(a14);
    }

    public final void setSubtitle(@NotNull TicketTimelineCardState.ActualStringOrRes actualStringOrRes) {
        y.j(actualStringOrRes, "<set-?>");
        this.subtitle$delegate.setValue((Object)actualStringOrRes);
    }

    public final void setSubtitleColor(@Nullable String string2) {
        this.subtitleColor$delegate.setValue((Object)string2);
    }

    public final void setSubtitleIcon(@Nullable Integer n10) {
        this.subtitleIcon$delegate.setValue((Object)n10);
    }

    public final void setTitle(@NotNull String string2) {
        y.j(string2, "<set-?>");
        this.title$delegate.setValue((Object)string2);
    }
}

