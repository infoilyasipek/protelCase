package com.example.protelcase.databinding;
import com.example.protelcase.R;
import com.example.protelcase.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemNewsBindingImpl extends ItemNewsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relativeLayout, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.imageViewCover.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewDate.setTag(null);
        this.textViewDescription.setTag(null);
        this.textViewSource.setTag(null);
        this.textViewTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.news == variableId) {
            setNews((com.example.domain.models.News) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNews(@Nullable com.example.domain.models.News News) {
        this.mNews = News;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.news);
        super.requestRebind();
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
        java.lang.String newsDescription = null;
        com.example.domain.models.News news = mNews;
        java.lang.String newsPublishedAt = null;
        java.lang.String newsTitle = null;
        java.lang.String newsSourceName = null;
        com.example.domain.models.News.Source newsSource = null;
        java.lang.String newsUrlToImage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (news != null) {
                    // read news.description
                    newsDescription = news.getDescription();
                    // read news.publishedAt
                    newsPublishedAt = news.getPublishedAt();
                    // read news.title
                    newsTitle = news.getTitle();
                    // read news.source
                    newsSource = news.getSource();
                    // read news.urlToImage
                    newsUrlToImage = news.getUrlToImage();
                }


                if (newsSource != null) {
                    // read news.source.name
                    newsSourceName = newsSource.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.protelcase.util.extensions.DataBindingExtensionsKt.imageUrl(this.imageViewCover, newsUrlToImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewDate, newsPublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewDescription, newsDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewSource, newsSourceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTitle, newsTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): news
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}