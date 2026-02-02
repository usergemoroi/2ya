/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.DrawableRes
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Vertical
 *  androidx.compose.foundation.layout.ColumnKt
 *  androidx.compose.foundation.layout.ColumnScopeInstance
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.material.IconKt
 *  androidx.compose.material.MaterialTheme
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
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.text.style.TextAlign
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$EmptyStateKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aP\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\b\tH\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\bH\u0003\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\bH\u0003\u00a2\u0006\u0004\b\u000f\u0010\u000e\u00a8\u0006\u0010"}, d2={"", "title", "Landroidx/compose/ui/Modifier;", "modifier", "description", "", "iconId", "Lkotlin/Function0;", "Lkotlin/k0;", "Landroidx/compose/runtime/Composable;", "bottomContent", "EmptyState", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/p;Landroidx/compose/runtime/Composer;II)V", "EmptyStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "EmptyStateWithOutlinedButtonPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nEmptyState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyState.kt\nio/intercom/android/sdk/m5/components/EmptyStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,108:1\n154#2:109\n154#2:141\n154#2:142\n154#2:143\n154#2:144\n78#3,2:110\n80#3:140\n84#3:149\n79#4,11:112\n92#4:148\n456#5,8:123\n464#5,3:137\n467#5,3:145\n3737#6,6:131\n*S KotlinDebug\n*F\n+ 1 EmptyState.kt\nio/intercom/android/sdk/m5/components/EmptyStateKt\n*L\n35#1:109\n45#1:141\n47#1:142\n56#1:143\n65#1:144\n33#1:110,2\n33#1:140\n33#1:149\n33#1:112,11\n33#1:148\n33#1:123,8\n33#1:137,3\n33#1:145,3\n33#1:131,6\n*E\n"})
public final class EmptyStateKt {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Composable
    @ComposableInferredTarget(scheme="[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void EmptyState(@NotNull String string2, @Nullable Modifier companion, @Nullable String string3, @DrawableRes @Nullable Integer companion2, @Nullable p<? super Composer, ? super Integer, k0> object, @Nullable Composer composer, int n10, int n13) {
        void var4_9;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        void var6_11;
        void var7_12;
        Composer composer2;
        Modifier.Companion companion3;
        block34: {
            block33: {
                block32: {
                    y.j(string2, "title");
                    composer2 = companion3.startRestartGroup(1094399996);
                    if ((var7_12 & 1) != 0) {
                        n18 = var6_11 | 6;
                    } else if ((var6_11 & 0xE) == 0) {
                        n18 = composer2.changed((Object)string2) ? 4 : 2;
                        n18 |= var6_11;
                    } else {
                        n18 = var6_11;
                    }
                    n17 = var7_12 & 2;
                    if (n17 != 0) {
                        n16 = n18 | 0x30;
                    } else {
                        n16 = n18;
                        if ((var6_11 & 0x70) == 0) {
                            n16 = composer2.changed((Object)companion) ? 32 : 16;
                        }
                    }
                    n18 = n16;
                    break block32;
                    n18 |= n16;
                }
                n15 = var7_12 & 4;
                if (n15 != 0) {
                    n16 = n18 | 0x180;
                } else {
                    n16 = n18;
                    if ((var6_11 & 0x380) == 0) {
                        n16 = composer2.changed((Object)string3) ? 256 : 128;
                    }
                }
                n18 = n16;
                break block33;
                n18 |= n16;
            }
            n14 = var7_12 & 8;
            if (n14 != 0) {
                n16 = n18 | 0xC00;
            } else {
                n16 = n18;
                if ((var6_11 & 0x1C00) == 0) {
                    n16 = composer2.changed((Object)companion2) ? 2048 : 1024;
                }
            }
            n18 = n16;
            break block34;
            n18 |= n16;
        }
        int n19 = var7_12 & 0x10;
        if (n19 != 0) {
            n16 = n18 | 0x6000;
        } else {
            n16 = n18;
            if ((0xE000 & var6_11) == 0) {
                n16 = composer2.changedInstance(object) ? 16384 : 8192;
                n16 = n18 | n16;
            }
        }
        if ((0xB6DB & n16) == 9362 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            companion3 = companion;
            String string4 = string3;
            companion = companion2;
            companion2 = object;
            string3 = companion3;
            String string5 = string4;
        } else {
            void var4_7;
            if (n17 != 0) {
                companion = Modifier.Companion;
            }
            if (n15 != 0) {
                string3 = null;
            }
            if (n14 != 0) {
                companion2 = null;
            }
            if (n19 != 0) {
                Object var4_6 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1094399996, (int)n16, (int)-1, (String)"io.intercom.android.sdk.m5.components.EmptyState (EmptyState.kt:25)");
            }
            Modifier modifier = SizeKt.fillMaxSize$default((Modifier)PaddingKt.padding-3ABfNKs((Modifier)companion, (float)Dp.constructor-impl((float)24)), (float)0.0f, (int)1, null);
            Alignment.Horizontal horizontal = Alignment.Companion.getCenterHorizontally();
            companion3 = Arrangement.INSTANCE.getCenter();
            composer2.startReplaceableGroup(-483455358);
            horizontal = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)companion3, (Alignment.Horizontal)horizontal, (Composer)composer2, (int)54);
            composer2.startReplaceableGroup(-1323940314);
            n18 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer2, (int)0);
            CompositionLocalMap compositionLocalMap = composer2.getCurrentCompositionLocalMap();
            companion3 = ComposeUiNode.Companion;
            a a14 = companion3.getConstructor();
            modifier = LayoutKt.modifierMaterializerOf((Modifier)modifier);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(a14);
            } else {
                composer2.useNode();
            }
            a14 = Updater.constructor-impl((Composer)composer2);
            Updater.set-impl((Composer)a14, (Object)horizontal, (p)companion3.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)companion3.getSetResolvedCompositionLocals());
            companion3 = companion3.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n18)) {
                a14.updateRememberedValue((Object)n18);
                a14.apply((Object)n18, (p)companion3);
            }
            modifier.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer2)), (Object)composer2, (Object)0);
            composer2.startReplaceableGroup(2058660585);
            companion3 = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1702546925);
            if (companion2 != null) {
                companion3 = PainterResources_androidKt.painterResource((int)companion2.intValue(), (Composer)composer2, (int)0);
                long l10 = MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).getOnSurface-0d7_KjU();
                modifier = Modifier.Companion;
                IconKt.Icon-ww6aTOc((Painter)companion3, null, (Modifier)SizeKt.size-3ABfNKs((Modifier)modifier, (float)Dp.constructor-impl((float)32)), (long)l10, (Composer)composer2, (int)440, (int)0);
                SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)modifier, (float)Dp.constructor-impl((float)16)), (Composer)composer2, (int)6);
            }
            composer2.endReplaceableGroup();
            modifier = MaterialTheme.INSTANCE;
            n18 = MaterialTheme.$stable;
            horizontal = modifier.getTypography(composer2, n18).getH6();
            companion3 = TextAlign.Companion;
            n17 = companion3.getCenter-e0LSkKk();
            TextKt.Text--4IGK_g((String)string2, null, (long)modifier.getColors(composer2, n18).getOnSurface-0d7_KjU(), (long)0L, null, null, null, (long)0L, null, (TextAlign)TextAlign.box-impl((int)n17), (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)horizontal, (Composer)composer2, (int)(n16 & 0xE), (int)0, (int)65018);
            composer2.startReplaceableGroup(-1702546410);
            if (string3 != null) {
                SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, (float)Dp.constructor-impl((float)6)), (Composer)composer2, (int)6);
                horizontal = modifier.getTypography(composer2, n18).getBody1();
                n16 = companion3.getCenter-e0LSkKk();
                TextKt.Text--4IGK_g((String)string3, null, (long)modifier.getColors(composer2, n18).getOnSurface-0d7_KjU(), (long)0L, null, null, null, (long)0L, null, (TextAlign)TextAlign.box-impl((int)n16), (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)horizontal, (Composer)composer2, (int)0, (int)0, (int)65018);
            }
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(476742698);
            if (var4_7 != null) {
                SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, (float)Dp.constructor-impl((float)16)), (Composer)composer2, (int)6);
                var4_7.invoke((Object)composer2, (Object)0);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = companion2;
            companion3 = companion;
            companion2 = var4_7;
            companion = modifier;
            String string6 = string3;
            string3 = companion3;
        }
        companion3 = composer2.endRestartGroup();
        if (companion3 == null) {
            return;
        }
        companion3.updateScope((p)new p<Composer, Integer, k0>(string2, (Modifier)string3, (String)var4_9, (Integer)companion, (p<? super Composer, ? super Integer, k0>)companion2, (int)var6_11, (int)var7_12){
            final int $$changed;
            final int $$default;
            final p<Composer, Integer, k0> $bottomContent;
            final String $description;
            final Integer $iconId;
            final Modifier $modifier;
            final String $title;
            {
                this.$title = string2;
                this.$modifier = modifier;
                this.$description = string3;
                this.$iconId = n10;
                this.$bottomContent = p14;
                this.$$changed = n13;
                this.$$default = n14;
                super(2);
            }

            public final void invoke(@Nullable Composer composer, int n10) {
                EmptyStateKt.EmptyState(this.$title, this.$modifier, this.$description, this.$iconId, this.$bottomContent, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
            }
        });
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void EmptyStatePreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1885515198);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1885515198, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.EmptyStatePreview (EmptyState.kt:72)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
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
                    EmptyStateKt.access$EmptyStatePreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void EmptyStateWithOutlinedButtonPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-484307592);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-484307592, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.EmptyStateWithOutlinedButtonPreview (EmptyState.kt:91)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.getLambda-6$intercom_sdk_base_release(), composer, 3072, 7);
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
                    EmptyStateKt.access$EmptyStateWithOutlinedButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$EmptyStatePreview(Composer composer, int n10) {
        EmptyStateKt.EmptyStatePreview(composer, n10);
    }

    public static final /* synthetic */ void access$EmptyStateWithOutlinedButtonPreview(Composer composer, int n10) {
        EmptyStateKt.EmptyStateWithOutlinedButtonPreview(composer, n10);
    }
}

