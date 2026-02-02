/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.Spanned
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.core.content.ContextCompat
 */
package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.interfaces.CodeBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

class Code
implements CodeBlock {
    Code() {
    }

    private TextView getCodeBlockView(Spanned spanned, Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(ContextCompat.getColor((Context)context, (int)R.color.intercom_white));
        textView.setTextSize(14.0f);
        textView.setText((CharSequence)spanned);
        textView.setPadding(ScreenUtils.dpToPx(14.0f, context), ScreenUtils.dpToPx(12.0f, context), ScreenUtils.dpToPx(14.0f, context), ScreenUtils.dpToPx(14.0f, context));
        textView.setBackgroundResource(R.color.intercom_slate_grey_two);
        textView.setTypeface(Typeface.MONOSPACE);
        BlockUtils.createLayoutParams((View)textView, -2, -2);
        BlockUtils.setDefaultMarginBottom((View)textView);
        return textView;
    }

    @Override
    public View addCode(Spanned spanned, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        spanned = this.getCodeBlockView(spanned, viewGroup.getContext());
        BlockUtils.setLayoutMarginsAndGravity((View)spanned, 0x800003, blockMetadata.isLastObject());
        return spanned;
    }
}

