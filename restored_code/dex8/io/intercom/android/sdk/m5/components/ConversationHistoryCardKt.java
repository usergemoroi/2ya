/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.foundation.layout.PaddingKt
 *  androidx.compose.foundation.layout.SizeKt
 *  androidx.compose.runtime.Composable
 *  androidx.compose.runtime.ComposableTarget
 *  androidx.compose.runtime.Composer
 *  androidx.compose.runtime.ComposerKt
 *  androidx.compose.runtime.RecomposeScopeImplKt
 *  androidx.compose.runtime.internal.ComposableLambdaKt
 *  androidx.compose.ui.Modifier
 *  androidx.compose.ui.unit.Dp
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.functions.p
 */
package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt;
import io.intercom.android.sdk.m5.components.ConversationHistoryCardKt;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.HomeCardScaffoldKt;
import io.intercom.android.sdk.m5.components.TicketHeaderType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0001\u00a2\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\nH\u0003\u00a2\u0006\u0004\b\u0010\u0010\u000f\u00a8\u0006\u0011"}, d2={"Landroidx/compose/ui/Modifier;", "modifier", "", "cardTitle", "", "Lio/intercom/android/sdk/models/Conversation;", "conversations", "Lio/intercom/android/sdk/m5/components/TicketHeaderType;", "ticketHeaderType", "Lkotlin/Function1;", "Lkotlin/k0;", "onConversationClick", "ConversationHistoryCard", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/m5/components/TicketHeaderType;Lkotlin/jvm/functions/l;Landroidx/compose/runtime/Composer;II)V", "RecentConversationsCardWithSimpleTicketHeaderPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecentConversationsCardPreview", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0})
public final class ConversationHistoryCardKt {
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ConversationHistoryCard(@Nullable Modifier modifier, @NotNull String string2, @NotNull List<? extends Conversation> list, @NotNull TicketHeaderType ticketHeaderType, @Nullable l<? super Conversation, k0> var4_4, @Nullable Composer composer, int n10, int n13) {
        y.j(string2, "cardTitle");
        y.j(list, "conversations");
        y.j((Object)ticketHeaderType, "ticketHeaderType");
        composer = composer.startRestartGroup(328749770);
        if ((n13 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((n13 & 0x10) != 0) {
            var4_4 = ConversationHistoryCard.1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart((int)328749770, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationHistoryCard (ConversationHistoryCard.kt:16)");
        }
        HomeCardScaffoldKt.HomeCardScaffold(modifier, string2, (p<? super Composer, ? super Integer, k0>)ComposableLambdaKt.composableLambda((Composer)composer, (int)-962216298, (boolean)true, (Object)new p<Composer, Integer, k0>(list, ticketHeaderType, n10, (l<? super Conversation, k0>)var4_4){
            final int $$dirty;
            final List<Conversation> $conversations;
            final l<Conversation, k0> $onConversationClick;
            final TicketHeaderType $ticketHeaderType;
            {
                this.$conversations = list;
                this.$ticketHeaderType = ticketHeaderType;
                this.$$dirty = n10;
                this.$onConversationClick = l10;
                super(2);
            }

            @Composable
            @ComposableTarget(applier="androidx.compose.ui.UiComposable")
            public final void invoke(@Nullable Composer composer, int n10) {
                if ((n10 & 0xB) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart((int)-962216298, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.ConversationHistoryCard.<anonymous> (ConversationHistoryCard.kt:26)");
                    }
                    Iterable iterable = this.$conversations;
                    TicketHeaderType ticketHeaderType = this.$ticketHeaderType;
                    n10 = this.$$dirty;
                    l<Conversation, k0> l10 = this.$onConversationClick;
                    for (Conversation conversation : iterable) {
                        iterable = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, (float)0.0f, (int)1, null);
                        float f11 = Dp.constructor-impl((float)8);
                        ConversationItemKt.ConversationItem((Modifier)iterable, conversation, PaddingKt.PaddingValues-YgX7TsA((float)Dp.constructor-impl((float)20), (float)f11), false, ticketHeaderType, new a<k0>(l10, conversation){
                            final Conversation $it;
                            final l<Conversation, k0> $onConversationClick;
                            {
                                this.$onConversationClick = l10;
                                this.$it = conversation;
                                super(0);
                            }

                            public final void invoke() {
                                this.$onConversationClick.invoke((Object)this.$it);
                            }
                        }, composer, n10 << 3 & 0xE000 | 0xC46, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }), composer, n10 & 0xE | 0x180 | n10 & 0x70, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if ((composer = composer.endRestartGroup()) != null) {
            composer.updateScope((p)new p<Composer, Integer, k0>(modifier, string2, list, ticketHeaderType, (l<? super Conversation, k0>)var4_4, n10, n13){
                final int $$changed;
                final int $$default;
                final String $cardTitle;
                final List<Conversation> $conversations;
                final Modifier $modifier;
                final l<Conversation, k0> $onConversationClick;
                final TicketHeaderType $ticketHeaderType;
                {
                    this.$modifier = modifier;
                    this.$cardTitle = string2;
                    this.$conversations = list;
                    this.$ticketHeaderType = ticketHeaderType;
                    this.$onConversationClick = l10;
                    this.$$changed = n10;
                    this.$$default = n13;
                    super(2);
                }

                public final void invoke(@Nullable Composer composer, int n10) {
                    ConversationHistoryCardKt.ConversationHistoryCard(this.$modifier, this.$cardTitle, this.$conversations, this.$ticketHeaderType, this.$onConversationClick, composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)), this.$$default);
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void RecentConversationsCardPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(593700998);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)593700998, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.RecentConversationsCardPreview (ConversationHistoryCard.kt:109)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.getLambda-2$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationHistoryCardKt.access$RecentConversationsCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    @IntercomPreviews
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final void RecentConversationsCardWithSimpleTicketHeaderPreview(Composer composer, int n10) {
        composer = composer.startRestartGroup(1823267221);
        if (n10 == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart((int)1823267221, (int)n10, (int)-1, (String)"io.intercom.android.sdk.m5.components.RecentConversationsCardWithSimpleTicketHeaderPreview (ConversationHistoryCard.kt:43)");
            }
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.getLambda-1$intercom_sdk_base_release(), composer, 3072, 7);
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
                    ConversationHistoryCardKt.access$RecentConversationsCardWithSimpleTicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags((int)(this.$$changed | 1)));
                }
            });
        }
    }

    public static final /* synthetic */ void access$RecentConversationsCardPreview(Composer composer, int n10) {
        ConversationHistoryCardKt.RecentConversationsCardPreview(composer, n10);
    }

    public static final /* synthetic */ void access$RecentConversationsCardWithSimpleTicketHeaderPreview(Composer composer, int n10) {
        ConversationHistoryCardKt.RecentConversationsCardWithSimpleTicketHeaderPreview(composer, n10);
    }
}

