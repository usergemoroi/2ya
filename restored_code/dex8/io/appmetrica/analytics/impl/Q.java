/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class q
extends MessageNano {
    public static volatile q[] c;
    public long a;
    public int b;

    public q() {
        this.a();
    }

    public static q a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new q(), byArray);
    }

    public static q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new q().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static q[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new q[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final q a() {
        this.a = 0L;
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    public final q a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readInt32();
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
        int n14 = this.b;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(2, n14);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        long l10 = this.a;
        if (l10 != 0L) {
            codedOutputByteBufferNano.writeInt64(1, l10);
        }
        if ((n10 = this.b) != 0) {
            codedOutputByteBufferNano.writeInt32(2, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

