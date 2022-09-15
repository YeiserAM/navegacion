package com.example.navegacion.ui.nube;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NubeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NubeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Nube fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}