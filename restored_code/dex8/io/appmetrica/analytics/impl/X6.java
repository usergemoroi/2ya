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

public final class x6
extends MessageNano {
    public static volatile x6[] c;
    public int a;
    public String b;

    public x6() {
        this.a();
    }

    public static x6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new x6(), byArray);
    }

    public static x6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static x6[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new x6[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final x6 a() {
        this.a = 0;
        this.b = "";
        this.cachedSize = -1;
        return this;
    }

    public final x6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            n10 = codedInputByteBufferNano.readInt32();
            if (n10 != 0 && n10 != 1 && n10 != 3) continue;
            this.a = n10;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 0) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(1, n13);
        }
        n10 = n14;
        if (!this.b.equals("")) {
            n10 = n14 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10 = this.a;
        if (n10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, n10);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

