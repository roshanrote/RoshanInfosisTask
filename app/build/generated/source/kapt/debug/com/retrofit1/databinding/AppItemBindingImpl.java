package com.retrofit1.databinding;
import com.retrofit1.R;
import com.retrofit1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AppItemBindingImpl extends AppItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AppItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AppItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.appName.setTag(null);
        this.description.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.Datum == variableId) {
            setDatum((com.retrofit1.Datum) variable);
        }
        else if (BR.recyclerModel == variableId) {
            setRecyclerModel((com.retrofit1.RecyclerModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDatum(@Nullable com.retrofit1.Datum Datum) {
        this.mDatum = Datum;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.Datum);
        super.requestRebind();
    }
    public void setRecyclerModel(@Nullable com.retrofit1.RecyclerModel RecyclerModel) {
        this.mRecyclerModel = RecyclerModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String datumImageHref = null;
        com.retrofit1.Datum datum = mDatum;
        java.lang.String datumTitle = null;
        boolean datumDescriptionJavaLangObjectNull = false;
        boolean datumTitleJavaLangObjectNull = false;
        java.lang.String datumDescription = null;
        java.lang.String datumTitleJavaLangObjectNullJavaLangStringLoremIpsumDatumTitle = null;
        java.lang.String datumDescriptionJavaLangObjectNullJavaLangStringLoremIpsumIsSimplyDummyTextOfThePrintingAndTypesettingIndustryLoremIpsumHasBeenTheIndustrysStandardDummyTextEverSinceThe1500sDatumDescription = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (datum != null) {
                    // read Datum.imageHref
                    datumImageHref = datum.getImageHref();
                    // read Datum.title
                    datumTitle = datum.getTitle();
                    // read Datum.description
                    datumDescription = datum.getDescription();
                }


                // read Datum.title == null
                datumTitleJavaLangObjectNull = (datumTitle) == (null);
                // read Datum.description == null
                datumDescriptionJavaLangObjectNull = (datumDescription) == (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(datumTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(datumDescriptionJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x5L) != 0) {

                // read Datum.title == null ? "Lorem Ipsum" : Datum.title
                datumTitleJavaLangObjectNullJavaLangStringLoremIpsumDatumTitle = ((datumTitleJavaLangObjectNull) ? ("Lorem Ipsum") : (datumTitle));
                // read Datum.description == null ? "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s" : Datum.description
                datumDescriptionJavaLangObjectNullJavaLangStringLoremIpsumIsSimplyDummyTextOfThePrintingAndTypesettingIndustryLoremIpsumHasBeenTheIndustrysStandardDummyTextEverSinceThe1500sDatumDescription = ((datumDescriptionJavaLangObjectNull) ? ("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s") : (datumDescription));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.appName, datumTitleJavaLangObjectNullJavaLangStringLoremIpsumDatumTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, datumDescriptionJavaLangObjectNullJavaLangStringLoremIpsumIsSimplyDummyTextOfThePrintingAndTypesettingIndustryLoremIpsumHasBeenTheIndustrysStandardDummyTextEverSinceThe1500sDatumDescription);
            com.retrofit1.adapters.ImageUrlBindingAdapter.setImageUrl(this.mboundView3, datumImageHref);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): Datum
        flag 1 (0x2L): recyclerModel
        flag 2 (0x3L): null
        flag 3 (0x4L): Datum.title == null ? "Lorem Ipsum" : Datum.title
        flag 4 (0x5L): Datum.title == null ? "Lorem Ipsum" : Datum.title
        flag 5 (0x6L): Datum.description == null ? "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s" : Datum.description
        flag 6 (0x7L): Datum.description == null ? "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s" : Datum.description
    flag mapping end*/
    //end
}