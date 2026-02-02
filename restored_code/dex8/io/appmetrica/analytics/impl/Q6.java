/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.z6;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class q6
extends MessageNano {
    public static volatile q6[] d;
    public z6 a;
    public z6[] b;
    public String c;

    public q6() {
        this.a();
    }

    public static q6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new q6(), byArray);
    }

    public static q6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new q6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static q6[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new q6[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final q6 a() {
        this.a = null;
        this.b = z6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    public final q6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    this.c = codedInputByteBufferNano.readString();
                    continue;
                }
                int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Object object = this.b;
                n10 = object == null ? 0 : ((z6[])object).length;
                int n14 = n13 + n10;
                z6[] z6Array = new z6[n14];
                n13 = n10;
                if (n10 != 0) {
                    System.arraycopy(object, 0, z6Array, 0, n10);
                    n13 = n10;
                }
                while (n13 < n14 - 1) {
                    z6Array[n13] = object = new z6();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n13;
                }
                z6Array[n13] = object = new z6();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = z6Array;
                continue;
            }
            if (this.a == null) {
                this.a = new z6();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object);
        }
        object = this.b;
        n10 = n13;
        if (object != null) {
            n10 = n13;
            if (((z6[])object).length > 0) {
                int n14 = 0;
                while (true) {
                    object = this.b;
                    n10 = n13;
                    if (n14 >= ((z6[])object).length) break;
                    object = object[n14];
                    n10 = n13;
                    if (object != null) {
                        n10 = CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object) + n13;
                    }
                    ++n14;
                    n13 = n10;
                }
            }
        }
        n13 = n10;
        if (!this.c.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
        }
        if ((object = this.b) != null && ((z6[])object).length > 0) {
            for (int i14 = 0; i14 < ((z6[])(object = this.b)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

