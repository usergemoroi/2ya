/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.BackgroundKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$DayDividerKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/k0;", "DayDivider", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DayDividerPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nDayDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayDivider.kt\nio/intercom/android/sdk/m5/components/DayDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,49:1\n154#2:50\n91#3,2:51\n93#3:81\n97#3:86\n79#4,11:53\n92#4:85\n456#5,8:64\n464#5,3:78\n467#5,3:82\n3737#6,6:72\n*S KotlinDebug\n*F\n+ 1 DayDivider.kt\nio/intercom/android/sdk/m5/components/DayDividerKt\n*L\n31#1:50\n22#1:51,2\n22#1:81\n22#1:86\n22#1:53,11\n22#1:85\n22#1:64,8\n22#1:78,3\n22#1:82,3\n22#1:72,6\n*E\n"})
public final class DayDividerKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void DayDivider(@NotNull String string2, @Nullable Modifier modifier, @Nullable Composer composer, int n10, int n13) {
        int n14;
        int n15;
        y.j(string2, "text");
        composer = composer.startRestartGroup(2031997384);
        if ((n13 & 1) != 0) {
            n15 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n15 = composer.changed((Object)string2) ? 4 : 2;
            n15 |= n10;
        } else {
            n15 = n10;
        }
        int n16 = n13 & 2;
        if (n16 != 0) {
            n14 = n15 | 0x30;
        } else {
            n14 = n15;
            if ((n10 & 0x70) == 0) {
                n14 = composer.changed((Object)modifier) ? 32 : 16;
                n14 = n15 | n14;
            }
        }
        if ((n14 & 0x5B) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (n16 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)2031997384, (int)n14, (int)-1, (String)"io.intercom.android.sdk.m5.components.DayDivider (DayDivider.kt:17)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
            Modifier modifier2 = SizeKt.wrapContentSize$default((Modifier)modifier, null, (boolean)false, (int)3, null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            n16 = IntercomTheme.$stable;
            modifier2 = PaddingKt.padding-VpY3zN4((Modifier)BackgroundKt.background-bw27NRU((Modifier)modifier2, (long)intercomTheme.getColors(composer, n16).getTimestampBackground-0d7_KjU(), (Shape)MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getMedium()), (float)Dp.constructor-impl((float)12), (float)Dp.constructor-impl((float)4));
            composer.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicy = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, (Alignment.Vertical)vertical, (Composer)composer, (int)54);
            composer.startReplaceableGroup(-1323940314);
            n15 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            vertical = composer.getCurrentCompositionLocalMap();
            horizontalOrVertical = ComposeUiNode.Companion;
            a a14 = horizontalOrVertical.getConstructor();
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
            Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)horizontalOrVertical.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)vertical, (p)horizontalOrVertical.getSetResolvedCompositionLocals());
            vertical = horizontalOrVertical.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n15)) {
                a14.updateRememberedValue((Object)n15);
                a14.apply((Object)n15, (p)vertical);
            }
            modifier2.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            modifier2 = RowScopeInstance.INSTANCE;
            intercomTheme = intercomTheme.getTypography(composer, n16).getType04Point5();
            TextKt.Text--4IGK_g((String)string2, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)intercomTheme, (Composer)composer, (int)(n14 & 0xE), (int)0, (int)65534);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(string2, modifier, n10, n13){
                final int $$changed;
                final int $$default;
                final Modifier $modifier;
                final String $text;
                {
                    this.$text = string2;
                    this.$modifier = modifier;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    DayDividerKt.DayDivider(this.$text, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void DayDividerPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(2024327134);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)2024327134, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.DayDividerPreview (DayDivider.kt:41)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DayDividerKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    DayDividerKt.DayDividerPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }
}

