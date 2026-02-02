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

public final class mo
extends MessageNano {
    public static volatile mo[] c;
    public boolean a;
    public boolean b;

    public mo() {
        this.a();
    }

    public static mo a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new mo(), byArray);
    }

    public static mo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new mo().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static mo[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new mo[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final mo a() {
        this.a = false;
        this.b = false;
        this.cachedSize = -1;
        return this;
    }

    public final mo a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readBool();
                continue;
            }
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        boolean bl2 = this.a;
        int n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(1, bl2);
        }
        bl2 = this.b;
        n10 = n13;
        if (bl2) {
            n10 = n13 + CodedOutputByteBufferNano.computeBoolSize(2, bl2);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2 = this.a;
        if (bl2) {
            codedOutputByteBufferNano.writeBool(1, bl2);
        }
        if (bl2 = this.b) {
            codedOutputByteBufferNano.writeBool(2, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

