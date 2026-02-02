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

public final class zm
extends MessageNano {
    public static volatile zm[] c;
    public String a;
    public String[] b;

    public zm() {
        this.a();
    }

    public static zm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new zm(), byArray);
    }

    public static zm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new zm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zm[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new zm[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final zm a() {
        this.a = "";
        this.b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public final zm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] stringArray = this.b;
                n10 = stringArray == null ? 0 : stringArray.length;
                int n14 = n13 + n10;
                String[] stringArray2 = new String[n14];
                n13 = n10;
                if (n10 != 0) {
                    System.arraycopy(stringArray, 0, stringArray2, 0, n10);
                    n13 = n10;
                }
                while (n13 < n14 - 1) {
                    stringArray2[n13] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    ++n13;
                }
                stringArray2[n13] = codedInputByteBufferNano.readString();
                this.b = stringArray2;
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
        Object object = this.b;
        n10 = n13;
        if (object != null) {
            n10 = n13;
            if (((String[])object).length > 0) {
                n10 = 0;
                int n14 = 0;
                for (int i14 = 0; i14 < ((String[])(object = this.b)).length; ++i14) {
                    object = object[i14];
                    int n15 = n10;
                    int n16 = n14;
                    if (object != null) {
                        n16 = n14 + 1;
                        n15 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n10;
                    }
                    n10 = n15;
                    n14 = n16;
                }
                n10 = n13 + n10 + n14;
            }
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if ((object = this.b) != null && ((String[])object).length > 0) {
            for (int i14 = 0; i14 < ((String[])(object = this.b)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeString(2, (String)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

