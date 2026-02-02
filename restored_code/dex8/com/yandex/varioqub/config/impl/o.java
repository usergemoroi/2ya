/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.InternalNano
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  com.yandex.varioqub.protobuf.nano.WireFormatNano
 */
package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

public final class o
extends MessageNano {
    public static volatile o[] c;
    public String a;
    public double b;

    public o() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new o[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void a() {
        this.a = "";
        this.b = 0.0;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        n10 = n13;
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0)) {
            n10 = n13 + CodedOutputByteBufferNano.computeDoubleSize((int)2, (double)this.b);
        }
        return n10;
    }

    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 17) {
                    if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n10)) continue;
                    break;
                }
                this.b = codedInputByteBufferNano.readDouble();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0)) {
            codedOutputByteBufferNano.writeDouble(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

