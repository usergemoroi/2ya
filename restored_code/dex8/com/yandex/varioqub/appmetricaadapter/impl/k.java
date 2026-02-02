/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  com.yandex.varioqub.protobuf.nano.WireFormatNano
 */
package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

public final class k
extends MessageNano {
    public String a;
    public long[] b;

    public k() {
        this.a();
    }

    public final void a() {
        this.a = "";
        this.b = WireFormatNano.EMPTY_LONG_ARRAY;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize((int)1, (String)this.a);
        }
        long[] lArray = this.b;
        n10 = n13;
        if (lArray != null) {
            n10 = n13;
            if (lArray.length > 0) {
                int n14 = 0;
                for (n10 = 0; n10 < (lArray = this.b).length; ++n10) {
                    n14 += CodedOutputByteBufferNano.computeInt64SizeNoTag((long)lArray[n10]);
                }
                n10 = n13 + n14 + lArray.length;
            }
        }
        return n10;
    }

    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                long[] lArray;
                long[] lArray2;
                int n13;
                int n14;
                if (n10 != 16) {
                    if (n10 != 18) {
                        if (WireFormatNano.parseUnknownField((CodedInputByteBufferNano)codedInputByteBufferNano, (int)n10)) continue;
                        break;
                    }
                    n14 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    n10 = codedInputByteBufferNano.getPosition();
                    n13 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readInt64();
                        ++n13;
                    }
                    codedInputByteBufferNano.rewindToPosition(n10);
                    lArray2 = this.b;
                    n10 = lArray2 == null ? 0 : lArray2.length;
                    int n15 = n13 + n10;
                    lArray = new long[n15];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(lArray2, 0, lArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n15) {
                        lArray[n13] = codedInputByteBufferNano.readInt64();
                        ++n13;
                    }
                    this.b = lArray;
                    codedInputByteBufferNano.popLimit(n14);
                    continue;
                }
                n13 = WireFormatNano.getRepeatedFieldArrayLength((CodedInputByteBufferNano)codedInputByteBufferNano, (int)16);
                lArray2 = this.b;
                n10 = lArray2 == null ? 0 : lArray2.length;
                n14 = n13 + n10;
                lArray = new long[n14];
                n13 = n10;
                if (n10 != 0) {
                    System.arraycopy(lArray2, 0, lArray, 0, n10);
                    n13 = n10;
                }
                while (n13 < n14 - 1) {
                    lArray[n13] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    ++n13;
                }
                lArray[n13] = codedInputByteBufferNano.readInt64();
                this.b = lArray;
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long[] lArray;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if ((lArray = this.b) != null && lArray.length > 0) {
            for (int i14 = 0; i14 < (lArray = this.b).length; ++i14) {
                codedOutputByteBufferNano.writeInt64(2, lArray[i14]);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

