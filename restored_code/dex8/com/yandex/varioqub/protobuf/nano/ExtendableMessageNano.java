/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano
 *  com.yandex.varioqub.protobuf.nano.Extension
 *  com.yandex.varioqub.protobuf.nano.FieldArray
 *  com.yandex.varioqub.protobuf.nano.FieldData
 *  com.yandex.varioqub.protobuf.nano.InternalNano
 *  com.yandex.varioqub.protobuf.nano.MessageNano
 *  com.yandex.varioqub.protobuf.nano.UnknownFieldData
 *  com.yandex.varioqub.protobuf.nano.WireFormatNano
 */
package com.yandex.varioqub.protobuf.nano;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.Extension;
import com.yandex.varioqub.protobuf.nano.FieldArray;
import com.yandex.varioqub.protobuf.nano.FieldData;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.UnknownFieldData;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

public abstract class ExtendableMessageNano<M extends ExtendableMessageNano<M>>
extends MessageNano {
    protected FieldArray unknownFieldData;

    public M clone() throws CloneNotSupportedException {
        ExtendableMessageNano extendableMessageNano = (ExtendableMessageNano)super.clone();
        InternalNano.cloneUnknownFieldData((ExtendableMessageNano)this, (ExtendableMessageNano)extendableMessageNano);
        return (M)((Object)extendableMessageNano);
    }

    protected int computeSerializedSize() {
        FieldArray fieldArray = this.unknownFieldData;
        int n10 = 0;
        if (fieldArray != null) {
            n10 = 0;
            for (int i14 = 0; i14 < this.unknownFieldData.size(); ++i14) {
                n10 += this.unknownFieldData.dataAt(i14).computeSerializedSize();
            }
        }
        return n10;
    }

    public final <T> T getExtension(Extension<M, T> object) {
        FieldArray fieldArray = this.unknownFieldData;
        Object var2_3 = null;
        if (fieldArray == null) {
            return null;
        }
        object = (fieldArray = fieldArray.get(WireFormatNano.getTagFieldNumber((int)object.tag))) == null ? var2_3 : fieldArray.getValue(object);
        return (T)object;
    }

    public final boolean hasExtension(Extension<M, ?> extension) {
        FieldArray fieldArray = this.unknownFieldData;
        boolean bl2 = false;
        if (fieldArray == null) {
            return false;
        }
        if (fieldArray.get(WireFormatNano.getTagFieldNumber((int)extension.tag)) != null) {
            bl2 = true;
        }
        return bl2;
    }

    public final <T> M setExtension(Extension<M, T> fieldArray, T t13) {
        int n10 = WireFormatNano.getTagFieldNumber((int)fieldArray.tag);
        FieldData fieldData = null;
        if (t13 == null) {
            fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(n10);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            FieldArray fieldArray2 = this.unknownFieldData;
            if (fieldArray2 == null) {
                this.unknownFieldData = new FieldArray();
            } else {
                fieldData = fieldArray2.get(n10);
            }
            if (fieldData == null) {
                this.unknownFieldData.put(n10, new FieldData((Extension)fieldArray, t13));
            } else {
                fieldData.setValue((Extension)fieldArray, t13);
            }
        }
        return (M)((Object)this);
    }

    protected final boolean storeUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int n10) throws IOException {
        int n13 = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(n10)) {
            return false;
        }
        int n14 = WireFormatNano.getTagFieldNumber((int)n10);
        UnknownFieldData unknownFieldData = new UnknownFieldData(n10, codedInputByteBufferNano.getData(n13, codedInputByteBufferNano.getPosition() - n13));
        codedInputByteBufferNano = this.unknownFieldData;
        if (codedInputByteBufferNano == null) {
            this.unknownFieldData = new FieldArray();
            codedInputByteBufferNano = null;
        } else {
            codedInputByteBufferNano = codedInputByteBufferNano.get(n14);
        }
        CodedInputByteBufferNano codedInputByteBufferNano2 = codedInputByteBufferNano;
        if (codedInputByteBufferNano == null) {
            codedInputByteBufferNano2 = new FieldData();
            this.unknownFieldData.put(n14, (FieldData)codedInputByteBufferNano2);
        }
        codedInputByteBufferNano2.addUnknownField(unknownFieldData);
        return true;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i14 = 0; i14 < this.unknownFieldData.size(); ++i14) {
            this.unknownFieldData.dataAt(i14).writeTo(codedOutputByteBufferNano);
        }
    }
}

