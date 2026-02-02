/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.intercom.twig.Twig
 *  okhttp3.z
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.intercom.android.nexus;

import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.nexus.NexusTopicProvider;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.h0;
import okhttp3.i0;
import okhttp3.z;
import okio.h;
import org.json.JSONException;
import org.json.JSONObject;

class NexusSocket {
    private static final h0 CLOSED_SOCKET = new h0(){

        public void cancel() {
        }

        @Override
        public boolean close(int n10, String string2) {
            return false;
        }

        public long queueSize() {
            return 0L;
        }

        public b0 request() {
            throw new NullPointerException("ClosedSocket has no request");
        }

        @Override
        public boolean send(String string2) {
            return false;
        }

        public boolean send(h h14) {
            return false;
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.1.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;
    private final z client;
    private final long connectionTimeoutSeconds;
    private long lastReconnectAt = 0L;
    private final NexusListener listener;
    private int reconnectAttempts = 0;
    @Nullable
    private ScheduledFuture reconnectFuture;
    private final boolean shouldSendPing;
    private h0 socket = CLOSED_SOCKET;
    private final ScheduledExecutorService timeoutExecutor;
    @Nullable
    private ScheduledFuture timeoutFuture;
    private final Runnable timeoutRunnable = new Runnable(this){
        final NexusSocket this$0;
        {
            this.this$0 = nexusSocket;
        }

        @Override
        public void run() {
            this.this$0.timedOut();
        }
    };
    private final NexusTopicProvider topicProvider;
    private final Twig twig;
    private final String url;
    private final i0 webSocketListener = new i0(this){
        final NexusSocket this$0;
        {
            this.this$0 = nexusSocket;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void parseJsonString(String string2) {
            JSONException jSONException2;
            block4: {
                Object object;
                Object object2;
                if (string2.isEmpty()) return;
                if (string2.equals(" ")) return;
                if (string2.endsWith("|")) {
                    return;
                }
                try {
                    object2 = new JSONObject(string2);
                    object = object2.optString("eventName");
                    if (!((String)object).isEmpty() && !((String)object).equals("ACK")) {
                        Object object3 = this.this$0.twig;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("onMessage TEXT: ");
                        ((StringBuilder)object).append(string2);
                        object3.internal(((StringBuilder)object).toString());
                        object = this.this$0.listener;
                        object3 = new NexusEvent((JSONObject)object2);
                        object.notifyEvent((NexusEvent)object3);
                        return;
                    }
                }
                catch (JSONException jSONException2) {
                    break block4;
                }
                object = this.this$0.twig;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("onMessage ACK: ");
                ((StringBuilder)object2).append(string2);
                object.internal(((StringBuilder)object2).toString());
                return;
            }
            Twig twig = this.this$0.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onMessage: json parse exception for message: '");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append((Object)jSONException2);
            twig.internal(stringBuilder.toString());
        }

        @Override
        public void onClosed(h0 h03, int n10, String string2) {
            if (n10 != 4000) {
                this.this$0.scheduleReconnect();
            } else {
                this.this$0.shutdown();
            }
            h03 = this.this$0.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onClose code: ");
            stringBuilder.append(n10);
            stringBuilder.append(" reason: ");
            stringBuilder.append(string2);
            h03.internal(stringBuilder.toString());
        }

        @Override
        public void onClosing(h0 h03, int n10, String string2) {
            Twig twig = this.this$0.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Server requested close:  ");
            stringBuilder.append(n10);
            stringBuilder.append(" - '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            twig.internal(stringBuilder.toString());
            h03.close(n10, string2);
        }

        @Override
        public void onFailure(h0 object, Throwable throwable, d0 d03) {
            if (NexusSocket.shouldReconnectFromFailure(d03)) {
                this.this$0.scheduleReconnect();
            } else {
                this.this$0.shutdown();
            }
            d03 = this.this$0.twig;
            object = new StringBuilder();
            ((StringBuilder)object).append("onFailure: ");
            ((StringBuilder)object).append(throwable.getMessage());
            d03.internal(((StringBuilder)object).toString());
            this.this$0.listener.onConnectFailed();
        }

        @Override
        public void onMessage(h0 h03, String string2) {
            this.this$0.resetTimeout();
            this.parseJsonString(string2);
        }

        @Override
        public void onMessage(h0 object, h h14) {
            Twig twig = this.this$0.twig;
            object = new StringBuilder();
            ((StringBuilder)object).append("Received bytes message ");
            ((StringBuilder)object).append(h14);
            ((StringBuilder)object).append(", resetting timeout");
            twig.internal(((StringBuilder)object).toString());
            this.this$0.resetTimeout();
        }

        @Override
        public void onOpen(h0 object, d0 d03) {
            Twig twig = this.this$0.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onOpen: ");
            stringBuilder.append(d03.C());
            twig.internal(stringBuilder.toString());
            NexusSocket.access$302(this.this$0, (h0)object);
            this.this$0.resetTimeout();
            object = this.this$0.topicProvider.getTopics();
            if (!object.isEmpty()) {
                this.this$0.fire(NexusEvent.getSubscribeEvent((List<String>)object).toStringEncodedJsonObject());
            }
            if (this.this$0.shouldSendPing) {
                this.this$0.fire(NexusEvent.getPingEvent().toStringEncodedJsonObject());
            }
            this.this$0.listener.onConnect();
        }
    };

    NexusSocket(String string2, int n10, boolean bl2, Twig twig, ScheduledExecutorService scheduledExecutorService, z z13, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = string2;
        this.connectionTimeoutSeconds = n10;
        this.shouldSendPing = bl2;
        this.twig = twig;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.client = z13;
        this.timeoutExecutor = scheduledExecutorService;
    }

    static /* synthetic */ ScheduledFuture access$102(NexusSocket nexusSocket, ScheduledFuture scheduledFuture) {
        nexusSocket.reconnectFuture = scheduledFuture;
        return scheduledFuture;
    }

    static /* synthetic */ h0 access$302(NexusSocket nexusSocket, h0 h03) {
        nexusSocket.socket = h03;
        return h03;
    }

    static long calculateReconnectTimerInSeconds(int n10) {
        n10 = (int)Math.min(Math.pow(2.0, n10), 900.0);
        return n10 + new Random().nextInt(n10 + 1);
    }

    private void disconnect(int n10, String string2) {
        if (!this.socket.close(n10, string2)) {
            this.twig.internal("Could not close socket while disconnecting, it may be already closed");
        }
    }

    private void modifyReconnectAttempts() {
        if (System.currentTimeMillis() - this.lastReconnectAt > TimeUnit.SECONDS.toMillis(900L) * 2L) {
            this.twig.d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            this.twig.d("incrementing reconnection attempts", new Object[0]);
            ++this.reconnectAttempts;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    private void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    private void scheduleReconnect() {
        if (this.reconnectFuture != null) {
            return;
        }
        this.modifyReconnectAttempts();
        long l10 = NexusSocket.calculateReconnectTimerInSeconds(this.reconnectAttempts);
        Twig twig = this.twig;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scheduling reconnect in: ");
        stringBuilder.append(l10);
        stringBuilder.append(" for attempt: ");
        stringBuilder.append(this.reconnectAttempts);
        twig.internal(stringBuilder.toString());
        this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable(this){
            final NexusSocket this$0;
            {
                this.this$0 = nexusSocket;
            }

            @Override
            public void run() {
                this.this$0.connect();
                NexusSocket.access$102(this.this$0, null);
            }
        }, l10, TimeUnit.SECONDS);
    }

    static boolean shouldReconnectFromFailure(@Nullable d0 d03) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (d03 != null) {
            int n10 = d03.m();
            bl3 = n10 >= 500 && n10 <= 599 ? bl2 : false;
        }
        return bl3;
    }

    private void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    private void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            this.scheduleReconnect();
        } else {
            this.disconnect(4001, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    void connect() {
        this.twig.d("connecting to a socket...", new Object[0]);
        Object object = new b0.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.url);
        stringBuilder.append(HEADER);
        object = ((b0.a)object).k(stringBuilder.toString()).b();
        this.client.z((b0)object, this.webSocketListener);
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    void disconnect() {
        this.disconnect(4000, "Disconnect called by client");
    }

    void fire(String string2) {
        if (string2.isEmpty()) {
            return;
        }
        try {
            Twig twig = this.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("firing: ");
            stringBuilder.append(string2);
            twig.internal(stringBuilder.toString());
            this.socket.send(string2);
        }
        catch (IllegalStateException illegalStateException) {
            Twig twig = this.twig;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error when firing '");
            stringBuilder.append(string2);
            stringBuilder.append("': ");
            stringBuilder.append(illegalStateException);
            twig.internal(stringBuilder.toString());
        }
    }

    boolean isConnected() {
        boolean bl2 = this.socket != CLOSED_SOCKET;
        return bl2;
    }
}

