/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.DrawableRes
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.viewinterop.AndroidView_androidKt
 *  com.facebook.shimmer.ShimmerFrameLayout
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.intercom.android.sdk.m5.components.ComposableSingletons$LoadingScreenKt;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "", "shimmerDrawable", "Lkotlin/k0;", "LoadingScreen", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "LoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nLoadingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingScreen.kt\nio/intercom/android/sdk/m5/components/LoadingScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,45:1\n50#2:46\n49#2:47\n1116#3,6:48\n*S KotlinDebug\n*F\n+ 1 LoadingScreen.kt\nio/intercom/android/sdk/m5/components/LoadingScreenKt\n*L\n24#1:46\n24#1:47\n24#1:48,6\n*E\n"})
public final class LoadingScreenKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void LoadingScreen(@Nullable Modifier modifier, @DrawableRes int n10, @Nullable Composer object, int n13, int n14) {
        Composer composer;
        block15: {
            Modifier modifier2;
            block17: {
                long l10;
                block16: {
                    int n15;
                    int n16;
                    block14: {
                        int n17;
                        composer = object.startRestartGroup(-1767045234);
                        n16 = n14 & 1;
                        if (n16 != 0) {
                            n17 = n13 | 6;
                        } else if ((n13 & 0xE) == 0) {
                            n17 = composer.changed((Object)modifier) ? 4 : 2;
                            n17 |= n13;
                        } else {
                            n17 = n13;
                        }
                        if ((n14 & 2) != 0) {
                            n15 = n17 | 0x30;
                        } else {
                            n15 = n17;
                            if ((n13 & 0x70) == 0) {
                                n15 = composer.changed(n10) ? 32 : 16;
                                n15 = n17 | n15;
                            }
                        }
                        if ((n15 & 0x5B) != 18 || !composer.getSkipping()) break block14;
                        composer.skipToGroupEnd();
                        object = modifier;
                        break block15;
                    }
                    if (n16 != 0) {
                        modifier = Modifier.Companion;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)-1767045234, (int)n15, (int)-1, (String)"io.intercom.android.sdk.m5.components.LoadingScreen (LoadingScreen.kt:16)");
                    }
                    l10 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).getOnBackground-0d7_KjU();
                    modifier2 = SizeKt.fillMaxSize$default((Modifier)modifier, (float)0.0f, (int)1, null);
                    object = Color.box-impl((long)l10);
                    composer.startReplaceableGroup(511388516);
                    boolean bl2 = composer.changed(object);
                    boolean bl3 = composer.changed((Object)n10);
                    Object object2 = composer.rememberedValue();
                    if (bl2 | bl3) break block16;
                    object = object2;
                    if (object2 != Composer.Companion.getEmpty()) break block17;
                }
                object = new l<Context, ShimmerFrameLayout>(l10, n10){
                    final int $shimmerDrawable;
                    final long $tintColor;
                    {
                        this.$tintColor = l10;
                        this.$shimmerDrawable = n10;
                        super(1);
                    }

                    @NotNull
                    public final ShimmerFrameLayout invoke(@NotNull Context context) {
                        y.j(context, "context");
                        ShimmerFrameLayout shimmerFrameLayout = LoadingComponentKt.buildLoadingContainer(context);
                        shimmerFrameLayout.addView(LoadingComponentKt.buildLoadingContent-bw27NRU(context, this.$tintColor, this.$shimmerDrawable));
                        return shimmerFrameLayout;
                    }
                };
                composer.updateRememberedValue(object);
            }
            composer.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((l)((l)object), (Modifier)modifier2, null, (Composer)composer, (int)0, (int)4);
            object = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                object = modifier;
            }
        }
        modifier = composer.endRestartGroup();
        if (modifier != null) {
            modifier.updateScope((p)new p<Composer, Integer, k0>((Modifier)object, n10, n13, n14){
                final int $$changed;
                final int $$default;
                final Modifier $modifier;
                final int $shimmerDrawable;
                {
                    this.$modifier = modifier;
                    this.$shimmerDrawable = n10;
                    this.$$changed = n13;
                    this.$$default = n14;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    LoadingScreenKt.LoadingScreen(this.$modifier, this.$shimmerDrawable, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void LoadingScreenPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(-1596356708);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1596356708, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.LoadingScreenPreview (LoadingScreen.kt:39)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LoadingScreenKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    LoadingScreenKt.LoadingScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }
}

