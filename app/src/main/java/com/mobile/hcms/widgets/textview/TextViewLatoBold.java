package com.mobile.hcms.widgets.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Rio Swarawan on 11/16/2015.
 */
public class TextViewLatoBold extends TextView {

    public TextViewLatoBold(Context context) {
        super(context);
        setFont(context);
    }

    public TextViewLatoBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context);
    }

    private void setFont(Context context) {
        Typeface type = Typeface.createFromAsset(context.getAssets(), "fonts/HelveticaNeueLTPro-Lt.otf");
        setTypeface(type);
    }
}
