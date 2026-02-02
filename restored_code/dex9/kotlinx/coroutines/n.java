/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.SubclassOptInRequired
 *  kotlin.coroutines.d
 *  kotlin.coroutines.g
 *  kotlin.e
 *  kotlin.k0
 *  kotlinx.coroutines.ExperimentalCoroutinesApi
 *  kotlinx.coroutines.InternalCoroutinesApi
 *  kotlinx.coroutines.InternalForInheritanceCoroutinesApi
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SubclassOptInRequired;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.e;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.k0;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.InternalForInheritanceCoroutinesApi;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J|\u0010\u0010\u001a\u0004\u0018\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052M\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H'\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\bH'\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H'\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001e\u001a\u00020\u000e2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u001bj\u0002`\u001cH&\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000e*\u00020 2\u0006\u0010\u0004\u001a\u00028\u0000H'\u00a2\u0006\u0004\b!\u0010\"J<\u0010#\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u00002#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001bH'\u00a2\u0006\u0004\b#\u0010$Jp\u0010%\u001a\u00020\u000e\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012M\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H&\u00a2\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010(\u00a8\u0006+"}, d2={"Lkotlinx/coroutines/n;", "T", "Lkotlin/coroutines/d;", "R", "value", "", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/g;", "context", "Lkotlin/k0;", "onCancellation", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/q;)Ljava/lang/Object;", "exception", "x", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "t", "(Ljava/lang/Object;)V", "", "b", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "u", "(Lkotlin/jvm/functions/l;)V", "Lkotlinx/coroutines/m0;", "E", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;)V", "i", "(Ljava/lang/Object;Lkotlin/jvm/functions/l;)V", "p", "(Ljava/lang/Object;Lkotlin/jvm/functions/q;)V", "isActive", "()Z", "h", "isCompleted", "kotlinx-coroutines-core"}, k=1, mv={2, 0, 0})
@SubclassOptInRequired(markerClass=InternalForInheritanceCoroutinesApi.class)
public interface n<T>
extends d<T> {
    @ExperimentalCoroutinesApi
    public void E(@NotNull m0 var1, T var2);

    @InternalCoroutinesApi
    @Nullable
    public <R extends T> Object G(R var1, @Nullable Object var2, @Nullable q<? super Throwable, ? super R, ? super g, k0> var3);

    public boolean b(@Nullable Throwable var1);

    public boolean h();

    @Deprecated(level=e.c, message="Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith=@ReplaceWith(expression="resume(value) { cause, _, _ -> onCancellation(cause) }", imports={}))
    public void i(T var1, @Nullable l<? super Throwable, k0> var2);

    public boolean isActive();

    public <R extends T> void p(R var1, @Nullable q<? super Throwable, ? super R, ? super g, k0> var2);

    @InternalCoroutinesApi
    public void t(@NotNull Object var1);

    public void u(@NotNull l<? super Throwable, k0> var1);

    @InternalCoroutinesApi
    @Nullable
    public Object x(@NotNull Throwable var1);
}

