/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.div.core.DivActionHandler
 *  com.yandex.div.core.DivViewFacade
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.ap
 *  com.yandex.div2.j1
 *  com.yandex.mobile.ads.impl.eo
 *  com.yandex.mobile.ads.impl.fo
 */
package com.yandex.mobile.ads.impl;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ap;
import com.yandex.div2.j1;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.fo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cy1
extends DivActionHandler {
    @NotNull
    private final fo a;
    @Nullable
    private c20 b;

    public cy1() {
        this(0);
    }

    public /* synthetic */ cy1(int n10) {
        this(new fo());
    }

    public cy1(@NotNull fo fo3) {
        this.a = fo3;
    }

    @NotNull
    public final eo a(int n10) {
        eo eo3;
        eo eo4 = eo3 = (eo)this.a.a().get(n10);
        if (eo3 == null) {
            eo4 = new eo();
            this.a.a(n10, eo4);
        }
        return eo4;
    }

    public final void a(@Nullable c20 c202) {
        c20 c203 = this.b;
        if (c203 != null) {
            c203.a(null);
        }
        if (c202 != null) {
            c202.a(this.a);
        }
        this.b = c202;
    }

    public final boolean handleAction(@NotNull ap ap2, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        c20 c202;
        boolean bl2 = super.handleAction(ap2, divViewFacade, expressionResolver) || (c202 = this.b) != null && c202.handleAction(ap2, divViewFacade, expressionResolver);
        return bl2;
    }

    public final boolean handleAction(@NotNull j1 j12, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        c20 c202;
        boolean bl2 = super.handleAction(j12, divViewFacade, expressionResolver) || (c202 = this.b) != null && c202.handleAction(j12, divViewFacade, expressionResolver);
        return bl2;
    }
}

