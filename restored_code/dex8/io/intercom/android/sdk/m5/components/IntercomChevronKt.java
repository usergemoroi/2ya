/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.material.IconKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.CompositionLocal
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.draw.RotateKt
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.platform.CompositionLocalsKt
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.tooling.preview.Preview
 *  androidx.compose.ui.tooling.preview.Preview$Container
 *  androidx.compose.ui.unit.LayoutDirection
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.LayoutDirection;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/k0;", "IntercomChevron", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nIntercomChevron.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomChevron.kt\nio/intercom/android/sdk/m5/components/IntercomChevronKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,33:1\n74#2:34\n*S KotlinDebug\n*F\n+ 1 IntercomChevron.kt\nio/intercom/android/sdk/m5/components/IntercomChevronKt\n*L\n20#1:34\n*E\n"})
public final class IntercomChevronKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview.Container(value={@Preview(locale="ar", name="RTL"), @Preview(locale="en", name="LTR")})
    public static final void IntercomChevron(@Nullable Modifier modifier, @Nullable Composer composer, int n10, int n13) {
        int n14;
        Composer composer2 = composer.startRestartGroup(467059601);
        int n15 = n13 & 1;
        if (n15 != 0) {
            n14 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n14 = composer2.changed((Object)modifier) ? 4 : 2;
            n14 |= n10;
        } else {
            n14 = n10;
        }
        if ((n14 & 0xB) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            composer = modifier;
        } else {
            if (n15 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)467059601, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomChevron (IntercomChevron.kt:16)");
            }
            float f11 = composer2.consume((CompositionLocal)CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl ? 180.0f : 0.0f;
            composer = RotateKt.rotate((Modifier)modifier, (float)f11);
            IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)R.drawable.intercom_chevron, (Composer)composer2, (int)0), null, (Modifier)composer, (long)IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).getActionContrastWhite-0d7_KjU(), (Composer)composer2, (int)56, (int)0);
            composer = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer = modifier;
            }
        }
        modifier = composer2.endRestartGroup();
        if (modifier != null) {
            modifier.updateScope((p)new p<Composer, Integer, k0>((Modifier)composer, n10, n13){
                final int $$changed;
                final int $$default;
                final Modifier $modifier;
                {
                    this.$modifier = modifier;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    IntercomChevronKt.IntercomChevron(this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }
}

