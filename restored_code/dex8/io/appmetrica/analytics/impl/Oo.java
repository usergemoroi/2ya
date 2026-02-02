/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class oo
extends MessageNano {
    public static volatile oo[] b;
    public lo[] a;

    public oo() {
        this.a();
    }

    public static oo a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new oo(), byArray);
    }

    public static oo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new oo().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static oo[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new oo[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final oo a() {
        this.a = lo.b();
        this.cachedSize = -1;
        return this;
    }

    public final oo a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            Object object = this.a;
            n10 = object == null ? 0 : ((lo[])object).length;
            int n14 = n13 + n10;
            lo[] loArray = new lo[n14];
            n13 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, loArray, 0, n10);
                n13 = n10;
            }
            while (n13 < n14 - 1) {
                loArray[n13] = object = new lo();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n13;
            }
            loArray[n13] = object = new lo();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = loArray;
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
            if (((lo[])object).length > 0) {
                int n14 = 0;
                while (true) {
                    object = this.a;
                    n13 = n10;
                    if (n14 >= ((lo[])object).length) break;
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
        if (object != null && ((lo[])object).length > 0) {
            for (int i14 = 0; i14 < ((lo[])(object = this.a)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

