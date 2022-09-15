package com.example.navegacion.ui.carta;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartaViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mText;

    public CartaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este fragmento es de Carta");
    }

    public LiveData<String> getText() {return mText;}
}