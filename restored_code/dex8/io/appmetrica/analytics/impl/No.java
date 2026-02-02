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

public final class no
extends MessageNano {
    public static volatile no[] e;
    public byte[] a;
    public double b;
    public double c;
    public boolean d;

    public no() {
        this.a();
    }

    public static no a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new no(), byArray);
    }

    public static no b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new no().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static no[] b() {
        if (e != null) return e;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (e != null) return e;
                e = new no[0];
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final no a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0.0;
        this.c = 0.0;
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    public final no a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 17) {
                    if (n10 != 25) {
                        if (n10 != 32) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readDouble();
                    continue;
                }
                this.b = codedInputByteBufferNano.readDouble();
                continue;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        n10 = n13;
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0)) {
            n10 = n13 + CodedOutputByteBufferNano.computeDoubleSize(2, this.b);
        }
        n13 = n10;
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0)) {
            n13 = n10 + CodedOutputByteBufferNano.computeDoubleSize(3, this.c);
        }
        boolean bl2 = this.d;
        n10 = n13;
        if (bl2) {
            n10 = n13 + CodedOutputByteBufferNano.computeBoolSize(4, bl2);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0)) {
            codedOutputByteBufferNano.writeDouble(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0)) {
            codedOutputByteBufferNano.writeDouble(3, this.c);
        }
        if (bl2 = this.d) {
            codedOutputByteBufferNano.writeBool(4, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

