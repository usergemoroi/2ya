/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.i9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class j9
extends MessageNano {
    public static volatile j9[] b;
    public i9[] a;

    public j9() {
        this.a();
    }

    public static j9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new j9(), byArray);
    }

    public static j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new j9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j9[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new j9[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final j9 a() {
        this.a = i9.b();
        this.cachedSize = -1;
        return this;
    }

    public final j9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            Object object = this.a;
            n10 = object == null ? 0 : ((i9[])object).length;
            int n14 = n13 + n10;
            i9[] i9Array = new i9[n14];
            n13 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, i9Array, 0, n10);
                n13 = n10;
            }
            while (n13 < n14 - 1) {
                i9Array[n13] = object = new i9();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n13;
            }
            i9Array[n13] = object = new i9();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = i9Array;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((i9[])object).length > 0) {
                int n14 = 0;
                while (true) {
                    object = this.a;
                    n13 = n10;
                    if (n14 >= ((i9[])object).length) break;
                    object = object[n14];
                    n13 = n10;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object) + n10;
                    }
                    ++n14;
                    n10 = n13;
                }
            }
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null && ((i9[])object).length > 0) {
            for (int i14 = 0; i14 < ((i9[])(object = this.a)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

