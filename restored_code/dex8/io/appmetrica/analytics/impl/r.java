/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.q;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class r
extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    public static final int s = 7;
    public static volatile r[] t;
    public static byte[] u;
    public static volatile boolean v;
    public byte[] a;
    public q b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public r() {
        block6: {
            if (!v) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                if (v) break block4;
                                u = InternalNano.bytesDefaultValue("manual");
                                v = true;
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        this.a();
    }

    public static r a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new r(), byArray);
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new r().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r[] b() {
        if (t != null) return t;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (t != null) return t;
                t = new r[0];
                return t;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final r a() {
        this.a = (byte[])u.clone();
        this.b = null;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.c = byArray;
        this.d = 0;
        this.e = byArray;
        this.f = byArray;
        this.g = byArray;
        this.h = byArray;
        this.i = byArray;
        this.j = byArray;
        this.k = byArray;
        this.cachedSize = -1;
        return this;
    }

    public final r a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block17: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block17;
                    return this;
                }
                case 90: {
                    this.k = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 82: {
                    this.j = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 74: {
                    this.i = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 66: {
                    this.h = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 58: {
                    this.g = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 50: {
                    this.f = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 42: {
                    this.e = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 32: {
                    n10 = codedInputByteBufferNano.readInt32();
                    switch (n10) {
                        default: {
                            continue block17;
                        }
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                    }
                    this.d = n10;
                    continue block17;
                }
                case 26: {
                    this.c = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 18: {
                    if (this.b == null) {
                        this.b = new q();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                    continue block17;
                }
                case 10: {
                    this.a = codedInputByteBufferNano.readBytes();
                    continue block17;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!Arrays.equals(this.a, u)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        Object object = this.b;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        object = this.c;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        n13 = n10;
        if (!Arrays.equals((byte[])object, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(3, this.c);
        }
        int n14 = this.d;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(4, n14);
        }
        n13 = n10;
        if (!Arrays.equals(this.e, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(5, this.e);
        }
        n10 = n13;
        if (!Arrays.equals(this.f, byArray)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(6, this.f);
        }
        n13 = n10;
        if (!Arrays.equals(this.g, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(7, this.g);
        }
        n10 = n13;
        if (!Arrays.equals(this.h, byArray)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(8, this.h);
        }
        n13 = n10;
        if (!Arrays.equals(this.i, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        n10 = n13;
        if (!Arrays.equals(this.j, byArray)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        n13 = n10;
        if (!Arrays.equals(this.k, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(11, this.k);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        byte[] byArray;
        Object object;
        if (!Arrays.equals(this.a, u)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if (!Arrays.equals(byArray = this.c, (byte[])(object = (Object)WireFormatNano.EMPTY_BYTES))) {
            codedOutputByteBufferNano.writeBytes(3, this.c);
        }
        if ((n10 = this.d) != 0) {
            codedOutputByteBufferNano.writeInt32(4, n10);
        }
        if (!Arrays.equals(this.e, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(5, this.e);
        }
        if (!Arrays.equals(this.f, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(6, this.f);
        }
        if (!Arrays.equals(this.g, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(7, this.g);
        }
        if (!Arrays.equals(this.h, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(8, this.h);
        }
        if (!Arrays.equals(this.i, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.j, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        if (!Arrays.equals(this.k, (byte[])object)) {
            codedOutputByteBufferNano.writeBytes(11, this.k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

