/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.ScopeUpdateScope
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.semantics.SemanticsModifierKt
 *  androidx.compose.ui.semantics.SemanticsPropertiesKt
 *  androidx.compose.ui.semantics.SemanticsPropertyReceiver
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.text.style.TextAlign
 *  androidx.compose.ui.text.style.TextOverflow
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlin.text.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import io.intercom.android.sdk.m5.components.ComposableSingletons$TextWithSeparatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u00006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001am\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0015\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2={"", "firstText", "secondText", "Landroidx/compose/ui/Modifier;", "modifier", "separator", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Lkotlin/k0;", "TextWithSeparator-wV1YYcM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JIILandroidx/compose/ui/text/style/TextAlign;Landroidx/compose/runtime/Composer;II)V", "TextWithSeparator", "TextWithSeparatorPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextWithSeparatorSecondEmptyPreview", "TextWithSeparatorFirstEmptyPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTextWithSeparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextWithSeparator.kt\nio/intercom/android/sdk/m5/components/TextWithSeparatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n50#2:67\n49#2:68\n1116#3,6:69\n*S KotlinDebug\n*F\n+ 1 TextWithSeparator.kt\nio/intercom/android/sdk/m5/components/TextWithSeparatorKt\n*L\n33#1:67\n33#1:68\n33#1:69,6\n*E\n"})
public final class TextWithSeparatorKt {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TextWithSeparator-wV1YYcM(@NotNull String string2, @NotNull String string3, @Nullable Modifier modifier, @Nullable String string4, @Nullable TextStyle textStyle, long l10, int n10, int n13, @Nullable TextAlign textAlign, @Nullable Composer object, int n14, int n15) {
        void var11_20;
        void var12_21;
        Composer composer;
        block47: {
            void var10_17;
            String string5;
            int n16;
            block49: {
                block48: {
                    void var10_13;
                    int n17;
                    int n18;
                    int n19;
                    int n23;
                    int n24;
                    int n25;
                    int n26;
                    block46: {
                        block45: {
                            block44: {
                                y.j(string2, "firstText");
                                y.j(string3, "secondText");
                                composer = object.startRestartGroup(46249171);
                                if ((var12_21 & 1) != 0) {
                                    n26 = var11_20 | 6;
                                } else if ((var11_20 & 0xE) == 0) {
                                    n16 = composer.changed((Object)string2) ? 4 : 2;
                                    n26 = n16 | var11_20;
                                } else {
                                    n26 = var11_20;
                                }
                                if ((var12_21 & 2) != 0) {
                                    n16 = n26 | 0x30;
                                } else {
                                    n16 = n26;
                                    if ((var11_20 & 0x70) == 0) {
                                        n16 = composer.changed((Object)string3) ? 32 : 16;
                                        n16 = n26 | n16;
                                    }
                                }
                                n25 = var12_21 & 4;
                                if (n25 != 0) {
                                    n26 = n16 | 0x180;
                                } else {
                                    n26 = n16;
                                    if ((var11_20 & 0x380) == 0) {
                                        n26 = composer.changed((Object)modifier) ? 256 : 128;
                                    }
                                }
                                n16 = n26;
                                break block44;
                                n16 |= n26;
                            }
                            n24 = var12_21 & 8;
                            if (n24 != 0) {
                                n26 = n16 | 0xC00;
                            } else {
                                n26 = n16;
                                if ((var11_20 & 0x1C00) == 0) {
                                    n26 = composer.changed((Object)string4) ? 2048 : 1024;
                                }
                            }
                            n16 = n26;
                            break block45;
                            n16 |= n26;
                        }
                        if ((0xE000 & var11_20) == 0) {
                            n26 = (var12_21 & 0x10) == 0 && composer.changed((Object)textStyle) ? 16384 : 8192;
                            n16 |= n26;
                        }
                        if ((n23 = var12_21 & 0x20) != 0) {
                            n26 = n16 | 0x30000;
                        } else {
                            n26 = n16;
                            if ((0x70000 & var11_20) == 0) {
                                n26 = composer.changed(l10) ? 131072 : 65536;
                                n26 = n16 | n26;
                            }
                        }
                        n19 = var12_21 & 0x40;
                        if (n19 != 0) {
                            n16 = n26 | 0x180000;
                        } else {
                            n16 = n26;
                            if ((var11_20 & 0x380000) == 0) {
                                n16 = composer.changed(n10) ? 0x100000 : 524288;
                                n16 = n26 | n16;
                            }
                        }
                        n18 = var12_21 & 0x80;
                        if (n18 != 0) {
                            n26 = n16 | 0xC00000;
                        } else {
                            n26 = n16;
                            if ((var11_20 & 0x1C00000) == 0) {
                                n26 = composer.changed(n13) ? 0x800000 : 0x400000;
                                n26 = n16 | n26;
                            }
                        }
                        n17 = var12_21 & 0x100;
                        if (n17 != 0) {
                            n16 = n26 | 0x6000000;
                        } else {
                            n16 = n26;
                            if ((var11_20 & 0xE000000) == 0) {
                                n16 = composer.changed((Object)textAlign) ? 0x4000000 : 0x2000000;
                                n16 = n26 | n16;
                            }
                        }
                        if ((n16 & 0xB6DB6DB) != 0x2492492 || !composer.getSkipping()) break block46;
                        composer.skipToGroupEnd();
                        break block47;
                    }
                    composer.startDefaults();
                    if ((var11_20 & 1) != 0 && !composer.getDefaultsInvalid()) {
                        composer.skipToGroupEnd();
                        n26 = n16;
                        if ((var12_21 & 0x10) != 0) {
                            n26 = n16 & 0xFFFF1FFF;
                        }
                        n16 = n26;
                    } else {
                        if (n25 != 0) {
                            modifier = Modifier.Companion;
                        }
                        if (n24 != 0) {
                            string4 = "\u2022";
                        }
                        if ((var12_21 & 0x10) != 0) {
                            textStyle = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBody1();
                            n16 &= 0xFFFF1FFF;
                        }
                        if (n23 != 0) {
                            l10 = Color.Companion.getUnspecified-0d7_KjU();
                        }
                        if (n19 != 0) {
                            n10 = TextOverflow.Companion.getClip-gIe3tQ8();
                        }
                        if (n18 != 0) {
                            n13 = Integer.MAX_VALUE;
                        }
                        if (n17 != 0) {
                            textAlign = null;
                        }
                    }
                    composer.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)46249171, (int)n16, (int)-1, (String)"io.intercom.android.sdk.m5.components.TextWithSeparator (TextWithSeparator.kt:16)");
                    }
                    if (p.h0((CharSequence)string2) ^ true && p.h0((CharSequence)string3) ^ true) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(' ');
                        stringBuilder.append(string4);
                        stringBuilder.append(' ');
                        String string6 = stringBuilder.toString();
                    } else {
                        String string7 = "";
                    }
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string2);
                    ((StringBuilder)object2).append((String)var10_13);
                    ((StringBuilder)object2).append(string3);
                    string5 = ((StringBuilder)object2).toString();
                    composer.startReplaceableGroup(511388516);
                    boolean bl2 = composer.changed((Object)string2);
                    boolean bl3 = composer.changed((Object)string3);
                    object2 = composer.rememberedValue();
                    if (bl2 | bl3) break block48;
                    Object object3 = object2;
                    if (object2 != Composer.Companion.getEmpty()) break block49;
                }
                l<SemanticsPropertyReceiver, k0> l11 = new l<SemanticsPropertyReceiver, k0>(string2, string3){
                    final String $firstText;
                    final String $secondText;
                    {
                        this.$firstText = string2;
                        this.$secondText = string3;
                        super(1);
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        y.j(semanticsPropertyReceiver, "$this$semantics");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.$firstText);
                        stringBuilder.append(' ');
                        stringBuilder.append(this.$secondText);
                        SemanticsPropertiesKt.setContentDescription((SemanticsPropertyReceiver)semanticsPropertyReceiver, (String)stringBuilder.toString());
                    }
                };
                composer.updateRememberedValue((Object)l11);
            }
            composer.endReplaceableGroup();
            TextKt.Text--4IGK_g((String)string5, (Modifier)SemanticsModifierKt.semantics$default((Modifier)modifier, (boolean)false, (l)((l)var10_17), (int)1, null), (long)l10, (long)0L, null, null, null, (long)0L, null, (TextAlign)textAlign, (long)0L, (int)n10, (boolean)false, (int)n13, (int)0, null, (TextStyle)textStyle, (Composer)composer, (int)(n16 >> 9 & 0x380 | n16 << 3 & 0x70000000), (int)(n16 >> 15 & 0x70 | n16 >> 12 & 0x1C00 | n16 << 6 & 0x380000), (int)54776);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScope = composer.endRestartGroup();
        if (scopeUpdateScope == null) {
            return;
        }
        scopeUpdateScope.updateScope((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<Composer, Integer, k0>(string2, string3, modifier, string4, textStyle, l10, n10, n13, textAlign, (int)var11_20, (int)var12_21){
            final int $$changed;
            final int $$default;
            final long $color;
            final String $firstText;
            final int $maxLines;
            final Modifier $modifier;
            final int $overflow;
            final String $secondText;
            final String $separator;
            final TextStyle $style;
            final TextAlign $textAlign;
            {
                this.$firstText = string2;
                this.$secondText = string3;
                this.$modifier = modifier;
                this.$separator = string4;
                this.$style = textStyle;
                this.$color = l10;
                this.$overflow = n10;
                this.$maxLines = n13;
                this.$textAlign = textAlign;
                this.$$changed = n14;
                this.$$default = n15;
                super(2);
            }

            public final void invoke(@Nullable Composer composer, int n10) {
                TextWithSeparatorKt.TextWithSeparator-wV1YYcM(this.$firstText, this.$secondText, this.$modifier, this.$separator, this.$style, this.$color, this.$overflow, this.$maxLines, this.$textAlign, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
            }
        });
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void TextWithSeparatorFirstEmptyPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1116705163);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1116705163, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TextWithSeparatorFirstEmptyPreview (TextWithSeparator.kt:60)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<Composer, Integer, k0>(n10){
                final int $$changed;
                {
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TextWithSeparatorKt.access$TextWithSeparatorFirstEmptyPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void TextWithSeparatorPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1364601736);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1364601736, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TextWithSeparatorPreview (TextWithSeparator.kt:44)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<Composer, Integer, k0>(n10){
                final int $$changed;
                {
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TextWithSeparatorKt.access$TextWithSeparatorPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void TextWithSeparatorSecondEmptyPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1899699287);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1899699287, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TextWithSeparatorSecondEmptyPreview (TextWithSeparator.kt:52)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((kotlin.jvm.functions.p)new kotlin.jvm.functions.p<Composer, Integer, k0>(n10){
                final int $$changed;
                {
                    this.$$changed = n10;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TextWithSeparatorKt.access$TextWithSeparatorSecondEmptyPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$TextWithSeparatorFirstEmptyPreview(Composer composer, int n10) {
        TextWithSeparatorKt.TextWithSeparatorFirstEmptyPreview(composer, n10);
    }

    public static final /* synthetic */ void access$TextWithSeparatorPreview(Composer composer, int n10) {
        TextWithSeparatorKt.TextWithSeparatorPreview(composer, n10);
    }

    public static final /* synthetic */ void access$TextWithSeparatorSecondEmptyPreview(Composer composer, int n10) {
        TextWithSeparatorKt.TextWithSeparatorSecondEmptyPreview(composer, n10);
    }
}

