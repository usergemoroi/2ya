/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
 */
package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebMessageBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    public String getData();

    public InvocationHandler getMessagePayload();

    public InvocationHandler[] getPorts();
}

