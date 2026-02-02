/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.Extension;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.UnknownFieldData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class FieldData
implements Cloneable {
    private Extension<?, ?> cachedExtension;
    private List<UnknownFieldData> unknownFieldData;
    private Object value;

    FieldData() {
        this.unknownFieldData = new ArrayList<UnknownFieldData>();
    }

    <T> FieldData(Extension<?, T> extension, T t13) {
        this.cachedExtension = extension;
        this.value = t13;
    }

    private byte[] toByteArray() throws IOException {
        byte[] byArray = new byte[this.computeSerializedSize()];
        this.writeTo(CodedOutputByteBufferNano.newInstance(byArray));
        return byArray;
    }

    void addUnknownField(UnknownFieldData unknownFieldData) {
        this.unknownFieldData.add(unknownFieldData);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final FieldData clone() {
        MessageNano[] messageNanoArray;
        FieldData fieldData;
        block15: {
            block14: {
                fieldData = new FieldData();
                try {
                    fieldData.cachedExtension = this.cachedExtension;
                    messageNanoArray = this.unknownFieldData;
                    if (messageNanoArray != null) break block14;
                    fieldData.unknownFieldData = null;
                    break block15;
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw new AssertionError((Object)cloneNotSupportedException);
                }
            }
            fieldData.unknownFieldData.addAll((Collection<UnknownFieldData>)messageNanoArray);
        }
        messageNanoArray = this.value;
        if (messageNanoArray == null) {
            return fieldData;
        }
        if (messageNanoArray instanceof MessageNano) {
            fieldData.value = ((MessageNano)messageNanoArray).clone();
            return fieldData;
        }
        if (messageNanoArray instanceof byte[]) {
            fieldData.value = ((byte[])messageNanoArray).clone();
            return fieldData;
        }
        boolean bl2 = messageNanoArray instanceof byte[][];
        int n10 = 0;
        int n13 = 0;
        if (bl2) {
            byte[][] byArray = (byte[][])messageNanoArray;
            messageNanoArray = (MessageNano[])new byte[byArray.length][];
            fieldData.value = messageNanoArray;
            n10 = n13;
            while (n10 < byArray.length) {
                messageNanoArray[n10] = (byte[])byArray[n10].clone();
                ++n10;
            }
            return fieldData;
        }
        if (messageNanoArray instanceof boolean[]) {
            fieldData.value = ((boolean[])messageNanoArray).clone();
            return fieldData;
        }
        if (messageNanoArray instanceof int[]) {
            fieldData.value = ((int[])messageNanoArray).clone();
            return fieldData;
        }
        if (messageNanoArray instanceof long[]) {
            fieldData.value = ((long[])messageNanoArray).clone();
            return fieldData;
        }
        if (messageNanoArray instanceof float[]) {
            fieldData.value = ((float[])messageNanoArray).clone();
            return fieldData;
        }
        if (messageNanoArray instanceof double[]) {
            fieldData.value = ((double[])messageNanoArray).clone();
            return fieldData;
        }
        if (!(messageNanoArray instanceof MessageNano[])) return fieldData;
        MessageNano[] messageNanoArray2 = messageNanoArray;
        fieldData.value = messageNanoArray = new MessageNano[messageNanoArray2.length];
        while (n10 < messageNanoArray2.length) {
            messageNanoArray[n10] = messageNanoArray2[n10].clone();
            ++n10;
        }
        return fieldData;
    }

    int computeSerializedSize() {
        int n10;
        Iterator<UnknownFieldData> iterator = this.value;
        if (iterator != null) {
            n10 = this.cachedExtension.computeSerializedSize(iterator);
        } else {
            iterator = this.unknownFieldData.iterator();
            n10 = 0;
            while (iterator.hasNext()) {
                n10 += iterator.next().computeSerializedSize();
            }
        }
        return n10;
    }

    public boolean equals(Object object) {
        List<UnknownFieldData> list;
        if (object == this) {
            return true;
        }
        if (!(object instanceof FieldData)) {
            return false;
        }
        object = (FieldData)object;
        if (this.value != null && ((FieldData)object).value != null) {
            Object object2 = this.cachedExtension;
            if (object2 != ((FieldData)object).cachedExtension) {
                return false;
            }
            if (!((Extension)object2).clazz.isArray()) {
                return this.value.equals(((FieldData)object).value);
            }
            object2 = this.value;
            if (object2 instanceof byte[]) {
                return Arrays.equals((byte[])object2, (byte[])((FieldData)object).value);
            }
            if (object2 instanceof int[]) {
                return Arrays.equals((int[])object2, (int[])((FieldData)object).value);
            }
            if (object2 instanceof long[]) {
                return Arrays.equals((long[])object2, (long[])((FieldData)object).value);
            }
            if (object2 instanceof float[]) {
                return Arrays.equals((float[])object2, (float[])((FieldData)object).value);
            }
            if (object2 instanceof double[]) {
                return Arrays.equals((double[])object2, (double[])((FieldData)object).value);
            }
            if (object2 instanceof boolean[]) {
                return Arrays.equals((boolean[])object2, (boolean[])((FieldData)object).value);
            }
            return Arrays.deepEquals((Object[])object2, (Object[])((FieldData)object).value);
        }
        List<UnknownFieldData> list2 = this.unknownFieldData;
        if (list2 != null && (list = ((FieldData)object).unknownFieldData) != null) {
            return list2.equals(list);
        }
        try {
            boolean bl2 = Arrays.equals(this.toByteArray(), super.toByteArray());
            return bl2;
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    UnknownFieldData getUnknownField(int n10) {
        List<UnknownFieldData> list = this.unknownFieldData;
        if (list == null) {
            return null;
        }
        if (n10 < list.size()) {
            return this.unknownFieldData.get(n10);
        }
        return null;
    }

    int getUnknownFieldSize() {
        List<UnknownFieldData> list = this.unknownFieldData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    <T> T getValue(Extension<?, T> extension) {
        if (this.value != null) {
            if (this.cachedExtension != extension) {
                throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
            }
        } else {
            this.cachedExtension = extension;
            this.value = extension.getValueFrom(this.unknownFieldData);
            this.unknownFieldData = null;
        }
        return (T)this.value;
    }

    public int hashCode() {
        try {
            int n10 = Arrays.hashCode(this.toByteArray());
            return n10 + 527;
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException);
        }
    }

    <T> void setValue(Extension<?, T> extension, T t13) {
        this.cachedExtension = extension;
        this.value = t13;
        this.unknownFieldData = null;
    }

    void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Iterator<UnknownFieldData> iterator = this.value;
        if (iterator != null) {
            this.cachedExtension.writeTo(iterator, codedOutputByteBufferNano);
        } else {
            iterator = this.unknownFieldData.iterator();
            while (iterator.hasNext()) {
                iterator.next().writeTo(codedOutputByteBufferNano);
            }
        }
    }
}

