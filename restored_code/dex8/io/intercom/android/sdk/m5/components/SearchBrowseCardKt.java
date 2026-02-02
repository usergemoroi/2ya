/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  androidx.compose.foundation.BackgroundKt
 *  androidx.compose.foundation.BorderStroke
 *  androidx.compose.foundation.BorderStrokeKt
 *  androidx.compose.foundation.ClickableKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.Arrangement$Vertical
 *  androidx.compose.foundation.layout.BoxKt
 *  androidx.compose.foundation.layout.BoxScopeInstance
 *  androidx.compose.foundation.layout.ColumnKt
 *  androidx.compose.foundation.layout.ColumnScopeInstance
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScope
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.foundation.layout.e
 *  androidx.compose.material.CardKt
 *  androidx.compose.material.IconKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.CompositionLocal
 *  androidx.compose.runtime.CompositionLocalMap
 *  androidx.compose.runtime.EffectsKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Companion
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.draw.ClipKt
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.platform.AndroidCompositionLocals_androidKt
 *  androidx.compose.ui.platform.TestTagKt
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.res.StringResources_androidKt
 *  androidx.compose.ui.text.font.FontWeight
 *  androidx.compose.ui.text.style.TextOverflow
 *  androidx.compose.ui.unit.Dp
 *  kotlin.collections.t
 *  kotlin.coroutines.intrinsics.b
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.functions.q
 */
