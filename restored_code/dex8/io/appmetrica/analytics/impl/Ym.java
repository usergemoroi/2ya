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

public final class ym
extends MessageNano {
    public static volatile ym[] b;
    public long a;

    public ym() {
        this.a();
    }

    public static ym a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new ym(), byArray);
    }

    public static ym b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new ym().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ym[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new ym[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final ym a() {
        this.a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    public final ym a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
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
        if (l10 != 10000L) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt64Size(1, l10);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long l10 = this.a;
        if (l10 != 10000L) {
            codedOutputByteBufferNano.writeInt64(1, l10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

