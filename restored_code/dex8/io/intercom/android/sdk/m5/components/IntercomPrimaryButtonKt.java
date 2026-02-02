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
 *  androidx.compose.foundation.shape.RoundedCornerShape
 *  androidx.compose.foundation.shape.RoundedCornerShapeKt
 *  androidx.compose.material.ButtonColors
 *  androidx.compose.material.ButtonDefaults
 *  androidx.compose.material.ButtonElevation
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
 *  androidx.compose.ui.graphics.Color
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomPrimaryButtonKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001\u00a2\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\b\r\u0010\f\u00a8\u0006\u000e"}, d2={"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "", "trailingIconId", "Lkotlin/Function0;", "Lkotlin/k0;", "onClick", "IntercomPrimaryButton", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "PrimaryButtonWithTrailingIconPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nIntercomPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,105:1\n154#2:106\n154#2:107\n154#2:108\n154#2:109\n154#2:110\n*S KotlinDebug\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButtonKt\n*L\n39#1:106\n41#1:107\n46#1:108\n49#1:109\n50#1:110\n*E\n"})
public final class IntercomPrimaryButtonKt {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void IntercomPrimaryButton(@NotNull String string2, @Nullable Modifier object, @DrawableRes @Nullable Integer n10, @NotNull a<k0> a14, @Nullable Composer object2, int n13, int n14) {
        void var1_6;
        Object object3;
        int n15;
        int n16;
        int n17;
        int n18;
        void var5_17;
        void var6_18;
        Composer composer;
        void var3_8;
        block23: {
            block22: {
                void var4_9;
                y.j(string2, "text");
                y.j(var3_8, "onClick");
                composer = var4_9.startRestartGroup(-801577387);
                if ((var6_18 & 1) != 0) {
                    n18 = var5_17 | 6;
                } else if ((var5_17 & 0xE) == 0) {
                    n18 = composer.changed((Object)string2) ? 4 : 2;
                    n18 |= var5_17;
                } else {
                    n18 = var5_17;
                }
                n17 = var6_18 & 2;
                if (n17 != 0) {
                    n16 = n18 | 0x30;
                } else {
                    n16 = n18;
                    if ((var5_17 & 0x70) == 0) {
                        n16 = composer.changed(object) ? 32 : 16;
                    }
                }
                n18 = n16;
                break block22;
                n18 |= n16;
            }
            n15 = var6_18 & 4;
            if (n15 != 0) {
                n16 = n18 | 0x180;
            } else {
                n16 = n18;
                if ((var5_17 & 0x380) == 0) {
                    n16 = composer.changed(object3) ? 256 : 128;
                }
            }
            n18 = n16;
            break block23;
            n18 |= n16;
        }
        if ((var6_18 & 8) != 0) {
            n16 = n18 | 0xC00;
        } else {
            n16 = n18;
            if ((var5_17 & 0x1C00) == 0) {
                n16 = composer.changedInstance((Object)var3_8) ? 2048 : 1024;
                n16 = n18 | n16;
            }
        }
        if ((n16 & 0x16DB) == 1170 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            void var4_10 = object3;
            object3 = object;
            void var1_2 = var4_10;
        } else {
            void var4_12;
            void var1_4;
            MaterialTheme materialTheme;
            if (n17 != 0) {
                Modifier.Companion companion = Modifier.Companion;
            }
            if (n15 != 0) {
                object3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-801577387, (int)n16, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomPrimaryButton (IntercomPrimaryButton.kt:31)");
            }
            if (ColorExtensionsKt.isLightColor-8_81llA((materialTheme = MaterialTheme.INSTANCE).getColors(composer, n18 = MaterialTheme.$stable).getPrimary-0d7_KjU())) {
                BorderStroke borderStroke = BorderStrokeKt.BorderStroke-cXLIe8U((float)Dp.constructor-impl((float)1.0f), (long)Color.copy-wmQWz5c$default((long)Color.Companion.getBlack-0d7_KjU(), (float)0.2f, (float)0.0f, (float)0.0f, (float)0.0f, (int)14, null));
            } else {
                BorderStroke borderStroke = BorderStrokeKt.BorderStroke-cXLIe8U((float)Dp.constructor-impl((float)1.0f), (long)Color.copy-wmQWz5c$default((long)Color.Companion.getWhite-0d7_KjU(), (float)0.2f, (float)0.0f, (float)0.0f, (float)0.0f, (int)14, null));
            }
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4((float)Dp.constructor-impl((float)10));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long l10 = materialTheme.getColors(composer, n18).getPrimary-0d7_KjU();
            n18 = ButtonDefaults.$stable;
            materialTheme = buttonDefaults.buttonColors-ro_MJ88(l10, 0L, 0L, 0L, composer, n18 << 12, 14);
            ButtonKt.Button((a)var3_8, (Modifier)var1_4, (boolean)false, null, (ButtonElevation)buttonDefaults.elevation-R_JCAzs(Dp.constructor-impl((float)0.0f), 0.0f, 0.0f, 0.0f, 0.0f, composer, n18 << 15 | 6, 30), (Shape)roundedCornerShape, (BorderStroke)var4_12, (ButtonColors)materialTheme, (PaddingValues)PaddingKt.PaddingValues-YgX7TsA((float)Dp.constructor-impl((float)16), (float)Dp.constructor-impl((float)12)), (q)ComposableLambdaKt.composableLambda((Composer)composer, (int)-794769307, (boolean)true, (Object)new q<RowScope, Composer, Integer, k0>(string2, n16, (Integer)object3){
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
                public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int n10) {
                    y.j(rowScope, "$this$Button");
                    if ((n10 & 0x51) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)-794769307, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.IntercomPrimaryButton.<anonymous> (IntercomPrimaryButton.kt:50)");
                        }
                        String string2 = this.$text;
                        Object object = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04();
                        rowScope = MaterialTheme.INSTANCE;
                        n10 = MaterialTheme.$stable;
                        TextKt.Text--4IGK_g((String)string2, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)TextStyle.copy-p1EtxEg$default((TextStyle)object, (long)rowScope.getColors(composer, n10).getOnPrimary-0d7_KjU(), (long)0L, null, null, null, null, null, (long)0L, null, null, null, (long)0L, null, null, null, (int)0, (int)0, (long)0L, null, null, null, (int)0, (int)0, null, (int)0xFFFFFE, null), (Composer)composer, (int)(this.$$dirty & 0xE), (int)0, (int)65534);
                        object = this.$trailingIconId;
                        if (object != null) {
                            int n13 = ((Number)object).intValue();
                            object = Modifier.Companion;
                            SpacerKt.Spacer((Modifier)SizeKt.width-3ABfNKs((Modifier)object, (float)Dp.constructor-impl((float)6)), (Composer)composer, (int)6);
                            IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)n13, (Composer)composer, (int)0), null, (Modifier)SizeKt.size-3ABfNKs((Modifier)object, (float)Dp.constructor-impl((float)16)), (long)rowScope.getColors(composer, n10).getOnPrimary-0d7_KjU(), (Composer)composer, (int)440, (int)0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), (Composer)composer, (int)(n16 >> 9 & 0xE | 0x36000000 | n16 & 0x70), (int)12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            void var4_14 = var1_4;
            Object object4 = object3;
            object3 = var4_14;
        }
        ScopeUpdateScope scopeUpdateScope = composer.endRestartGroup();
        if (scopeUpdateScope == null) {
            return;
        }
        scopeUpdateScope.updateScope((p)new p<Composer, Integer, k0>(string2, object3, (Integer)var1_6, (a<k0>)var3_8, (int)var5_17, (int)var6_18){
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
                IntercomPrimaryButtonKt.IntercomPrimaryButton(this.$text, this.$modifier, this.$trailingIconId, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
            }
        });
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1925294537);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1925294537, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PrimaryButtonPreview (IntercomPrimaryButton.kt:88)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    IntercomPrimaryButtonKt.access$PrimaryButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void PrimaryButtonWithTrailingIconPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1297682962);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1297682962, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.PrimaryButtonWithTrailingIconPreview (IntercomPrimaryButton.kt:96)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    IntercomPrimaryButtonKt.access$PrimaryButtonWithTrailingIconPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$PrimaryButtonPreview(Composer composer, int n10) {
        IntercomPrimaryButtonKt.PrimaryButtonPreview(composer, n10);
    }

    public static final /* synthetic */ void access$PrimaryButtonWithTrailingIconPreview(Composer composer, int n10) {
        IntercomPrimaryButtonKt.PrimaryButtonWithTrailingIconPreview(composer, n10);
    }
}

