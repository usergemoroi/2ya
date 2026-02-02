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

public final class xm
extends MessageNano {
    public static volatile xm[] c;
    public int a;
    public int b;

    public xm() {
        this.a();
    }

    public static xm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new xm(), byArray);
    }

    public static xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new xm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static xm[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new xm[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final xm a() {
        this.a = 86400;
        this.b = 86400;
        this.cachedSize = -1;
        return this;
    }

    public final xm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
            this.a = codedInputByteBufferNano.readInt32();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 86400) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(1, n13);
        }
        n13 = this.b;
        n10 = n14;
        if (n13 != 86400) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(2, n13);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10 = this.a;
        if (n10 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, n10);
        }
        if ((n10 = this.b) != 86400) {
            codedOutputByteBufferNano.writeInt32(2, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

