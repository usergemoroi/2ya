/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.BorderStroke
 *  androidx.compose.foundation.BorderStrokeKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Vertical
 *  androidx.compose.foundation.layout.ColumnKt
 *  androidx.compose.foundation.layout.ColumnScopeInstance
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.material.CardKt
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableInferredTarget
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.CompositionLocalMap
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.node.ComposeUiNode$Companion
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$HomeCardScaffoldKt;
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

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a4\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\b\u0006H\u0001\u00a2\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "", "cardTitle", "Lkotlin/Function0;", "Lkotlin/k0;", "Landroidx/compose/runtime/Composable;", "content", "HomeCardScaffold", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/p;Landroidx/compose/runtime/Composer;II)V", "HomeCardScaffoldPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nHomeCardScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCardScaffold.kt\nio/intercom/android/sdk/m5/components/HomeCardScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n154#2:61\n164#2:62\n*S KotlinDebug\n*F\n+ 1 HomeCardScaffold.kt\nio/intercom/android/sdk/m5/components/HomeCardScaffoldKt\n*L\n23#1:61\n24#1:62\n*E\n"})
public final class HomeCardScaffoldKt {
    @Composable
    @ComposableInferredTarget(scheme="[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HomeCardScaffold(@Nullable Modifier modifier, @NotNull String string2, @NotNull p<? super Composer, ? super Integer, k0> p14, @Nullable Composer composer, int n10, int n13) {
        int n14;
        int n15;
        y.j(string2, "cardTitle");
        y.j(p14, "content");
        Composer composer2 = composer.startRestartGroup(1757030792);
        int n16 = n13 & 1;
        if (n16 != 0) {
            n15 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n14 = composer2.changed((Object)modifier) ? 4 : 2;
            n15 = n14 | n10;
        } else {
            n15 = n10;
        }
        if ((n13 & 2) != 0) {
            n14 = n15 | 0x30;
        } else {
            n14 = n15;
            if ((n10 & 0x70) == 0) {
                n14 = composer2.changed((Object)string2) ? 32 : 16;
                n14 = n15 | n14;
            }
        }
        if ((n13 & 4) != 0) {
            n15 = n14 | 0x180;
        } else {
            n15 = n14;
            if ((n10 & 0x380) == 0) {
                n15 = composer2.changedInstance(p14) ? 256 : 128;
                n15 = n14 | n15;
            }
        }
        if ((n15 & 0x2DB) == 146 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            composer = modifier;
        } else {
            if (n16 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1757030792, (int)n15, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeCardScaffold (HomeCardScaffold.kt:15)");
            }
            float f11 = Dp.constructor-impl((float)2);
            CardKt.Card-F-jzlyU((Modifier)modifier, null, (long)0L, (long)0L, (BorderStroke)BorderStrokeKt.BorderStroke-cXLIe8U((float)Dp.constructor-impl((float)((float)0.5)), (long)IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).getCardBorder-0d7_KjU()), (float)f11, (p)ComposableLambdaKt.composableLambda((Composer)composer2, (int)-1294098171, (boolean)true, (Object)new p<Composer, Integer, k0>(string2, n15, p14){
                final int $$dirty;
                final String $cardTitle;
                final p<Composer, Integer, k0> $content;
                {
                    this.$cardTitle = string2;
                    this.$$dirty = n10;
                    this.$content = p14;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)-1294098171, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeCardScaffold.<anonymous> (HomeCardScaffold.kt:24)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier modifier = PaddingKt.padding-qDBjuR0$default((Modifier)companion, (float)0.0f, (float)0.0f, (float)0.0f, (float)Dp.constructor-impl((float)4), (int)7, null);
                        String string2 = this.$cardTitle;
                        n10 = this.$$dirty;
                        p<Composer, Integer, k0> p14 = this.$content;
                        composer.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)Arrangement.INSTANCE.getTop(), (Alignment.Horizontal)Alignment.Companion.getStart(), (Composer)composer, (int)0);
                        composer.startReplaceableGroup(-1323940314);
                        int n13 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                        CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        a a14 = companion2.getConstructor();
                        modifier = LayoutKt.modifierMaterializerOf((Modifier)modifier);
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
                        Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)companion2.getSetMeasurePolicy());
                        Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)companion2.getSetResolvedCompositionLocals());
                        companion2 = companion2.getSetCompositeKeyHash();
                        if (a14.getInserting() || !y.e(a14.rememberedValue(), n13)) {
                            a14.updateRememberedValue((Object)n13);
                            a14.apply((Object)n13, (p)companion2);
                        }
                        modifier.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                        composer.startReplaceableGroup(2058660585);
                        companion2 = ColumnScopeInstance.INSTANCE;
                        TextKt.Text--4IGK_g((String)string2, (Modifier)PaddingKt.padding-VpY3zN4$default((Modifier)PaddingKt.padding-qDBjuR0$default((Modifier)companion, (float)0.0f, (float)Dp.constructor-impl((float)16), (float)0.0f, (float)Dp.constructor-impl((float)6), (int)5, null), (float)Dp.constructor-impl((float)20), (float)0.0f, (int)2, null), (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04SemiBold(), (Composer)composer, (int)(n10 >> 3 & 0xE | 0x30), (int)0, (int)65532);
                        p14.invoke((Object)composer, (Object)(n10 >> 6 & 0xE));
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), (Composer)composer2, (int)(n15 & 0xE | 0x1B0000), (int)14);
            composer = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer = modifier;
            }
        }
        modifier = composer2.endRestartGroup();
        if (modifier != null) {
            modifier.updateScope((p)new p<Composer, Integer, k0>((Modifier)composer, string2, p14, n10, n13){
                final int $$changed;
                final int $$default;
                final String $cardTitle;
                final p<Composer, Integer, k0> $content;
                final Modifier $modifier;
                {
                    this.$modifier = modifier;
                    this.$cardTitle = string2;
                    this.$content = p14;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    HomeCardScaffoldKt.HomeCardScaffold(this.$modifier, this.$cardTitle, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void HomeCardScaffoldPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1294989986);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1294989986, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeCardScaffoldPreview (HomeCardScaffold.kt:42)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeCardScaffoldKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    HomeCardScaffoldKt.access$HomeCardScaffoldPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$HomeCardScaffoldPreview(Composer composer, int n10) {
        HomeCardScaffoldKt.HomeCardScaffoldPreview(composer, n10);
    }
}

