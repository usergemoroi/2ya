/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.FieldData;

public final class FieldArray
implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage = false;
    private int mSize;

    FieldArray() {
        this(10);
    }

    FieldArray(int n10) {
        n10 = this.idealIntArraySize(n10);
        this.mFieldNumbers = new int[n10];
        this.mData = new FieldData[n10];
        this.mSize = 0;
    }

    private boolean arrayEquals(int[] nArray, int[] nArray2, int n10) {
        for (int i14 = 0; i14 < n10; ++i14) {
            if (nArray[i14] == nArray2[i14]) continue;
            return false;
        }
        return true;
    }

    private boolean arrayEquals(FieldData[] fieldDataArray, FieldData[] fieldDataArray2, int n10) {
        for (int i14 = 0; i14 < n10; ++i14) {
            if (fieldDataArray[i14].equals(fieldDataArray2[i14])) continue;
            return false;
        }
        return true;
    }

    private int binarySearch(int n10) {
        int n13 = this.mSize - 1;
        int n14 = 0;
        while (n14 <= n13) {
            int n15 = n14 + n13 >>> 1;
            int n16 = this.mFieldNumbers[n15];
            if (n16 < n10) {
                n14 = n15 + 1;
                continue;
            }
            if (n16 > n10) {
                n13 = n15 - 1;
                continue;
            }
            return n15;
        }
        return ~n14;
    }

    private void gc() {
        int n10 = this.mSize;
        int[] nArray = this.mFieldNumbers;
        FieldData[] fieldDataArray = this.mData;
        int n13 = 0;
        for (int i14 = 0; i14 < n10; ++i14) {
            FieldData fieldData = fieldDataArray[i14];
            int n14 = n13;
            if (fieldData != DELETED) {
                if (i14 != n13) {
                    nArray[n13] = nArray[i14];
                    fieldDataArray[n13] = fieldData;
                    fieldDataArray[i14] = null;
                }
                n14 = n13 + 1;
            }
            n13 = n14;
        }
        this.mGarbage = false;
        this.mSize = n13;
    }

    private int idealByteArraySize(int n10) {
        for (int i14 = 4; i14 < 32; ++i14) {
            int n13 = (1 << i14) - 12;
            if (n10 > n13) continue;
            return n13;
        }
        return n10;
    }

    private int idealIntArraySize(int n10) {
        return this.idealByteArraySize(n10 * 4) / 4;
    }

    public final FieldArray clone() {
        int n10 = this.size();
        FieldArray fieldArray = new FieldArray(n10);
        int[] nArray = this.mFieldNumbers;
        Object object = fieldArray.mFieldNumbers;
        System.arraycopy(nArray, 0, object, 0, n10);
        for (int i14 = 0; i14 < n10; ++i14) {
            object = this.mData[i14];
            if (object == null) continue;
            fieldArray.mData[i14] = ((FieldData)object).clone();
        }
        fieldArray.mSize = n10;
        return fieldArray;
    }

    FieldData dataAt(int n10) {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mData[n10];
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof FieldArray)) {
            return false;
        }
        object = (FieldArray)object;
        if (this.size() != ((FieldArray)object).size()) {
            return false;
        }
        if (!this.arrayEquals(this.mFieldNumbers, ((FieldArray)object).mFieldNumbers, this.mSize) || !this.arrayEquals(this.mData, ((FieldArray)object).mData, this.mSize)) {
            bl2 = false;
        }
        return bl2;
    }

    FieldData get(int n10) {
        FieldData fieldData;
        if ((n10 = this.binarySearch(n10)) >= 0 && (fieldData = this.mData[n10]) != DELETED) {
            return fieldData;
        }
        return null;
    }

    public int hashCode() {
        if (this.mGarbage) {
            this.gc();
        }
        int n10 = 17;
        for (int i14 = 0; i14 < this.mSize; ++i14) {
            n10 = (n10 * 31 + this.mFieldNumbers[i14]) * 31 + this.mData[i14].hashCode();
        }
        return n10;
    }

    public boolean isEmpty() {
        boolean bl2 = this.size() == 0;
        return bl2;
    }

    void put(int n10, FieldData fieldData) {
        int n13 = this.binarySearch(n10);
        if (n13 >= 0) {
            this.mData[n13] = fieldData;
        } else {
            Object[] objectArray;
            int n14 = ~n13;
            int n15 = this.mSize;
            if (n14 < n15 && (objectArray = this.mData)[n14] == DELETED) {
                this.mFieldNumbers[n14] = n10;
                objectArray[n14] = fieldData;
                return;
            }
            n13 = n14;
            if (this.mGarbage) {
                n13 = n14;
                if (n15 >= this.mFieldNumbers.length) {
                    this.gc();
                    n13 = ~this.binarySearch(n10);
                }
            }
            if ((n14 = this.mSize) >= this.mFieldNumbers.length) {
                n14 = this.idealIntArraySize(n14 + 1);
                objectArray = new int[n14];
                FieldData[] fieldDataArray = new FieldData[n14];
                Object[] objectArray2 = this.mFieldNumbers;
                System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
                objectArray2 = this.mData;
                System.arraycopy(objectArray2, 0, fieldDataArray, 0, objectArray2.length);
                this.mFieldNumbers = (int[])objectArray;
                this.mData = fieldDataArray;
            }
            if ((n14 = this.mSize - n13) != 0) {
                objectArray = this.mFieldNumbers;
                n15 = n13 + 1;
                System.arraycopy(objectArray, n13, objectArray, n15, n14);
                objectArray = this.mData;
                System.arraycopy(objectArray, n13, objectArray, n15, this.mSize - n13);
            }
            this.mFieldNumbers[n13] = n10;
            this.mData[n13] = fieldData;
            ++this.mSize;
        }
    }

    void remove(int n10) {
        FieldData fieldData;
        FieldData[] fieldDataArray;
        FieldData fieldData2;
        if ((n10 = this.binarySearch(n10)) >= 0 && (fieldData2 = (fieldDataArray = this.mData)[n10]) != (fieldData = DELETED)) {
            fieldDataArray[n10] = fieldData;
            this.mGarbage = true;
        }
    }

    int size() {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mSize;
    }
}

