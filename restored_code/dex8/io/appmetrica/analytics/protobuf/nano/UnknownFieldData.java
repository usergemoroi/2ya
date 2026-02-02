/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

final class UnknownFieldData {
    final byte[] bytes;
    final int tag;

    UnknownFieldData(int n10, byte[] byArray) {
        this.tag = n10;
        this.bytes = byArray;
    }

    int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + this.bytes.length;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof UnknownFieldData)) {
            return false;
        }
        object = (UnknownFieldData)object;
        if (this.tag != ((UnknownFieldData)object).tag || !Arrays.equals(this.bytes, ((UnknownFieldData)object).bytes)) {
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        int n10 = this.tag;
        return Arrays.hashCode(this.bytes) + (n10 + 527) * 31;
    }

    void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeRawVarint32(this.tag);
        codedOutputByteBufferNano.writeRawBytes(this.bytes);
    }
}

