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

public final class hj
extends MessageNano {
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static volatile hj[] i;
    public byte[] a;
    public long b;
    public int c;
    public byte[] d;
    public long e;

    public hj() {
        this.a();
    }

    public static hj a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new hj(), byArray);
    }

    public static hj b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new hj().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static hj[] b() {
        if (i != null) return i;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (i != null) return i;
                i = new hj[0];
                return i;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final hj a() {
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.a = byArray;
        this.b = 0L;
        this.c = 0;
        this.d = byArray;
        this.e = 0L;
        this.cachedSize = -1;
        return this;
    }

    public final hj a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (n10 != 34) {
                            if (n10 != 40) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            this.e = codedInputByteBufferNano.readUInt64();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readBytes();
                        continue;
                    }
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1 && n10 != 2) continue;
                    this.c = n10;
                    continue;
                }
                this.b = codedInputByteBufferNano.readUInt64();
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
        long l10 = this.b;
        n10 = n13;
        if (l10 != 0L) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt64Size(2, l10);
        }
        int n14 = this.c;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(3, n14);
        }
        n10 = n13;
        if (!Arrays.equals(this.d, byArray2)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(4, this.d);
        }
        l10 = this.e;
        n13 = n10;
        if (l10 != 0L) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt64Size(5, l10);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        long l10;
        byte[] byArray = this.a;
        byte[] byArray2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(byArray, byArray2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if ((l10 = this.b) != 0L) {
            codedOutputByteBufferNano.writeUInt64(2, l10);
        }
        if ((n10 = this.c) != 0) {
            codedOutputByteBufferNano.writeInt32(3, n10);
        }
        if (!Arrays.equals(this.d, byArray2)) {
            codedOutputByteBufferNano.writeBytes(4, this.d);
        }
        if ((l10 = this.e) != 0L) {
            codedOutputByteBufferNano.writeUInt64(5, l10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

