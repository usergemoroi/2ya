/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.fj;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class ej
extends MessageNano {
    public static volatile ej[] e;
    public long a;
    public fj b;
    public int c;
    public byte[] d;

    public ej() {
        this.a();
    }

    public static ej a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new ej(), byArray);
    }

    public static ej b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new ej().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ej[] b() {
        if (e != null) return e;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (e != null) return e;
                e = new ej[0];
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final ej a() {
        this.a = 0L;
        this.b = null;
        this.c = 0;
        this.d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    public final ej a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (n10 != 24) {
                        if (n10 != 34) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        this.d = codedInputByteBufferNano.readBytes();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readUInt32();
                    continue;
                }
                if (this.b == null) {
                    this.b = new fj();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            this.a = codedInputByteBufferNano.readInt64();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        long l10 = this.a;
        int n13 = n10;
        if (l10 != 0L) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt64Size(1, l10);
        }
        fj fj3 = this.b;
        n10 = n13;
        if (fj3 != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, fj3);
        }
        int n14 = this.c;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt32Size(3, n14);
        }
        n10 = n13;
        if (!Arrays.equals(this.d, WireFormatNano.EMPTY_BYTES)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(4, this.d);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        fj fj3;
        long l10 = this.a;
        if (l10 != 0L) {
            codedOutputByteBufferNano.writeInt64(1, l10);
        }
        if ((fj3 = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, fj3);
        }
        if ((n10 = this.c) != 0) {
            codedOutputByteBufferNano.writeUInt32(3, n10);
        }
        if (!Arrays.equals(this.d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

