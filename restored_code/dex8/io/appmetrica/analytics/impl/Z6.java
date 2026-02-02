/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.y6;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class z6
extends MessageNano {
    public static volatile z6[] g;
    public String a;
    public int b;
    public long c;
    public String d;
    public int e;
    public y6[] f;

    public z6() {
        this.a();
    }

    public static z6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new z6(), byArray);
    }

    public static z6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static z6[] b() {
        if (g != null) return g;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (g != null) return g;
                g = new z6[0];
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final z6 a() {
        this.a = "";
        this.b = 0;
        this.c = 0L;
        this.d = "";
        this.e = 0;
        this.f = y6.b();
        this.cachedSize = -1;
        return this;
    }

    public final z6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (n10 != 34) {
                            if (n10 != 40) {
                                if (n10 != 50) {
                                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                    return this;
                                }
                                int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                                Object object = this.f;
                                n10 = object == null ? 0 : ((y6[])object).length;
                                int n14 = n13 + n10;
                                y6[] y6Array = new y6[n14];
                                n13 = n10;
                                if (n10 != 0) {
                                    System.arraycopy(object, 0, y6Array, 0, n10);
                                    n13 = n10;
                                }
                                while (n13 < n14 - 1) {
                                    y6Array[n13] = object = new y6();
                                    codedInputByteBufferNano.readMessage((MessageNano)object);
                                    codedInputByteBufferNano.readTag();
                                    ++n13;
                                }
                                y6Array[n13] = object = new y6();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                this.f = y6Array;
                                continue;
                            }
                            this.e = codedInputByteBufferNano.readUInt32();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readSInt64();
                    continue;
                }
                this.b = codedInputByteBufferNano.readSInt32();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeStringSize(1, this.a);
        int n14 = CodedOutputByteBufferNano.computeSInt32Size(2, this.b);
        n13 = n10 = CodedOutputByteBufferNano.computeSInt64Size(3, this.c) + (n14 + (n13 + n10));
        if (!this.d.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        n14 = this.e;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt32Size(5, n14);
        }
        Object object = this.f;
        n14 = n10;
        if (object != null) {
            n14 = n10;
            if (((y6[])object).length > 0) {
                n13 = 0;
                while (true) {
                    object = this.f;
                    n14 = n10;
                    if (n13 >= ((y6[])object).length) break;
                    object = object[n13];
                    n14 = n10;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano)object) + n10;
                    }
                    ++n13;
                    n10 = n14;
                }
            }
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object;
        int n10;
        codedOutputByteBufferNano.writeString(1, this.a);
        codedOutputByteBufferNano.writeSInt32(2, this.b);
        codedOutputByteBufferNano.writeSInt64(3, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if ((n10 = this.e) != 0) {
            codedOutputByteBufferNano.writeUInt32(5, n10);
        }
        if ((object = this.f) != null && ((y6[])object).length > 0) {
            for (n10 = 0; n10 < ((y6[])(object = this.f)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

