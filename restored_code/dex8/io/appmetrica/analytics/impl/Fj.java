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

public final class fj
extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static volatile fj[] h;
    public int a;
    public int b;

    public fj() {
        this.a();
    }

    public static fj a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new fj(), byArray);
    }

    public static fj b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new fj().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static fj[] b() {
        if (h != null) return h;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (h != null) return h;
                h = new fj[0];
                return h;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final fj a() {
        this.a = 0;
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    public final fj a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                n10 = codedInputByteBufferNano.readInt32();
                if (n10 != 0 && n10 != 1 && n10 != 2 && n10 != 3 && n10 != 4) continue;
                this.b = n10;
                continue;
            }
            this.a = codedInputByteBufferNano.readUInt32();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 0) {
            n14 = n10 + CodedOutputByteBufferNano.computeUInt32Size(1, n13);
        }
        n13 = this.b;
        n10 = n14;
        if (n13 != 0) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(2, n13);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10 = this.a;
        if (n10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, n10);
        }
        if ((n10 = this.b) != 0) {
            codedOutputByteBufferNano.writeInt32(2, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

