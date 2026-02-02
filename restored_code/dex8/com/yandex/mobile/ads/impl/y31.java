/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.w32
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i;
import com.yandex.mobile.ads.impl.w32;
import com.yandex.mobile.ads.impl.wj1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class y31<K, V>
extends i<K, V> {
    private static final long serialVersionUID = 0L;
    transient w32<? extends List<V>> g;

    y31(Map<K, Collection<V>> map2, w32<? extends List<V>> w322) {
        super(map2);
        this.g = (w32)wj1.a(w322);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.g = (w32)objectInputStream.readObject();
        this.a((Map)objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.c());
    }
}

