/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.dj;
import io.appmetrica.analytics.impl.gj;
import io.appmetrica.analytics.impl.hj;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class ij
extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;
    public static volatile ij[] q;
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public dj e;
    public long f;
    public boolean g;
    public int h;
    public int i;
    public hj j;
    public gj k;

    public ij() {
        this.a();
    }

    public static ij a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new ij(), byArray);
    }

    public static ij b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new ij().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ij[] b() {
        if (q != null) return q;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (q != null) return q;
                q = new ij[0];
                return q;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final ij a() {
        this.a = 1;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.b = byArray;
        this.c = byArray;
        this.d = byArray;
        this.e = null;
        this.f = 0L;
        this.g = false;
        this.h = 0;
        this.i = 1;
        this.j = null;
        this.k = null;
        this.cachedSize = -1;
        return this;
    }

    public final ij a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block14: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block14;
                    return this;
                }
                case 98: {
                    if (this.k == null) {
                        this.k = new gj();
                    }
                    codedInputByteBufferNano.readMessage(this.k);
                    continue block14;
                }
                case 90: {
                    if (this.j == null) {
                        this.j = new hj();
                    }
                    codedInputByteBufferNano.readMessage(this.j);
                    continue block14;
                }
                case 80: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 1 && n10 != 2) continue block14;
                    this.i = n10;
                    continue block14;
                }
                case 72: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1 && n10 != 2) continue block14;
                    this.h = n10;
                    continue block14;
                }
                case 64: {
                    this.g = codedInputByteBufferNano.readBool();
                    continue block14;
                }
                case 56: {
                    this.f = codedInputByteBufferNano.readInt64();
                    continue block14;
                }
                case 50: {
                    if (this.e == null) {
                        this.e = new dj();
                    }
                    codedInputByteBufferNano.readMessage(this.e);
                    continue block14;
                }
                case 42: {
                    this.d = codedInputByteBufferNano.readBytes();
                    continue block14;
                }
                case 34: {
                    this.c = codedInputByteBufferNano.readBytes();
                    continue block14;
                }
                case 26: {
                    this.b = codedInputByteBufferNano.readBytes();
                    continue block14;
                }
                case 8: {
                    this.a = codedInputByteBufferNano.readUInt32();
                    continue block14;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 1) {
            n14 = n10 + CodedOutputByteBufferNano.computeUInt32Size(1, n13);
        }
        n14 = CodedOutputByteBufferNano.computeBytesSize(3, this.b) + n14;
        Object object = this.c;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        n10 = n14;
        if (!Arrays.equals(object, byArray)) {
            n10 = n14 + CodedOutputByteBufferNano.computeBytesSize(4, this.c);
        }
        n14 = n10;
        if (!Arrays.equals(this.d, byArray)) {
            n14 = n10 + CodedOutputByteBufferNano.computeBytesSize(5, this.d);
        }
        object = this.e;
        n10 = n14;
        if (object != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano)object);
        }
        long l10 = this.f;
        n14 = n10;
        if (l10 != 0L) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt64Size(7, l10);
        }
        boolean bl2 = this.g;
        n10 = n14;
        if (bl2) {
            n10 = n14 + CodedOutputByteBufferNano.computeBoolSize(8, bl2);
        }
        n13 = this.h;
        n14 = n10;
        if (n13 != 0) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(9, n13);
        }
        n13 = this.i;
        n10 = n14;
        if (n13 != 1) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(10, n13);
        }
        object = this.j;
        n14 = n10;
        if (object != null) {
            n14 = n10 + CodedOutputByteBufferNano.computeMessageSize(11, (MessageNano)object);
        }
        object = this.k;
        n10 = n14;
        if (object != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(12, (MessageNano)object);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        long l10;
        int n10 = this.a;
        if (n10 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, n10);
        }
        codedOutputByteBufferNano.writeBytes(3, this.b);
        Object object = this.c;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(object, byArray)) {
            codedOutputByteBufferNano.writeBytes(4, this.c);
        }
        if (!Arrays.equals(this.d, byArray)) {
            codedOutputByteBufferNano.writeBytes(5, this.d);
        }
        if ((object = (Object)this.e) != null) {
            codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
        }
        if ((l10 = this.f) != 0L) {
            codedOutputByteBufferNano.writeInt64(7, l10);
        }
        if (bl2 = this.g) {
            codedOutputByteBufferNano.writeBool(8, bl2);
        }
        if ((n10 = this.h) != 0) {
            codedOutputByteBufferNano.writeInt32(9, n10);
        }
        if ((n10 = this.i) != 1) {
            codedOutputByteBufferNano.writeInt32(10, n10);
        }
        if ((object = (Object)this.j) != null) {
            codedOutputByteBufferNano.writeMessage(11, (MessageNano)object);
        }
        if ((object = (Object)this.k) != null) {
            codedOutputByteBufferNano.writeMessage(12, (MessageNano)object);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

