/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.StringRes
 *  androidx.compose.foundation.BackgroundKt
 *  androidx.compose.foundation.ClickableKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
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
 *  androidx.compose.foundation.layout.e
 *  androidx.compose.foundation.shape.RoundedCornerShapeKt
 *  androidx.compose.material.IconKt
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
 *  androidx.compose.runtime.ScopeUpdateScope
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.draw.ClipKt
 *  androidx.compose.ui.draw.DrawModifierKt
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.graphics.ColorKt
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.platform.TestTagKt
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.res.StringResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.text.font.FontWeight
 *  androidx.compose.ui.text.style.TextOverflow
 *  androidx.compose.ui.tooling.preview.Preview
 *  androidx.compose.ui.unit.Dp
 *  androidx.compose.ui.unit.TextUnitKt
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.functions.q
 */
package io.intercom.android.sdk.m5.components;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0082\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\b\u00062\b\b\u0002\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0013\u00a8\u0006\u0017"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "", "icon", "Lkotlin/Function0;", "Lkotlin/k0;", "Landroidx/compose/runtime/Composable;", "avatarIcon", "iconModifier", "text", "", "textString", "subtitle", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "badge", "onClick", "HomeItem", "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/p;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/Composer;II)V", "HomeSendMessagePreview", "(Landroidx/compose/runtime/Composer;I)V", "HomeMessagesPreview", "HomeTicketsPreview", "HomeTicketsRTLPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nHomeItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeItem.kt\nio/intercom/android/sdk/m5/components/HomeItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,184:1\n154#2:185\n154#2:193\n154#2:229\n154#2:269\n154#2:347\n154#2:353\n36#3:186\n456#3,8:211\n464#3,3:225\n456#3,8:246\n464#3,3:260\n467#3,3:264\n456#3,8:288\n464#3,3:302\n467#3,3:306\n456#3,8:329\n464#3,3:343\n467#3,3:348\n467#3,3:354\n1116#4,6:187\n87#5,6:194\n93#5:228\n86#5,7:270\n93#5:305\n97#5:310\n97#5:358\n79#6,11:200\n79#6,11:235\n92#6:267\n79#6,11:277\n92#6:309\n79#6,11:318\n92#6:351\n92#6:357\n3737#7,6:219\n3737#7,6:254\n3737#7,6:296\n3737#7,6:337\n75#8,5:230\n80#8:263\n84#8:268\n67#9,7:311\n74#9:346\n78#9:352\n*S KotlinDebug\n*F\n+ 1 HomeItem.kt\nio/intercom/android/sdk/m5/components/HomeItemKt\n*L\n42#1:185\n53#1:193\n58#1:229\n77#1:269\n104#1:347\n112#1:353\n52#1:186\n49#1:211,8\n49#1:225,3\n56#1:246,8\n56#1:260,3\n56#1:264,3\n75#1:288,8\n75#1:302,3\n75#1:306,3\n92#1:329,8\n92#1:343,3\n92#1:348,3\n49#1:354,3\n52#1:187,6\n49#1:194,6\n49#1:228\n75#1:270,7\n75#1:305\n75#1:310\n49#1:358\n49#1:200,11\n56#1:235,11\n56#1:267\n75#1:277,11\n75#1:309\n92#1:318,11\n92#1:351\n49#1:357\n49#1:219,6\n56#1:254,6\n75#1:296,6\n92#1:337,6\n56#1:230,5\n56#1:263\n56#1:268\n92#1:311,7\n92#1:346\n92#1:352\n*E\n"})
public final class HomeItemKt {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Composable
    @ComposableInferredTarget(scheme="[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HomeItem(@Nullable Modifier object, @DrawableRes @Nullable Integer object2, @Nullable p<? super Composer, ? super Integer, k0> object3, @Nullable Modifier object4, @StringRes @Nullable Integer object5, @Nullable String string2, @Nullable String object6, @Nullable HomeItemBadge object7, @Nullable a<k0> p14, @Nullable Composer object8, int n10, int n13) {
        void var6_31;
        void var5_25;
        void var2_17;
        void var1_11;
        void var0_5;
        Object object9;
        Object object10;
        Object object11;
        void var10_67;
        void var11_68;
        Composer composer;
        Integer n14;
        block80: {
            void var2_16;
            void var5_23;
            void var7_48;
            void var0_3;
            void var7_36;
            void var6_29;
            Modifier modifier;
            void var24_84;
            int n15;
            int n16;
            int n17;
            block82: {
                block81: {
                    int n18;
                    void var7_32;
                    int n19;
                    void var6_26;
                    int n23;
                    void var5_20;
                    int n24;
                    int n25;
                    int n26;
                    void var2_12;
                    int n27;
                    void var1_6;
                    int n28;
                    block79: {
                        block78: {
                            block77: {
                                block76: {
                                    composer = n14.startRestartGroup(77718407);
                                    n17 = var11_68 & 1;
                                    if (n17 != 0) {
                                        n16 = var10_67 | 6;
                                    } else if ((var10_67 & 0xE) == 0) {
                                        n16 = composer.changed(object) ? 4 : 2;
                                        n16 |= var10_67;
                                    } else {
                                        n16 = var10_67;
                                    }
                                    n28 = var11_68 & 2;
                                    if (n28 != 0) {
                                        n15 = n16 | 0x30;
                                    } else {
                                        n15 = n16;
                                        if ((var10_67 & 0x70) == 0) {
                                            n15 = composer.changed((Object)var1_6) ? 32 : 16;
                                        }
                                    }
                                    n16 = n15;
                                    break block76;
                                    n16 |= n15;
                                }
                                n27 = var11_68 & 4;
                                if (n27 != 0) {
                                    n15 = n16 | 0x180;
                                } else {
                                    n15 = n16;
                                    if ((var10_67 & 0x380) == 0) {
                                        n15 = composer.changedInstance((Object)var2_12) ? 256 : 128;
                                    }
                                }
                                n16 = n15;
                                break block77;
                                n16 |= n15;
                            }
                            n26 = var11_68 & 8;
                            if (n26 != 0) {
                                n15 = n16 | 0xC00;
                            } else {
                                n15 = n16;
                                if ((var10_67 & 0x1C00) == 0) {
                                    n15 = composer.changed(object11) ? 2048 : 1024;
                                }
                            }
                            n16 = n15;
                            break block78;
                            n16 |= n15;
                        }
                        n25 = var11_68 & 0x10;
                        if (n25 != 0) {
                            n15 = n16 | 0x6000;
                        } else {
                            n15 = n16;
                            if ((var10_67 & 0xE000) == 0) {
                                n15 = composer.changed(object10) ? 16384 : 8192;
                                n15 = n16 | n15;
                            }
                        }
                        n24 = var11_68 & 0x20;
                        if (n24 != 0) {
                            n16 = n15 | 0x30000;
                        } else {
                            n16 = n15;
                            if ((var10_67 & 0x70000) == 0) {
                                n16 = composer.changed((Object)var5_20) ? 131072 : 65536;
                                n16 = n15 | n16;
                            }
                        }
                        n23 = var11_68 & 0x40;
                        if (n23 != 0) {
                            n15 = n16 | 0x180000;
                        } else {
                            n15 = n16;
                            if ((var10_67 & 0x380000) == 0) {
                                n15 = composer.changed((Object)var6_26) ? 0x100000 : 524288;
                                n15 = n16 | n15;
                            }
                        }
                        n19 = var11_68 & 0x80;
                        if (n19 != 0) {
                            n16 = n15 | 0xC00000;
                        } else {
                            n16 = n15;
                            if ((var10_67 & 0x1C00000) == 0) {
                                n16 = composer.changed((Object)var7_32) ? 0x800000 : 0x400000;
                                n16 = n15 | n16;
                            }
                        }
                        n18 = var11_68 & 0x100;
                        if (n18 != 0) {
                            n15 = n16 | 0x6000000;
                        } else {
                            n15 = n16;
                            if ((var10_67 & 0xE000000) == 0) {
                                n15 = composer.changedInstance(object9) ? 0x4000000 : 0x2000000;
                                n15 = n16 | n15;
                            }
                        }
                        if ((n15 & 0xB6DB6DB) != 0x2492492 || !composer.getSkipping()) break block79;
                        composer.skipToGroupEnd();
                        void var24_81 = var2_12;
                        void var2_13 = object11;
                        n14 = var1_6;
                        void var1_7 = var24_81;
                        object11 = object10;
                        object10 = var7_32;
                        break block80;
                    }
                    if (n17 != 0) {
                        Modifier.Companion companion = Modifier.Companion;
                    } else {
                        Object object12 = object;
                    }
                    n14 = var1_6;
                    if (n28 != 0) {
                        n14 = null;
                    }
                    if (n27 != 0) {
                        p<Composer, Integer, k0> p15 = ComposableSingletons$HomeItemKt.INSTANCE.getLambda-1$intercom_sdk_base_release();
                    } else {
                        void var1_9 = var2_12;
                    }
                    if (n26 != 0) {
                        Modifier modifier2 = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, (float)Dp.constructor-impl((float)16));
                    } else {
                        void var2_15 = object11;
                    }
                    object11 = n25 != 0 ? null : object10;
                    if (n24 != 0) {
                        Object var0_1 = null;
                    } else {
                        void var0_2 = var5_20;
                    }
                    if (n23 != 0) {
                        Object var5_21 = null;
                    } else {
                        void var5_22 = var6_26;
                    }
                    object10 = n19 != 0 ? HomeItemBadge.None.INSTANCE : var7_32;
                    if (n18 != 0) {
                        HomeItem.1 var6_27 = HomeItem.1.INSTANCE;
                    } else {
                        void var6_28 = object9;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)77718407, (int)n15, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeItem (HomeItem.kt:37)");
                    }
                    modifier = SizeKt.fillMaxWidth$default((Modifier)var24_84, (float)0.0f, (int)1, null);
                    composer.startReplaceableGroup(1157296644);
                    boolean bl2 = composer.changed((Object)var6_29);
                    object9 = composer.rememberedValue();
                    if (bl2) break block81;
                    Object object13 = object9;
                    if (object9 != Composer.Companion.getEmpty()) break block82;
                }
                a<k0> a14 = new a<k0>((a<k0>)var6_29){
                    final a<k0> $onClick;
                    {
                        this.$onClick = a14;
                        super(0);
                    }

                    public final void invoke() {
                        this.$onClick.invoke();
                    }
                };
                composer.updateRememberedValue((Object)a14);
            }
            composer.endReplaceableGroup();
            Modifier modifier3 = PaddingKt.padding-VpY3zN4((Modifier)ClickableKt.clickable-XHw0xAI$default((Modifier)modifier, (boolean)false, null, null, (a)((a)var7_36), (int)7, null), (float)Dp.constructor-impl((float)16), (float)Dp.constructor-impl((float)12));
            modifier = Alignment.Companion;
            Alignment.Vertical vertical = modifier.getCenterVertically();
            composer.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Object object14 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)arrangement.getStart(), (Alignment.Vertical)vertical, (Composer)composer, (int)48);
            composer.startReplaceableGroup(-1323940314);
            n16 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
            object9 = ComposeUiNode.Companion;
            a a15 = object9.getConstructor();
            modifier3 = LayoutKt.modifierMaterializerOf((Modifier)modifier3);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(a15);
            } else {
                composer.useNode();
            }
            a15 = Updater.constructor-impl((Composer)composer);
            Updater.set-impl((Composer)a15, (Object)object14, (p)object9.getSetMeasurePolicy());
            Updater.set-impl((Composer)a15, (Object)compositionLocalMap, (p)object9.getSetResolvedCompositionLocals());
            p p16 = object9.getSetCompositeKeyHash();
            if (a15.getInserting() || !y.e(a15.rememberedValue(), n16)) {
                a15.updateRememberedValue((Object)n16);
                a15.apply((Object)n16, p16);
            }
            modifier3.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            a15 = RowScopeInstance.INSTANCE;
            modifier3 = Modifier.Companion;
            Modifier modifier4 = e.a((RowScope)a15, (Modifier)modifier3, (float)2.0f, (boolean)false, (int)2, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = arrangement.spacedBy-0680j_4(Dp.constructor-impl((float)4));
            composer.startReplaceableGroup(-483455358);
            object14 = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)horizontalOrVertical, (Alignment.Horizontal)modifier.getStart(), (Composer)composer, (int)6);
            composer.startReplaceableGroup(-1323940314);
            n16 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            CompositionLocalMap compositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            a a16 = object9.getConstructor();
            modifier4 = LayoutKt.modifierMaterializerOf((Modifier)modifier4);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(a16);
            } else {
                composer.useNode();
            }
            a16 = Updater.constructor-impl((Composer)composer);
            Updater.set-impl((Composer)a16, (Object)object14, (p)object9.getSetMeasurePolicy());
            Updater.set-impl((Composer)a16, (Object)compositionLocalMap2, (p)object9.getSetResolvedCompositionLocals());
            p p17 = object9.getSetCompositeKeyHash();
            if (a16.getInserting() || !y.e(a16.rememberedValue(), n16)) {
                a16.updateRememberedValue((Object)n16);
                a16.apply((Object)n16, p17);
            }
            modifier4.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-1014322661);
            if (object11 != null) {
                String string3 = StringResources_androidKt.stringResource((int)((Integer)object11), (Composer)composer, (int)(n15 >> 12 & 0xE));
            } else if (var0_3 == null) {
                String string4 = "";
            } else {
                void var7_47 = var0_3;
            }
            composer.endReplaceableGroup();
            object14 = IntercomTheme.INSTANCE;
            n16 = IntercomTheme.$stable;
            modifier4 = ((IntercomTheme)object14).getTypography(composer, n16).getType04SemiBold();
            TextKt.Text--4IGK_g((String)var7_48, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)TextOverflow.Companion.getEllipsis-gIe3tQ8(), (boolean)false, (int)2, (int)0, null, (TextStyle)modifier4, (Composer)composer, (int)0, (int)3120, (int)55294);
            composer.startReplaceableGroup(-249299352);
            if (var5_23 != null) {
                TextStyle textStyle = ((IntercomTheme)object14).getTypography(composer, n16).getType04();
                TextKt.Text--4IGK_g((String)var5_23, null, (long)ColorKt.Color((long)0xFF757575L), (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)textStyle, (Composer)composer, (int)(n15 >> 18 & 0xE | 0x180), (int)0, (int)65530);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (y.e(object10, HomeItemBadge.None.INSTANCE)) {
                void var1_10;
                composer.startReplaceableGroup(-249299062);
                Alignment.Vertical vertical2 = modifier.getCenterVertically();
                modifier = arrangement.spacedBy-0680j_4(Dp.constructor-impl((float)8));
                composer.startReplaceableGroup(693286680);
                arrangement = RowKt.rowMeasurePolicy((Arrangement.Horizontal)modifier, (Alignment.Vertical)vertical2, (Composer)composer, (int)54);
                composer.startReplaceableGroup(-1323940314);
                n17 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                modifier = composer.getCurrentCompositionLocalMap();
                a15 = object9.getConstructor();
                q q12 = LayoutKt.modifierMaterializerOf((Modifier)modifier3);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(a15);
                } else {
                    composer.useNode();
                }
                modifier3 = Updater.constructor-impl((Composer)composer);
                Updater.set-impl((Composer)modifier3, (Object)arrangement, (p)object9.getSetMeasurePolicy());
                Updater.set-impl((Composer)modifier3, (Object)modifier, (p)object9.getSetResolvedCompositionLocals());
                object9 = object9.getSetCompositeKeyHash();
                if (modifier3.getInserting() || !y.e(modifier3.rememberedValue(), n17)) {
                    modifier3.updateRememberedValue((Object)n17);
                    modifier3.apply((Object)n17, (p)object9);
                }
                q12.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                composer.startReplaceableGroup(2058660585);
                var1_10.invoke((Object)composer, (Object)(n15 >> 6 & 0xE));
                composer.startReplaceableGroup(-249298858);
                if (n14 != null) {
                    Modifier modifier5 = TestTagKt.testTag((Modifier)var2_16, (String)n14.toString());
                    IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)n14, (Composer)composer, (int)(n15 >> 3 & 0xE)), null, (Modifier)modifier5, (long)((IntercomTheme)object14).getColors(composer, n16).getActionContrastWhite-0d7_KjU(), (Composer)composer, (int)56, (int)0);
                    k0 k02 = k0.a;
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (y.e(object10, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                composer.startReplaceableGroup(-249298407);
                if (n14 != null) {
                    composer.startReplaceableGroup(733328855);
                    a15 = BoxKt.rememberBoxMeasurePolicy((Alignment)modifier.getTopStart(), (boolean)false, (Composer)composer, (int)0);
                    composer.startReplaceableGroup(-1323940314);
                    n17 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                    modifier4 = composer.getCurrentCompositionLocalMap();
                    arrangement = object9.getConstructor();
                    q q14 = LayoutKt.modifierMaterializerOf((Modifier)modifier3);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode((a)arrangement);
                    } else {
                        composer.useNode();
                    }
                    arrangement = Updater.constructor-impl((Composer)composer);
                    Updater.set-impl((Composer)arrangement, (Object)a15, (p)object9.getSetMeasurePolicy());
                    Updater.set-impl((Composer)arrangement, (Object)modifier4, (p)object9.getSetResolvedCompositionLocals());
                    object9 = object9.getSetCompositeKeyHash();
                    if (arrangement.getInserting() || !y.e(arrangement.rememberedValue(), n17)) {
                        arrangement.updateRememberedValue((Object)n17);
                        arrangement.apply((Object)n17, (p)object9);
                    }
                    q14.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                    composer.startReplaceableGroup(2058660585);
                    object9 = BoxScopeInstance.INSTANCE;
                    Modifier modifier6 = TestTagKt.testTag((Modifier)ClipKt.clip((Modifier)var2_16, (Shape)new CutIconWithIndicatorShape(0.0f, 1, null)), (String)n14.toString());
                    IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)n14, (Composer)composer, (int)(n15 >> 3 & 0xE)), null, (Modifier)modifier6, (long)((IntercomTheme)object14).getColors(composer, n16).getActionContrastWhite-0d7_KjU(), (Composer)composer, (int)56, (int)0);
                    BoxKt.Box((Modifier)object9.align(SizeKt.size-3ABfNKs((Modifier)BackgroundKt.background-bw27NRU((Modifier)modifier3, (long)ColorKt.Color((long)4292544041L), (Shape)RoundedCornerShapeKt.getCircleShape()), (float)Dp.constructor-impl((float)7)), modifier.getTopEnd()), (Composer)composer, (int)0);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    k0 k03 = k0.a;
                }
                composer.endReplaceableGroup();
            } else if (object10 instanceof HomeItemBadge.IndicatorWithCount) {
                composer.startReplaceableGroup(-249297596);
                Modifier modifier7 = a15.align(DrawModifierKt.drawBehind((Modifier)PaddingKt.padding-qDBjuR0$default((Modifier)modifier3, (float)0.0f, (float)0.0f, (float)Dp.constructor-impl((float)6), (float)0.0f, (int)11, null), (l)HomeItem.3.4.INSTANCE), modifier.getCenterVertically());
                TextKt.Text--4IGK_g((String)String.valueOf(((HomeItemBadge.IndicatorWithCount)object10).getCount()), (Modifier)modifier7, (long)Color.Companion.getWhite-0d7_KjU(), (long)TextUnitKt.getSp((int)11), null, (FontWeight)FontWeight.Companion.getW800(), null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, null, (Composer)composer, (int)200064, (int)0, (int)131024);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-249297061);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            void var7_62 = var0_3;
            void var0_4 = var24_84;
            object9 = var6_29;
            void var6_30 = var5_23;
            void var5_24 = var7_62;
        }
        ScopeUpdateScope scopeUpdateScope = composer.endRestartGroup();
        if (scopeUpdateScope == null) {
            return;
        }
        scopeUpdateScope.updateScope((p)new p<Composer, Integer, k0>((Modifier)var0_5, n14, (p<? super Composer, ? super Integer, k0>)var1_11, (Modifier)var2_17, object11, (String)var5_25, (String)var6_31, (HomeItemBadge)object10, (a<k0>)object9, (int)var10_67, (int)var11_68){
            final int $$changed;
            final int $$default;
            final p<Composer, Integer, k0> $avatarIcon;
            final HomeItemBadge $badge;
            final Integer $icon;
            final Modifier $iconModifier;
            final Modifier $modifier;
            final a<k0> $onClick;
            final String $subtitle;
            final Integer $text;
            final String $textString;
            {
                this.$modifier = modifier;
                this.$icon = n10;
                this.$avatarIcon = p14;
                this.$iconModifier = modifier2;
                this.$text = n13;
                this.$textString = string2;
                this.$subtitle = string3;
                this.$badge = homeItemBadge;
                this.$onClick = a14;
                this.$$changed = n14;
                this.$$default = n15;
                super(2);
            }

            public final void invoke(@Nullable Composer composer, int n10) {
                HomeItemKt.HomeItem(this.$modifier, this.$icon, this.$avatarIcon, this.$iconModifier, this.$text, this.$textString, this.$subtitle, this.$badge, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
            }
        });
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview
    private static final void HomeMessagesPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1318695433);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1318695433, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeMessagesPreview (HomeItem.kt:144)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.getLambda-5$intercom_sdk_base_release(), composer, 3072, 7);
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
                    HomeItemKt.access$HomeMessagesPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview
    private static final void HomeSendMessagePreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(861055120);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)861055120, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeSendMessagePreview (HomeItem.kt:130)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
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
                    HomeItemKt.access$HomeSendMessagePreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview
    private static final void HomeTicketsPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-279860840);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-279860840, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeTicketsPreview (HomeItem.kt:158)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.getLambda-7$intercom_sdk_base_release(), composer, 3072, 7);
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
                    HomeItemKt.access$HomeTicketsPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview(locale="ar")
    private static final void HomeTicketsRTLPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1844314002);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1844314002, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.HomeTicketsRTLPreview (HomeItem.kt:172)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.getLambda-9$intercom_sdk_base_release(), composer, 3072, 7);
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
                    HomeItemKt.access$HomeTicketsRTLPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$HomeMessagesPreview(Composer composer, int n10) {
        HomeItemKt.HomeMessagesPreview(composer, n10);
    }

    public static final /* synthetic */ void access$HomeSendMessagePreview(Composer composer, int n10) {
        HomeItemKt.HomeSendMessagePreview(composer, n10);
    }

    public static final /* synthetic */ void access$HomeTicketsPreview(Composer composer, int n10) {
        HomeItemKt.HomeTicketsPreview(composer, n10);
    }

    public static final /* synthetic */ void access$HomeTicketsRTLPreview(Composer composer, int n10) {
        HomeItemKt.HomeTicketsRTLPreview(composer, n10);
    }
}

