/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextSplittingStrategy {
    private static final String NEW_LINE = "\n";
    private static final String NEW_LINE_REPLACEMENT = "<br>";
    private static final String NEW_PARAGRAPH_DELIMETER = "\n\n";

    public List<String> apply(String object) {
        object = ((String)object).split(NEW_PARAGRAPH_DELIMETER);
        for (int i14 = 0; i14 < ((String[])object).length; ++i14) {
            object[i14] = object[i14].replace(NEW_LINE, NEW_LINE_REPLACEMENT);
        }
        object = new ArrayList<String>(Arrays.asList(object));
        object.removeAll(Collections.singleton(""));
        return object;
    }
}

