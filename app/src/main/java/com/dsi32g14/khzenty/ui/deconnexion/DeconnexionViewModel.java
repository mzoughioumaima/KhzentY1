package com.dsi32g14.khzenty.ui.deconnexion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DeconnexionViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DeconnexionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

