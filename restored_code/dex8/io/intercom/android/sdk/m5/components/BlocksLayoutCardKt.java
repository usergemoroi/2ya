/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  androidx.compose.foundation.BorderStroke
 *  androidx.compose.foundation.BorderStrokeKt
 *  androidx.compose.material.CardKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.unit.Dp
 *  androidx.compose.ui.viewinterop.AndroidView_androidKt
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material.CardKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Landroid/view/ViewGroup;", "blocksLayout", "Lkotlin/k0;", "BlocksLayoutCard", "(Landroid/view/ViewGroup;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nBlocksLayoutCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlocksLayoutCard.kt\nio/intercom/android/sdk/m5/components/BlocksLayoutCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,27:1\n154#2:28\n164#2:29\n*S KotlinDebug\n*F\n+ 1 BlocksLayoutCard.kt\nio/intercom/android/sdk/m5/components/BlocksLayoutCardKt\n*L\n15#1:28\n16#1:29\n*E\n"})
public final class BlocksLayoutCardKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void BlocksLayoutCard(@NotNull ViewGroup viewGroup, @Nullable Composer composer, int n10) {
        y.j(viewGroup, "blocksLayout");
        composer = composer.startRestartGroup(2052386320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)2052386320, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.BlocksLayoutCard (BlocksLayoutCard.kt:12)");
        }
        float f11 = Dp.constructor-impl((float)2);
        CardKt.Card-F-jzlyU(null, null, (long)0L, (long)0L, (BorderStroke)BorderStrokeKt.BorderStroke-cXLIe8U((float)Dp.constructor-impl((float)((float)0.5)), (long)IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getCardBorder-0d7_KjU()), (float)f11, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)-2117533811, (boolean)true, (Object)new p<Composer, Integer, k0>(viewGroup){
            final ViewGroup $blocksLayout;
            {
                this.$blocksLayout = viewGroup;
                super(2);
            }

            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n10) {
                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)-2117533811, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.BlocksLayoutCard.<anonymous> (BlocksLayoutCard.kt:16)");
                    }
                    AndroidView_androidKt.AndroidView((l)new l<Context, ViewGroup>(this.$blocksLayout){
                        final ViewGroup $blocksLayout;
                        {
                            this.$blocksLayout = viewGroup;
                            super(1);
                        }

                        @NotNull
                        public final ViewGroup invoke(@NotNull Context context) {
                            y.j(context, "it");
                            context = this.$blocksLayout;
                            context.setPadding(0, 0, 0, 0);
                            return context;
                        }
                    }, null, null, (Composer)composer, (int)0, (int)6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), (Composer)composer, (int)0x1B0000, (int)15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((composer = composer.endRestartGroup()) != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(viewGroup, n10){
                final int $$changed;
                final ViewGroup $blocksLayout;
                {
                    this.$blocksLayout = viewGroup;
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    BlocksLayoutCardKt.BlocksLayoutCard(this.$blocksLayout, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }
}

