package com.example.protelcase.databinding;
import com.example.protelcase.R;
import com.example.protelcase.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.relativeLayout2, 10);
        sViewsWithIds.put(R.id.textView, 11);
        sViewsWithIds.put(R.id.relativeLayout, 12);
        sViewsWithIds.put(R.id.imageViewDate, 13);
        sViewsWithIds.put(R.id.divider, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.view.View mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.view.View) bindings[14]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.buttonViewMore.setTag(null);
        this.imageViewBack.setTag(null);
        this.imageViewCover.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (android.view.View) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.textViewSource.setTag(null);
        this.textViewTitle.setTag(null);
        this.tvDate.setTag(null);
        this.tvDescription.setTag(null);
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
        if (BR.news == variableId) {
            setNews((com.example.domain.models.News) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((android.view.View.OnClickListener) variable);
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
    public void setHandler(@Nullable android.view.View.OnClickListener Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
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
        android.view.View.OnClickListener handlerOnClickAndroidViewViewOnClickListener = null;
        java.lang.String newsSourceName = null;
        java.lang.String javaLangStringAuthorNewsAuthor = null;
        boolean newsAuthorJavaLangObjectNull = false;
        android.view.View.OnClickListener handler = mHandler;
        java.lang.String newsAuthorJavaLangObjectNullJavaLangStringAuthorNewsAuthorJavaLangString = null;
        java.lang.String newsPublishedAt = null;
        java.lang.String newsAuthor = null;
        java.lang.String newsTitle = null;
        com.example.domain.models.News.Source newsSource = null;
        java.lang.String newsUrlToImage = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (news != null) {
                    // read news.description
                    newsDescription = news.getDescription();
                    // read news.publishedAt
                    newsPublishedAt = news.getPublishedAt();
                    // read news.author
                    newsAuthor = news.getAuthor();
                    // read news.title
                    newsTitle = news.getTitle();
                    // read news.source
                    newsSource = news.getSource();
                    // read news.urlToImage
                    newsUrlToImage = news.getUrlToImage();
                }


                // read news.author != null
                newsAuthorJavaLangObjectNull = (newsAuthor) != (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(newsAuthorJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (newsSource != null) {
                    // read news.source.name
                    newsSourceName = newsSource.getName();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (handler != null) {
                    // read handler::onClick
                    handlerOnClickAndroidViewViewOnClickListener = (((mHandlerOnClickAndroidViewViewOnClickListener == null) ? (mHandlerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnClickAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                // read ("Author: ") + (news.author)
                javaLangStringAuthorNewsAuthor = ("Author: ") + (newsAuthor);
        }

        if ((dirtyFlags & 0x5L) != 0) {

                // read news.author != null ? ("Author: ") + (news.author) : ""
                newsAuthorJavaLangObjectNullJavaLangStringAuthorNewsAuthorJavaLangString = ((newsAuthorJavaLangObjectNull) ? (javaLangStringAuthorNewsAuthor) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.buttonViewMore.setOnClickListener(handlerOnClickAndroidViewViewOnClickListener);
            this.imageViewBack.setOnClickListener(handlerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.protelcase.util.extensions.DataBindingExtensionsKt.imageUrl(this.imageViewCover, newsUrlToImage);
            com.example.protelcase.util.extensions.DataBindingExtensionsKt.isVisible(this.mboundView7, newsAuthorJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, newsAuthorJavaLangObjectNullJavaLangStringAuthorNewsAuthorJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewSource, newsSourceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTitle, newsTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, newsPublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, newsDescription);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private android.view.View.OnClickListener value;
        public OnClickListenerImpl setValue(android.view.View.OnClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): news
        flag 1 (0x2L): handler
        flag 2 (0x3L): null
        flag 3 (0x4L): news.author != null ? ("Author: ") + (news.author) : ""
        flag 4 (0x5L): news.author != null ? ("Author: ") + (news.author) : ""
    flag mapping end*/
    //end
}