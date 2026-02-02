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

public final class ac
extends MessageNano {
    public static volatile ac[] f;
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;

    public ac() {
        this.a();
    }

    public static ac a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new ac(), byArray);
    }

    public static ac b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new ac().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ac[] b() {
        if (f != null) return f;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (f != null) return f;
                f = new ac[0];
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final ac a() {
        this.a = "";
        this.b = "";
        this.c = false;
        this.d = "";
        this.e = "";
        this.cachedSize = -1;
        return this;
    }

    public final ac a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 154) {
                    if (n10 != 176) {
                        if (n10 != 202) {
                            if (n10 != 210) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            this.e = codedInputByteBufferNano.readString();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readString();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readBool();
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
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(19, this.b);
        }
        boolean bl2 = this.c;
        n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(22, bl2);
        }
        n10 = n13;
        if (!this.d.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(25, this.d);
        }
        n13 = n10;
        if (!this.e.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(26, this.e);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.b);
        }
        if (bl2 = this.c) {
            codedOutputByteBufferNano.writeBool(22, bl2);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

