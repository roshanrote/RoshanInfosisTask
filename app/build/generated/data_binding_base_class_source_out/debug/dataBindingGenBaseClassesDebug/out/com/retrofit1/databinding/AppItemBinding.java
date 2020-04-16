package com.retrofit1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.retrofit1.Datum;
import com.retrofit1.RecyclerModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AppItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView appName;

  @NonNull
  public final TextView description;

  @Bindable
  protected Datum mDatum;

  @Bindable
  protected RecyclerModel mRecyclerModel;

  protected AppItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView appName, TextView description) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appName = appName;
    this.description = description;
  }

  public abstract void setDatum(@Nullable Datum Datum);

  @Nullable
  public Datum getDatum() {
    return mDatum;
  }

  public abstract void setRecyclerModel(@Nullable RecyclerModel recyclerModel);

  @Nullable
  public RecyclerModel getRecyclerModel() {
    return mRecyclerModel;
  }

  @NonNull
  public static AppItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AppItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AppItemBinding>inflateInternal(inflater, com.retrofit1.R.layout.app_item, root, attachToRoot, component);
  }

  @NonNull
  public static AppItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.app_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AppItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AppItemBinding>inflateInternal(inflater, com.retrofit1.R.layout.app_item, null, false, component);
  }

  public static AppItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static AppItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (AppItemBinding)bind(component, view, com.retrofit1.R.layout.app_item);
  }
}