package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.components.TeamPresenceRowKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.v;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;", "helpCenterData", "", "isSearchFirstEnabled", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "accessToTeammateEnabled", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lkotlin/k0;", "SearchBrowseCard", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;ZLjava/util/List;ZLio/intercom/android/sdk/metrics/MetricTracker;Landroidx/compose/runtime/Composer;I)V", "PreviewSearchBrowse", "(Landroidx/compose/runtime/Composer;I)V", "PreviewSearchBrowseNoSuggestions", "PreviewSearchBrowseNoSearchFirst", "PreviewSearchBrowseNoSuggestionsNoSearchFirst", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nSearchBrowseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,274:1\n74#2:275\n154#3:276\n164#3:277\n*S KotlinDebug\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt\n*L\n56#1:275\n59#1:276\n60#1:277\n*E\n"})
public final class SearchBrowseCardKt {
    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowse(Composer composer, int n10) {
        composer = composer.startRestartGroup(1546858090);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1546858090, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PreviewSearchBrowse (SearchBrowseCard.kt:180)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    SearchBrowseCardKt.access$PreviewSearchBrowse(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowseNoSearchFirst(Composer composer, int n10) {
        composer = composer.startRestartGroup(-678171621);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-678171621, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PreviewSearchBrowseNoSearchFirst (SearchBrowseCard.kt:228)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
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
                    SearchBrowseCardKt.access$PreviewSearchBrowseNoSearchFirst(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowseNoSuggestions(Composer composer, int n10) {
        composer = composer.startRestartGroup(1745562356);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1745562356, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PreviewSearchBrowseNoSuggestions (SearchBrowseCard.kt:206)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    SearchBrowseCardKt.access$PreviewSearchBrowseNoSuggestions(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PreviewSearchBrowseNoSuggestionsNoSearchFirst(Composer composer, int n10) {
        composer = composer.startRestartGroup(354688977);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)354688977, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PreviewSearchBrowseNoSuggestionsNoSearchFirst (SearchBrowseCard.kt:254)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.getLambda-4$intercom_sdk_base_release(), composer, 3072, 7);
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
                    SearchBrowseCardKt.access$PreviewSearchBrowseNoSuggestionsNoSearchFirst(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void SearchBrowseCard(@NotNull HomeCards.HomeHelpCenterData homeHelpCenterData, boolean bl2, @NotNull List<AvatarWrapper> list, boolean bl3, @NotNull MetricTracker metricTracker, @Nullable Composer composer, int n10) {
        y.j(homeHelpCenterData, "helpCenterData");
        y.j(list, "avatars");
        y.j(metricTracker, "metricTracker");
        composer = composer.startRestartGroup(382156573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)382156573, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.SearchBrowseCard (SearchBrowseCard.kt:48)");
        }
        Context context = (Context)composer.consume((CompositionLocal)AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier modifier = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, (float)0.0f, (int)1, null);
        float f11 = Dp.constructor-impl((float)2);
        CardKt.Card-F-jzlyU((Modifier)modifier, null, (long)0L, (long)0L, (BorderStroke)BorderStrokeKt.BorderStroke-cXLIe8U((float)Dp.constructor-impl((float)((float)0.5)), (long)IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getCardBorder-0d7_KjU()), (float)f11, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)-307967718, (boolean)true, (Object)new p<Composer, Integer, k0>(bl2, homeHelpCenterData, bl3, list, metricTracker, context){
            final boolean $accessToTeammateEnabled;
            final List<AvatarWrapper> $avatars;
            final Context $context;
            final HomeCards.HomeHelpCenterData $helpCenterData;
            final boolean $isSearchFirstEnabled;
            final MetricTracker $metricTracker;
            {
                this.$isSearchFirstEnabled = bl2;
                this.$helpCenterData = homeHelpCenterData;
                this.$accessToTeammateEnabled = bl3;
                this.$avatars = list;
                this.$metricTracker = metricTracker;
                this.$context = context;
                super(2);
            }

            /*
             * Enabled aggressive block sorting
             */
            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n10) {
                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart((int)-307967718, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.SearchBrowseCard.<anonymous> (SearchBrowseCard.kt:60)");
                }
                n10 = !this.$isSearchFirstEnabled && !(((Collection)this.$helpCenterData.getSuggestedArticles()).isEmpty() ^ true) ? 0 : 1;
                Object object = this.$helpCenterData;
                boolean bl2 = this.$isSearchFirstEnabled;
                boolean bl3 = this.$accessToTeammateEnabled;
                List<AvatarWrapper> list = this.$avatars;
                MetricTracker metricTracker = this.$metricTracker;
                Context context = this.$context;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                Object object2 = Arrangement.INSTANCE;
                Object object3 = object2.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)object3, (Alignment.Horizontal)companion2.getStart(), (Composer)composer, (int)0);
                composer.startReplaceableGroup(-1323940314);
                int n13 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
                object3 = ComposeUiNode.Companion;
                a a14 = object3.getConstructor();
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
                Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)object3.getSetMeasurePolicy());
                Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)object3.getSetResolvedCompositionLocals());
                measurePolicy = object3.getSetCompositeKeyHash();
                if (a14.getInserting() || !y.e(a14.rememberedValue(), n13)) {
                    a14.updateRememberedValue((Object)n13);
                    a14.apply((Object)n13, (p)measurePolicy);
                }
                q12.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f11 = n10 != 0 ? (float)8 : 0.0f;
                float f12 = Dp.constructor-impl((float)f11);
                float f13 = 0.0f;
                float f14 = Dp.constructor-impl((float)f13);
                f11 = n10 != 0 ? Dp.constructor-impl((float)8) : Dp.constructor-impl((float)f13);
                if (n10 != 0) {
                    f13 = 8;
                }
                measurePolicy = PaddingKt.padding-qDBjuR0((Modifier)companion, (float)f11, (float)f12, (float)Dp.constructor-impl((float)f13), (float)f14);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                n13 = MaterialTheme.$stable;
                measurePolicy = ClipKt.clip((Modifier)measurePolicy, (Shape)materialTheme.getShapes(composer, n13).getMedium());
                composer.startReplaceableGroup(-1235841593);
                long l10 = n10 != 0 ? Color.copy-wmQWz5c$default((long)materialTheme.getColors(composer, n13).getOnSurface-0d7_KjU(), (float)0.05f, (float)0.0f, (float)0.0f, (float)0.0f, (int)14, null) : Color.Companion.getTransparent-0d7_KjU();
                composer.endReplaceableGroup();
                measurePolicy = ClickableKt.clickable-XHw0xAI$default((Modifier)BackgroundKt.background-bw27NRU$default((Modifier)measurePolicy, (long)l10, null, (int)2, null), (boolean)false, null, null, (a)new a<k0>(metricTracker, context){
                    final Context $context;
                    final MetricTracker $metricTracker;
                    {
                        this.$metricTracker = metricTracker;
                        this.$context = context;
                        super(0);
                    }

                    public final void invoke() {
                        this.$metricTracker.clickedSearchBrowseCard();
                        Intent intent = IntercomArticleSearchActivity.Companion.buildIntent(this.$context, true);
                        this.$context.startActivity(intent);
                    }
                }, (int)7, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicy2 = BoxKt.rememberBoxMeasurePolicy((Alignment)companion2.getTopStart(), (boolean)false, (Composer)composer, (int)0);
                composer.startReplaceableGroup(-1323940314);
                n13 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                a14 = composer.getCurrentCompositionLocalMap();
                compositionLocalMap = object3.getConstructor();
                measurePolicy = LayoutKt.modifierMaterializerOf((Modifier)measurePolicy);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode((a)compositionLocalMap);
                } else {
                    composer.useNode();
                }
                compositionLocalMap = Updater.constructor-impl((Composer)composer);
                Updater.set-impl((Composer)compositionLocalMap, (Object)measurePolicy2, (p)object3.getSetMeasurePolicy());
                Updater.set-impl((Composer)compositionLocalMap, (Object)a14, (p)object3.getSetResolvedCompositionLocals());
                p p14 = object3.getSetCompositeKeyHash();
                if (compositionLocalMap.getInserting() || !y.e(compositionLocalMap.rememberedValue(), n13)) {
                    compositionLocalMap.updateRememberedValue((Object)n13);
                    compositionLocalMap.apply((Object)n13, p14);
                }
                measurePolicy.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier = SizeKt.fillMaxWidth$default((Modifier)companion, (float)0.0f, (int)1, null);
                f11 = n10 != 0 ? (float)8 : (float)16;
                f13 = Dp.constructor-impl((float)f11);
                f11 = n10 != 0 ? (float)12 : (float)20;
                f11 = Dp.constructor-impl((float)f11);
                Modifier modifier2 = PaddingKt.padding-VpY3zN4((Modifier)modifier, (float)f13, (float)f11);
                a14 = companion2.getCenterVertically();
                measurePolicy = object2.getSpaceBetween();
                composer.startReplaceableGroup(693286680);
                measurePolicy = RowKt.rowMeasurePolicy((Arrangement.Horizontal)measurePolicy, (Alignment.Vertical)a14, (Composer)composer, (int)54);
                composer.startReplaceableGroup(-1323940314);
                n10 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                a14 = composer.getCurrentCompositionLocalMap();
                compositionLocalMap = object3.getConstructor();
                q q14 = LayoutKt.modifierMaterializerOf((Modifier)modifier2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode((a)compositionLocalMap);
                } else {
                    composer.useNode();
                }
                compositionLocalMap = Updater.constructor-impl((Composer)composer);
                Updater.set-impl((Composer)compositionLocalMap, (Object)measurePolicy, (p)object3.getSetMeasurePolicy());
                Updater.set-impl((Composer)compositionLocalMap, (Object)a14, (p)object3.getSetResolvedCompositionLocals());
                measurePolicy = object3.getSetCompositeKeyHash();
                if (compositionLocalMap.getInserting() || !y.e(compositionLocalMap.rememberedValue(), n10)) {
                    compositionLocalMap.updateRememberedValue((Object)n10);
                    compositionLocalMap.apply((Object)n10, (p)measurePolicy);
                }
                q14.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                String string2 = StringResources_androidKt.stringResource((int)R.string.intercom_search_for_help, (Composer)composer, (int)0);
                measurePolicy = FontWeight.Companion.getSemiBold();
                TextKt.Text--4IGK_g((String)string2, null, (long)0L, (long)0L, null, (FontWeight)measurePolicy, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, null, (Composer)composer, (int)196608, (int)0, (int)131038);
                n10 = R.drawable.intercom_gif_search_icon;
                f11 = 16;
                Modifier modifier3 = TestTagKt.testTag((Modifier)SizeKt.size-3ABfNKs((Modifier)companion, (float)Dp.constructor-impl((float)f11)), (String)String.valueOf(n10));
                IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)n10, (Composer)composer, (int)0), null, (Modifier)modifier3, (long)IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getActionContrastWhite-0d7_KjU(), (Composer)composer, (int)56, (int)0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                List<SuggestedArticle> list2 = ((HomeCards.HomeHelpCenterData)object).getSuggestedArticles();
                composer.startReplaceableGroup(-1235839696);
                object = list2;
                if (!(object.isEmpty() ^ true)) {
                    context = composer;
                } else {
                    composer.startReplaceableGroup(-483455358);
                    companion2 = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)object2.getTop(), (Alignment.Horizontal)companion2.getStart(), (Composer)composer, (int)0);
                    composer.startReplaceableGroup(-1323940314);
                    n10 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                    object2 = composer.getCurrentCompositionLocalMap();
                    measurePolicy = object3.getConstructor();
                    q q15 = LayoutKt.modifierMaterializerOf((Modifier)companion);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode((a)measurePolicy);
                    } else {
                        composer.useNode();
                    }
                    measurePolicy = Updater.constructor-impl((Composer)composer);
                    Updater.set-impl((Composer)measurePolicy, (Object)companion2, (p)object3.getSetMeasurePolicy());
                    Updater.set-impl((Composer)measurePolicy, (Object)object2, (p)object3.getSetResolvedCompositionLocals());
                    object3 = object3.getSetCompositeKeyHash();
                    if (measurePolicy.getInserting() || !y.e(measurePolicy.rememberedValue(), n10)) {
                        measurePolicy.updateRememberedValue((Object)n10);
                        measurePolicy.apply((Object)n10, (p)object3);
                    }
                    q15.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                    n10 = 2058660585;
                    composer.startReplaceableGroup(2058660585);
                    composer.startReplaceableGroup(-572342107);
                    if (object.isEmpty() ^ true) {
                        EffectsKt.LaunchedEffect((Object)"", (p)new p<q0, d<? super k0>, Object>(metricTracker, list2, null){
                            final List<SuggestedArticle> $articleSuggestions;
                            final MetricTracker $metricTracker;
                            int label;
                            {
                                this.$metricTracker = metricTracker;
                                this.$articleSuggestions = list;
                                super(2, d14);
                            }

                            @NotNull
                            public final d<k0> create(@Nullable Object object, @NotNull d<?> d14) {
                                return new /* invalid duplicate definition of identical inner class */;
                            }

                            @Nullable
                            public final Object invoke(@NotNull q0 q02, @Nullable d<? super k0> d14) {
                                return ((Object)this.create(q02, d14)).invokeSuspend(k0.a);
                            }

                            @Nullable
                            public final Object invokeSuspend(@NotNull Object object) {
                                b.f();
                                if (this.label == 0) {
                                    v.b(object);
                                    object = this.$metricTracker;
                                    Object object2 = this.$articleSuggestions;
                                    ArrayList<String> arrayList = new ArrayList<String>(t.x((Iterable)object2, (int)10));
                                    object2 = object2.iterator();
                                    while (object2.hasNext()) {
                                        arrayList.add(((SuggestedArticle)object2.next()).getId());
                                    }
                                    ((MetricTracker)object).viewedArticleSuggestions(arrayList);
                                    return k0.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }, (Composer)composer, (int)70);
                    }
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1235839233);
                    object3 = ((Iterable)list2).iterator();
                    n13 = 0;
                    while (object3.hasNext()) {
                        E e11 = object3.next();
                        if (n13 < 0) {
                            t.w();
                        }
                        object2 = (SuggestedArticle)e11;
                        composer.startReplaceableGroup(-572341674);
                        if (n13 == 0) {
                            SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, (float)Dp.constructor-impl((float)4)), (Composer)composer, (int)6);
                        }
                        composer.endReplaceableGroup();
                        Modifier.Companion companion3 = Modifier.Companion;
                        companion2 = ClickableKt.clickable-XHw0xAI$default((Modifier)SizeKt.fillMaxWidth$default((Modifier)companion3, (float)0.0f, (int)1, null), (boolean)false, null, null, (a)new a<k0>(metricTracker, (SuggestedArticle)object2, context){
                            final Context $context;
                            final SuggestedArticle $it;
                            final MetricTracker $metricTracker;
                            {
                                this.$metricTracker = metricTracker;
                                this.$it = suggestedArticle;
                                this.$context = context;
                                super(0);
                            }

                            public final void invoke() {
                                this.$metricTracker.clickedArticleSuggestion(this.$it.getId());
                                Context context = this.$context;
                                context.startActivity(ArticleActivity.Companion.buildIntent(context, new ArticleActivity.ArticleActivityArguments(this.$it.getId(), "search_browse_card", true, false, 8, null)));
                            }
                        }, (int)7, null);
                        f14 = Dp.constructor-impl((float)f11);
                        f13 = 4;
                        Modifier modifier4 = TestTagKt.testTag((Modifier)PaddingKt.padding-qDBjuR0$default((Modifier)companion2, (float)f14, (float)Dp.constructor-impl((float)f13), (float)0.0f, (float)Dp.constructor-impl((float)f13), (int)4, null), (String)"suggested article");
                        companion2 = Alignment.Companion.getCenterVertically();
                        composer.startReplaceableGroup(693286680);
                        measurePolicy = RowKt.rowMeasurePolicy((Arrangement.Horizontal)Arrangement.INSTANCE.getStart(), (Alignment.Vertical)companion2, (Composer)composer, (int)48);
                        composer.startReplaceableGroup(-1323940314);
                        int n14 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                        a14 = composer.getCurrentCompositionLocalMap();
                        companion2 = ComposeUiNode.Companion;
                        compositionLocalMap = companion2.getConstructor();
                        q q16 = LayoutKt.modifierMaterializerOf((Modifier)modifier4);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode((a)compositionLocalMap);
                        } else {
                            composer.useNode();
                        }
                        compositionLocalMap = Updater.constructor-impl((Composer)composer);
                        Updater.set-impl((Composer)compositionLocalMap, (Object)measurePolicy, (p)companion2.getSetMeasurePolicy());
                        Updater.set-impl((Composer)compositionLocalMap, (Object)a14, (p)companion2.getSetResolvedCompositionLocals());
                        companion2 = companion2.getSetCompositeKeyHash();
                        if (compositionLocalMap.getInserting() || !y.e(compositionLocalMap.rememberedValue(), n14)) {
                            compositionLocalMap.updateRememberedValue((Object)n14);
                            compositionLocalMap.apply((Object)n14, (p)companion2);
                        }
                        q16.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                        composer.startReplaceableGroup(n10);
                        companion2 = e.a((RowScope)RowScopeInstance.INSTANCE, (Modifier)companion3, (float)1.0f, (boolean)false, (int)2, null);
                        TextKt.Text--4IGK_g((String)((SuggestedArticle)object2).getTitle(), (Modifier)companion2, (long)0L, (long)0L, null, (FontWeight)FontWeight.Companion.getNormal(), null, (long)0L, null, null, (long)0L, (int)TextOverflow.Companion.getEllipsis-gIe3tQ8(), (boolean)false, (int)2, (int)0, null, null, (Composer)composer, (int)196608, (int)3120, (int)120796);
                        IntercomChevronKt.IntercomChevron(PaddingKt.padding-VpY3zN4$default((Modifier)companion3, (float)Dp.constructor-impl((float)20), (float)0.0f, (int)2, null), composer, 6, 0);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)companion3, (float)Dp.constructor-impl((float)f11)), (Composer)composer, (int)6);
                        ++n13;
                    }
                    context = composer;
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                }
                context = composer;
                composer.endReplaceableGroup();
                context.startReplaceableGroup(791906900);
                if (bl2 && bl3) {
                    context.startReplaceableGroup(-1235837124);
                    if (object.isEmpty() ^ true) {
                        IntercomDividerKt.IntercomDivider(PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, (float)Dp.constructor-impl((float)f11), (float)0.0f, (int)2, null), (Composer)context, 6, 0);
                    }
                    composer.endReplaceableGroup();
                    TeamPresenceRowKt.TeamPresenceRow(null, list, (Composer)context, 64, 1);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (!ComposerKt.isTraceInProgress()) return;
                ComposerKt.traceEventEnd();
            }
        }), (Composer)composer, (int)1769478, (int)14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((composer = composer.endRestartGroup()) != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(homeHelpCenterData, bl2, list, bl3, metricTracker, n10){
                final int $$changed;
                final boolean $accessToTeammateEnabled;
                final List<AvatarWrapper> $avatars;
                final HomeCards.HomeHelpCenterData $helpCenterData;
                final boolean $isSearchFirstEnabled;
                final MetricTracker $metricTracker;
                {
                    this.$helpCenterData = homeHelpCenterData;
                    this.$isSearchFirstEnabled = bl2;
                    this.$avatars = list;
                    this.$accessToTeammateEnabled = bl3;
                    this.$metricTracker = metricTracker;
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    SearchBrowseCardKt.SearchBrowseCard(this.$helpCenterData, this.$isSearchFirstEnabled, this.$avatars, this.$accessToTeammateEnabled, this.$metricTracker, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$PreviewSearchBrowse(Composer composer, int n10) {
        SearchBrowseCardKt.PreviewSearchBrowse(composer, n10);
    }

    public static final /* synthetic */ void access$PreviewSearchBrowseNoSearchFirst(Composer composer, int n10) {
        SearchBrowseCardKt.PreviewSearchBrowseNoSearchFirst(composer, n10);
    }

    public static final /* synthetic */ void access$PreviewSearchBrowseNoSuggestions(Composer composer, int n10) {
        SearchBrowseCardKt.PreviewSearchBrowseNoSuggestions(composer, n10);
    }

    public static final /* synthetic */ void access$PreviewSearchBrowseNoSuggestionsNoSearchFirst(Composer composer, int n10) {
        SearchBrowseCardKt.PreviewSearchBrowseNoSuggestionsNoSearchFirst(composer, n10);
    }
}

