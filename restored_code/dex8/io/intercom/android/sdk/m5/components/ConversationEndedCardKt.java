/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
 *  androidx.compose.foundation.layout.Arrangement$Vertical
 *  androidx.compose.foundation.layout.ColumnKt
 *  androidx.compose.foundation.layout.ColumnScopeInstance
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.material.CardKt
 *  androidx.compose.material.MaterialTheme
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.graphics.RectangleShapeKt
 *  androidx.compose.ui.graphics.Shape
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.node.ComposeUiNode$Companion
 *  androidx.compose.ui.platform.TestTagKt
 *  androidx.compose.ui.res.StringResources_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt;
import io.intercom.android.sdk.m5.components.ConversationEndedCardKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\b\f\u0010\n\u00a8\u0006\r"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lkotlin/k0;", "onNewConversationClick", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "conversationEndedUiState", "ConversationEndedCard", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/a;Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;Landroidx/compose/runtime/Composer;II)V", "NewConversationCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "NewConversationCardWithButtonPreview", "NewConversationCardWithButtonBotPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nConversationEndedCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationEndedCard.kt\nio/intercom/android/sdk/m5/components/ConversationEndedCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n*S KotlinDebug\n*F\n+ 1 ConversationEndedCard.kt\nio/intercom/android/sdk/m5/components/ConversationEndedCardKt\n*L\n33#1:102\n*E\n"})
public final class ConversationEndedCardKt {
    /*
     * Unable to fully structure code
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ConversationEndedCard(@Nullable Modifier var0, @Nullable a<k0> var1_1, @Nullable ComposerState.ConversationEnded var2_2, @Nullable Composer var3_3, int var4_4, int var5_5) {
        var12_6 = var3_3.startRestartGroup(-517544614);
        var9_7 = var5_5 & 1;
        if (var9_7 != 0) {
            var7_8 = var4_4 | 6;
        } else if ((var4_4 & 14) == 0) {
            var7_8 = var12_6.changed((Object)var0) != false ? 4 : 2;
            var7_8 |= var4_4;
        } else {
            var7_8 = var4_4;
        }
        var10_9 = var5_5 & 2;
        if (var10_9 != 0) {
            var8_10 = var7_8 | 48;
            while (true) {
                var7_8 = var8_10;
                break;
            }
        } else {
            var8_10 = var7_8;
            if ((var4_4 & 112) != 0) ** continue;
            var8_10 = var12_6.changedInstance(var1_1) != false ? 32 : 16;
            var7_8 |= var8_10;
        }
        if ((var4_4 & 896) == 0) {
            var8_10 = (var5_5 & 4) == 0 && var12_6.changed((Object)var2_2) != false ? 256 : 128;
            var7_8 |= var8_10;
        }
        if ((var7_8 & 731) == 146 && var12_6.getSkipping()) {
            var12_6.skipToGroupEnd();
        } else {
            var12_6.startDefaults();
            if ((var4_4 & 1) != 0 && !var12_6.getDefaultsInvalid()) {
                var12_6.skipToGroupEnd();
                var11_11 = var1_1;
                var3_3 = var0;
                while (true) {
                    var1_1 = var11_11;
                    var0 = var3_3;
                    break;
                }
            } else {
                if (var9_7 != 0) {
                    var0 = Modifier.Companion;
                }
                if (var10_9 != 0) {
                    var1_1 = null;
                }
                var3_3 = var0;
                var11_11 = var1_1;
                if ((var5_5 & 4) == 0) ** continue;
                var2_2 = new ComposerState.ConversationEnded(false, null, null, 6, null);
            }
            var12_6.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-517544614, (int)var4_4, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationEndedCard (ConversationEndedCard.kt:24)");
            }
            var6_12 = Dp.constructor-impl((float)((float)false));
            CardKt.Card-F-jzlyU((Modifier)SizeKt.fillMaxWidth$default((Modifier)var0, (float)0.0f, (int)1, null), (Shape)RectangleShapeKt.getRectangleShape(), (long)0L, (long)0L, null, (float)var6_12, (p)ComposableLambdaKt.composableLambda((Composer)var12_6, (int)871362045, (boolean)true, (Object)new p<Composer, Integer, k0>(var2_2, var1_1){
                final ComposerState.ConversationEnded $conversationEndedUiState;
                final a<k0> $onNewConversationClick;
                {
                    this.$conversationEndedUiState = conversationEnded;
                    this.$onNewConversationClick = a14;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier="androidx.compose.ui.UiComposable")
                public final void invoke(@Nullable Composer composer, int n10) {
                    if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart((int)871362045, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationEndedCard.<anonymous> (ConversationEndedCard.kt:35)");
                        }
                        Object object = Modifier.Companion;
                        Modifier modifier = PaddingKt.padding-3ABfNKs((Modifier)object, (float)Dp.constructor-impl((float)20));
                        Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.getCenter();
                        Object object2 = Alignment.Companion.getCenterHorizontally();
                        ComposerState.ConversationEnded conversationEnded = this.$conversationEndedUiState;
                        ConversationEndedCard.1.1 var4_8 = this.$onNewConversationClick;
                        composer.startReplaceableGroup(-483455358);
                        horizontalOrVertical = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)horizontalOrVertical, (Alignment.Horizontal)object2, (Composer)composer, (int)54);
                        composer.startReplaceableGroup(-1323940314);
                        n10 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                        object2 = composer.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        a a14 = companion.getConstructor();
                        modifier = LayoutKt.modifierMaterializerOf((Modifier)modifier);
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
                        Updater.set-impl((Composer)a14, (Object)horizontalOrVertical, (p)companion.getSetMeasurePolicy());
                        Updater.set-impl((Composer)a14, (Object)object2, (p)companion.getSetResolvedCompositionLocals());
                        object2 = companion.getSetCompositeKeyHash();
                        if (a14.getInserting() || !y.e(a14.rememberedValue(), n10)) {
                            a14.updateRememberedValue((Object)n10);
                            a14.apply((Object)n10, (p)object2);
                        }
                        modifier.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                        composer.startReplaceableGroup(2058660585);
                        object2 = ColumnScopeInstance.INSTANCE;
                        TextKt.Text--4IGK_g((String)StringResources_androidKt.stringResource((int)R.string.intercom_conversation_has_ended, (Composer)composer, (int)0), null, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)0, (boolean)false, (int)0, (int)0, null, (TextStyle)MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBody1(), (Composer)composer, (int)0, (int)0, (int)65534);
                        composer.startReplaceableGroup(1756960073);
                        if (conversationEnded.getAllowStartingNewConversation()) {
                            SpacerKt.Spacer((Modifier)SizeKt.height-3ABfNKs((Modifier)object, (float)Dp.constructor-impl((float)12)), (Composer)composer, (int)6);
                            horizontalOrVertical = TestTagKt.testTag((Modifier)object, (String)"start-new-conversation-button");
                            object2 = conversationEnded.getCtaTitle();
                            composer.startReplaceableGroup(1074681973);
                            object = object2;
                            if (object2 == null) {
                                object = StringResources_androidKt.stringResource((int)R.string.intercom_send_us_a_message, (Composer)composer, (int)0);
                            }
                            composer.endReplaceableGroup();
                            if (var4_8 == null) {
                                var4_8 = ConversationEndedCard.1.1.INSTANCE;
                            }
                            n10 = (object2 = conversationEnded.getTrailingIcon()) != null ? (Integer)object2 : R.drawable.intercom_send_message_icon;
                            IntercomPrimaryButtonKt.IntercomPrimaryButton((String)object, (Modifier)horizontalOrVertical, n10, var4_8, composer, 48, 0);
                        }
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), (Composer)var12_6, (int)1769520, (int)28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        var3_3 = var12_6.endRestartGroup();
        if (var3_3 != null) {
            var3_3.updateScope((p)new p<Composer, Integer, k0>(var0, var1_1, var2_2, var4_4, var5_5){
                final int $$changed;
                final int $$default;
                final ComposerState.ConversationEnded $conversationEndedUiState;
                final Modifier $modifier;
                final a<k0> $onNewConversationClick;
                {
                    this.$modifier = modifier;
                    this.$onNewConversationClick = a14;
                    this.$conversationEndedUiState = conversationEnded;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    ConversationEndedCardKt.ConversationEndedCard(this.$modifier, this.$onNewConversationClick, this.$conversationEndedUiState, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void NewConversationCardPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(-952406382);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-952406382, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.NewConversationCardPreview (ConversationEndedCard.kt:61)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationEndedCardKt.access$NewConversationCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void NewConversationCardWithButtonBotPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1357889965);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1357889965, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.NewConversationCardWithButtonBotPreview (ConversationEndedCard.kt:88)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationEndedCardKt.access$NewConversationCardWithButtonBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void NewConversationCardWithButtonPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(51476506);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)51476506, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.NewConversationCardWithButtonPreview (ConversationEndedCard.kt:73)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationEndedCardKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationEndedCardKt.access$NewConversationCardWithButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$NewConversationCardPreview(Composer composer, int n10) {
        ConversationEndedCardKt.NewConversationCardPreview(composer, n10);
    }

    public static final /* synthetic */ void access$NewConversationCardWithButtonBotPreview(Composer composer, int n10) {
        ConversationEndedCardKt.NewConversationCardWithButtonBotPreview(composer, n10);
    }

    public static final /* synthetic */ void access$NewConversationCardWithButtonPreview(Composer composer, int n10) {
        ConversationEndedCardKt.NewConversationCardWithButtonPreview(composer, n10);
    }
}

