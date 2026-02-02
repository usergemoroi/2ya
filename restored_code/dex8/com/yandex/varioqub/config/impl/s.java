/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  com.yandex.varioqub.protobuf.nano.WireFormatNano
 */
package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

public final class s
extends MessageNano {
    public static volatile s[] d;
    public String a;
    public long b;
    public boolean c;

    public s() {
        this.a();
    }

    public final void a() {
        this.a = "";
        this.b = 0L;
        this.c = false;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        long l10 = this.b;
        n10 = n13;
        if (l10 != 0L) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt64Size((int)2, (long)l10);
        }
        boolean bl2 = this.c;
        n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize((int)3, (boolean)bl2);
        }
        return n13;
    }

    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n10)) continue;
                        break;
                    }
                    this.c = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.b = codedInputByteBufferNano.readInt64();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean bl2;
        long l10;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if ((l10 = this.b) != 0L) {
            codedOutputByteBufferNano.writeInt64(2, l10);
        }
        if (bl2 = this.c) {
            codedOutputByteBufferNano.writeBool(3, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

