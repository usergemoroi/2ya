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
import java.util.Arrays;

public final class s6
extends MessageNano {
    public static volatile s6[] c;
    public byte[] a;
    public byte[] b;

    public s6() {
        this.a();
    }

    public static s6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new s6(), byArray);
    }

    public static s6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new s6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static s6[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new s6[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final s6 a() {
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.a = byArray;
        this.b = byArray;
        this.cachedSize = -1;
        return this;
    }

    public final s6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readBytes();
                continue;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        byte[] byArray = this.a;
        byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
        int n13 = n10;
        if (!Arrays.equals(byArray, byArray2)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        n10 = n13;
        if (!Arrays.equals(this.b, byArray2)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] byArray = this.a;
        byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(byArray, byArray2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, byArray2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

