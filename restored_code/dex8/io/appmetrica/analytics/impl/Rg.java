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

public final class rg
extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static volatile rg[] h;
    public byte[] a;
    public long b;
    public long c;
    public int d;

    public rg() {
        this.a();
    }

    public static rg a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new rg(), byArray);
    }

    public static rg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new rg().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static rg[] b() {
        if (h != null) return h;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (h != null) return h;
                h = new rg[0];
                return h;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final rg a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.cachedSize = -1;
        return this;
    }

    public final rg a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (n10 != 32) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        n10 = codedInputByteBufferNano.readInt32();
                        if (n10 != 0 && n10 != 1 && n10 != 2) continue;
                        this.d = n10;
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readUInt64();
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
        n10 = CodedOutputByteBufferNano.computeBytesSize(1, this.a) + n10;
        long l10 = this.b;
        int n13 = n10;
        if (l10 != 0L) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt64Size(2, l10);
        }
        l10 = this.c;
        n10 = n13;
        if (l10 != 0L) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt64Size(3, l10);
        }
        int n14 = this.d;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(4, n14);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        codedOutputByteBufferNano.writeBytes(1, this.a);
        long l10 = this.b;
        if (l10 != 0L) {
            codedOutputByteBufferNano.writeUInt64(2, l10);
        }
        if ((l10 = this.c) != 0L) {
            codedOutputByteBufferNano.writeUInt64(3, l10);
        }
        if ((n10 = this.d) != 0) {
            codedOutputByteBufferNano.writeInt32(4, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

