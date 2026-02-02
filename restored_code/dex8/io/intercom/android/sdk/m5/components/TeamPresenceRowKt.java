/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScope
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.e
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.CompositionLocalMap
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.node.ComposeUiNode$Companion
 *  androidx.compose.ui.platform.TestTagKt
 *  androidx.compose.ui.res.StringResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.ComposableSingletons$TeamPresenceRowKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Lkotlin/k0;", "TeamPresenceRow", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "TeamPresenceRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTeamPresenceRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamPresenceRow.kt\nio/intercom/android/sdk/m5/components/TeamPresenceRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,58:1\n154#2:59\n154#2:95\n87#3,6:60\n93#3:94\n97#3:100\n79#4,11:66\n92#4:99\n456#5,8:77\n464#5,3:91\n467#5,3:96\n3737#6,6:85\n*S KotlinDebug\n*F\n+ 1 TeamPresenceRow.kt\nio/intercom/android/sdk/m5/components/TeamPresenceRowKt\n*L\n25#1:59\n37#1:95\n23#1:60,6\n23#1:94\n23#1:100\n23#1:66,11\n23#1:99\n23#1:77,8\n23#1:91,3\n23#1:96,3\n23#1:85,6\n*E\n"})
public final class TeamPresenceRowKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TeamPresenceRow(@Nullable Modifier modifier, @NotNull List<AvatarWrapper> list, @Nullable Composer composer, int n10, int n13) {
        y.j(list, "avatars");
        composer = composer.startRestartGroup(1370953565);
        if ((n13 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)1370953565, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TeamPresenceRow (TeamPresenceRow.kt:21)");
        }
        Modifier modifier2 = TestTagKt.testTag((Modifier)PaddingKt.padding-VpY3zN4((Modifier)modifier, (float)Dp.constructor-impl((float)16), (float)Dp.constructor-impl((float)12)), (String)"team_presence_row");
        Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        vertical = RowKt.rowMeasurePolicy((Arrangement.Horizontal)Arrangement.INSTANCE.getStart(), (Alignment.Vertical)vertical, (Composer)composer, (int)48);
        composer.startReplaceableGroup(-1323940314);
        int n14 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
        CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a a14 = companion.getConstructor();
        modifier2 = LayoutKt.modifierMaterializerOf((Modifier)modifier2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(a14);
        } else {
            composer.useNode();
        }
        a14 = Updater.constructor-impl((Composer)composer);
        Updater.set-impl((Composer)a14, (Object)vertical, (p)companion.getSetMeasurePolicy());
        Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)companion.getSetResolvedCompositionLocals());
        vertical = companion.getSetCompositeKeyHash();
        if (a14.getInserting() || !y.e(a14.rememberedValue(), n14)) {
            a14.updateRememberedValue((Object)n14);
            a14.apply((Object)n14, (p)vertical);
        }
        modifier2.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
        composer.startReplaceableGroup(2058660585);
        vertical = e.a((RowScope)RowScopeInstance.INSTANCE, (Modifier)Modifier.Companion, (float)1.0f, (boolean)false, (int)2, null);
        TextKt.Text--4IGK_g((String)StringResources_androidKt.stringResource((int)R.string.intercom_the_team_can_help_if_needed, (Composer)composer, (int)0), (Modifier)vertical, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)TextStyle.copy-p1EtxEg$default((TextStyle)MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBody2(), (long)ColorExtensionsKt.toComposeColor$default("#757575", 0.0f, 1, null), (long)0L, null, null, null, null, null, (long)0L, null, null, null, (long)0L, null, null, null, (int)0, (int)0, (long)0L, null, null, null, (int)0, (int)0, null, (int)0xFFFFFE, null), (Composer)composer, (int)0, (int)0, (int)65532);
        AvatarGroupKt.AvatarGroup--J8mCjc(t.X0((Iterable)list, (int)3), null, Dp.constructor-impl((float)24), 0L, composer, 392, 10);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((composer = composer.endRestartGroup()) != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(modifier, list, n10, n13){
                final int $$changed;
                final int $$default;
                final List<AvatarWrapper> $avatars;
                final Modifier $modifier;
                {
                    this.$modifier = modifier;
                    this.$avatars = list;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TeamPresenceRowKt.TeamPresenceRow(this.$modifier, this.$avatars, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void TeamPresenceRowPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1211328616);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1211328616, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TeamPresenceRowPreview (TeamPresenceRow.kt:43)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(n10){
                final int $$changed;
                {
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TeamPresenceRowKt.access$TeamPresenceRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$TeamPresenceRowPreview(Composer composer, int n10) {
        TeamPresenceRowKt.TeamPresenceRowPreview(composer, n10);
    }
}

