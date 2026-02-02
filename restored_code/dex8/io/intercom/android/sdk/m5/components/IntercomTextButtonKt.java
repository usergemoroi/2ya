/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.DrawableRes
 *  androidx.compose.foundation.BorderStroke
 *  androidx.compose.foundation.BorderStrokeKt
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.PaddingValues
 *  androidx.compose.foundation.layout.RowScope
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.material.ButtonColors
 *  androidx.compose.material.ButtonDefaults
 *  androidx.compose.material.ButtonKt
 *  androidx.compose.material.IconKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.ScopeUpdateScope
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.graphics.ColorKt
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.functions.q
 */
package io.intercom.android.sdk.m5.components;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomTextButtonKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001\u00a2\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\b\r\u0010\f\u00a8\u0006\u000e"}, d2={"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "", "trailingIconId", "Lkotlin/Function0;", "Lkotlin/k0;", "onClick", "IntercomTextButton", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "PrimaryButtonWithTrailingIconPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nIntercomTextButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomTextButton.kt\nio/intercom/android/sdk/m5/components/IntercomTextButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,74:1\n154#2:75\n154#2:76\n*S KotlinDebug\n*F\n+ 1 IntercomTextButton.kt\nio/intercom/android/sdk/m5/components/IntercomTextButtonKt\n*L\n35#1:75\n41#1:76\n*E\n"})
public final class IntercomTextButtonKt {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void IntercomTextButton(@NotNull String string2, @Nullable Modifier object, @DrawableRes @Nullable Integer n10, @NotNull a<k0> a14, @Nullable Composer composer, int n13, int n14) {
        void var1_6;
        ScopeUpdateScope scopeUpdateScope;
        int n15;
        int n16;
        int n17;
        int n18;
        void var5_10;
        void var6_11;
        Composer composer2;
        Object object2;
        void var3_8;
        block21: {
            block20: {
                y.j(string2, "text");
                y.j(var3_8, "onClick");
                composer2 = object2.startRestartGroup(-2124423465);
                if ((var6_11 & 1) != 0) {
                    n18 = var5_10 | 6;
                } else if ((var5_10 & 0xE) == 0) {
                    n18 = composer2.changed((Object)string2) ? 4 : 2;
                    n18 |= var5_10;
                } else {
                    n18 = var5_10;
                }
                n17 = var6_11 & 2;
                if (n17 != 0) {
                    n16 = n18 | 0x30;
                } else {
                    n16 = n18;
                    if ((var5_10 & 0x70) == 0) {
                        n16 = composer2.changed(object) ? 32 : 16;
                    }
                }
                n18 = n16;
                break block20;
                n18 |= n16;
            }
            n15 = var6_11 & 4;
            if (n15 != 0) {
                n16 = n18 | 0x180;
            } else {
                n16 = n18;
                if ((var5_10 & 0x380) == 0) {
                    n16 = composer2.changed((Object)scopeUpdateScope) ? 256 : 128;
                }
            }
            n18 = n16;
            break block21;
            n18 |= n16;
        }
        if ((var6_11 & 8) != 0) {
            n16 = n18 | 0xC00;
        } else {
            n16 = n18;
            if ((var5_10 & 0x1C00) == 0) {
                n16 = composer2.changedInstance((Object)var3_8) ? 2048 : 1024;
                n16 = n18 | n16;
            }
        }
        if ((n16 & 0x16DB) == 1170 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            object2 = object;
            ScopeUpdateScope scopeUpdateScope2 = scopeUpdateScope;
        } else {
            void var1_4;
            if (n17 != 0) {
                Modifier.Companion companion = Modifier.Companion;
            }
            if (n15 != 0) {
                scopeUpdateScope = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-2124423465, (int)n16, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomTextButton (IntercomTextButton.kt:23)");
            }
            object2 = MaterialTheme.INSTANCE;
            n18 = MaterialTheme.$stable;
            ButtonKt.TextButton((a)var3_8, (Modifier)var1_4, (boolean)false, null, null, (Shape)object2.getShapes(composer2, n18).getMedium(), (BorderStroke)BorderStrokeKt.BorderStroke-cXLIe8U((float)Dp.constructor-impl((float)1.0f), (long)ColorKt.Color((long)0xFFE8E8E8L)), (ButtonColors)ButtonDefaults.INSTANCE.textButtonColors-RGew2ao(0L, object2.getColors(composer2, n18).getOnSurface-0d7_KjU(), 0L, composer2, ButtonDefaults.$stable << 9, 5), (PaddingValues)PaddingKt.PaddingValues-YgX7TsA((float)Dp.constructor-impl((float)12), (float)Dp.constructor-impl((float)10)), (q)ComposableLambdaKt.composableLambda((Composer)composer2, (int)484989498, (boolean)true, (Object)new q<RowScope, Composer, Integer, k0>(string2, n16, (Integer)scopeUpdateScope){
                final int $$dirty;
                final String $text;
                final Integer $trailingIconId;
                {
                    this.$text = string2;
                    this.$$dirty = n10;
                    this.$trailingIconId = n13;
                    super(3);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@NotNull RowScope object, @Nullable Composer composer, int n10) {
                    y.j(object, "$this$TextButton");
                    if ((n10 & 0x51) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)484989498, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomTextButton.<anonymous> (IntercomTextButton.kt:41)");
                        }
                        TextKt.Text--4IGK_g((String)this.$text, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getButton(), (Composer)composer, (int)(this.$$dirty & 0xE), (int)0, (int)65534);
                        object = this.$trailingIconId;
                        if (object != null) {
                            n10 = ((Number)object).intValue();
                            object = Modifier.Companion;
                            SpacerKt.Spacer((Modifier)SizeKt.width-3ABfNKs((Modifier)object, (float)Dp.constructor-impl((float)6)), (Composer)composer, (int)6);
                            object = SizeKt.size-3ABfNKs((Modifier)object, (float)Dp.constructor-impl((float)16));
                            IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)n10, (Composer)composer, (int)0), null, (Modifier)object, (long)IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).getActionContrastWhite-0d7_KjU(), (Composer)composer, (int)440, (int)0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), (Composer)composer2, (int)(n16 >> 9 & 0xE | 0x36180000 | n16 & 0x70), (int)28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            object2 = var1_4;
            ScopeUpdateScope scopeUpdateScope3 = scopeUpdateScope;
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope == null) {
            return;
        }
        scopeUpdateScope.updateScope((p)new p<Composer, Integer, k0>(string2, object2, (Integer)var1_6, (a<k0>)var3_8, (int)var5_10, (int)var6_11){
            final int $$changed;
            final int $$default;
            final Modifier $modifier;
            final a<k0> $onClick;
            final String $text;
            final Integer $trailingIconId;
            {
                this.$text = string2;
                this.$modifier = modifier;
                this.$trailingIconId = n10;
                this.$onClick = a14;
                this.$$changed = n13;
                this.$$default = n14;
                super(2);
            }

            public final void invoke(@Nullable Composer composer, int n10) {
                IntercomTextButtonKt.IntercomTextButton(this.$text, this.$modifier, this.$trailingIconId, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
            }
        });
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(576106674);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)576106674, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PrimaryButtonPreview (IntercomTextButton.kt:60)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTextButtonKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    IntercomTextButtonKt.access$PrimaryButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonWithTrailingIconPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(615212717);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)615212717, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PrimaryButtonWithTrailingIconPreview (IntercomTextButton.kt:68)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTextButtonKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    IntercomTextButtonKt.access$PrimaryButtonWithTrailingIconPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$PrimaryButtonPreview(Composer composer, int n10) {
        IntercomTextButtonKt.PrimaryButtonPreview(composer, n10);
    }

    public static final /* synthetic */ void access$PrimaryButtonWithTrailingIconPreview(Composer composer, int n10) {
        IntercomTextButtonKt.PrimaryButtonWithTrailingIconPreview(composer, n10);
    }
}

