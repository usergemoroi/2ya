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

public final class y6
extends MessageNano {
    public static volatile y6[] g;
    public String a;
    public String b;
    public int c;
    public String d;
    public boolean e;
    public int f;

    public y6() {
        this.a();
    }

    public static y6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new y6(), byArray);
    }

    public static y6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static y6[] b() {
        if (g != null) return g;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (g != null) return g;
                g = new y6[0];
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final y6 a() {
        this.a = "";
        this.b = "";
        this.c = -1;
        this.d = "";
        this.e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    public final y6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 24) {
                        if (n10 != 34) {
                            if (n10 != 40) {
                                if (n10 != 48) {
                                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                    return this;
                                }
                                this.f = codedInputByteBufferNano.readSInt32();
                                continue;
                            }
                            this.e = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readSInt32();
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        n10 = n13;
        if (!this.b.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        int n14 = this.c;
        n13 = n10;
        if (n14 != -1) {
            n13 = n10 + CodedOutputByteBufferNano.computeSInt32Size(3, n14);
        }
        n10 = n13;
        if (!this.d.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        boolean bl2 = this.e;
        n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(5, bl2);
        }
        n14 = this.f;
        n10 = n13;
        if (n14 != -1) {
            n10 = n13 + CodedOutputByteBufferNano.computeSInt32Size(6, n14);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        int n10;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if ((n10 = this.c) != -1) {
            codedOutputByteBufferNano.writeSInt32(3, n10);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (bl2 = this.e) {
            codedOutputByteBufferNano.writeBool(5, bl2);
        }
        if ((n10 = this.f) != -1) {
            codedOutputByteBufferNano.writeSInt32(6, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

