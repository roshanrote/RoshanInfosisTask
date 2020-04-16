package com.retrofit1;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J \u0010\u001d\u001a\u00020\u00172\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0003J\b\u0010\u001e\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/retrofit1/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/retrofit1/adapters/CategoryAdapter$OnCategoryClickListener;", "()V", "appStoreHomeViewModel", "Lcom/retrofit1/MainViewModel;", "binding", "Lcom/retrofit1/databinding/ActivityMainBinding;", "getBinding", "()Lcom/retrofit1/databinding/ActivityMainBinding;", "setBinding", "(Lcom/retrofit1/databinding/ActivityMainBinding;)V", "categoryAdapter", "Lcom/retrofit1/adapters/CategoryAdapter;", "dataList", "Ljava/util/ArrayList;", "Lcom/retrofit1/Datum;", "Lkotlin/collections/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "onCategoryClick", "", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setRecyclerView", "subscribeDataCallBack", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.retrofit1.adapters.CategoryAdapter.OnCategoryClickListener {
    private com.retrofit1.MainViewModel appStoreHomeViewModel;
    @org.jetbrains.annotations.NotNull()
    public com.retrofit1.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.retrofit1.Datum> dataList;
    private com.retrofit1.adapters.CategoryAdapter categoryAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCategoryClick(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.retrofit1.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.retrofit1.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.retrofit1.Datum> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.retrofit1.Datum> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeDataCallBack() {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    private final void setRecyclerView(java.util.ArrayList<com.retrofit1.Datum> dataList) {
    }
    
    public MainActivity() {
        super();
    }
}