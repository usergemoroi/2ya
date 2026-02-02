/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.q6;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class r6
extends MessageNano {
    public static volatile r6[] d;
    public q6 a;
    public String b;
    public int c;

    public r6() {
        this.a();
    }

    public static r6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new r6(), byArray);
    }

    public static r6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new r6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r6[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new r6[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final r6 a() {
        this.a = null;
        this.b = "";
        this.c = -1;
        this.cachedSize = -1;
        return this;
    }

    public final r6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 24) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue;
                    this.c = n10;
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            if (this.a == null) {
                this.a = new q6();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        q6 q62 = this.a;
        int n13 = n10;
        if (q62 != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, q62);
        }
        n10 = n13;
        if (!this.b.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        int n14 = this.c;
        n13 = n10;
        if (n14 != -1) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(3, n14);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        q6 q62 = this.a;
        if (q62 != null) {
            codedOutputByteBufferNano.writeMessage(1, q62);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if ((n10 = this.c) != -1) {
            codedOutputByteBufferNano.writeInt32(3, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

