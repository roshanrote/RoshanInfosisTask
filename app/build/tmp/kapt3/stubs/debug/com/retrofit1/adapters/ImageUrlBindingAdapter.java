package com.retrofit1.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/retrofit1/adapters/ImageUrlBindingAdapter;", "", "()V", "setImageUrl", "", "view", "Landroid/widget/ImageView;", "url", "", "app_debug"})
public final class ImageUrlBindingAdapter {
    public static final com.retrofit1.adapters.ImageUrlBindingAdapter INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"android:img"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private ImageUrlBindingAdapter() {
        super();
    }
}