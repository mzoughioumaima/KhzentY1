package com.dsi32g14.khzenty.ui.categorie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CategorieViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CategorieViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
