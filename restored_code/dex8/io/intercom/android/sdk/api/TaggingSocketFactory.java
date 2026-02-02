/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 */
package io.intercom.android.sdk.api;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.SocketFactory;

public class TaggingSocketFactory
extends SocketFactory {
    private final SocketFactory defaultFactory;
    private final int threadStatsTag;

    public TaggingSocketFactory(SocketFactory socketFactory, int n10) {
        this.defaultFactory = socketFactory;
        this.threadStatsTag = n10;
    }

    private Socket withTag(Socket socket) throws IOException {
        TrafficStats.setThreadStatsTag((int)this.threadStatsTag);
        return socket;
    }

    @Override
    public Socket createSocket() throws IOException {
        return this.withTag(this.defaultFactory.createSocket());
    }

    @Override
    public Socket createSocket(String string2, int n10) throws IOException, UnknownHostException {
        return this.withTag(this.defaultFactory.createSocket(string2, n10));
    }

    @Override
    public Socket createSocket(String string2, int n10, InetAddress inetAddress, int n13) throws IOException, UnknownHostException {
        return this.withTag(this.defaultFactory.createSocket(string2, n10, inetAddress, n13));
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n10) throws IOException {
        return this.withTag(this.defaultFactory.createSocket(inetAddress, n10));
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n10, InetAddress inetAddress2, int n13) throws IOException {
        return this.withTag(this.defaultFactory.createSocket(inetAddress, n10, inetAddress2, n13));
    }
}

