/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.BorderKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.foundation.shape.CornerBasedShape
 *  androidx.compose.material.IconKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.material.icons.Icons$Outlined
 *  androidx.compose.material.icons.outlined.InfoKt
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
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.graphics.vector.ImageVector
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$TemporaryExpectationsComponentKt;
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

@Metadata(d1={"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\t\u0010\b\u00a8\u0006\n"}, d2={"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/k0;", "TemporaryExpectationsComponent", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TemporaryExpectationsPreview", "(Landroidx/compose/runtime/Composer;I)V", "TemporaryExpectationsShortTextPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTemporaryExpectationsComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemporaryExpectationsComponent.kt\nio/intercom/android/sdk/m5/components/TemporaryExpectationsComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,75:1\n154#2:76\n154#2:77\n154#2:109\n154#2:110\n91#3,2:78\n93#3:108\n97#3:115\n79#4,11:80\n92#4:114\n456#5,8:91\n464#5,3:105\n467#5,3:111\n3737#6,6:99\n*S KotlinDebug\n*F\n+ 1 TemporaryExpectationsComponent.kt\nio/intercom/android/sdk/m5/components/TemporaryExpectationsComponentKt\n*L\n35#1:76\n36#1:77\n41#1:109\n44#1:110\n30#1:78,2\n30#1:108\n30#1:115\n30#1:80,11\n30#1:114\n30#1:91,8\n30#1:105,3\n30#1:111,3\n30#1:99,6\n*E\n"})
public final class TemporaryExpectationsComponentKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TemporaryExpectationsComponent(@NotNull String string2, @Nullable Modifier modifier, @Nullable Composer composer, int n10, int n13) {
        int n14;
        int n15;
        y.j(string2, "text");
        composer = composer.startRestartGroup(-364172600);
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
                ComposerKt.traceEventStart((int)-364172600, (int)n14, (int)-1, (String)"io.intercom.android.sdk.m5.components.TemporaryExpectationsComponent (TemporaryExpectationsComponent.kt:24)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            n15 = MaterialTheme.$stable;
            CornerBasedShape cornerBasedShape = materialTheme.getShapes(composer, n15).getMedium();
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.getStart();
            Object object = Alignment.Companion.getCenterVertically();
            materialTheme = PaddingKt.padding-3ABfNKs((Modifier)BorderKt.border-xT4_qwU((Modifier)SizeKt.fillMaxWidth$default((Modifier)modifier, (float)0.0f, (int)1, null), (float)Dp.constructor-impl((float)1.0f), (long)Color.copy-wmQWz5c$default((long)materialTheme.getColors(composer, n15).getOnSurface-0d7_KjU(), (float)0.05f, (float)0.0f, (float)0.0f, (float)0.0f, (int)14, null), (Shape)cornerBasedShape), (float)Dp.constructor-impl((float)12));
            composer.startReplaceableGroup(693286680);
            horizontal = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontal, (Alignment.Vertical)object, (Composer)composer, (int)54);
            composer.startReplaceableGroup(-1323940314);
            n15 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            object = composer.getCurrentCompositionLocalMap();
            cornerBasedShape = ComposeUiNode.Companion;
            a a14 = cornerBasedShape.getConstructor();
            materialTheme = LayoutKt.modifierMaterializerOf((Modifier)materialTheme);
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
            Updater.set-impl((Composer)a14, (Object)horizontal, (p)cornerBasedShape.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)object, (p)cornerBasedShape.getSetResolvedCompositionLocals());
            horizontal = cornerBasedShape.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n15)) {
                a14.updateRememberedValue((Object)n15);
                a14.apply((Object)n15, (p)horizontal);
            }
            materialTheme.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            materialTheme = RowScopeInstance.INSTANCE;
            materialTheme = InfoKt.getInfo((Icons.Outlined)Icons.Outlined.INSTANCE);
            horizontal = Modifier.Companion;
            float f11 = 16;
            cornerBasedShape = SizeKt.size-3ABfNKs((Modifier)horizontal, (float)Dp.constructor-impl((float)f11));
            object = IntercomTheme.INSTANCE;
            n15 = IntercomTheme.$stable;
            IconKt.Icon-ww6aTOc((ImageVector)materialTheme, null, (Modifier)cornerBasedShape, (long)((IntercomTheme)object).getColors(composer, n15).getDescriptionText-0d7_KjU(), (Composer)composer, (int)432, (int)0);
            SpacerKt.Spacer((Modifier)SizeKt.width-3ABfNKs((Modifier)horizontal, (float)Dp.constructor-impl((float)f11)), (Composer)composer, (int)6);
            materialTheme = TextStyle.copy-p1EtxEg$default((TextStyle)((IntercomTheme)object).getTypography(composer, n15).getType04Point5(), (long)((IntercomTheme)object).getColors(composer, n15).getDescriptionText-0d7_KjU(), (long)0L, null, null, null, null, null, (long)0L, null, null, null, (long)0L, null, null, null, (int)0, (int)0, (long)0L, null, null, null, (int)0, (int)0, null, (int)0xFFFFFE, null);
            TextKt.Text--4IGK_g((String)string2, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)materialTheme, (Composer)composer, (int)(n14 & 0xE), (int)0, (int)65534);
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
                    TemporaryExpectationsComponentKt.TemporaryExpectationsComponent(this.$text, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TemporaryExpectationsPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(1533719285);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1533719285, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TemporaryExpectationsPreview (TemporaryExpectationsComponent.kt:53)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TemporaryExpectationsComponentKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    TemporaryExpectationsComponentKt.TemporaryExpectationsPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TemporaryExpectationsShortTextPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(1177241514);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1177241514, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TemporaryExpectationsShortTextPreview (TemporaryExpectationsComponent.kt:65)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TemporaryExpectationsComponentKt.INSTANCE.getLambda-4$intercom_sdk_base_release(), composer, 3072, 7);
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
                    TemporaryExpectationsComponentKt.TemporaryExpectationsShortTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }
}

