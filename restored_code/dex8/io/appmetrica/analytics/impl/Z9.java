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

public final class z9
extends MessageNano {
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static volatile z9[] m;
    public double a;
    public double b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;

    public z9() {
        this.a();
    }

    public static z9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new z9(), byArray);
    }

    public static z9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static z9[] b() {
        if (m != null) return m;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (m != null) return m;
                m = new z9[0];
                return m;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final z9 a() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    public final z9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 9) {
                if (n10 != 17) {
                    if (n10 != 24) {
                        if (n10 != 32) {
                            if (n10 != 40) {
                                if (n10 != 48) {
                                    if (n10 != 56) {
                                        if (n10 != 64) {
                                            if (n10 != 74) {
                                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                                return this;
                                            }
                                            this.i = codedInputByteBufferNano.readString();
                                            continue;
                                        }
                                        n10 = codedInputByteBufferNano.readInt32();
                                        if (n10 != 0 && n10 != 1 && n10 != 2) continue;
                                        this.h = n10;
                                        continue;
                                    }
                                    this.g = codedInputByteBufferNano.readInt32();
                                    continue;
                                }
                                this.f = codedInputByteBufferNano.readUInt32();
                                continue;
                            }
                            this.e = codedInputByteBufferNano.readUInt32();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readUInt32();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readUInt64();
                    continue;
                }
                this.b = codedInputByteBufferNano.readDouble();
                continue;
            }
            this.a = codedInputByteBufferNano.readDouble();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeDoubleSize(1, this.a);
        n13 = CodedOutputByteBufferNano.computeDoubleSize(2, this.b) + (n13 + n10);
        long l10 = this.c;
        n10 = n13;
        if (l10 != 0L) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt64Size(3, l10);
        }
        int n14 = this.d;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt32Size(4, n14);
        }
        n14 = this.e;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt32Size(5, n14);
        }
        n14 = this.f;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt32Size(6, n14);
        }
        n14 = this.g;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(7, n14);
        }
        n14 = this.h;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(8, n14);
        }
        n10 = n13;
        if (!this.i.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        codedOutputByteBufferNano.writeDouble(1, this.a);
        codedOutputByteBufferNano.writeDouble(2, this.b);
        long l10 = this.c;
        if (l10 != 0L) {
            codedOutputByteBufferNano.writeUInt64(3, l10);
        }
        if ((n10 = this.d) != 0) {
            codedOutputByteBufferNano.writeUInt32(4, n10);
        }
        if ((n10 = this.e) != 0) {
            codedOutputByteBufferNano.writeUInt32(5, n10);
        }
        if ((n10 = this.f) != 0) {
            codedOutputByteBufferNano.writeUInt32(6, n10);
        }
        if ((n10 = this.g) != 0) {
            codedOutputByteBufferNano.writeInt32(7, n10);
        }
        if ((n10 = this.h) != 0) {
            codedOutputByteBufferNano.writeInt32(8, n10);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

