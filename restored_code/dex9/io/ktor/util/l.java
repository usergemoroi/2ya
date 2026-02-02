/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.util.a
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.util;

import io.ktor.util.a;
import io.ktor.util.c;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J5\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tR,\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0014X\u0094\u0004\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2={"Lio/ktor/util/l;", "Lio/ktor/util/c;", "", "T", "Lio/ktor/util/a;", "key", "Lkotlin/Function0;", "block", "f", "(Lio/ktor/util/a;Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "h", "()Ljava/util/concurrent/ConcurrentHashMap;", "map", "<init>", "()V", "ktor-utils"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAttributesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributesJvm.kt\nio/ktor/util/ConcurrentSafeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
final class l
extends c {
    @NotNull
    private final ConcurrentHashMap<a<?>, Object> a = new ConcurrentHashMap();

    @NotNull
    public <T> T f(@NotNull a<T> object, @NotNull kotlin.jvm.functions.a<? extends T> a4) {
        y.j(object, (String)"key");
        y.j(a4, (String)"block");
        Object object2 = this.h().get(object);
        if (object2 != null) {
            return (T)object2;
        }
        a4 = a4.invoke();
        object = this.h().putIfAbsent((a<?>)object, a4);
        if (object == null) {
            object = a4;
        }
        y.h(object, (String)"null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return (T)object;
    }

    @NotNull
    protected ConcurrentHashMap<a<?>, Object> h() {
        return this.a;
    }
}

