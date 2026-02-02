/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Vertical
 *  androidx.compose.foundation.layout.BoxKt
 *  androidx.compose.foundation.layout.BoxScopeInstance
 *  androidx.compose.foundation.layout.ColumnKt
 *  androidx.compose.foundation.layout.ColumnScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.material.IconKt
 *  androidx.compose.material.SurfaceKt
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
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.res.StringResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.functions.q
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\t\u0010\b\u00a8\u0006\n"}, d2={"Lio/intercom/android/sdk/m5/components/ErrorState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/k0;", "IntercomErrorScreen", "(Lio/intercom/android/sdk/m5/components/ErrorState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorScreenWithCTAPreview", "(Landroidx/compose/runtime/Composer;I)V", "ErrorScreenWithoutCTAPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
public final class IntercomErrorScreenKt {
    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ErrorScreenWithCTAPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(-2005095861);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-2005095861, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ErrorScreenWithCTAPreview (IntercomErrorScreen.kt:66)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    IntercomErrorScreenKt.ErrorScreenWithCTAPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ErrorScreenWithoutCTAPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(753957761);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)753957761, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ErrorScreenWithoutCTAPreview (IntercomErrorScreen.kt:74)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    IntercomErrorScreenKt.ErrorScreenWithoutCTAPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void IntercomErrorScreen(@NotNull ErrorState errorState, @Nullable Modifier modifier, @Nullable Composer composer, int n10, int n13) {
        int n14;
        int n15;
        y.j(errorState, "state");
        composer = composer.startRestartGroup(-45428996);
        if ((n13 & 1) != 0) {
            n15 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n15 = composer.changed((Object)errorState) ? 4 : 2;
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
                ComposerKt.traceEventStart((int)-45428996, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomErrorScreen (IntercomErrorScreen.kt:24)");
            }
            SurfaceKt.Surface-F-jzlyU((Modifier)SizeKt.fillMaxSize$default((Modifier)modifier, (float)0.0f, (int)1, null), null, (long)0L, (long)0L, null, (float)0.0f, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)666155072, (boolean)true, (Object)new p<Composer, Integer, k0>(errorState){
                final ErrorState $state;
                {
                    this.$state = errorState;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)666155072, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomErrorScreen.<anonymous> (IntercomErrorScreen.kt:30)");
                        }
                        Object object = Alignment.Companion;
                        Object object2 = object.getCenter();
                        ErrorState errorState = this.$state;
                        composer.startReplaceableGroup(733328855);
                        Modifier.Companion companion = Modifier.Companion;
                        MeasurePolicy measurePolicy = BoxKt.rememberBoxMeasurePolicy((Alignment)object2, (boolean)false, (Composer)composer, (int)6);
                        composer.startReplaceableGroup(-1323940314);
                        n10 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                        CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
                        object2 = ComposeUiNode.Companion;
                        a a14 = object2.getConstructor();
                        q q12 = LayoutKt.modifierMaterializerOf((Modifier)companion);
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
                        Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)object2.getSetMeasurePolicy());
                        Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)object2.getSetResolvedCompositionLocals());
                        compositionLocalMap = object2.getSetCompositeKeyHash();
                        if (a14.getInserting() || !y.e(a14.rememberedValue(), n10)) {
                            a14.updateRememberedValue((Object)n10);
                            a14.apply((Object)n10, (p)compositionLocalMap);
                        }
                        q12.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                        composer.startReplaceableGroup(2058660585);
                        q12 = BoxScopeInstance.INSTANCE;
                        object = object.getCenterHorizontally();
                        composer.startReplaceableGroup(-483455358);
                        compositionLocalMap = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)Arrangement.INSTANCE.getTop(), (Alignment.Horizontal)object, (Composer)composer, (int)48);
                        composer.startReplaceableGroup(-1323940314);
                        n10 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                        a14 = composer.getCurrentCompositionLocalMap();
                        q12 = object2.getConstructor();
                        object = LayoutKt.modifierMaterializerOf((Modifier)companion);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode((a)q12);
                        } else {
                            composer.useNode();
                        }
                        q12 = Updater.constructor-impl((Composer)composer);
                        Updater.set-impl((Composer)q12, (Object)compositionLocalMap, (p)object2.getSetMeasurePolicy());
                        Updater.set-impl((Composer)q12, (Object)a14, (p)object2.getSetResolvedCompositionLocals());
                        object2 = object2.getSetCompositeKeyHash();
                        if (q12.getInserting() || !y.e(q12.rememberedValue(), n10)) {
                            q12.updateRememberedValue((Object)n10);
                            q12.apply((Object)n10, (p)object2);
                        }
                        object.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                        composer.startReplaceableGroup(2058660585);
                        object2 = ColumnScopeInstance.INSTANCE;
                        IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)errorState.getIconId(), (Composer)composer, (int)0), null, (Modifier)SizeKt.size-3ABfNKs((Modifier)companion, (float)Dp.constructor-impl((float)32)), (long)0L, (Composer)composer, (int)440, (int)8);
                        float f11 = 16;
                        SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)companion, (float)Dp.constructor-impl((float)f11)), (Composer)composer, (int)6);
                        object = StringResources_androidKt.stringResource((int)errorState.getMessageResId(), (Composer)composer, (int)0);
                        object2 = IntercomTheme.INSTANCE;
                        n10 = IntercomTheme.$stable;
                        TextKt.Text--4IGK_g((String)object, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)((IntercomTheme)object2).getTypography(composer, n10).getType03(), (Composer)composer, (int)0, (int)0, (int)65534);
                        SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)companion, (float)Dp.constructor-impl((float)8)), (Composer)composer, (int)6);
                        object = errorState.getAdditionalMessageResId();
                        composer.startReplaceableGroup(1423942190);
                        if (object != null) {
                            TextKt.Text--4IGK_g((String)StringResources_androidKt.stringResource((int)((Number)object).intValue(), (Composer)composer, (int)0), null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)((IntercomTheme)object2).getTypography(composer, n10).getType04(), (Composer)composer, (int)0, (int)0, (int)65534);
                        }
                        composer.endReplaceableGroup();
                        SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)companion, (float)Dp.constructor-impl((float)f11)), (Composer)composer, (int)6);
                        composer.startReplaceableGroup(268091032);
                        if (errorState instanceof ErrorState.WithCTA) {
                            errorState = (ErrorState.WithCTA)errorState;
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(StringResources_androidKt.stringResource((int)((ErrorState.WithCTA)errorState).getCtaResId(), (Composer)composer, (int)0), null, null, ((ErrorState.WithCTA)errorState).getOnCtaClick(), composer, 0, 6);
                        }
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), (Composer)composer, (int)0x180000, (int)62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(errorState, modifier, n10, n13){
                final int $$changed;
                final int $$default;
                final Modifier $modifier;
                final ErrorState $state;
                {
                    this.$state = errorState;
                    this.$modifier = modifier;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    IntercomErrorScreenKt.IntercomErrorScreen(this.$state, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }
}

