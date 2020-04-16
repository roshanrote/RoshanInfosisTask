package com.retrofit1.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/retrofit1/adapters/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/retrofit1/adapters/CategoryAdapter$OnCategoryClickListener;", "(Lcom/retrofit1/adapters/CategoryAdapter$OnCategoryClickListener;)V", "mCategoryList", "Ljava/util/ArrayList;", "Lcom/retrofit1/Datum;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAppList", "categoryModel", "OnCategoryClickListener", "RecyclerHolderCatIcon", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.ArrayList<com.retrofit1.Datum> mCategoryList = null;
    private com.retrofit1.adapters.CategoryAdapter.OnCategoryClickListener listener;
    
    public final void setAppList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.retrofit1.Datum> categoryModel) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.retrofit1.adapters.CategoryAdapter.OnCategoryClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/retrofit1/adapters/CategoryAdapter$OnCategoryClickListener;", "", "onCategoryClick", "", "position", "", "app_debug"})
    public static abstract interface OnCategoryClickListener {
        
        public abstract void onCategoryClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/retrofit1/adapters/CategoryAdapter$RecyclerHolderCatIcon;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "applicationBinding", "Lcom/retrofit1/databinding/AppItemBinding;", "(Lcom/retrofit1/adapters/CategoryAdapter;Lcom/retrofit1/databinding/AppItemBinding;)V", "bind", "", "appInfo", "Lcom/retrofit1/Datum;", "listener", "Lcom/retrofit1/adapters/CategoryAdapter$OnCategoryClickListener;", "app_debug"})
    public final class RecyclerHolderCatIcon extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.retrofit1.databinding.AppItemBinding applicationBinding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.retrofit1.Datum appInfo, @org.jetbrains.annotations.Nullable()
        com.retrofit1.adapters.CategoryAdapter.OnCategoryClickListener listener) {
        }
        
        public RecyclerHolderCatIcon(@org.jetbrains.annotations.NotNull()
        com.retrofit1.databinding.AppItemBinding applicationBinding) {
            super(null);
        }
    }
}