/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class g82
extends tj {
    private final int e;
    private final byte[] f;
    private final DatagramPacket g;
    @Nullable
    private Uri h;
    @Nullable
    private DatagramSocket i;
    @Nullable
    private MulticastSocket j;
    @Nullable
    private InetAddress k;
    private boolean l;
    private int m;

    public g82(int n10) {
        super(true);
        this.e = 8000;
        byte[] byArray = new byte[2000];
        this.f = byArray;
        this.g = new DatagramPacket(byArray, 0, 2000);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv pv3) throws a {
        block4: {
            DatagramSocket datagramSocket;
            Object object;
            block3: {
                object = pv3.a;
                this.h = object;
                object = object.getHost();
                object.getClass();
                int n10 = this.h.getPort();
                this.b(pv3);
                try {
                    MulticastSocket multicastSocket;
                    this.k = InetAddress.getByName((String)object);
                    object = new InetSocketAddress(this.k, n10);
                    if (!this.k.isMulticastAddress()) break block3;
                    this.j = multicastSocket = new MulticastSocket((SocketAddress)object);
                    multicastSocket.joinGroup(this.k);
                    this.i = this.j;
                    break block4;
                }
                catch (IOException iOException) {
                    throw new a(iOException, 2001);
                }
                catch (SecurityException securityException) {
                    throw new a(securityException, 2006);
                }
            }
            this.i = datagramSocket = new DatagramSocket((SocketAddress)object);
        }
        this.i.setSoTimeout(this.e);
        this.l = true;
        this.c(pv3);
        return -1L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        Object object;
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                object = this.k;
                object.getClass();
                multicastSocket.leaveGroup((InetAddress)object);
            }
            catch (IOException iOException) {}
            this.j = null;
        }
        if ((object = this.i) != null) {
            ((DatagramSocket)object).close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            this.e();
        }
    }

    @Override
    @Nullable
    public final Uri getUri() {
        return this.h;
    }

    public final int read(byte[] byArray, int n10, int n12) throws a {
        int n13;
        block5: {
            if (n12 == 0) {
                return 0;
            }
            if (this.m == 0) {
                SocketTimeoutException socketTimeoutException2;
                block6: {
                    try {
                        DatagramSocket datagramSocket = this.i;
                        datagramSocket.getClass();
                        datagramSocket.receive(this.g);
                        this.m = n13 = this.g.getLength();
                        this.c(n13);
                        break block5;
                    }
                    catch (IOException iOException) {
                    }
                    catch (SocketTimeoutException socketTimeoutException2) {
                        break block6;
                    }
                    throw new a(iOException, 2001);
                }
                throw new a(socketTimeoutException2, 2002);
            }
        }
        n13 = this.g.getLength();
        int n14 = this.m;
        n12 = Math.min(n14, n12);
        System.arraycopy(this.f, n13 - n14, byArray, n10, n12);
        this.m -= n12;
        return n12;
    }

    public static final class a
    extends mv {
        public a(Exception exception, int n10) {
            super((Throwable)exception, n10);
        }
    }
}

