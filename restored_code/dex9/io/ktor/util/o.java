/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package io.ktor.util;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.e;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\u0006\u0010\u001b\u001a\u00028\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00028\u00008\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001e"}, d2={"Lio/ktor/util/o;", "Key", "Value", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "d", "getValue", "a", "(Ljava/lang/Object;)V", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "ktor-utils"}, k=1, mv={1, 8, 0})
final class o<Key, Value>
implements Map.Entry<Key, Value>,
e.a {
    private final Key c;
    private Value d;

    public o(Key Key2, Value Value) {
        this.c = Key2;
        this.d = Value;
    }

    public void a(Value Value) {
        this.d = Value;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        boolean bl;
        boolean bl2 = bl = false;
        if (object != null) {
            if (!(object instanceof Map.Entry)) {
                bl2 = bl;
            } else {
                object = (Map.Entry)object;
                bl2 = bl;
                if (y.e(object.getKey(), this.getKey())) {
                    bl2 = bl;
                    if (y.e(object.getValue(), this.getValue())) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    @Override
    public Key getKey() {
        return this.c;
    }

    @Override
    public Value getValue() {
        return this.d;
    }

    @Override
    public int hashCode() {
        Object object = this.getKey();
        y.g(object);
        int n4 = object.hashCode();
        object = this.getValue();
        y.g(object);
        return n4 + 527 + object.hashCode();
    }

    @Override
    public Value setValue(Value Value) {
        this.a(Value);
        return this.getValue();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getKey());
        stringBuilder.append('=');
        stringBuilder.append(this.getValue());
        return stringBuilder.toString();
    }
}

