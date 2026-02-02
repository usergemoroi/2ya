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

public final class d2
extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = -1;
    public static final int j = 0;
    public static final int k = 1;
    public static volatile d2[] l;
    public int a;
    public int b;

    public d2() {
        this.a();
    }

    public static d2 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new d2(), byArray);
    }

    public static d2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new d2().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d2[] b() {
        if (l != null) return l;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (l != null) return l;
                l = new d2[0];
                return l;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final d2 a() {
        this.a = 0;
        this.b = -1;
        this.cachedSize = -1;
        return this;
    }

    public final d2 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 16) {
                if (n10 != 24) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                n10 = codedInputByteBufferNano.readInt32();
                if (n10 != -1 && n10 != 0 && n10 != 1) continue;
                this.b = n10;
                continue;
            }
            n10 = codedInputByteBufferNano.readInt32();
            if (n10 != 0 && n10 != 1 && n10 != 2 && n10 != 3 && n10 != 4 && n10 != 5) continue;
            this.a = n10;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeInt32Size(2, this.a);
        return CodedOutputByteBufferNano.computeInt32Size(3, this.b) + (n13 + n10);
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.a);
        codedOutputByteBufferNano.writeInt32(3, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }
}

