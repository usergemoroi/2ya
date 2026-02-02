/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.ktor.utils.io.j
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package io.ktor.utils.io;

import io.ktor.utils.io.j;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.coroutines.d2;
import org.jetbrains.annotations.NotNull;

@Deprecated(message="\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ")
@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0006"}, d2={"Lio/ktor/utils/io/t;", "Lkotlinx/coroutines/d2;", "Lio/ktor/utils/io/j;", "getChannel", "()Lio/ktor/utils/io/j;", "channel", "ktor-io"}, k=1, mv={1, 8, 0})
public interface t
extends d2 {
    @NotNull
    public j getChannel();
}

