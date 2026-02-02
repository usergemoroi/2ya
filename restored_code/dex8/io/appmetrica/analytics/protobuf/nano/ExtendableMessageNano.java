/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.Extension;
import io.appmetrica.analytics.protobuf.nano.FieldArray;
import io.appmetrica.analytics.protobuf.nano.FieldData;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.UnknownFieldData;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public abstract class ExtendableMessageNano<M extends ExtendableMessageNano<M>>
extends MessageNano {
    protected FieldArray unknownFieldData;

    public M clone() throws CloneNotSupportedException {
        ExtendableMessageNano extendableMessageNano = (ExtendableMessageNano)super.clone();
        InternalNano.cloneUnknownFieldData(this, extendableMessageNano);
        return (M)extendableMessageNano;
    }

    @Override
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

    public final <T> T getExtension(Extension<M, T> extension) {
        Cloneable cloneable = this.unknownFieldData;
        Object var2_3 = null;
        if (cloneable == null) {
            return null;
        }
        extension = (cloneable = ((FieldArray)cloneable).get(WireFormatNano.getTagFieldNumber(extension.tag))) == null ? var2_3 : ((FieldData)cloneable).getValue(extension);
        return (T)extension;
    }

    public final boolean hasExtension(Extension<M, ?> extension) {
        FieldArray fieldArray = this.unknownFieldData;
        boolean bl2 = false;
        if (fieldArray == null) {
            return false;
        }
        if (fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag)) != null) {
            bl2 = true;
        }
        return bl2;
    }

    public final <T> M setExtension(Extension<M, T> object, T t13) {
        int n10 = WireFormatNano.getTagFieldNumber(((Extension)object).tag);
        FieldData fieldData = null;
        if (t13 == null) {
            object = this.unknownFieldData;
            if (object != null) {
                ((FieldArray)object).remove(n10);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray == null) {
                this.unknownFieldData = new FieldArray();
            } else {
                fieldData = fieldArray.get(n10);
            }
            if (fieldData == null) {
                this.unknownFieldData.put(n10, new FieldData(object, t13));
            } else {
                fieldData.setValue(object, t13);
            }
        }
        return (M)this;
    }

    protected final boolean storeUnknownField(CodedInputByteBufferNano object, int n10) throws IOException {
        int n13 = ((CodedInputByteBufferNano)object).getPosition();
        if (!((CodedInputByteBufferNano)object).skipField(n10)) {
            return false;
        }
        int n14 = WireFormatNano.getTagFieldNumber(n10);
        UnknownFieldData unknownFieldData = new UnknownFieldData(n10, ((CodedInputByteBufferNano)object).getData(n13, ((CodedInputByteBufferNano)object).getPosition() - n13));
        object = this.unknownFieldData;
        if (object == null) {
            this.unknownFieldData = new FieldArray();
            object = null;
        } else {
            object = ((FieldArray)object).get(n14);
        }
        Object object2 = object;
        if (object == null) {
            object2 = new FieldData();
            this.unknownFieldData.put(n14, (FieldData)object2);
        }
        ((FieldData)object2).addUnknownField(unknownFieldData);
        return true;
    }

    @Override
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i14 = 0; i14 < this.unknownFieldData.size(); ++i14) {
            this.unknownFieldData.dataAt(i14).writeTo(codedOutputByteBufferNano);
        }
    }
}

