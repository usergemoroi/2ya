/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  androidx.compose.foundation.CanvasKt
 *  androidx.compose.foundation.ClickableKt
 *  androidx.compose.foundation.layout.Arrangement
 *  androidx.compose.foundation.layout.Arrangement$Horizontal
 *  androidx.compose.foundation.layout.Arrangement$Vertical
 *  androidx.compose.foundation.layout.BoxKt
 *  androidx.compose.foundation.layout.BoxScopeInstance
 *  androidx.compose.foundation.layout.ColumnKt
 *  androidx.compose.foundation.layout.ColumnScopeInstance
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.PaddingValues
 *  androidx.compose.foundation.layout.RowKt
 *  androidx.compose.foundation.layout.RowScope
 *  androidx.compose.foundation.layout.RowScopeInstance
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.foundation.layout.SpacerKt
 *  androidx.compose.foundation.layout.e
 *  androidx.compose.material.SurfaceKt
 *  androidx.compose.material.TextKt
 *  androidx.compose.runtime.Applier
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.ComposablesKt
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.CompositionLocal
 *  androidx.compose.runtime.CompositionLocalMap
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.SkippableUpdater
 *  androidx.compose.runtime.Updater
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Alignment
 *  androidx.compose.ui.Alignment$Companion
 *  androidx.compose.ui.Alignment$Horizontal
 *  androidx.compose.ui.Alignment$Vertical
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.Modifier$Companion
 *  androidx.compose.ui.layout.LayoutKt
 *  androidx.compose.ui.node.ComposeUiNode
 *  androidx.compose.ui.node.ComposeUiNode$Companion
 *  androidx.compose.ui.platform.AndroidCompositionLocals_androidKt
 *  androidx.compose.ui.text.TextStyle
 *  androidx.compose.ui.text.font.FontWeight
 *  androidx.compose.ui.text.style.TextOverflow
 *  androidx.compose.ui.unit.Dp
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarTriangleGroupKt;
import io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketHeaderType;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001a\u001a\u000f\u0010\u001d\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001a\u001a\u000f\u0010\u001e\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001a\u001a\u000f\u0010\u001f\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u001f\u0010\u001a\u001a\u000f\u0010 \u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b \u0010\u001a\u001a\u001b\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0004\b%\u0010$\u00a8\u0006&"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "Lio/intercom/android/sdk/models/Conversation;", "conversation", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "showUnreadIndicator", "Lio/intercom/android/sdk/m5/components/TicketHeaderType;", "ticketHeaderType", "Lkotlin/Function0;", "Lkotlin/k0;", "onClick", "ConversationItem", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/models/Conversation;Landroidx/compose/foundation/layout/PaddingValues;ZLio/intercom/android/sdk/m5/components/TicketHeaderType;Lkotlin/jvm/functions/a;Landroidx/compose/runtime/Composer;II)V", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getActiveAdminsAvatars", "()Ljava/util/List;", "", "getWorkspaceName", "()Ljava/lang/String;", "getUserIntercomId", "UnreadIndicator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConversationCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "ReadConversationWithTicketChipPreview", "UnreadConversationWithTicketChipPreview", "ReadConversationWithSimpleTicketHeaderPreview", "UnreadConversationWithSimpleTicketHeaderPreview", "UnreadConversationCardPreview", "UnreadConversationCardWithBotPreview", "Lio/intercom/android/sdk/models/Ticket;", "ticket", "sampleConversation", "(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/models/Conversation;", "sampleConversationWithBot", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nConversationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationItem.kt\nio/intercom/android/sdk/m5/components/ConversationItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,335:1\n154#2:336\n154#2:349\n154#2:384\n74#3:337\n36#4:338\n456#4,8:366\n464#4,3:380\n467#4,3:385\n1116#5,6:339\n1549#6:345\n1620#6,3:346\n69#7,5:350\n74#7:383\n78#7:389\n79#8,11:355\n92#8:388\n3737#9,6:374\n*S KotlinDebug\n*F\n+ 1 ConversationItem.kt\nio/intercom/android/sdk/m5/components/ConversationItemKt\n*L\n47#1:336\n152#1:349\n156#1:384\n52#1:337\n53#1:338\n151#1:366,8\n151#1:380,3\n151#1:385,3\n53#1:339,6\n138#1:345\n138#1:346,3\n151#1:350,5\n151#1:383\n151#1:389\n151#1:355,11\n151#1:388\n151#1:374,6\n*E\n"})
public final class ConversationItemKt {
    @IntercomPreviews
    @SuppressLint(value={"VisibleForTests"})
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ConversationCardPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(825009083);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)825009083, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationCardPreview (ConversationItem.kt:169)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.ConversationCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ConversationItem(@Nullable Modifier modifier, @NotNull Conversation conversation, @Nullable PaddingValues paddingValues, boolean bl2, @NotNull TicketHeaderType ticketHeaderType, @NotNull a<k0> a14, @Nullable Composer object, int n10, int n13) {
        Modifier.Companion companion;
        Context context;
        int n14;
        Composer composer;
        block11: {
            block10: {
                y.j(conversation, "conversation");
                y.j((Object)ticketHeaderType, "ticketHeaderType");
                y.j(a14, "onClick");
                composer = object.startRestartGroup(-781487474);
                if ((n13 & 1) != 0) {
                    modifier = Modifier.Companion;
                }
                if ((n13 & 4) != 0) {
                    paddingValues = PaddingKt.PaddingValues-0680j_4((float)Dp.constructor-impl((float)0.0f));
                }
                if ((n13 & 8) != 0) {
                    bl2 = conversation.isRead() ^ true;
                    n14 = n10 & 0xFFFFE3FF;
                } else {
                    n14 = n10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart((int)-781487474, (int)n14, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationItem (ConversationItem.kt:43)");
                }
                context = (Context)composer.consume((CompositionLocal)AndroidCompositionLocals_androidKt.getLocalContext());
                companion = Modifier.Companion;
                composer.startReplaceableGroup(1157296644);
                boolean bl3 = composer.changed(a14);
                Object object2 = composer.rememberedValue();
                if (bl3) break block10;
                object = object2;
                if (object2 != Composer.Companion.getEmpty()) break block11;
            }
            object = new a<k0>(a14){
                final a<k0> $onClick;
                {
                    this.$onClick = a14;
                    super(0);
                }

                public final void invoke() {
                    this.$onClick.invoke();
                }
            };
            composer.updateRememberedValue(object);
        }
        composer.endReplaceableGroup();
        SurfaceKt.Surface-F-jzlyU((Modifier)ClickableKt.clickable-XHw0xAI$default((Modifier)companion, (boolean)false, null, null, (a)((a)object), (int)7, null), null, (long)0L, (long)0L, null, (float)0.0f, (p)ComposableLambdaKt.composableLambda((Composer)composer, (int)290047946, (boolean)true, (Object)new p<Composer, Integer, k0>(modifier, paddingValues, conversation, bl2, ticketHeaderType, n14, context){
            final int $$dirty;
            final PaddingValues $contentPadding;
            final Context $context;
            final Conversation $conversation;
            final Modifier $modifier;
            final boolean $showUnreadIndicator;
            final TicketHeaderType $ticketHeaderType;
            {
                this.$modifier = modifier;
                this.$contentPadding = paddingValues;
                this.$conversation = conversation;
                this.$showUnreadIndicator = bl2;
                this.$ticketHeaderType = ticketHeaderType;
                this.$$dirty = n10;
                this.$context = context;
                super(2);
            }

            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n10) {
                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)290047946, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationItem.<anonymous> (ConversationItem.kt:52)");
                    }
                    Modifier modifier = PaddingKt.padding((Modifier)this.$modifier, (PaddingValues)this.$contentPadding);
                    Alignment.Companion companion = Alignment.Companion;
                    Object object = companion.getCenterVertically();
                    Conversation conversation = this.$conversation;
                    boolean bl2 = this.$showUnreadIndicator;
                    Object object2 = this.$ticketHeaderType;
                    n10 = this.$$dirty;
                    Context context = this.$context;
                    composer.startReplaceableGroup(693286680);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    object = RowKt.rowMeasurePolicy((Arrangement.Horizontal)arrangement.getStart(), (Alignment.Vertical)object, (Composer)composer, (int)48);
                    composer.startReplaceableGroup(-1323940314);
                    int n13 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                    Object object3 = composer.getCurrentCompositionLocalMap();
                    Object object4 = ComposeUiNode.Companion;
                    Object object5 = object4.getConstructor();
                    modifier = LayoutKt.modifierMaterializerOf((Modifier)modifier);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode((a)object5);
                    } else {
                        composer.useNode();
                    }
                    object5 = Updater.constructor-impl((Composer)composer);
                    Updater.set-impl((Composer)object5, (Object)object, (p)object4.getSetMeasurePolicy());
                    Updater.set-impl((Composer)object5, (Object)object3, (p)object4.getSetResolvedCompositionLocals());
                    object = object4.getSetCompositeKeyHash();
                    if (object5.getInserting() || !y.e(object5.rememberedValue(), n13)) {
                        object5.updateRememberedValue((Object)n13);
                        object5.apply((Object)n13, (p)object);
                    }
                    modifier.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                    composer.startReplaceableGroup(2058660585);
                    object3 = RowScopeInstance.INSTANCE;
                    if (LastParticipatingAdmin.isNull(conversation.getLastParticipatingAdmin())) {
                        object = ConversationItemKt.access$getActiveAdminsAvatars();
                    } else {
                        object = conversation.getLastParticipatingAdmin().getAvatar();
                        y.i(object, "conversation.lastParticipatingAdmin.avatar");
                        object = t.e((Object)new AvatarWrapper((Avatar)object, conversation.getLastParticipatingAdmin().isBot(), null, false, false, 28, null));
                    }
                    modifier = Modifier.Companion;
                    AvatarTriangleGroupKt.AvatarTriangleGroup--jt2gSs((List<AvatarWrapper>)object, object3.align(modifier, companion.getCenterVertically()), null, Dp.constructor-impl((float)32), composer, 3080, 4);
                    SpacerKt.Spacer((Modifier)SizeKt.width-3ABfNKs((Modifier)modifier, (float)Dp.constructor-impl((float)12)), (Composer)composer, (int)6);
                    object3 = e.a((RowScope)object3, (Modifier)modifier, (float)2.0f, (boolean)false, (int)2, null);
                    composer.startReplaceableGroup(-483455358);
                    object5 = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)arrangement.getTop(), (Alignment.Horizontal)companion.getStart(), (Composer)composer, (int)0);
                    composer.startReplaceableGroup(-1323940314);
                    n13 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                    object = composer.getCurrentCompositionLocalMap();
                    Object object6 = object4.getConstructor();
                    object3 = LayoutKt.modifierMaterializerOf((Modifier)object3);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(object6);
                    } else {
                        composer.useNode();
                    }
                    object6 = Updater.constructor-impl((Composer)composer);
                    Updater.set-impl((Composer)object6, (Object)object5, (p)object4.getSetMeasurePolicy());
                    Updater.set-impl((Composer)object6, (Object)object, (p)object4.getSetResolvedCompositionLocals());
                    object = object4.getSetCompositeKeyHash();
                    if (object6.getInserting() || !y.e(object6.rememberedValue(), n13)) {
                        object6.updateRememberedValue((Object)n13);
                        object6.apply((Object)n13, (p)object);
                    }
                    object3.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                    composer.startReplaceableGroup(2058660585);
                    object = ColumnScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(2036807466);
                    object = conversation.getTicket();
                    object5 = Ticket.Companion;
                    if (!y.e(object, ((Ticket.Companion)object5).getNULL())) {
                        object3 = conversation.getTicket().getTitle();
                        object6 = conversation.getTicket().getCurrentStatus().getTitle();
                        long l10 = TicketDetailReducerKt.toTicketStatus(conversation.getTicket().getCurrentStatus()).getColor-0d7_KjU();
                        object = conversation.isRead() ? FontWeight.Companion.getNormal() : FontWeight.Companion.getSemiBold();
                        TicketHeaderKt.TicketHeader(null, (TicketHeaderType)((Object)object2), new TicketStatusHeaderArgs((String)object3, (String)object6, l10, (FontWeight)object, null), composer, n10 >> 9 & 0x70, 1);
                    }
                    composer.endReplaceableGroup();
                    object = conversation.getLastPart().getSummary();
                    n10 = object.length();
                    object3 = "";
                    if (n10 == 0) {
                        object = !y.e(conversation.getTicket(), ((Ticket.Companion)object5).getNULL()) ? conversation.getTicket().getCurrentStatus().getStatusDetail() : "";
                    }
                    composer.startReplaceableGroup(2036808386);
                    y.i(object, "lastPartSummary");
                    if (object.length() > 0) {
                        composer.startReplaceableGroup(2036808479);
                        object2 = object;
                        if (conversation.getLastPart().getParticipant().isUserWithId(ConversationItemKt.access$getUserIntercomId())) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append(((Context)composer.consume((CompositionLocal)AndroidCompositionLocals_androidKt.getLocalContext())).getString(R.string.intercom_you));
                            ((StringBuilder)object2).append(": ");
                            ((StringBuilder)object2).append((String)object);
                            object2 = ((StringBuilder)object2).toString();
                        }
                        composer.endReplaceableGroup();
                        n10 = TextOverflow.Companion.getEllipsis-gIe3tQ8();
                        object6 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04();
                        object = conversation.isRead() ? FontWeight.Companion.getNormal() : FontWeight.Companion.getSemiBold();
                        object6 = TextStyle.copy-p1EtxEg$default((TextStyle)object6, (long)0L, (long)0L, (FontWeight)object, null, null, null, null, (long)0L, null, null, null, (long)0L, null, null, null, (int)0, (int)0, (long)0L, null, null, null, (int)0, (int)0, null, (int)0xFFFFFB, null);
                        object = PaddingKt.padding-qDBjuR0$default((Modifier)modifier, (float)0.0f, (float)0.0f, (float)0.0f, (float)Dp.constructor-impl((float)4), (int)7, null);
                        y.i(object2, "if (conversation.lastPar\u2026                        }");
                        TextKt.Text--4IGK_g((String)object2, (Modifier)object, (long)0L, (long)0L, null, null, null, (long)0L, null, null, (long)0L, (int)n10, (boolean)false, (int)1, (int)0, null, (TextStyle)object6, (Composer)composer, (int)48, (int)3120, (int)55292);
                    }
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(693286680);
                    companion = RowKt.rowMeasurePolicy((Arrangement.Horizontal)arrangement.getStart(), (Alignment.Vertical)companion.getTop(), (Composer)composer, (int)0);
                    composer.startReplaceableGroup(-1323940314);
                    n10 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer, (int)0);
                    arrangement = composer.getCurrentCompositionLocalMap();
                    object2 = object4.getConstructor();
                    object = LayoutKt.modifierMaterializerOf((Modifier)modifier);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode((a)object2);
                    } else {
                        composer.useNode();
                    }
                    object2 = Updater.constructor-impl((Composer)composer);
                    Updater.set-impl((Composer)object2, (Object)companion, (p)object4.getSetMeasurePolicy());
                    Updater.set-impl((Composer)object2, (Object)arrangement, (p)object4.getSetResolvedCompositionLocals());
                    object4 = object4.getSetCompositeKeyHash();
                    if (object2.getInserting() || !y.e(object2.rememberedValue(), n10)) {
                        object2.updateRememberedValue((Object)n10);
                        object2.apply((Object)n10, (p)object4);
                    }
                    object.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer)), (Object)composer, (Object)0);
                    composer.startReplaceableGroup(2058660585);
                    object = conversation.getLastParticipatingAdmin().getFirstName();
                    y.i(object, "conversation.lastParticipatingAdmin.firstName");
                    if (object.length() == 0) {
                        object2 = ConversationItemKt.access$getWorkspaceName();
                    } else {
                        object = conversation.getLastParticipatingAdmin().getFirstName();
                        y.i(object, "conversation.lastParticipatingAdmin.firstName");
                        object2 = ((Object)GroupConversationTextFormatter.groupConversationSubtitle((String)object, conversation.getGroupConversationParticipants().size(), context)).toString();
                    }
                    object = object4 = TimeFormatterExtKt.formattedDateFromLong(conversation.getLastPart().getCreatedAt(), context);
                    if (object4.length() == 0) {
                        object = object3;
                        if (!y.e(conversation.getTicket(), ((Ticket.Companion)object5).getNULL())) {
                            object = TimeFormatterExtKt.formattedDateFromLong(conversation.getTicket().getCurrentStatus().getCreatedDate(), context);
                        }
                    }
                    object3 = IntercomTheme.INSTANCE;
                    n10 = IntercomTheme.$stable;
                    TextWithSeparatorKt.TextWithSeparator-wV1YYcM((String)object2, (String)object, null, null, ((IntercomTheme)object3).getTypography(composer, n10).getType04(), ((IntercomTheme)object3).getColors(composer, n10).getDescriptionText-0d7_KjU(), 0, 0, null, composer, 0, 460);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (bl2) {
                        composer.startReplaceableGroup(334096901);
                        ConversationItemKt.UnreadIndicator(null, composer, 0, 1);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(334096956);
                        IntercomChevronKt.IntercomChevron(PaddingKt.padding-qDBjuR0$default((Modifier)modifier, (float)Dp.constructor-impl((float)6), (float)0.0f, (float)0.0f, (float)0.0f, (int)14, null), composer, 6, 0);
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), (Composer)composer, (int)0x180000, (int)62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((object = composer.endRestartGroup()) != null) {
            object.updateScope((p)new p<Composer, Integer, k0>(modifier, conversation, paddingValues, bl2, ticketHeaderType, a14, n10, n13){
                final int $$changed;
                final int $$default;
                final PaddingValues $contentPadding;
                final Conversation $conversation;
                final Modifier $modifier;
                final a<k0> $onClick;
                final boolean $showUnreadIndicator;
                final TicketHeaderType $ticketHeaderType;
                {
                    this.$modifier = modifier;
                    this.$conversation = conversation;
                    this.$contentPadding = paddingValues;
                    this.$showUnreadIndicator = bl2;
                    this.$ticketHeaderType = ticketHeaderType;
                    this.$onClick = a14;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    ConversationItemKt.ConversationItem(this.$modifier, this.$conversation, this.$contentPadding, this.$showUnreadIndicator, this.$ticketHeaderType, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ReadConversationWithSimpleTicketHeaderPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(1446702226);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1446702226, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ReadConversationWithSimpleTicketHeaderPreview (ConversationItem.kt:224)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-4$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.ReadConversationWithSimpleTicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ReadConversationWithTicketChipPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(1616890239);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1616890239, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ReadConversationWithTicketChipPreview (ConversationItem.kt:184)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.ReadConversationWithTicketChipPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void UnreadConversationCardPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(-1292079862);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-1292079862, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.UnreadConversationCardPreview (ConversationItem.kt:264)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-6$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.UnreadConversationCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void UnreadConversationCardWithBotPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(-516742229);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-516742229, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.UnreadConversationCardWithBotPreview (ConversationItem.kt:279)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-7$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.UnreadConversationCardWithBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void UnreadConversationWithSimpleTicketHeaderPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(1866912491);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1866912491, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.UnreadConversationWithSimpleTicketHeaderPreview (ConversationItem.kt:244)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-5$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.UnreadConversationWithSimpleTicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void UnreadConversationWithTicketChipPreview(@Nullable Composer composer, int n10) {
        composer = composer.startRestartGroup(-815785768);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)-815785768, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.UnreadConversationWithTicketChipPreview (ConversationItem.kt:204)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.getLambda-3$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationItemKt.UnreadConversationWithTicketChipPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void UnreadIndicator(@Nullable Modifier modifier, @Nullable Composer composer, int n10, int n13) {
        int n14;
        Composer composer2 = composer.startRestartGroup(481161991);
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
                ComposerKt.traceEventStart((int)481161991, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.UnreadIndicator (ConversationItem.kt:149)");
            }
            composer = SizeKt.size-3ABfNKs((Modifier)modifier, (float)Dp.constructor-impl((float)16));
            Alignment alignment = Alignment.Companion.getCenterEnd();
            composer2.startReplaceableGroup(733328855);
            alignment = BoxKt.rememberBoxMeasurePolicy((Alignment)alignment, (boolean)false, (Composer)composer2, (int)6);
            composer2.startReplaceableGroup(-1323940314);
            n14 = ComposablesKt.getCurrentCompositeKeyHash((Composer)composer2, (int)0);
            CompositionLocalMap compositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a a14 = companion.getConstructor();
            composer = LayoutKt.modifierMaterializerOf((Modifier)composer);
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
            Updater.set-impl((Composer)a14, (Object)alignment, (p)companion.getSetMeasurePolicy());
            Updater.set-impl((Composer)a14, (Object)compositionLocalMap, (p)companion.getSetResolvedCompositionLocals());
            alignment = companion.getSetCompositeKeyHash();
            if (a14.getInserting() || !y.e(a14.rememberedValue(), n14)) {
                a14.updateRememberedValue((Object)n14);
                a14.apply((Object)n14, (p)alignment);
            }
            composer.invoke((Object)SkippableUpdater.box-impl((Composer)SkippableUpdater.constructor-impl((Composer)composer2)), (Object)composer2, (Object)0);
            composer2.startReplaceableGroup(2058660585);
            composer = BoxScopeInstance.INSTANCE;
            CanvasKt.Canvas((Modifier)SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, (float)Dp.constructor-impl((float)8)), (l)UnreadIndicator.1.1.INSTANCE, (Composer)composer2, (int)54);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
                    ConversationItemKt.UnreadIndicator(this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    public static final /* synthetic */ List access$getActiveAdminsAvatars() {
        return ConversationItemKt.getActiveAdminsAvatars();
    }

    public static final /* synthetic */ String access$getUserIntercomId() {
        return ConversationItemKt.getUserIntercomId();
    }

    public static final /* synthetic */ String access$getWorkspaceName() {
        return ConversationItemKt.getWorkspaceName();
    }

    public static final /* synthetic */ Conversation access$sampleConversation(Ticket ticket) {
        return ConversationItemKt.sampleConversation(ticket);
    }

    private static final List<AvatarWrapper> getActiveAdminsAvatars() {
        Object object = t.X0((Iterable)((TeamPresence)Injector.get().getDataLayer().getTeamPresence().getValue()).getBuiltActiveAdmins(), (int)3);
        ArrayList<AvatarWrapper> arrayList = new ArrayList<AvatarWrapper>(t.x((Iterable)object, (int)10));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object2 = (Participant)iterator.next();
            object = ((Participant)object2).getAvatar();
            y.i(object, "it.avatar");
            object2 = ((Participant)object2).isBot();
            y.i(object2, "it.isBot");
            arrayList.add(new AvatarWrapper((Avatar)object, (Boolean)object2, null, false, false, 28, null));
        }
        return arrayList;
    }

    private static final String getUserIntercomId() {
        String string2;
        if (Injector.isNotInitialised()) {
            string2 = "";
        } else {
            string2 = Injector.get().getUserIdentity().getIntercomId();
            y.i(string2, "get().userIdentity.intercomId");
        }
        return string2;
    }

    private static final String getWorkspaceName() {
        return Injector.get().getAppConfigProvider().get().getName();
    }

    private static final Conversation sampleConversation(Ticket object) {
        Conversation.Builder builder = new Conversation.Builder().withId("123").withLastParticipatingAdmin(new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"))).withParts(t.e((Object)new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)));
        if (object != null) {
            builder.withTicket((Ticket)object);
        }
        object = builder.build();
        y.i(object, "builder.build()");
        return object;
    }

    static /* synthetic */ Conversation sampleConversation$default(Ticket ticket, int n10, Object object) {
        if ((n10 & 1) != 0) {
            ticket = null;
        }
        return ConversationItemKt.sampleConversation(ticket);
    }

    private static final Conversation sampleConversationWithBot(Ticket object) {
        Conversation.Builder builder = new Conversation.Builder().withId("123").withLastParticipatingAdmin(new LastParticipatingAdmin.Builder().withFirstName("Operator").withAvatar(new Avatar.Builder().withInitials("O")).withIsBot(Boolean.TRUE)).withParts(t.e((Object)new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)));
        if (object != null) {
            builder.withTicket((Ticket)object);
        }
        object = builder.build();
        y.i(object, "builder.build()");
        return object;
    }

    static /* synthetic */ Conversation sampleConversationWithBot$default(Ticket ticket, int n10, Object object) {
        if ((n10 & 1) != 0) {
            ticket = null;
        }
        return ConversationItemKt.sampleConversationWithBot(ticket);
    }
}

