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

public final class y9
extends MessageNano {
    public static volatile y9[] c;
    public String a;
    public String b;

    public y9() {
        this.a();
    }

    public static y9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new y9(), byArray);
    }

    public static y9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static y9[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new y9[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final y9 a() {
        this.a = "";
        this.b = "";
        this.cachedSize = -1;
        return this;
    }

    public final y9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeStringSize(1, this.a);
        return CodedOutputByteBufferNano.computeStringSize(2, this.b) + (n13 + n10);
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        codedOutputByteBufferNano.writeString(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }
}

