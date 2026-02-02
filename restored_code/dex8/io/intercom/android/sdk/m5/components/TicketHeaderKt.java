/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.BackgroundKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.material.IconKt
 *  androidx.compose.material.MaterialTheme
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
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.Color
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.graphics.painter.Painter
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.layout.MeasurePolicy
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.res.PainterResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.text.font.FontWeight
 *  androidx.compose.ui.text.style.TextOverflow
 *  androidx.compose.ui.tooling.preview.Preview
 *  androidx.compose.ui.tooling.preview.Preview$Container
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.TicketHeaderType;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0012\u00a8\u0006\u0016"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "Lio/intercom/android/sdk/m5/components/TicketHeaderType;", "headerType", "Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "args", "Lkotlin/k0;", "TicketHeader", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/components/TicketHeaderType;Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;Landroidx/compose/runtime/Composer;II)V", "", "text", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "SimpleTicketHeader", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/runtime/Composer;II)V", "TicketStatusChip", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;Landroidx/compose/runtime/Composer;II)V", "TicketHeaderPreview", "(Landroidx/compose/runtime/Composer;I)V", "TicketHeaderLongTextPreview", "TicketChipPreview", "TicketChipLongTextPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nTicketHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketHeader.kt\nio/intercom/android/sdk/m5/components/TicketHeaderKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n87#2,6:202\n93#2:236\n97#2:243\n87#2,6:245\n93#2:279\n97#2:287\n79#3,11:208\n92#3:242\n79#3,11:251\n92#3:286\n456#4,8:219\n464#4,3:233\n467#4,3:239\n456#4,8:262\n464#4,3:276\n467#4,3:283\n3737#5,6:227\n3737#5,6:270\n154#6:237\n154#6:238\n154#6:244\n154#6:280\n154#6:281\n1#7:282\n*S KotlinDebug\n*F\n+ 1 TicketHeader.kt\nio/intercom/android/sdk/m5/components/TicketHeaderKt\n*L\n58#1:202,6\n58#1:236\n58#1:243\n86#1:245,6\n86#1:279\n86#1:287\n58#1:208,11\n58#1:242\n86#1:251,11\n86#1:286\n58#1:219,8\n58#1:233,3\n58#1:239,3\n86#1:262,8\n86#1:276,3\n86#1:283,3\n58#1:227,6\n86#1:270,6\n63#1:237\n68#1:238\n93#1:244\n97#1:280\n102#1:281\n*E\n"})
public final class TicketHeaderKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void SimpleTicketHeader(@Nullable Modifier modifier, @NotNull String string2, @Nullable FontWeight fontWeight, @Nullable Composer composer, int n10, int n13) {
        int n14;
        int n15;
        y.j(string2, "text");
        composer = composer.startRestartGroup(-921635597);
        int n16 = n13 & 1;
        if (n16 != 0) {
            n15 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n14 = composer.changed((Object)modifier) ? 4 : 2;
            n15 = n14 | n10;
        } else {
            n15 = n10;
        }
        if ((n13 & 2) != 0) {
            n14 = n15 | 0x30;
        } else {
            n14 = n15;
            if ((n10 & 0x70) == 0) {
                n14 = composer.changed((Object)string2) ? 32 : 16;
                n14 = n15 | n14;
            }
        }
        int n17 = n13 & 4;
        if (n17 != 0) {
            n15 = n14 | 0x180;
        } else {
            n15 = n14;
            if ((n10 & 0x380) == 0) {
                n15 = composer.changed((Object)fontWeight) ? 256 : 128;
                n15 = n14 | n15;
            }
        }
        if ((n15 & 0x2DB) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (n16 != 0) {
                modifier = Modifier.Companion;
            }
            if (n17 != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-921635597, (int)n15, (int)-1, (String)"io.intercom.android.sdk.m5.components.SimpleTicketHeader (TicketHeader.kt:52)");
            }
            Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
            Object object = SizeKt.wrapContentSize$default((Modifier)modifier, null, (boolean)false, (int)3, null);
            composer.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicy = RowKt.rowMeasurePolicy((Arrangement.Horizontal)Arrangement.INSTANCE.getStart(), (Alignment.Vertical)vertical, (Composer)composer, (int)48);
            composer.startReplaceableGroup(-1323940314);
            n14 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            CompositionLocalMap compositionLocalMap = composer.getCurrentCompositionLocalMap();
            vertical = ComposeUiNode.Companion;
            a a14 = vertical.getConstructor();
            object = LayoutKt.modifierMaterializerOf((Modifier)object);
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
            Updater.set-impl((Composer)a14, (Object)measurePolicy, (p)vertical.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)vertical.getSetResolvedCompositionLocals());
            vertical = vertical.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n14)) {
                a14.updateRememberedValue((Object)n14);
                a14.apply((Object)n14, (p)vertical);
            }
            object.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            vertical = RowScopeInstance.INSTANCE;
            measurePolicy = Modifier.Companion;
            compositionLocalMap = SizeKt.size-3ABfNKs((Modifier)measurePolicy, (float)Dp.constructor-impl((float)16));
            vertical = PainterResources_androidKt.painterResource((int)R.drawable.intercom_ticket_detail_icon, (Composer)composer, (int)0);
            object = IntercomTheme.INSTANCE;
            n14 = IntercomTheme.$stable;
            IconKt.Icon-ww6aTOc((Painter)vertical, null, (Modifier)compositionLocalMap, (long)((IntercomTheme)object).getColors(composer, n14).getDescriptionText-0d7_KjU(), (Composer)composer, (int)440, (int)0);
            SpacerKt.Spacer((Modifier)SizeKt.width-3ABfNKs((Modifier)measurePolicy, (float)Dp.constructor-impl((float)4)), (Composer)composer, (int)6);
            vertical = TextStyle.copy-p1EtxEg$default((TextStyle)((IntercomTheme)object).getTypography(composer, n14).getType04(), (long)((IntercomTheme)object).getColors(composer, n14).getDescriptionText-0d7_KjU(), (long)0L, (FontWeight)fontWeight, null, null, null, null, (long)0L, null, null, null, (long)0L, null, null, null, (int)0, (int)0, (long)0L, null, null, null, (int)0, (int)0, null, (int)0xFFFFFA, null);
            n14 = TextOverflow.Companion.getEllipsis-gIe3tQ8();
            TextKt.Text--4IGK_g((String)string2, null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)n14, (boolean)false, (int)1, (int)0, null, (TextStyle)vertical, (Composer)composer, (int)(n15 >> 3 & 0xE), (int)3120, (int)55294);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer = composer.endRestartGroup();
        if (composer != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(modifier, string2, fontWeight, n10, n13){
                final int $$changed;
                final int $$default;
                final FontWeight $fontWeight;
                final Modifier $modifier;
                final String $text;
                {
                    this.$modifier = modifier;
                    this.$text = string2;
                    this.$fontWeight = fontWeight;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TicketHeaderKt.SimpleTicketHeader(this.$modifier, this.$text, this.$fontWeight, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview.Container(value={@Preview(uiMode=16), @Preview(uiMode=32)})
    private static final void TicketChipLongTextPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1670746106);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1670746106, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketChipLongTextPreview (TicketHeader.kt:185)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)1638149552, (boolean)true, (Object)new p<Composer, Integer, k0>(new TicketStatusHeaderArgs("Very long long long long title", "Waiting on you", Color.Companion.getRed-0d7_KjU(), null, 8, null)){
                final TicketStatusHeaderArgs $args;
                {
                    this.$args = ticketStatusHeaderArgs;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)1638149552, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketChipLongTextPreview.<anonymous> (TicketHeader.kt:191)");
                        }
                        SurfaceKt.Surface-F-jzlyU((Modifier)SizeKt.wrapContentSize$default((Modifier)Modifier.Companion, null, (boolean)false, (int)3, null), null, (long)0L, (long)0L, null, (float)0.0f, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)886479340, (boolean)true, (Object)new p<Composer, Integer, k0>(this.$args){
                            final TicketStatusHeaderArgs $args;
                            {
                                this.$args = ticketStatusHeaderArgs;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                            public final void invoke(@Nullable Composer composer, int n10) {
                                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart((int)886479340, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketChipLongTextPreview.<anonymous>.<anonymous> (TicketHeader.kt:192)");
                                    }
                                    TicketHeaderKt.TicketHeader(null, TicketHeaderType.CHIP, this.$args, composer, 48, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }), (Composer)composer, (int)1572870, (int)62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), composer, 3072, 7);
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
                    TicketHeaderKt.access$TicketChipLongTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview.Container(value={@Preview(uiMode=16), @Preview(uiMode=32)})
    private static final void TicketChipPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-267088483);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-267088483, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketChipPreview (TicketHeader.kt:166)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)-1881959097, (boolean)true, (Object)new p<Composer, Integer, k0>(new TicketStatusHeaderArgs("Bug", "Waiting on you", Color.Companion.getRed-0d7_KjU(), null, 8, null)){
                final TicketStatusHeaderArgs $args;
                {
                    this.$args = ticketStatusHeaderArgs;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)-1881959097, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketChipPreview.<anonymous> (TicketHeader.kt:172)");
                        }
                        SurfaceKt.Surface-F-jzlyU((Modifier)SizeKt.wrapContentSize$default((Modifier)Modifier.Companion, null, (boolean)false, (int)3, null), null, (long)0L, (long)0L, null, (float)0.0f, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)-438043261, (boolean)true, (Object)new p<Composer, Integer, k0>(this.$args){
                            final TicketStatusHeaderArgs $args;
                            {
                                this.$args = ticketStatusHeaderArgs;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                            public final void invoke(@Nullable Composer composer, int n10) {
                                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart((int)-438043261, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketChipPreview.<anonymous>.<anonymous> (TicketHeader.kt:173)");
                                    }
                                    TicketHeaderKt.TicketHeader(null, TicketHeaderType.CHIP, this.$args, composer, 48, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }), (Composer)composer, (int)1572870, (int)62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), composer, 3072, 7);
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
                    TicketHeaderKt.access$TicketChipPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TicketHeader(@Nullable Modifier modifier, @NotNull TicketHeaderType ticketHeaderType, @NotNull TicketStatusHeaderArgs ticketStatusHeaderArgs, @Nullable Composer composer, int n10, int n13) {
        int n14;
        int n15;
        y.j((Object)ticketHeaderType, "headerType");
        y.j(ticketStatusHeaderArgs, "args");
        Composer composer2 = composer.startRestartGroup(-282677532);
        int n16 = n13 & 1;
        if (n16 != 0) {
            n15 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n14 = composer2.changed((Object)modifier) ? 4 : 2;
            n15 = n14 | n10;
        } else {
            n15 = n10;
        }
        if ((n13 & 2) != 0) {
            n14 = n15 | 0x30;
        } else {
            n14 = n15;
            if ((n10 & 0x70) == 0) {
                n14 = composer2.changed((Object)ticketHeaderType) ? 32 : 16;
                n14 = n15 | n14;
            }
        }
        if ((n13 & 4) != 0) {
            n15 = n14 | 0x180;
        } else {
            n15 = n14;
            if ((n10 & 0x380) == 0) {
                n15 = composer2.changed((Object)ticketStatusHeaderArgs) ? 256 : 128;
                n15 = n14 | n15;
            }
        }
        if ((n15 & 0x2DB) == 146 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            composer = modifier;
        } else {
            if (n16 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-282677532, (int)n15, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeader (TicketHeader.kt:32)");
            }
            if ((n14 = WhenMappings.$EnumSwitchMapping$0[ticketHeaderType.ordinal()]) != 1) {
                if (n14 != 2) {
                    composer2.startReplaceableGroup(491939909);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(491939818);
                    TicketHeaderKt.TicketStatusChip(modifier, ticketStatusHeaderArgs, composer2, n15 & 0xE | n15 >> 3 & 0x70, 0);
                    composer2.endReplaceableGroup();
                }
            } else {
                composer2.startReplaceableGroup(491939648);
                TicketHeaderKt.SimpleTicketHeader(modifier, ticketStatusHeaderArgs.getTitle(), ticketStatusHeaderArgs.getFontWeight(), composer2, n15 & 0xE, 0);
                composer2.endReplaceableGroup();
            }
            composer = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer = modifier;
            }
        }
        modifier = composer2.endRestartGroup();
        if (modifier != null) {
            modifier.updateScope((p)new p<Composer, Integer, k0>((Modifier)composer, ticketHeaderType, ticketStatusHeaderArgs, n10, n13){
                final int $$changed;
                final int $$default;
                final TicketStatusHeaderArgs $args;
                final TicketHeaderType $headerType;
                final Modifier $modifier;
                {
                    this.$modifier = modifier;
                    this.$headerType = ticketHeaderType;
                    this.$args = ticketStatusHeaderArgs;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TicketHeaderKt.TicketHeader(this.$modifier, this.$headerType, this.$args, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview.Container(value={@Preview(uiMode=16), @Preview(uiMode=32)})
    private static final void TicketHeaderLongTextPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-1234985657);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1234985657, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeaderLongTextPreview (TicketHeader.kt:144)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)337942641, (boolean)true, (Object)new p<Composer, Integer, k0>(new TicketStatusHeaderArgs("Very long long long long title", "Waiting on you", Color.Companion.getRed-0d7_KjU(), null, 8, null)){
                final TicketStatusHeaderArgs $args;
                {
                    this.$args = ticketStatusHeaderArgs;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)337942641, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeaderLongTextPreview.<anonymous> (TicketHeader.kt:150)");
                        }
                        SurfaceKt.Surface-F-jzlyU((Modifier)SizeKt.wrapContentSize$default((Modifier)Modifier.Companion, null, (boolean)false, (int)3, null), null, (long)0L, (long)0L, null, (float)0.0f, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)-462625363, (boolean)true, (Object)new p<Composer, Integer, k0>(this.$args){
                            final TicketStatusHeaderArgs $args;
                            {
                                this.$args = ticketStatusHeaderArgs;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                            public final void invoke(@Nullable Composer composer, int n10) {
                                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart((int)-462625363, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeaderLongTextPreview.<anonymous>.<anonymous> (TicketHeader.kt:154)");
                                    }
                                    TicketHeaderKt.TicketHeader(null, TicketHeaderType.SIMPLE, this.$args, composer, 48, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }), (Composer)composer, (int)1572870, (int)62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), composer, 3072, 7);
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
                    TicketHeaderKt.access$TicketHeaderLongTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    @Preview.Container(value={@Preview(uiMode=16), @Preview(uiMode=32)})
    private static final void TicketHeaderPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1418431454);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1418431454, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeaderPreview (TicketHeader.kt:125)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)10965256, (boolean)true, (Object)new p<Composer, Integer, k0>(new TicketStatusHeaderArgs("Bug", "Waiting on you", Color.Companion.getRed-0d7_KjU(), null, 8, null)){
                final TicketStatusHeaderArgs $args;
                {
                    this.$args = ticketStatusHeaderArgs;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)10965256, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeaderPreview.<anonymous> (TicketHeader.kt:131)");
                        }
                        SurfaceKt.Surface-F-jzlyU((Modifier)SizeKt.wrapContentSize$default((Modifier)Modifier.Companion, null, (boolean)false, (int)3, null), null, (long)0L, (long)0L, null, (float)0.0f, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)339647044, (boolean)true, (Object)new p<Composer, Integer, k0>(this.$args){
                            final TicketStatusHeaderArgs $args;
                            {
                                this.$args = ticketStatusHeaderArgs;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                            public final void invoke(@Nullable Composer composer, int n10) {
                                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart((int)339647044, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketHeaderPreview.<anonymous>.<anonymous> (TicketHeader.kt:132)");
                                    }
                                    TicketHeaderKt.TicketHeader(null, TicketHeaderType.SIMPLE, this.$args, composer, 48, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }), (Composer)composer, (int)1572870, (int)62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), composer, 3072, 7);
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
                    TicketHeaderKt.access$TicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TicketStatusChip(@Nullable Modifier modifier, @NotNull TicketStatusHeaderArgs ticketStatusHeaderArgs, @Nullable Composer object, int n10, int n13) {
        int n14;
        int n15;
        y.j(ticketStatusHeaderArgs, "args");
        Composer composer = object.startRestartGroup(2062232900);
        int n16 = n13 & 1;
        if (n16 != 0) {
            n15 = n10 | 6;
        } else if ((n10 & 0xE) == 0) {
            n15 = composer.changed((Object)modifier) ? 4 : 2;
            n15 |= n10;
        } else {
            n15 = n10;
        }
        if ((n13 & 2) != 0) {
            n14 = n15 | 0x30;
        } else {
            n14 = n15;
            if ((n10 & 0x70) == 0) {
                n14 = composer.changed((Object)ticketStatusHeaderArgs) ? 32 : 16;
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
                ComposerKt.traceEventStart((int)2062232900, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.TicketStatusChip (TicketHeader.kt:81)");
            }
            Object object2 = Alignment.Companion.getCenterVertically();
            object = BackgroundKt.background-bw27NRU((Modifier)modifier, (long)Color.copy-wmQWz5c$default((long)ticketStatusHeaderArgs.getTint-0d7_KjU(), (float)0.1f, (float)0.0f, (float)0.0f, (float)0.0f, (int)14, null), (Shape)MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getSmall());
            float f11 = Dp.constructor-impl((float)2);
            object = SizeKt.wrapContentSize$default((Modifier)PaddingKt.padding-VpY3zN4((Modifier)object, (float)Dp.constructor-impl((float)8), (float)f11), null, (boolean)false, (int)3, null);
            composer.startReplaceableGroup(693286680);
            object2 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)Arrangement.INSTANCE.getStart(), (Alignment.Vertical)object2, (Composer)composer, (int)48);
            composer.startReplaceableGroup(-1323940314);
            n15 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
            Object object3 = composer.getCurrentCompositionLocalMap();
            Object object4 = ComposeUiNode.Companion;
            a a14 = object4.getConstructor();
            object = LayoutKt.modifierMaterializerOf((Modifier)object);
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
            Updater.set-impl((Composer)a14, (Object)object2, (p)object4.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)object3, (p)object4.getSetResolvedCompositionLocals());
            object2 = object4.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n15)) {
                a14.updateRememberedValue((Object)n15);
                a14.apply((Object)n15, (p)object2);
            }
            object.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
            composer.startReplaceableGroup(2058660585);
            object = RowScopeInstance.INSTANCE;
            object2 = Modifier.Companion;
            object = SizeKt.size-3ABfNKs((Modifier)object2, (float)Dp.constructor-impl((float)16));
            IconKt.Icon-ww6aTOc((Painter)PainterResources_androidKt.painterResource((int)R.drawable.intercom_ticket_detail_icon, (Composer)composer, (int)0), null, (Modifier)object, (long)ticketStatusHeaderArgs.getTint-0d7_KjU(), (Composer)composer, (int)440, (int)0);
            SpacerKt.Spacer((Modifier)SizeKt.width-3ABfNKs((Modifier)object2, (float)Dp.constructor-impl((float)4)), (Composer)composer, (int)6);
            object = object2 = ticketStatusHeaderArgs.getTitle();
            if (object2.length() > 0) {
                object = new StringBuilder();
                object3 = String.valueOf(((String)object2).charAt(0));
                y.h(object3, "null cannot be cast to non-null type java.lang.String");
                object3 = ((String)object3).toUpperCase(Locale.ROOT);
                y.i(object3, "toUpperCase(...)");
                ((StringBuilder)object).append(object3);
                object2 = ((String)object2).substring(1);
                y.i(object2, "substring(...)");
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
            }
            object2 = object3 = ticketStatusHeaderArgs.getStatus();
            if (object3.length() > 0) {
                object2 = new StringBuilder();
                object4 = String.valueOf(((String)object3).charAt(0));
                y.h(object4, "null cannot be cast to non-null type java.lang.String");
                object4 = ((String)object4).toUpperCase(Locale.ROOT);
                y.i(object4, "toUpperCase(...)");
                ((StringBuilder)object2).append(object4);
                object3 = ((String)object3).substring(1);
                y.i(object3, "substring(...)");
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
            }
            object3 = TextStyle.copy-p1EtxEg$default((TextStyle)IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04(), (long)ticketStatusHeaderArgs.getTint-0d7_KjU(), (long)0L, (FontWeight)ticketStatusHeaderArgs.getFontWeight(), null, null, null, null, (long)0L, null, null, null, (long)0L, null, null, null, (int)0, (int)0, (long)0L, null, null, null, (int)0, (int)0, null, (int)0xFFFFFA, null);
            n15 = TextOverflow.Companion.getEllipsis-gIe3tQ8();
            TextWithSeparatorKt.TextWithSeparator-wV1YYcM((String)object, (String)object2, null, null, (TextStyle)object3, 0L, n15, 1, null, composer, 0xD80000, 300);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        object = composer.endRestartGroup();
        if (object != null) {
            object.updateScope((p)new p<Composer, Integer, k0>(modifier, ticketStatusHeaderArgs, n10, n13){
                final int $$changed;
                final int $$default;
                final TicketStatusHeaderArgs $args;
                final Modifier $modifier;
                {
                    this.$modifier = modifier;
                    this.$args = ticketStatusHeaderArgs;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    TicketHeaderKt.TicketStatusChip(this.$modifier, this.$args, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    public static final /* synthetic */ void access$TicketChipLongTextPreview(Composer composer, int n10) {
        TicketHeaderKt.TicketChipLongTextPreview(composer, n10);
    }

    public static final /* synthetic */ void access$TicketChipPreview(Composer composer, int n10) {
        TicketHeaderKt.TicketChipPreview(composer, n10);
    }

    public static final /* synthetic */ void access$TicketHeaderLongTextPreview(Composer composer, int n10) {
        TicketHeaderKt.TicketHeaderLongTextPreview(composer, n10);
    }

    public static final /* synthetic */ void access$TicketHeaderPreview(Composer composer, int n10) {
        TicketHeaderKt.TicketHeaderPreview(composer, n10);
    }

    @Metadata(k=3, mv={1, 8, 0}, xi=48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[TicketHeaderType.values().length];
            try {
                nArray[TicketHeaderType.SIMPLE.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[TicketHeaderType.CHIP.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

