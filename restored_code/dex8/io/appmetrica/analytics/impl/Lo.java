/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.mo;
import io.appmetrica.analytics.impl.no;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class lo
extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static volatile lo[] i;
    public byte[] a;
    public int b;
    public mo c;
    public no d;

    public lo() {
        this.a();
    }

    public static lo a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new lo(), byArray);
    }

    public static lo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new lo().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static lo[] b() {
        if (i != null) return i;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (i != null) return i;
                i = new lo[0];
                return i;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final lo a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public final lo a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        if (this.d == null) {
                            this.d = new no();
                        }
                        codedInputByteBufferNano.readMessage(this.d);
                        continue;
                    }
                    if (this.c == null) {
                        this.c = new mo();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                }
                n10 = codedInputByteBufferNano.readInt32();
                if (n10 != 0 && n10 != 1 && n10 != 2 && n10 != 3) continue;
                this.b = n10;
                continue;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        n13 = CodedOutputByteBufferNano.computeInt32Size(2, this.b) + (n13 + n10);
        MessageNano messageNano = this.c;
        n10 = n13;
        if (messageNano != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
        }
        messageNano = this.d;
        n13 = n10;
        if (messageNano != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.a);
        codedOutputByteBufferNano.writeInt32(2, this.b);
        MessageNano messageNano = this.c;
        if (messageNano != null) {
            codedOutputByteBufferNano.writeMessage(3, messageNano);
        }
        if ((messageNano = this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, messageNano);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

