package com.newcheckstop.inspectaplication.ui.inspectmap;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MapViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public MapViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This iqqqqqqqqs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}