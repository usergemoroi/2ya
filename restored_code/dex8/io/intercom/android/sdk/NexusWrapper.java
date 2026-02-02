/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.intercom.twig.Twig
 *  kotlin.collections.t
 *  okhttp3.z
 */
package io.intercom.android.sdk;

import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.b;
import io.intercom.android.sdk.c;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import okhttp3.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B5\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010-\u001a\u00020,\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b.\u0010/J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010+\u00a8\u00061"}, d2={"Lio/intercom/android/sdk/NexusWrapper;", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/nexus/NexusListener;", "", "removeCallbacks", "()Ljava/lang/Boolean;", "Lio/intercom/android/nexus/NexusEvent;", "event", "Lkotlin/k0;", "logKnownEvent", "(Lio/intercom/android/nexus/NexusEvent;)V", "Lio/intercom/android/nexus/NexusConfig;", "config", "shouldSendPresence", "connect", "(Lio/intercom/android/nexus/NexusConfig;Z)V", "connectNow", "disconnect", "()V", "disconnectNow", "notifyEvent", "onConnect", "onConnectFailed", "onShutdown", "Lcom/intercom/twig/Twig;", "twig", "Lcom/intercom/twig/Twig;", "Lio/intercom/android/sdk/store/Store;", "Lio/intercom/android/sdk/state/State;", "store", "Lio/intercom/android/sdk/store/Store;", "Lio/intercom/android/sdk/api/Api;", "api", "Lio/intercom/android/sdk/api/Api;", "", "debouncePeriodMs", "J", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "actionFuture", "Ljava/util/concurrent/ScheduledFuture;", "Lokhttp3/z;", "okHttpClient", "<init>", "(Lcom/intercom/twig/Twig;Lokhttp3/z;Lio/intercom/android/sdk/store/Store;Lio/intercom/android/sdk/api/Api;J)V", "Companion", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class NexusWrapper
extends NexusClient
implements NexusListener {
    @NotNull
    private static final String CONVERSATION_ID = "conversationId";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private ScheduledFuture<?> actionFuture;
    @NotNull
    private final Api api;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor;
    @NotNull
    private final Store<State> store;
    @NotNull
    private final Twig twig;

    public NexusWrapper(@NotNull Twig twig, @NotNull z z13, @NotNull Store<State> store, @NotNull Api api, long l10) {
        y.j(twig, "twig");
        y.j(z13, "okHttpClient");
        y.j(store, "store");
        y.j(api, "api");
        super(twig, z13);
        this.twig = twig;
        this.store = store;
        this.api = api;
        this.debouncePeriodMs = l10;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    public static /* synthetic */ void a(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean bl2) {
        NexusWrapper.connect$lambda$0(nexusWrapper, nexusConfig, bl2);
    }

    public static /* synthetic */ void b(NexusWrapper nexusWrapper) {
        NexusWrapper.disconnect$lambda$1(nexusWrapper);
    }

    private static final void connect$lambda$0(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean bl2) {
        y.j(nexusWrapper, "this$0");
        y.j(nexusConfig, "$config");
        nexusWrapper.connectNow(nexusConfig, bl2);
    }

    private static final void disconnect$lambda$1(NexusWrapper nexusWrapper) {
        y.j(nexusWrapper, "this$0");
        nexusWrapper.disconnectNow();
    }

    private final void logKnownEvent(NexusEvent nexusEvent) {
        Twig twig = this.twig;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received ");
        stringBuilder.append((Object)nexusEvent.getEventType());
        stringBuilder.append(" event");
        twig.internal("Nexus", stringBuilder.toString());
    }

    private final Boolean removeCallbacks() {
        Comparable<Delayed> comparable = this.actionFuture;
        comparable = comparable != null ? Boolean.valueOf(comparable.cancel(false)) : null;
        return comparable;
    }

    @Override
    public void connect(@NotNull NexusConfig nexusConfig, boolean bl2) {
        y.j(nexusConfig, "config");
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.w("No realtime endpoints present so we can't connect", new Object[0]);
            return;
        }
        this.removeCallbacks();
        this.actionFuture = this.executor.schedule(new b(this, nexusConfig, bl2), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    public final void connectNow(@NotNull NexusConfig nexusConfig, boolean bl2) {
        y.j(nexusConfig, "config");
        if (this.isConnected()) {
            return;
        }
        super.connect(nexusConfig, bl2);
        this.setTopics(t.e((Object)"*"));
        this.addEventListener(this);
    }

    @Override
    public void disconnect() {
        this.removeCallbacks();
        this.actionFuture = this.executor.schedule(new c(this), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    @VisibleForTesting
    public final void disconnectNow() {
        this.removeEventListener(this);
        super.disconnect();
    }

    @Override
    public void notifyEvent(@NotNull NexusEvent object) {
        y.j(object, "event");
        CharSequence charSequence = ((NexusEvent)object).getEventData().optString(CONVERSATION_ID);
        Object object2 = ((NexusEvent)object).getEventType();
        int n10 = object2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[((Enum)object2).ordinal()];
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        if (n10 != 5) {
                            charSequence = this.twig;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Unexpected event: ");
                            ((StringBuilder)object2).append((Object)((NexusEvent)object).getEventType());
                            charSequence.internal("Nexus", ((StringBuilder)object2).toString());
                        } else {
                            this.logKnownEvent((NexusEvent)object);
                            long l10 = ((NexusEvent)object).getEventData().optLong("entity_type");
                            object = ((NexusEvent)object).getEventData().optString("entity_id");
                            if (l10 == 44L) {
                                this.api.fetchCarouselByEntityId((String)object);
                            } else if (l10 == 85L) {
                                this.api.fetchSurveyByEntityId((String)object);
                            } else {
                                object = this.twig;
                                charSequence = new StringBuilder();
                                ((StringBuilder)charSequence).append("Unexpected entity type: ");
                                ((StringBuilder)charSequence).append(l10);
                                object.internal("Nexus NewContent", ((StringBuilder)charSequence).toString());
                            }
                        }
                    } else {
                        this.logKnownEvent((NexusEvent)object);
                        this.store.dispatch(Actions.conversationMarkedAsRead((String)charSequence));
                    }
                } else {
                    this.logKnownEvent((NexusEvent)object);
                }
            } else {
                this.logKnownEvent((NexusEvent)object);
                this.store.dispatch(Actions.newCommentEventReceived((String)charSequence));
            }
        } else {
            this.logKnownEvent((NexusEvent)object);
        }
    }

    @Override
    public void onConnect() {
    }

    @Override
    public void onConnectFailed() {
    }

    @Override
    public void onShutdown() {
    }

    @Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2={"Lio/intercom/android/sdk/NexusWrapper$Companion;", "", "()V", "CONVERSATION_ID", "", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p p14) {
            this();
        }
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
            int[] nArray = new int[NexusEventType.values().length];
            try {
                nArray[NexusEventType.AdminIsTyping.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[NexusEventType.NewComment.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[NexusEventType.UserContentSeenByAdmin.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[NexusEventType.ConversationSeen.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[NexusEventType.NewContent.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

